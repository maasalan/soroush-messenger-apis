package mobi.mmdt.componentsutils.p232b;

import android.graphics.Point;

public final class C2489g {
    private static C2489g f8166b;
    public Point f8167a;

    public static C2489g m6754a() {
        if (f8166b == null) {
            f8166b = new C2489g();
        }
        return f8166b;
    }

    public final int m6755a(float f) {
        return (int) (((float) this.f8167a.x) * f);
    }

    public final int m6756b(float f) {
        return (int) (((float) this.f8167a.y) * f);
    }
}
