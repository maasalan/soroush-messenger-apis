package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0093d.C0091a;
import android.os.Bundle;

public final class C0105o extends Fragment {
    C0104a f395a;

    interface C0104a {
        void mo36a();

        void mo37b();
    }

    public static void m184a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0105o(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void m185a(C0091a c0091a) {
        Activity activity = getActivity();
        if (activity instanceof C4680i) {
            ((C4680i) activity).m8547a().m8543a(c0091a);
            return;
        }
        if (activity instanceof C0096g) {
            C0093d d = ((C0096g) activity).mo39d();
            if (d instanceof C4679h) {
                ((C4679h) d).m8543a(c0091a);
            }
        }
    }

    static C0105o m186b(Activity activity) {
        return (C0105o) activity.getFragmentManager().findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m185a(C0091a.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        m185a(C0091a.ON_DESTROY);
        this.f395a = null;
    }

    public final void onPause() {
        super.onPause();
        m185a(C0091a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        C0104a c0104a = this.f395a;
        if (c0104a != null) {
            c0104a.mo37b();
        }
        m185a(C0091a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        C0104a c0104a = this.f395a;
        if (c0104a != null) {
            c0104a.mo36a();
        }
        m185a(C0091a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        m185a(C0091a.ON_STOP);
    }
}
