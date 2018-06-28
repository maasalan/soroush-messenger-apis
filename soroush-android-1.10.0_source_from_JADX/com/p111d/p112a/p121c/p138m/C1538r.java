package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p137l.C1509b;
import java.io.Serializable;

public final class C1538r implements Serializable {
    protected transient C1532l<C1509b, C1549v> f4791a = new C1532l(20, 200);

    public final C1549v m4018a(Class<?> cls, C5306f<?> c5306f) {
        C1509b c1509b = new C1509b(cls);
        C1549v c1549v = (C1549v) this.f4791a.m3999a(c1509b);
        if (c1549v != null) {
            return c1549v;
        }
        C1549v findRootName = c5306f.mo3358a().findRootName(c5306f.m11081c(cls).mo1373c());
        if (findRootName == null || !findRootName.m4061c()) {
            findRootName = C1549v.m4055a(cls.getSimpleName());
        }
        this.f4791a.m4000a(c1509b, findRootName);
        return findRootName;
    }
}
