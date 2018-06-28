package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0105o.C0104a;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

public final class C4683n implements C0096g {
    private static final C4683n f12882i = new C4683n();
    int f12883a = 0;
    int f12884b = 0;
    boolean f12885c = true;
    boolean f12886d = true;
    Handler f12887e;
    final C4679h f12888f = new C4679h(this);
    Runnable f12889g = new C01031(this);
    private C0104a f12890h = new C46812(this);

    class C01031 implements Runnable {
        final /* synthetic */ C4683n f394a;

        C01031(C4683n c4683n) {
            this.f394a = c4683n;
        }

        public final void run() {
            C4683n.m8551a(this.f394a);
            this.f394a.m8555b();
        }
    }

    class C46812 implements C0104a {
        final /* synthetic */ C4683n f12880a;

        C46812(C4683n c4683n) {
            this.f12880a = c4683n;
        }

        public final void mo36a() {
            C4683n c4683n = this.f12880a;
            c4683n.f12883a++;
            if (c4683n.f12883a == 1 && c4683n.f12886d) {
                c4683n.f12888f.m8543a(C0091a.ON_START);
                c4683n.f12886d = false;
            }
        }

        public final void mo37b() {
            C4683n c4683n = this.f12880a;
            c4683n.f12884b++;
            if (c4683n.f12884b == 1) {
                if (c4683n.f12885c) {
                    c4683n.f12888f.m8543a(C0091a.ON_RESUME);
                    c4683n.f12885c = false;
                    return;
                }
                c4683n.f12887e.removeCallbacks(c4683n.f12889g);
            }
        }
    }

    class C46823 extends C0089b {
        final /* synthetic */ C4683n f12881a;

        C46823(C4683n c4683n) {
            this.f12881a = c4683n;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C0105o.m186b(activity).f395a = this.f12881a.f12890h;
        }

        public final void onActivityPaused(Activity activity) {
            C4683n c4683n = this.f12881a;
            c4683n.f12884b--;
            if (c4683n.f12884b == 0) {
                c4683n.f12887e.postDelayed(c4683n.f12889g, 700);
            }
        }

        public final void onActivityStopped(Activity activity) {
            C4683n c4683n = this.f12881a;
            c4683n.f12883a--;
            c4683n.m8555b();
        }
    }

    private C4683n() {
    }

    public static C0096g m8550a() {
        return f12882i;
    }

    static /* synthetic */ void m8551a(C4683n c4683n) {
        if (c4683n.f12884b == 0) {
            c4683n.f12885c = true;
            c4683n.f12888f.m8543a(C0091a.ON_PAUSE);
        }
    }

    static void m8552a(Context context) {
        C4683n c4683n = f12882i;
        c4683n.f12887e = new Handler();
        c4683n.f12888f.m8543a(C0091a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C46823(c4683n));
    }

    final void m8555b() {
        if (this.f12883a == 0 && this.f12885c) {
            this.f12888f.m8543a(C0091a.ON_STOP);
            this.f12886d = true;
        }
    }

    public final C0093d mo39d() {
        return this.f12888f;
    }
}
