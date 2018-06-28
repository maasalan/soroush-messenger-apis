package com.p085c.p086a.p089c.p092b;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p092b.C5140f.C1136a;
import com.p085c.p086a.p089c.p092b.p095c.C1130a;
import com.p085c.p086a.p105g.C1249g;
import com.p085c.p086a.p109i.C1273i;
import com.p085c.p086a.p109i.p110a.C1262a.C1260c;
import com.p085c.p086a.p109i.p110a.C1263b;
import com.p085c.p086a.p109i.p110a.C1263b.C5282a;
import java.util.ArrayList;
import java.util.List;

public final class C5150j<R> implements C1136a<R>, C1260c {
    private static final C1150a f14405p = new C1150a();
    private static final Handler f14406q = new Handler(Looper.getMainLooper(), new C1151b());
    public final List<C1249g> f14407a;
    public final C1263b f14408b;
    public final C1152k f14409c;
    public final C1130a f14410d;
    public C1208h f14411e;
    public boolean f14412f;
    public boolean f14413g;
    C1159s<?> f14414h;
    C1102a f14415i;
    public boolean f14416j;
    public boolean f14417k;
    public List<C1249g> f14418l;
    C5152n<?> f14419m;
    public C5140f<R> f14420n;
    public volatile boolean f14421o;
    private final C0479a<C5150j<?>> f14422r;
    private final C1150a f14423s;
    private final C1130a f14424t;
    private final C1130a f14425u;
    private C1156o f14426v;

    static class C1150a {
        C1150a() {
        }
    }

    private static class C1151b implements Callback {
        C1151b() {
        }

