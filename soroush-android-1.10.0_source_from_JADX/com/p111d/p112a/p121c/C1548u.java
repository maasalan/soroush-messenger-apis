package com.p111d.p112a.p121c;

import java.io.Serializable;

public final class C1548u implements Serializable {
    public static final C1548u f4828a = new C1548u(Boolean.TRUE, null, null, null);
    public static final C1548u f4829b = new C1548u(Boolean.FALSE, null, null, null);
    public static final C1548u f4830c = new C1548u(null, null, null, null);
    protected final Boolean f4831d;
    protected final String f4832e;
    protected final Integer f4833f;
    protected final String f4834g;

    private C1548u(Boolean bool, String str, Integer num, String str2) {
        this.f4831d = bool;
        this.f4832e = str;
        this.f4833f = num;
        if (str2 == null || str2.isEmpty()) {
            str2 = null;
        }
        this.f4834g = str2;
    }

    public static C1548u m4052a(boolean z, String str, Integer num, String str2) {
        if (str == null && num == null) {
            if (str2 == null) {
                return z ? f4828a : f4829b;
            }
        }
        return new C1548u(Boolean.valueOf(z), str, num, str2);
    }

    public final C1548u m4053a(String str) {
        return new C1548u(this.f4831d, str, this.f4833f, this.f4834g);
    }

    public final boolean m4054a() {
        return this.f4831d != null && this.f4831d.booleanValue();
    }
}
