package com.p085c.p086a.p089c;

import android.support.v4.p038g.C4813a;
import com.p085c.p086a.p089c.C1210i.C1209a;
import java.security.MessageDigest;
import java.util.Map.Entry;

public final class C5253j implements C1208h {
    public final C4813a<C1210i<?>, Object> f14601b = new C4813a();

    public final <T> T m10873a(C1210i<T> c1210i) {
        return this.f14601b.containsKey(c1210i) ? this.f14601b.get(c1210i) : c1210i.f3824a;
    }

    public final void m10874a(C5253j c5253j) {
        this.f14601b.m1017a(c5253j.f14601b);
    }

    public final void mo1158a(MessageDigest messageDigest) {
        for (Entry entry : this.f14601b.entrySet()) {
            C1210i c1210i = (C1210i) entry.getKey();
            Object value = entry.getValue();
            C1209a c1209a = c1210i.f3825b;
            if (c1210i.f3827d == null) {
                c1210i.f3827d = c1210i.f3826c.getBytes(C1208h.f3822a);
            }
            c1209a.mo1214a(c1210i.f3827d, value, messageDigest);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5253j)) {
            return false;
        }
        return this.f14601b.equals(((C5253j) obj).f14601b);
    }

    public final int hashCode() {
        return this.f14601b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Options{values=");
        stringBuilder.append(this.f14601b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
