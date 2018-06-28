package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p124c.C6488s;
import java.util.HashMap;

public final class C1417o {
    protected final C1443v f4481a;
    protected final HashMap<String, C6488s> f4482b = new HashMap();
    protected final int f4483c;
    protected final C6488s[] f4484d;

    private C1417o(C1443v c1443v, C6488s[] c6488sArr) {
        this.f4481a = c1443v;
        int length = c6488sArr.length;
        this.f4483c = length;
        this.f4484d = new C6488s[length];
        for (int i = 0; i < length; i++) {
            C6488s c6488s = c6488sArr[i];
            this.f4484d[i] = c6488s;
            this.f4482b.put(c6488s.m15554f(), c6488s);
        }
    }

    public static C1417o m3494a(C5347g c5347g, C1443v c1443v, C6488s[] c6488sArr) {
        int length = c6488sArr.length;
        C6488s[] c6488sArr2 = new C6488s[length];
        for (int i = 0; i < length; i++) {
            C6488s c6488s = c6488sArr[i];
            if (!c6488s.m15559k()) {
                c6488s = c6488s.mo3333a(c5347g.m11437a(c6488s.mo1350a(), (C1446d) c6488s));
            }
            c6488sArr2[i] = c6488s;
        }
        return new C1417o(c1443v, c6488sArr2);
    }

    public final C1419r m3495a(C5303j c5303j, C5347g c5347g, C1416l c1416l) {
        return new C1419r(c5303j, c5347g, this.f4483c, c1416l);
    }

    public final C6488s m3496a(String str) {
        return (C6488s) this.f4482b.get(str);
    }

    public final Object m3497a(C5347g c5347g, C1419r c1419r) {
        Object a = this.f4481a.mo1319a(c5347g, c1419r.m3506a(this.f4484d));
        if (a != null) {
            a = c1419r.m3501a(c5347g, a);
            for (C1418q a2 = c1419r.m3500a(); a2 != null; a2 = a2.f4485a) {
                a2.mo1306a(a);
            }
        }
        return a;
    }
}
