package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

final class C5423n<K, V> extends C1634h<K, V> {
    static final C1634h<Object, Object> f15068b = new C5423n(null, new Object[0], 0);
    private final transient int[] f15069c;
    private final transient Object[] f15070d;
    private final transient int f15071e;

    static class C6563a<K, V> extends C5421i<Entry<K, V>> {
        private final transient C1634h<K, V> f17922a;
        private final transient Object[] f17923b;
        private final transient int f17924c = 0;
        private final transient int f17925d;

        class C65621 extends C5420g<Entry<K, V>> {
            final /* synthetic */ C6563a f17921a;

            C65621(C6563a c6563a) {
                this.f17921a = c6563a;
            }

            public final boolean mo2995c() {
                return true;
            }

            public final /* synthetic */ Object get(int i) {
                C1625i.m4180a(i, this.f17921a.f17925d);
                int i2 = 2 * i;
                return new SimpleImmutableEntry(this.f17921a.f17923b[this.f17921a.f17924c + i2], this.f17921a.f17923b[i2 + (this.f17921a.f17924c ^ 1)]);
            }

            public final int size() {
                return this.f17921a.f17925d;
            }
        }

        C6563a(C1634h<K, V> c1634h, Object[] objArr, int i) {
            this.f17922a = c1634h;
            this.f17923b = objArr;
            this.f17925d = i;
        }

        public final C1639p<Entry<K, V>> mo1521a() {
            return mo1522b().mo3000a(0);
        }

        final boolean mo2995c() {
            return true;
        }

        public final boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                obj = entry.getValue();
                if (obj != null && obj.equals(this.f17922a.get(key))) {
                    return true;
                }
            }
            return false;
        }

        final C5420g<Entry<K, V>> mo3001d() {
            return new C65621(this);
        }

        public final /* synthetic */ Iterator iterator() {
            return mo1521a();
        }

        public final int size() {
            return this.f17925d;
        }
    }

    static final class C6564b<K> extends C5421i<K> {
        private final transient C1634h<K, ?> f17926a;
        private final transient C5420g<K> f17927b;

        C6564b(C1634h<K, ?> c1634h, C5420g<K> c5420g) {
            this.f17926a = c1634h;
            this.f17927b = c5420g;
        }

        public final C1639p<K> mo1521a() {
            return this.f17927b.mo3000a(0);
        }

        public final C5420g<K> mo1522b() {
            return this.f17927b;
        }

        final boolean mo2995c() {
            return true;
        }

        public final boolean contains(Object obj) {
            return this.f17926a.get(obj) != null;
        }

        public final /* synthetic */ Iterator iterator() {
            return mo1521a();
        }

        public final int size() {
            return this.f17926a.size();
        }
    }

    static final class C6565c extends C5420g<Object> {
        private final transient Object[] f17928a;
        private final transient int f17929b;
        private final transient int f17930c;

        C6565c(Object[] objArr, int i, int i2) {
            this.f17928a = objArr;
            this.f17929b = i;
            this.f17930c = i2;
        }

        final boolean mo2995c() {
            return true;
        }

        public final Object get(int i) {
            C1625i.m4180a(i, this.f17930c);
            return this.f17928a[(2 * i) + this.f17929b];
        }

        public final int size() {
            return this.f17930c;
        }
    }

    private C5423n(int[] iArr, Object[] objArr, int i) {
        this.f15069c = iArr;
        this.f15070d = objArr;
        this.f15071e = i;
    }

    static <K, V> C5423n<K, V> m11698a(int i, Object[] objArr) {
        if (i == 0) {
            return (C5423n) f15068b;
        }
        int[] iArr = null;
        int i2 = 0;
        if (i == 1) {
            C1629c.m4190a(objArr[0], objArr[1]);
            return new C5423n(null, objArr, 1);
        }
        C1625i.m4187b(i, objArr.length >> 1);
        int a = C5421i.m11694a(i);
        if (i == 1) {
            C1629c.m4190a(objArr[0], objArr[1]);
        } else {
            int i3 = a - 1;
            int[] iArr2 = new int[a];
            Arrays.fill(iArr2, -1);
            while (i2 < i) {
                int i4 = 2 * i2;
                int i5 = i4 + 0;
                Object obj = objArr[i5];
                Object obj2 = objArr[i4 + 1];
                C1629c.m4190a(obj, obj2);
                int a2 = C1630e.m4191a(obj.hashCode());
                while (true) {
                    a2 &= i3;
                    int i6 = iArr2[a2];
                    if (i6 == -1) {
                        break;
                    } else if (objArr[i6].equals(obj)) {
                        StringBuilder stringBuilder = new StringBuilder("Multiple entries with same key: ");
                        stringBuilder.append(obj);
                        stringBuilder.append("=");
                        stringBuilder.append(obj2);
                        stringBuilder.append(" and ");
                        stringBuilder.append(objArr[i6]);
                        stringBuilder.append("=");
                        stringBuilder.append(objArr[i6 ^ 1]);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    } else {
                        a2++;
                    }
                }
                iArr2[a2] = i5;
                i2++;
            }
            iArr = iArr2;
        }
        return new C5423n(iArr, objArr, i);
    }

    final C5421i<Entry<K, V>> mo1525b() {
        return new C6563a(this, this.f15070d, this.f15071e);
    }

    final C5421i<K> mo1526c() {
        return new C6564b(this, new C6565c(this.f15070d, 0, this.f15071e));
    }

    final C1632f<V> mo1527d() {
        return new C6565c(this.f15070d, 1, this.f15071e);
    }

    public final V get(Object obj) {
        int[] iArr = this.f15069c;
        Object[] objArr = this.f15070d;
        int i = this.f15071e;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            return objArr[0].equals(obj) ? objArr[1] : null;
        } else {
            if (iArr == null) {
                return null;
            }
            i = iArr.length - 1;
            int a = C1630e.m4191a(obj.hashCode());
            while (true) {
                a &= i;
                int i2 = iArr[a];
                if (i2 == -1) {
                    return null;
                }
                if (objArr[i2].equals(obj)) {
                    return objArr[i2 ^ 1];
                }
                a++;
            }
        }
    }

    public final int size() {
        return this.f15071e;
    }
}
