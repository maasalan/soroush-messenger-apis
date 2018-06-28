package com.google.android.gms.internal;

import java.util.Arrays;

final class ok {
    final int f6255a;
    final byte[] f6256b;

    ok(int i, byte[] bArr) {
        this.f6255a = i;
        this.f6256b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return this.f6255a == okVar.f6255a && Arrays.equals(this.f6256b, okVar.f6256b);
    }

    public final int hashCode() {
        return ((527 + this.f6255a) * 31) + Arrays.hashCode(this.f6256b);
    }
}
