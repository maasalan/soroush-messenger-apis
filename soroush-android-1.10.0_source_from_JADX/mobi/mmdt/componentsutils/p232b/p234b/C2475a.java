package mobi.mmdt.componentsutils.p232b.p234b;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v7.app.C0662a;
import android.support.v7.app.C7406c;
import android.view.Window;

public final class C2475a {
    public static void m6719a(Activity activity, String str) {
        C0662a a = ((C7406c) activity).m19694f().mo457a();
        if (a != null) {
            a.mo470a((CharSequence) str);
        }
    }

    public static void m6720a(Window window, int i) {
        if (window != null && VERSION.SDK_INT >= 21) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i);
        }
    }

    public static void m6721b(Activity activity, String str) {
        C0662a a = ((C7406c) activity).m19694f().mo457a();
        if (a != null) {
            if (str == null) {
                a.mo475b(null);
                return;
            }
            a.mo475b((CharSequence) str);
        }
    }
}
