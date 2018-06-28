package android.support.v4.p038g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class C0464b<E> implements Collection<E>, Set<E> {
    static Object[] f1602a;
    static int f1603b;
    static Object[] f1604c;
    static int f1605d;
    private static final int[] f1606j = new int[0];
    private static final Object[] f1607k = new Object[0];
    final boolean f1608e;
    int[] f1609f;
    public Object[] f1610g;
    int f1611h;
    C0475h<E, E> f1612i;

    class C48141 extends C0475h<E, E> {
        final /* synthetic */ C0464b f13395a;

        C48141(C0464b c0464b) {
            this.f13395a = c0464b;
        }

        protected final int mo298a() {
            return this.f13395a.f1611h;
        }

        protected final int mo299a(Object obj) {
            return this.f13395a.m972a(obj);
        }

        protected final Object mo300a(int i, int i2) {
            return this.f13395a.f1610g[i];
        }

        protected final E mo301a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        protected final void mo302a(int i) {
            this.f13395a.m973a(i);
        }

        protected final void mo303a(E e, E e2) {
            this.f13395a.add(e);
        }

        protected final int mo304b(Object obj) {
            return this.f13395a.m972a(obj);
        }

        protected final Map<E, E> mo305b() {
            throw new UnsupportedOperationException("not a map");
        }

        protected final void mo306c() {
            this.f13395a.clear();
        }
    }

    public C0464b() {
        this(0);
    }

    public C0464b(byte b) {
        this(3);
    }

    private C0464b(int i) {
        this.f1608e = false;
        if (i == 0) {
            this.f1609f = f1606j;
            this.f1610g = f1607k;
        } else {
            m971b(i);
        }
        this.f1611h = 0;
    }

    private int m968a() {
        int i = this.f1611h;
        if (i == 0) {
            return -1;
        }
        int a = C0465c.m975a(this.f1609f, i, 0);
        if (a < 0 || this.f1610g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1609f[i2] == 0) {
            if (this.f1610g[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1609f[a] == 0) {
            if (this.f1610g[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private int m969a(Object obj, int i) {
        int i2 = this.f1611h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0465c.m975a(this.f1609f, i2, i);
        if (a < 0 || obj.equals(this.f1610g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1609f[i3] == i) {
            if (obj.equals(this.f1610g[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1609f[a] == i) {
            if (obj.equals(this.f1610g[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static void m970a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0464b.class) {
                if (f1605d < 10) {
                    objArr[0] = f1604c;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1604c = objArr;
                    f1605d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0464b.class) {
                if (f1603b < 10) {
                    objArr[0] = f1602a;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    f1602a = objArr;
                    f1603b++;
                }
            }
        }
    }

    private void m971b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C0464b.class) {
                if (f1604c != null) {
                    objArr = f1604c;
                    this.f1610g = objArr;
                    f1604c = (Object[]) objArr[0];
                    this.f1609f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1605d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0464b.class) {
                if (f1602a != null) {
                    objArr = f1602a;
                    this.f1610g = objArr;
                    f1602a = (Object[]) objArr[0];
                    this.f1609f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1603b--;
                    return;
                }
            }
        }
        this.f1609f = new int[i];
        this.f1610g = new Object[i];
    }

    public final int m972a(Object obj) {
        if (obj == null) {
            return m968a();
        }
        return m969a(obj, this.f1608e ? System.identityHashCode(obj) : obj.hashCode());
    }

    public final E m973a(int i) {
        E e = this.f1610g[i];
        if (this.f1611h <= 1) {
            C0464b.m970a(this.f1609f, this.f1610g, this.f1611h);
            this.f1609f = f1606j;
            this.f1610g = f1607k;
            this.f1611h = 0;
            return e;
        }
        int i2 = 8;
        int i3;
        if (this.f1609f.length <= 8 || this.f1611h >= this.f1609f.length / 3) {
            this.f1611h--;
            if (i < this.f1611h) {
                i3 = i + 1;
                System.arraycopy(this.f1609f, i3, this.f1609f, i, this.f1611h - i);
                System.arraycopy(this.f1610g, i3, this.f1610g, i, this.f1611h - i);
            }
            this.f1610g[this.f1611h] = null;
        } else {
            if (this.f1611h > 8) {
                i2 = (this.f1611h >> 1) + this.f1611h;
            }
            Object obj = this.f1609f;
            Object obj2 = this.f1610g;
            m971b(i2);
            this.f1611h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f1609f, 0, i);
                System.arraycopy(obj2, 0, this.f1610g, 0, i);
            }
            if (i < this.f1611h) {
                i3 = i + 1;
                System.arraycopy(obj, i3, this.f1609f, i, this.f1611h - i);
                System.arraycopy(obj2, i3, this.f1610g, i, this.f1611h - i);
                return e;
            }
        }
        return e;
    }

    public final boolean add(E e) {
        int a;
        boolean z;
        if (e == null) {
            a = m968a();
            z = false;
        } else {
            boolean identityHashCode = this.f1608e ? System.identityHashCode(e) : e.hashCode();
            z = identityHashCode;
            a = m969a(e, identityHashCode);
        }
        if (a >= 0) {
            return false;
        }
        int i;
        a ^= -1;
        if (this.f1611h >= this.f1609f.length) {
            i = 4;
            if (this.f1611h >= 8) {
                i = (this.f1611h >> 1) + this.f1611h;
            } else if (this.f1611h >= 4) {
                i = 8;
            }
            Object obj = this.f1609f;
            Object obj2 = this.f1610g;
            m971b(i);
            if (this.f1609f.length > 0) {
                System.arraycopy(obj, 0, this.f1609f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f1610g, 0, obj2.length);
            }
            C0464b.m970a(obj, obj2, this.f1611h);
        }
        if (a < this.f1611h) {
            i = a + 1;
            System.arraycopy(this.f1609f, a, this.f1609f, i, this.f1611h - a);
            System.arraycopy(this.f1610g, a, this.f1610g, i, this.f1611h - a);
        }
        this.f1609f[a] = z;
        this.f1610g[a] = e;
        this.f1611h++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.f1611h + collection.size();
        boolean z = false;
        if (this.f1609f.length < size) {
            Object obj = this.f1609f;
            Object obj2 = this.f1610g;
            m971b(size);
            if (this.f1611h > 0) {
                System.arraycopy(obj, 0, this.f1609f, 0, this.f1611h);
                System.arraycopy(obj2, 0, this.f1610g, 0, this.f1611h);
            }
            C0464b.m970a(obj, obj2, this.f1611h);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void clear() {
        if (this.f1611h != 0) {
            C0464b.m970a(this.f1609f, this.f1610g, this.f1611h);
            this.f1609f = f1606j;
            this.f1610g = f1607k;
            this.f1611h = 0;
        }
    }

    public final boolean contains(Object obj) {
        return m972a(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof java.util.Set;
        r2 = 0;
        if (r1 == 0) goto L_0x002a;
    L_0x0009:
        r5 = (java.util.Set) r5;
        r1 = r4.size();
        r3 = r5.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = r2;
    L_0x0017:
        r3 = r4.f1611h;	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        if (r1 >= r3) goto L_0x0029;	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
    L_0x001b:
        r3 = r4.f1610g;	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        r3 = r3[r1];	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        r3 = r5.contains(r3);	 Catch:{ NullPointerException -> 0x002a, NullPointerException -> 0x002a }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x0029:
        return r0;
    L_0x002a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.f1609f;
        int i = 0;
        int i2 = 0;
        while (i < this.f1611h) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return this.f1611h <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.f1612i == null) {
            this.f1612i = new C48141(this);
        }
        return this.f1612i.m1003d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = m972a(obj);
        if (a < 0) {
            return false;
        }
        m973a(a);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f1611h - 1; i >= 0; i--) {
            if (!collection.contains(this.f1610g[i])) {
                m973a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f1611h;
    }

    public final Object[] toArray() {
        Object obj = new Object[this.f1611h];
        System.arraycopy(this.f1610g, 0, obj, 0, this.f1611h);
        return obj;
    }

    public final <T> T[] toArray(T[] tArr) {
        Object obj;
        if (tArr.length < this.f1611h) {
            obj = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1611h);
        }
        System.arraycopy(this.f1610g, 0, obj, 0, this.f1611h);
        if (obj.length > this.f1611h) {
            obj[this.f1611h] = null;
        }
        return obj;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1611h * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1611h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0464b c0464b = this.f1610g[i];
            if (c0464b != this) {
                stringBuilder.append(c0464b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
