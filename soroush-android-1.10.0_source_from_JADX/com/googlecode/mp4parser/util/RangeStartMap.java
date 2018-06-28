package com.googlecode.mp4parser.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RangeStartMap<K extends Comparable, V> implements Map<K, V> {
    TreeMap<K, V> base = new TreeMap(new C21181());

    class C21181 implements Comparator<K> {
        C21181() {
        }

        public int compare(K k, K k2) {
            return -k.compareTo(k2);
        }
    }

    public RangeStartMap(K k, V v) {
        put((Comparable) k, (Object) v);
    }

    public void clear() {
        this.base.clear();
    }

    public boolean containsKey(Object obj) {
        return this.base.get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        return this.base.entrySet();
    }

    public V get(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Comparable comparable2;
        Iterator it = this.base.keySet().iterator();
        while (true) {
            comparable2 = (Comparable) it.next();
            if (!it.hasNext() || comparable.compareTo(comparable2) >= 0) {
            }
        }
        return this.base.get(comparable2);
    }

    public boolean isEmpty() {
        return this.base.isEmpty();
    }

    public Set<K> keySet() {
        return this.base.keySet();
    }

    public V put(K k, V v) {
        return this.base.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.base.putAll(map);
    }

    public V remove(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Comparable comparable2;
        Iterator it = this.base.keySet().iterator();
        while (true) {
            comparable2 = (Comparable) it.next();
            if (!it.hasNext() || comparable.compareTo(comparable2) >= 0) {
            }
        }
        return this.base.remove(comparable2);
    }

    public int size() {
        return this.base.size();
    }

    public Collection<V> values() {
        return this.base.values();
    }
}
