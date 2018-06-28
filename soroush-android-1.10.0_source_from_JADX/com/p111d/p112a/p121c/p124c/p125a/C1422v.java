package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p138m.C1534n;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.util.ArrayList;
import java.util.List;

public final class C1422v {
    protected final List<C6488s> f4503a;

    public C1422v() {
        this.f4503a = new ArrayList();
    }

    private C1422v(List<C6488s> list) {
        this.f4503a = list;
    }

    public final C1422v m3517a(C1534n c1534n) {
        List arrayList = new ArrayList(this.f4503a.size());
        for (C6488s c6488s : this.f4503a) {
            Object a = c6488s.m15536a(c1534n.mo1482a(c6488s.m15554f()));
            C1507k m = a.m15561m();
            if (m != null) {
                C1507k a2 = m.mo2806a(c1534n);
                if (a2 != m) {
                    a = a.mo3333a(a2);
                }
            }
            arrayList.add(a);
        }
        return new C1422v(arrayList);
    }

    public final Object m3518a(C5347g c5347g, Object obj, C6523u c6523u) {
        int size = this.f4503a.size();
        for (int i = 0; i < size; i++) {
            C6488s c6488s = (C6488s) this.f4503a.get(i);
            C5303j a = c6523u.m15742a();
            a.nextToken();
            c6488s.mo3335a(a, c5347g, obj);
        }
        return obj;
    }

    public final void m3519a(C6488s c6488s) {
        this.f4503a.add(c6488s);
    }
}
