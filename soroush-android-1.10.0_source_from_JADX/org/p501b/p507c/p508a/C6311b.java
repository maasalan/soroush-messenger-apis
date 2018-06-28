package org.p501b.p507c.p508a;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C6311b<K, V> implements Map<K, V>, C4621a<K, V> {
    private final C6312c<K, C4623b<V>> f17251a;
    private long f17252b;

    private static class C4622a<K, V> implements Entry<K, V> {
        private final K f12698a;
        private V f12699b;

        public C4622a(K k, V v) {
            this.f12698a = k;
            this.f12699b = v;
        }

        public final K getKey() {
            return this.f12698a;
        }

        public final V getValue() {
            return this.f12699b;
        }

        public final V setValue(V v) {
            V v2 = this.f12699b;
            this.f12699b = v;
            return v2;
        }
    }

    private static class C4623b<V> {
        final V f12700a;
        final long f12701b;

        private C4623b(V v, long j) {
            this.f12700a = v;
            this.f12701b = System.currentTimeMillis() + j;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4623b)) {
                return false;
            }
            return this.f12700a.equals(((C4623b) obj).f12700a);
        }

        public final int hashCode() {
            return this.f12700a.hashCode();
        }
    }

    public C6311b(int i, long j) {
        this.f17251a = new C6312c(i);
        if (j <= 0) {
            throw new IllegalArgumentException();
        }
        this.f17252b = j;
    }

    public final V mo2465a(K k) {
        return get(k);
    }

    public final void clear() {
        this.f17251a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f17251a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f17251a.containsValue(obj);
    }

    public final Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> hashSet = new HashSet();
        for (Entry entry : this.f17251a.entrySet()) {
            hashSet.add(new C4622a(entry.getKey(), ((C4623b) entry.getValue()).f12700a));
        }
        return hashSet;
    }

    @Deprecated
    public final V get(Object obj) {
        C4623b c4623b = (C4623b) this.f17251a.get(obj);
        if (c4623b == null) {
            return null;
        }
        if ((System.currentTimeMillis() > c4623b.f12701b ? 1 : null) == null) {
            return c4623b.f12700a;
        }
        remove(obj);
        return null;
    }

    public final boolean isEmpty() {
        return this.f17251a.isEmpty();
    }

    public final Set<K> keySet() {
        return this.f17251a.keySet();
    }

    public final V put(K k, V v) {
        C4623b c4623b = (C4623b) this.f17251a.put(k, new C4623b(v, this.f17252b));
        return c4623b == null ? null : c4623b.f12700a;
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final V remove(Object obj) {
        C4623b c4623b = (C4623b) this.f17251a.remove(obj);
        return c4623b == null ? null : c4623b.f12700a;
    }

    public final int size() {
        return this.f17251a.size();
    }

    public final Collection<V> values() {
        Collection hashSet = new HashSet();
        for (C4623b c4623b : this.f17251a.values()) {
            hashSet.add(c4623b.f12700a);
        }
        return hashSet;
    }
}
