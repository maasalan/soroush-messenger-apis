package com.p085c.p086a.p108h;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;

public final class C5277c implements C1208h {
    private final Object f14640b;

    public C5277c(Object obj) {
        this.f14640b = C1271h.m3012a(obj, "Argument must not be null");
    }

    public final void mo1158a(MessageDigest messageDigest) {
        messageDigest.update(this.f14640b.toString().getBytes(a));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5277c)) {
            return false;
        }
        return this.f14640b.equals(((C5277c) obj).f14640b);
    }

    public final int hashCode() {
        return this.f14640b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ObjectKey{object=");
        stringBuilder.append(this.f14640b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
