package com.google.p173d;

public final class C5615f extends C2046m {
    private static final C5615f f15474c;

    static {
        C5615f c5615f = new C5615f();
        f15474c = c5615f;
        c5615f.setStackTrace(b);
    }

    private C5615f() {
    }

    private C5615f(Throwable th) {
        super(th);
    }

    public static C5615f m12347a() {
        return a ? new C5615f() : f15474c;
    }

    public static C5615f m12348a(Throwable th) {
        return a ? new C5615f(th) : f15474c;
    }
}
