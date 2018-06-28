package com.p072b.p073a.p074a;

import com.p072b.p073a.p074a.C1059h.C1047a;
import com.p072b.p073a.p074a.p075b.C1020a;
import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.C1034c;
import com.p072b.p073a.p074a.p079f.C1036e;
import com.p072b.p073a.p074a.p079f.C5087g;
import com.p072b.p073a.p074a.p079f.p511a.C5076a;
import com.p072b.p073a.p074a.p083i.C1061a;
import com.p072b.p073a.p074a.p083i.C1061a.C1060a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class C1067k {
    public static final long f3482a = TimeUnit.MILLISECONDS.toNanos(10000);
    final C5098l f3483b;
    public final C5087g f3484c;
    public final C1034c f3485d = new C1034c();
    public Thread f3486e;
    private C1061a f3487f;

    class C50951 implements C1060a {
        final /* synthetic */ C1067k f14225a;

        C50951(C1067k c1067k) {
            this.f14225a = c1067k;
        }
    }

    static class C5096a<T extends C1033b & C1047a> implements C1059h, Future<Integer> {
        final C1036e f14226a;
        volatile Integer f14227b = null;
        final CountDownLatch f14228c = new CountDownLatch(1);
        final T f14229d;

        public C5096a(C1036e c1036e, T t) {
            this.f14226a = c1036e;
            this.f14229d = t;
            ((C1047a) t).mo1081a(this);
        }

        private Integer m10409b() {
            this.f14226a.mo1082a(this.f14229d);
            this.f14228c.await();
            return this.f14227b;
        }

        public final Integer m10410a() {
            try {
                return m10409b();
            } catch (Throwable th) {
                C1028b.m2505a(th, "message is not complete", new Object[0]);
                RuntimeException runtimeException = new RuntimeException("cannot get the result of the JobManager query");
            }
        }

        public final void mo1095a(int i) {
            this.f14227b = Integer.valueOf(i);
            this.f14228c.countDown();
        }

        public final boolean cancel(boolean z) {
            return false;
        }

        public final /* synthetic */ Object get() {
            return m10409b();
        }

        public final /* synthetic */ Object get(long j, TimeUnit timeUnit) {
            this.f14226a.mo1082a(this.f14229d);
            this.f14228c.await(j, timeUnit);
            return this.f14227b;
        }

        public final boolean isCancelled() {
            return false;
        }

        public final boolean isDone() {
            return this.f14228c.getCount() == 0;
        }
    }

    public C1067k(C1020a c1020a) {
        this.f3484c = new C5087g(c1020a.f3295k, this.f3485d);
        this.f3483b = new C5098l(c1020a, this.f3484c, this.f3485d);
        this.f3486e = new Thread(this.f3483b, "job-manager");
        if (c1020a.f3296l != null) {
            this.f3487f = c1020a.f3296l;
            c1020a.f3296l.mo1071a(c1020a.f3290f, new C50951(this));
        }
        this.f3486e.start();
    }

    public final void m2577a(C1063i c1063i) {
        C1033b c1033b = (C5076a) this.f3485d.m2518a(C5076a.class);
        c1033b.f14174d = c1063i;
        this.f3484c.mo1082a(c1033b);
    }
}
