package com.liulishuo.filedownloader.p200c;

import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p200c.C2147c.C2146a;
import com.liulishuo.filedownloader.p200c.C5656a.C2142a;
import com.liulishuo.filedownloader.p205h.C2185f;

public final class C2152e implements Runnable {
    final int f7172a;
    private final C5656a f7173b;
    private final C2157h f7174c;
    private final String f7175d;
    private final boolean f7176e;
    private C2156g f7177f;
    private volatile boolean f7178g;
    private final int f7179h;

    public static class C2151a {
        C2157h f7167a;
        String f7168b;
        Integer f7169c;
        private final C2142a f7170d = new C2142a();
        private Boolean f7171e;

        public final C2151a m5900a(int i) {
            this.f7170d.m5888a(i);
            return this;
        }

        public final C2151a m5901a(C2145b c2145b) {
            this.f7170d.f7135d = c2145b;
            return this;
        }

        public final C2151a m5902a(FileDownloadHeader fileDownloadHeader) {
            this.f7170d.f7134c = fileDownloadHeader;
            return this;
        }

        public final C2151a m5903a(String str) {
            this.f7170d.f7132a = str;
            return this;
        }

        public final C2151a m5904a(boolean z) {
            this.f7171e = Boolean.valueOf(z);
            return this;
        }

        public final C2152e m5905a() {
            if (!(this.f7167a == null || this.f7168b == null || this.f7171e == null)) {
                if (this.f7169c != null) {
                    C5656a a = this.f7170d.m5889a();
                    return new C2152e(a.f7137a, this.f7169c.intValue(), a, this.f7167a, this.f7171e.booleanValue(), this.f7168b);
                }
            }
            throw new IllegalArgumentException(C2185f.m5996a("%s %s %B", this.f7167a, this.f7168b, this.f7171e));
        }

        public final C2151a m5906b(String str) {
            this.f7170d.f7133b = str;
            return this;
        }
    }

    private C2152e(int i, int i2, C5656a c5656a, C2157h c2157h, boolean z, String str) {
        this.f7179h = i;
        this.f7172a = i2;
        this.f7178g = false;
        this.f7174c = c2157h;
        this.f7175d = str;
        this.f7173b = c5656a;
        this.f7176e = z;
    }

    private long m5907b() {
        C2137a b = C2146a.f7150a.m5896b();
        if (this.f7172a < 0) {
            return b.mo1852b(this.f7179h).f7295f.get();
        }
        for (C2210a c2210a : b.mo1854c(this.f7179h)) {
            if (c2210a.f7306b == this.f7172a) {
                return c2210a.f7308d;
            }
        }
        return 0;
    }

