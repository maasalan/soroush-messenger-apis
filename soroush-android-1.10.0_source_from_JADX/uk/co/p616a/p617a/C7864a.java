package uk.co.p616a.p617a;

import android.os.Build.VERSION;
import android.view.View;

public final class C7864a {
    public static void m22163a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }
}
