package org.jivesoftware.smack.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MultiMap<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_MAP_SIZE = 6;
    private static final int ENTRY_LIST_SIZE = 3;
    private final Map<K, List<V>> map;

    private static final class SimpleMapEntry<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        private SimpleMapEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.value;
        }

        public final V setValue(V v) {
            V v2 = this.value;
            this.value = v;
            return v2;
        }
    }

    public MultiMap() {
        this(6);
    }

    public MultiMap(int i) {
        this.map = new LinkedHashMap(i);
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        for (List contains : this.map.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> linkedHashSet = new LinkedHashSet(size());
        for (Entry entry : this.map.entrySet()) {
            Object key = entry.getKey();
            for (Object simpleMapEntry : (List) entry.getValue()) {
                linkedHashSet.add(new SimpleMapEntry(key, simpleMapEntry));
            }
        }
        return linkedHashSet;
    }

    public List<V> getAll(Object obj) {
        List<V> list = (List) this.map.get(obj);
        return list == null ? Collections.emptyList() : list;
    }

    public V getFirst(Object obj) {
        List all = getAll(obj);
        return all.isEmpty() ? null : all.iterator().next();
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public Set<K> keySet() {
        return this.map.keySet();
    }

    public boolean put(K k, V v) {
        List list = (List) this.map.get(k);
        if (list == null) {
            list = new ArrayList(3);
            list.add(v);
            this.map.put(k, list);
            return false;
        }
        list.add(v);
        return true;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public V remove(Object obj) {
        List list = (List) this.map.remove(obj);
        return list == null ? null : list.iterator().next();
    }

    public boolean removeOne(Object obj, V v) {
        List list = (List) this.map.get(obj);
        if (list == null) {
            return false;
        }
        boolean remove = list.remove(v);
        if (list.isEmpty()) {
            this.map.remove(obj);
        }
        return remove;
    }

    public int size() {
        int i = 0;
        for (List size : this.map.values()) {
            i += size.size();
        }
        return i;
    }

    public List<V> values() {
        List<V> arrayList = new ArrayList(size());
        for (List addAll : this.map.values()) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }
}
