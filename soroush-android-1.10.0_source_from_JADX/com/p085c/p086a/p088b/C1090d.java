package com.p085c.p086a.p088b;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class C1090d {
    public final byte[] f3581a = new byte[256];
    public ByteBuffer f3582b;
    public C1089c f3583c;
    public int f3584d = 0;

    private int[] m2647a(int i) {
        int[] iArr;
        Throwable e;
        byte[] bArr = new byte[(3 * i)];
        try {
            this.f3582b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((((bArr[i3] & 255) << 16) | -16777216) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e2) {
                    e = e2;
                }
            }
        } catch (BufferUnderflowException e3) {
            e = e3;
            iArr = null;
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f3583c.f3569b = 1;
            return iArr;
        }
        return iArr;
    }

    private void m2648d() {
        do {
            m2650f();
            if (this.f3581a[0] == (byte) 1) {
                this.f3583c.f3580m = (this.f3581a[1] & 255) | ((this.f3581a[2] & 255) << 8);
            }
            if (this.f3584d <= 0) {
                return;
            }
        } while (!m2654c());
    }

    private void m2649e() {
        int g;
        do {
            g = m2651g();
            this.f3582b.position(Math.min(this.f3582b.position() + g, this.f3582b.limit()));
        } while (g > 0);
    }

    private int m2650f() {
        this.f3584d = m2651g();
        int i = 0;
        if (this.f3584d > 0) {
            int i2 = 0;
            while (i < this.f3584d) {
                try {
                    i2 = this.f3584d - i;
                    this.f3582b.get(this.f3581a, i, i2);
                    i += i2;
                } catch (Throwable e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder stringBuilder = new StringBuilder("Error Reading Block n: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" count: ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" blockSize: ");
                        stringBuilder.append(this.f3584d);
                        Log.d("GifHeaderParser", stringBuilder.toString(), e);
                    }
                    this.f3583c.f3569b = 1;
                }
            }
        }
        return i;
    }

    private int m2651g() {
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
        r2 = this;
        r0 = r2.f3582b;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        return r0;
    L_0x0009:
        r0 = r2.f3583c;
        r1 = 1;
        r0.f3569b = r1;
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.b.d.g():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m2652a() {
        /*
        r9 = this;
        r0 = 0;
        r1 = 1;
        r2 = r0;
    L_0x0003:
        if (r2 != 0) goto L_0x0163;
    L_0x0005:
        r3 = r9.m2654c();
        if (r3 != 0) goto L_0x0163;
    L_0x000b:
        r3 = r9.f3583c;
        r3 = r3.f3570c;
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r3 > r4) goto L_0x0163;
    L_0x0014:
        r3 = r9.m2651g();
        r4 = 33;
        if (r3 == r4) goto L_0x00cc;
    L_0x001c:
        r4 = 44;
        if (r3 == r4) goto L_0x002b;
    L_0x0020:
        r4 = 59;
        if (r3 == r4) goto L_0x0029;
    L_0x0024:
        r3 = r9.f3583c;
        r3.f3569b = r1;
        goto L_0x0003;
    L_0x0029:
        r2 = r1;
        goto L_0x0003;
    L_0x002b:
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        if (r3 != 0) goto L_0x003a;
    L_0x0031:
        r3 = r9.f3583c;
        r4 = new com.c.a.b.b;
        r4.<init>();
        r3.f3571d = r4;
    L_0x003a:
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.f3582b;
        r4 = r4.getShort();
        r3.f3557a = r4;
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.f3582b;
        r4 = r4.getShort();
        r3.f3558b = r4;
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.f3582b;
        r4 = r4.getShort();
        r3.f3559c = r4;
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.f3582b;
        r4 = r4.getShort();
        r3.f3560d = r4;
        r3 = r9.m2651g();
        r4 = r3 & 128;
        if (r4 == 0) goto L_0x0074;
    L_0x0072:
        r4 = r1;
        goto L_0x0075;
    L_0x0074:
        r4 = r0;
    L_0x0075:
        r5 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r7 = r3 & 7;
        r7 = r7 + r1;
        r7 = (double) r7;
        r5 = java.lang.Math.pow(r5, r7);
        r5 = (int) r5;
        r6 = r9.f3583c;
        r6 = r6.f3571d;
        r3 = r3 & 64;
        if (r3 == 0) goto L_0x008a;
    L_0x0088:
        r3 = r1;
        goto L_0x008b;
    L_0x008a:
        r3 = r0;
    L_0x008b:
        r6.f3561e = r3;
        if (r4 == 0) goto L_0x009a;
    L_0x008f:
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.m2647a(r5);
    L_0x0097:
        r3.f3567k = r4;
        goto L_0x00a0;
    L_0x009a:
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = 0;
        goto L_0x0097;
    L_0x00a0:
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.f3582b;
        r4 = r4.position();
        r3.f3566j = r4;
        r9.m2651g();
        r9.m2649e();
        r3 = r9.m2654c();
        if (r3 != 0) goto L_0x0003;
    L_0x00b8:
        r3 = r9.f3583c;
        r4 = r3.f3570c;
        r4 = r4 + r1;
        r3.f3570c = r4;
        r3 = r9.f3583c;
        r3 = r3.f3572e;
        r4 = r9.f3583c;
        r4 = r4.f3571d;
        r3.add(r4);
        goto L_0x0003;
    L_0x00cc:
        r3 = r9.m2651g();
        if (r3 == r1) goto L_0x00d9;
    L_0x00d2:
        r4 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        if (r3 == r4) goto L_0x010d;
    L_0x00d6:
        switch(r3) {
            case 254: goto L_0x00d9;
            case 255: goto L_0x00de;
            default: goto L_0x00d9;
        };
    L_0x00d9:
        r9.m2649e();
        goto L_0x0003;
    L_0x00de:
        r9.m2650f();
        r3 = "";
        r4 = r3;
        r3 = r0;
    L_0x00e5:
        r5 = 11;
        if (r3 >= r5) goto L_0x0100;
    L_0x00e9:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r4 = r9.f3581a;
        r4 = r4[r3];
        r4 = (char) r4;
        r5.append(r4);
        r4 = r5.toString();
        r3 = r3 + 1;
        goto L_0x00e5;
    L_0x0100:
        r3 = "NETSCAPE2.0";
        r3 = r4.equals(r3);
        if (r3 == 0) goto L_0x00d9;
    L_0x0108:
        r9.m2648d();
        goto L_0x0003;
    L_0x010d:
        r3 = r9.f3583c;
        r4 = new com.c.a.b.b;
        r4.<init>();
        r3.f3571d = r4;
        r9.m2651g();
        r3 = r9.m2651g();
        r4 = r9.f3583c;
        r4 = r4.f3571d;
        r5 = r3 & 28;
        r6 = 2;
        r5 = r5 >> r6;
        r4.f3563g = r5;
        r4 = r9.f3583c;
        r4 = r4.f3571d;
        r4 = r4.f3563g;
        if (r4 != 0) goto L_0x0135;
    L_0x012f:
        r4 = r9.f3583c;
        r4 = r4.f3571d;
        r4.f3563g = r1;
    L_0x0135:
        r4 = r9.f3583c;
        r4 = r4.f3571d;
        r3 = r3 & 1;
        if (r3 == 0) goto L_0x013f;
    L_0x013d:
        r3 = r1;
        goto L_0x0140;
    L_0x013f:
        r3 = r0;
    L_0x0140:
        r4.f3562f = r3;
        r3 = r9.f3582b;
        r3 = r3.getShort();
        r4 = 10;
        if (r3 >= r6) goto L_0x014d;
    L_0x014c:
        r3 = r4;
    L_0x014d:
        r5 = r9.f3583c;
        r5 = r5.f3571d;
        r3 = r3 * r4;
        r5.f3565i = r3;
        r3 = r9.f3583c;
        r3 = r3.f3571d;
        r4 = r9.m2651g();
        r3.f3564h = r4;
        r9.m2651g();
        goto L_0x0003;
    L_0x0163:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.b.d.a():void");
    }

    public final void m2653b() {
        int i;
        boolean z = false;
        String str = "";
        for (i = 0; i < 6; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append((char) m2651g());
            str = stringBuilder.toString();
        }
        if (str.startsWith("GIF")) {
            this.f3583c.f3573f = this.f3582b.getShort();
            this.f3583c.f3574g = this.f3582b.getShort();
            i = m2651g();
            C1089c c1089c = this.f3583c;
            if ((i & 128) != 0) {
                z = true;
            }
            c1089c.f3575h = z;
            this.f3583c.f3576i = (int) Math.pow(2.0d, (double) ((i & 7) + 1));
            this.f3583c.f3577j = m2651g();
            this.f3583c.f3578k = m2651g();
            if (this.f3583c.f3575h && !m2654c()) {
                this.f3583c.f3568a = m2647a(this.f3583c.f3576i);
                this.f3583c.f3579l = this.f3583c.f3568a[this.f3583c.f3577j];
            }
            return;
        }
        this.f3583c.f3569b = 1;
    }

    public final boolean m2654c() {
        return this.f3583c.f3569b != 0;
    }
}
