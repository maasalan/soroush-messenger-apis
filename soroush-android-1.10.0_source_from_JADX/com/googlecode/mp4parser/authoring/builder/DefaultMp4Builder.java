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
import com.coremedia.iso.boxes.SyncSampleBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.mdat.MediaDataBox;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.DataSource;
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
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DefaultMp4Builder implements Mp4Builder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Logger LOG = Logger.getLogger(DefaultMp4Builder.class.getName());
    Set<StaticChunkOffsetBox> chunkOffsetBoxes = new HashSet();
    private FragmentIntersectionFinder intersectionFinder;
    Set<C7129a> sampleAuxiliaryInformationOffsetsBoxes = new HashSet();
    HashMap<Track, List<Sample>> track2Sample = new HashMap();
    HashMap<Track, long[]> track2SampleSizes = new HashMap();

    private class InterleaveChunkMdat implements Box {
        List<List<Sample>> chunkList;
        long contentSize;
        Container parent;
        List<Track> tracks;

        private InterleaveChunkMdat(Movie movie, Map<Track, int[]> map, long j) {
            this.chunkList = new ArrayList();
            this.contentSize = j;
            this.tracks = movie.getTracks();
            for (int i = 0; i < ((int[]) map.values().iterator().next()).length; i++) {
                for (Track track : this.tracks) {
                    int[] iArr = (int[]) map.get(track);
                    long j2 = 0;
                    int i2 = 0;
                    while (i2 < i) {
                        i2++;
                        j2 += (long) iArr[i2];
                    }
                    this.chunkList.add(((List) DefaultMp4Builder.this.track2Sample.get(track)).subList(CastUtils.l2i(j2), CastUtils.l2i(j2 + ((long) iArr[i]))));
                }
            }
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
            for (List<Sample> it : this.chunkList) {
                for (Sample writeTo : it) {
                    writeTo.writeTo(writableByteChannel);
                }
            }
        }

        public long getDataOffset() {
            long j = 16;
            Container container = this;
            while (container instanceof Box) {
                Box box = (Box) container;
                for (Object obj : box.getParent().getBoxes()) {
                    if (container == obj) {
                        break;
                    }
                    j += obj.getSize();
                }
                container = box.getParent();
            }
            return j;
        }

        public long getOffset() {
            throw new RuntimeException("Doesn't have any meaning for programmatically created boxes");
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

        public void setParent(Container container) {
            this.parent = container;
        }
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

    private static long sum(int[] iArr) {
        long j = 0;
        int i = 0;
        while (i < iArr.length) {
            i++;
            j += (long) iArr[i];
        }
        return j;
    }

    private static long sum(long[] jArr) {
        long j = 0;
        int i = 0;
        while (i < jArr.length) {
            i++;
            j += jArr[i];
        }
        return j;
    }

    public Container build(Movie movie) {
        if (this.intersectionFinder == null) {
            this.intersectionFinder = new TwoSecondIntersectionFinder(movie, 2);
        }
        Logger logger = LOG;
        StringBuilder stringBuilder = new StringBuilder("Creating movie ");
        stringBuilder.append(movie);
        logger.fine(stringBuilder.toString());
        Iterator it = movie.getTracks().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Track track = (Track) it.next();
            List samples = track.getSamples();
            putSamples(track, samples);
            Object obj = new long[samples.size()];
            while (i < obj.length) {
                obj[i] = ((Sample) samples.get(i)).getSize();
                i++;
            }
            this.track2SampleSizes.put(track, obj);
        }
        Container basicContainer = new BasicContainer();
        basicContainer.addBox(createFileTypeBox(movie));
        Map hashMap = new HashMap();
        for (Track track2 : movie.getTracks()) {
            hashMap.put(track2, getChunkSizes(track2, movie));
        }
        Box createMovieBox = createMovieBox(movie, hashMap);
        basicContainer.addBox(createMovieBox);
        long j = 0;
        for (SampleSizeBox sampleSizes : Path.getPaths(createMovieBox, "trak/mdia/minf/stbl/stsz")) {
            j += sum(sampleSizes.getSampleSizes());
        }
        InterleaveChunkMdat interleaveChunkMdat = new InterleaveChunkMdat(movie, hashMap, j);
        basicContainer.addBox(interleaveChunkMdat);
        long dataOffset = interleaveChunkMdat.getDataOffset();
        for (StaticChunkOffsetBox chunkOffsets : this.chunkOffsetBoxes) {
            long[] chunkOffsets2 = chunkOffsets.getChunkOffsets();
            for (int i2 = 0; i2 < chunkOffsets2.length; i2++) {
                chunkOffsets2[i2] = chunkOffsets2[i2] + dataOffset;
            }
        }
        for (C7129a c7129a : this.sampleAuxiliaryInformationOffsetsBoxes) {
            j = c7129a.getSize() + 44;
            Box box = c7129a;
            while (true) {
                Container parent = box.getParent();
                for (Box box2 : parent.getBoxes()) {
                    if (box2 == box) {
                        break;
                    }
                    j += box2.getSize();
                }
                if (!(parent instanceof Box)) {
                    break;
                }
                Object obj2 = parent;
            }
            long[] b = c7129a.m18748b();
            for (int i3 = 0; i3 < b.length; i3++) {
                b[i3] = b[i3] + j;
            }
            c7129a.m18747a(b);
        }
        return basicContainer;
    }

    protected void createCencBoxes(CencEncryptedTrack cencEncryptedTrack, SampleTableBox sampleTableBox, int[] iArr) {
        SampleTableBox sampleTableBox2 = sampleTableBox;
        int[] iArr2 = iArr;
        Box c7130b = new C7130b();
        c7130b.m18751a("cenc");
        c7130b.setFlags(1);
        List sampleEncryptionEntries = cencEncryptedTrack.getSampleEncryptionEntries();
        if (cencEncryptedTrack.hasSubSampleEncryption()) {
            short[] sArr = new short[sampleEncryptionEntries.size()];
            for (int i = 0; i < sArr.length; i++) {
                sArr[i] = (short) ((C1613a) sampleEncryptionEntries.get(i)).m4152a();
            }
            c7130b.m18752a(sArr);
        } else {
            c7130b.m18754b(8);
            c7130b.m18756c(cencEncryptedTrack.getSamples().size());
        }
        Box c7129a = new C7129a();
        Box sampleEncryptionBox = new SampleEncryptionBox();
        sampleEncryptionBox.setSubSampleEncryption(cencEncryptedTrack.hasSubSampleEncryption());
        sampleEncryptionBox.setEntries(sampleEncryptionEntries);
        long[] jArr = new long[iArr2.length];
        long offsetToFirstIV = (long) sampleEncryptionBox.getOffsetToFirstIV();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iArr2.length) {
            DefaultMp4Builder defaultMp4Builder = this;
            jArr[i2] = offsetToFirstIV;
            int i4 = i3;
            i3 = 0;
            while (i3 < iArr2[i2]) {
                i3++;
                i4++;
                sampleEncryptionBox = sampleEncryptionBox;
                offsetToFirstIV += (long) ((C1613a) sampleEncryptionEntries.get(i4)).m4152a();
            }
            i2++;
            i3 = i4;
        }
        c7129a.m18747a(jArr);
        sampleTableBox2.addBox(c7130b);
        sampleTableBox2.addBox(c7129a);
        sampleTableBox2.addBox(sampleEncryptionBox);
        this.sampleAuxiliaryInformationOffsetsBoxes.add(c7129a);
    }

    protected void createCtts(Track track, SampleTableBox sampleTableBox) {
        List compositionTimeEntries = track.getCompositionTimeEntries();
        if (compositionTimeEntries != null && !compositionTimeEntries.isEmpty()) {
            Box compositionTimeToSample = new CompositionTimeToSample();
            compositionTimeToSample.setEntries(compositionTimeEntries);
            sampleTableBox.addBox(compositionTimeToSample);
        }
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

    protected FileTypeBox createFileTypeBox(Movie movie) {
        List linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add(VisualSampleEntry.TYPE3);
        return new FileTypeBox("isom", 0, linkedList);
    }

    protected MovieBox createMovieBox(Movie movie, Map<Track, int[]> map) {
        MovieBox movieBox = new MovieBox();
        Box movieHeaderBox = new MovieHeaderBox();
        movieHeaderBox.setCreationTime(new Date());
        movieHeaderBox.setModificationTime(new Date());
        movieHeaderBox.setMatrix(movie.getMatrix());
        long timescale = getTimescale(movie);
        long j = 0;
        for (Track track : movie.getTracks()) {
            long j2;
            DefaultMp4Builder defaultMp4Builder = this;
            Movie movie2 = movie;
            Map<Track, int[]> map2 = map;
            if (track.getEdits() != null) {
                if (!track.getEdits().isEmpty()) {
                    j2 = 0;
                    for (Edit segmentDuration : track.getEdits()) {
                        j2 += (long) segmentDuration.getSegmentDuration();
                    }
                    j2 *= getTimescale(movie);
                    if (j2 > j) {
                        j = j2;
                    }
                }
            }
            j2 = (track.getDuration() * getTimescale(movie)) / track.getTrackMetaData().getTimescale();
            if (j2 > j) {
                j = j2;
            }
        }
        movieHeaderBox.setDuration(j);
        movieHeaderBox.setTimescale(timescale);
        long j3 = 0;
        for (Track track2 : movie.getTracks()) {
            defaultMp4Builder = this;
            movie2 = movie;
            map2 = map;
            if (j3 < track2.getTrackMetaData().getTrackId()) {
                j3 = track2.getTrackMetaData().getTrackId();
            }
        }
        movieHeaderBox.setNextTrackId(j3 + 1);
        movieBox.addBox(movieHeaderBox);
        for (Track createTrackBox : movie.getTracks()) {
            movieBox.addBox(createTrackBox(createTrackBox, movie, map));
        }
        movieHeaderBox = createUdta(movie);
        if (movieHeaderBox != null) {
            movieBox.addBox(movieHeaderBox);
        }
        return movieBox;
    }

    protected void createSdtp(Track track, SampleTableBox sampleTableBox) {
        if (track.getSampleDependencies() != null && !track.getSampleDependencies().isEmpty()) {
            Box sampleDependencyTypeBox = new SampleDependencyTypeBox();
            sampleDependencyTypeBox.setEntries(track.getSampleDependencies());
            sampleTableBox.addBox(sampleDependencyTypeBox);
        }
    }

    protected Box createStbl(Track track, Movie movie, Map<Track, int[]> map) {
        Track track2 = track;
        Map<Track, int[]> map2 = map;
        Box sampleTableBox = new SampleTableBox();
        createStsd(track2, sampleTableBox);
        createStts(track2, sampleTableBox);
        createCtts(track2, sampleTableBox);
        createStss(track2, sampleTableBox);
        createSdtp(track2, sampleTableBox);
        createStsc(track2, map2, sampleTableBox);
        createStsz(track2, sampleTableBox);
        createStco(track2, movie, map2, sampleTableBox);
        Map hashMap = new HashMap();
        for (Map.Entry entry : track.getSampleGroups().entrySet()) {
            String type = ((GroupEntry) entry.getKey()).getType();
            List list = (List) hashMap.get(type);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(type, list);
            }
            list.add((GroupEntry) entry.getKey());
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Box sampleGroupDescriptionBox = new SampleGroupDescriptionBox();
            String str = (String) entry2.getKey();
            sampleGroupDescriptionBox.setGroupEntries((List) entry2.getValue());
            Box sampleToGroupBox = new SampleToGroupBox();
            sampleToGroupBox.setGroupingType(str);
            SampleToGroupBox.Entry entry3 = null;
            int i = 0;
            while (i < track.getSamples().size()) {
                int i2;
                int i3 = 0;
                for (int i4 = 0; i4 < ((List) entry2.getValue()).size(); i4++) {
                    i = i;
                    if (Arrays.binarySearch((long[]) track.getSampleGroups().get((GroupEntry) ((List) entry2.getValue()).get(i4)), (long) i) >= 0) {
                        i3 = i4 + 1;
                    }
                }
                if (entry3 != null) {
                    if (entry3.getGroupDescriptionIndex() == i3) {
                        i2 = i;
                        entry3.setSampleCount(entry3.getSampleCount() + 1);
                        i = i2 + 1;
                    }
                }
                i2 = i;
                SampleToGroupBox.Entry entry4 = new SampleToGroupBox.Entry(1, i3);
                sampleToGroupBox.getEntries().add(entry4);
                entry3 = entry4;
                i = i2 + 1;
            }
            sampleTableBox.addBox(sampleGroupDescriptionBox);
            sampleTableBox.addBox(sampleToGroupBox);
        }
        if (track2 instanceof CencEncryptedTrack) {
            createCencBoxes((CencEncryptedTrack) track2, sampleTableBox, (int[]) map2.get(track2));
        }
        createSubs(track2, sampleTableBox);
        return sampleTableBox;
    }

    protected void createStco(Track track, Movie movie, Map<Track, int[]> map, SampleTableBox sampleTableBox) {
        Object obj = track;
        Map map2 = map;
        int[] iArr = (int[]) map2.get(obj);
        Box staticChunkOffsetBox = new StaticChunkOffsetBox();
        this.chunkOffsetBoxes.add(staticChunkOffsetBox);
        long[] jArr = new long[iArr.length];
        if (LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder stringBuilder = new StringBuilder("Calculating chunk offsets for track_");
            stringBuilder.append(track.getTrackMetaData().getTrackId());
            logger.fine(stringBuilder.toString());
        }
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            SampleTableBox sampleTableBox2 = sampleTableBox;
            if (LOG.isLoggable(Level.FINER)) {
                Logger logger2 = LOG;
                StringBuilder stringBuilder2 = new StringBuilder("Calculating chunk offsets for track_");
                stringBuilder2.append(track.getTrackMetaData().getTrackId());
                stringBuilder2.append(" chunk ");
                stringBuilder2.append(i);
                logger2.finer(stringBuilder2.toString());
            }
            for (Track track2 : movie.getTracks()) {
                Track track3;
                Map<Track, int[]> map3;
                int[] iArr2;
                Box box;
                if (LOG.isLoggable(Level.FINEST)) {
                    Logger logger3 = LOG;
                    StringBuilder stringBuilder3 = new StringBuilder("Adding offsets of track_");
                    stringBuilder3.append(track2.getTrackMetaData().getTrackId());
                    logger3.finest(stringBuilder3.toString());
                }
                int[] iArr3 = (int[]) map2.get(track2);
                int i2 = 0;
                long j2 = 0;
                while (i2 < i) {
                    i2++;
                    j2 += (long) iArr3[i2];
                    iArr = iArr;
                    staticChunkOffsetBox = staticChunkOffsetBox;
                    track3 = track;
                    map3 = map;
                }
                if (track2 == track3) {
                    jArr[i] = j;
                }
                i2 = CastUtils.l2i(j2);
                while (true) {
                    iArr2 = iArr;
                    box = staticChunkOffsetBox;
                    if (((long) i2) >= j2 + ((long) iArr3[i])) {
                        break;
                    }
                    i2++;
                    iArr = iArr2;
                    staticChunkOffsetBox = box;
                    j += ((long[]) r0.track2SampleSizes.get(track2))[i2];
                }
                iArr = iArr2;
                staticChunkOffsetBox = box;
                track3 = track;
                map3 = map;
            }
        }
        staticChunkOffsetBox.setChunkOffsets(jArr);
        sampleTableBox.addBox(staticChunkOffsetBox);
    }

    protected void createStsc(Track track, Map<Track, int[]> map, SampleTableBox sampleTableBox) {
        int[] iArr = (int[]) map.get(track);
        Box sampleToChunkBox = new SampleToChunkBox();
        sampleToChunkBox.setEntries(new LinkedList());
        long j = -2147483648L;
        for (int i = 0; i < iArr.length; i++) {
            if (j != ((long) iArr[i])) {
                sampleToChunkBox.getEntries().add(new SampleToChunkBox.Entry((long) (i + 1), (long) iArr[i], 1));
                j = (long) iArr[i];
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
        TimeToSampleBox.Entry entry = null;
        for (long j : track.getSampleDurations()) {
            if (entry == null || entry.getDelta() != j) {
                entry = new TimeToSampleBox.Entry(1, j);
                arrayList.add(entry);
            } else {
                entry.setCount(entry.getCount() + 1);
            }
        }
        Box timeToSampleBox = new TimeToSampleBox();
        timeToSampleBox.setEntries(arrayList);
        sampleTableBox.addBox(timeToSampleBox);
    }

    protected void createSubs(Track track, SampleTableBox sampleTableBox) {
        if (track.getSubsampleInformationBox() != null) {
            sampleTableBox.addBox(track.getSubsampleInformationBox());
        }
    }

    protected TrackBox createTrackBox(Track track, Movie movie, Map<Track, int[]> map) {
        long j;
        MediaBox mediaBox;
        Box mediaHeaderBox;
        Object handlerBox;
        Box videoMediaHeaderBox;
        Object dataReferenceBox;
        Box dataEntryUrlBox;
        TrackBox trackBox = new TrackBox();
        Box trackHeaderBox = new TrackHeaderBox();
        trackHeaderBox.setEnabled(true);
        trackHeaderBox.setInMovie(true);
        trackHeaderBox.setInPreview(true);
        trackHeaderBox.setInPoster(true);
        trackHeaderBox.setMatrix(track.getTrackMetaData().getMatrix());
        trackHeaderBox.setAlternateGroup(track.getTrackMetaData().getGroup());
        trackHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        if (track.getEdits() != null) {
            if (!track.getEdits().isEmpty()) {
                j = 0;
                for (Edit segmentDuration : track.getEdits()) {
                    j += (long) segmentDuration.getSegmentDuration();
                }
                j *= track.getTrackMetaData().getTimescale();
                trackHeaderBox.setDuration(j);
                trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
                trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
                trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
                trackHeaderBox.setModificationTime(new Date());
                trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
                trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
                trackBox.addBox(trackHeaderBox);
                trackBox.addBox(createEdts(track, movie));
                mediaBox = new MediaBox();
                trackBox.addBox(mediaBox);
                mediaHeaderBox = new MediaHeaderBox();
                mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
                mediaHeaderBox.setDuration(track.getDuration());
                mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
                mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
                mediaBox.addBox(mediaHeaderBox);
                handlerBox = new HandlerBox();
                mediaBox.addBox(handlerBox);
                handlerBox.setHandlerType(track.getHandler());
                mediaHeaderBox = new MediaInformationBox();
                if (track.getHandler().equals("vide")) {
                    videoMediaHeaderBox = new VideoMediaHeaderBox();
                } else if (track.getHandler().equals("soun")) {
                    videoMediaHeaderBox = new SoundMediaHeaderBox();
                } else if (track.getHandler().equals("text")) {
                    videoMediaHeaderBox = new NullMediaHeaderBox();
                } else if (track.getHandler().equals("subt")) {
                    videoMediaHeaderBox = new SubtitleMediaHeaderBox();
                } else if (track.getHandler().equals(TrackReferenceTypeBox.TYPE1)) {
                    if (track.getHandler().equals("sbtl")) {
                        videoMediaHeaderBox = new NullMediaHeaderBox();
                    }
                    videoMediaHeaderBox = new DataInformationBox();
                    dataReferenceBox = new DataReferenceBox();
                    videoMediaHeaderBox.addBox(dataReferenceBox);
                    dataEntryUrlBox = new DataEntryUrlBox();
                    dataEntryUrlBox.setFlags(1);
                    dataReferenceBox.addBox(dataEntryUrlBox);
                    mediaHeaderBox.addBox(videoMediaHeaderBox);
                    mediaHeaderBox.addBox(createStbl(track, movie, map));
                    mediaBox.addBox(mediaHeaderBox);
                    return trackBox;
                } else {
                    videoMediaHeaderBox = new HintMediaHeaderBox();
                }
                mediaHeaderBox.addBox(videoMediaHeaderBox);
                videoMediaHeaderBox = new DataInformationBox();
                dataReferenceBox = new DataReferenceBox();
                videoMediaHeaderBox.addBox(dataReferenceBox);
                dataEntryUrlBox = new DataEntryUrlBox();
                dataEntryUrlBox.setFlags(1);
                dataReferenceBox.addBox(dataEntryUrlBox);
                mediaHeaderBox.addBox(videoMediaHeaderBox);
                mediaHeaderBox.addBox(createStbl(track, movie, map));
                mediaBox.addBox(mediaHeaderBox);
                return trackBox;
            }
        }
        j = (track.getDuration() * getTimescale(movie)) / track.getTrackMetaData().getTimescale();
        trackHeaderBox.setDuration(j);
        trackHeaderBox.setHeight(track.getTrackMetaData().getHeight());
        trackHeaderBox.setWidth(track.getTrackMetaData().getWidth());
        trackHeaderBox.setLayer(track.getTrackMetaData().getLayer());
        trackHeaderBox.setModificationTime(new Date());
        trackHeaderBox.setTrackId(track.getTrackMetaData().getTrackId());
        trackHeaderBox.setVolume(track.getTrackMetaData().getVolume());
        trackBox.addBox(trackHeaderBox);
        trackBox.addBox(createEdts(track, movie));
        mediaBox = new MediaBox();
        trackBox.addBox(mediaBox);
        mediaHeaderBox = new MediaHeaderBox();
        mediaHeaderBox.setCreationTime(track.getTrackMetaData().getCreationTime());
        mediaHeaderBox.setDuration(track.getDuration());
        mediaHeaderBox.setTimescale(track.getTrackMetaData().getTimescale());
        mediaHeaderBox.setLanguage(track.getTrackMetaData().getLanguage());
        mediaBox.addBox(mediaHeaderBox);
        handlerBox = new HandlerBox();
        mediaBox.addBox(handlerBox);
        handlerBox.setHandlerType(track.getHandler());
        mediaHeaderBox = new MediaInformationBox();
        if (track.getHandler().equals("vide")) {
            videoMediaHeaderBox = new VideoMediaHeaderBox();
        } else if (track.getHandler().equals("soun")) {
            videoMediaHeaderBox = new SoundMediaHeaderBox();
        } else if (track.getHandler().equals("text")) {
            videoMediaHeaderBox = new NullMediaHeaderBox();
        } else if (track.getHandler().equals("subt")) {
            videoMediaHeaderBox = new SubtitleMediaHeaderBox();
        } else if (track.getHandler().equals(TrackReferenceTypeBox.TYPE1)) {
            if (track.getHandler().equals("sbtl")) {
                videoMediaHeaderBox = new NullMediaHeaderBox();
            }
            videoMediaHeaderBox = new DataInformationBox();
            dataReferenceBox = new DataReferenceBox();
            videoMediaHeaderBox.addBox(dataReferenceBox);
            dataEntryUrlBox = new DataEntryUrlBox();
            dataEntryUrlBox.setFlags(1);
            dataReferenceBox.addBox(dataEntryUrlBox);
            mediaHeaderBox.addBox(videoMediaHeaderBox);
            mediaHeaderBox.addBox(createStbl(track, movie, map));
            mediaBox.addBox(mediaHeaderBox);
            return trackBox;
        } else {
            videoMediaHeaderBox = new HintMediaHeaderBox();
        }
        mediaHeaderBox.addBox(videoMediaHeaderBox);
        videoMediaHeaderBox = new DataInformationBox();
        dataReferenceBox = new DataReferenceBox();
        videoMediaHeaderBox.addBox(dataReferenceBox);
        dataEntryUrlBox = new DataEntryUrlBox();
        dataEntryUrlBox.setFlags(1);
        dataReferenceBox.addBox(dataEntryUrlBox);
        mediaHeaderBox.addBox(videoMediaHeaderBox);
        mediaHeaderBox.addBox(createStbl(track, movie, map));
        mediaBox.addBox(mediaHeaderBox);
        return trackBox;
    }

    protected Box createUdta(Movie movie) {
        return null;
    }

    int[] getChunkSizes(Track track, Movie movie) {
        long[] sampleNumbers = this.intersectionFinder.sampleNumbers(track);
        int i = 0;
        int[] iArr = new int[sampleNumbers.length];
        while (i < sampleNumbers.length) {
            int i2 = i + 1;
            iArr[i] = CastUtils.l2i((sampleNumbers.length == i2 ? (long) track.getSamples().size() : sampleNumbers[i2] - 1) - (sampleNumbers[i] - 1));
            i = i2;
        }
        return iArr;
    }

    public long getTimescale(Movie movie) {
        long timescale = ((Track) movie.getTracks().iterator().next()).getTrackMetaData().getTimescale();
        for (Track trackMetaData : movie.getTracks()) {
            timescale = gcd(trackMetaData.getTrackMetaData().getTimescale(), timescale);
        }
        return timescale;
    }

    protected List<Sample> putSamples(Track track, List<Sample> list) {
        return (List) this.track2Sample.put(track, list);
    }

    public void setIntersectionFinder(FragmentIntersectionFinder fragmentIntersectionFinder) {
        this.intersectionFinder = fragmentIntersectionFinder;
    }
}
