package mobi.mmdt.ott.logic.videocompressor.video;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SampleToChunkBox.Entry;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.util.Matrix;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

@TargetApi(16)
public class MP4Builder {
    private Mp4Movie currentMp4Movie = null;
    private long dataOffset = 0;
    private FileChannel fc = null;
    private FileOutputStream fos = null;
    private InterleaveChunkMdat mdat = null;
    private ByteBuffer sizeBuffer = null;
    private HashMap<Track, long[]> track2SampleSizes = new HashMap();
    private boolean writeNewMdat = true;
    private long writedSinceLastMdat = 0;

    private class InterleaveChunkMdat implements Box {
        private long contentSize;
        private long dataOffset;
        private Container parent;

        private InterleaveChunkMdat() {
            this.contentSize = IjkMediaMeta.AV_CH_STEREO_RIGHT;
            this.dataOffset = 0;
        }

        private boolean isSmallBox(long j) {
            return j + 8 < IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }

        public void getBox(WritableByteChannel writableByteChannel) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            long size = getSize();
            if (isSmallBox(size)) {
                IsoTypeWriter.writeUInt32(allocate, size);
            } else {
                IsoTypeWriter.writeUInt32(allocate, 1);
            }
            allocate.put(IsoFile.fourCCtoBytes(MediaDataBox.TYPE));
            if (isSmallBox(size)) {
                allocate.put(new byte[8]);
            } else {
                IsoTypeWriter.writeUInt64(allocate, size);
            }
            allocate.rewind();
            writableByteChannel.write(allocate);
        }

        public long getContentSize() {
            return this.contentSize;
        }

        public long getOffset() {
            return this.dataOffset;
        }

        public Container getParent() {
            return this.parent;
        }

        public long getSize() {
            return 16 + this.contentSize;
        }

        public String getType() {
            return MediaDataBox.TYPE;
        }

