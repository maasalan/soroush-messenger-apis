package p050b;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.jivesoftware.smack.roster.Roster;
import p050b.C0853m.C4991a;
import p050b.C4990l.C0852a;
import p050b.p051a.C0817g;
import p050b.p051a.C0819j;
import p050b.p051a.C0827p;
import p050b.p051a.C0828s;
import p050b.p051a.C4954i;
import p050b.p051a.C4956l;
import p050b.p051a.C4961m;
import p050b.p051a.C4967v;
import p050b.p051a.ac;
import p050b.p051a.an;
import p050b.p051a.ap;
import p050b.p054b.C0835a;
import p050b.p054b.C0837c;
import p050b.p054b.C0838d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

class C4989j extends C0851i {
    C0848e f13878a;
    boolean f13879n;
    boolean f13880o;
    boolean f13881p;
    C0819j f13882q;
    byte[] f13883r;
    Hashtable f13884s;
    int f13885t;
    private boolean f13886u;
    private WeakReference f13887v;
    private C0835a f13888w;
    private C0856t f13889x;
    private boolean f13890y = C0848e.f2519b;
    private int f13891z;

    C4989j(String str, C0848e c0848e) {
        super(str);
        this.f13878a = c0848e;
        this.f13881p = false;
        this.f13880o = false;
        this.f13886u = false;
        this.f13879n = false;
        this.f13882q = null;
        this.f13883r = null;
        this.f13887v = null;
        this.f13888w = null;
        this.f13889x = null;
        this.f13884s = null;
        this.f13885t = 0;
        this.f13891z = 0;
    }

    private int m10028a(C4954i c4954i, C0851i[] c0851iArr) {
        C0838d c0838d = new C0838d(c4954i, this);
        int i = 0;
        try {
            c0838d.m1948a(c0851iArr, false);
            for (C0856t c0856t = this.f13889x; c0856t != null; c0856t = c0856t.f2549a) {
                C4990l c4990l = c0856t.f2550b;
                if (!C0857v.m2017a(c4990l.mo919b())) {
                    C0852a c0852a = c0856t.f2551c;
                    c4990l.m10064d();
                    c4990l.mo941i();
                    int a = c0852a.m2009a();
                    if (i < a) {
                        i = a;
                    }
                }
            }
            return i;
        } catch (C0837c e) {
            throw new C0832a(e);
        }
    }

    private void m10029a(C0819j c0819j) {
        if (this.f13889x != null) {
            C4954i c4954i = new C4954i(c0819j.f2451c, 0);
            C0838d c0838d = new C0838d(c4954i, this);
            int i = 0;
            int i2 = i;
            for (C0856t c0856t = this.f13889x; c0856t != null; c0856t = c0856t.f2549a) {
                C4990l c4990l = c0856t.f2550b;
                if (C0857v.m2017a(c4990l.mo919b())) {
                    i = 1;
                    C0852a c0852a = c0856t.f2551c;
                    c4990l.m10064d();
                    c4990l.mo941i();
                    int b = c0852a.m2010b();
                    if (i2 < b) {
                        i2 = b;
                    }
                }
            }
            if (i != 0) {
                an a = c0819j.m1843a("<clinit>");
                if (a == null) {
                    c4954i.mo869a(177);
                    c4954i.f13793e = i2;
                    c4954i.f13794f = 0;
                    a = new an(c0819j.f2451c, "<clinit>", "()V");
                    a.f2405b = 8;
                    a.m1746a(c4954i.m9696a());
                    c0819j.m1845a(a);
                    C4991a y = m10034y();
                    if (y != null) {
                        y.m10071b(new C6430k(a, (C0851i) this));
                    }
                } else {
                    C4956l f = a.m1752f();
                    if (f == null) {
                        throw new C0832a("empty <clinit>");
                    }
                    try {
                        C4961m e = f.m9760e();
                        e.m9788a(c4954i.f13795g, e.m9786a(c4954i.m9717b()));
                        if (f.f13798d < i2) {
                            f.f13798d = i2;
                        }
                        if (f.f13799e < 0) {
                            f.f13799e = 0;
                        }
                    } catch (Throwable e2) {
                        throw new C0832a(e2);
                    }
                }
                try {
                    a.m1747a(this.f13878a, c0819j);
                } catch (Throwable e22) {
                    throw new C0832a(e22);
                }
            }
        }
    }

