package com.p111d.p112a.p121c.p138m;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public final class C1519b {
    public C5365a f4734a = null;
    public C5366b f4735b = null;
    public C5371g f4736c = null;
    public C5369e f4737d = null;
    public C5370f f4738e = null;
    public C5368d f4739f = null;
    public C5367c f4740g = null;

    static class C15181 {
        final /* synthetic */ Class f4731a;
        final /* synthetic */ int f4732b;
        final /* synthetic */ Object f4733c;

        public C15181(Class cls, int i, Object obj) {
            this.f4731a = cls;
            this.f4732b = i;
            this.f4733c = obj;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.f4731a || Array.getLength(obj) != this.f4732b) {
                return false;
            }
            for (int i = 0; i < this.f4732b; i++) {
                Object obj2 = Array.get(this.f4733c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class C5365a extends C1537p<boolean[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new boolean[i];
        }
    }

    public static final class C5366b extends C1537p<byte[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new byte[i];
        }
    }

    public static final class C5367c extends C1537p<double[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new double[i];
        }
    }

    public static final class C5368d extends C1537p<float[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new float[i];
        }
    }

    public static final class C5369e extends C1537p<int[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new int[i];
        }
    }

    public static final class C5370f extends C1537p<long[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new long[i];
        }
    }

    public static final class C5371g extends C1537p<short[]> {
        public final /* bridge */ /* synthetic */ Object mo1481a(int i) {
            return new short[i];
        }
    }

    public static <T> HashSet<T> m3935a(Set<T> set, T[] tArr) {
        HashSet<T> hashSet = new HashSet();
        if (set != null) {
            hashSet.addAll(set);
        }
        if (tArr != null) {
            for (Object add : tArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public static <T> HashSet<T> m3936a(T[] tArr) {
        HashSet<T> hashSet = new HashSet();
        if (tArr != null) {
            for (Object add : tArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public static <T> T[] m3937a(T[] tArr, T t) {
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            if (tArr[i] != t) {
                i++;
            } else if (i == 0) {
                return tArr;
            } else {
                Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length);
                System.arraycopy(tArr, 0, objArr, 1, i);
                objArr[0] = t;
                i++;
                length -= i;
                if (length > 0) {
                    System.arraycopy(tArr, i, objArr, i, length);
                }
                return objArr;
            }
        }
        Object[] objArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(tArr, 0, objArr2, 1, length);
        }
        objArr2[0] = t;
        return objArr2;
    }
}
