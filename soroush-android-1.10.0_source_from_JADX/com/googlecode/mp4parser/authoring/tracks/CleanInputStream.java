package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.InputStream;

public class CleanInputStream extends FilterInputStream {
    int prev = -1;
    int prevprev = -1;

    public CleanInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int read = super.read();
        if (read == 3 && this.prevprev == 0 && this.prev == 0) {
            this.prevprev = -1;
            this.prev = -1;
            read = super.read();
        }
        this.prevprev = this.prev;
        this.prev = read;
        return read;
    }

    public int read(byte[] r5, int r6, int r7) {
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
        r4 = this;
        if (r5 != 0) goto L_0x0008;
    L_0x0002:
        r5 = new java.lang.NullPointerException;
        r5.<init>();
        throw r5;
    L_0x0008:
        if (r6 < 0) goto L_0x0033;
    L_0x000a:
        if (r7 < 0) goto L_0x0033;
    L_0x000c:
        r0 = r5.length;
        r0 = r0 - r6;
        if (r7 <= r0) goto L_0x0011;
    L_0x0010:
        goto L_0x0033;
    L_0x0011:
        if (r7 != 0) goto L_0x0015;
    L_0x0013:
        r5 = 0;
        return r5;
    L_0x0015:
        r0 = r4.read();
        r1 = -1;
        if (r0 != r1) goto L_0x001d;
    L_0x001c:
        return r1;
    L_0x001d:
        r0 = (byte) r0;
        r5[r6] = r0;
        r0 = 1;
    L_0x0021:
        if (r0 < r7) goto L_0x0024;
    L_0x0023:
        return r0;
    L_0x0024:
        r2 = r4.read();	 Catch:{ IOException -> 0x0032 }
        if (r2 == r1) goto L_0x0032;	 Catch:{ IOException -> 0x0032 }
    L_0x002a:
        r3 = r6 + r0;	 Catch:{ IOException -> 0x0032 }
        r2 = (byte) r2;	 Catch:{ IOException -> 0x0032 }
        r5[r3] = r2;	 Catch:{ IOException -> 0x0032 }
        r0 = r0 + 1;
        goto L_0x0021;
    L_0x0032:
        return r0;
    L_0x0033:
        r5 = new java.lang.IndexOutOfBoundsException;
        r5.<init>();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.tracks.CleanInputStream.read(byte[], int, int):int");
    }
}
