package android.support.design.widget;

import android.support.v4.view.C0571r;
import android.view.View;

final class C0332w {
    int f1274a;
    int f1275b;
    int f1276c;
    private final View f1277d;
    private int f1278e;

    public C0332w(View view) {
        this.f1277d = view;
    }

    public final void m653a() {
        this.f1274a = this.f1277d.getTop();
        this.f1278e = this.f1277d.getLeft();
        m655b();
    }

    public final boolean m654a(int i) {
        if (this.f1275b == i) {
            return false;
        }
        this.f1275b = i;
        m655b();
        return true;
    }

    final void m655b() {
        C0571r.m1359d(this.f1277d, this.f1275b - (this.f1277d.getTop() - this.f1274a));
        C0571r.m1363e(this.f1277d, this.f1276c - (this.f1277d.getLeft() - this.f1278e));
    }
}
