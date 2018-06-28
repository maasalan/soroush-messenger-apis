package com.google.p154a.p156b;

import com.google.p154a.p156b.C1636k.C5422a;
import java.io.Serializable;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public abstract class C1634h<K, V> implements Serializable, Map<K, V> {
    static final Entry<?, ?>[] f5091a = new Entry[0];
    private transient C5421i<Entry<K, V>> f5092b;
    private transient C5421i<K> f5093c;
    private transient C1632f<V> f5094d;

    public static class C1633a<K, V> {
        Comparator<? super V> f5087a;
        public Object[] f5088b;
        public int f5089c;
        public boolean f5090d;

        public C1633a() {
            this((byte) 0);
        }

        private C1633a(byte b) {
            this.f5088b = new Object[8];
            this.f5089c = 0;
            this.f5090d = false;
        }

        public final C1634h<K, V> m4199a() {
            if (this.f5087a != null) {
                if (this.f5090d) {
                    this.f5088b = Arrays.copyOf(this.f5088b, this.f5089c * 2);
                }
                Entry[] entryArr = new Entry[this.f5089c];
                int i = 0;
                for (int i2 = 0; i2 < this.f5089c; i2++) {
                    int i3 = 2 * i2;
                    entryArr[i2] = new SimpleImmutableEntry(this.f5088b[i3], this.f5088b[i3 + 1]);
                }
                Arrays.sort(entryArr, 0, this.f5089c, new C5417b(C5422a.f15066b, C1637l.m4206a(this.f5087a)));
                while (i < this.f5089c) {
                    int i4 = 2 * i;
                    this.f5088b[i4] = entryArr[i].getKey();
                    this.f5088b[i4 + 1] = entryArr[i].getValue();
                    i++;
                }
            }
            this.f5090d = true;
            return C5423n.m11698a(this.f5089c, this.f5088b);
        }
    }

    C1634h() {
    }

    public static <K, V> C1633a<K, V> m4200a() {
        return new C1633a();
    }

    private C5421i<Entry<K, V>> m4201e() {
        C5421i<Entry<K, V>> c5421i = this.f5092b;
        if (c5421i != null) {
            return c5421i;
        }
        c5421i = mo1525b();
        this.f5092b = c5421i;
        return c5421i;
    }

    private C1632f<V> m4202f() {
        C1632f<V> c1632f = this.f5094d;
        if (c1632f != null) {
            return c1632f;
        }
        c1632f = mo1527d();
        this.f5094d = c1632f;
        return c1632f;
    }

    abstract C5421i<Entry<K, V>> mo1525b();

    abstract C5421i<K> mo1526c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return m4202f().contains(obj);
    }

    abstract C1632f<V> mo1527d();

    public /* synthetic */ Set entrySet() {
        return m4201e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public abstract V get(Object obj);

    public int hashCode() {
        return C1638o.m4207a(m4201e());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public /* synthetic */ Set keySet() {
        Set set = this.f5093c;
        if (set != null) {
            return set;
        }
        set = mo1526c();
        this.f5093c = set;
        return set;
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        C1629c.m4189a(size, "size");
        StringBuilder stringBuilder = new StringBuilder((int) Math.min(((long) size) * 8, IjkMediaMeta.AV_CH_STEREO_RIGHT));
        stringBuilder.append('{');
        Object obj = 1;
        for (Entry entry : entrySet()) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            obj = null;
            stringBuilder.append(entry.getKey());
            stringBuilder.append('=');
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public /* synthetic */ Collection values() {
        return m4202f();
    }
}
