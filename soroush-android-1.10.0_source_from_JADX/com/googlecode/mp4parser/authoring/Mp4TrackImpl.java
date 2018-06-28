package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.SampleList;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.msgpack.util.TemplatePrecompiler;

public class Mp4TrackImpl extends AbstractTrack {
    private List<Entry> compositionTimeEntries;
    private long[] decodingTimes;
    IsoFile[] fragments;
    private String handler;
    private List<SampleDependencyTypeBox.Entry> sampleDependencies;
    private SampleDescriptionBox sampleDescriptionBox;
    private List<Sample> samples;
    private SubSampleInformationBox subSampleInformationBox = null;
    private long[] syncSamples = new long[0];
    TrackBox trackBox;
    private TrackMetaData trackMetaData = new TrackMetaData();

    public Mp4TrackImpl(String str, TrackBox trackBox, IsoFile... isoFileArr) {
        Iterator it;
        AbstractContainerBox abstractContainerBox = trackBox;
        IsoFile[] isoFileArr2 = isoFileArr;
        super(str);
        int i = 0;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        this.samples = new SampleList(abstractContainerBox, isoFileArr2);
        AbstractContainerBox sampleTableBox = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        this.handler = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        List arrayList = new ArrayList();
        this.compositionTimeEntries = new ArrayList();
        this.sampleDependencies = new ArrayList();
        arrayList.addAll(sampleTableBox.getTimeToSampleBox().getEntries());
        if (sampleTableBox.getCompositionTimeToSample() != null) {
            r0.compositionTimeEntries.addAll(sampleTableBox.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox.getSampleDependencyTypeBox() != null) {
            r0.sampleDependencies.addAll(sampleTableBox.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox.getSyncSampleBox() != null) {
            r0.syncSamples = sampleTableBox.getSyncSampleBox().getSampleNumber();
        }
        r0.subSampleInformationBox = (SubSampleInformationBox) Path.getPath(sampleTableBox, SubSampleInformationBox.TYPE);
        List arrayList2 = new ArrayList();
        arrayList2.addAll(((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = isoFileArr2.length;
        int i2 = 0;
        while (i2 < length) {
            long j = trackId;
            List list = arrayList2;
            list.addAll(isoFileArr2[i2].getBoxes(MovieFragmentBox.class));
            i2++;
            arrayList2 = list;
            trackId = j;
            i = 0;
        }
        r0.sampleDescriptionBox = sampleTableBox.getSampleDescriptionBox();
        List boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            Iterator it2;
            Iterator it3 = boxes.iterator();
            while (it3.hasNext()) {
                it2 = ((MovieExtendsBox) it3.next()).getBoxes(TrackExtendsBox.class).iterator();
                while (it2.hasNext()) {
                    TrackExtendsBox trackExtendsBox = (TrackExtendsBox) it2.next();
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (Path.getPaths(((Box) trackBox.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            r0.subSampleInformationBox = new SubSampleInformationBox();
                        }
                        List linkedList = new LinkedList();
                        Iterator it4 = arrayList2.iterator();
                        long j2 = 1;
                        while (it4.hasNext()) {
                            it = ((MovieFragmentBox) it4.next()).getBoxes(TrackFragmentBox.class).iterator();
                            while (it.hasNext()) {
                                AbstractContainerBox abstractContainerBox2 = (TrackFragmentBox) it.next();
                                long j3;
                                List list2;
                                Iterator it5;
                                if (abstractContainerBox2.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    Iterator it6;
                                    Iterator it7;
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) Path.getPath(abstractContainerBox2, SubSampleInformationBox.TYPE);
                                    if (subSampleInformationBox != null) {
                                        long j4 = (j2 - 0) - 1;
                                        Iterator it8 = subSampleInformationBox.getEntries().iterator();
                                        while (it8.hasNext()) {
                                            Iterator it9;
                                            it6 = it3;
                                            SubSampleEntry subSampleEntry = (SubSampleEntry) it8.next();
                                            it7 = it;
                                            SubSampleEntry subSampleEntry2 = new SubSampleEntry();
                                            j = trackId;
                                            subSampleEntry2.getSubsampleEntries().addAll(subSampleEntry.getSubsampleEntries());
                                            if (j4 != 0) {
                                                it9 = it8;
                                                j3 = j2;
                                                subSampleEntry2.setSampleDelta(j4 + subSampleEntry.getSampleDelta());
                                                j4 = 0;
                                            } else {
                                                it9 = it8;
                                                j3 = j2;
                                                subSampleEntry2.setSampleDelta(subSampleEntry.getSampleDelta());
                                            }
                                            r0.subSampleInformationBox.getEntries().add(subSampleEntry2);
                                            it3 = it6;
                                            it = it7;
                                            trackId = j;
                                            j2 = j3;
                                            it8 = it9;
                                        }
                                    }
                                    it6 = it3;
                                    it7 = it;
                                    j = trackId;
                                    j3 = j2;
                                    it3 = abstractContainerBox2.getBoxes(TrackRunBox.class).iterator();
                                    j2 = j3;
                                    while (it3.hasNext()) {
                                        TrackRunBox trackRunBox = (TrackRunBox) it3.next();
                                        TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox) trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        Object obj = 1;
                                        for (TrackRunBox.Entry entry : trackRunBox.getEntries()) {
                                            Iterator it10;
                                            Iterator it11;
                                            List list3;
                                            Entry entry2;
                                            SampleFlags sampleFlags;
                                            Object entry3;
                                            if (trackRunBox.isSampleDurationPresent()) {
                                                if (arrayList.size() != 0) {
                                                    it10 = it3;
                                                    if (((TimeToSampleBox.Entry) arrayList.get(arrayList.size() - 1)).getDelta() == entry.getSampleDuration()) {
                                                        TimeToSampleBox.Entry entry4 = (TimeToSampleBox.Entry) arrayList.get(arrayList.size() - 1);
                                                        list2 = arrayList2;
                                                        it11 = it2;
                                                        list3 = linkedList;
                                                        it5 = it4;
                                                        entry4.setCount(entry4.getCount() + 1);
                                                        if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                            if (r0.compositionTimeEntries.size() != 0) {
                                                                if (((long) ((Entry) r0.compositionTimeEntries.get(r0.compositionTimeEntries.size() - 1)).getOffset()) != entry.getSampleCompositionTimeOffset()) {
                                                                    entry2 = (Entry) r0.compositionTimeEntries.get(r0.compositionTimeEntries.size() - 1);
                                                                    entry2.setCount(entry2.getCount() + 1);
                                                                }
                                                            }
                                                            r0.compositionTimeEntries.add(new Entry(1, CastUtils.l2i(entry.getSampleCompositionTimeOffset())));
                                                        }
                                                        sampleFlags = trackRunBox.isSampleFlagsPresent() ? entry.getSampleFlags() : (obj == null && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackFragmentHeaderBox.hasDefaultSampleFlags() ? trackFragmentHeaderBox.getDefaultSampleFlags() : trackExtendsBox.getDefaultSampleFlags();
                                                        if (sampleFlags != null || sampleFlags.isSampleIsDifferenceSample()) {
                                                            arrayList2 = list3;
                                                        } else {
                                                            arrayList2 = list3;
                                                            arrayList2.add(Long.valueOf(j2));
                                                        }
                                                        linkedList = arrayList2;
                                                        j2++;
                                                        it3 = it10;
                                                        arrayList2 = list2;
                                                        it2 = it11;
                                                        it4 = it5;
                                                        obj = null;
                                                    }
                                                } else {
                                                    it10 = it3;
                                                }
                                                list2 = arrayList2;
                                                it11 = it2;
                                                list3 = linkedList;
                                                it5 = it4;
                                                entry3 = new TimeToSampleBox.Entry(1, entry.getSampleDuration());
                                            } else {
                                                it10 = it3;
                                                list2 = arrayList2;
                                                it11 = it2;
                                                list3 = linkedList;
                                                it5 = it4;
                                                entry3 = trackFragmentHeaderBox.hasDefaultSampleDuration() ? new TimeToSampleBox.Entry(1, trackFragmentHeaderBox.getDefaultSampleDuration()) : new TimeToSampleBox.Entry(1, trackExtendsBox.getDefaultSampleDuration());
                                            }
                                            arrayList.add(entry3);
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (r0.compositionTimeEntries.size() != 0) {
                                                    if (((long) ((Entry) r0.compositionTimeEntries.get(r0.compositionTimeEntries.size() - 1)).getOffset()) != entry.getSampleCompositionTimeOffset()) {
                                                        entry2 = (Entry) r0.compositionTimeEntries.get(r0.compositionTimeEntries.size() - 1);
                                                        entry2.setCount(entry2.getCount() + 1);
                                                    }
                                                }
                                                r0.compositionTimeEntries.add(new Entry(1, CastUtils.l2i(entry.getSampleCompositionTimeOffset())));
                                            }
                                            if (trackRunBox.isSampleFlagsPresent()) {
                                            }
                                            if (sampleFlags != null) {
                                            }
                                            arrayList2 = list3;
                                            linkedList = arrayList2;
                                            j2++;
                                            it3 = it10;
                                            arrayList2 = list2;
                                            it2 = it11;
                                            it4 = it5;
                                            obj = null;
                                        }
                                    }
                                    it3 = it6;
                                    it = it7;
                                    trackId = j;
                                } else {
                                    list2 = arrayList2;
                                    arrayList2 = linkedList;
                                    it5 = it4;
                                    j3 = j2;
                                    arrayList2 = list2;
                                }
                            }
                            i = 0;
                        }
                        Object obj2 = r0.syncSamples;
                        r0.syncSamples = new long[(r0.syncSamples.length + r10.size())];
                        System.arraycopy(obj2, i, r0.syncSamples, i, obj2.length);
                        int length2 = obj2.length;
                        for (Long longValue : r10) {
                            int i3 = length2 + 1;
                            r0.syncSamples[length2] = longValue.longValue();
                            length2 = i3;
                        }
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3 = new ArrayList();
            for (MovieFragmentBox boxes2 : r8) {
                for (Container container : boxes2.getBoxes(TrackFragmentBox.class)) {
                    if (container.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        r0.sampleGroups = getSampleGroups(Path.getPaths(container, SampleGroupDescriptionBox.TYPE), Path.getPaths(container, SampleToGroupBox.TYPE), r0.sampleGroups);
                    }
                }
            }
        } else {
            r0.sampleGroups = getSampleGroups(sampleTableBox.getBoxes(SampleGroupDescriptionBox.class), sampleTableBox.getBoxes(SampleToGroupBox.class), r0.sampleGroups);
        }
        r0.decodingTimes = TimeToSampleBox.blowupTimeToSamples(arrayList);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        r0.trackMetaData.setTrackId(trackHeaderBox.getTrackId());
        r0.trackMetaData.setCreationTime(mediaHeaderBox.getCreationTime());
        r0.trackMetaData.setLanguage(mediaHeaderBox.getLanguage());
        r0.trackMetaData.setModificationTime(mediaHeaderBox.getModificationTime());
        r0.trackMetaData.setTimescale(mediaHeaderBox.getTimescale());
        r0.trackMetaData.setHeight(trackHeaderBox.getHeight());
        r0.trackMetaData.setWidth(trackHeaderBox.getWidth());
        r0.trackMetaData.setLayer(trackHeaderBox.getLayer());
        r0.trackMetaData.setMatrix(trackHeaderBox.getMatrix());
        EditListBox editListBox = (EditListBox) Path.getPath(abstractContainerBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) Path.getPath(abstractContainerBox, "../mvhd");
        if (editListBox != null) {
            it = editListBox.getEntries().iterator();
            while (it.hasNext()) {
                EditListBox.Entry entry5 = (EditListBox.Entry) it.next();
                MediaHeaderBox mediaHeaderBox2 = mediaHeaderBox;
                Iterator it12 = it;
                r0.edits.add(new Edit(entry5.getMediaTime(), mediaHeaderBox.getTimescale(), entry5.getMediaRate(), ((double) entry5.getSegmentDuration()) / ((double) movieHeaderBox.getTimescale())));
                mediaHeaderBox = mediaHeaderBox2;
                it = it12;
            }
        }
    }

    private Map<GroupEntry, long[]> getSampleGroups(List<SampleGroupDescriptionBox> list, List<SampleToGroupBox> list2, Map<GroupEntry, long[]> map) {
        Map<GroupEntry, long[]> map2 = map;
        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list) {
            int i = 0;
            for (SampleToGroupBox sampleToGroupBox : list2) {
                if (sampleToGroupBox.getGroupingType().equals(((GroupEntry) sampleGroupDescriptionBox.getGroupEntries().get(0)).getType())) {
                    i = 0;
                    for (SampleToGroupBox.Entry entry : sampleToGroupBox.getEntries()) {
                        if (entry.getGroupDescriptionIndex() > 0) {
                            GroupEntry groupEntry = (GroupEntry) sampleGroupDescriptionBox.getGroupEntries().get(entry.getGroupDescriptionIndex() - 1);
                            Object obj = (long[]) map2.get(groupEntry);
                            if (obj == null) {
                                obj = new long[0];
                            }
                            Object obj2 = new long[(CastUtils.l2i(entry.getSampleCount()) + obj.length)];
                            System.arraycopy(obj, 0, obj2, 0, obj.length);
                            for (int i2 = 0; ((long) i2) < entry.getSampleCount(); i2++) {
                                obj2[obj.length + i2] = (long) (i + i2);
                            }
                            map2.put(groupEntry, obj2);
                        }
                        i = (int) (((long) i) + entry.getSampleCount());
                    }
                    i = 1;
                }
            }
            if (i == 0) {
                StringBuilder stringBuilder = new StringBuilder("Could not find SampleToGroupBox for ");
                stringBuilder.append(((GroupEntry) sampleGroupDescriptionBox.getGroupEntries().get(0)).getType());
                stringBuilder.append(TemplatePrecompiler.DEFAULT_DEST);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return map2;
    }

    public void close() {
        Container parent = this.trackBox.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
        for (IsoFile close : this.fragments) {
            close.close();
        }
    }

    public List<Entry> getCompositionTimeEntries() {
        return this.compositionTimeEntries;
    }

    public String getHandler() {
        return this.handler;
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.sampleDependencies;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public synchronized long[] getSampleDurations() {
        return this.decodingTimes;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.subSampleInformationBox;
    }

    public long[] getSyncSamples() {
        return this.syncSamples.length == this.samples.size() ? null : this.syncSamples;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
