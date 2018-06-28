package android.support.v4.p038g;

public final class C0468f<E> implements Cloneable {
    public static final Object f1618a = new Object();
    public boolean f1619b;
    public long[] f1620c;
    public Object[] f1621d;
    public int f1622e;

    public C0468f() {
        this((byte) 0);
    }

    private C0468f(byte b) {
        this.f1619b = false;
        int b2 = C0465c.m978b(10);
        this.f1620c = new long[b2];
        this.f1621d = new Object[b2];
        this.f1622e = 0;
    }

    private android.support.v4.p038g.C0468f<E> m982d() {
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
        r2 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001b }
        r0 = (android.support.v4.p038g.C0468f) r0;	 Catch:{ CloneNotSupportedException -> 0x001b }
        r1 = r2.f1620c;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (long[]) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0.f1620c = r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r2.f1621d;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (java.lang.Object[]) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0.f1621d = r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        return r0;
    L_0x001b:
        r0 = 0;
    L_0x001c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.g.f.d():android.support.v4.g.f<E>");
    }

    public final long m983a(int i) {
        if (this.f1619b) {
            m985a();
        }
        return this.f1620c[i];
    }

    public final E m984a(long j) {
        int a = C0465c.m976a(this.f1620c, this.f1622e, j);
        if (a >= 0) {
            if (this.f1621d[a] != f1618a) {
                return this.f1621d[a];
            }
        }
        return null;
    }

    public final void m985a() {
        int i = this.f1622e;
        long[] jArr = this.f1620c;
        Object[] objArr = this.f1621d;
        int i2 = 0;
        int i3 = i2;
        while (i2 < i) {
            Object obj = objArr[i2];
            if (obj != f1618a) {
                if (i2 != i3) {
                    jArr[i3] = jArr[i2];
                    objArr[i3] = obj;
                    objArr[i2] = null;
                }
                i3++;
            }
            i2++;
        }
        this.f1619b = false;
        this.f1622e = i3;
    }

    public final void m986a(long j, E e) {
        int a = C0465c.m976a(this.f1620c, this.f1622e, j);
        if (a >= 0) {
            this.f1621d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f1622e || this.f1621d[a] != f1618a) {
            if (this.f1619b && this.f1622e >= this.f1620c.length) {
                m985a();
                a = C0465c.m976a(this.f1620c, this.f1622e, j) ^ -1;
            }
            if (this.f1622e >= this.f1620c.length) {
                int b = C0465c.m978b(this.f1622e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f1620c, 0, obj, 0, this.f1620c.length);
                System.arraycopy(this.f1621d, 0, obj2, 0, this.f1621d.length);
                this.f1620c = obj;
                this.f1621d = obj2;
            }
            if (this.f1622e - a != 0) {
                int i = a + 1;
                System.arraycopy(this.f1620c, a, this.f1620c, i, this.f1622e - a);
                System.arraycopy(this.f1621d, a, this.f1621d, i, this.f1622e - a);
            }
            this.f1620c[a] = j;
            this.f1621d[a] = e;
            this.f1622e++;
            return;
        }
        this.f1620c[a] = j;
        this.f1621d[a] = e;
    }

    public final int m987b() {
        if (this.f1619b) {
            m985a();
        }
        return this.f1622e;
    }

    public final E m988b(int i) {
        if (this.f1619b) {
            m985a();
        }
        return this.f1621d[i];
    }

    public final void m989c() {
        int i = this.f1622e;
        Object[] objArr = this.f1621d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1622e = 0;
        this.f1619b = false;
    }

    public final /* synthetic */ Object clone() {
        return m982d();
    }

    public final String toString() {
        if (m987b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1622e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1622e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m983a(i));
            stringBuilder.append('=');
            C0468f b = m988b(i);
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
