package com.p085c.p086a.p104f;

import com.p085c.p086a.p089c.C1206f;
import java.util.ArrayList;
import java.util.List;

public final class C1230b {
    private final List<C1206f> f3883a = new ArrayList();

    public final synchronized List<C1206f> m2901a() {
        return this.f3883a;
    }

    public final synchronized void m2902a(C1206f c1206f) {
        this.f3883a.add(c1206f);
    }
}
