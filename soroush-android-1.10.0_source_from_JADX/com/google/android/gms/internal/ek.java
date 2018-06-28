package com.google.android.gms.internal;

public final class ek {
    private static ek f5678a;
    private final ef f5679b = new ef();
    private final eg f5680c = new eg();

    static {
        ek ekVar = new ek();
        synchronized (ek.class) {
            f5678a = ekVar;
        }
    }

    private ek() {
    }

    public static ef m4768a() {
        return m4770c().f5679b;
    }

    public static eg m4769b() {
        return m4770c().f5680c;
    }

    private static ek m4770c() {
        ek ekVar;
        synchronized (ek.class) {
            ekVar = f5678a;
        }
        return ekVar;
    }
}
