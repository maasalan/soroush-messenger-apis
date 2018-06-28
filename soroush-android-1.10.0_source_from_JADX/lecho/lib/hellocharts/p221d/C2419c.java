package lecho.lib.hellocharts.p221d;

import android.graphics.PointF;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.p219b.C2410a;

public final class C2419c {
    C2422f f7992a = new C2422f();
    C2421e f7993b;
    PointF f7994c = new PointF();
    PointF f7995d = new PointF();
    Viewport f7996e = new Viewport();

    public C2419c(C2421e c2421e) {
        this.f7993b = c2421e;
    }

    final void m6617a(C2410a c2410a, float f, float f2, float f3, float f4) {
        Viewport d = c2410a.m6594d();
        if (C2421e.HORIZONTAL_AND_VERTICAL == this.f7993b) {
            c2410a.m6580a(f, f2, f3, f4);
        } else if (C2421e.HORIZONTAL == this.f7993b) {
            c2410a.m6580a(f, d.f8051b, f3, d.f8053d);
        } else {
            if (C2421e.VERTICAL == this.f7993b) {
                c2410a.m6580a(d.f8050a, f2, d.f8052c, f4);
            }
        }
    }
}
