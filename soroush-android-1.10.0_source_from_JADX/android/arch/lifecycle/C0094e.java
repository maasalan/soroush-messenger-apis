package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0093d.C0092b;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0390k;
import android.support.v4.app.C0390k.C0389b;
import android.support.v4.app.C7249g;
import android.support.v4.app.Fragment;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

final class C0094e {
    private static AtomicBoolean f386a = new AtomicBoolean(false);

    static class C4677b extends C0089b {
        private final C4678c f12872a = new C4678c();

        C4677b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C7249g) {
                ((C7249g) activity).f20938d.f1422a.f13264f.mo256a(this.f12872a);
            }
            C0105o.m184a(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            if (activity instanceof C7249g) {
                C0094e.m169a((C7249g) activity, C0092b.CREATED);
            }
        }

        public final void onActivityStopped(Activity activity) {
            if (activity instanceof C7249g) {
                C0094e.m169a((C7249g) activity, C0092b.CREATED);
            }
        }
    }

    static class C4678c extends C0389b {
        C4678c() {
        }

        public final void mo30a(Fragment fragment) {
            C0094e.m168a(fragment, C0091a.ON_CREATE);
            if ((fragment instanceof C4680i) && fragment.m8913m().mo253a("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragment.m8913m().mo254a().mo237a(new C6332a(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").mo242c();
            }
        }

        public final void mo31b(Fragment fragment) {
            C0094e.m168a(fragment, C0091a.ON_START);
        }

        public final void mo32c(Fragment fragment) {
            C0094e.m168a(fragment, C0091a.ON_RESUME);
        }
    }

    public static class C6332a extends Fragment {
        private void m14821a(C0091a c0091a) {
            C0094e.m168a(this.f13177E, c0091a);
        }

        public final void mo2480a() {
            super.mo2480a();
            m14821a(C0091a.ON_PAUSE);
        }

        public final void mo2481b() {
            super.mo2481b();
            m14821a(C0091a.ON_STOP);
        }

        public final void mo2482c() {
            super.mo2482c();
            m14821a(C0091a.ON_DESTROY);
        }
    }

    static void m167a(Context context) {
        if (!f386a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C4677b());
        }
    }

    static /* synthetic */ void m168a(Fragment fragment, C0091a c0091a) {
        if (fragment instanceof C4680i) {
            ((C4680i) fragment).m8547a().m8543a(c0091a);
        }
    }

    static /* synthetic */ void m169a(C7249g c7249g, C0092b c0092b) {
        C0094e.m171a((Object) c7249g, c0092b);
        C0094e.m170a(c7249g.f20938d.f1422a.f13264f, c0092b);
    }

    private static void m170a(C0390k c0390k, C0092b c0092b) {
        Collection<Object> e = c0390k.mo263e();
        if (e != null) {
            for (Object obj : e) {
                if (obj != null) {
                    C0094e.m171a(obj, c0092b);
                    if (obj.m8914n()) {
                        C0094e.m170a(obj.m8913m(), c0092b);
                    }
                }
            }
        }
    }

    private static void m171a(Object obj, C0092b c0092b) {
        if (obj instanceof C4680i) {
            ((C4680i) obj).m8547a().m8544a(c0092b);
        }
    }
}
