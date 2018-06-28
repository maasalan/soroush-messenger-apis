package android.support.v4.p038g;

import java.util.ConcurrentModificationException;

public class C0482m<K, V> {
    static Object[] f1641b;
    static int f1642c;
    static Object[] f1643d;
    static int f1644e;
    int[] f1645f;
    Object[] f1646g;
    int f1647h;

    public C0482m() {
        this.f1645f = C0465c.f1613a;
        this.f1646g = C0465c.f1615c;
        this.f1647h = 0;
    }

    public C0482m(int i) {
        if (i == 0) {
            this.f1645f = C0465c.f1613a;
            this.f1646g = C0465c.f1615c;
        } else {
            m1014e(i);
        }
        this.f1647h = 0;
    }

    public C0482m(C0482m<K, V> c0482m) {
        this();
        if (c0482m != null) {
            m1017a((C0482m) c0482m);
        }
    }

    private int m1010a() {
        int i = this.f1647h;
        if (i == 0) {
            return -1;
        }
        int a = C0482m.m1012a(this.f1645f, i, 0);
        if (a < 0 || this.f1646g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f1645f[i2] == 0) {
            if (this.f1646g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f1645f[a] == 0) {
            if (this.f1646g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private int m1011a(Object obj, int i) {
        int i2 = this.f1647h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0482m.m1012a(this.f1645f, i2, i);
        if (a < 0 || obj.equals(this.f1646g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f1645f[i3] == i) {
            if (obj.equals(this.f1646g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f1645f[a] == i) {
            if (obj.equals(this.f1646g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static int m1012a(int[] r0, int r1, int r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = android.support.v4.p038g.C0465c.m975a(r0, r1, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = new java.util.ConcurrentModificationException;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.m.a(int[], int, int):int");
    }

    private static void m1013a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (C4813a.class) {
                if (f1644e < 10) {
                    objArr[0] = f1643d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1643d = objArr;
                    f1644e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C4813a.class) {
                if (f1642c < 10) {
                    objArr[0] = f1641b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f1641b = objArr;
                    f1642c++;
                }
            }
        }
    }

    private void m1014e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (C4813a.class) {
                if (f1643d != null) {
                    objArr = f1643d;
                    this.f1646g = objArr;
                    f1643d = (Object[]) objArr[0];
                    this.f1645f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1644e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C4813a.class) {
                if (f1641b != null) {
                    objArr = f1641b;
                    this.f1646g = objArr;
                    f1641b = (Object[]) objArr[0];
                    this.f1645f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1642c--;
                    return;
                }
            }
        }
        this.f1645f = new int[i];
        this.f1646g = new Object[(i << 1)];
    }

    public final int m1015a(Object obj) {
        return obj == null ? m1010a() : m1011a(obj, obj.hashCode());
    }

    public final void m1016a(int i) {
        int i2 = this.f1647h;
        if (this.f1645f.length < i) {
            int[] iArr = this.f1645f;
            Object[] objArr = this.f1646g;
            m1014e(i);
            if (this.f1647h > 0) {
                System.arraycopy(iArr, 0, this.f1645f, 0, i2);
                System.arraycopy(objArr, 0, this.f1646g, 0, i2 << 1);
            }
            C0482m.m1013a(iArr, objArr, i2);
        }
        if (this.f1647h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void m1017a(C0482m<? extends K, ? extends V> c0482m) {
        int i = c0482m.f1647h;
        m1016a(this.f1647h + i);
        int i2 = 0;
        if (this.f1647h != 0) {
            while (i2 < i) {
                put(c0482m.m1019b(i2), c0482m.m1020c(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(c0482m.f1645f, 0, this.f1645f, 0, i);
            System.arraycopy(c0482m.f1646g, 0, this.f1646g, 0, i << 1);
            this.f1647h = i;
        }
    }

    final int m1018b(Object obj) {
        int i = this.f1647h * 2;
        Object[] objArr = this.f1646g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final K m1019b(int i) {
        return this.f1646g[i << 1];
    }

    public final V m1020c(int i) {
        return this.f1646g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f1647h > 0) {
            int[] iArr = this.f1645f;
            Object[] objArr = this.f1646g;
            int i = this.f1647h;
            this.f1645f = C0465c.f1613a;
            this.f1646g = C0465c.f1615c;
            this.f1647h = 0;
            C0482m.m1013a(iArr, objArr, i);
        }
        if (this.f1647h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m1015a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1018b(obj) >= 0;
    }

    public final V m1021d(int i) {
        int i2 = i << 1;
        V v = this.f1646g[i2 + 1];
        int i3 = this.f1647h;
        int i4 = 0;
        if (i3 <= 1) {
            C0482m.m1013a(this.f1645f, this.f1646g, i3);
            this.f1645f = C0465c.f1613a;
            this.f1646g = C0465c.f1615c;
        } else {
            int i5 = i3 - 1;
            int i6 = 8;
            if (this.f1645f.length <= 8 || this.f1647h >= this.f1645f.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(this.f1645f, i7, this.f1645f, i, i8);
                    System.arraycopy(this.f1646g, i7 << 1, this.f1646g, i2, i8 << 1);
                }
                i2 = i5 << 1;
                this.f1646g[i2] = null;
                this.f1646g[i2 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                Object obj = this.f1645f;
                Object obj2 = this.f1646g;
                m1014e(i6);
                if (i3 != this.f1647h) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj, 0, this.f1645f, 0, i);
                    System.arraycopy(obj2, 0, this.f1646g, 0, i2);
                }
                if (i < i5) {
                    i4 = i + 1;
                    int i9 = i5 - i;
                    System.arraycopy(obj, i4, this.f1645f, i, i9);
                    System.arraycopy(obj2, i4 << 1, this.f1646g, i2, i9 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f1647h) {
            throw new ConcurrentModificationException();
        }
        this.f1647h = i4;
        return v;
    }

    public boolean equals(java.lang.Object r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = 1;
        if (r6 != r7) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7 instanceof android.support.v4.p038g.C0482m;
        r2 = 0;
        if (r1 == 0) goto L_0x003e;
    L_0x0009:
        r7 = (android.support.v4.p038g.C0482m) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x0016;
    L_0x0015:
        return r2;
    L_0x0016:
        r1 = r2;
    L_0x0017:
        r3 = r6.f1647h;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r1 >= r3) goto L_0x003c;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x001b:
        r3 = r6.m1019b(r1);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        r4 = r6.m1020c(r1);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r4 != 0) goto L_0x0032;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0029:
        if (r5 != 0) goto L_0x0031;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x002b:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r3 != 0) goto L_0x0039;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0031:
        return r2;	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
    L_0x0032:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x003d, NullPointerException -> 0x003d }
        if (r3 != 0) goto L_0x0039;
    L_0x0038:
        return r2;
    L_0x0039:
        r1 = r1 + 1;
        goto L_0x0017;
    L_0x003c:
        return r0;
    L_0x003d:
        return r2;
    L_0x003e:
        r1 = r7 instanceof java.util.Map;
        if (r1 == 0) goto L_0x0076;
    L_0x0042:
        r7 = (java.util.Map) r7;
        r1 = r6.size();
        r3 = r7.size();
        if (r1 == r3) goto L_0x004f;
    L_0x004e:
        return r2;
    L_0x004f:
        r1 = r2;
    L_0x0050:
        r3 = r6.f1647h;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r1 >= r3) goto L_0x0075;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0054:
        r3 = r6.m1019b(r1);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        r4 = r6.m1020c(r1);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        r5 = r7.get(r3);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r4 != 0) goto L_0x006b;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0062:
        if (r5 != 0) goto L_0x006a;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x0064:
        r3 = r7.containsKey(r3);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r3 != 0) goto L_0x0072;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x006a:
        return r2;	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
    L_0x006b:
        r3 = r4.equals(r5);	 Catch:{ NullPointerException -> 0x0076, NullPointerException -> 0x0076 }
        if (r3 != 0) goto L_0x0072;
    L_0x0071:
        return r2;
    L_0x0072:
        r1 = r1 + 1;
        goto L_0x0050;
    L_0x0075:
        return r0;
    L_0x0076:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.m.equals(java.lang.Object):boolean");
    }

    public V get(Object obj) {
        int a = m1015a(obj);
        return a >= 0 ? this.f1646g[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f1645f;
        Object[] objArr = this.f1646g;
        int i = this.f1647h;
        int i2 = 1;
        int i3 = 0;
        int i4 = i3;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f1647h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = this.f1647h;
        if (k == null) {
            a = m1010a();
            i = 0;
        } else {
            a = k.hashCode();
            i = a;
            a = m1011a(k, a);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f1646g[i3];
            this.f1646g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (i2 >= this.f1645f.length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.f1645f;
            Object[] objArr = this.f1646g;
            m1014e(i4);
            if (i2 != this.f1647h) {
                throw new ConcurrentModificationException();
            }
            if (this.f1645f.length > 0) {
                System.arraycopy(iArr, 0, this.f1645f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1646g, 0, objArr.length);
            }
            C0482m.m1013a(iArr, objArr, i2);
        }
        if (a < i2) {
            int i5 = a + 1;
            System.arraycopy(this.f1645f, a, this.f1645f, i5, i2 - a);
            System.arraycopy(this.f1646g, a << 1, this.f1646g, i5 << 1, (this.f1647h - a) << 1);
        }
        if (i2 == this.f1647h) {
            if (a < this.f1645f.length) {
                this.f1645f[a] = i;
                int i6 = a << 1;
                this.f1646g[i6] = k;
                this.f1646g[i6 + 1] = v;
                this.f1647h++;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = m1015a(obj);
        return a >= 0 ? m1021d(a) : null;
    }

    public int size() {
        return this.f1647h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1647h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1647h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            C0482m b = m1019b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m1020c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
