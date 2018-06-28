package com.p111d.p112a.p114b.p116c;

import com.p111d.p112a.p114b.C1359d;
import com.p111d.p112a.p114b.p120g.C1368a;
import com.p111d.p112a.p114b.p120g.C1373i;

public final class C1347c {
    protected final Object f4187a;
    protected C1359d f4188b;
    protected final boolean f4189c;
    protected final C1368a f4190d;
    protected byte[] f4191e;
    protected byte[] f4192f;
    protected byte[] f4193g;
    protected char[] f4194h;
    protected char[] f4195i;
    protected char[] f4196j;

    public C1347c(C1368a c1368a, Object obj, boolean z) {
        this.f4190d = c1368a;
        this.f4187a = obj;
        this.f4189c = z;
    }

    private static void m3190a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    private static void m3191a(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length <= bArr2.length) {
            throw C1347c.m3193j();
        }
    }

    private static void m3192a(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length <= cArr2.length) {
            throw C1347c.m3193j();
        }
    }

    private static IllegalArgumentException m3193j() {
        return new IllegalArgumentException("Trying to release buffer not owned by the context");
    }

    public final Object m3194a() {
        return this.f4187a;
    }

    public final void m3195a(C1359d c1359d) {
        this.f4188b = c1359d;
    }

    public final void m3196a(byte[] bArr) {
        if (bArr != null) {
            C1347c.m3191a(bArr, this.f4191e);
            this.f4191e = null;
            this.f4190d.m3312a(0, bArr);
        }
    }

    public final void m3197a(char[] cArr) {
        if (cArr != null) {
            C1347c.m3192a(cArr, this.f4194h);
            this.f4194h = null;
            this.f4190d.m3313a(0, cArr);
        }
    }

    public final char[] m3198a(int i) {
        C1347c.m3190a(this.f4194h);
        char[] a = this.f4190d.m3315a(0, i);
        this.f4194h = a;
        return a;
    }

    public final C1359d m3199b() {
        return this.f4188b;
    }

    public final void m3200b(byte[] bArr) {
        if (bArr != null) {
            C1347c.m3191a(bArr, this.f4192f);
            this.f4192f = null;
            this.f4190d.m3312a(1, bArr);
        }
    }

    public final void m3201b(char[] cArr) {
        if (cArr != null) {
            C1347c.m3192a(cArr, this.f4195i);
            this.f4195i = null;
            this.f4190d.m3313a(1, cArr);
        }
    }

    public final char[] m3202b(int i) {
        C1347c.m3190a(this.f4196j);
        char[] a = this.f4190d.m3315a(3, i);
        this.f4196j = a;
        return a;
    }

    public final void m3203c(byte[] bArr) {
        if (bArr != null) {
            C1347c.m3191a(bArr, this.f4193g);
            this.f4193g = null;
            this.f4190d.m3312a(3, bArr);
        }
    }

    public final void m3204c(char[] cArr) {
        if (cArr != null) {
            C1347c.m3192a(cArr, this.f4196j);
            this.f4196j = null;
            this.f4190d.m3313a(3, cArr);
        }
    }

    public final boolean m3205c() {
        return this.f4189c;
    }

    public final C1373i m3206d() {
        return new C1373i(this.f4190d);
    }

    public final byte[] m3207e() {
        C1347c.m3190a(this.f4191e);
        byte[] a = this.f4190d.m3314a(0);
        this.f4191e = a;
        return a;
    }

    public final byte[] m3208f() {
        C1347c.m3190a(this.f4192f);
        byte[] a = this.f4190d.m3314a(1);
        this.f4192f = a;
        return a;
    }

    public final byte[] m3209g() {
        C1347c.m3190a(this.f4193g);
        byte[] a = this.f4190d.m3314a(3);
        this.f4193g = a;
        return a;
    }

    public final char[] m3210h() {
        C1347c.m3190a(this.f4194h);
        char[] b = this.f4190d.m3316b(0);
        this.f4194h = b;
        return b;
    }

    public final char[] m3211i() {
        C1347c.m3190a(this.f4195i);
        char[] b = this.f4190d.m3316b(1);
        this.f4195i = b;
        return b;
    }
}
