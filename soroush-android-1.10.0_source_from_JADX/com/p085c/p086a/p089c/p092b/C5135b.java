package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1208h;
import java.security.MessageDigest;

final class C5135b implements C1208h {
    private final C1208h f14355b;
    private final C1208h f14356c;

    public C5135b(C1208h c1208h, C1208h c1208h2) {
        this.f14355b = c1208h;
        this.f14356c = c1208h2;
    }

    public final void mo1158a(MessageDigest messageDigest) {
        this.f14355b.mo1158a(messageDigest);
        this.f14356c.mo1158a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5135b) {
            C5135b c5135b = (C5135b) obj;
            if (this.f14355b.equals(c5135b.f14355b) && this.f14356c.equals(c5135b.f14356c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * this.f14355b.hashCode()) + this.f14356c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataCacheKey{sourceKey=");
        stringBuilder.append(this.f14355b);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14356c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