    private static void m10030a(StringBuffer stringBuffer, String str, C0853m c0853m, C0853m c0853m2) {
        while (true) {
            stringBuffer.append(str);
            if (c0853m != c0853m2) {
                c0853m = c0853m.f2547b;
                stringBuffer.append(c0853m);
                str = ", ";
            } else {
                return;
            }
        }
    }

    private void m10031b(C0819j c0819j) {
        if (this.f13889x != null) {
            C0827p c0827p = c0819j.f2451c;
            List list = c0819j.f2457i;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) list.get(i);
                if (anVar.m1748b()) {
                    C4956l f = anVar.m1752f();
                    if (f != null) {
                        try {
                            C4954i c4954i = new C4954i(c0827p, f.f13799e);
                            int a = m10028a(c4954i, C0828s.m1900a(anVar.m1750d(), this.f13878a));
                            C4961m e = f.m9760e();
                            if (e.m9796f() >= 0 || e.m9793d(1) < 0) {
                                e.m9788a(c4954i.f13795g, e.m9786a(c4954i.m9717b()));
                                if (f.f13798d < a) {
                                    f.f13798d = a;
                                }
                            }
                            anVar.m1747a(this.f13878a, c0819j);
                        } catch (Throwable e2) {
                            throw new C0832a(e2);
                        }
                    }
                    continue;
                }
            }
        }
    }

    private synchronized void m10032w() {
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
        r3 = this;
        monitor-enter(r3);
        r0 = r3.f13882q;	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x002b;	 Catch:{ all -> 0x002d }
    L_0x0005:
        r0 = r3.m10034y();	 Catch:{ all -> 0x002d }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x002d }
    L_0x000b:
        goto L_0x002b;	 Catch:{ all -> 0x002d }
    L_0x000c:
        r0 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x002d }
        r0.<init>();	 Catch:{ all -> 0x002d }
        r1 = new java.io.DataOutputStream;	 Catch:{ all -> 0x002d }
        r1.<init>(r0);	 Catch:{ all -> 0x002d }
        r2 = r3.f13882q;	 Catch:{ IOException -> 0x0029 }
        r2.m1846a(r1);	 Catch:{ IOException -> 0x0029 }
        r0.close();	 Catch:{ IOException -> 0x0029 }
        r0 = r0.toByteArray();	 Catch:{ IOException -> 0x0029 }
        r3.f13883r = r0;	 Catch:{ IOException -> 0x0029 }
        r0 = 0;	 Catch:{ IOException -> 0x0029 }
        r3.f13882q = r0;	 Catch:{ IOException -> 0x0029 }
        monitor-exit(r3);
        return;
    L_0x0029:
        monitor-exit(r3);
        return;
    L_0x002b:
        monitor-exit(r3);
        return;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.w():void");
    }

    private synchronized void m10033x() {
        if (!(this.f13882q == null || this.f13879n || m10034y() != null)) {
            this.f13882q = null;
        }
    }

    private C4991a m10034y() {
        return this.f13887v != null ? (C4991a) this.f13887v.get() : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p050b.C0853m.C4991a m10035z() {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f13887v;	 Catch:{ all -> 0x0081 }
        if (r0 == 0) goto L_0x000f;
    L_0x0005:
        r0 = r8.f13887v;	 Catch:{ all -> 0x0081 }
        r0 = r0.get();	 Catch:{ all -> 0x0081 }
        r0 = (p050b.C0853m.C4991a) r0;	 Catch:{ all -> 0x0081 }
        if (r0 != 0) goto L_0x007f;
    L_0x000f:
        r0 = new b.m$a;	 Catch:{ all -> 0x0081 }
        r0.<init>(r8);	 Catch:{ all -> 0x0081 }
        r1 = r8.mo930h();	 Catch:{ all -> 0x0081 }
        r1 = r1.f2456h;	 Catch:{ all -> 0x0081 }
        r2 = r1.size();	 Catch:{ all -> 0x0081 }
        r3 = 0;
        r4 = r3;
    L_0x0020:
        if (r4 >= r2) goto L_0x0038;
    L_0x0022:
        r5 = r1.get(r4);	 Catch:{ all -> 0x0081 }
        r5 = (p050b.p051a.C0831z) r5;	 Catch:{ all -> 0x0081 }
        r6 = new b.l;	 Catch:{ all -> 0x0081 }
        r6.<init>(r5, r8);	 Catch:{ all -> 0x0081 }
        r6.f2547b = r0;	 Catch:{ all -> 0x0081 }
        r5 = r0.f13895e;	 Catch:{ all -> 0x0081 }
        r5.f2547b = r6;	 Catch:{ all -> 0x0081 }
        r0.f13895e = r6;	 Catch:{ all -> 0x0081 }
        r4 = r4 + 1;
        goto L_0x0020;
    L_0x0038:
        r1 = r8.mo930h();	 Catch:{ all -> 0x0081 }
        r1 = r1.f2457i;	 Catch:{ all -> 0x0081 }
        r2 = r1.size();	 Catch:{ all -> 0x0081 }
        r4 = r3;
    L_0x0043:
        if (r4 >= r2) goto L_0x0078;
    L_0x0045:
        r5 = r1.get(r4);	 Catch:{ all -> 0x0081 }
        r5 = (p050b.p051a.an) r5;	 Catch:{ all -> 0x0081 }
        r6 = r5.m1744a();	 Catch:{ all -> 0x0081 }
        r7 = "<init>";
        r7 = r6.equals(r7);	 Catch:{ all -> 0x0081 }
        if (r7 != 0) goto L_0x0061;
    L_0x0057:
        r7 = "<clinit>";
        r6 = r6.equals(r7);	 Catch:{ all -> 0x0081 }
        if (r6 != 0) goto L_0x0061;
    L_0x005f:
        r6 = 1;
        goto L_0x0062;
    L_0x0061:
        r6 = r3;
    L_0x0062:
        if (r6 == 0) goto L_0x006d;
    L_0x0064:
        r6 = new b.n;	 Catch:{ all -> 0x0081 }
        r6.<init>(r5, r8);	 Catch:{ all -> 0x0081 }
        r0.m10068a(r6);	 Catch:{ all -> 0x0081 }
        goto L_0x0075;
    L_0x006d:
        r6 = new b.k;	 Catch:{ all -> 0x0081 }
        r6.<init>(r5, r8);	 Catch:{ all -> 0x0081 }
        r0.m10071b(r6);	 Catch:{ all -> 0x0081 }
    L_0x0075:
        r4 = r4 + 1;
        goto L_0x0043;
    L_0x0078:
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0081 }
        r1.<init>(r0);	 Catch:{ all -> 0x0081 }
        r8.f13887v = r1;	 Catch:{ all -> 0x0081 }
    L_0x007f:
        monitor-exit(r8);
        return r0;
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.z():b.m$a");
    }

    public final C0848e mo911a() {
        return this.f13878a;
    }

    public final C4990l mo921a(String str) {
        C4990l a = mo922a(str, null);
        if (a != null) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder("field: ");
        stringBuilder.append(str);
        str = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" in ");
        stringBuilder2.append(m1999m());
        throw new C0858w(stringBuilder2.toString());
    }

    final p050b.C4990l mo922a(java.lang.String r6, java.lang.String r7) {
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
        r5 = this;
        r0 = r5.m10035z();
        r1 = r0.f13894d;
        r0 = r0.f13895e;
    L_0x0008:
        r2 = 0;
        if (r1 == r0) goto L_0x0027;
    L_0x000b:
        r1 = r1.f2547b;
        r3 = r1.mo941i();
        r3 = r3.equals(r6);
        if (r3 == 0) goto L_0x0008;
    L_0x0017:
        if (r7 == 0) goto L_0x0023;
    L_0x0019:
        r3 = r1.mo920e();
        r3 = r7.equals(r3);
        if (r3 == 0) goto L_0x0008;
    L_0x0023:
        r0 = r1;
        r0 = (p050b.C4990l) r0;
        goto L_0x0028;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        if (r0 == 0) goto L_0x002b;
    L_0x002a:
        return r0;
    L_0x002b:
        r0 = r5.mo915d();	 Catch:{ w -> 0x004a }
        r1 = r0.length;	 Catch:{ w -> 0x004a }
        r3 = 0;	 Catch:{ w -> 0x004a }
    L_0x0031:
        if (r3 >= r1) goto L_0x003f;	 Catch:{ w -> 0x004a }
    L_0x0033:
        r4 = r0[r3];	 Catch:{ w -> 0x004a }
        r4 = r4.mo922a(r6, r7);	 Catch:{ w -> 0x004a }
        if (r4 == 0) goto L_0x003c;	 Catch:{ w -> 0x004a }
    L_0x003b:
        return r4;	 Catch:{ w -> 0x004a }
    L_0x003c:
        r3 = r3 + 1;	 Catch:{ w -> 0x004a }
        goto L_0x0031;	 Catch:{ w -> 0x004a }
    L_0x003f:
        r0 = r5.mo917f();	 Catch:{ w -> 0x004a }
        if (r0 == 0) goto L_0x004a;	 Catch:{ w -> 0x004a }
    L_0x0045:
        r6 = r0.mo922a(r6, r7);	 Catch:{ w -> 0x004a }
        return r6;
    L_0x004a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a(java.lang.String, java.lang.String):b.l");
    }

    public final void mo923a(int i) {
        C0819j h = mo930h();
        if (C0857v.m2017a(i)) {
            int c = h.m1849c();
            if (c == -1 || (c & 8) == 0) {
                StringBuilder stringBuilder = new StringBuilder("cannot change ");
                stringBuilder.append(m1999m());
                stringBuilder.append(" into a static class");
                throw new RuntimeException(stringBuilder.toString());
            }
            i &= -9;
        }
        mo933k();
        if ((i & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) == 0) {
            i |= 32;
        }
        h.f2453e = i;
    }

    public void mo924a(C6430k c6430k) {
        mo933k();
        if (c6430k.mo940c() != this) {
            throw new C0832a("cannot add");
        }
        m10035z().m10071b(c6430k);
        mo930h().m1845a(c6430k.m10019a());
    }

    public final void mo925a(C6431n c6431n) {
        mo933k();
        if (c6431n.mo940c() != this) {
            throw new C0832a("bad declaring class");
        }
        int b = c6431n.mo919b();
        if ((mo914c() & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            c6431n.m10020a(b | 1);
            if ((b & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) == 0) {
                StringBuilder stringBuilder = new StringBuilder("an interface method must be abstract: ");
                stringBuilder.append(c6431n.toString());
                throw new C0832a(stringBuilder.toString());
            }
        }
        m10035z().m10068a((C0853m) c6431n);
        mo930h().m1845a(c6431n.m10019a());
        if ((b & Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE) != 0) {
            mo923a(mo914c() | Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE);
        }
    }

    public void mo926a(DataOutputStream dataOutputStream) {
        DataOutputStream c;
        try {
            if (this.f13879n) {
                String str = "toBytecode";
                if (this.f13880o) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append("(): ");
                    stringBuilder.append(m1999m());
                    stringBuilder.append(" was pruned.");
                    throw new RuntimeException(stringBuilder.toString());
                }
                C0819j h = mo930h();
                if (this.f13881p) {
                    h.m1844a();
                    this.f13881p = false;
                }
                m10029a(h);
                m10031b(h);
                if (c != null) {
                    c = m1988c(c);
                    h.m1846a(c);
                    c.close();
                }
                h.m1846a(dataOutputStream);
                dataOutputStream.flush();
                this.f13889x = null;
                if (this.f13890y) {
                    h.m1848b();
                    this.f13880o = true;
                }
            } else {
                this.f13878a.m1967a(m1999m(), (OutputStream) dataOutputStream);
            }
            this.f13891z = 0;
            this.f13886u = true;
        } catch (C0858w e) {
            throw new C0832a(e);
        } catch (Throwable e2) {
            throw new C0832a(e2);
        } catch (Throwable th) {
            c.close();
        }
    }

    protected void mo927a(java.lang.StringBuffer r5) {
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
        r4 = this;
        r0 = r4.f13879n;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = "changed ";
        r5.append(r0);
    L_0x0009:
        r0 = r4.f13886u;
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = "frozen ";
        r5.append(r0);
    L_0x0012:
        r0 = r4.f13880o;
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = "pruned ";
        r5.append(r0);
    L_0x001b:
        r0 = r4.mo914c();
        r0 = java.lang.reflect.Modifier.toString(r0);
        r5.append(r0);
        r0 = " class ";
        r5.append(r0);
        r0 = r4.m1999m();
        r5.append(r0);
        r0 = r4.mo917f();	 Catch:{ w -> 0x005a }
        if (r0 == 0) goto L_0x005f;	 Catch:{ w -> 0x005a }
    L_0x0038:
        r1 = r0.m1999m();	 Catch:{ w -> 0x005a }
        r2 = "java.lang.Object";	 Catch:{ w -> 0x005a }
        r1 = r1.equals(r2);	 Catch:{ w -> 0x005a }
        if (r1 != 0) goto L_0x005f;	 Catch:{ w -> 0x005a }
    L_0x0044:
        r1 = new java.lang.StringBuilder;	 Catch:{ w -> 0x005a }
        r2 = " extends ";	 Catch:{ w -> 0x005a }
        r1.<init>(r2);	 Catch:{ w -> 0x005a }
        r0 = r0.m1999m();	 Catch:{ w -> 0x005a }
        r1.append(r0);	 Catch:{ w -> 0x005a }
        r0 = r1.toString();	 Catch:{ w -> 0x005a }
        r5.append(r0);	 Catch:{ w -> 0x005a }
        goto L_0x005f;
    L_0x005a:
        r0 = " extends ??";
        r5.append(r0);
    L_0x005f:
        r0 = r4.mo915d();	 Catch:{ w -> 0x0080 }
        r1 = r0.length;	 Catch:{ w -> 0x0080 }
        if (r1 <= 0) goto L_0x006b;	 Catch:{ w -> 0x0080 }
    L_0x0066:
        r1 = " implements ";	 Catch:{ w -> 0x0080 }
        r5.append(r1);	 Catch:{ w -> 0x0080 }
    L_0x006b:
        r1 = 0;	 Catch:{ w -> 0x0080 }
    L_0x006c:
        r2 = r0.length;	 Catch:{ w -> 0x0080 }
        if (r1 >= r2) goto L_0x0085;	 Catch:{ w -> 0x0080 }
    L_0x006f:
        r2 = r0[r1];	 Catch:{ w -> 0x0080 }
        r2 = r2.m1999m();	 Catch:{ w -> 0x0080 }
        r5.append(r2);	 Catch:{ w -> 0x0080 }
        r2 = ", ";	 Catch:{ w -> 0x0080 }
        r5.append(r2);	 Catch:{ w -> 0x0080 }
        r1 = r1 + 1;
        goto L_0x006c;
    L_0x0080:
        r0 = " extends ??";
        r5.append(r0);
    L_0x0085:
        r0 = r4.m10035z();
        r1 = " fields=";
        r2 = r0.f13894d;
        r3 = r0.f13895e;
        p050b.C4989j.m10030a(r5, r1, r2, r3);
        r1 = " constructors=";
        r2 = r0.f13893a;
        r3 = r0.f13894d;
        p050b.C4989j.m10030a(r5, r1, r2, r3);
        r1 = " methods=";
        r2 = r0.f13893a;
        p050b.C4989j.m10030a(r5, r1, r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.a(java.lang.StringBuffer):void");
    }

    public final boolean mo912a(C0851i c0851i) {
        String m = c0851i.m1999m();
        if (this == c0851i || m1999m().equals(m)) {
            return true;
        }
        C0819j h = mo930h();
        String d = h.m1850d();
        if (d != null && d.equals(m)) {
            return true;
        }
        String[] e = h.m1851e();
        for (String equals : e) {
            if (equals.equals(m)) {
                return true;
            }
        }
        if (d != null && this.f13878a.m1965a(d).mo912a(c0851i)) {
            return true;
        }
        for (String a : e) {
            if (this.f13878a.m1965a(a).mo912a(c0851i)) {
                return true;
            }
        }
        return false;
    }

    public final void mo928b(C0851i c0851i) {
        mo933k();
        if (C0857v.m2018b(mo914c())) {
            mo929c(c0851i);
            return;
        }
        C0819j h = mo930h();
        String m = c0851i.m1999m();
        if (m == null) {
            m = "java.lang.Object";
        }
        try {
            h.f2454f = h.f2451c.m1873a(m);
            ArrayList arrayList = h.f2457i;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) arrayList.get(i);
                if (anVar.m1748b()) {
                    C4956l f = anVar.m1752f();
                    byte[] bArr = f.c;
                    int f2 = f.m9760e().m9796f();
                    if (f2 >= 0) {
                        C0827p c0827p = anVar.f2404a;
                        f2++;
                        C0817g.m1833a(c0827p.m1882c(c0827p.m1873a(m), ((ap) c0827p.m1875a(C0817g.m1832a(bArr, f2))).c), bArr, f2);
                    }
                }
            }
            h.f2461m = m;
        } catch (Throwable e) {
            throw new C0832a(e);
        }
    }

    public final int mo914c() {
        C0819j h = mo930h();
        int i = h.f2453e & -33;
        int c = h.m1849c();
        return (c == -1 || (c & 8) == 0) ? i : i | 8;
    }

    public final void mo929c(C0851i c0851i) {
        mo933k();
        if (c0851i != null) {
            C0819j h = mo930h();
            String m = c0851i.m1999m();
            h.f2460l = null;
            int a = h.f2451c.m1873a(m);
            if (h.f2455g == null) {
                h.f2455g = new int[1];
                h.f2455g[0] = a;
                return;
            }
            int length = h.f2455g.length;
            Object obj = new int[(length + 1)];
            System.arraycopy(h.f2455g, 0, obj, 0, length);
            obj[length] = a;
            h.f2455g = obj;
        }
    }

    public final C0851i[] mo915d() {
        String[] e = mo930h().m1851e();
        int length = e.length;
        C0851i[] c0851iArr = new C0851i[length];
        for (int i = 0; i < length; i++) {
            c0851iArr[i] = this.f13878a.m1965a(e[i]);
        }
        return c0851iArr;
    }

    public final C0851i mo917f() {
        String d = mo930h().m1850d();
        return d == null ? null : this.f13878a.m1965a(d);
    }

    public final p050b.p051a.C0819j mo930h() {
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
        r7 = this;
        r0 = r7.f13882q;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r0 = r7.f13878a;
        r0.m1966a();
        r0 = r7.f13883r;
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x000f:
        r0 = new b.a.j;	 Catch:{ IOException -> 0x002a }
        r2 = new java.io.DataInputStream;	 Catch:{ IOException -> 0x002a }
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x002a }
        r4 = r7.f13883r;	 Catch:{ IOException -> 0x002a }
        r3.<init>(r4);	 Catch:{ IOException -> 0x002a }
        r2.<init>(r3);	 Catch:{ IOException -> 0x002a }
        r0.<init>(r2);	 Catch:{ IOException -> 0x002a }
        r7.f13882q = r0;	 Catch:{ IOException -> 0x002a }
        r7.f13883r = r1;	 Catch:{ IOException -> 0x002a }
        r0 = 2;	 Catch:{ IOException -> 0x002a }
        r7.f13891z = r0;	 Catch:{ IOException -> 0x002a }
        r0 = r7.f13882q;	 Catch:{ IOException -> 0x002a }
        return r0;
    L_0x002a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = r0.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x0035:
        r0 = r7.f13878a;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2 = r7.m1999m();	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = r0.m1969b(r2);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        if (r0 != 0) goto L_0x005b;
    L_0x0041:
        r1 = new b.w;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r2 = r7.m1999m();	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r1.<init>(r2);	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        throw r1;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
    L_0x004b:
        r1 = move-exception;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r6 = r1;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r1 = r0;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r0 = r6;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        goto L_0x00c9;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
    L_0x0051:
        r1 = move-exception;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r6 = r1;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r1 = r0;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r0 = r6;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        goto L_0x00b4;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
    L_0x0056:
        r1 = move-exception;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r6 = r1;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r1 = r0;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r0 = r6;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        goto L_0x00bf;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
    L_0x005b:
        r1 = new java.io.BufferedInputStream;	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r1.<init>(r0);	 Catch:{ w -> 0x0056, IOException -> 0x0051, all -> 0x004b }
        r0 = new b.a.j;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2 = new java.io.DataInputStream;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2.<init>(r1);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0.<init>(r2);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2 = r0.f2459k;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3 = r7.b;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2 = r2.equals(r3);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        if (r2 != 0) goto L_0x00ab;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
    L_0x0074:
        r2 = new java.lang.RuntimeException;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3 = new java.lang.StringBuilder;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r4 = "cannot find ";	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.<init>(r4);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r4 = r7.b;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r4);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r4 = ": ";	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r4);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = r0.f2459k;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r0);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = " found in ";	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r0);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = r7.b;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r4 = 46;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r5 = 47;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = r0.replace(r4, r5);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r0);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = ".class";	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r3.append(r0);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r0 = r3.toString();	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r2.<init>(r0);	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        throw r2;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
    L_0x00ab:
        r7.f13882q = r0;	 Catch:{ w -> 0x00be, IOException -> 0x00b3 }
        r1.close();	 Catch:{ IOException -> 0x00b0 }
    L_0x00b0:
        return r0;
    L_0x00b1:
        r0 = move-exception;
        goto L_0x00c9;
    L_0x00b3:
        r0 = move-exception;
    L_0x00b4:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00b1 }
        r3 = r0.toString();	 Catch:{ all -> 0x00b1 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x00b1 }
        throw r2;	 Catch:{ all -> 0x00b1 }
    L_0x00be:
        r0 = move-exception;	 Catch:{ all -> 0x00b1 }
    L_0x00bf:
        r2 = new java.lang.RuntimeException;	 Catch:{ all -> 0x00b1 }
        r3 = r0.toString();	 Catch:{ all -> 0x00b1 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x00b1 }
        throw r2;	 Catch:{ all -> 0x00b1 }
    L_0x00c9:
        if (r1 == 0) goto L_0x00ce;
    L_0x00cb:
        r1.close();	 Catch:{ IOException -> 0x00ce }
    L_0x00ce:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.j.h():b.a.j");
    }

    public final C0835a mo931i() {
        if (this.f13888w == null) {
            this.f13888w = new C0835a(this);
        }
        return this.f13888w;
    }

    public final boolean mo932j() {
        return this.f13886u;
    }

    final void mo933k() {
        if (this.f13886u) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(m1999m());
            stringBuilder.append(" class is frozen");
            String stringBuilder2 = stringBuilder.toString();
            if (this.f13880o) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append(" and pruned");
                stringBuilder2 = stringBuilder3.toString();
            }
            throw new RuntimeException(stringBuilder2);
        }
        this.f13879n = true;
    }

    public final boolean mo934p() {
        return C0857v.m2018b(mo914c());
    }

    public final C0851i mo935q() {
        C0819j h = mo930h();
        ac acVar = (ac) h.m1847b("InnerClasses");
        if (acVar == null) {
            return null;
        }
        String m = m1999m();
        int e = acVar.m9541e();
        for (int i = 0; i < e; i++) {
            if (m.equals(acVar.m9539a(i))) {
                String b = acVar.m9540b(i);
                if (b != null) {
                    return this.f13878a.m1965a(b);
                }
                C4967v c4967v = (C4967v) h.m1847b("EnclosingMethod");
                if (c4967v != null) {
                    return this.f13878a.m1965a(c4967v.m9810e());
                }
            }
        }
        return null;
    }

    public final C6430k[] mo936r() {
        C4991a z = m10035z();
        C0853m c0853m = z.f13893a;
        C0853m c0853m2 = z.f13894d;
        int i = 0;
        C0853m c0853m3 = c0853m;
        int i2 = 0;
        while (c0853m3 != c0853m2) {
            c0853m3 = c0853m3.f2547b;
            if (((C6430k) c0853m3).m15336g()) {
                i2++;
            }
        }
        C6430k[] c6430kArr = new C6430k[i2];
        while (c0853m != c0853m2) {
            c0853m = c0853m.f2547b;
            C6430k c6430k = (C6430k) c0853m;
            if (c6430k.m15336g()) {
                int i3 = i + 1;
                c6430kArr[i] = c6430k;
                i = i3;
            }
        }
        return c6430kArr;
    }

    final void mo937s() {
        this.f13891z++;
    }

    public final void mo938t() {
        this.f13881p = true;
    }

    final void mo939v() {
        if (this.f13891z < 2) {
            if (!this.f13879n && C0848e.f2520c) {
                m10033x();
            } else if (this.f13886u && !this.f13880o) {
                m10032w();
            }
        }
        this.f13891z = 0;
    }
}
