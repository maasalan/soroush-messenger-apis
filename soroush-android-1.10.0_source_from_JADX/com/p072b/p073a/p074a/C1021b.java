package com.p072b.p073a.p074a;

import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1034c;
import com.p072b.p073a.p074a.p079f.C1037f;
import com.p072b.p073a.p074a.p079f.C1038i;
import com.p072b.p073a.p074a.p079f.C5088h;
import com.p072b.p073a.p074a.p079f.p511a.C5077b;
import com.p072b.p073a.p074a.p079f.p511a.C5080e;
import com.p072b.p073a.p074a.p079f.p511a.C5083h;
import com.p072b.p073a.p074a.p084j.C1065b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class C1021b {
    final C5088h f3302a;
    final CopyOnWriteArrayList<Object> f3303b;
    final C1034c f3304c;
    final C1065b f3305d;
    final AtomicBoolean f3306e = new AtomicBoolean(false);
    private final AtomicInteger f3307f = new AtomicInteger(0);

    class C10181 implements Runnable {
        final /* synthetic */ C1021b f3282a;

        class C50701 extends C1037f {
            long f14166a = Long.MIN_VALUE;
            final /* synthetic */ C10181 f14167b;

            C50701(C10181 c10181) {
                this.f14167b = c10181;
            }

            public final void mo1074a() {
            }

            public final void mo1075a(C1033b c1033b) {
                if (c1033b.f3337a == C1038i.f3342a) {
                    C5077b c5077b = (C5077b) c1033b;
                    C1021b c1021b = this.f14167b.f3282a;
                    Iterator it;
                    switch (c5077b.f14175d) {
                        case 1:
                            it = c1021b.f3303b.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        case 2:
                            it = c1021b.f3303b.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        case 3:
                            it = c1021b.f3303b.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        case 4:
                            it = c1021b.f3303b.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        case 5:
                            it = c1021b.f3303b.iterator();
                            while (it.hasNext()) {
                                it.next();
                            }
                            break;
                        default:
                            break;
                    }
                    this.f14166a = this.f14167b.f3282a.f3305d.mo1091a();
                } else if (c1033b.f3337a == C1038i.f3343b) {
                    this.f14167b.f3282a.m2493a();
                    this.f14166a = this.f14167b.f3282a.f3305d.mo1091a();
                } else if (c1033b.f3337a == C1038i.f3345d) {
                    C5080e c5080e = (C5080e) c1033b;
                    int i = c5080e.f14185d;
                    if (i == 1) {
                        this.f14167b.f3282a.f3302a.m10373a();
                        this.f14167b.f3282a.f3306e.set(false);
                        return;
                    }
                    if (i == 3) {
                        c5080e.f14186e.run();
                    }
                } else {
                    if (c1033b.f3337a == C1038i.f3346e) {
                        ((C5083h) c1033b).f14190d.mo1095a(0);
                    }
                }
            }
        }

        C10181(C1021b c1021b) {
            this.f3282a = c1021b;
        }

        public final void run() {
            this.f3282a.f3302a.m10375a(new C50701(this));
        }
    }

    public C1021b(C1034c c1034c, C1065b c1065b) {
        this.f3305d = c1065b;
        this.f3302a = new C5088h(c1065b, c1034c, "jq_callback");
        this.f3303b = new CopyOnWriteArrayList();
        this.f3304c = c1034c;
    }

    final void m2493a() {
        if (!this.f3306e.getAndSet(true)) {
            new Thread(new C10181(this), "job-manager-callbacks").start();
        }
    }

    public final void m2494a(C1063i c1063i) {
        if (m2496b()) {
            C1033b c1033b = (C5077b) this.f3304c.m2518a(C5077b.class);
            c1033b.m10358a(c1063i, 4);
            this.f3302a.mo1082a(c1033b);
        }
    }

    public final void m2495a(C1063i c1063i, boolean z, Throwable th) {
        if (m2496b()) {
            C1033b c1033b = (C5077b) this.f3304c.m2518a(C5077b.class);
            c1033b.f14175d = 3;
            c1033b.f14177f = z;
            c1033b.f14178g = c1063i;
            c1033b.f14179h = th;
            this.f3302a.mo1082a(c1033b);
        }
    }

    final boolean m2496b() {
        return this.f3307f.get() > 0;
    }
}
