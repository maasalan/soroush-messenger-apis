package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.BoxParser;
import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.DataEntryUrlBox;
import com.coremedia.iso.boxes.DataInformationBox;
import com.coremedia.iso.boxes.DataReferenceBox;
import com.coremedia.iso.boxes.EditBox;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.EditListBox.Entry;
import com.coremedia.iso.boxes.FileTypeBox;
import com.coremedia.iso.boxes.HandlerBox;
import com.coremedia.iso.boxes.HintMediaHeaderBox;
import com.coremedia.iso.boxes.MediaBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MediaInformationBox;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.NullMediaHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleSizeBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SampleToChunkBox;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.StaticChunkOffsetBox;
import com.coremedia.iso.boxes.SubtitleMediaHeaderBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox;
import com.coremedia.iso.boxes.fragment.SampleFlags;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.boxes.dece.SampleEncryptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.Path;
import com.p149g.p150a.p560a.C7129a;
import com.p149g.p150a.p560a.C7130b;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C7309b;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.p487a.p490b.p492b.C4600b;

public class FragmentedMp4Builder implements Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Logger LOG = Logger.getLogger(FragmentedMp4Builder.class.getName());
    protected FragmentIntersectionFinder intersectionFinder;

    private long getTrackDuration(Movie movie, Track track) {
        return (track.getDuration() * movie.getTimescale()) / track.getTrackMetaData().getTimescale();
    }

    public Container build(Movie movie) {
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("Creating movie ");
        stringBuilder.append(movie);
        logger.fine(stringBuilder.toString());
        if (this.intersectionFinder == null) {
            Track track = null;
            for (Track track2 : movie.getTracks()) {
                if (track2.getHandler().equals("vide")) {
                    track = track2;
                    break;
                }
            }
            this.intersectionFinder = new SyncSampleIntersectFinderImpl(movie, track, -1);
        }
        Container basicContainer = new BasicContainer();
        basicContainer.addBox(createFtyp(movie));
        basicContainer.addBox(createMoov(movie));
        for (Box addBox : createMoofMdat(movie)) {
            basicContainer.addBox(addBox);
        }
        basicContainer.addBox(createMfra(movie, basicContainer));
        return basicContainer;
    }

    protected DataInformationBox createDinf(Movie movie, Track track) {
        DataInformationBox dataInformationBox = new DataInformationBox();
        Object dataReferenceBox = new DataReferenceBox();
        dataInformationBox.addBox(dataReferenceBox);
        Box dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        return dataInformationBox;
    }

    protected Box createEdts(Track track, Movie movie) {
        if (track.getEdits() == null || track.getEdits().size() <= 0) {
            return null;
        }
        Box editListBox = new EditListBox();
        editListBox.setVersion(1);
        List arrayList = new ArrayList();
        for (Edit edit : track.getEdits()) {
            arrayList.add(new Entry(editListBox, Math.round(edit.getSegmentDuration() * ((double) movie.getTimescale())), (edit.getMediaTime() * track.getTrackMetaData().getTimescale()) / edit.getTimeScale(), edit.getMediaRate()));
        }
        editListBox.setEntries(arrayList);
        Box editBox = new EditBox();
        editBox.addBox(editListBox);
        return editBox;
    }

    protected int createFragment(List<Box> list, Track track, long[] jArr, int i, int i2) {
        if (i >= jArr.length) {
            return i2;
        }
        long j = jArr[i];
        i++;
        long size = i < jArr.length ? jArr[i] : (long) (track.getSamples().size() + 1);
        if (j == size) {
            return i2;
        }
        long j2 = j;
        long j3 = size;
        Track track2 = track;
        int i3 = i2;
        list.add(createMoof(j2, j3, track2, i3));
        int i4 = i2 + 1;
        list.add(createMdat(j2, j3, track2, i3));
        return i4;
    }

    public Box createFtyp(Movie movie) {
        List linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(VisualSampleEntry.TYPE3);
        return new FileTypeBox("isom", 0, linkedList);
    }

    protected Box createMdat(long j, long j2, Track track, int i) {
        final long j3 = j;
        final long j4 = j2;
        final Track track2 = track;
        final int i2 = i;
        return new Box() {
            Container parent;
            long size_ = -1;

            public void getBox(WritableByteChannel writableByteChannel) {
                ByteBuffer allocate = ByteBuffer.allocate(8);
                IsoTypeWriter.writeUInt32(allocate, (long) CastUtils.l2i(getSize()));
                allocate.put(IsoFile.fourCCtoBytes(getType()));
                allocate.rewind();
                writableByteChannel.write(allocate);
                for (Sample writeTo : FragmentedMp4Builder.this.getSamples(j3, j4, track2, i2)) {
                    writeTo.writeTo(writableByteChannel);
                }
            }

            public long getOffset() {
                throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
            }

            public Container getParent() {
                return this.parent;
            }

            public long getSize() {
                if (this.size_ != -1) {
                    return this.size_;
                }
                long j = 8;
                for (Sample size : FragmentedMp4Builder.this.getSamples(j3, j4, track2, i2)) {
                    j += size.getSize();
                }
                this.size_ = j;
                return j;
            }

            public String getType() {
                return MediaDataBox.TYPE;
            }

            public void parse(DataSource dataSource, ByteBuffer byteBuffer, long j, BoxParser boxParser) {
            }

            public void setParent(Container container) {
                this.parent = container;
            }
        };
    }

    protected Box createMdhd(Movie movie, Track track) {
        Box mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setModificationTime(getDate());
        mediaHeaderBox.setDuration(0);
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        return mediaHeaderBox;
    }

    protected Box createMdia(Track track, Movie movie) {
        Box mediaBox = new MediaBox();
        mediaBox.addBox(createMdhd(movie, track));
        mediaBox.addBox(createMdiaHdlr(track, movie));
        mediaBox.addBox(createMinf(track, movie));
        return mediaBox;
    }

    protected Box createMdiaHdlr(Track track, Movie movie) {
        Box handlerBox = new HandlerBox();
        handlerBox.setHandlerType(track.getHandler());
        return handlerBox;
    }

    protected void createMfhd(long j, long j2, Track track, int i, MovieFragmentBox movieFragmentBox) {
        Box movieFragmentHeaderBox = new MovieFragmentHeaderBox();
        movieFragmentHeaderBox.setSequenceNumber((long) i);
        movieFragmentBox.addBox(movieFragmentHeaderBox);
    }

    protected Box createMfra(Movie movie, Container container) {
        Box movieFragmentRandomAccessBox = new MovieFragmentRandomAccessBox();
        for (Track createTfra : movie.getTracks()) {
            movieFragmentRandomAccessBox.addBox(createTfra(createTfra, container));
        }
        Object movieFragmentRandomAccessOffsetBox = new MovieFragmentRandomAccessOffsetBox();
        movieFragmentRandomAccessBox.addBox(movieFragmentRandomAccessOffsetBox);
        movieFragmentRandomAccessOffsetBox.setMfraSize(movieFragmentRandomAccessBox.getSize());
        return movieFragmentRandomAccessBox;
    }

    protected Box createMinf(Track track, Movie movie) {
        Box videoMediaHeaderBox;
        Box mediaInformationBox = new MediaInformationBox();
        if (track.getHandler().equals("vide")) {
            videoMediaHeaderBox = new VideoMediaHeaderBox();
        } else if (track.getHandler().equals("soun")) {
            videoMediaHeaderBox = new SoundMediaHeaderBox();
        } else if (track.getHandler().equals("text")) {
            videoMediaHeaderBox = new NullMediaHeaderBox();
        } else if (track.getHandler().equals("subt")) {
            videoMediaHeaderBox = new SubtitleMediaHeaderBox();
        } else if (track.getHandler().equals(TrackReferenceTypeBox.TYPE1)) {
            videoMediaHeaderBox = new HintMediaHeaderBox();
        } else {
            if (track.getHandler().equals("sbtl")) {
                videoMediaHeaderBox = new NullMediaHeaderBox();
            }
            mediaInformationBox.addBox(createDinf(movie, track));
            mediaInformationBox.addBox(createStbl(movie, track));
            return mediaInformationBox;
        }
        mediaInformationBox.addBox(videoMediaHeaderBox);
        mediaInformationBox.addBox(createDinf(movie, track));
        mediaInformationBox.addBox(createStbl(movie, track));
        return mediaInformationBox;
    }

    protected Box createMoof(long j, long j2, Track track, int i) {
        Box movieFragmentBox = new MovieFragmentBox();
        long j3 = j;
        long j4 = j2;
        Track track2 = track;
        int i2 = i;
        Box box = movieFragmentBox;
        createMfhd(j3, j4, track2, i2, box);
        createTraf(j3, j4, track2, i2, box);
        TrackRunBox trackRunBox = (TrackRunBox) movieFragmentBox.getTrackRunBoxes().get(0);
        trackRunBox.setDataOffset(1);
        trackRunBox.setDataOffset((int) (8 + movieFragmentBox.getSize()));
        return movieFragmentBox;
    }

    protected List<Box> createMoofMdat(Movie movie) {
        List linkedList = new LinkedList();
        Object hashMap = new HashMap();
        int i = 0;
        for (Track track : movie.getTracks()) {
            Object sampleNumbers = this.intersectionFinder.sampleNumbers(track);
            hashMap.put(track, sampleNumbers);
            i = Math.max(i, sampleNumbers.length);
        }
        int i2 = 1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i2;
            for (Track track2 : sortTracksInSequence(movie.getTracks(), i3, hashMap)) {
                i4 = createFragment(linkedList, track2, (long[]) hashMap.get(track2), i3, i4);
            }
            i3++;
            i2 = i4;
        }
        return linkedList;
    }

    protected Box createMoov(Movie movie) {
        Box movieBox = new MovieBox();
        movieBox.addBox(createMvhd(movie));
        for (Track createTrak : movie.getTracks()) {
            movieBox.addBox(createTrak(createTrak, movie));
        }
        movieBox.addBox(createMvex(movie));
        return movieBox;
    }

    protected Box createMvex(Movie movie) {
        Box movieExtendsBox = new MovieExtendsBox();
        Box movieExtendsHeaderBox = new MovieExtendsHeaderBox();
        movieExtendsHeaderBox.setVersion(1);
        for (Track trackDuration : movie.getTracks()) {
            long trackDuration2 = getTrackDuration(movie, trackDuration);
            if (movieExtendsHeaderBox.getFragmentDuration() < trackDuration2) {
                movieExtendsHeaderBox.setFragmentDuration(trackDuration2);
            }
        }
        movieExtendsBox.addBox(movieExtendsHeaderBox);
        for (Track createTrex : movie.getTracks()) {
            movieExtendsBox.addBox(createTrex(movie, createTrex));
        }
        return movieExtendsBox;
    }

    protected Box createMvhd(Movie movie) {
        Box movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setVersion(1);
        movieHeaderBox.setCreationTime(getDate());
        movieHeaderBox.setModificationTime(getDate());
        long j = 0;
        movieHeaderBox.setDuration(0);
        movieHeaderBox.setTimescale(movie.getTimescale());
        for (Track track : movie.getTracks()) {
            if (j < track.getTrackMetaData().getTrackId()) {
                j = track.getTrackMetaData().getTrackId();
            }
        }
        movieHeaderBox.setNextTrackId(j + 1);
        return movieHeaderBox;
    }

    protected void createSaio(long j, long j2, CencEncryptedTrack cencEncryptedTrack, int i, TrackFragmentBox trackFragmentBox) {
        Path.getPath(cencEncryptedTrack.getSampleDescriptionBox(), "enc.[0]/sinf[0]/schm[0]");
        Object c7129a = new C7129a();
        trackFragmentBox.addBox(c7129a);
        Object obj = "cenc";
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(C7129a.f20309b, c7129a, c7129a, obj));
        c7129a.f20315a = obj;
        c7129a.setFlags(1);
        j2 = 8;
        for (Box box : trackFragmentBox.getBoxes()) {
            if (box instanceof SampleEncryptionBox) {
                j2 += (long) ((SampleEncryptionBox) box).getOffsetToFirstIV();
                break;
            }
            j2 += box.getSize();
        }
        long j3 = j2 + 16;
        for (Object obj2 : ((MovieFragmentBox) trackFragmentBox.getParent()).getBoxes()) {
            if (obj2 == trackFragmentBox) {
                break;
            }
            j3 += obj2.getSize();
        }
        c7129a.m18747a(new long[]{j3});
    }

    protected void createSaiz(long j, long j2, CencEncryptedTrack cencEncryptedTrack, int i, TrackFragmentBox trackFragmentBox) {
        AbstractContainerBox sampleDescriptionBox = cencEncryptedTrack.getSampleDescriptionBox();
        Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schm[0]");
        C7309b c7309b = (C7309b) Path.getPath(sampleDescriptionBox, "enc.[0]/sinf[0]/schi[0]/tenc[0]");
        Box c7130b = new C7130b();
        c7130b.m18751a("cenc");
        c7130b.setFlags(1);
        if (cencEncryptedTrack.hasSubSampleEncryption()) {
            short[] sArr = new short[CastUtils.l2i(j2 - j)];
            List subList = cencEncryptedTrack.getSampleEncryptionEntries().subList(CastUtils.l2i(j - 1), CastUtils.l2i(j2 - 1));
            for (int i2 = 0; i2 < sArr.length; i2++) {
                sArr[i2] = (short) ((C1613a) subList.get(i2)).m4152a();
            }
            c7130b.m18752a(sArr);
        } else {
            c7130b.m18754b(c7309b.getDefaultIvSize());
            c7130b.m18756c(CastUtils.l2i(j2 - j));
        }
        trackFragmentBox.addBox(c7130b);
    }

    protected void createSenc(long j, long j2, CencEncryptedTrack cencEncryptedTrack, int i, TrackFragmentBox trackFragmentBox) {
        Box sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(cencEncryptedTrack.hasSubSampleEncryption());
        sampleEncryptionBox.setEntries(cencEncryptedTrack.getSampleEncryptionEntries().subList(CastUtils.l2i(j - 1), CastUtils.l2i(j2 - 1)));
        trackFragmentBox.addBox(sampleEncryptionBox);
    }

    protected Box createStbl(Movie movie, Track track) {
        Box sampleTableBox = new SampleTableBox();
        createStsd(track, sampleTableBox);
        sampleTableBox.addBox(new TimeToSampleBox());
        sampleTableBox.addBox(new SampleToChunkBox());
        sampleTableBox.addBox(new SampleSizeBox());
        sampleTableBox.addBox(new StaticChunkOffsetBox());
        return sampleTableBox;
    }

    protected void createStsd(Track track, SampleTableBox sampleTableBox) {
        sampleTableBox.addBox(track.getSampleDescriptionBox());
    }

    protected void createTfdt(long j, Track track, TrackFragmentBox trackFragmentBox) {
        Box trackFragmentBaseMediaDecodeTimeBox = new TrackFragmentBaseMediaDecodeTimeBox();
        int i = 1;
        trackFragmentBaseMediaDecodeTimeBox.setVersion(1);
        long[] sampleDurations = track.getSampleDurations();
        long j2 = 0;
        while (((long) i) < j) {
            i++;
            j2 += sampleDurations[i - 1];
        }
        trackFragmentBaseMediaDecodeTimeBox.setBaseMediaDecodeTime(j2);
        trackFragmentBox.addBox(trackFragmentBaseMediaDecodeTimeBox);
    }

    protected void createTfhd(long j, long j2, Track track, int i, TrackFragmentBox trackFragmentBox) {
        Box trackFragmentHeaderBox = new TrackFragmentHeaderBox();
        trackFragmentHeaderBox.setDefaultSampleFlags(new SampleFlags());
        trackFragmentHeaderBox.setBaseDataOffset(-1);
        trackFragmentHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackFragmentHeaderBox.setDefaultBaseIsMoof(true);
        trackFragmentBox.addBox(trackFragmentHeaderBox);
    }

    protected Box createTfra(Track track, Container container) {
        Box trackFragmentRandomAccessBox = new TrackFragmentRandomAccessBox();
        trackFragmentRandomAccessBox.setVersion(1);
        List linkedList = new LinkedList();
        TrackExtendsBox trackExtendsBox = null;
        for (TrackExtendsBox trackExtendsBox2 : Path.getPaths(container, "moov/mvex/trex")) {
            Box box = trackFragmentRandomAccessBox;
            List list = linkedList;
            TrackExtendsBox trackExtendsBox3 = trackExtendsBox2;
            if (trackExtendsBox2.getTrackId() == track.getTrackMetaData().getTrackId()) {
                trackFragmentRandomAccessBox = box;
                linkedList = list;
            } else {
                trackFragmentRandomAccessBox = box;
                linkedList = list;
                trackExtendsBox2 = trackExtendsBox3;
            }
        }
        Iterator it = container.getBoxes().iterator();
        long j = 0;
        long j2 = 0;
        while (it.hasNext()) {
            Box box2 = (Box) it.next();
            if (box2 instanceof MovieFragmentBox) {
                List boxes = ((MovieFragmentBox) box2).getBoxes(TrackFragmentBox.class);
                int i = 0;
                int i2 = 0;
                while (i2 < boxes.size()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) boxes.get(i2);
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == track.getTrackMetaData().getTrackId()) {
                        List boxes2 = trackFragmentBox.getBoxes(TrackRunBox.class);
                        int i3 = i;
                        while (i3 < boxes2.size()) {
                            Collection linkedList2 = new LinkedList();
                            TrackRunBox trackRunBox = (TrackRunBox) boxes2.get(i3);
                            long j3 = j2;
                            int i4 = i;
                            while (i4 < trackRunBox.getEntries().size()) {
                                Iterator it2;
                                int i5;
                                TrackRunBox trackRunBox2;
                                int i6;
                                int i7;
                                List list2;
                                List list3;
                                Box box3;
                                Object obj;
                                TrackRunBox.Entry entry = (TrackRunBox.Entry) trackRunBox.getEntries().get(i4);
                                SampleFlags firstSampleFlags = (i4 == 0 && trackRunBox.isFirstSampleFlagsPresent()) ? trackRunBox.getFirstSampleFlags() : trackRunBox.isSampleFlagsPresent() ? entry.getSampleFlags() : trackExtendsBox2.getDefaultSampleFlags();
                                SampleFlags sampleFlags = firstSampleFlags;
                                if (sampleFlags == null) {
                                    box = trackFragmentRandomAccessBox;
                                    list = linkedList;
                                    if (track.getHandler().equals("vide")) {
                                        throw new RuntimeException("Cannot find SampleFlags for video track but it's required to build tfra");
                                    }
                                }
                                box = trackFragmentRandomAccessBox;
                                list = linkedList;
                                if (sampleFlags != null) {
                                    if (sampleFlags.getSampleDependsOn() != 2) {
                                        trackExtendsBox3 = trackExtendsBox2;
                                        it2 = it;
                                        i5 = i4;
                                        trackRunBox2 = trackRunBox;
                                        i6 = i3;
                                        linkedList = linkedList2;
                                        i7 = i2;
                                        list2 = boxes2;
                                        list3 = boxes;
                                        box3 = box2;
                                        i4 = i5 + 1;
                                        obj = linkedList;
                                        boxes = list3;
                                        box2 = box3;
                                        j3 += entry.getSampleDuration();
                                        trackFragmentRandomAccessBox = box;
                                        linkedList = list;
                                        trackExtendsBox2 = trackExtendsBox3;
                                        it = it2;
                                        trackRunBox = trackRunBox2;
                                        i3 = i6;
                                        i2 = i7;
                                        boxes2 = list2;
                                        i = 0;
                                    }
                                }
                                trackExtendsBox3 = trackExtendsBox2;
                                it2 = it;
                                i5 = i4;
                                trackRunBox2 = trackRunBox;
                                TrackRunBox.Entry entry2 = entry;
                                i6 = i3;
                                linkedList = linkedList2;
                                i7 = i2;
                                list2 = boxes2;
                                list3 = boxes;
                                box3 = box2;
                                linkedList.add(new TrackFragmentRandomAccessBox.Entry(j3, j, (long) (i2 + 1), (long) (i3 + 1), (long) (i4 + 1)));
                                entry = entry2;
                                i4 = i5 + 1;
                                obj = linkedList;
                                boxes = list3;
                                box2 = box3;
                                j3 += entry.getSampleDuration();
                                trackFragmentRandomAccessBox = box;
                                linkedList = list;
                                trackExtendsBox2 = trackExtendsBox3;
                                it = it2;
                                trackRunBox = trackRunBox2;
                                i3 = i6;
                                i2 = i7;
                                boxes2 = list2;
                                i = 0;
                            }
                            if (linkedList2.size() != trackRunBox.getEntries().size() || trackRunBox.getEntries().size() <= 0) {
                                linkedList.addAll(linkedList2);
                            } else {
                                linkedList.add((TrackFragmentRandomAccessBox.Entry) linkedList2.get(i));
                            }
                            i3++;
                            j2 = j3;
                        }
                    }
                    i2++;
                    boxes = boxes;
                    box2 = box2;
                    trackFragmentRandomAccessBox = trackFragmentRandomAccessBox;
                    linkedList = linkedList;
                    trackExtendsBox2 = trackExtendsBox2;
                    it = it;
                    i = 0;
                }
            }
            j += box2.getSize();
            trackFragmentRandomAccessBox = trackFragmentRandomAccessBox;
            linkedList = linkedList;
            trackExtendsBox2 = trackExtendsBox2;
            it = it;
        }
        trackFragmentRandomAccessBox.setEntries(linkedList);
        trackFragmentRandomAccessBox.setTrackId(track.getTrackMetaData().getTrackId());
        return trackFragmentRandomAccessBox;
    }

    protected Box createTkhd(Movie movie, Track track) {
        Box trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setVersion(1);
        trackHeaderBox.setFlags(7);
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        trackHeaderBox.setDuration(0);
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(getDate());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        return trackHeaderBox;
    }

    protected void createTraf(long j, long j2, Track track, int i, MovieFragmentBox movieFragmentBox) {
        long j3 = j;
        Track track2 = track;
        TrackFragmentBox trackFragmentBox = new TrackFragmentBox();
        movieFragmentBox.addBox(trackFragmentBox);
        long j4 = j3;
        long j5 = j2;
        Track track3 = track2;
        int i2 = i;
        TrackFragmentBox trackFragmentBox2 = trackFragmentBox;
        createTfhd(j4, j5, track3, i2, trackFragmentBox2);
        createTfdt(j3, track2, trackFragmentBox);
        createTrun(j4, j5, track3, i2, trackFragmentBox2);
        if (track2 instanceof CencEncryptedTrack) {
            j4 = j3;
            j5 = j2;
            CencEncryptedTrack cencEncryptedTrack = (CencEncryptedTrack) track2;
            i2 = i;
            trackFragmentBox2 = trackFragmentBox;
            createSaiz(j4, j5, cencEncryptedTrack, i2, trackFragmentBox2);
            createSenc(j4, j5, cencEncryptedTrack, i2, trackFragmentBox2);
            createSaio(j4, j5, cencEncryptedTrack, i2, trackFragmentBox2);
        }
        Map hashMap = new HashMap();
        for (Map.Entry entry : track.getSampleGroups().entrySet()) {
            String type = ((GroupEntry) entry.getKey()).getType();
            List list = (List) hashMap.get(type);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(type, list);
            }
            list.add((GroupEntry) entry.getKey());
            j3 = j;
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Box sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            Box sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            SampleToGroupBox.Entry entry3 = null;
            long j6 = 1;
            int l2i = CastUtils.l2i(j3 - 1);
            Iterator it2 = it;
            while (l2i < CastUtils.l2i(j2 - j6)) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < ((List) entry2.getValue()).size()) {
                    if (Arrays.binarySearch((long[]) track.getSampleGroups().get((GroupEntry) ((List) entry2.getValue()).get(i3)), (long) l2i) >= 0) {
                        i4 = i3 + 1;
                    }
                    i3++;
                    j3 = j;
                }
                if (entry3 != null) {
                    if (entry3.getGroupDescriptionIndex() == i4) {
                        j6 = 1;
                        entry3.setSampleCount(entry3.getSampleCount() + 1);
                        l2i++;
                        j3 = j;
                    }
                }
                j6 = 1;
                entry3 = new SampleToGroupBox.Entry(1, i4);
                sampleToGroupBox.getEntries().add(entry3);
                l2i++;
                j3 = j;
            }
            trackFragmentBox.addBox(sampleGroupDescriptionBox);
            trackFragmentBox.addBox(sampleToGroupBox);
            it = it2;
        }
    }

    protected Box createTrak(Track track, Movie movie) {
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("Creating Track ");
        stringBuilder.append(track);
        logger.fine(stringBuilder.toString());
        Box trackBox = new TrackBox();
        trackBox.addBox(createTkhd(movie, track));
        Box createEdts = createEdts(track, movie);
        if (createEdts != null) {
            trackBox.addBox(createEdts);
        }
        trackBox.addBox(createMdia(track, movie));
        return trackBox;
    }

    protected Box createTrex(Movie movie, Track track) {
        Box trackExtendsBox = new TrackExtendsBox();
        trackExtendsBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackExtendsBox.setDefaultSampleDescriptionIndex(1);
        trackExtendsBox.setDefaultSampleDuration(0);
        trackExtendsBox.setDefaultSampleSize(0);
        SampleFlags sampleFlags = new SampleFlags();
        if ("soun".equals(track.getHandler()) || "subt".equals(track.getHandler())) {
            sampleFlags.setSampleDependsOn(2);
            sampleFlags.setSampleIsDependedOn(2);
        }
        trackExtendsBox.setDefaultSampleFlags(sampleFlags);
        return trackExtendsBox;
    }

    protected void createTrun(long j, long j2, Track track, int i, TrackFragmentBox trackFragmentBox) {
        boolean z;
        int i2;
        TrackRunBox.Entry entry;
        List list;
        boolean z2;
        SampleFlags sampleFlags;
        long j3;
        Box trackRunBox = new TrackRunBox();
        boolean z3 = true;
        trackRunBox.setVersion(1);
        long[] sampleSizes = getSampleSizes(j, j2, track, i);
        trackRunBox.setSampleDurationPresent(true);
        trackRunBox.setSampleSizePresent(true);
        List arrayList = new ArrayList(CastUtils.l2i(j2 - j));
        List compositionTimeEntries = track.getCompositionTimeEntries();
        CompositionTimeToSample.Entry[] entryArr = (compositionTimeEntries == null || compositionTimeEntries.size() <= 0) ? null : (CompositionTimeToSample.Entry[]) compositionTimeEntries.toArray(new CompositionTimeToSample.Entry[compositionTimeEntries.size()]);
        boolean z4 = false;
        long count = (long) (entryArr != null ? entryArr[0].getCount() : -1);
        trackRunBox.setSampleCompositionTimeOffsetPresent(count > 0);
        int i3 = 0;
        long j4 = count;
        count = 1;
        while (count < j) {
            long j5;
            TrackFragmentBox trackFragmentBox2 = trackFragmentBox;
            long[] jArr = sampleSizes;
            List list2 = arrayList;
            z3 = z4;
            if (entryArr != null) {
                long j6 = j4 - 1;
                j5 = 0;
                if (j6 == 0) {
                    z4 = true;
                    if (entryArr.length - i3 > 1) {
                        i3++;
                        j6 = (long) entryArr[i3].getCount();
                    }
                } else {
                    z4 = true;
                }
                j4 = j6;
            } else {
                j5 = 0;
                z4 = true;
            }
            long j7 = j5;
            count++;
            sampleSizes = jArr;
            arrayList = list2;
            boolean z5 = z4;
            z4 = z3;
            z3 = z5;
        }
        if (track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty()) {
            if (track.getSyncSamples() != null) {
                if (track.getSyncSamples().length == 0) {
                }
            }
            z = z4;
            trackRunBox.setSampleFlagsPresent(z);
            i2 = z4;
            while (i2 < sampleSizes.length) {
                trackFragmentBox2 = trackFragmentBox;
                entry = new TrackRunBox.Entry();
                entry.setSampleSize(sampleSizes[i2]);
                if (z) {
                    jArr = sampleSizes;
                    list = arrayList;
                    z3 = z4;
                    z2 = z;
                } else {
                    sampleFlags = new SampleFlags();
                    if (!(track.getSampleDependencies() == null || track.getSampleDependencies().isEmpty())) {
                        SampleDependencyTypeBox.Entry entry2 = (SampleDependencyTypeBox.Entry) track.getSampleDependencies().get(i2);
                        sampleFlags.setSampleDependsOn(entry2.getSampleDependsOn());
                        sampleFlags.setSampleIsDependedOn(entry2.getSampleIsDependentOn());
                        sampleFlags.setSampleHasRedundancy(entry2.getSampleHasRedundancy());
                    }
                    if (track.getSyncSamples() != null || track.getSyncSamples().length <= 0) {
                        jArr = sampleSizes;
                        list = arrayList;
                        z3 = z4;
                        z2 = z;
                    } else {
                        int i4;
                        z2 = z;
                        jArr = sampleSizes;
                        list = arrayList;
                        if (Arrays.binarySearch(track.getSyncSamples(), j + ((long) i2)) >= 0) {
                            z3 = false;
                            sampleFlags.setSampleIsDifferenceSample(false);
                            i4 = 2;
                        } else {
                            z3 = false;
                            i4 = 1;
                            sampleFlags.setSampleIsDifferenceSample(true);
                        }
                        sampleFlags.setSampleDependsOn(i4);
                    }
                    entry.setSampleFlags(sampleFlags);
                }
                entry.setSampleDuration(track.getSampleDurations()[CastUtils.l2i((j + ((long) i2)) - 1)]);
                if (entryArr != null) {
                    entry.setSampleCompositionTimeOffset(entryArr[i3].getOffset());
                    j3 = j4 - 1;
                    if (j3 == 0 && entryArr.length - i3 > 1) {
                        i3++;
                        j3 = (long) entryArr[i3].getCount();
                    }
                    j4 = j3;
                }
                list2 = list;
                list2.add(entry);
                i2++;
                arrayList = list2;
                z4 = z3;
                z = z2;
                sampleSizes = jArr;
            }
            trackRunBox.setEntries(arrayList);
            trackFragmentBox.addBox(trackRunBox);
        }
        z = z3;
        trackRunBox.setSampleFlagsPresent(z);
        i2 = z4;
        while (i2 < sampleSizes.length) {
            trackFragmentBox2 = trackFragmentBox;
            entry = new TrackRunBox.Entry();
            entry.setSampleSize(sampleSizes[i2]);
            if (z) {
                jArr = sampleSizes;
                list = arrayList;
                z3 = z4;
                z2 = z;
            } else {
                sampleFlags = new SampleFlags();
                SampleDependencyTypeBox.Entry entry22 = (SampleDependencyTypeBox.Entry) track.getSampleDependencies().get(i2);
                sampleFlags.setSampleDependsOn(entry22.getSampleDependsOn());
                sampleFlags.setSampleIsDependedOn(entry22.getSampleIsDependentOn());
                sampleFlags.setSampleHasRedundancy(entry22.getSampleHasRedundancy());
                if (track.getSyncSamples() != null) {
                }
                jArr = sampleSizes;
                list = arrayList;
                z3 = z4;
                z2 = z;
                entry.setSampleFlags(sampleFlags);
            }
            entry.setSampleDuration(track.getSampleDurations()[CastUtils.l2i((j + ((long) i2)) - 1)]);
            if (entryArr != null) {
                entry.setSampleCompositionTimeOffset(entryArr[i3].getOffset());
                j3 = j4 - 1;
                i3++;
                j3 = (long) entryArr[i3].getCount();
                j4 = j3;
            }
            list2 = list;
            list2.add(entry);
            i2++;
            arrayList = list2;
            z4 = z3;
            z = z2;
            sampleSizes = jArr;
        }
        trackRunBox.setEntries(arrayList);
        trackFragmentBox.addBox(trackRunBox);
    }

    public Date getDate() {
        return new Date();
    }

    public FragmentIntersectionFinder getFragmentIntersectionFinder() {
        return this.intersectionFinder;
    }

    protected long[] getSampleSizes(long j, long j2, Track track, int i) {
        List samples = getSamples(j, j2, track, i);
        long[] jArr = new long[samples.size()];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = ((Sample) samples.get(i2)).getSize();
        }
        return jArr;
    }

    protected List<Sample> getSamples(long j, long j2, Track track, int i) {
        return track.getSamples().subList(CastUtils.l2i(j) - 1, CastUtils.l2i(j2) - 1);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentIntersectionFinder) {
        this.intersectionFinder = fragmentIntersectionFinder;
    }

    protected List<Track> sortTracksInSequence(List<Track> list, final int i, final Map<Track, long[]> map) {
        List<Track> linkedList = new LinkedList(list);
        Collections.sort(linkedList, new Comparator<Track>() {
            public int compare(Track track, Track track2) {
                long j = ((long[]) map.get(track))[i];
                long j2 = ((long[]) map.get(track2))[i];
                long[] sampleDurations = track.getSampleDurations();
                long[] sampleDurations2 = track2.getSampleDurations();
                int i = 1;
                int i2 = 1;
                long j3 = 0;
                while (((long) i2) < j) {
                    i2++;
                    j3 += sampleDurations[i2 - 1];
                }
                j = 0;
                while (((long) i) < j2) {
                    i++;
                    j += sampleDurations2[i - 1];
                }
                return (int) (((((double) j3) / ((double) track.getTrackMetaData().getTimescale())) - (((double) j) / ((double) track2.getTrackMetaData().getTimescale()))) * 100.0d);
            }
        });
        return linkedList;
    }
}
