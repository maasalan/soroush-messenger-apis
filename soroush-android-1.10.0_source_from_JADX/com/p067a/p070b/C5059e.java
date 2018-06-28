package com.p067a.p070b;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class C5059e implements C0995q {
    private final Executor f14136a;

    private class C0982a implements Runnable {
        final /* synthetic */ C5059e f3160a;
        private final C0989n f3161b;
        private final C0994p f3162c;
        private final Runnable f3163d;

        public C0982a(C5059e c5059e, C0989n c0989n, C0994p c0994p, Runnable runnable) {
            this.f3160a = c5059e;
            this.f3161b = c0989n;
            this.f3162c = c0994p;
            this.f3163d = runnable;
        }

        public final void run() {
            if (this.f3161b.isCanceled()) {
                this.f3161b.finish("canceled-at-delivery");
                return;
            }
            if ((this.f3162c.f3196c == null ? 1 : null) != null) {
                this.f3161b.deliverResponse(this.f3162c.f3194a);
            } else {
                this.f3161b.deliverError(this.f3162c.f3196c);
            }
            if (this.f3162c.f3197d) {
                this.f3161b.addMarker("intermediate-response");
            } else {
                this.f3161b.finish("done");
            }
            if (this.f3163d != null) {
                this.f3163d.run();
            }
        }
    }

    public C5059e(final Handler handler) {
        this.f14136a = new Executor(this) {
            final /* synthetic */ C5059e f3159b;

            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public final void mo1046a(C0989n<?> c0989n, C0994p<?> c0994p) {
        mo1047a(c0989n, c0994p, null);
    }

    public final void mo1047a(C0989n<?> c0989n, C0994p<?> c0994p, Runnable runnable) {
        c0989n.markDelivered();
        c0989n.addMarker("post-response");
        this.f14136a.execute(new C0982a(this, c0989n, c0994p, runnable));
    }

    public final void mo1048a(C0989n<?> c0989n, C0997u c0997u) {
        c0989n.addMarker("post-error");
        this.f14136a.execute(new C0982a(this, c0989n, C0994p.m2445a(c0997u), null));
    }
}