        public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
        }

        public void setContentSize(long j) {
            this.contentSize = j;
        }

        public void setDataOffset(long j) {
            this.dataOffset = j;
        }

        public void setParent(Container container) {
            this.parent = container;
        }
    }

    private void flushCurrentMdat() {
        long position = this.fc.position();
        this.fc.position(this.mdat.getOffset());
        this.mdat.getBox(this.fc);
        this.fc.position(position);
        this.mdat.setDataOffset(0);
        this.mdat.setContentSize(0);
        this.fos.flush();
    }

    public static long gcd(long j, long j2) {
        while (true) {
            long j3 = j;
            j = j2;
            j2 = j3;
            if (j == 0) {
                return j2;
            }
            j2 %= j;
        }
    }

    public int addTrack(MediaFormat mediaFormat, boolean z) {
        return this.currentMp4Movie.addTrack(mediaFormat, z);
    }

    protected FileTypeBox createFileTypeBox() {
        List linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("3gp4");
        return new FileTypeBox("isom", 0, linkedList);
    }

    public MP4Builder createMovie(Mp4Movie mp4Movie) {
        this.currentMp4Movie = mp4Movie;
        this.fos = new FileOutputStream(mp4Movie.getCacheFile());
        this.fc = this.fos.getChannel();
        FileTypeBox createFileTypeBox = createFileTypeBox();
        createFileTypeBox.getBox(this.fc);
        this.dataOffset += createFileTypeBox.getSize();
        this.writedSinceLastMdat += this.dataOffset;
        this.mdat = new InterleaveChunkMdat();
        this.sizeBuffer = ByteBuffer.allocateDirect(4);
        return this;
    }

    protected MovieBox createMovieBox(Mp4Movie mp4Movie) {
        MovieBox movieBox = new MovieBox();
        Box movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(Matrix.ROTATE_0);
        long timescale = getTimescale(mp4Movie);
        Iterator it = mp4Movie.getTracks().iterator();
        long j = 0;
        while (it.hasNext()) {
            Track track = (Track) it.next();
            long duration = (track.getDuration() * timescale) / ((long) track.getTimeScale());
            if (duration > j) {
                j = duration;
            }
        }
        movieHeaderBox.setDuration(j);
        movieHeaderBox.setTimescale(timescale);
        movieHeaderBox.setNextTrackId((long) (mp4Movie.getTracks().size() + 1));
        movieBox.addBox(movieHeaderBox);
        Iterator it2 = mp4Movie.getTracks().iterator();
        while (it2.hasNext()) {
            movieBox.addBox(createTrackBox((Track) it2.next(), mp4Movie));
        }
        return movieBox;
    }

    protected Box createStbl(Track track) {
        Box sampleTableBox = new SampleTableBox();
        createStsd(track, sampleTableBox);
        createStts(track, sampleTableBox);
        createStss(track, sampleTableBox);
        createStsc(track, sampleTableBox);
        createStsz(track, sampleTableBox);
        createStco(track, sampleTableBox);
        return sampleTableBox;
    }

    protected void createStco(Track track, SampleTableBox sampleTableBox) {
        ArrayList arrayList = new ArrayList();
        Iterator it = track.getSamples().iterator();
        long j = -1;
        while (it.hasNext()) {
            Sample sample = (Sample) it.next();
            long offset = sample.getOffset();
            if (!(j == -1 || j == offset)) {
                j = -1;
            }
            if (j == -1) {
                arrayList.add(Long.valueOf(offset));
            }
            j = offset + sample.getSize();
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        Box staticChunkOffsetBox = new StaticChunkOffsetBox();
        staticChunkOffsetBox.setChunkOffsets(jArr);
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    protected void createStsc(Track track, SampleTableBox sampleTableBox) {
        Box sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        int size = track.getSamples().size();
        int i = 0;
        int i2 = 1;
        int i3 = -1;
        for (int i4 = i; i4 < size; i4++) {
            int i5;
            Sample sample = (Sample) track.getSamples().get(i4);
            long offset = sample.getOffset() + sample.getSize();
            i++;
            if (i4 != size - 1) {
                if (offset == ((Sample) track.getSamples().get(i4 + 1)).getOffset()) {
                    i5 = 0;
                    if (i5 == 0) {
                        if (i3 == i) {
                            sampleToChunkBox.getEntries().add(new Entry((long) i2, (long) i, 1));
                        } else {
                            i = i3;
                        }
                        i2++;
                        i3 = i;
                        i = 0;
                    }
                }
            }
            i5 = 1;
            if (i5 == 0) {
                if (i3 == i) {
                    i = i3;
                } else {
                    sampleToChunkBox.getEntries().add(new Entry((long) i2, (long) i, 1));
                }
                i2++;
                i3 = i;
                i = 0;
            }
        }
        sampleTableBox.addBox(sampleToChunkBox);
    }

    protected void createStsd(Track track, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(track.getSampleDescriptionBox());
    }

    protected void createStss(Track track, SampleTableBox sampleTableBox) {
        long[] syncSamples = track.getSyncSamples();
        if (syncSamples != null && syncSamples.length > 0) {
            Box syncSampleBox = new SyncSampleBox();
            syncSampleBox.setSampleNumber(syncSamples);
            sampleTableBox.addBox(syncSampleBox);
        }
    }

    protected void createStsz(Track track, SampleTableBox sampleTableBox) {
        Box sampleSizeBox = new SampleSizeBox();
        sampleSizeBox.setSampleSizes((long[]) this.track2SampleSizes.get(track));
        sampleTableBox.addBox(sampleSizeBox);
    }

    protected void createStts(Track track, SampleTableBox sampleTableBox) {
        List arrayList = new ArrayList();
        Iterator it = track.getSampleDurations().iterator();
        TimeToSampleBox.Entry entry = null;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (entry == null || entry.getDelta() != longValue) {
                entry = new TimeToSampleBox.Entry(1, longValue);
                arrayList.add(entry);
            } else {
                entry.setCount(entry.getCount() + 1);
            }
        }
        Box timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    protected TrackBox createTrackBox(Track track, Mp4Movie mp4Movie) {
        TrackBox trackBox = new TrackBox();
        Box trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setInPreview(true);
        trackHeaderBox.setMatrix(track.isAudio() ? Matrix.ROTATE_0 : mp4Movie.getMatrix());
        trackHeaderBox.setAlternateGroup(0);
        trackHeaderBox.setCreationTime(track.getCreationTime());
        trackHeaderBox.setDuration((track.getDuration() * getTimescale(mp4Movie)) / ((long) track.getTimeScale()));
        trackHeaderBox.setHeight((double) track.getHeight());
        trackHeaderBox.setWidth((double) track.getWidth());
        trackHeaderBox.setLayer(0);
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackId() + 1);
        trackHeaderBox.setVolume(track.getVolume());
        trackBox.addBox(trackHeaderBox);
        MediaBox mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        trackHeaderBox = new MediaHeaderBox();
        trackHeaderBox.setCreationTime(track.getCreationTime());
        trackHeaderBox.setDuration(track.getDuration());
        trackHeaderBox.setTimescale((long) track.getTimeScale());
        trackHeaderBox.setLanguage("eng");
        mediaBox.addBox(trackHeaderBox);
        trackHeaderBox = new HandlerBox();
        trackHeaderBox.setName(track.isAudio() ? "SoundHandle" : "VideoHandle");
        trackHeaderBox.setHandlerType(track.getHandler());
        mediaBox.addBox(trackHeaderBox);
        trackHeaderBox = new MediaInformationBox();
        trackHeaderBox.addBox(track.getMediaHeaderBox());
        Box dataInformationBox = new DataInformationBox();
        Object dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        Box dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        trackHeaderBox.addBox(dataInformationBox);
        trackHeaderBox.addBox(createStbl(track));
        mediaBox.addBox(trackHeaderBox);
        return trackBox;
    }

    public void finishMovie(boolean z) {
        if (this.mdat.getContentSize() != 0) {
            flushCurrentMdat();
        }
        Iterator it = this.currentMp4Movie.getTracks().iterator();
        while (it.hasNext()) {
            Track track = (Track) it.next();
            List samples = track.getSamples();
            Object obj = new long[samples.size()];
            for (int i = 0; i < obj.length; i++) {
                obj[i] = ((Sample) samples.get(i)).getSize();
            }
            this.track2SampleSizes.put(track, obj);
        }
        createMovieBox(this.currentMp4Movie).getBox(this.fc);
        this.fos.flush();
        this.fc.close();
        this.fos.close();
    }

    public long getTimescale(Mp4Movie mp4Movie) {
        long timeScale = !mp4Movie.getTracks().isEmpty() ? (long) ((Track) mp4Movie.getTracks().iterator().next()).getTimeScale() : 0;
        Iterator it = mp4Movie.getTracks().iterator();
        while (it.hasNext()) {
            timeScale = gcd((long) ((Track) it.next()).getTimeScale(), timeScale);
        }
        return timeScale;
    }

    public boolean writeSampleData(int i, ByteBuffer byteBuffer, BufferInfo bufferInfo, boolean z) {
        if (this.writeNewMdat) {
            this.mdat.setContentSize(0);
            this.mdat.getBox(this.fc);
            this.mdat.setDataOffset(this.dataOffset);
            this.dataOffset += 16;
            this.writedSinceLastMdat += 16;
            this.writeNewMdat = false;
        }
        this.mdat.setContentSize(this.mdat.getContentSize() + ((long) bufferInfo.size));
        this.writedSinceLastMdat += (long) bufferInfo.size;
        boolean z2 = true;
        if (this.writedSinceLastMdat >= IjkMediaMeta.AV_CH_TOP_BACK_LEFT) {
            flushCurrentMdat();
            this.writeNewMdat = true;
            this.writedSinceLastMdat -= IjkMediaMeta.AV_CH_TOP_BACK_LEFT;
        } else {
            z2 = false;
        }
        this.currentMp4Movie.addSample(i, this.dataOffset, bufferInfo);
        byteBuffer.position(bufferInfo.offset + (z ? 0 : 4));
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        if (!z) {
            this.sizeBuffer.position(0);
            this.sizeBuffer.putInt(bufferInfo.size - 4);
            this.sizeBuffer.position(0);
            this.fc.write(this.sizeBuffer);
        }
        this.fc.write(byteBuffer);
        this.dataOffset += (long) bufferInfo.size;
        if (z2) {
            this.fos.flush();
        }
        return z2;
    }
}