    public final void m5908a() {
        this.f7178g = true;
        if (this.f7177f != null) {
            this.f7177f.f7208b = true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r18 = this;
        r1 = r18;
        r2 = 10;
        android.os.Process.setThreadPriority(r2);
        r2 = 0;
        r3 = 0;
        r4 = r2;
    L_0x000a:
        r5 = 1;
        r6 = r1.f7178g;	 Catch:{ IllegalAccessException -> 0x012d, IllegalAccessException -> 0x012d, IllegalAccessException -> 0x012d, IllegalAccessException -> 0x012d, all -> 0x0128 }
        if (r6 == 0) goto L_0x0015;
    L_0x000f:
        if (r3 == 0) goto L_0x0014;
    L_0x0011:
        r3.mo1832f();
    L_0x0014:
        return;
    L_0x0015:
        r4 = r1.f7173b;	 Catch:{ IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, all -> 0x0128 }
        r4 = r4.m5890a();	 Catch:{ IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, IllegalAccessException -> 0x0125, all -> 0x0128 }
        r3 = r4.mo1831e();	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r6 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r7 = 3;
        r8 = 2;
        r9 = 4;
        if (r6 == 0) goto L_0x0049;
    L_0x0026:
        r6 = "the connection[%d] for %d, is connected %s with code[%d]";
        r10 = new java.lang.Object[r9];	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = r1.f7172a;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r10[r2] = r11;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = r1.f7179h;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r10[r5] = r11;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = r1.f7173b;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = r11.f7140d;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r10[r8] = r11;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r10[r7] = r11;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r1, r6, r10);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
    L_0x0049:
        r6 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        if (r3 == r6) goto L_0x0082;
    L_0x004d:
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r3 == r6) goto L_0x0082;
    L_0x0051:
        r6 = new java.net.SocketException;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r10 = "Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.";
        r11 = 5;
        r11 = new java.lang.Object[r11];	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r12 = r1.f7173b;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r12 = r12.f7141e;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11[r2] = r12;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r12 = r4.mo1829c();	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11[r5] = r12;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11[r8] = r3;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = r1.f7179h;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11[r7] = r3;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = r1.f7172a;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r11[r9] = r3;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r3 = com.liulishuo.filedownloader.p205h.C2185f.m5996a(r10, r11);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        r6.<init>(r3);	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
        throw r6;	 Catch:{ IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, IllegalAccessException -> 0x0120, all -> 0x011c }
    L_0x0082:
        r3 = new com.liulishuo.filedownloader.c.g$a;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.<init>();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7178g;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0091;
    L_0x008b:
        if (r4 == 0) goto L_0x0090;
    L_0x008d:
        r4.mo1832f();
    L_0x0090:
        return;
    L_0x0091:
        r6 = r1.f7179h;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7206h = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7172a;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7205g = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7174c;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7202d = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7199a = r1;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7176e;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7204f = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7200b = r4;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7173b;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r6.f7140d;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7201c = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r1.f7175d;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7203e = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r6 = r3.f7204f;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00bf:
        r6 = r3.f7200b;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00c3:
        r6 = r3.f7201c;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00c7:
        r6 = r3.f7202d;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00cb:
        r6 = r3.f7203e;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00cf:
        r6 = r3.f7206h;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 == 0) goto L_0x0111;
    L_0x00d3:
        r6 = r3.f7205g;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r6 != 0) goto L_0x00d8;
    L_0x00d7:
        goto L_0x0111;
    L_0x00d8:
        r6 = new com.liulishuo.filedownloader.c.g;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r8 = r3.f7200b;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r9 = r3.f7201c;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r10 = r3.f7199a;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r7 = r3.f7206h;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r11 = r7.intValue();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r7 = r3.f7205g;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r12 = r7.intValue();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r7 = r3.f7204f;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r13 = r7.booleanValue();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r14 = r3.f7202d;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r15 = r3.f7203e;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r16 = 0;
        r7 = r6;
        r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15);	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r1.f7177f = r6;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3 = r1.f7177f;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.m5921a();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3 = r1.f7178g;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        if (r3 == 0) goto L_0x010b;
    L_0x0107:
        r3 = r1.f7177f;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.f7208b = r5;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
    L_0x010b:
        if (r4 == 0) goto L_0x01b4;
    L_0x010d:
        r4.mo1832f();
        return;
    L_0x0111:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        r3.<init>();	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
        throw r3;	 Catch:{ IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, IllegalAccessException -> 0x0117, all -> 0x011c }
    L_0x0117:
        r0 = move-exception;
        r3 = r0;
        r6 = r4;
        r4 = r5;
        goto L_0x0130;
    L_0x011c:
        r0 = move-exception;
        r2 = r0;
        goto L_0x01b8;
    L_0x0120:
        r0 = move-exception;
        r3 = r0;
        r6 = r4;
        r4 = r2;
        goto L_0x0130;
    L_0x0125:
        r0 = move-exception;
        r4 = r2;
        goto L_0x012e;
    L_0x0128:
        r0 = move-exception;
        r2 = r0;
        r4 = r3;
        goto L_0x01b8;
    L_0x012d:
        r0 = move-exception;
    L_0x012e:
        r6 = r3;
        r3 = r0;
    L_0x0130:
        r7 = r1.f7174c;	 Catch:{ all -> 0x01b5 }
        r7 = r7.mo1867a(r3);	 Catch:{ all -> 0x01b5 }
        if (r7 == 0) goto L_0x01aa;
    L_0x0138:
        if (r4 == 0) goto L_0x0152;
    L_0x013a:
        r7 = r1.f7177f;	 Catch:{ all -> 0x01b5 }
        if (r7 != 0) goto L_0x0152;
    L_0x013e:
        r4 = "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s";
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x01b5 }
        r5[r2] = r3;	 Catch:{ all -> 0x01b5 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r1, r4, r5);	 Catch:{ all -> 0x01b5 }
        r2 = r1.f7174c;	 Catch:{ all -> 0x01b5 }
        r2.mo1868b(r3);	 Catch:{ all -> 0x01b5 }
        if (r6 == 0) goto L_0x01b4;
    L_0x014e:
        r6.mo1832f();
        return;
    L_0x0152:
        r7 = r1.f7177f;	 Catch:{ all -> 0x01b5 }
        if (r7 == 0) goto L_0x019d;
    L_0x0156:
        r10 = r18.m5907b();	 Catch:{ all -> 0x01b5 }
        r7 = 0;
        r9 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x019d;
    L_0x0160:
        r7 = r1.f7173b;	 Catch:{ all -> 0x01b5 }
        r8 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r8 = r8.f7145b;	 Catch:{ all -> 0x01b5 }
        r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r12 != 0) goto L_0x0172;
    L_0x016a:
        r5 = "no data download, no need to update";
        r8 = new java.lang.Object[r2];	 Catch:{ all -> 0x01b5 }
        com.liulishuo.filedownloader.p205h.C2182d.m5984d(r7, r5, r8);	 Catch:{ all -> 0x01b5 }
        goto L_0x019d;
    L_0x0172:
        r8 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r8 = r8.f7147d;	 Catch:{ all -> 0x01b5 }
        r12 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r12 = r12.f7145b;	 Catch:{ all -> 0x01b5 }
        r14 = r10 - r12;
        r16 = r8 - r14;
        r8 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r8 = r8.f7144a;	 Catch:{ all -> 0x01b5 }
        r12 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r12 = r12.f7146c;	 Catch:{ all -> 0x01b5 }
        r14 = r16;
        r8 = com.liulishuo.filedownloader.p200c.C2145b.C2144a.m5891a(r8, r10, r12, r14);	 Catch:{ all -> 0x01b5 }
        r7.f7140d = r8;	 Catch:{ all -> 0x01b5 }
        r8 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x01b5 }
        if (r8 == 0) goto L_0x019d;
    L_0x0192:
        r8 = "after update profile:%s";
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x01b5 }
        r9 = r7.f7140d;	 Catch:{ all -> 0x01b5 }
        r5[r2] = r9;	 Catch:{ all -> 0x01b5 }
        com.liulishuo.filedownloader.p205h.C2182d.m5982b(r7, r8, r5);	 Catch:{ all -> 0x01b5 }
    L_0x019d:
        r5 = r1.f7174c;	 Catch:{ all -> 0x01b5 }
        r5.mo1869c(r3);	 Catch:{ all -> 0x01b5 }
        if (r6 == 0) goto L_0x01a7;
    L_0x01a4:
        r6.mo1832f();
    L_0x01a7:
        r3 = r6;
        goto L_0x000a;
    L_0x01aa:
        r2 = r1.f7174c;	 Catch:{ all -> 0x01b5 }
        r2.mo1868b(r3);	 Catch:{ all -> 0x01b5 }
        if (r6 == 0) goto L_0x01b4;
    L_0x01b1:
        r6.mo1832f();
    L_0x01b4:
        return;
    L_0x01b5:
        r0 = move-exception;
        r2 = r0;
        r4 = r6;
    L_0x01b8:
        if (r4 == 0) goto L_0x01bd;
    L_0x01ba:
        r4.mo1832f();
    L_0x01bd:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.c.e.run():void");
    }
}
