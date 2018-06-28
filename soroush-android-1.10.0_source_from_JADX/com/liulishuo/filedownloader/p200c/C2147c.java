package com.liulishuo.filedownloader.p200c;

import com.liulishuo.filedownloader.p198a.C2132b;
import com.liulishuo.filedownloader.p198a.C5647a;
import com.liulishuo.filedownloader.p198a.C5649c.C5648b;
import com.liulishuo.filedownloader.p199b.C2137a;
import com.liulishuo.filedownloader.p204g.C5668b.C5667a;
import com.liulishuo.filedownloader.p205h.C2181c.C2176a;
import com.liulishuo.filedownloader.p205h.C2181c.C2177b;
import com.liulishuo.filedownloader.p205h.C2181c.C2179d;
import com.liulishuo.filedownloader.p205h.C2181c.C2180e;
import com.liulishuo.filedownloader.p205h.C2182d;
import com.liulishuo.filedownloader.services.C2222c;
import com.liulishuo.filedownloader.services.C5674b;

public final class C2147c {
    public C2222c f7151a;
    public C2177b f7152b;
    public C2180e f7153c;
    public C2137a f7154d;
    public C2179d f7155e;
    private C2176a f7156f;

    private static final class C2146a {
        private static final C2147c f7150a = new C2147c();
    }

    private C2177b m5893f() {
        if (this.f7152b != null) {
            return this.f7152b;
        }
        synchronized (this) {
            if (this.f7152b == null) {
                C2177b c5648b;
                C2222c e = m5899e();
                if (e.f7328a == null) {
                    c5648b = new C5648b();
                } else {
                    C2177b c2177b = e.f7328a.f7325d;
                    if (c2177b != null) {
                        if (C2182d.f7249a) {
                            C2182d.m5983c(e, "initial FileDownloader manager with the customize connection creator: %s", c2177b);
                        }
                        c5648b = c2177b;
                    } else {
                        c5648b = new C5648b();
                    }
                }
                this.f7152b = c5648b;
            }
        }
        return this.f7152b;
    }

    public final C2132b m5894a(String str) {
        return m5893f().mo1823a(str);
    }

    public final C2179d m5895a() {
        if (this.f7155e != null) {
            return this.f7155e;
        }
        synchronized (this) {
            if (this.f7155e == null) {
                C2179d c5674b;
                C2222c e = m5899e();
                if (e.f7328a == null) {
                    c5674b = new C5674b();
                } else {
                    C2179d c2179d = e.f7328a.f7327f;
                    if (c2179d != null) {
                        if (C2182d.f7249a) {
                            C2182d.m5983c(e, "initial FileDownloader manager with the customize id generator: %s", c2179d);
                        }
                        c5674b = c2179d;
                    } else {
                        c5674b = new C5674b();
                    }
                }
                this.f7155e = c5674b;
            }
        }
        return this.f7155e;
    }

