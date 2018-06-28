package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.IsoTypeReaderVariable;
import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.authoring.Edit;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencEncryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.CastUtils;
import com.googlecode.mp4parser.util.RangeStartMap;
import com.p149g.p150a.p151b.C6533a;
import com.p149g.p150a.p151b.C6534c;
import com.p149g.p152b.p153a.C1613a;
import com.p149g.p152b.p153a.C1613a.C1612j;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import javax.crypto.SecretKey;
import org.p487a.p490b.p492b.C4600b;

public class CencEncryptingTrackImpl implements CencEncryptedTrack {
    List<C1613a> cencSampleAuxiliaryData;
    UUID defaultKeyId;
    boolean dummyIvs;
    private final String encryptionAlgo;
    RangeStartMap<Integer, SecretKey> indexToKey;
    Map<UUID, SecretKey> keys;
    Map<GroupEntry, long[]> sampleGroups;
    List<Sample> samples;
    Track source;
    SampleDescriptionBox stsd;
    boolean subSampleEncryption;

    public CencEncryptingTrackImpl(Track track, UUID uuid, Map<UUID, SecretKey> map, Map<CencSampleEncryptionInformationGroupEntry, long[]> map2, String str, boolean z) {
        this(track, uuid, map, map2, str, z, false);
    }

