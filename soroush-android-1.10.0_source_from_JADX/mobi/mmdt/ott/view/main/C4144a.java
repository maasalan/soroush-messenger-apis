package mobi.mmdt.ott.view.main;

import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import mobi.mmdt.ott.view.components.p400b.C3110a;
import mobi.mmdt.ott.view.components.p400b.C3110a.C6060a;
import mobi.mmdt.ott.view.components.p400b.p528c.C6062a;
import mobi.mmdt.ott.view.components.p400b.p529d.C6064b;
import mobi.mmdt.ott.view.components.p400b.p530e.p531a.C6067a;
import mobi.mmdt.ott.view.components.p400b.p530e.p532b.C6068a;

public final class C4144a {
    public static void m8004a(View view) {
        C6060a a = C3110a.m7562a(new mobi.mmdt.ott.view.components.p400b.p526a.C6060a());
        a.f9674c = 750;
        a.f9676e = new AccelerateDecelerateInterpolator();
        a.m7561a(view);
    }

    public static void m8005a(final View... viewArr) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                for (View a : viewArr) {
                    C4144a.m8004a(a);
                }
            }
        }, 100);
    }

    public static void m8006b(View view) {
        C6060a a = C3110a.m7562a(new C6067a());
        a.f9674c = 500;
        a.f9676e = new AccelerateDecelerateInterpolator();
        a.m7561a(view);
    }

    public static void m8007c(View view) {
        C6060a a = C3110a.m7562a(new C6068a());
        a.f9674c = 500;
        a.f9676e = new AccelerateDecelerateInterpolator();
        a.m7561a(view);
    }

    public static void m8008d(View view) {
        C6060a a = C3110a.m7562a(new C6062a());
        a.f9674c = 250;
        a.m7561a(view);
    }

    public static void m8009e(View view) {
        C6060a a = C3110a.m7562a(new C6064b());
        a.f9674c = 500;
        a.f9676e = new AccelerateDecelerateInterpolator();
        a.m7561a(view);
    }
}
