package com.googlecode.mp4parser.authoring.samples;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox.Entry;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FragmentedMp4SampleList extends AbstractList<Sample> {
    private List<TrackFragmentBox> allTrafs;
    private int[] firstSamples;
    IsoFile[] fragments;
    private SoftReference<Sample>[] sampleCache;
    private int size_ = -1;
    Container topLevel;
    TrackBox trackBox = null;
    TrackExtendsBox trex = null;
    private Map<TrackRunBox, SoftReference<ByteBuffer>> trunDataCache = new HashMap();

    public FragmentedMp4SampleList(long j, Container container, IsoFile... isoFileArr) {
        this.topLevel = container;
        this.fragments = isoFileArr;
        for (TrackBox trackBox : Path.getPaths(container, "moov[0]/trak")) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.trackBox = trackBox;
            }
        }
        if (this.trackBox == null) {
            StringBuilder stringBuilder = new StringBuilder("This MP4 does not contain track ");
            stringBuilder.append(j);
            throw new RuntimeException(stringBuilder.toString());
        }
        for (TrackExtendsBox trackExtendsBox : Path.getPaths(container, "moov[0]/mvex[0]/trex")) {
            if (trackExtendsBox.getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                this.trex = trackExtendsBox;
            }
        }
        this.sampleCache = (SoftReference[]) Array.newInstance(SoftReference.class, size());
        initAllFragments();
    }

    private int getTrafSize(TrackFragmentBox trackFragmentBox) {
        List boxes = trackFragmentBox.getBoxes();
        int i = 0;
        int i2 = 0;
        while (i < boxes.size()) {
            Box box = (Box) boxes.get(i);
            if (box instanceof TrackRunBox) {
                i2 += CastUtils.l2i(((TrackRunBox) box).getSampleCount());
            }
            i++;
        }
        return i2;
    }

    private List<TrackFragmentBox> initAllFragments() {
        if (this.allTrafs != null) {
            return this.allTrafs;
        }
        List<TrackFragmentBox> arrayList = new ArrayList();
        for (MovieFragmentBox boxes : this.topLevel.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : boxes.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                    arrayList.add(trackFragmentBox);
                }
            }
        }
        int i = 0;
        if (this.fragments != null) {
            for (IsoFile boxes2 : this.fragments) {
                for (MovieFragmentBox boxes3 : boxes2.getBoxes(MovieFragmentBox.class)) {
                    for (TrackFragmentBox trackFragmentBox2 : boxes3.getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox2);
                        }
                    }
                }
            }
        }
        this.allTrafs = arrayList;
        this.firstSamples = new int[this.allTrafs.size()];
        int i2 = 1;
        while (i < this.allTrafs.size()) {
            this.firstSamples[i] = i2;
            i2 += getTrafSize((TrackFragmentBox) this.allTrafs.get(i));
            i++;
        }
        return arrayList;
    }

    public Sample get(int i) {
        Sample sample;
        if (this.sampleCache[i] != null) {
            sample = (Sample) r7.sampleCache[i].get();
            if (sample != null) {
                return sample;
            }
        }
        int i2 = i + 1;
        int length = r7.firstSamples.length - 1;
        while (i2 - r7.firstSamples[length] < 0) {
            length--;
        }
        TrackFragmentBox trackFragmentBox = (TrackFragmentBox) r7.allTrafs.get(length);
        int i3 = i2 - r7.firstSamples[length];
        Container container = (MovieFragmentBox) trackFragmentBox.getParent();
        i2 = 0;
        for (Box box : trackFragmentBox.getBoxes()) {
            if (box instanceof TrackRunBox) {
                Object obj = (TrackRunBox) box;
                int i4 = i3 - i2;
                if (obj.getEntries().size() < i4) {
                    i2 += obj.getEntries().size();
                } else {
                    long j;
                    long defaultSampleSize;
                    List list;
                    ByteBuffer byteBuffer;
                    List entries = obj.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = obj.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j2 = 0;
                    if (isSampleSizePresent) {
                        j = 0;
                    } else {
                        if (hasDefaultSampleSize) {
                            defaultSampleSize = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else if (r7.trex == null) {
                            throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                        } else {
                            defaultSampleSize = r7.trex.getDefaultSampleSize();
                        }
                        j = defaultSampleSize;
                    }
                    SoftReference softReference = (SoftReference) r7.trunDataCache.get(obj);
                    ByteBuffer byteBuffer2 = softReference != null ? (ByteBuffer) softReference.get() : null;
                    if (byteBuffer2 == null) {
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            long baseDataOffset = 0 + trackFragmentHeaderBox.getBaseDataOffset();
                            container = container.getParent();
                            j2 = baseDataOffset;
                        }
                        if (obj.isDataOffsetPresent()) {
                            j2 += (long) obj.getDataOffset();
                        }
                        Iterator it = entries.iterator();
                        int i5 = 0;
                        while (it.hasNext()) {
                            Iterator it2;
                            Object obj2;
                            Entry entry = (Entry) it.next();
                            if (isSampleSizePresent) {
                                it2 = it;
                                obj2 = obj;
                                i5 = (int) (((long) i5) + entry.getSampleSize());
                                entries = entries;
                            } else {
                                it2 = it;
                                obj2 = obj;
                                list = entries;
                                i5 = (int) (((long) i5) + j);
                            }
                            it = it2;
                            obj = obj2;
                        }
                        try {
                            ByteBuffer byteBuffer3 = container.getByteBuffer(j2, (long) i5);
                            r7.trunDataCache.put(obj, new SoftReference(byteBuffer3));
                            byteBuffer = byteBuffer3;
                            list = entries;
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }
                    list = entries;
                    byteBuffer = byteBuffer2;
                    i2 = 0;
                    int i6 = 0;
                    while (i2 < i4) {
                        List list2 = list;
                        i6 = isSampleSizePresent ? (int) (((long) i6) + ((Entry) list2.get(i2)).getSampleSize()) : (int) (((long) i6) + j);
                        i2++;
                        list = list2;
                    }
                    defaultSampleSize = isSampleSizePresent ? ((Entry) list.get(i4)).getSampleSize() : j;
                    final ByteBuffer byteBuffer4 = byteBuffer;
                    sample = new Sample() {
                        public ByteBuffer asByteBuffer() {
                            return (ByteBuffer) ((ByteBuffer) byteBuffer4.position(i6)).slice().limit(CastUtils.l2i(defaultSampleSize));
                        }

                        public long getSize() {
                            return defaultSampleSize;
                        }

                        public void writeTo(WritableByteChannel writableByteChannel) {
                            writableByteChannel.write(asByteBuffer());
                        }
                    };
                    r7.sampleCache[i] = new SoftReference(sample);
                    return sample;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    public int size() {
        if (this.size_ != -1) {
            return this.size_;
        }
        int i = 0;
        for (MovieFragmentBox boxes : this.topLevel.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : boxes.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                    i = (int) (((long) i) + ((TrackRunBox) trackFragmentBox.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                }
            }
        }
        for (IsoFile boxes2 : this.fragments) {
            for (MovieFragmentBox boxes3 : boxes2.getBoxes(MovieFragmentBox.class)) {
                for (TrackFragmentBox trackFragmentBox2 : boxes3.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.trackBox.getTrackHeaderBox().getTrackId()) {
                        i = (int) (((long) i) + ((TrackRunBox) trackFragmentBox2.getBoxes(TrackRunBox.class).get(0)).getSampleCount());
                    }
                }
            }
        }
        this.size_ = i;
        return i;
    }
}