    public CencEncryptingTrackImpl(Track track, UUID uuid, Map<UUID, SecretKey> map, Map<CencSampleEncryptionInformationGroupEntry, long[]> map2, String str, boolean z, boolean z2) {
        UUID uuid2 = uuid;
        Map<UUID, SecretKey> map3 = map;
        boolean z3 = z;
        this.keys = new HashMap();
        int i = 0;
        this.dummyIvs = false;
        this.subSampleEncryption = false;
        SampleDescriptionBox sampleDescriptionBox = null;
        this.stsd = null;
        this.source = track;
        this.keys = map3;
        this.defaultKeyId = uuid2;
        this.dummyIvs = z3;
        this.encryptionAlgo = str;
        this.sampleGroups = new HashMap();
        for (Entry entry : track.getSampleGroups().entrySet()) {
            if (!(entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry)) {
                r0.sampleGroups.put((GroupEntry) entry.getKey(), (long[]) entry.getValue());
            }
            i = 0;
            sampleDescriptionBox = null;
        }
        if (map2 != null) {
            for (Entry entry2 : map2.entrySet()) {
                r0.sampleGroups.put((GroupEntry) entry2.getKey(), (long[]) entry2.getValue());
            }
        }
        r0.sampleGroups = new HashMap<GroupEntry, long[]>(r0.sampleGroups) {
            public long[] put(GroupEntry groupEntry, long[] jArr) {
                if (!(groupEntry instanceof CencSampleEncryptionInformationGroupEntry)) {
                    return (long[]) super.put(groupEntry, jArr);
                }
                throw new RuntimeException("Please supply CencSampleEncryptionInformationGroupEntries in the constructor");
            }
        };
        r0.samples = track.getSamples();
        r0.cencSampleAuxiliaryData = new ArrayList();
        BigInteger bigInteger = new BigInteger("1");
        int i2 = 8;
        byte[] bArr = new byte[8];
        if (!z3) {
            new SecureRandom().nextBytes(bArr);
        }
        int i3 = 1;
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        List arrayList = new ArrayList();
        if (map2 != null) {
            arrayList.addAll(map2.keySet());
        }
        r0.indexToKey = new RangeStartMap();
        int i4 = -1;
        int i5 = i;
        int i6 = -1;
        while (i5 < track.getSamples().size()) {
            Object obj;
            int i7 = i;
            int i8 = i7;
            while (i7 < arrayList.size()) {
                BigInteger bigInteger3 = bigInteger2;
                if (Arrays.binarySearch((long[]) getSampleGroups().get((GroupEntry) arrayList.get(i7)), (long) i5) >= 0) {
                    i8 = i7 + 1;
                }
                i7++;
                bigInteger2 = bigInteger3;
                sampleDescriptionBox = null;
                i2 = 8;
            }
            if (i6 != i8) {
                if (i8 == 0) {
                    r0.indexToKey.put(Integer.valueOf(i5), (SecretKey) map3.get(uuid2));
                } else {
                    i6 = i8 - 1;
                    if (((CencSampleEncryptionInformationGroupEntry) arrayList.get(i6)).getKid() != null) {
                        obj = (SecretKey) map3.get(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i6)).getKid());
                        if (obj == null) {
                            StringBuilder stringBuilder = new StringBuilder("Key ");
                            stringBuilder.append(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i6)).getKid());
                            stringBuilder.append(" was not supplied for decryption");
                            throw new RuntimeException(stringBuilder.toString());
                        }
                        r0.indexToKey.put(Integer.valueOf(i5), obj);
                    } else {
                        Object obj2;
                        r0.indexToKey.put(Integer.valueOf(i5), obj2);
                    }
                }
                i6 = i8;
            }
            i5++;
            i = 0;
        }
        for (Box box : track.getSampleDescriptionBox().getSampleEntry().getBoxes()) {
            if (box instanceof C6533a) {
                C6533a c6533a = (C6533a) box;
                i3 = 1;
                r0.subSampleEncryption = true;
                i4 = c6533a.m15775a() + 1;
            } else {
                i3 = 1;
            }
            if (box instanceof C6534c) {
                Object obj3 = (C6534c) box;
                r0.subSampleEncryption = i3;
                RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(C6534c.f17845b, obj3, obj3));
                i4 = obj3.f17867a.f5043v + 1;
            }
        }
        int i9 = i;
        while (i9 < r0.samples.size()) {
            Sample sample = (Sample) r0.samples.get(i9);
            C1613a c1613a = new C1613a();
            r0.cencSampleAuxiliaryData.add(c1613a);
            if (r0.indexToKey.get(Integer.valueOf(i9)) != null) {
                obj = bigInteger2.toByteArray();
                obj2 = new byte[i2];
                System.arraycopy(obj, obj.length - i2 > 0 ? obj.length - i2 : i, obj2, 8 - obj.length < 0 ? i : 8 - obj.length, obj.length > i2 ? i2 : obj.length);
                c1613a.f5048a = obj2;
                ByteBuffer byteBuffer = (ByteBuffer) sample.asByteBuffer().rewind();
                if (r0.subSampleEncryption) {
                    if (z2) {
                        C1612j[] c1612jArr = new C1612j[i3];
                        c1612jArr[i] = c1613a.m4153a(byteBuffer.remaining(), 0);
                        c1613a.f5049b = c1612jArr;
                    } else {
                        List arrayList2 = new ArrayList(5);
                        while (byteBuffer.remaining() > 0) {
                            int l2i = CastUtils.l2i(IsoTypeReaderVariable.read(byteBuffer, i4));
                            int i10 = l2i + i4;
                            i8 = i10 >= 112 ? 96 + (i10 % 16) : i10;
                            arrayList2.add(c1613a.m4153a(i8, (long) (i10 - i8)));
                            byteBuffer.position(byteBuffer.position() + l2i);
                        }
                        c1613a.f5049b = (C1612j[]) arrayList2.toArray(new C1612j[arrayList2.size()]);
                    }
                }
                bigInteger2 = bigInteger2.add(bigInteger);
            }
            i9++;
            i3 = 1;
        }
        System.err.println("");
    }

    public CencEncryptingTrackImpl(Track track, UUID uuid, SecretKey secretKey, boolean z) {
        this(track, uuid, Collections.singletonMap(uuid, secretKey), null, "cenc", z);
    }

    public void close() {
        this.source.close();
    }

    public List<CompositionTimeToSample.Entry> getCompositionTimeEntries() {
        return this.source.getCompositionTimeEntries();
    }

    public UUID getDefaultKeyId() {
        return this.defaultKeyId;
    }

    public long getDuration() {
        return this.source.getDuration();
    }

    public List<Edit> getEdits() {
        return this.source.getEdits();
    }

    public String getHandler() {
        return this.source.getHandler();
    }

    public String getName() {
        StringBuilder stringBuilder = new StringBuilder("enc(");
        stringBuilder.append(this.source.getName());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return this.source.getSampleDependencies();
    }

    public synchronized com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        if (r0 != 0) goto L_0x00f2;	 Catch:{ all -> 0x00f6 }
    L_0x0005:
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x00f6 }
        r0.<init>();	 Catch:{ all -> 0x00f6 }
        r1 = r6.source;	 Catch:{ IOException -> 0x00ea }
        r1 = r1.getSampleDescriptionBox();	 Catch:{ IOException -> 0x00ea }
        r2 = java.nio.channels.Channels.newChannel(r0);	 Catch:{ IOException -> 0x00ea }
        r1.getBox(r2);	 Catch:{ IOException -> 0x00ea }
        r1 = new com.coremedia.iso.IsoFile;	 Catch:{ IOException -> 0x00ea }
        r2 = new com.googlecode.mp4parser.MemoryDataSourceImpl;	 Catch:{ IOException -> 0x00ea }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x00ea }
        r2.<init>(r0);	 Catch:{ IOException -> 0x00ea }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00ea }
        r0 = r1.getBoxes();	 Catch:{ IOException -> 0x00ea }
        r1 = 0;	 Catch:{ IOException -> 0x00ea }
        r0 = r0.get(r1);	 Catch:{ IOException -> 0x00ea }
        r0 = (com.coremedia.iso.boxes.SampleDescriptionBox) r0;	 Catch:{ IOException -> 0x00ea }
        r6.stsd = r0;	 Catch:{ IOException -> 0x00ea }
        r0 = new com.coremedia.iso.boxes.OriginalFormatBox;	 Catch:{ all -> 0x00f6 }
        r0.<init>();	 Catch:{ all -> 0x00f6 }
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = r2.getType();	 Catch:{ all -> 0x00f6 }
        r0.setDataFormat(r2);	 Catch:{ all -> 0x00f6 }
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;	 Catch:{ all -> 0x00f6 }
        if (r2 == 0) goto L_0x005c;	 Catch:{ all -> 0x00f6 }
    L_0x004e:
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r2;	 Catch:{ all -> 0x00f6 }
        r3 = "enca";	 Catch:{ all -> 0x00f6 }
        r2.setType(r3);	 Catch:{ all -> 0x00f6 }
        goto L_0x0073;	 Catch:{ all -> 0x00f6 }
    L_0x005c:
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;	 Catch:{ all -> 0x00f6 }
        if (r2 == 0) goto L_0x00cc;	 Catch:{ all -> 0x00f6 }
    L_0x0066:
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r2;	 Catch:{ all -> 0x00f6 }
        r3 = "encv";	 Catch:{ all -> 0x00f6 }
        r2.setType(r3);	 Catch:{ all -> 0x00f6 }
    L_0x0073:
        r2 = new com.coremedia.iso.boxes.ProtectionSchemeInformationBox;	 Catch:{ all -> 0x00f6 }
        r2.<init>();	 Catch:{ all -> 0x00f6 }
        r2.addBox(r0);	 Catch:{ all -> 0x00f6 }
        r0 = new com.coremedia.iso.boxes.SchemeTypeBox;	 Catch:{ all -> 0x00f6 }
        r0.<init>();	 Catch:{ all -> 0x00f6 }
        r3 = r6.encryptionAlgo;	 Catch:{ all -> 0x00f6 }
        r0.setSchemeType(r3);	 Catch:{ all -> 0x00f6 }
        r3 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;	 Catch:{ all -> 0x00f6 }
        r0.setSchemeVersion(r3);	 Catch:{ all -> 0x00f6 }
        r2.addBox(r0);	 Catch:{ all -> 0x00f6 }
        r0 = new com.coremedia.iso.boxes.SchemeInformationBox;	 Catch:{ all -> 0x00f6 }
        r0.<init>();	 Catch:{ all -> 0x00f6 }
        r3 = new com.g.b.a.b;	 Catch:{ all -> 0x00f6 }
        r3.<init>();	 Catch:{ all -> 0x00f6 }
        r4 = r6.defaultKeyId;	 Catch:{ all -> 0x00f6 }
        if (r4 != 0) goto L_0x009d;	 Catch:{ all -> 0x00f6 }
    L_0x009b:
        r4 = r1;	 Catch:{ all -> 0x00f6 }
        goto L_0x009f;	 Catch:{ all -> 0x00f6 }
    L_0x009d:
        r4 = 8;	 Catch:{ all -> 0x00f6 }
    L_0x009f:
        r3.setDefaultIvSize(r4);	 Catch:{ all -> 0x00f6 }
        r4 = r6.defaultKeyId;	 Catch:{ all -> 0x00f6 }
        if (r4 != 0) goto L_0x00a7;	 Catch:{ all -> 0x00f6 }
    L_0x00a6:
        goto L_0x00a8;	 Catch:{ all -> 0x00f6 }
    L_0x00a7:
        r1 = 1;	 Catch:{ all -> 0x00f6 }
    L_0x00a8:
        r3.setDefaultAlgorithmId(r1);	 Catch:{ all -> 0x00f6 }
        r1 = r6.defaultKeyId;	 Catch:{ all -> 0x00f6 }
        if (r1 != 0) goto L_0x00b7;	 Catch:{ all -> 0x00f6 }
    L_0x00af:
        r1 = new java.util.UUID;	 Catch:{ all -> 0x00f6 }
        r4 = 0;	 Catch:{ all -> 0x00f6 }
        r1.<init>(r4, r4);	 Catch:{ all -> 0x00f6 }
        goto L_0x00b9;	 Catch:{ all -> 0x00f6 }
    L_0x00b7:
        r1 = r6.defaultKeyId;	 Catch:{ all -> 0x00f6 }
    L_0x00b9:
        r3.setDefault_KID(r1);	 Catch:{ all -> 0x00f6 }
        r0.addBox(r3);	 Catch:{ all -> 0x00f6 }
        r2.addBox(r0);	 Catch:{ all -> 0x00f6 }
        r0 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r0 = r0.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r0.addBox(r2);	 Catch:{ all -> 0x00f6 }
        goto L_0x00f2;	 Catch:{ all -> 0x00f6 }
    L_0x00cc:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00f6 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f6 }
        r2 = "I don't know how to cenc ";	 Catch:{ all -> 0x00f6 }
        r1.<init>(r2);	 Catch:{ all -> 0x00f6 }
        r2 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        r2 = r2.getSampleEntry();	 Catch:{ all -> 0x00f6 }
        r2 = r2.getType();	 Catch:{ all -> 0x00f6 }
        r1.append(r2);	 Catch:{ all -> 0x00f6 }
        r1 = r1.toString();	 Catch:{ all -> 0x00f6 }
        r0.<init>(r1);	 Catch:{ all -> 0x00f6 }
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x00ea:
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00f6 }
        r1 = "Dumping stsd to memory failed";	 Catch:{ all -> 0x00f6 }
        r0.<init>(r1);	 Catch:{ all -> 0x00f6 }
        throw r0;	 Catch:{ all -> 0x00f6 }
    L_0x00f2:
        r0 = r6.stsd;	 Catch:{ all -> 0x00f6 }
        monitor-exit(r6);
        return r0;
    L_0x00f6:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.CencEncryptingTrackImpl.getSampleDescriptionBox():com.coremedia.iso.boxes.SampleDescriptionBox");
    }

    public long[] getSampleDurations() {
        return this.source.getSampleDurations();
    }

    public List<C1613a> getSampleEncryptionEntries() {
        return this.cencSampleAuxiliaryData;
    }

    public Map<GroupEntry, long[]> getSampleGroups() {
        return this.sampleGroups;
    }

    public List<Sample> getSamples() {
        return new CencEncryptingSampleList(this.indexToKey, this.source.getSamples(), this.cencSampleAuxiliaryData, this.encryptionAlgo);
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.source.getSubsampleInformationBox();
    }

    public long[] getSyncSamples() {
        return this.source.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData() {
        return this.source.getTrackMetaData();
    }

    public boolean hasSubSampleEncryption() {
        return this.subSampleEncryption;
    }
}
