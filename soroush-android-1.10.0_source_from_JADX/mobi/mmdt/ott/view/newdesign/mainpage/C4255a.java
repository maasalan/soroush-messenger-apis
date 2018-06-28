package mobi.mmdt.ott.view.newdesign.mainpage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.C7247d;
import android.support.v7.app.C7406c;
import com.p072b.p073a.p074a.C1063i;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p357j.C6812d;
import mobi.mmdt.ott.view.streamplayer.C7564a;
import mobi.mmdt.ott.view.tools.C4504d;

public final class C4255a {
    static C6812d m8061a(Activity activity, String str) {
        if (C4504d.m8199a(str)) {
            C4504d.m8198a(activity, str);
            return null;
        }
        C1063i c6812d = new C6812d(str, (byte) 0);
        C2808d.m7147a(c6812d);
        return c6812d;
    }

    static void m8062b(final Activity activity, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("KEY_STREAM_URL", str);
        final C7247d c7564a = new C7564a();
        c7564a.mo3059e(bundle);
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                c7564a.mo3404a(((C7406c) activity).m19188c(), c7564a.f13180H);
            }
        }, 1000);
    }
}
