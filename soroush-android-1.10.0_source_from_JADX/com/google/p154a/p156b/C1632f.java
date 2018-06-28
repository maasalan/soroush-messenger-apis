package com.google.p154a.p156b;

import com.google.p154a.p155a.C1625i;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class C1632f<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] f5086a = new Object[0];

    public static abstract class C1631b<E> {
        C1631b() {
        }

        public static int m4192a(int i, int i2) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            i = (i + (i >> 1)) + 1;
            if (i < i2) {
                i = Integer.highestOneBit(i2 - 1) << 1;
            }
            return i < 0 ? ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : i;
        }

        public C1631b<E> mo2993a(Iterator<? extends E> it) {
            while (it.hasNext()) {
                mo1519b(it.next());
            }
            return this;
        }

        public abstract C1631b<E> mo1519b(E e);
    }

    static abstract class C5419a<E> extends C1631b<E> {
        Object[] f15061a = new Object[4];
        int f15062b = 0;
        boolean f15063c;

        C5419a() {
            C1629c.m4189a(4, "initialCapacity");
        }

        public C5419a<E> mo2992a(E e) {
            Object[] copyOf;
            int i;
            C1625i.m4181a((Object) e);
            int i2 = this.f15062b + 1;
            if (this.f15061a.length < i2) {
                copyOf = Arrays.copyOf(this.f15061a, C1631b.m4192a(this.f15061a.length, i2));
            } else {
                if (this.f15063c) {
                    copyOf = (Object[]) this.f15061a.clone();
                }
                copyOf = this.f15061a;
                i = this.f15062b;
                this.f15062b = i + 1;
                copyOf[i] = e;
                return this;
            }
            this.f15061a = copyOf;
            this.f15063c = false;
            copyOf = this.f15061a;
            i = this.f15062b;
            this.f15062b = i + 1;
            copyOf[i] = e;
            return this;
        }

        public /* synthetic */ C1631b mo1519b(Object obj) {
            return mo2992a(obj);
        }
    }

    C1632f() {
    }

    int mo1520a(Object[] objArr, int i) {
        Iterator a = mo1521a();
        while (a.hasNext()) {
            int i2 = i + 1;
            objArr[i] = a.next();
            i = i2;
        }
        return i;
    }

    public abstract C1639p<E> mo1521a();

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public C5420g<E> mo1522b() {
        return isEmpty() ? C5420g.m11688d() : C5420g.m11685a(toArray());
    }

    abstract boolean mo2995c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    public /* synthetic */ Iterator iterator() {
        return mo1521a();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f5086a;
        }
        Object[] objArr = new Object[size];
        mo1520a(objArr, 0);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        C1625i.m4181a((Object) tArr);
        int size = size();
        if (tArr.length < size) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo1520a(tArr, 0);
        return tArr;
    }
}
