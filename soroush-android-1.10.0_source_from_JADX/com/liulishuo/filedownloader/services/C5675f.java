package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.C2231x;
import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p200c.C2147c;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p200c.C2152e;
import com.liulishuo.filedownloader.p200c.C5657d;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.p205h.C2184e;
import com.liulishuo.filedownloader.p205h.C2185f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class C5675f implements C2231x {
    private final C2137a f15606a;
    private final C2224g f15607b;

    C5675f() {
        int a;
        C2147c a2 = C2146a.f7150a;
        this.f15606a = a2.m5896b();
        C2222c e = a2.m5899e();
        if (e.f7328a != null) {
            Integer num = e.f7328a.f7323b;
            if (num != null) {
                if (C2182d.f7249a) {
                    C2182d.m5983c(e, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
                }
                a = C2184e.m5987a(num.intValue());
                this.f15607b = new C2224g(a);
            }
        }
        a = C2184e.m5988a().f7255e;
        this.f15607b = new C2224g(a);
    }

    private boolean m12625g(int i) {
        return mo1965a(this.f15606a.mo1852b(i));
    }

    public final int mo1964a(String str, int i) {
        C2224g c2224g = this.f15607b;
        if (str != null) {
            int size = c2224g.f7329a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5657d c5657d = (C5657d) c2224g.f7329a.valueAt(i2);
                if (c5657d != null && c5657d.m12500b() && c5657d.f15535b.f7290a != i && str.equals(c5657d.f15535b.m6061b())) {
                    return c5657d.f15535b.f7290a;
                }
            }
        }
        return 0;
    }

    public final void m12627a() {
        List<Integer> c = this.f15607b.m6100c();
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "pause all tasks %d", Integer.valueOf(c.size()));
        }
        for (Integer intValue : c) {
            m12629a(intValue.intValue());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void m12628a(java.lang.String r25, java.lang.String r26, boolean r27, int r28, int r29, int r30, boolean r31, com.liulishuo.filedownloader.model.FileDownloadHeader r32, boolean r33) {
        /*
        r24 = this;
        r7 = r24;
        r8 = r25;
        r9 = r26;
        r10 = r27;
        monitor-enter(r24);
        r1 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x024c }
        r11 = 2;
        r12 = 0;
        r13 = 1;
        if (r1 == 0) goto L_0x0022;
    L_0x0010:
        r1 = "request start the task with url(%s) path(%s) isDirectory(%B)";
        r2 = 3;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x024c }
        r2[r12] = r8;	 Catch:{ all -> 0x024c }
        r2[r13] = r9;	 Catch:{ all -> 0x024c }
        r3 = java.lang.Boolean.valueOf(r27);	 Catch:{ all -> 0x024c }
        r2[r11] = r3;	 Catch:{ all -> 0x024c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r1, r2);	 Catch:{ all -> 0x024c }
    L_0x0022:
        r14 = com.liulishuo.filedownloader.p205h.C2185f.m5990a(r25, r26, r27);	 Catch:{ all -> 0x024c }
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r1 = r1.mo1852b(r14);	 Catch:{ all -> 0x024c }
        r2 = 0;
        if (r10 != 0) goto L_0x006d;
    L_0x002f:
        if (r1 != 0) goto L_0x006d;
    L_0x0031:
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m6015e(r26);	 Catch:{ all -> 0x024c }
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m5990a(r8, r1, r13);	 Catch:{ all -> 0x024c }
        r3 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r3 = r3.mo1852b(r1);	 Catch:{ all -> 0x024c }
        if (r3 == 0) goto L_0x006a;
    L_0x0041:
        r4 = r3.m6057a();	 Catch:{ all -> 0x024c }
        r4 = r9.equals(r4);	 Catch:{ all -> 0x024c }
        if (r4 == 0) goto L_0x006a;
    L_0x004b:
        r4 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x024c }
        if (r4 == 0) goto L_0x0062;
    L_0x004f:
        r4 = "task[%d] find model by dirCaseId[%d]";
        r5 = new java.lang.Object[r11];	 Catch:{ all -> 0x024c }
        r6 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x024c }
        r5[r12] = r6;	 Catch:{ all -> 0x024c }
        r6 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x024c }
        r5[r13] = r6;	 Catch:{ all -> 0x024c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r4, r5);	 Catch:{ all -> 0x024c }
    L_0x0062:
        r4 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r1 = r4.mo1854c(r1);	 Catch:{ all -> 0x024c }
        r6 = r1;
        goto L_0x006b;
    L_0x006a:
        r6 = r2;
    L_0x006b:
        r15 = r3;
        goto L_0x006f;
    L_0x006d:
        r15 = r1;
        r6 = r2;
    L_0x006f:
        r1 = com.liulishuo.filedownloader.p205h.C2181c.m5976a(r14, r15, r7, r13);	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x0088;
    L_0x0075:
        r1 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x0086;
    L_0x0079:
        r1 = "has already started download %d";
        r2 = new java.lang.Object[r13];	 Catch:{ all -> 0x024c }
        r3 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x024c }
        r2[r12] = r3;	 Catch:{ all -> 0x024c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r1, r2);	 Catch:{ all -> 0x024c }
    L_0x0086:
        monitor-exit(r24);
        return;
    L_0x0088:
        if (r15 == 0) goto L_0x008f;
    L_0x008a:
        r1 = r15.m6057a();	 Catch:{ all -> 0x024c }
        goto L_0x0093;
    L_0x008f:
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m5995a(r9, r10, r2);	 Catch:{ all -> 0x024c }
    L_0x0093:
        r5 = r31;
        r4 = r1;
        r1 = com.liulishuo.filedownloader.p205h.C2181c.m5977a(r14, r4, r5, r13);	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x00af;
    L_0x009c:
        r1 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x00ad;
    L_0x00a0:
        r1 = "has already completed downloading %d";
        r2 = new java.lang.Object[r13];	 Catch:{ all -> 0x024c }
        r3 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x024c }
        r2[r12] = r3;	 Catch:{ all -> 0x024c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r1, r2);	 Catch:{ all -> 0x024c }
    L_0x00ad:
        monitor-exit(r24);
        return;
    L_0x00af:
        r2 = 0;
        if (r15 == 0) goto L_0x00ba;
    L_0x00b3:
        r1 = r15.f7295f;	 Catch:{ all -> 0x024c }
        r16 = r1.get();	 Catch:{ all -> 0x024c }
        goto L_0x00bc;
    L_0x00ba:
        r16 = r2;
    L_0x00bc:
        if (r15 == 0) goto L_0x00c3;
    L_0x00be:
        r1 = r15.m6061b();	 Catch:{ all -> 0x024c }
        goto L_0x00c7;
    L_0x00c3:
        r1 = com.liulishuo.filedownloader.p205h.C2185f.m6006b(r4);	 Catch:{ all -> 0x024c }
    L_0x00c7:
        r18 = r1;
        r1 = r14;
        r2 = r16;
        r16 = r4;
        r4 = r18;
        r5 = r16;
        r21 = r6;
        r6 = r7;
        r1 = com.liulishuo.filedownloader.p205h.C2181c.m5975a(r1, r2, r4, r5, r6);	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x00fc;
    L_0x00db:
        r1 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x024c }
        if (r1 == 0) goto L_0x00ee;
    L_0x00df:
        r1 = "there is an another task with the same target-file-path %d %s";
        r2 = new java.lang.Object[r11];	 Catch:{ all -> 0x024c }
        r3 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x024c }
        r2[r12] = r3;	 Catch:{ all -> 0x024c }
        r2[r13] = r16;	 Catch:{ all -> 0x024c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r7, r1, r2);	 Catch:{ all -> 0x024c }
    L_0x00ee:
        if (r15 == 0) goto L_0x00fa;
    L_0x00f0:
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r1.mo1856e(r14);	 Catch:{ all -> 0x024c }
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r1.mo1855d(r14);	 Catch:{ all -> 0x024c }
    L_0x00fa:
        monitor-exit(r24);
        return;
    L_0x00fc:
        if (r15 == 0) goto L_0x0160;
    L_0x00fe:
        r1 = r15.m6063c();	 Catch:{ all -> 0x024c }
        r2 = -2;
        if (r1 == r2) goto L_0x011f;
    L_0x0105:
        r1 = r15.m6063c();	 Catch:{ all -> 0x024c }
        r2 = -1;
        if (r1 == r2) goto L_0x011f;
    L_0x010c:
        r1 = r15.m6063c();	 Catch:{ all -> 0x024c }
        if (r1 == r13) goto L_0x011f;
    L_0x0112:
        r1 = r15.m6063c();	 Catch:{ all -> 0x024c }
        r2 = 6;
        if (r1 == r2) goto L_0x011f;
    L_0x0119:
        r1 = r15.m6063c();	 Catch:{ all -> 0x024c }
        if (r1 != r11) goto L_0x0160;
    L_0x011f:
        r1 = r15.f7290a;	 Catch:{ all -> 0x024c }
        if (r1 == r14) goto L_0x0152;
    L_0x0123:
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r2 = r15.f7290a;	 Catch:{ all -> 0x024c }
        r1.mo1856e(r2);	 Catch:{ all -> 0x024c }
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r2 = r15.f7290a;	 Catch:{ all -> 0x024c }
        r1.mo1855d(r2);	 Catch:{ all -> 0x024c }
        r15.f7290a = r14;	 Catch:{ all -> 0x024c }
        r15.m6060a(r9, r10);	 Catch:{ all -> 0x024c }
        r2 = r21;
        if (r2 == 0) goto L_0x015c;
    L_0x013a:
        r1 = r2.iterator();	 Catch:{ all -> 0x024c }
    L_0x013e:
        r2 = r1.hasNext();	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x015c;
    L_0x0144:
        r2 = r1.next();	 Catch:{ all -> 0x024c }
        r2 = (com.liulishuo.filedownloader.model.C2210a) r2;	 Catch:{ all -> 0x024c }
        r2.f7305a = r14;	 Catch:{ all -> 0x024c }
        r3 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r3.mo1850a(r2);	 Catch:{ all -> 0x024c }
        goto L_0x013e;
    L_0x0152:
        r1 = r15.f7291b;	 Catch:{ all -> 0x024c }
        r1 = android.text.TextUtils.equals(r8, r1);	 Catch:{ all -> 0x024c }
        if (r1 != 0) goto L_0x015e;
    L_0x015a:
        r15.f7291b = r8;	 Catch:{ all -> 0x024c }
    L_0x015c:
        r1 = r13;
        goto L_0x017c;
    L_0x015e:
        r1 = r12;
        goto L_0x017c;
    L_0x0160:
        if (r15 != 0) goto L_0x0167;
    L_0x0162:
        r15 = new com.liulishuo.filedownloader.model.FileDownloadModel;	 Catch:{ all -> 0x024c }
        r15.<init>();	 Catch:{ all -> 0x024c }
    L_0x0167:
        r15.f7291b = r8;	 Catch:{ all -> 0x024c }
        r15.m6060a(r9, r10);	 Catch:{ all -> 0x024c }
        r15.f7290a = r14;	 Catch:{ all -> 0x024c }
        r1 = 0;
        r15.m6059a(r1);	 Catch:{ all -> 0x024c }
        r15.m6062b(r1);	 Catch:{ all -> 0x024c }
        r15.m6058a(r13);	 Catch:{ all -> 0x024c }
        r15.f7299j = r13;	 Catch:{ all -> 0x024c }
        goto L_0x015c;
    L_0x017c:
        if (r1 == 0) goto L_0x0183;
    L_0x017e:
        r1 = r7.f15606a;	 Catch:{ all -> 0x024c }
        r1.mo1849a(r15);	 Catch:{ all -> 0x024c }
    L_0x0183:
        r1 = new com.liulishuo.filedownloader.c.d$a;	 Catch:{ all -> 0x024c }
        r1.<init>();	 Catch:{ all -> 0x024c }
        r1.f7157a = r15;	 Catch:{ all -> 0x024c }
        r2 = r32;
        r1.f7158b = r2;	 Catch:{ all -> 0x024c }
        r1.f7159c = r7;	 Catch:{ all -> 0x024c }
        r2 = java.lang.Integer.valueOf(r29);	 Catch:{ all -> 0x024c }
        r1.f7160d = r2;	 Catch:{ all -> 0x024c }
        r2 = java.lang.Integer.valueOf(r28);	 Catch:{ all -> 0x024c }
        r1.f7161e = r2;	 Catch:{ all -> 0x024c }
        r2 = java.lang.Boolean.valueOf(r31);	 Catch:{ all -> 0x024c }
        r1.f7162f = r2;	 Catch:{ all -> 0x024c }
        r2 = java.lang.Boolean.valueOf(r33);	 Catch:{ all -> 0x024c }
        r1.f7163g = r2;	 Catch:{ all -> 0x024c }
        r2 = java.lang.Integer.valueOf(r30);	 Catch:{ all -> 0x024c }
        r1.f7164h = r2;	 Catch:{ all -> 0x024c }
        r2 = r1.f7157a;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01b2:
        r2 = r1.f7159c;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01b6:
        r2 = r1.f7160d;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01ba:
        r2 = r1.f7161e;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01be:
        r2 = r1.f7162f;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01c2:
        r2 = r1.f7163g;	 Catch:{ all -> 0x024c }
        if (r2 == 0) goto L_0x0246;
    L_0x01c6:
        r2 = r1.f7164h;	 Catch:{ all -> 0x024c }
        if (r2 != 0) goto L_0x01cc;
    L_0x01ca:
        goto L_0x0246;
    L_0x01cc:
        r2 = new com.liulishuo.filedownloader.c.d;	 Catch:{ all -> 0x024c }
        r15 = r1.f7157a;	 Catch:{ all -> 0x024c }
        r3 = r1.f7158b;	 Catch:{ all -> 0x024c }
        r4 = r1.f7159c;	 Catch:{ all -> 0x024c }
        r5 = r1.f7160d;	 Catch:{ all -> 0x024c }
        r18 = r5.intValue();	 Catch:{ all -> 0x024c }
        r5 = r1.f7161e;	 Catch:{ all -> 0x024c }
        r19 = r5.intValue();	 Catch:{ all -> 0x024c }
        r5 = r1.f7162f;	 Catch:{ all -> 0x024c }
        r20 = r5.booleanValue();	 Catch:{ all -> 0x024c }
        r5 = r1.f7163g;	 Catch:{ all -> 0x024c }
        r21 = r5.booleanValue();	 Catch:{ all -> 0x024c }
        r1 = r1.f7164h;	 Catch:{ all -> 0x024c }
        r22 = r1.intValue();	 Catch:{ all -> 0x024c }
        r23 = 0;
        r14 = r2;
        r16 = r3;
        r17 = r4;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22);	 Catch:{ all -> 0x024c }
        r1 = r7.f15607b;	 Catch:{ all -> 0x024c }
        r3 = r2.f15536c;	 Catch:{ all -> 0x024c }
        r4 = r2.f15535b;	 Catch:{ all -> 0x024c }
        r4 = r4.f7290a;	 Catch:{ all -> 0x024c }
        r3 = r3.mo1854c(r4);	 Catch:{ all -> 0x024c }
        r2.m12497a(r3);	 Catch:{ all -> 0x024c }
        r3 = r2.f15534a;	 Catch:{ all -> 0x024c }
        r4 = r3.f7183a;	 Catch:{ all -> 0x024c }
        r4.m6058a(r13);	 Catch:{ all -> 0x024c }
        r4 = r3.f7184b;	 Catch:{ all -> 0x024c }
        r5 = r3.f7183a;	 Catch:{ all -> 0x024c }
        r5 = r5.f7290a;	 Catch:{ all -> 0x024c }
        r4.mo1858g(r5);	 Catch:{ all -> 0x024c }
        r3.m5913a(r13);	 Catch:{ all -> 0x024c }
        monitor-enter(r1);	 Catch:{ all -> 0x024c }
        r3 = r1.f7329a;	 Catch:{ all -> 0x0242 }
        r4 = r2.f15535b;	 Catch:{ all -> 0x0242 }
        r4 = r4.f7290a;	 Catch:{ all -> 0x0242 }
        r3.put(r4, r2);	 Catch:{ all -> 0x0242 }
        monitor-exit(r1);	 Catch:{ all -> 0x0242 }
        r3 = r1.f7330b;	 Catch:{ all -> 0x024c }
        r3.execute(r2);	 Catch:{ all -> 0x024c }
        r2 = r1.f7331c;	 Catch:{ all -> 0x024c }
        r3 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        if (r2 < r3) goto L_0x023b;
    L_0x0234:
        r1.m6097a();	 Catch:{ all -> 0x024c }
        r1.f7331c = r12;	 Catch:{ all -> 0x024c }
        monitor-exit(r24);
        return;
    L_0x023b:
        r2 = r1.f7331c;	 Catch:{ all -> 0x024c }
        r2 = r2 + r13;
        r1.f7331c = r2;	 Catch:{ all -> 0x024c }
        monitor-exit(r24);
        return;
    L_0x0242:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r1);	 Catch:{ all -> 0x0242 }
        throw r2;	 Catch:{ all -> 0x024c }
    L_0x0246:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x024c }
        r1.<init>();	 Catch:{ all -> 0x024c }
        throw r1;	 Catch:{ all -> 0x024c }
    L_0x024c:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r24);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.f.a(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }

    public final boolean m12629a(int i) {
        if (C2182d.f7249a) {
            C2182d.m5983c(this, "request pause the task %d", Integer.valueOf(i));
        }
        FileDownloadModel b = this.f15606a.mo1852b(i);
        if (b == null) {
            return false;
        }
        b.m6058a((byte) -2);
        C2224g c2224g = this.f15607b;
        c2224g.m6097a();
        synchronized (c2224g) {
            C5657d c5657d = (C5657d) c2224g.f7329a.get(i);
            if (c5657d != null) {
                c5657d.f15540g = true;
                if (c5657d.f15539f != null) {
                    c5657d.f15539f.m5908a();
                }
                Iterator it = ((ArrayList) c5657d.f15538e.clone()).iterator();
                while (it.hasNext()) {
                    C2152e c2152e = (C2152e) it.next();
                    if (c2152e != null) {
                        c2152e.m5908a();
                    }
                }
                boolean remove = c2224g.f7330b.remove(c5657d);
                if (C2182d.f7249a) {
                    C2182d.m5983c(c2224g, "successful cancel %d %B", Integer.valueOf(i), Boolean.valueOf(remove));
                }
            }
            c2224g.f7329a.remove(i);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1965a(com.liulishuo.filedownloader.model.FileDownloadModel r6) {
        /*
        r5 = this;
        r0 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5.f15607b;
        r2 = r6.f7290a;
        r1 = r1.f7329a;
        r1 = r1.get(r2);
        r1 = (com.liulishuo.filedownloader.p200c.C5657d) r1;
        r2 = 1;
        if (r1 == 0) goto L_0x001b;
    L_0x0013:
        r1 = r1.m12500b();
        if (r1 == 0) goto L_0x001b;
    L_0x0019:
        r1 = r2;
        goto L_0x001c;
    L_0x001b:
        r1 = r0;
    L_0x001c:
        r3 = r6.m6063c();
        if (r3 >= 0) goto L_0x0024;
    L_0x0022:
        r3 = r2;
        goto L_0x0025;
    L_0x0024:
        r3 = r0;
    L_0x0025:
        if (r3 == 0) goto L_0x002b;
    L_0x0027:
        if (r1 == 0) goto L_0x0048;
    L_0x0029:
        r0 = r2;
        return r0;
    L_0x002b:
        if (r1 == 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0029;
    L_0x002e:
        r1 = "%d status is[%s](not finish) & but not in the pool";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r4 = r6.f7290a;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r0] = r4;
        r6 = r6.m6063c();
        r6 = java.lang.Byte.valueOf(r6);
        r3[r2] = r6;
        com.liulishuo.filedownloader.p205h.C2182d.m5980a(r5, r1, r3);
    L_0x0048:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.f.a(com.liulishuo.filedownloader.model.FileDownloadModel):boolean");
    }

    public final boolean m12631a(String str, String str2) {
        return m12625g(C2185f.m5989a(str, str2));
    }

    public final long m12632b(int i) {
        FileDownloadModel b = this.f15606a.mo1852b(i);
        if (b == null) {
            return 0;
        }
        int i2 = b.f7299j;
        if (i2 <= 1) {
            return b.f7295f.get();
        }
        List c = this.f15606a.mo1854c(i);
        return (c == null || c.size() != i2) ? 0 : C2210a.m6066a(c);
    }

    public final boolean m12633b() {
        return this.f15607b.m6099b() <= 0;
    }

    public final long m12634c(int i) {
        FileDownloadModel b = this.f15606a.mo1852b(i);
        return b == null ? 0 : b.f7296g;
    }

    public final void m12635c() {
        this.f15606a.mo1840a();
    }

    public final byte m12636d(int i) {
        FileDownloadModel b = this.f15606a.mo1852b(i);
        return b == null ? (byte) 0 : b.m6063c();
    }

    public final synchronized boolean m12637e(int i) {
        return this.f15607b.m6098a(i);
    }

    public final boolean m12638f(int i) {
        String str;
        Object[] objArr;
        if (i == 0) {
            str = "The task[%d] id is invalid, can't clear it.";
            objArr = new Object[]{Integer.valueOf(i)};
        } else if (m12625g(i)) {
            str = "The task[%d] is downloading, can't clear it.";
            objArr = new Object[]{Integer.valueOf(i)};
        } else {
            this.f15606a.mo1856e(i);
            this.f15606a.mo1855d(i);
            return true;
        }
        C2182d.m5984d(this, str, objArr);
        return false;
    }
}
