package com.p085c.p086a.p089c.p092b.p094b;

import com.p085c.p086a.p089c.p092b.p094b.C1115a.C1113a;
import java.io.File;

public class C5128d implements C1113a {
    private final int f14340a = 262144000;
    private final C1119a f14341b;

    public interface C1119a {
        File mo1147a();
    }

    public C5128d(C1119a c1119a) {
        this.f14341b = c1119a;
    }

    public final C1115a mo1146a() {
        File a = this.f14341b.mo1147a();
        return a == null ? null : (a.mkdirs() || (a.exists() && a.isDirectory())) ? C5129e.m10547a(a, this.f14340a) : null;
    }
}
