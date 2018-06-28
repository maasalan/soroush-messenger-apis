package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C1439p;
import com.p111d.p112a.p121c.p124c.p126b.C5322y.C5321a;
import com.p111d.p112a.p121c.p124c.p126b.C5322y.C6481b;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1530j;
import java.io.Serializable;

public final class C5323z implements C1439p, Serializable {
    public static C1546p m11193a(C5354j c5354j, C1507k<?> c1507k) {
        return new C5321a(c5354j.m11531e(), c1507k);
    }

    public static C1546p m11194a(C1530j c1530j) {
        return new C6481b(c1530j, null);
    }

    public static C1546p m11195a(C1530j c1530j, C7087f c7087f) {
        return new C6481b(c1530j, c7087f);
    }

    public final C1546p mo1337a(C5354j c5354j) {
        Class e = c5354j.m11531e();
        if (e.isPrimitive()) {
            e = C1527g.m3980o(e);
        }
        return C5322y.m11190a(e);
    }
}
