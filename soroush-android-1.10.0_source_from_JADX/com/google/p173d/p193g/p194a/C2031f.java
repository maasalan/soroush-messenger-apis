package com.google.p173d.p193g.p194a;

public enum C2031f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    private static final C2031f[] f6817e = null;
    private final int f6819f;

    static {
        f6817e = new C2031f[]{M, L, H, Q};
    }

    private C2031f(int i) {
        this.f6819f = i;
    }

    public static C2031f m5551a(int i) {
        if (i >= 0) {
            if (i < f6817e.length) {
                return f6817e[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
