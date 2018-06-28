package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.C1708a.C1704a;
import com.google.android.gms.common.internal.aa;
import java.util.Arrays;

public final class aj<O extends C1704a> {
    public final C1708a<O> f5238a;
    private final boolean f5239b = false;
    private final int f5240c;
    private final O f5241d;

    public aj(C1708a<O> c1708a, O o) {
        this.f5238a = c1708a;
        this.f5241d = o;
        this.f5240c = Arrays.hashCode(new Object[]{this.f5238a, this.f5241d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return !this.f5239b && !ajVar.f5239b && aa.m4374a(this.f5238a, ajVar.f5238a) && aa.m4374a(this.f5241d, ajVar.f5241d);
    }

    public final int hashCode() {
        return this.f5240c;
    }
}
