package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SchemeTypeBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.cenc.CencDecryptingSampleList;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.CencSampleEncryptionInformationGroupEntry;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.GroupEntry;
import com.googlecode.mp4parser.util.Path;
import com.googlecode.mp4parser.util.RangeStartMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import javax.crypto.SecretKey;

public class CencDecryptingTrackImpl extends AbstractTrack {
    RangeStartMap<Integer, SecretKey> indexToKey;
    Track original;
    CencDecryptingSampleList samples;

    public CencDecryptingTrackImpl(CencEncryptedTrack cencEncryptedTrack, Map<UUID, SecretKey> map) {
        StringBuilder stringBuilder = new StringBuilder("dec(");
        stringBuilder.append(cencEncryptedTrack.getName());
        stringBuilder.append(")");
        super(stringBuilder.toString());
        this.indexToKey = new RangeStartMap();
        this.original = cencEncryptedTrack;
        SchemeTypeBox schemeTypeBox = (SchemeTypeBox) Path.getPath(cencEncryptedTrack.getSampleDescriptionBox(), "enc./sinf/schm");
        if ("cenc".equals(schemeTypeBox.getSchemeType()) || "cbc1".equals(schemeTypeBox.getSchemeType())) {
            List arrayList = new ArrayList();
            for (Entry entry : cencEncryptedTrack.getSampleGroups().entrySet()) {
                if (entry.getKey() instanceof CencSampleEncryptionInformationGroupEntry) {
                    arrayList.add((CencSampleEncryptionInformationGroupEntry) entry.getKey());
                } else {
                    getSampleGroups().put((GroupEntry) entry.getKey(), (long[]) entry.getValue());
                }
            }
            int i = -1;
            for (int i2 = 0; i2 < cencEncryptedTrack.getSamples().size(); i2++) {
                int i3 = 0;
                int i4 = i3;
                while (i3 < arrayList.size()) {
                    if (Arrays.binarySearch((long[]) cencEncryptedTrack.getSampleGroups().get((GroupEntry) arrayList.get(i3)), (long) i2) >= 0) {
                        i4 = i3 + 1;
                    }
                    i3++;
                }
                if (i != i4) {
                    RangeStartMap rangeStartMap;
                    Comparable valueOf;
                    Object obj;
                    if (i4 == 0) {
                        rangeStartMap = this.indexToKey;
                        valueOf = Integer.valueOf(i2);
                        obj = (SecretKey) map.get(cencEncryptedTrack.getDefaultKeyId());
                    } else {
                        i3 = i4 - 1;
                        if (((CencSampleEncryptionInformationGroupEntry) arrayList.get(i3)).isEncrypted()) {
                            Object obj2 = (SecretKey) map.get(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i3)).getKid());
                            if (obj2 == null) {
                                StringBuilder stringBuilder2 = new StringBuilder("Key ");
                                stringBuilder2.append(((CencSampleEncryptionInformationGroupEntry) arrayList.get(i3)).getKid());
                                stringBuilder2.append(" was not supplied for decryption");
                                throw new RuntimeException(stringBuilder2.toString());
                            }
                            this.indexToKey.put(Integer.valueOf(i2), obj2);
                            i = i4;
                        } else {
                            rangeStartMap = this.indexToKey;
                            valueOf = Integer.valueOf(i2);
                            obj = null;
                        }
                    }
                    rangeStartMap.put(valueOf, obj);
                    i = i4;
                }
            }
            this.samples = new CencDecryptingSampleList(this.indexToKey, cencEncryptedTrack.getSamples(), cencEncryptedTrack.getSampleEncryptionEntries(), schemeTypeBox.getSchemeType());
            return;
        }
        throw new RuntimeException("You can only use the CencDecryptingTrackImpl with CENC (cenc or cbc1) encrypted tracks");
    }

    public CencDecryptingTrackImpl(CencEncryptedTrack cencEncryptedTrack, SecretKey secretKey) {
        this(cencEncryptedTrack, Collections.singletonMap(cencEncryptedTrack.getDefaultKeyId(), secretKey));
    }

    public void close() {
        this.original.close();
    }

    public String getHandler() {
        return this.original.getHandler();
    }

    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r6.original;
        r0 = r0.getSampleDescriptionBox();
        r1 = "enc./sinf/frma";
        r0 = com.googlecode.mp4parser.util.Path.getPath(r0, r1);
        r0 = (com.coremedia.iso.boxes.OriginalFormatBox) r0;
        r1 = new java.io.ByteArrayOutputStream;
        r1.<init>();
        r2 = r6.original;	 Catch:{ IOException -> 0x00b5 }
        r2 = r2.getSampleDescriptionBox();	 Catch:{ IOException -> 0x00b5 }
        r3 = java.nio.channels.Channels.newChannel(r1);	 Catch:{ IOException -> 0x00b5 }
        r2.getBox(r3);	 Catch:{ IOException -> 0x00b5 }
        r2 = new com.coremedia.iso.IsoFile;	 Catch:{ IOException -> 0x00b5 }
        r3 = new com.googlecode.mp4parser.MemoryDataSourceImpl;	 Catch:{ IOException -> 0x00b5 }
        r1 = r1.toByteArray();	 Catch:{ IOException -> 0x00b5 }
        r3.<init>(r1);	 Catch:{ IOException -> 0x00b5 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x00b5 }
        r1 = r2.getBoxes();	 Catch:{ IOException -> 0x00b5 }
        r2 = 0;	 Catch:{ IOException -> 0x00b5 }
        r1 = r1.get(r2);	 Catch:{ IOException -> 0x00b5 }
        r1 = (com.coremedia.iso.boxes.SampleDescriptionBox) r1;	 Catch:{ IOException -> 0x00b5 }
        r2 = r1.getSampleEntry();
        r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
        if (r2 == 0) goto L_0x004f;
    L_0x0041:
        r2 = r1.getSampleEntry();
        r2 = (com.coremedia.iso.boxes.sampleentry.AudioSampleEntry) r2;
        r0 = r0.getDataFormat();
        r2.setType(r0);
        goto L_0x0064;
    L_0x004f:
        r2 = r1.getSampleEntry();
        r2 = r2 instanceof com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
        if (r2 == 0) goto L_0x0099;
    L_0x0057:
        r2 = r1.getSampleEntry();
        r2 = (com.coremedia.iso.boxes.sampleentry.VisualSampleEntry) r2;
        r0 = r0.getDataFormat();
        r2.setType(r0);
    L_0x0064:
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2 = r1.getSampleEntry();
        r2 = r2.getBoxes();
        r2 = r2.iterator();
    L_0x0075:
        r3 = r2.hasNext();
        if (r3 != 0) goto L_0x0083;
    L_0x007b:
        r2 = r1.getSampleEntry();
        r2.setBoxes(r0);
        return r1;
    L_0x0083:
        r3 = r2.next();
        r3 = (com.coremedia.iso.boxes.Box) r3;
        r4 = r3.getType();
        r5 = "sinf";
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x0075;
    L_0x0095:
        r0.add(r3);
        goto L_0x0075;
    L_0x0099:
        r0 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "I don't know ";
        r2.<init>(r3);
        r1 = r1.getSampleEntry();
        r1 = r1.getType();
        r2.append(r1);
        r1 = r2.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00b5:
        r0 = new java.lang.RuntimeException;
        r1 = "Dumping stsd to memory failed";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.CencDecryptingTrackImpl.getSampleDescriptionBox():com.coremedia.iso.boxes.SampleDescriptionBox");
    }

    public long[] getSampleDurations() {
        return this.original.getSampleDurations();
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public long[] getSyncSamples() {
        return this.original.getSyncSamples();
    }

    public TrackMetaData getTrackMetaData() {
        return this.original.getTrackMetaData();
    }
}
