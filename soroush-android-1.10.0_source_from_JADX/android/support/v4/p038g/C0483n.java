package android.support.v4.p038g;

public final class C0483n<E> implements Cloneable {
    private static final Object f1648a = new Object();
    private boolean f1649b;
    private int[] f1650c;
    private Object[] f1651d;
    private int f1652e;

    public C0483n() {
        this(10);
    }

    public C0483n(int i) {
        Object[] objArr;
        this.f1649b = false;
        if (i == 0) {
            this.f1650c = C0465c.f1613a;
            objArr = C0465c.f1615c;
        } else {
            i = C0465c.m974a(i);
            this.f1650c = new int[i];
            objArr = new Object[i];
        }
        this.f1651d = objArr;
        this.f1652e = 0;
    }

    private android.support.v4.p038g.C0483n<E> m1022c() {
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
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0 = (android.support.v4.p038g.C0483n) r0;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.f1650c;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (int[]) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0.f1650c = r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r2.f1651d;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (java.lang.Object[]) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0.f1651d = r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        return r0;
    L_0x001b:
        r0 = 0;
    L_0x001c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.n.c():android.support.v4.g.n<E>");
    }

    private void m1023d() {
        int i = this.f1652e;
        int[] iArr = this.f1650c;
        Object[] objArr = this.f1651d;
        int i2 = 0;
        int i3 = i2;
        while (i2 < i) {
            Object obj = objArr[i2];
            if (obj != f1648a) {
                if (i2 != i3) {
                    iArr[i3] = iArr[i2];
                    objArr[i3] = obj;
                    objArr[i2] = null;
                }
                i3++;
            }
            i2++;
        }
        this.f1649b = false;
        this.f1652e = i3;
    }

    public final int m1024a() {
        if (this.f1649b) {
            m1023d();
        }
        return this.f1652e;
    }

    public final E m1025a(int i) {
        i = C0465c.m975a(this.f1650c, this.f1652e, i);
        if (i >= 0) {
            if (this.f1651d[i] != f1648a) {
                return this.f1651d[i];
            }
        }
        return null;
    }

    public final void m1026a(int i, E e) {
        int a = C0465c.m975a(this.f1650c, this.f1652e, i);
        if (a >= 0) {
            this.f1651d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f1652e || this.f1651d[a] != f1648a) {
            if (this.f1649b && this.f1652e >= this.f1650c.length) {
                m1023d();
                a = C0465c.m975a(this.f1650c, this.f1652e, i) ^ -1;
            }
            if (this.f1652e >= this.f1650c.length) {
                int a2 = C0465c.m974a(this.f1652e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f1650c, 0, obj, 0, this.f1650c.length);
                System.arraycopy(this.f1651d, 0, obj2, 0, this.f1651d.length);
                this.f1650c = obj;
                this.f1651d = obj2;
            }
            if (this.f1652e - a != 0) {
                int i2 = a + 1;
                System.arraycopy(this.f1650c, a, this.f1650c, i2, this.f1652e - a);
                System.arraycopy(this.f1651d, a, this.f1651d, i2, this.f1652e - a);
            }
            this.f1650c[a] = i;
            this.f1651d[a] = e;
            this.f1652e++;
            return;
        }
        this.f1650c[a] = i;
        this.f1651d[a] = e;
    }

    public final void m1027b() {
        int i = this.f1652e;
        Object[] objArr = this.f1651d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1652e = 0;
        this.f1649b = false;
    }

    public final void m1028b(int i) {
        i = C0465c.m975a(this.f1650c, this.f1652e, i);
        if (i >= 0 && this.f1651d[i] != f1648a) {
            this.f1651d[i] = f1648a;
            this.f1649b = true;
        }
    }

    public final void m1029b(int i, E e) {
        if (this.f1652e == 0 || i > this.f1650c[this.f1652e - 1]) {
            if (this.f1649b && this.f1652e >= this.f1650c.length) {
                m1023d();
            }
            int i2 = this.f1652e;
            if (i2 >= this.f1650c.length) {
                int a = C0465c.m974a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f1650c, 0, obj, 0, this.f1650c.length);
                System.arraycopy(this.f1651d, 0, obj2, 0, this.f1651d.length);
                this.f1650c = obj;
                this.f1651d = obj2;
            }
            this.f1650c[i2] = i;
            this.f1651d[i2] = e;
            this.f1652e = i2 + 1;
            return;
        }
        m1026a(i, e);
    }

    public final void m1030c(int i) {
        if (this.f1651d[i] != f1648a) {
            this.f1651d[i] = f1648a;
            this.f1649b = true;
        }
    }

    public final /* synthetic */ Object clone() {
        return m1022c();
    }

    public final int m1031d(int i) {
        if (this.f1649b) {
            m1023d();
        }
        return this.f1650c[i];
    }

    public final E m1032e(int i) {
        if (this.f1649b) {
            m1023d();
        }
        return this.f1651d[i];
    }

    public final int m1033f(int i) {
        if (this.f1649b) {
            m1023d();
        }
        return C0465c.m975a(this.f1650c, this.f1652e, i);
    }

    public final String toString() {
        if (m1024a() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1652e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1652e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1031d(i));
            stringBuilder.append('=');
            C0483n e = m1032e(i);
            if (e != this) {
                stringBuilder.append(e);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
