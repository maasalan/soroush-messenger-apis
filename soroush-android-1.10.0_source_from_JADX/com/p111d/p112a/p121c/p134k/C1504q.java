package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p134k.p135a.C1488l;
import com.p111d.p112a.p121c.p138m.C1542v;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class C1504q {
    public final HashMap<C1542v, C1545o<Object>> f4678a = new HashMap(64);
    public final AtomicReference<C1488l> f4679b = new AtomicReference();

    public final synchronized C1488l m3871a() {
        C1488l c1488l;
        c1488l = (C1488l) this.f4679b.get();
        if (c1488l == null) {
            C1488l c1488l2 = new C1488l(this.f4678a);
            this.f4679b.set(c1488l2);
            c1488l = c1488l2;
        }
        return c1488l;
    }

    public final C1545o<Object> m3872a(C5354j c5354j) {
        C1545o<Object> c1545o;
        synchronized (this) {
            c1545o = (C1545o) this.f4678a.get(new C1542v(c5354j, false));
        }
        return c1545o;
    }

    public final C1545o<Object> m3873a(Class<?> cls) {
        C1545o<Object> c1545o;
        synchronized (this) {
            c1545o = (C1545o) this.f4678a.get(new C1542v((Class) cls, false));
        }
        return c1545o;
    }

    public final C1545o<Object> m3874b(C5354j c5354j) {
        C1545o<Object> c1545o;
        synchronized (this) {
            c1545o = (C1545o) this.f4678a.get(new C1542v(c5354j, true));
        }
        return c1545o;
    }

    public final C1545o<Object> m3875b(Class<?> cls) {
        C1545o<Object> c1545o;
        synchronized (this) {
            c1545o = (C1545o) this.f4678a.get(new C1542v((Class) cls, true));
        }
        return c1545o;
    }
}
