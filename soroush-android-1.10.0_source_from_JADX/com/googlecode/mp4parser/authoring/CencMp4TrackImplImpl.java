package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.ChunkOffsetBox;
import com.coremedia.iso.boxes.Container;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.googlecode.mp4parser.AbstractContainerBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.authoring.tracks.CencEncryptedTrack;
import com.googlecode.mp4parser.util.Path;
import com.p149g.p150a.p560a.C7129a;
import com.p149g.p150a.p560a.C7130b;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C1613a.C1612j;
import com.p149g.p152b.p153a.C7309b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.p487a.p490b.p492b.C4600b;

public class CencMp4TrackImplImpl extends Mp4TrackImpl implements CencEncryptedTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private UUID defaultKeyId;
    private List<C1613a> sampleEncryptionEntries = new ArrayList();

    private class FindSaioSaizPair {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Container container;
        private C7129a saio;
        private C7130b saiz;

        static {
            Class cls = CencMp4TrackImplImpl.class;
        }

        public FindSaioSaizPair(Container container) {
            this.container = container;
        }

        public C7129a getSaio() {
            return this.saio;
        }

        public C7130b getSaiz() {
            return this.saiz;
        }

        public FindSaioSaizPair invoke() {
            List boxes = this.container.getBoxes(C7130b.class);
            List boxes2 = this.container.getBoxes(C7129a.class);
            this.saiz = null;
            this.saio = null;
            int i = 0;
            while (i < boxes.size()) {
                if (!((this.saiz == null && ((C7130b) boxes.get(i)).m18749a() == null) || "cenc".equals(((C7130b) boxes.get(i)).m18749a()))) {
                    if (this.saiz == null || this.saiz.m18749a() != null || !"cenc".equals(((C7130b) boxes.get(i)).m18749a())) {
                        throw new RuntimeException("Are there two cenc labeled saiz?");
                    }
                }
                this.saiz = (C7130b) boxes.get(i);
                if (!((this.saio == null && ((C7129a) boxes2.get(i)).m18746a() == null) || "cenc".equals(((C7129a) boxes2.get(i)).m18746a()))) {
                    if (this.saio == null || this.saio.m18746a() != null || !"cenc".equals(((C7129a) boxes2.get(i)).m18746a())) {
                        throw new RuntimeException("Are there two cenc labeled saio?");
                    }
                }
                this.saio = (C7129a) boxes2.get(i);
                i++;
            }
            return this;
        }
    }

    public CencMp4TrackImplImpl(String str, TrackBox trackBox, IsoFile... isoFileArr) {
        AbstractContainerBox abstractContainerBox = trackBox;
        super(str, trackBox, isoFileArr);
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        int size;
        int i;
        if (trackBox.getParent().getBoxes(MovieExtendsBox.class).size() > 0) {
            Iterator it = ((Box) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class).iterator();
            while (it.hasNext()) {
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) it.next();
                Iterator it2 = movieFragmentBox.getBoxes(TrackFragmentBox.class).iterator();
                while (it2.hasNext()) {
                    TrackFragmentBox trackFragmentBox = (TrackFragmentBox) it2.next();
                    if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                        Container parent;
                        long baseDataOffset;
                        C7309b c7309b = (C7309b) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
                        r0.defaultKeyId = c7309b.getDefault_KID();
                        if (trackFragmentBox.getTrackFragmentHeaderBox().hasBaseDataOffset()) {
                            parent = ((Box) trackBox.getParent()).getParent();
                            baseDataOffset = trackFragmentBox.getTrackFragmentHeaderBox().getBaseDataOffset();
                        } else {
                            parent = movieFragmentBox;
                            baseDataOffset = 0;
                        }
                        FindSaioSaizPair invoke = new FindSaioSaizPair(trackFragmentBox).invoke();
                        C7129a saio = invoke.getSaio();
                        C7130b saiz = invoke.getSaiz();
                        long[] b = saio.m18748b();
                        List boxes = trackFragmentBox.getBoxes(TrackRunBox.class);
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < b.length) {
                            List list;
                            size = ((TrackRunBox) boxes.get(i2)).getEntries().size();
                            long j = b[i2];
                            long j2 = trackId;
                            Iterator it3 = it;
                            long[] jArr = b;
                            int i4 = i3;
                            long j3 = 0;
                            while (true) {
                                i = i3 + size;
                                if (i4 >= i) {
                                    break;
                                }
                                list = boxes;
                                long a = j3 + ((long) saiz.m18750a(i4));
                                i4++;
                                movieFragmentBox = movieFragmentBox;
                                it2 = it2;
                                j3 = a;
                            }
                            MovieFragmentBox movieFragmentBox2 = movieFragmentBox;
                            ByteBuffer byteBuffer = parent.getByteBuffer(baseDataOffset + j, j3);
                            i4 = i3;
                            while (i4 < i) {
                                Iterator it4 = it2;
                                list = boxes;
                                r0.sampleEncryptionEntries.add(parseCencAuxDataFormat(c7309b.getDefaultIvSize(), byteBuffer, (long) saiz.m18750a(i4)));
                                i4++;
                                it2 = it4;
                                boxes = list;
                            }
                            i2++;
                            i3 = i;
                            trackId = j2;
                            it = it3;
                            b = jArr;
                            movieFragmentBox = movieFragmentBox2;
                        }
                    }
                }
            }
            return;
        }
        C7309b c7309b2 = (C7309b) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schi[0]/tenc[0]");
        r0.defaultKeyId = c7309b2.getDefault_KID();
        ChunkOffsetBox chunkOffsetBox = (ChunkOffsetBox) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/stco[0]");
        if (chunkOffsetBox == null) {
            chunkOffsetBox = (ChunkOffsetBox) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]/co64[0]");
        }
        long[] blowup = trackBox.getSampleTableBox().getSampleToChunkBox().blowup(chunkOffsetBox.getChunkOffsets().length);
        FindSaioSaizPair invoke2 = new FindSaioSaizPair((Container) Path.getPath(abstractContainerBox, "mdia[0]/minf[0]/stbl[0]")).invoke();
        C7129a access$0 = invoke2.saio;
        Object access$1 = invoke2.saiz;
        Container parent2 = ((MovieBox) trackBox.getParent()).getParent();
        if (access$0.m18748b().length == 1) {
            int c;
            i = 0;
            long j4 = access$0.m18748b()[0];
            if (access$1.m18753b() > 0) {
                c = (access$1.m18755c() * access$1.m18753b()) + 0;
            } else {
                c = 0;
                int i5 = c;
                while (c < access$1.m18755c()) {
                    RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(C7130b.f20319c, access$1, access$1));
                    i5 += Arrays.copyOf(access$1.f20331a, access$1.f20331a.length)[c];
                    c++;
                }
                c = i5;
            }
            ByteBuffer byteBuffer2 = parent2.getByteBuffer(j4, (long) c);
            while (i < access$1.m18755c()) {
                r0.sampleEncryptionEntries.add(parseCencAuxDataFormat(c7309b2.getDefaultIvSize(), byteBuffer2, (long) access$1.m18750a(i)));
                i++;
            }
            return;
        }
        i = 0;
        if (access$0.m18748b().length == blowup.length) {
            size = 0;
            int i6 = size;
            while (size < blowup.length) {
                long c2;
                int i7;
                long j5 = access$0.m18748b()[size];
                if (access$1.m18753b() > 0) {
                    c2 = 0 + (((long) access$1.m18755c()) * blowup[size]);
                } else {
                    i7 = i;
                    c2 = 0;
                    while (((long) i7) < blowup[size]) {
                        i7++;
                        c2 += (long) access$1.m18750a(i6 + i7);
                        i = 0;
                    }
                }
                ByteBuffer byteBuffer3 = parent2.getByteBuffer(j5, c2);
                i7 = i;
                while (((long) i7) < blowup[size]) {
                    r0.sampleEncryptionEntries.add(parseCencAuxDataFormat(c7309b2.getDefaultIvSize(), byteBuffer3, (long) access$1.m18750a(i6 + i7)));
                    i7++;
                    i = 0;
                }
                i6 = (int) (((long) i6) + blowup[size]);
                size++;
            }
            return;
        }
        throw new RuntimeException("Number of saio offsets must be either 1 or number of chunks");
    }

    private C1613a parseCencAuxDataFormat(int i, ByteBuffer byteBuffer, long j) {
        C1613a c1613a = new C1613a();
        if (j > 0) {
            c1613a.f5048a = new byte[i];
            byteBuffer.get(c1613a.f5048a);
            if (j > ((long) i)) {
                c1613a.f5049b = new C1612j[IsoTypeReader.readUInt16(byteBuffer)];
                for (i = 0; i < c1613a.f5049b.length; i++) {
                    c1613a.f5049b[i] = c1613a.m4153a(IsoTypeReader.readUInt16(byteBuffer), IsoTypeReader.readUInt32(byteBuffer));
                }
                return c1613a;
            }
        }
        return c1613a;
    }

    public UUID getDefaultKeyId() {
        return this.defaultKeyId;
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("enc(");
        stringBuilder.append(super.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public List<C1613a> getSampleEncryptionEntries() {
        return this.sampleEncryptionEntries;
    }

    public boolean hasSubSampleEncryption() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CencMp4TrackImpl{handler='");
        stringBuilder.append(getHandler());
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
