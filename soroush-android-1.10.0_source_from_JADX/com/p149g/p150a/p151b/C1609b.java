package com.p149g.p150a.p151b;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitReaderBuffer;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BitWriterBuffer;
import com.googlecode.mp4parser.h264.model.PictureParameterSet;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C1609b {
    public int f5000a;
    public int f5001b;
    public int f5002c;
    public int f5003d;
    public int f5004e;
    public List<byte[]> f5005f;
    public List<byte[]> f5006g;
    public boolean f5007h;
    public int f5008i;
    public int f5009j;
    public int f5010k;
    public List<byte[]> f5011l;
    public int f5012m;
    public int f5013n;
    public int f5014o;
    public int f5015p;
    public int f5016q;

    public C1609b() {
        this.f5005f = new ArrayList();
        this.f5006g = new ArrayList();
        this.f5007h = true;
        this.f5008i = 1;
        this.f5009j = 0;
        this.f5010k = 0;
        this.f5011l = new ArrayList();
        this.f5012m = 63;
        this.f5013n = 7;
        this.f5014o = 31;
        this.f5015p = 31;
        this.f5016q = 31;
    }

    public C1609b(ByteBuffer byteBuffer) {
        this.f5005f = new ArrayList();
        this.f5006g = new ArrayList();
        this.f5007h = true;
        this.f5008i = 1;
        int i = 0;
        this.f5009j = 0;
        this.f5010k = 0;
        this.f5011l = new ArrayList();
        this.f5012m = 63;
        this.f5013n = 7;
        this.f5014o = 31;
        this.f5015p = 31;
        this.f5016q = 31;
        this.f5000a = IsoTypeReader.readUInt8(byteBuffer);
        this.f5001b = IsoTypeReader.readUInt8(byteBuffer);
        this.f5002c = IsoTypeReader.readUInt8(byteBuffer);
        this.f5003d = IsoTypeReader.readUInt8(byteBuffer);
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(byteBuffer);
        this.f5012m = bitReaderBuffer.readBits(6);
        this.f5004e = bitReaderBuffer.readBits(2);
        this.f5013n = bitReaderBuffer.readBits(3);
        int readBits = bitReaderBuffer.readBits(5);
        for (int i2 = 0; i2 < readBits; i2++) {
            Object obj = new byte[IsoTypeReader.readUInt16(byteBuffer)];
            byteBuffer.get(obj);
            this.f5005f.add(obj);
        }
        long readUInt8 = (long) IsoTypeReader.readUInt8(byteBuffer);
        for (readBits = 0; ((long) readBits) < readUInt8; readBits++) {
            Object obj2 = new byte[IsoTypeReader.readUInt16(byteBuffer)];
            byteBuffer.get(obj2);
            this.f5006g.add(obj2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f5007h = false;
        }
        if (this.f5007h && (this.f5001b == 100 || this.f5001b == 110 || this.f5001b == IjkMediaMeta.FF_PROFILE_H264_HIGH_422 || this.f5001b == IjkMediaMeta.FF_PROFILE_H264_HIGH_444)) {
            bitReaderBuffer = new BitReaderBuffer(byteBuffer);
            this.f5014o = bitReaderBuffer.readBits(6);
            this.f5008i = bitReaderBuffer.readBits(2);
            this.f5015p = bitReaderBuffer.readBits(5);
            this.f5009j = bitReaderBuffer.readBits(3);
            this.f5016q = bitReaderBuffer.readBits(5);
            this.f5010k = bitReaderBuffer.readBits(3);
            long readUInt82 = (long) IsoTypeReader.readUInt8(byteBuffer);
            while (((long) i) < readUInt82) {
                Object obj3 = new byte[IsoTypeReader.readUInt16(byteBuffer)];
                byteBuffer.get(obj3);
                this.f5011l.add(obj3);
                i++;
            }
            return;
        }
        this.f5008i = -1;
        this.f5009j = -1;
        this.f5010k = -1;
    }

    public final long m4144a() {
        long j = 6;
        for (byte[] length : this.f5005f) {
            j = (j + 2) + ((long) length.length);
        }
        long j2 = j + 1;
        for (byte[] length2 : this.f5006g) {
            j2 = (j2 + 2) + ((long) length2.length);
        }
        if (!this.f5007h || (this.f5001b != 100 && this.f5001b != 110 && this.f5001b != IjkMediaMeta.FF_PROFILE_H264_HIGH_422 && this.f5001b != IjkMediaMeta.FF_PROFILE_H264_HIGH_444)) {
            return j2;
        }
        long j3 = j2 + 4;
        j2 = j3;
        for (byte[] length3 : this.f5011l) {
            j2 = (j2 + 2) + ((long) length3.length);
        }
        return j2;
    }

    public final void m4145a(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeUInt8(byteBuffer, this.f5000a);
        IsoTypeWriter.writeUInt8(byteBuffer, this.f5001b);
        IsoTypeWriter.writeUInt8(byteBuffer, this.f5002c);
        IsoTypeWriter.writeUInt8(byteBuffer, this.f5003d);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBuffer);
        bitWriterBuffer.writeBits(this.f5012m, 6);
        bitWriterBuffer.writeBits(this.f5004e, 2);
        bitWriterBuffer.writeBits(this.f5013n, 3);
        bitWriterBuffer.writeBits(this.f5006g.size(), 5);
        for (byte[] bArr : this.f5005f) {
            IsoTypeWriter.writeUInt16(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        IsoTypeWriter.writeUInt8(byteBuffer, this.f5006g.size());
        for (byte[] bArr2 : this.f5006g) {
            IsoTypeWriter.writeUInt16(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f5007h && (this.f5001b == 100 || this.f5001b == 110 || this.f5001b == IjkMediaMeta.FF_PROFILE_H264_HIGH_422 || this.f5001b == IjkMediaMeta.FF_PROFILE_H264_HIGH_444)) {
            bitWriterBuffer = new BitWriterBuffer(byteBuffer);
            bitWriterBuffer.writeBits(this.f5014o, 6);
            bitWriterBuffer.writeBits(this.f5008i, 2);
            bitWriterBuffer.writeBits(this.f5015p, 5);
            bitWriterBuffer.writeBits(this.f5009j, 3);
            bitWriterBuffer.writeBits(this.f5016q, 5);
            bitWriterBuffer.writeBits(this.f5010k, 3);
            for (byte[] bArr3 : this.f5011l) {
                IsoTypeWriter.writeUInt16(byteBuffer, bArr3.length);
                byteBuffer.put(bArr3);
            }
        }
    }

    public final String[] m4146b() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f5006g) {
            try {
                arrayList.add(PictureParameterSet.read(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final java.lang.String[] m4147c() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r8 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r8.f5005f;
        r1 = r1.iterator();
    L_0x000b:
        r2 = r1.hasNext();
        if (r2 != 0) goto L_0x001e;
    L_0x0011:
        r1 = r0.size();
        r1 = new java.lang.String[r1];
        r0 = r0.toArray(r1);
        r0 = (java.lang.String[]) r0;
        return r0;
    L_0x001e:
        r2 = r1.next();
        r2 = (byte[]) r2;
        r3 = "not parsable";
        r4 = new com.googlecode.mp4parser.authoring.tracks.CleanInputStream;	 Catch:{ IOException -> 0x003c }
        r5 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x003c }
        r6 = r2.length;	 Catch:{ IOException -> 0x003c }
        r7 = 1;	 Catch:{ IOException -> 0x003c }
        r6 = r6 - r7;	 Catch:{ IOException -> 0x003c }
        r5.<init>(r2, r7, r6);	 Catch:{ IOException -> 0x003c }
        r4.<init>(r5);	 Catch:{ IOException -> 0x003c }
        r2 = com.googlecode.mp4parser.h264.model.SeqParameterSet.read(r4);	 Catch:{ IOException -> 0x003c }
        r2 = r2.toString();	 Catch:{ IOException -> 0x003c }
        goto L_0x003d;
    L_0x003c:
        r2 = r3;
    L_0x003d:
        r0.add(r2);
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.g.a.b.b.c():java.lang.String[]");
    }

    public final List<String> m4148d() {
        List<String> arrayList = new ArrayList(this.f5005f.size());
        for (byte[] encodeHex : this.f5005f) {
            arrayList.add(Hex.encodeHex(encodeHex));
        }
        return arrayList;
    }

    public final List<String> m4149e() {
        List<String> arrayList = new ArrayList(this.f5006g.size());
        for (byte[] encodeHex : this.f5006g) {
            arrayList.add(Hex.encodeHex(encodeHex));
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AvcDecoderConfigurationRecord{configurationVersion=");
        stringBuilder.append(this.f5000a);
        stringBuilder.append(", avcProfileIndication=");
        stringBuilder.append(this.f5001b);
        stringBuilder.append(", profileCompatibility=");
        stringBuilder.append(this.f5002c);
        stringBuilder.append(", avcLevelIndication=");
        stringBuilder.append(this.f5003d);
        stringBuilder.append(", lengthSizeMinusOne=");
        stringBuilder.append(this.f5004e);
        stringBuilder.append(", hasExts=");
        stringBuilder.append(this.f5007h);
        stringBuilder.append(", chromaFormat=");
        stringBuilder.append(this.f5008i);
        stringBuilder.append(", bitDepthLumaMinus8=");
        stringBuilder.append(this.f5009j);
        stringBuilder.append(", bitDepthChromaMinus8=");
        stringBuilder.append(this.f5010k);
        stringBuilder.append(", lengthSizeMinusOnePaddingBits=");
        stringBuilder.append(this.f5012m);
        stringBuilder.append(", numberOfSequenceParameterSetsPaddingBits=");
        stringBuilder.append(this.f5013n);
        stringBuilder.append(", chromaFormatPaddingBits=");
        stringBuilder.append(this.f5014o);
        stringBuilder.append(", bitDepthLumaMinus8PaddingBits=");
        stringBuilder.append(this.f5015p);
        stringBuilder.append(", bitDepthChromaMinus8PaddingBits=");
        stringBuilder.append(this.f5016q);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
