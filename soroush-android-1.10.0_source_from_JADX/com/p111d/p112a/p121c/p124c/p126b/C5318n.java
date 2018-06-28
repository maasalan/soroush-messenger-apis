package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.C7082k;

public final class C5318n extends C1443v {
    private static final long m11154a(Object obj) {
        return obj == null ? 0 : ((Number) obj).longValue();
    }

    private static C7082k m11155a(String str, C5354j c5354j, int i) {
        return new C7082k(C1549v.m4055a(str), c5354j, null, null, null, null, i, null, C1548u.f4828a);
    }

    private static final int m11156b(Object obj) {
        return obj == null ? 0 : ((Number) obj).intValue();
    }

    public final Object mo1319a(C5347g c5347g, Object[] objArr) {
        return new C1375h(objArr[0], C5318n.m11154a(objArr[1]), C5318n.m11154a(objArr[2]), C5318n.m11156b(objArr[3]), C5318n.m11156b(objArr[4]));
    }

    public final String mo1301a() {
        return C1375h.class.getName();
    }

    public final C6488s[] mo1320a(C7089f c7089f) {
        C5354j b = c7089f.m11079b(Integer.TYPE);
        C5354j b2 = c7089f.m11079b(Long.TYPE);
        return new C6488s[]{C5318n.m11155a("sourceRef", c7089f.m11079b(Object.class), 0), C5318n.m11155a("byteOffset", b2, 1), C5318n.m11155a("charOffset", b2, 2), C5318n.m11155a("lineNr", b, 3), C5318n.m11155a("columnNr", b, 4)};
    }

    public final boolean mo1329k() {
        return true;
    }
}