    public final com.liulishuo.filedownloader.p199b.C2137a m5896b() {
        /* JADX: method processing error */
/*
Error: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
	at java.util.ArrayList$Itr.next(ArrayList.java:851)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMerge(EliminatePhiNodes.java:114)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.replaceMergeInstructions(EliminatePhiNodes.java:68)
	at jadx.core.dex.visitors.ssa.EliminatePhiNodes.visit(EliminatePhiNodes.java:31)
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
        r27 = this;
        r1 = r27;
        r2 = r1.f7154d;
        if (r2 == 0) goto L_0x0009;
    L_0x0006:
        r2 = r1.f7154d;
        return r2;
    L_0x0009:
        monitor-enter(r27);
        r2 = r1.f7154d;	 Catch:{ all -> 0x0238 }
        if (r2 != 0) goto L_0x0234;	 Catch:{ all -> 0x0238 }
    L_0x000e:
        r2 = r27.m5899e();	 Catch:{ all -> 0x0238 }
        r3 = r2.f7328a;	 Catch:{ all -> 0x0238 }
        r4 = 0;	 Catch:{ all -> 0x0238 }
        r5 = 1;	 Catch:{ all -> 0x0238 }
        if (r3 == 0) goto L_0x003d;	 Catch:{ all -> 0x0238 }
    L_0x0018:
        r3 = r2.f7328a;	 Catch:{ all -> 0x0238 }
        r3 = r3.f7322a;	 Catch:{ all -> 0x0238 }
        if (r3 != 0) goto L_0x001f;	 Catch:{ all -> 0x0238 }
    L_0x001e:
        goto L_0x003d;	 Catch:{ all -> 0x0238 }
    L_0x001f:
        r3 = r2.f7328a;	 Catch:{ all -> 0x0238 }
        r3 = r3.f7322a;	 Catch:{ all -> 0x0238 }
        r3 = r3.m5971a();	 Catch:{ all -> 0x0238 }
        if (r3 == 0) goto L_0x0037;	 Catch:{ all -> 0x0238 }
    L_0x0029:
        r6 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0238 }
        if (r6 == 0) goto L_0x0042;	 Catch:{ all -> 0x0238 }
    L_0x002d:
        r6 = "initial FileDownloader manager with the customize database: %s";	 Catch:{ all -> 0x0238 }
        r7 = new java.lang.Object[r5];	 Catch:{ all -> 0x0238 }
        r7[r4] = r3;	 Catch:{ all -> 0x0238 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r2, r6, r7);	 Catch:{ all -> 0x0238 }
        goto L_0x0042;	 Catch:{ all -> 0x0238 }
    L_0x0037:
        r3 = new com.liulishuo.filedownloader.b.c;	 Catch:{ all -> 0x0238 }
        r3.<init>();	 Catch:{ all -> 0x0238 }
        goto L_0x0042;	 Catch:{ all -> 0x0238 }
    L_0x003d:
        r3 = new com.liulishuo.filedownloader.b.c;	 Catch:{ all -> 0x0238 }
        r3.<init>();	 Catch:{ all -> 0x0238 }
    L_0x0042:
        r1.f7154d = r3;	 Catch:{ all -> 0x0238 }
        r2 = r1.f7154d;	 Catch:{ all -> 0x0238 }
        r2 = r2.mo1851b();	 Catch:{ all -> 0x0238 }
        r3 = r2.iterator();	 Catch:{ all -> 0x0238 }
        r6 = com.liulishuo.filedownloader.p200c.C2147c.C2146a.f7150a;	 Catch:{ all -> 0x0238 }
        r6 = r6.m5895a();	 Catch:{ all -> 0x0238 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0238 }
        r11 = 0;
        r13 = 0;
        r15 = 0;
    L_0x0060:
        r4 = 3;
        r10 = r3.hasNext();	 Catch:{ all -> 0x01f5 }
        if (r10 == 0) goto L_0x01b5;
    L_0x0067:
        r10 = r3.next();	 Catch:{ all -> 0x01ae }
        r10 = (com.liulishuo.filedownloader.model.FileDownloadModel) r10;	 Catch:{ all -> 0x01ae }
        r5 = r10.m6063c();	 Catch:{ all -> 0x01ae }
        r9 = -2;
        if (r5 == r4) goto L_0x009e;
    L_0x0074:
        r5 = r10.m6063c();	 Catch:{ all -> 0x0096 }
        r4 = 2;	 Catch:{ all -> 0x0096 }
        if (r5 == r4) goto L_0x009e;	 Catch:{ all -> 0x0096 }
    L_0x007b:
        r4 = r10.m6063c();	 Catch:{ all -> 0x0096 }
        r5 = -1;	 Catch:{ all -> 0x0096 }
        if (r4 == r5) goto L_0x009e;	 Catch:{ all -> 0x0096 }
    L_0x0082:
        r4 = r10.m6063c();	 Catch:{ all -> 0x0096 }
        r5 = 1;	 Catch:{ all -> 0x0096 }
        if (r4 != r5) goto L_0x00a1;	 Catch:{ all -> 0x0096 }
    L_0x0089:
        r4 = r10.f7295f;	 Catch:{ all -> 0x0096 }
        r4 = r4.get();	 Catch:{ all -> 0x0096 }
        r17 = 0;
        r19 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1));
        if (r19 <= 0) goto L_0x00a1;
    L_0x0095:
        goto L_0x009e;
    L_0x0096:
        r0 = move-exception;
        r3 = r0;
        r22 = r7;
        r9 = r11;
        r4 = r15;
        goto L_0x01fb;
    L_0x009e:
        r10.m6058a(r9);	 Catch:{ all -> 0x01ae }
    L_0x00a1:
        r4 = r10.m6057a();	 Catch:{ all -> 0x01ae }
        if (r4 != 0) goto L_0x00b2;	 Catch:{ all -> 0x01ae }
    L_0x00a7:
        r22 = r7;	 Catch:{ all -> 0x01ae }
        r24 = r11;	 Catch:{ all -> 0x01ae }
        r20 = r15;	 Catch:{ all -> 0x01ae }
        r4 = 1;	 Catch:{ all -> 0x01ae }
        r11 = 0;	 Catch:{ all -> 0x01ae }
        goto L_0x0149;	 Catch:{ all -> 0x01ae }
    L_0x00b2:
        r5 = new java.io.File;	 Catch:{ all -> 0x01ae }
        r5.<init>(r4);	 Catch:{ all -> 0x01ae }
        r4 = r10.m6063c();	 Catch:{ all -> 0x01ae }
        if (r4 != r9) goto L_0x011b;
    L_0x00bd:
        r4 = r10.f7290a;	 Catch:{ all -> 0x0110 }
        r9 = r10.f7292c;	 Catch:{ all -> 0x0110 }
        r4 = com.liulishuo.filedownloader.p205h.C2185f.m6001a(r4, r10, r9);	 Catch:{ all -> 0x0110 }
        if (r4 == 0) goto L_0x011b;	 Catch:{ all -> 0x0110 }
    L_0x00c7:
        r4 = new java.io.File;	 Catch:{ all -> 0x0110 }
        r9 = r10.m6061b();	 Catch:{ all -> 0x0110 }
        r4.<init>(r9);	 Catch:{ all -> 0x0110 }
        r9 = r4.exists();	 Catch:{ all -> 0x0110 }
        if (r9 != 0) goto L_0x011b;	 Catch:{ all -> 0x0110 }
    L_0x00d6:
        r9 = r5.exists();	 Catch:{ all -> 0x0110 }
        if (r9 == 0) goto L_0x011b;	 Catch:{ all -> 0x0110 }
    L_0x00dc:
        r9 = r5.renameTo(r4);	 Catch:{ all -> 0x0110 }
        r19 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0110 }
        if (r19 == 0) goto L_0x011b;
    L_0x00e4:
        r20 = r15;
        r15 = com.liulishuo.filedownloader.p199b.C2137a.class;	 Catch:{ all -> 0x010c }
        r22 = r7;
        r7 = "resume from the old no-temp-file architecture [%B], [%s]->[%s]";	 Catch:{ all -> 0x010a }
        r24 = r11;
        r8 = 3;
        r11 = new java.lang.Object[r8];	 Catch:{ all -> 0x015c }
        r8 = java.lang.Boolean.valueOf(r9);	 Catch:{ all -> 0x015c }
        r9 = 0;	 Catch:{ all -> 0x015c }
        r11[r9] = r8;	 Catch:{ all -> 0x015c }
        r8 = r5.getPath();	 Catch:{ all -> 0x015c }
        r9 = 1;	 Catch:{ all -> 0x015c }
        r11[r9] = r8;	 Catch:{ all -> 0x015c }
        r4 = r4.getPath();	 Catch:{ all -> 0x015c }
        r8 = 2;	 Catch:{ all -> 0x015c }
        r11[r8] = r4;	 Catch:{ all -> 0x015c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r15, r7, r11);	 Catch:{ all -> 0x015c }
        goto L_0x0121;
    L_0x010a:
        r0 = move-exception;
        goto L_0x0115;
    L_0x010c:
        r0 = move-exception;
        r22 = r7;
        goto L_0x0115;
    L_0x0110:
        r0 = move-exception;
        r22 = r7;
        r20 = r15;
    L_0x0115:
        r3 = r0;
        r9 = r11;
        r4 = r20;
        goto L_0x01fb;
    L_0x011b:
        r22 = r7;
        r24 = r11;
        r20 = r15;
    L_0x0121:
        r4 = r10.m6063c();	 Catch:{ all -> 0x01a9 }
        r7 = 1;
        if (r4 != r7) goto L_0x0136;
    L_0x0128:
        r4 = r10.f7295f;	 Catch:{ all -> 0x015c }
        r7 = r4.get();	 Catch:{ all -> 0x015c }
        r11 = 0;
        r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
        if (r4 > 0) goto L_0x0138;
    L_0x0134:
        r4 = 1;
        goto L_0x0149;
    L_0x0136:
        r11 = 0;
    L_0x0138:
        r4 = r10.f7290a;	 Catch:{ all -> 0x01a9 }
        r4 = com.liulishuo.filedownloader.p205h.C2185f.m6000a(r4, r10);	 Catch:{ all -> 0x01a9 }
        if (r4 != 0) goto L_0x0141;	 Catch:{ all -> 0x01a9 }
    L_0x0140:
        goto L_0x0134;	 Catch:{ all -> 0x01a9 }
    L_0x0141:
        r4 = r5.exists();	 Catch:{ all -> 0x01a9 }
        if (r4 == 0) goto L_0x0148;
    L_0x0147:
        goto L_0x0134;
    L_0x0148:
        r4 = 0;
    L_0x0149:
        r7 = 1;
        if (r4 == 0) goto L_0x0164;
    L_0x014d:
        r3.remove();	 Catch:{ all -> 0x015c }
        r4 = r13 + r7;
        r13 = r4;
        r15 = r20;
        r7 = r22;
        r11 = r24;
    L_0x0159:
        r5 = 1;
        goto L_0x0060;
    L_0x015c:
        r0 = move-exception;
        r3 = r0;
        r4 = r20;
    L_0x0160:
        r9 = r24;
        goto L_0x01fb;
    L_0x0164:
        r4 = r10.f7290a;	 Catch:{ all -> 0x01a9 }
        r5 = r10.f7291b;	 Catch:{ all -> 0x01a9 }
        r9 = r10.f7292c;	 Catch:{ all -> 0x01a9 }
        r15 = r10.f7293d;	 Catch:{ all -> 0x01a9 }
        r5 = r6.mo1962a(r5, r9, r15);	 Catch:{ all -> 0x01a9 }
        if (r5 == r4) goto L_0x019a;	 Catch:{ all -> 0x01a9 }
    L_0x0172:
        r9 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x01a9 }
        if (r9 == 0) goto L_0x0190;
    L_0x0176:
        r9 = com.liulishuo.filedownloader.p199b.C2137a.class;	 Catch:{ all -> 0x015c }
        r15 = "the id is changed on restoring from db: old[%d] -> new[%d]";	 Catch:{ all -> 0x015c }
        r11 = 2;	 Catch:{ all -> 0x015c }
        r12 = new java.lang.Object[r11];	 Catch:{ all -> 0x015c }
        r11 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x015c }
        r16 = 0;	 Catch:{ all -> 0x015c }
        r12[r16] = r11;	 Catch:{ all -> 0x015c }
        r11 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x015c }
        r16 = 1;	 Catch:{ all -> 0x015c }
        r12[r16] = r11;	 Catch:{ all -> 0x015c }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r9, r15, r12);	 Catch:{ all -> 0x015c }
    L_0x0190:
        r10.f7290a = r5;	 Catch:{ all -> 0x01a9 }
        r2.mo1838a(r4, r10);	 Catch:{ all -> 0x01a9 }
        r4 = r20;
        r15 = r4 + r7;
        goto L_0x019d;
    L_0x019a:
        r4 = r20;
        r15 = r4;
    L_0x019d:
        r2.mo1839a(r10);	 Catch:{ all -> 0x01a5 }
        r11 = r24 + r7;
        r7 = r22;
        goto L_0x0159;
    L_0x01a5:
        r0 = move-exception;
        r3 = r0;
        r4 = r15;
        goto L_0x0160;
    L_0x01a9:
        r0 = move-exception;
        r4 = r20;
        r3 = r0;
        goto L_0x0160;
    L_0x01ae:
        r0 = move-exception;
        r22 = r7;
        r4 = r15;
        r3 = r0;
        r9 = r11;
        goto L_0x01fb;
    L_0x01b5:
        r22 = r7;
        r24 = r11;
        r4 = r15;
        r3 = com.liulishuo.filedownloader.p205h.C2181c.f7248a;	 Catch:{ all -> 0x0238 }
        com.liulishuo.filedownloader.p205h.C2185f.m6007b(r3);	 Catch:{ all -> 0x0238 }
        r2.mo1837a();	 Catch:{ all -> 0x0238 }
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0238 }
        if (r2 == 0) goto L_0x0234;	 Catch:{ all -> 0x0238 }
    L_0x01c6:
        r2 = com.liulishuo.filedownloader.p199b.C2137a.class;	 Catch:{ all -> 0x0238 }
        r3 = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d";	 Catch:{ all -> 0x0238 }
        r6 = 4;	 Catch:{ all -> 0x0238 }
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0238 }
        r9 = r24;	 Catch:{ all -> 0x0238 }
        r7 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x0238 }
        r8 = 0;	 Catch:{ all -> 0x0238 }
        r6[r8] = r7;	 Catch:{ all -> 0x0238 }
        r7 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0238 }
        r8 = 1;	 Catch:{ all -> 0x0238 }
        r6[r8] = r7;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0238 }
        r5 = 2;	 Catch:{ all -> 0x0238 }
        r6[r5] = r4;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0238 }
        r7 = r4 - r22;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x0238 }
        r5 = 3;	 Catch:{ all -> 0x0238 }
        r6[r5] = r4;	 Catch:{ all -> 0x0238 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r2, r3, r6);	 Catch:{ all -> 0x0238 }
        goto L_0x0234;	 Catch:{ all -> 0x0238 }
    L_0x01f5:
        r0 = move-exception;	 Catch:{ all -> 0x0238 }
        r22 = r7;	 Catch:{ all -> 0x0238 }
        r9 = r11;	 Catch:{ all -> 0x0238 }
        r4 = r15;	 Catch:{ all -> 0x0238 }
        r3 = r0;	 Catch:{ all -> 0x0238 }
    L_0x01fb:
        r6 = com.liulishuo.filedownloader.p205h.C2181c.f7248a;	 Catch:{ all -> 0x0238 }
        com.liulishuo.filedownloader.p205h.C2185f.m6007b(r6);	 Catch:{ all -> 0x0238 }
        r2.mo1837a();	 Catch:{ all -> 0x0238 }
        r2 = com.liulishuo.filedownloader.p205h.C2182d.f7249a;	 Catch:{ all -> 0x0238 }
        if (r2 == 0) goto L_0x0233;	 Catch:{ all -> 0x0238 }
    L_0x0207:
        r2 = com.liulishuo.filedownloader.p199b.C2137a.class;	 Catch:{ all -> 0x0238 }
        r6 = "refreshed data count: %d , delete data count: %d, reset id count: %d. consume %d";	 Catch:{ all -> 0x0238 }
        r7 = 4;	 Catch:{ all -> 0x0238 }
        r7 = new java.lang.Object[r7];	 Catch:{ all -> 0x0238 }
        r8 = java.lang.Long.valueOf(r9);	 Catch:{ all -> 0x0238 }
        r9 = 0;	 Catch:{ all -> 0x0238 }
        r7[r9] = r8;	 Catch:{ all -> 0x0238 }
        r8 = java.lang.Long.valueOf(r13);	 Catch:{ all -> 0x0238 }
        r9 = 1;	 Catch:{ all -> 0x0238 }
        r7[r9] = r8;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x0238 }
        r5 = 2;	 Catch:{ all -> 0x0238 }
        r7[r5] = r4;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0238 }
        r8 = r4 - r22;	 Catch:{ all -> 0x0238 }
        r4 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0238 }
        r5 = 3;	 Catch:{ all -> 0x0238 }
        r7[r5] = r4;	 Catch:{ all -> 0x0238 }
        com.liulishuo.filedownloader.p205h.C2182d.m5983c(r2, r6, r7);	 Catch:{ all -> 0x0238 }
    L_0x0233:
        throw r3;	 Catch:{ all -> 0x0238 }
    L_0x0234:
        monitor-exit(r27);	 Catch:{ all -> 0x0238 }
        r2 = r1.f7154d;
        return r2;
    L_0x0238:
        r0 = move-exception;
        r2 = r0;
        monitor-exit(r27);	 Catch:{ all -> 0x0238 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.c.c.b():com.liulishuo.filedownloader.b.a");
    }

    final C2176a m5897c() {
        if (this.f7156f != null) {
            return this.f7156f;
        }
        synchronized (this) {
            if (this.f7156f == null) {
                C2176a c5647a;
                C2222c e = m5899e();
                if (e.f7328a == null) {
                    c5647a = new C5647a();
                } else {
                    C2176a c2176a = e.f7328a.f7326e;
                    if (c2176a != null) {
                        if (C2182d.f7249a) {
                            C2182d.m5983c(e, "initial FileDownloader manager with the customize connection count adapter: %s", c2176a);
                        }
                        c5647a = c2176a;
                    } else {
                        c5647a = new C5647a();
                    }
                }
                this.f7156f = c5647a;
            }
        }
        return this.f7156f;
    }

    public final C2180e m5898d() {
        if (this.f7153c != null) {
            return this.f7153c;
        }
        synchronized (this) {
            if (this.f7153c == null) {
                C2180e c5667a;
                C2222c e = m5899e();
                if (e.f7328a == null) {
                    c5667a = new C5667a();
                } else {
                    C2180e c2180e = e.f7328a.f7324c;
                    if (c2180e != null) {
                        if (C2182d.f7249a) {
                            C2182d.m5983c(e, "initial FileDownloader manager with the customize output stream: %s", c2180e);
                        }
                        c5667a = c2180e;
                    } else {
                        c5667a = new C5667a();
                    }
                }
                this.f7153c = c5667a;
            }
        }
        return this.f7153c;
    }

    public final C2222c m5899e() {
        if (this.f7151a != null) {
            return this.f7151a;
        }
        synchronized (this) {
            if (this.f7151a == null) {
                this.f7151a = new C2222c();
            }
        }
        return this.f7151a;
    }
}
