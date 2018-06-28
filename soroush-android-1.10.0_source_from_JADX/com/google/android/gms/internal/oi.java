package com.google.android.gms.internal;

public abstract class oi {
    protected volatile int f6254I = -1;

    public static <T extends oi> T m5122a(T t, byte[] bArr, int i) {
        try {
            nz a = nz.m5045a(bArr, i);
            t.mo3038a(a);
            a.m5050a(0);
            return t;
        } catch (oh e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] m5123a(oi oiVar) {
        byte[] bArr = new byte[oiVar.m5129f()];
        try {
            oa a = oa.m5073a(bArr, bArr.length);
            oiVar.mo1667a(a);
            a.m5085a();
            return bArr;
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract oi mo3038a(nz nzVar);

    public void mo1667a(oa oaVar) {
    }

    protected int mo1668b() {
        return 0;
    }

    public /* synthetic */ Object clone() {
        return mo1670d();
    }

    public oi mo1670d() {
        return (oi) super.clone();
    }

    public final int m5128e() {
        if (this.f6254I < 0) {
            m5129f();
        }
        return this.f6254I;
    }

    public final int m5129f() {
        int b = mo1668b();
        this.f6254I = b;
        return b;
    }

    public String toString() {
        return oj.m5130a(this);
    }
}
