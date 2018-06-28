package com.google.android.gms.auth.api.signin.internal;

public final class C1687b {
    private static int f5189b = 31;
    public int f5190a = 1;

    public final C1687b m4283a(Object obj) {
        this.f5190a = (f5189b * this.f5190a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public final C1687b m4284a(boolean z) {
        this.f5190a = (f5189b * this.f5190a) + z;
        return this;
    }
}
