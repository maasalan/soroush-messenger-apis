package org.p501b.p507c.p508a;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public final class C6312c<K, V> extends LinkedHashMap<K, V> implements C4621a<K, V> {
    public int f17253a;
    private final AtomicLong f17254b;
    private final AtomicLong f17255c;

    public C6312c(int i) {
        int i2 = 50;
        if (i < 50) {
            i2 = i;
        }
        super(i2, 0.75f, true);
        this.f17254b = new AtomicLong();
        this.f17255c = new AtomicLong();
        if (i == 0) {
            throw new IllegalArgumentException("Max cache size cannot be 0.");
        }
        this.f17253a = i;
    }

    public final V mo2465a(K k) {
        return get(k);
    }

    public final void clear() {
        synchronized (this) {
            super.clear();
        }
        this.f17254b.set(0);
        this.f17255c.set(0);
    }

    public final synchronized boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final synchronized boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final synchronized Set<Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Deprecated
    public final V get(Object obj) {
        synchronized (this) {
            V v = super.get(obj);
        }
        if (v == null) {
            this.f17255c.incrementAndGet();
            return null;
        }
        this.f17254b.incrementAndGet();
        return v;
    }

    public final synchronized boolean isEmpty() {
        return super.isEmpty();
    }

    public final synchronized Set<K> keySet() {
        return super.keySet();
    }

    public final synchronized V put(K k, V v) {
        return super.put(k, v);
    }

    public final synchronized void putAll(Map<? extends K, ? extends V> map) {
        super.putAll(map);
    }

    public final synchronized V remove(Object obj) {
        return super.remove(obj);
    }

    protected final boolean removeEldestEntry(Entry<K, V> entry) {
        return size() > this.f17253a;
    }

    public final synchronized int size() {
        return super.size();
    }

    public final synchronized Collection<V> values() {
        return super.values();
    }
}
