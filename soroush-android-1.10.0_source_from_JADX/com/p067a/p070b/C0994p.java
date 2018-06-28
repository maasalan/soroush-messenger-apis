package com.p067a.p070b;

import com.p067a.p070b.C0978b.C0977a;

public final class C0994p<T> {
    public final T f3194a;
    public final C0977a f3195b;
    public final C0997u f3196c;
    public boolean f3197d;

    public interface C0992a {
        void onErrorResponse(C0997u c0997u);
    }

    public interface C0993b<T> {
        void onResponse(T t);
    }

    private C0994p(C0997u c0997u) {
        this.f3197d = false;
        this.f3194a = null;
        this.f3195b = null;
        this.f3196c = c0997u;
    }

    public C0994p(T t, C0977a c0977a) {
        this.f3197d = false;
        this.f3194a = t;
        this.f3195b = c0977a;
        this.f3196c = null;
    }

    public static <T> C0994p<T> m2445a(C0997u c0997u) {
        return new C0994p(c0997u);
    }
}
