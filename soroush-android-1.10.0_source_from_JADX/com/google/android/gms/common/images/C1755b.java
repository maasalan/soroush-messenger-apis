package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.aa;
import java.util.Arrays;

final class C1755b {
    public final Uri f5337a;

    public C1755b(Uri uri) {
        this.f5337a = uri;
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof C1755b) ? false : this == obj ? true : aa.m4374a(((C1755b) obj).f5337a, this.f5337a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5337a});
    }
}
