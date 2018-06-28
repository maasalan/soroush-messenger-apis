package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.CompositionTimeToSample.Entry;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry.BoxRecord;
import com.coremedia.iso.boxes.sampleentry.TextSampleEntry.StyleRecord;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox;
import com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox.FontRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TextTrackImpl extends AbstractTrack {
    SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
    List<Line> subs = new LinkedList();
    TrackMetaData trackMetaData = new TrackMetaData();

    public static class Line {
        long from;
        String text;
        long to;

        public Line(long j, long j2, String str) {
            this.from = j;
            this.to = j2;
            this.text = str;
        }

        public long getFrom() {
            return this.from;
        }

        public String getText() {
            return this.text;
        }

        public long getTo() {
            return this.to;
        }
    }

    public TextTrackImpl() {
        super("subtiles");
        Object textSampleEntry = new TextSampleEntry(TextSampleEntry.TYPE1);
        textSampleEntry.setDataReferenceIndex(1);
        textSampleEntry.setStyleRecord(new StyleRecord());
        textSampleEntry.setBoxRecord(new BoxRecord());
        this.sampleDescriptionBox.addBox(textSampleEntry);
        Box fontTableBox = new FontTableBox();
        fontTableBox.setEntries(Collections.singletonList(new FontRecord(1, "Serif")));
        textSampleEntry.addBox(fontTableBox);
        this.trackMetaData.setCreationTime(new Date());
        this.trackMetaData.setModificationTime(new Date());
        this.trackMetaData.setTimescale(1000);
    }

    public void close() {
    }

    public List<Entry> getCompositionTimeEntries() {
        return null;
    }

    public String getHandler() {
        return "sbtl";
    }

    public List<SampleDependencyTypeBox.Entry> getSampleDependencies() {
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        List<Long> arrayList = new ArrayList();
        long j = 0;
        for (Line line : this.subs) {
            long j2 = line.from - j;
            if (j2 > 0) {
                arrayList.add(Long.valueOf(j2));
            } else if (j2 < 0) {
                throw new Error("Subtitle display times may not intersect");
            }
            arrayList.add(Long.valueOf(line.to - line.from));
            j = line.to;
        }
        long[] jArr = new long[arrayList.size()];
        int i = 0;
        for (Long longValue : arrayList) {
            int i2 = i + 1;
            jArr[i] = longValue.longValue();
            i = i2;
        }
        return jArr;
    }

    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r11 = this;
        r0 = new java.util.LinkedList;
        r0.<init>();
        r1 = r11.subs;
        r1 = r1.iterator();
        r2 = 0;
        r4 = r2;
    L_0x000e:
        r6 = r1.hasNext();
        if (r6 != 0) goto L_0x0015;
    L_0x0014:
        return r0;
    L_0x0015:
        r6 = r1.next();
        r6 = (com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.Line) r6;
        r7 = r6.from;
        r9 = r7 - r4;
        r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0033;
    L_0x0023:
        r4 = new com.googlecode.mp4parser.authoring.SampleImpl;
        r5 = 2;
        r5 = new byte[r5];
        r5 = java.nio.ByteBuffer.wrap(r5);
        r4.<init>(r5);
        r0.add(r4);
        goto L_0x003f;
    L_0x0033:
        r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x003f;
    L_0x0037:
        r0 = new java.lang.Error;
        r1 = "Subtitle display times may not intersect";
        r0.<init>(r1);
        throw r0;
    L_0x003f:
        r4 = new java.io.ByteArrayOutputStream;
        r4.<init>();
        r5 = new java.io.DataOutputStream;
        r5.<init>(r4);
        r7 = r6.text;	 Catch:{ IOException -> 0x0076 }
        r8 = "UTF-8";	 Catch:{ IOException -> 0x0076 }
        r7 = r7.getBytes(r8);	 Catch:{ IOException -> 0x0076 }
        r7 = r7.length;	 Catch:{ IOException -> 0x0076 }
        r5.writeShort(r7);	 Catch:{ IOException -> 0x0076 }
        r7 = r6.text;	 Catch:{ IOException -> 0x0076 }
        r8 = "UTF-8";	 Catch:{ IOException -> 0x0076 }
        r7 = r7.getBytes(r8);	 Catch:{ IOException -> 0x0076 }
        r5.write(r7);	 Catch:{ IOException -> 0x0076 }
        r5.close();	 Catch:{ IOException -> 0x0076 }
        r5 = new com.googlecode.mp4parser.authoring.SampleImpl;
        r4 = r4.toByteArray();
        r4 = java.nio.ByteBuffer.wrap(r4);
        r5.<init>(r4);
        r0.add(r5);
        r4 = r6.to;
        goto L_0x000e;
    L_0x0076:
        r0 = new java.lang.Error;
        r1 = "VM is broken. Does not support UTF-8";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.TextTrackImpl.getSamples():java.util.List<com.googlecode.mp4parser.authoring.Sample>");
    }

    public List<Line> getSubs() {
        return this.subs;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return null;
    }

    public long[] getSyncSamples() {
        return null;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
