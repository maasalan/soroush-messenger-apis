package mobi.mmdt.ott.view.conversation.p424b;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class C3406c {
    public static void m7858a(Activity activity, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void m7859a(View view) {
        if (view != null) {
            view.requestFocus();
        }
    }

    public static void m7860b(Activity activity, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInputFromWindow(view.getWindowToken(), 0, 0);
        }
        C3406c.m7859a(view);
    }

    public static void m7861c(final Activity activity, final View view) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                C3406c.m7860b(activity, view);
            }
        }, 500);
    }
}
