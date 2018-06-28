package com.liulishuo.filedownloader.p200c;

import android.os.SystemClock;
import com.liulishuo.filedownloader.p198a.C2132b;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p204g.C2171a;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.io.IOException;

public final class C2156g {
    long f7207a;
    volatile boolean f7208b;
    private final C2157h f7209c;
    private final int f7210d;
    private final int f7211e;
    private final C2152e f7212f;
    private final C2132b f7213g;
    private final boolean f7214h;
    private final long f7215i;
    private final long f7216j;
    private final long f7217k;
    private final String f7218l;
    private C2171a f7219m;
    private final C2137a f7220n;
    private volatile long f7221o;
    private volatile long f7222p;

    public static class C2155a {
        C2152e f7199a;
        C2132b f7200b;
        C2145b f7201c;
        C2157h f7202d;
        String f7203e;
        Boolean f7204f;
        Integer f7205g;
        Integer f7206h;
    }

    private C2156g(C2132b c2132b, C2145b c2145b, C2152e c2152e, int i, int i2, boolean z, C2157h c2157h, String str) {
        this.f7221o = 0;
        this.f7222p = 0;
        this.f7209c = c2157h;
        this.f7218l = str;
        this.f7213g = c2132b;
        this.f7214h = z;
        this.f7212f = c2152e;
        this.f7211e = i2;
        this.f7210d = i;
        this.f7220n = C2146a.f7150a.m5896b();
        this.f7215i = c2145b.f7144a;
        this.f7216j = c2145b.f7146c;
        this.f7207a = c2145b.f7145b;
        this.f7217k = c2145b.f7147d;
    }

