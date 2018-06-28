package android.support.v13.app;

import android.app.Fragment;
import android.os.Build.VERSION;

public final class C0339a {
    static final C0338e f1293a;

    interface C0338e {
        void mo206a(Fragment fragment, boolean z);
    }

    static class C4759d implements C0338e {
        C4759d() {
        }

        public void mo206a(Fragment fragment, boolean z) {
        }
    }

    static class C6355a extends C4759d {
        C6355a() {
        }

        public void mo206a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    static class C7011b extends C6355a {
        C7011b() {
        }
    }

    static class C7248c extends C7011b {
        C7248c() {
        }

        public final void mo206a(Fragment fragment, boolean z) {
            fragment.setUserVisibleHint(z);
        }
    }

    static {
        C0338e c7248c = VERSION.SDK_INT >= 24 ? new C7248c() : VERSION.SDK_INT >= 23 ? new C7011b() : VERSION.SDK_INT >= 15 ? new C6355a() : new C4759d();
        f1293a = c7248c;
    }

    public static void m663a(Fragment fragment, boolean z) {
        f1293a.mo206a(fragment, z);
    }
}
