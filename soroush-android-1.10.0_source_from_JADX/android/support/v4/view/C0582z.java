package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

public final class C0582z {
    public final Object f1887a;

    private C0582z(Object obj) {
        this.f1887a = obj;
    }

    static C0582z m1424a(Object obj) {
        return obj == null ? null : new C0582z(obj);
    }

    static Object m1425a(C0582z c0582z) {
        return c0582z == null ? null : c0582z.f1887a;
    }

    public final int m1426a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1887a).getSystemWindowInsetLeft() : 0;
    }

    public final C0582z m1427a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new C0582z(((WindowInsets) this.f1887a).replaceSystemWindowInsets(i, i2, i3, i4)) : null;
    }

    public final int m1428b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1887a).getSystemWindowInsetTop() : 0;
    }

    public final int m1429c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1887a).getSystemWindowInsetRight() : 0;
    }

    public final int m1430d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1887a).getSystemWindowInsetBottom() : 0;
    }

    public final boolean m1431e() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.f1887a).isConsumed() : false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0582z c0582z = (C0582z) obj;
        return this.f1887a == null ? c0582z.f1887a == null : this.f1887a.equals(c0582z.f1887a);
    }

    public final C0582z m1432f() {
        return VERSION.SDK_INT >= 20 ? new C0582z(((WindowInsets) this.f1887a).consumeSystemWindowInsets()) : null;
    }

    public final int hashCode() {
        return this.f1887a == null ? 0 : this.f1887a.hashCode();
    }
}
