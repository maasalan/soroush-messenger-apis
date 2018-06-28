package mobi.mmdt.ott.logic.p370r;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Random;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.p261a.af.C6664c;
import mobi.mmdt.ott.provider.p386h.C2983b;
import mobi.mmdt.ott.provider.p386h.C2984c;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.provider.p386h.C6025e;
import mobi.mmdt.ott.provider.p386h.C6027g;
import mobi.mmdt.ott.provider.p394p.C3016f;
import mobi.mmdt.ott.provider.p394p.C6047c;
import mobi.mmdt.ott.provider.p394p.C6049e;

public final class C2897c {
    private static C2897c f9054c;
    public SparseArray<C6664c> f9055a = new SparseArray();
    public HashMap<String, Integer> f9056b = new HashMap();

    private C2897c() {
        C2987i c2987i = C2987i.TRANSMITTING;
        C2987i c2987i2 = C2987i.ERROR;
        C6025e c6025e = new C6025e();
        c6025e.m13452a(c2987i2);
        C6027g c6027g = new C6027g();
        c6027g.m13468a(c2987i);
        c6025e.m13445a(MyApplication.m12952b(), c6027g);
        Context b = MyApplication.m12952b();
        C6047c c6047c = new C6047c();
        c6047c.m13570a(C3016f.ERROR);
        C6049e c6049e = new C6049e();
        c6049e.m13587b(C3016f.READY);
        c6047c.m13566a(b, c6049e);
    }

    private synchronized int m7262a(Uri uri, Uri uri2, boolean z, int i, String str, C2896b c2896b) {
        int b;
        C2897c c2897c = this;
        synchronized (this) {
            try {
                b = m7269b();
                if (uri != null) {
                    if (!uri.getPath().isEmpty()) {
                    }
                }
                throw new NullPointerException();
            } finally {
                Object obj = r0;
            }
        }
        return b;
    }

    private synchronized int m7263a(String str, String str2, Uri uri, boolean z, boolean z2, String str3, C2896b c2896b) {
        int b;
        C2897c c2897c = this;
        synchronized (this) {
            try {
                b = m7269b();
                if (str != null) {
                    if (!str.isEmpty()) {
                    }
                }
                throw new NullPointerException();
            } finally {
                Object obj = r0;
            }
        }
        return b;
    }

    public static C2897c m7264a() {
        if (f9054c == null) {
            f9054c = new C2897c();
        }
        return f9054c;
    }

    public final int m7265a(long j, boolean z, int i, C2896b c2896b) {
        C2983b a = C2984c.m7461a(j);
        Uri uri = a.f9334c;
        Uri uri2 = a.f9340i;
        StringBuilder stringBuilder = new StringBuilder("R_");
        stringBuilder.append(j);
        int a2 = m7262a(uri, uri2, z, i, stringBuilder.toString(), c2896b);
        HashMap hashMap = this.f9056b;
        StringBuilder stringBuilder2 = new StringBuilder("R_");
        stringBuilder2.append(j);
        hashMap.put(stringBuilder2.toString(), Integer.valueOf(a2));
        return a2;
    }

    public final int m7266a(long r12, boolean r14, mobi.mmdt.ott.logic.p370r.C2896b r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0079 in {2, 3, 7, 8, 11, 13, 14} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
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
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r12);
        r1 = r0.f9344m;
        r2 = "\\.";
        r1 = r1.split(r2);
        r2 = 1;
        r3 = r1.length;
        if (r3 <= r2) goto L_0x0013;
    L_0x0010:
        r1 = r1[r2];
        goto L_0x0014;
    L_0x0013:
        r1 = 0;
    L_0x0014:
        if (r1 == 0) goto L_0x001d;
    L_0x0016:
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001e;
    L_0x001d:
        r2 = 0;
    L_0x001e:
        r7 = r2;
        if (r14 == 0) goto L_0x0054;
    L_0x0021:
        r4 = r0.f9339h;
        r5 = r0.f9344m;
        r6 = r0.f9340i;
        r8 = 1;
        r14 = new java.lang.StringBuilder;
        r0 = "T_";
        r14.<init>(r0);
        r14.append(r12);
        r9 = r14.toString();
        r3 = r11;
        r10 = r15;
        r14 = r3.m7263a(r4, r5, r6, r7, r8, r9, r10);
        r15 = r11.f9056b;
        r0 = new java.lang.StringBuilder;
        r1 = "T_";
        r0.<init>(r1);
    L_0x0045:
        r0.append(r12);
        r12 = r0.toString();
        r13 = java.lang.Integer.valueOf(r14);
        r15.put(r12, r13);
        return r14;
    L_0x0054:
        r4 = r0.f9333b;
        r5 = r0.f9344m;
        r6 = r0.f9334c;
        r8 = 0;
        r14 = new java.lang.StringBuilder;
        r0 = "R_";
        r14.<init>(r0);
        r14.append(r12);
        r9 = r14.toString();
        r3 = r11;
        r10 = r15;
        r14 = r3.m7263a(r4, r5, r6, r7, r8, r9, r10);
        r15 = r11.f9056b;
        r0 = new java.lang.StringBuilder;
        r1 = "R_";
        r0.<init>(r1);
        goto L_0x0045;
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.logic.r.c.a(long, boolean, mobi.mmdt.ott.logic.r.b):int");
    }

    public final int m7267a(Uri uri, Uri uri2, int i, C2896b c2896b) {
        return m7262a(uri, uri2, true, i, null, c2896b);
    }

    public final int m7268a(String str, Uri uri, C2896b c2896b) {
        return m7263a(str, null, uri, true, false, null, c2896b);
    }

    public final int m7269b() {
        Random random = new Random();
        while (true) {
            int nextInt = random.nextInt();
            if (((C6664c) this.f9055a.get(nextInt)) == null) {
                return nextInt;
            }
        }
    }
}
