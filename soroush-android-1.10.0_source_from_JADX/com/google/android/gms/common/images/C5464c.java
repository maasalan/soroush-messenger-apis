package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager.C1751a;
import com.google.android.gms.common.internal.aa;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class C5464c extends C1754a {
    private WeakReference<C1751a> f15147c;

    protected final void mo1562a() {
        this.f15147c.get();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5464c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C5464c c5464c = (C5464c) obj;
        C1751a c1751a = (C1751a) this.f15147c.get();
        C1751a c1751a2 = (C1751a) c5464c.f15147c.get();
        return c1751a2 != null && c1751a != null && aa.m4374a(c1751a2, c1751a) && aa.m4374a(c5464c.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