    private void m5920b() {
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f7219m.mo1937a();
            i = 1;
        } catch (IOException e) {
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e);
            }
            i = 0;
        }
        if (i != 0) {
            if ((this.f7211e >= 0 ? 1 : 0) != 0) {
                this.f7220n.mo1843a(this.f7210d, this.f7211e, this.f7207a);
            } else {
                this.f7209c.mo1864a();
            }
            if (C2182d.f7249a) {
                C2182d.m5983c(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f7210d), Integer.valueOf(this.f7211e), Long.valueOf(this.f7207a), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5921a() {
        /*
        r18 = this;
        r1 = r18;
        r2 = r1.f7208b;
        if (r2 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r2 = r1.f7211e;
        r3 = r1.f7213g;
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m6010c(r2, r3);
        r4 = -1;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x001b;
    L_0x0015:
        r2 = r1.f7213g;
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m6004b(r2);
    L_0x001b:
        r6 = 0;
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        r9 = 2;
        r10 = 1;
        r11 = 0;
        if (r8 != 0) goto L_0x0042;
    L_0x0024:
        r2 = new com.liulishuo.filedownloader.e.a;
        r3 = "there isn't any content need to download on %d-%d with the content-length is 0";
        r4 = new java.lang.Object[r9];
        r5 = r1.f7210d;
        r5 = java.lang.Integer.valueOf(r5);
        r4[r11] = r5;
        r5 = r1.f7211e;
        r5 = java.lang.Integer.valueOf(r5);
        r4[r10] = r5;
        r3 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r3, r4);
        r2.<init>(r3);
        throw r2;
    L_0x0042:
        r12 = r1.f7217k;
        r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        r6 = 5;
        r7 = 4;
        r12 = 3;
        if (r8 <= 0) goto L_0x00ab;
    L_0x004b:
        r13 = r1.f7217k;
        r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r8 == 0) goto L_0x00ab;
    L_0x0051:
        r13 = r1.f7216j;
        r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x0068;
    L_0x0057:
        r4 = "range[%d-)";
        r5 = new java.lang.Object[r10];
        r13 = r1.f7207a;
        r8 = java.lang.Long.valueOf(r13);
        r5[r11] = r8;
    L_0x0063:
        r4 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r4, r5);
        goto L_0x007d;
    L_0x0068:
        r4 = "range[%d-%d)";
        r5 = new java.lang.Object[r9];
        r13 = r1.f7207a;
        r8 = java.lang.Long.valueOf(r13);
        r5[r11] = r8;
        r13 = r1.f7216j;
        r8 = java.lang.Long.valueOf(r13);
        r5[r10] = r8;
        goto L_0x0063;
    L_0x007d:
        r5 = new com.liulishuo.filedownloader.e.a;
        r8 = "require %s with contentLength(%d), but the backend response contentLength is %d on downloadId[%d]-connectionIndex[%d], please ask your backend dev to fix such problem.";
        r6 = new java.lang.Object[r6];
        r6[r11] = r4;
        r13 = r1.f7217k;
        r4 = java.lang.Long.valueOf(r13);
        r6[r10] = r4;
        r2 = java.lang.Long.valueOf(r2);
        r6[r9] = r2;
        r2 = r1.f7210d;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r12] = r2;
        r2 = r1.f7211e;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r7] = r2;
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r8, r6);
        r5.<init>(r2);
        throw r5;
    L_0x00ab:
        r13 = r1.f7207a;
        r15 = com.liulishuo.filedownloader.p200c.C2147c.C2146a.f7150a;	 Catch:{ all -> 0x022e }
        r15.m5898d();	 Catch:{ all -> 0x022e }
        r15 = r1.f7218l;	 Catch:{ all -> 0x022e }
        r15 = com.liulishuo.filedownloader.p205h.C2185f.m6018h(r15);	 Catch:{ all -> 0x022e }
        r1.f7219m = r15;	 Catch:{ all -> 0x022a }
        r4 = r1.f7207a;	 Catch:{ all -> 0x022a }
        r15.mo1938a(r4);	 Catch:{ all -> 0x022a }
        r4 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x022a }
        if (r4 == 0) goto L_0x00ec;
    L_0x00c5:
        r4 = "start fetch(%d): range [%d, %d), seek to[%d]";
        r5 = new java.lang.Object[r7];	 Catch:{ all -> 0x022a }
        r8 = r1.f7211e;	 Catch:{ all -> 0x022a }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x022a }
        r5[r11] = r8;	 Catch:{ all -> 0x022a }
        r6 = r1.f7215i;	 Catch:{ all -> 0x022a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x022a }
        r5[r10] = r6;	 Catch:{ all -> 0x022a }
        r6 = r1.f7216j;	 Catch:{ all -> 0x022a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x022a }
        r5[r9] = r6;	 Catch:{ all -> 0x022a }
        r6 = r1.f7207a;	 Catch:{ all -> 0x022a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x022a }
        r5[r12] = r6;	 Catch:{ all -> 0x022a }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r1, r4, r5);	 Catch:{ all -> 0x022a }
    L_0x00ec:
        r4 = r1.f7213g;	 Catch:{ all -> 0x022a }
        r8 = r4.mo1824a();	 Catch:{ all -> 0x022a }
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r4 = new byte[r4];	 Catch:{ all -> 0x0227 }
        r5 = r1.f7208b;	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x0125;
    L_0x00fa:
        if (r8 == 0) goto L_0x0105;
    L_0x00fc:
        r8.close();	 Catch:{ IOException -> 0x0100 }
        goto L_0x0105;
    L_0x0100:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x0105:
        if (r15 == 0) goto L_0x0119;
    L_0x0107:
        r18.m5920b();	 Catch:{ all -> 0x010b }
        goto L_0x0119;
    L_0x010b:
        r0 = move-exception;
        if (r15 == 0) goto L_0x0117;
    L_0x010e:
        r15.mo1940b();	 Catch:{ IOException -> 0x0112 }
        goto L_0x0117;
    L_0x0112:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x0117:
        r2 = r0;
        throw r2;
    L_0x0119:
        if (r15 == 0) goto L_0x0124;
    L_0x011b:
        r15.mo1940b();	 Catch:{ IOException -> 0x011f }
        return;
    L_0x011f:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x0124:
        return;
    L_0x0125:
        r5 = r8.read(r4);	 Catch:{ all -> 0x0227 }
        r6 = -1;
        if (r5 == r6) goto L_0x01a0;
    L_0x012c:
        r15.mo1939a(r4, r5);	 Catch:{ all -> 0x0227 }
        r6 = r1.f7207a;	 Catch:{ all -> 0x0227 }
        r9 = (long) r5;	 Catch:{ all -> 0x0227 }
        r11 = r6 + r9;
        r1.f7207a = r11;	 Catch:{ all -> 0x0227 }
        r5 = r1.f7209c;	 Catch:{ all -> 0x0227 }
        r5.mo1865a(r9);	 Catch:{ all -> 0x0227 }
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x0227 }
        r9 = r1.f7207a;	 Catch:{ all -> 0x0227 }
        r11 = r1.f7221o;	 Catch:{ all -> 0x0227 }
        r16 = r2;
        r2 = r9 - r11;
        r9 = r1.f7222p;	 Catch:{ all -> 0x0227 }
        r11 = r5 - r9;
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m6002a(r2, r11);	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x015a;
    L_0x0151:
        r18.m5920b();	 Catch:{ all -> 0x0227 }
        r2 = r1.f7207a;	 Catch:{ all -> 0x0227 }
        r1.f7221o = r2;	 Catch:{ all -> 0x0227 }
        r1.f7222p = r5;	 Catch:{ all -> 0x0227 }
    L_0x015a:
        r2 = r1.f7208b;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0189;
    L_0x015e:
        if (r8 == 0) goto L_0x0169;
    L_0x0160:
        r8.close();	 Catch:{ IOException -> 0x0164 }
        goto L_0x0169;
    L_0x0164:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x0169:
        if (r15 == 0) goto L_0x017d;
    L_0x016b:
        r18.m5920b();	 Catch:{ all -> 0x016f }
        goto L_0x017d;
    L_0x016f:
        r0 = move-exception;
        if (r15 == 0) goto L_0x017b;
    L_0x0172:
        r15.mo1940b();	 Catch:{ IOException -> 0x0176 }
        goto L_0x017b;
    L_0x0176:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x017b:
        r2 = r0;
        throw r2;
    L_0x017d:
        if (r15 == 0) goto L_0x0188;
    L_0x017f:
        r15.mo1940b();	 Catch:{ IOException -> 0x0183 }
        return;
    L_0x0183:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x0188:
        return;
    L_0x0189:
        r2 = r1.f7214h;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0199;
    L_0x018d:
        r2 = com.liulishuo.filedownloader.p205h.C2185f.m5999a();	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0199;
    L_0x0193:
        r2 = new com.liulishuo.filedownloader.e.c;	 Catch:{ all -> 0x0227 }
        r2.<init>();	 Catch:{ all -> 0x0227 }
        throw r2;	 Catch:{ all -> 0x0227 }
    L_0x0199:
        r2 = r16;
        r9 = 2;
        r10 = 1;
        r11 = 0;
        r12 = 3;
        goto L_0x0125;
    L_0x01a0:
        r16 = r2;
        if (r8 == 0) goto L_0x01ad;
    L_0x01a4:
        r8.close();	 Catch:{ IOException -> 0x01a8 }
        goto L_0x01ad;
    L_0x01a8:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x01ad:
        if (r15 == 0) goto L_0x01c1;
    L_0x01af:
        r18.m5920b();	 Catch:{ all -> 0x01b3 }
        goto L_0x01c1;
    L_0x01b3:
        r0 = move-exception;
        if (r15 == 0) goto L_0x01bf;
    L_0x01b6:
        r15.mo1940b();	 Catch:{ IOException -> 0x01ba }
        goto L_0x01bf;
    L_0x01ba:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x01bf:
        r2 = r0;
        throw r2;
    L_0x01c1:
        if (r15 == 0) goto L_0x01cc;
    L_0x01c3:
        r15.mo1940b();	 Catch:{ IOException -> 0x01c7 }
        goto L_0x01cc;
    L_0x01c7:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x01cc:
        r2 = r1.f7207a;
        r4 = r2 - r13;
        r2 = -1;
        r6 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1));
        if (r6 == 0) goto L_0x021b;
    L_0x01d6:
        r2 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r2 == 0) goto L_0x021b;
    L_0x01da:
        r2 = new com.liulishuo.filedownloader.e.a;
        r3 = "fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset[%d]";
        r6 = 6;
        r6 = new java.lang.Object[r6];
        r4 = java.lang.Long.valueOf(r4);
        r5 = 0;
        r6[r5] = r4;
        r4 = r16;
        r4 = java.lang.Long.valueOf(r4);
        r5 = 1;
        r6[r5] = r4;
        r4 = r1.f7215i;
        r4 = java.lang.Long.valueOf(r4);
        r5 = 2;
        r6[r5] = r4;
        r4 = r1.f7216j;
        r4 = java.lang.Long.valueOf(r4);
        r5 = 3;
        r6[r5] = r4;
        r4 = r1.f7207a;
        r4 = java.lang.Long.valueOf(r4);
        r5 = 4;
        r6[r5] = r4;
        r4 = java.lang.Long.valueOf(r13);
        r5 = 5;
        r6[r5] = r4;
        r3 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r3, r6);
        r2.<init>(r3);
        throw r2;
    L_0x021b:
        r4 = r1.f7209c;
        r5 = r1.f7212f;
        r6 = r1.f7215i;
        r8 = r1.f7216j;
        r4.mo1866a(r5, r6, r8);
        return;
    L_0x0227:
        r0 = move-exception;
        r2 = r0;
        goto L_0x0232;
    L_0x022a:
        r0 = move-exception;
        r2 = r0;
        r8 = 0;
        goto L_0x0232;
    L_0x022e:
        r0 = move-exception;
        r2 = r0;
        r8 = 0;
        r15 = 0;
    L_0x0232:
        if (r8 == 0) goto L_0x023d;
    L_0x0234:
        r8.close();	 Catch:{ IOException -> 0x0238 }
        goto L_0x023d;
    L_0x0238:
        r0 = move-exception;
        r3 = r0;
        r3.printStackTrace();
    L_0x023d:
        if (r15 == 0) goto L_0x0251;
    L_0x023f:
        r18.m5920b();	 Catch:{ all -> 0x0243 }
        goto L_0x0251;
    L_0x0243:
        r0 = move-exception;
        if (r15 == 0) goto L_0x024f;
    L_0x0246:
        r15.mo1940b();	 Catch:{ IOException -> 0x024a }
        goto L_0x024f;
    L_0x024a:
        r0 = move-exception;
        r2 = r0;
        r2.printStackTrace();
    L_0x024f:
        r2 = r0;
        throw r2;
    L_0x0251:
        if (r15 == 0) goto L_0x025c;
    L_0x0253:
        r15.mo1940b();	 Catch:{ IOException -> 0x0257 }
        goto L_0x025c;
    L_0x0257:
        r0 = move-exception;
        r3 = r0;
        r3.printStackTrace();
    L_0x025c:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.c.g.a():void");
    }
}
