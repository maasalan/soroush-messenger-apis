package p056c.p057a.p059b;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Proxy.Type;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p056c.C0914a;
import p056c.C0925e;
import p056c.C0934j;
import p056c.C0942p;
import p056c.C0951u.C0950a;
import p056c.C5047x;
import p056c.ae;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p059b.C0871f.C0870a;
import p056c.p057a.p060c.C0877c;
import p056c.p057a.p061e.C0886a;
import p056c.p057a.p061e.C0887b;
import p056c.p057a.p061e.C0904n;
import p056c.p057a.p061e.C5008f;
import p056c.p057a.p509d.C5007a;

public final class C0873g {
    public static final /* synthetic */ boolean f2608k = true;
    public final C0914a f2609a;
    public C0870a f2610b;
    public ae f2611c;
    public final C0934j f2612d;
    public final C0925e f2613e;
    public final C0942p f2614f;
    public final C0871f f2615g;
    public C4998c f2616h;
    public boolean f2617i;
    public C0877c f2618j;
    private final Object f2619l;
    private int f2620m;
    private boolean f2621n;
    private boolean f2622o;

    public static final class C0872a extends WeakReference<C0873g> {
        public final Object f2607a;

        C0872a(C0873g c0873g, Object obj) {
            super(c0873g);
            this.f2607a = obj;
        }
    }

    public C0873g(C0934j c0934j, C0914a c0914a, C0925e c0925e, C0942p c0942p, Object obj) {
        this.f2612d = c0934j;
        this.f2609a = c0914a;
        this.f2613e = c0925e;
        this.f2614f = c0942p;
        this.f2615g = new C0871f(c0914a, m2053e(), c0925e, c0942p);
        this.f2619l = obj;
    }

