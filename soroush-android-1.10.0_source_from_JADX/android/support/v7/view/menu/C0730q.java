package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p033c.p034a.C0441a;
import android.support.v4.p033c.p034a.C0442b;
import android.view.Menu;
import android.view.MenuItem;

public final class C0730q {
    public static Menu m1736a(Context context, C0441a c0441a) {
        return new C6397r(context, c0441a);
    }

    public static MenuItem m1737a(Context context, C0442b c0442b) {
        return VERSION.SDK_INT >= 16 ? new C7025l(context, c0442b) : new C6395k(context, c0442b);
    }
}
