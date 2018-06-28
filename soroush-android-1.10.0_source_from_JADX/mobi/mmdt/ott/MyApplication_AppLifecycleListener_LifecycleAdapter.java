package mobi.mmdt.ott;

import android.arch.lifecycle.C0090c;
import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0100k;
import mobi.mmdt.ott.MyApplication.AppLifecycleListener;

public class MyApplication_AppLifecycleListener_LifecycleAdapter implements C0090c {
    final AppLifecycleListener f15921a;

    MyApplication_AppLifecycleListener_LifecycleAdapter(AppLifecycleListener appLifecycleListener) {
        this.f15921a = appLifecycleListener;
    }

    public final void mo2136a(C0091a c0091a, boolean z, C0100k c0100k) {
        Object obj = c0100k != null ? 1 : null;
        if (!z) {
            if (c0091a == C0091a.ON_START) {
                if (obj == null || c0100k.m179a("onMoveToForeground")) {
                    this.f15921a.onMoveToForeground();
                }
                return;
            }
            if (c0091a == C0091a.ON_STOP && (obj == null || c0100k.m179a("onMoveToBackground"))) {
                this.f15921a.onMoveToBackground();
            }
        }
    }
}
