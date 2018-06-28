package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

public final class C1759g {
    final String f5396a;
    final ComponentName f5397b = null;
    final int f5398c;
    private final String f5399d;

    public C1759g(String str, String str2, int i) {
        this.f5399d = ac.m4378a(str);
        this.f5396a = ac.m4378a(str2);
        this.f5398c = i;
    }

    public final Intent m4452a() {
        return this.f5399d != null ? new Intent(this.f5399d).setPackage(this.f5396a) : new Intent().setComponent(this.f5397b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1759g)) {
            return false;
        }
        C1759g c1759g = (C1759g) obj;
        return aa.m4374a(this.f5399d, c1759g.f5399d) && aa.m4374a(this.f5396a, c1759g.f5396a) && aa.m4374a(this.f5397b, c1759g.f5397b) && this.f5398c == c1759g.f5398c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5399d, this.f5396a, this.f5397b, Integer.valueOf(this.f5398c)});
    }

    public final String toString() {
        return this.f5399d == null ? this.f5397b.flattenToString() : this.f5399d;
    }
}
