package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

public final class C0566o {
    Object f1861a;

    private C0566o(Object obj) {
        this.f1861a = obj;
    }

    public static C0566o m1271a(Context context) {
        return VERSION.SDK_INT >= 24 ? new C0566o(PointerIcon.getSystemIcon(context, 1002)) : new C0566o(null);
    }
}
