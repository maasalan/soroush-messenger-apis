package p000a.p001a.p002a;

import java.util.ArrayList;
import java.util.List;

final class C0010h {
    private static final List<C0010h> f47d = new ArrayList();
    Object f48a;
    C0015m f49b;
    C0010h f50c;

    private C0010h(Object obj, C0015m c0015m) {
        this.f48a = obj;
        this.f49b = c0015m;
    }

    static C0010h m10a(C0015m c0015m, Object obj) {
        synchronized (f47d) {
            int size = f47d.size();
            if (size > 0) {
                C0010h c0010h = (C0010h) f47d.remove(size - 1);
                c0010h.f48a = obj;
                c0010h.f49b = c0015m;
                c0010h.f50c = null;
                return c0010h;
            }
            return new C0010h(obj, c0015m);
        }
    }

    static void m11a(C0010h c0010h) {
        c0010h.f48a = null;
        c0010h.f49b = null;
        c0010h.f50c = null;
        synchronized (f47d) {
            if (f47d.size() < 10000) {
                f47d.add(c0010h);
            }
        }
    }
}
