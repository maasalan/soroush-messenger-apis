package com.p085c.p086a.p109i;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class C1268e<T, Y> {
    private final LinkedHashMap<T, Y> f3972a = new LinkedHashMap(100, 0.75f, true);
    private final int f3973b;
    private int f3974c;
    private int f3975d = 0;

    public C1268e(int i) {
        this.f3973b = i;
        this.f3974c = i;
    }

    private void m2999c() {
        m3007b(this.f3974c);
    }

    protected int mo1148a(Y y) {
        return 1;
    }

    public final void m3001a() {
        m3007b(0);
    }

    public final synchronized void m3002a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f3974c = Math.round(((float) this.f3973b) * f);
        m2999c();
    }

    public void mo1153a(T t, Y y) {
    }

    public final synchronized int m3004b() {
        return this.f3975d;
    }

    public final synchronized Y m3005b(T t) {
        return this.f3972a.get(t);
    }

    public final synchronized Y m3006b(T t, Y y) {
        if (mo1148a((Object) y) >= this.f3974c) {
            mo1153a(t, y);
            return null;
        }
        Object put = this.f3972a.put(t, y);
        if (y != null) {
            this.f3975d += mo1148a((Object) y);
        }
        if (put != null) {
            this.f3975d -= mo1148a(put);
        }
        m2999c();
        return put;
    }

    protected final synchronized void m3007b(int i) {
        while (this.f3975d > i) {
            Entry entry = (Entry) this.f3972a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f3975d -= mo1148a(value);
            Object key = entry.getKey();
            this.f3972a.remove(key);
            mo1153a(key, value);
        }
    }

    public final synchronized Y m3008c(T t) {
        Object remove;
        remove = this.f3972a.remove(t);
        if (remove != null) {
            this.f3975d -= mo1148a(remove);
        }
        return remove;
    }
}