    private C4998c m2050a(int i, int i2, int i3, int i4, boolean z) {
        Socket a;
        List list;
        C4998c c4998c;
        boolean z2;
        ae aeVar;
        synchronized (this.f2612d) {
            boolean z3;
            Socket socket;
            C4998c c4998c2;
            try {
                if (r1.f2622o) {
                    throw new IllegalStateException("released");
                } else if (r1.f2618j != null) {
                    throw new IllegalStateException("codec != null");
                } else if (r1.f2617i) {
                    throw new IOException("Canceled");
                } else {
                    c4998c2 = r1.f2616h;
                    if (f2608k || Thread.holdsLock(r1.f2612d)) {
                        C4998c c4998c3 = r1.f2616h;
                        z3 = true;
                        socket = null;
                        boolean z4 = false;
                        a = (c4998c3 == null || !c4998c3.f13918h) ? null : m2056a(false, false, true);
                        list = r1.f2616h;
                        if (list != null) {
                            c4998c2 = r1.f2616h;
                        } else {
                            list = c4998c2;
                            c4998c2 = null;
                        }
                        if (!r1.f2621n) {
                            list = socket;
                        }
                        if (c4998c2 == null) {
                            C0866a c0866a = C0866a.f2589a;
                            C0934j c0934j = r1.f2612d;
                            int i5 = r1.f2609a;
                            c0866a.mo1008a(c0934j, i5, r1, socket);
                            if (r1.f2616h != null) {
                                c4998c = r1.f2616h;
                                z2 = z3;
                                aeVar = socket;
                            } else {
                                aeVar = r1.f2611c;
                                c4998c = c4998c2;
                            }
                        } else {
                            c4998c = c4998c2;
                            aeVar = socket;
                        }
                        z2 = z4;
                    } else {
                        throw new AssertionError();
                    }
                }
            } finally {
                boolean z5 = 
/*
Method generation error in method: c.a.b.g.a(int, int, int, int, boolean):c.a.b.c
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r0_7 'z5' boolean) = (r0_6 'z5' boolean), (r6_5 boolean) in method: c.a.b.g.a(int, int, int, int, boolean):c.a.b.c
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:297)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:227)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 28 more

*/

                /* JADX WARNING: inconsistent code. */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private p056c.p057a.p059b.C4998c m2051a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
                    /*
                    r3 = this;
                L_0x0000:
                    r0 = r3.m2050a(r4, r5, r6, r7, r8);
                    r1 = r3.f2612d;
                    monitor-enter(r1);
                    r2 = r0.f13919i;	 Catch:{ all -> 0x0019 }
                    if (r2 != 0) goto L_0x000d;
                L_0x000b:
                    monitor-exit(r1);	 Catch:{ all -> 0x0019 }
                    return r0;
                L_0x000d:
                    monitor-exit(r1);	 Catch:{ all -> 0x0019 }
                    r1 = r0.m10095a(r9);
                    if (r1 != 0) goto L_0x0018;
                L_0x0014:
                    r3.m2062d();
                    goto L_0x0000;
                L_0x0018:
                    return r0;
                L_0x0019:
                    r4 = move-exception;
                    monitor-exit(r1);	 Catch:{ all -> 0x0019 }
                    throw r4;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: c.a.b.g.a(int, int, int, int, boolean, boolean):c.a.b.c");
                }

                private void m2052a(C4998c c4998c) {
                    int size = c4998c.f13921k.size();
                    for (int i = 0; i < size; i++) {
                        if (((Reference) c4998c.f13921k.get(i)).get() == this) {
                            c4998c.f13921k.remove(i);
                            return;
                        }
                    }
                    throw new IllegalStateException();
                }

                private C0868d m2053e() {
                    return C0866a.f2589a.mo1009a(this.f2612d);
                }

                public final C0877c m2054a() {
                    C0877c c0877c;
                    synchronized (this.f2612d) {
                        c0877c = this.f2618j;
                    }
                    return c0877c;
                }

                public final C0877c m2055a(C5047x c5047x, C0950a c0950a, boolean z) {
                    try {
                        C0877c c5008f;
                        C4998c a = m2051a(c0950a.mo954c(), c0950a.mo955d(), c0950a.mo956e(), c5047x.f14081C, c5047x.f14104y, z);
                        if (a.f13915e != null) {
                            c5008f = new C5008f(c5047x, c0950a, this, a.f13915e);
                        } else {
                            a.f13913c.setSoTimeout(c0950a.mo955d());
                            a.f13916f.mo945a().mo2031a((long) c0950a.mo955d(), TimeUnit.MILLISECONDS);
                            a.f13917g.mo960a().mo2031a((long) c0950a.mo956e(), TimeUnit.MILLISECONDS);
                            c5008f = new C5007a(c5047x, this, a.f13916f, a.f13917g);
                        }
                        synchronized (this.f2612d) {
                            this.f2618j = c5008f;
                        }
                        return c5008f;
                    } catch (IOException e) {
                        throw new C0869e(e);
                    }
                }

                public final Socket m2056a(boolean z, boolean z2, boolean z3) {
                    if (f2608k || Thread.holdsLock(this.f2612d)) {
                        if (z3) {
                            this.f2618j = null;
                        }
                        if (z2) {
                            this.f2622o = true;
                        }
                        if (this.f2616h != null) {
                            if (z) {
                                this.f2616h.f13918h = true;
                            }
                            if (this.f2618j == null && (this.f2622o || this.f2616h.f13918h)) {
                                Socket socket;
                                m2052a(this.f2616h);
                                if (this.f2616h.f13921k.isEmpty()) {
                                    this.f2616h.f13922l = System.nanoTime();
                                    if (C0866a.f2589a.mo1015a(this.f2612d, this.f2616h)) {
                                        socket = this.f2616h.f13913c;
                                        this.f2616h = null;
                                        return socket;
                                    }
                                }
                                socket = null;
                                this.f2616h = null;
                                return socket;
                            }
                        }
                        return null;
                    }
                    throw new AssertionError();
                }

                public final void m2057a(C4998c c4998c, boolean z) {
                    if (!f2608k && !Thread.holdsLock(this.f2612d)) {
                        throw new AssertionError();
                    } else if (this.f2616h != null) {
                        throw new IllegalStateException();
                    } else {
                        this.f2616h = c4998c;
                        this.f2621n = z;
                        c4998c.f13921k.add(new C0872a(this, this.f2619l));
                    }
                }

                public final void m2058a(IOException iOException) {
                    C4998c c4998c;
                    Socket a;
                    synchronized (this.f2612d) {
                        boolean z;
                        if (iOException instanceof C0904n) {
                            C0904n c0904n = (C0904n) iOException;
                            if (c0904n.f2763a == C0887b.REFUSED_STREAM) {
                                this.f2620m++;
                            }
                            if (c0904n.f2763a == C0887b.REFUSED_STREAM) {
                                if (this.f2620m > 1) {
                                }
                                z = false;
                                c4998c = this.f2616h;
                                a = m2056a(z, false, true);
                                if (!(this.f2616h == null && this.f2621n)) {
                                    c4998c = null;
                                }
                            }
                        } else {
                            if (this.f2616h != null && (!this.f2616h.m10096b() || (iOException instanceof C0886a))) {
                                if (this.f2616h.f13919i == 0) {
                                    if (!(this.f2611c == null || iOException == null)) {
                                        C0871f c0871f = this.f2615g;
                                        ae aeVar = this.f2611c;
                                        if (!(aeVar.f2838b.type() == Type.DIRECT || c0871f.f2599a.f2791g == null)) {
                                            c0871f.f2599a.f2791g.connectFailed(c0871f.f2599a.f2785a.m2369b(), aeVar.f2838b.address(), iOException);
                                        }
                                        c0871f.f2600b.m2041a(aeVar);
                                    }
                                }
                                z = true;
                                c4998c = this.f2616h;
                                a = m2056a(z, false, true);
                                c4998c = null;
                            }
                            z = false;
                            c4998c = this.f2616h;
                            a = m2056a(z, false, true);
                            c4998c = null;
                        }
                        this.f2611c = null;
                        z = true;
                        c4998c = this.f2616h;
                        a = m2056a(z, false, true);
                        c4998c = null;
                    }
                    C0885c.m2099a(a);
                    if (c4998c != null) {
                        C0942p.m2326j();
                    }
                }

                public final void m2059a(boolean z, C0877c c0877c, IOException iOException) {
                    C4998c c4998c;
                    Socket a;
                    C0942p.m2334r();
                    synchronized (this.f2612d) {
                        if (c0877c != null) {
                            if (c0877c == this.f2618j) {
                                if (!z) {
                                    c4998c = this.f2616h;
                                    c4998c.f13919i++;
                                }
                                c4998c = this.f2616h;
                                a = m2056a(z, false, true);
                                if (this.f2616h != null) {
                                    c4998c = null;
                                }
                                boolean z2 = this.f2622o;
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder("expected ");
                        stringBuilder.append(this.f2618j);
                        stringBuilder.append(" but was ");
                        stringBuilder.append(c0877c);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    C0885c.m2099a(a);
                    if (c4998c != null) {
                        C0942p.m2326j();
                    }
                    if (iOException != null) {
                        C0942p.m2336t();
                        return;
                    }
                    if (z2) {
                        C0942p.m2335s();
                    }
                }

                public final synchronized C4998c m2060b() {
                    return this.f2616h;
                }

                public final void m2061c() {
                    Socket a;
                    synchronized (this.f2612d) {
                        C4998c c4998c = this.f2616h;
                        a = m2056a(false, true, false);
                        if (this.f2616h != null) {
                            c4998c = null;
                        }
                    }
                    C0885c.m2099a(a);
                    if (c4998c != null) {
                        C0942p.m2326j();
                    }
                }

                public final void m2062d() {
                    Socket a;
                    synchronized (this.f2612d) {
                        C4998c c4998c = this.f2616h;
                        a = m2056a(true, false, false);
                        if (this.f2616h != null) {
                            c4998c = null;
                        }
                    }
                    C0885c.m2099a(a);
                    if (c4998c != null) {
                        C0942p.m2326j();
                    }
                }

                public final String toString() {
                    C4998c b = m2060b();
                    return b != null ? b.toString() : this.f2609a.toString();
                }
            }
