package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import com.google.p154a.p155a.C5414h;
import com.google.p154a.p156b.C1632f.C1631b;
import com.google.p154a.p156b.C1632f.C5419a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class C5420g<E> extends C1632f<E> implements List<E>, RandomAccess {

    public static final class C6557a<E> extends C5419a<E> {
        public C6557a() {
            this((byte) 0);
        }

        private C6557a(byte b) {
        }

        public final /* synthetic */ C1631b mo1519b(Object obj) {
            super.mo2992a(obj);
            return this;
        }

        public final C6557a<E> m15828b(Iterator<? extends E> it) {
            super.mo2993a(it);
            return this;
        }

        public final C6557a<E> m15829c(E e) {
            super.mo2992a(e);
            return this;
        }
    }

    class C6558b extends C5420g<E> {
        final transient int f17915a;
        final transient int f17916b;
        final /* synthetic */ C5420g f17917c;

        C6558b(C5420g c5420g, int i, int i2) {
            this.f17917c = c5420g;
            this.f17915a = i;
            this.f17916b = i2;
        }

        public final C5420g<E> mo2994a(int i, int i2) {
            C1625i.m4184a(i, i2, this.f17916b);
            return this.f17917c.mo2994a(i + this.f17915a, i2 + this.f17915a);
        }

        final boolean mo2995c() {
            return true;
        }

        public final E get(int i) {
            C1625i.m4180a(i, this.f17916b);
            return this.f17917c.get(i + this.f17915a);
        }

        public final /* synthetic */ Iterator iterator() {
            return mo3000a(0);
        }

        public final /* synthetic */ ListIterator listIterator() {
            return mo3000a(0);
        }

        public final /* synthetic */ ListIterator listIterator(int i) {
            return super.mo3000a(i);
        }

        public final int size() {
            return this.f17916b;
        }

        public final /* synthetic */ List subList(int i, int i2) {
            return mo2994a(i, i2);
        }
    }

    C5420g() {
    }

    public static <E> C5420g<E> m11684a(Iterable<? extends E> iterable) {
        C1625i.m4181a((Object) iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (!(collection instanceof C1632f)) {
                return C5420g.m11686b(collection.toArray());
            }
            C5420g<E> b = ((C1632f) collection).mo1522b();
            if (b.mo2995c()) {
                Object[] toArray = b.toArray();
                b = C5420g.m11687b(toArray, toArray.length);
            }
            return b;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return C6561m.f17918a;
        }
        Object next = it.next();
        if (it.hasNext()) {
            C6557a b2 = new C6557a().m15829c(next).m15828b(it);
            b2.c = true;
            return C5420g.m11687b(b2.a, b2.b);
        }
        return C5420g.m11686b(next);
    }

    static <E> C5420g<E> m11685a(Object[] objArr) {
        return C5420g.m11687b(objArr, objArr.length);
    }

    private static <E> C5420g<E> m11686b(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                StringBuilder stringBuilder = new StringBuilder("at index ");
                stringBuilder.append(i);
                throw new NullPointerException(stringBuilder.toString());
            }
        }
        return C5420g.m11687b(objArr, objArr.length);
    }

    private static <E> C5420g<E> m11687b(Object[] objArr, int i) {
        return i == 0 ? C6561m.f17918a : new C6561m(objArr, i);
    }

    public static <E> C5420g<E> m11688d() {
        return C6561m.f17918a;
    }

    int mo1520a(Object[] objArr, int i) {
        i = size();
        for (int i2 = 0; i2 < i; i2++) {
            objArr[0 + i2] = get(i2);
        }
        return 0 + i;
    }

    public C5420g<E> mo2994a(int i, int i2) {
        C1625i.m4184a(i, i2, size());
        i2 -= i;
        return i2 == size() ? this : i2 == 0 ? C6561m.f17918a : new C6558b(this, i, i2);
    }

    public final C1639p<E> mo1521a() {
        return mo3000a(0);
    }

    public C5424q<E> mo3000a(int i) {
        return new C6556a<E>(this, size(), i) {
            final /* synthetic */ C5420g f20342a;

            protected final E mo3403a(int i) {
                return this.f20342a.get(i);
            }
        };
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final C5420g<E> mo1522b() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == C1625i.m4181a((Object) this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
                    int i = 0;
                    while (i < size) {
                        if (C5414h.m11677a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object a : this) {
                    if (!it.hasNext() || !C5414h.m11677a(a, it.next())) {
                        break;
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((31 * i) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                int i = 0;
                if (obj == null) {
                    while (i < size) {
                        if (get(i) == null) {
                            return i;
                        }
                        i++;
                    }
                } else {
                    while (i < size) {
                        if (obj.equals(get(i))) {
                            return i;
                        }
                        i++;
                    }
                }
                return -1;
            }
            ListIterator listIterator = listIterator();
            while (listIterator.hasNext()) {
                if (C5414h.m11677a(obj, listIterator.next())) {
                    return listIterator.previousIndex();
                }
            }
        }
        return -1;
    }

    public /* synthetic */ Iterator iterator() {
        return mo3000a(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj != null) {
            if (this instanceof RandomAccess) {
                if (obj == null) {
                    for (int size = size() - 1; size >= 0; size--) {
                        if (get(size) == null) {
                            return size;
                        }
                    }
                } else {
                    for (int size2 = size() - 1; size2 >= 0; size2--) {
                        if (obj.equals(get(size2))) {
                            return size2;
                        }
                    }
                }
                return -1;
            }
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (C5414h.m11677a(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
        }
        return -1;
    }

    public /* synthetic */ ListIterator listIterator() {
        return mo3000a(0);
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return mo3000a(i);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo2994a(i, i2);
    }
}
