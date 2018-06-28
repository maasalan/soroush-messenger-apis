package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p109i.C1268e;
import com.p085c.p086a.p109i.C1273i;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class C5156u implements C1208h {
    private static final C1268e<Class<?>, byte[]> f14457b = new C1268e(50);
    private final C1208h f14458c;
    private final C1208h f14459d;
    private final int f14460e;
    private final int f14461f;
    private final Class<?> f14462g;
    private final C5253j f14463h;
    private final C5255m<?> f14464i;

    public C5156u(C1208h c1208h, C1208h c1208h2, int i, int i2, C5255m<?> c5255m, Class<?> cls, C5253j c5253j) {
        this.f14458c = c1208h;
        this.f14459d = c1208h2;
        this.f14460e = i;
        this.f14461f = i2;
        this.f14464i = c5255m;
        this.f14462g = cls;
        this.f14463h = c5253j;
    }

    public final void mo1158a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f14460e).putInt(this.f14461f).array();
        this.f14459d.mo1158a(messageDigest);
        this.f14458c.mo1158a(messageDigest);
        messageDigest.update(array);
        if (this.f14464i != null) {
            this.f14464i.mo1158a(messageDigest);
        }
        this.f14463h.mo1158a(messageDigest);
        array = (byte[]) f14457b.m3005b(this.f14462g);
        if (array == null) {
            array = this.f14462g.getName().getBytes(a);
            f14457b.m3006b(this.f14462g, array);
        }
        messageDigest.update(array);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5156u) {
            C5156u c5156u = (C5156u) obj;
            if (this.f14461f == c5156u.f14461f && this.f14460e == c5156u.f14460e && C1273i.m3023a(this.f14464i, c5156u.f14464i) && this.f14462g.equals(c5156u.f14462g) && this.f14458c.equals(c5156u.f14458c) && this.f14459d.equals(c5156u.f14459d) && this.f14463h.equals(c5156u.f14463h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f14458c.hashCode() * 31) + this.f14459d.hashCode()) * 31) + this.f14460e) * 31) + this.f14461f;
        if (this.f14464i != null) {
            hashCode = (hashCode * 31) + this.f14464i.hashCode();
        }
        return (31 * ((hashCode * 31) + this.f14462g.hashCode())) + this.f14463h.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResourceCacheKey{sourceKey=");
        stringBuilder.append(this.f14458c);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14459d);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f14460e);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f14461f);
        stringBuilder.append(", decodedResourceClass=");
        stringBuilder.append(this.f14462g);
        stringBuilder.append(", transformation='");
        stringBuilder.append(this.f14464i);
        stringBuilder.append('\'');
        stringBuilder.append(", options=");
        stringBuilder.append(this.f14463h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
