package com.p111d.p112a.p121c.p138m;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public final class C1532l<K, V> implements Serializable {
    protected final transient int f4775a;
    protected final transient ConcurrentHashMap<K, V> f4776b;

    public C1532l(int i, int i2) {
        this.f4776b = new ConcurrentHashMap(i, 0.8f, 4);
        this.f4775a = i2;
    }

    public final V m3999a(Object obj) {
        return this.f4776b.get(obj);
    }

    public final V m4000a(K k, V v) {
        if (this.f4776b.size() >= this.f4775a) {
            synchronized (this) {
                if (this.f4776b.size() >= this.f4775a) {
                    this.f4776b.clear();
                }
            }
        }
        return this.f4776b.put(k, v);
    }

    public final V m4001b(K k, V v) {
        if (this.f4776b.size() >= this.f4775a) {
            synchronized (this) {
                if (this.f4776b.size() >= this.f4775a) {
                    this.f4776b.clear();
                }
            }
        }
        return this.f4776b.putIfAbsent(k, v);
    }
}
