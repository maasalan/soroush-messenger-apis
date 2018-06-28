package com.p111d.p112a.p114b.p120g;

public final class C1368a {
    private static final int[] f4320c = new int[]{8000, 8000, 2000, 2000};
    private static final int[] f4321d = new int[]{4000, 4000, 200, 200};
    protected final byte[][] f4322a;
    protected final char[][] f4323b;

    public C1368a() {
        this((byte) 0);
    }

    private C1368a(byte b) {
        this.f4322a = new byte[4][];
        this.f4323b = new char[4][];
    }

    public final void m3312a(int i, byte[] bArr) {
        this.f4322a[i] = bArr;
    }

    public final void m3313a(int i, char[] cArr) {
        this.f4323b[i] = cArr;
    }

    public final byte[] m3314a(int i) {
        int i2 = f4320c[i];
        if (i2 <= 0) {
            i2 = 0;
        }
        byte[] bArr = this.f4322a[i];
        if (bArr != null) {
            if (bArr.length >= i2) {
                this.f4322a[i] = null;
                return bArr;
            }
        }
        return new byte[i2];
    }

    public final char[] m3315a(int i, int i2) {
        int i3 = f4321d[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[] cArr = this.f4323b[i];
        if (cArr != null) {
            if (cArr.length >= i2) {
                this.f4323b[i] = null;
                return cArr;
            }
        }
        return new char[i2];
    }

    public final char[] m3316b(int i) {
        return m3315a(i, 0);
    }
}
