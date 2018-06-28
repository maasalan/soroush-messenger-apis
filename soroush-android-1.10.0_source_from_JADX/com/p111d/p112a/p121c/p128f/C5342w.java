package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p137l.C1509b;
import java.io.Serializable;
import java.util.Map;

public final class C5342w implements C1452a, Serializable {
    protected final C1452a f14844a = null;
    protected Map<C1509b, Class<?>> f14845b;

    public final Class<?> mo1424g(Class<?> cls) {
        Class<?> g = this.f14844a == null ? null : this.f14844a.mo1424g(cls);
        return (g != null || this.f14845b == null) ? g : (Class) this.f14845b.get(new C1509b(cls));
    }
}