        public final boolean handleMessage(android.os.Message r6) {
            /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00b1 in {3, 7, 8, 10, 13, 15, 19, 23, 29, 30} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r5 = this;
            r0 = r6.obj;
            r0 = (com.p085c.p086a.p089c.p092b.C5150j) r0;
            r1 = r6.what;
            r2 = 1;
            switch(r1) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0039;
                case 3: goto L_0x0020;
                default: goto L_0x000a;
            };
        L_0x000a:
            r0 = new java.lang.IllegalStateException;
            r1 = new java.lang.StringBuilder;
            r2 = "Unrecognized message: ";
            r1.<init>(r2);
            r6 = r6.what;
            r1.append(r6);
            r6 = r1.toString();
            r0.<init>(r6);
            throw r0;
        L_0x0020:
            r6 = r0.f14408b;
            r6.mo1247a();
            r6 = r0.f14421o;
            if (r6 != 0) goto L_0x0031;
        L_0x0029:
            r6 = new java.lang.IllegalStateException;
            r0 = "Not cancelled";
            r6.<init>(r0);
            throw r6;
        L_0x0031:
            r6 = r0.f14409c;
            r1 = r0.f14411e;
            r6.mo1172a(r0, r1);
            goto L_0x004b;
        L_0x0039:
            r0.m10617d();
            return r2;
        L_0x003d:
            r6 = r0.f14408b;
            r6.mo1247a();
            r6 = r0.f14421o;
            if (r6 == 0) goto L_0x004f;
        L_0x0046:
            r6 = r0.f14414h;
            r6.mo1182d();
        L_0x004b:
            r0.m10616c();
            return r2;
        L_0x004f:
            r6 = r0.f14407a;
            r6 = r6.isEmpty();
            if (r6 == 0) goto L_0x005f;
        L_0x0057:
            r6 = new java.lang.IllegalStateException;
            r0 = "Received a resource without any callbacks to notify";
            r6.<init>(r0);
            throw r6;
        L_0x005f:
            r6 = r0.f14416j;
            if (r6 == 0) goto L_0x006b;
        L_0x0063:
            r6 = new java.lang.IllegalStateException;
            r0 = "Already have resource";
            r6.<init>(r0);
            throw r6;
        L_0x006b:
            r6 = r0.f14414h;
            r1 = r0.f14412f;
            r3 = new com.c.a.c.b.n;
            r3.<init>(r6, r1);
            r0.f14419m = r3;
            r0.f14416j = r2;
            r6 = r0.f14419m;
            r6.m10623e();
            r6 = r0.f14409c;
            r1 = r0.f14411e;
            r3 = r0.f14419m;
            r6.mo1174a(r1, r3);
            r6 = r0.f14407a;
            r6 = r6.iterator();
        L_0x008c:
            r1 = r6.hasNext();
            if (r1 == 0) goto L_0x00ab;
        L_0x0092:
            r1 = r6.next();
            r1 = (com.p085c.p086a.p105g.C1249g) r1;
            r3 = r0.m10615b(r1);
            if (r3 != 0) goto L_0x008c;
        L_0x009e:
            r3 = r0.f14419m;
            r3.m10623e();
            r3 = r0.f14419m;
            r4 = r0.f14415i;
            r1.mo1234a(r3, r4);
            goto L_0x008c;
        L_0x00ab:
            r6 = r0.f14419m;
            r6.m10624f();
            goto L_0x004b;
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.c.a.c.b.j.b.handleMessage(android.os.Message):boolean");
        }
    }

    C5150j(C1130a c1130a, C1130a c1130a2, C1130a c1130a3, C1152k c1152k, C0479a<C5150j<?>> c0479a) {
        this(c1130a, c1130a2, c1130a3, c1152k, c0479a, f14405p);
    }

    private C5150j(C1130a c1130a, C1130a c1130a2, C1130a c1130a3, C1152k c1152k, C0479a<C5150j<?>> c0479a, C1150a c1150a) {
        this.f14407a = new ArrayList(2);
        this.f14408b = new C5282a();
        this.f14410d = c1130a;
        this.f14424t = c1130a2;
        this.f14425u = c1130a3;
        this.f14409c = c1152k;
        this.f14422r = c0479a;
        this.f14423s = c1150a;
    }

    public final C1130a m10610a() {
        return this.f14413g ? this.f14425u : this.f14424t;
    }

    public final void mo1176a(C5140f<?> c5140f) {
        m10610a().execute(c5140f);
    }

    public final void mo1177a(C1156o c1156o) {
        this.f14426v = c1156o;
        f14406q.obtainMessage(2, this).sendToTarget();
    }

    public final void mo1178a(C1159s<R> c1159s, C1102a c1102a) {
        this.f14414h = c1159s;
        this.f14415i = c1102a;
        f14406q.obtainMessage(1, this).sendToTarget();
    }

    public final void m10614a(C1249g c1249g) {
        C1273i.m3021a();
        this.f14408b.mo1247a();
        if (this.f14416j) {
            c1249g.mo1234a(this.f14419m, this.f14415i);
        } else if (this.f14417k) {
            c1249g.mo1233a(this.f14426v);
        } else {
            this.f14407a.add(c1249g);
        }
    }

    final boolean m10615b(C1249g c1249g) {
        return this.f14418l != null && this.f14418l.contains(c1249g);
    }

    public final C1263b b_() {
        return this.f14408b;
    }

    final void m10616c() {
        C1273i.m3021a();
        this.f14407a.clear();
        this.f14411e = null;
        this.f14419m = null;
        this.f14414h = null;
        if (this.f14418l != null) {
            this.f14418l.clear();
        }
        this.f14417k = false;
        this.f14421o = false;
        this.f14416j = false;
        C5140f c5140f = this.f14420n;
        if (c5140f.f14369d.m2750a()) {
            c5140f.m10577a();
        }
        this.f14420n = null;
        this.f14426v = null;
        this.f14415i = null;
        this.f14422r.mo309a(this);
    }

    final void m10617d() {
        this.f14408b.mo1247a();
        if (this.f14421o) {
            m10616c();
        } else if (this.f14407a.isEmpty()) {
            throw new IllegalStateException("Received an exception without any callbacks to notify");
        } else if (this.f14417k) {
            throw new IllegalStateException("Already failed once");
        } else {
            this.f14417k = true;
            this.f14409c.mo1174a(this.f14411e, null);
            for (C1249g c1249g : this.f14407a) {
                if (!m10615b(c1249g)) {
                    c1249g.mo1233a(this.f14426v);
                }
            }
            m10616c();
        }
    }
}
