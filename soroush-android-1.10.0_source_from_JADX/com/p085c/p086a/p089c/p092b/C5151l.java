package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.C5255m;
import com.p085c.p086a.p109i.C1271h;
import java.security.MessageDigest;
import java.util.Map;

public final class C5151l implements C1208h {
    private final Object f14427b;
    private final int f14428c;
    private final int f14429d;
    private final Class<?> f14430e;
    private final Class<?> f14431f;
    private final C1208h f14432g;
    private final Map<Class<?>, C5255m<?>> f14433h;
    private final C5253j f14434i;
    private int f14435j;

    public C5151l(Object obj, C1208h c1208h, int i, int i2, Map<Class<?>, C5255m<?>> map, Class<?> cls, Class<?> cls2, C5253j c5253j) {
        this.f14427b = C1271h.m3012a(obj, "Argument must not be null");
        this.f14432g = (C1208h) C1271h.m3012a((Object) c1208h, "Signature must not be null");
        this.f14428c = i;
        this.f14429d = i2;
        this.f14433h = (Map) C1271h.m3012a((Object) map, "Argument must not be null");
        this.f14430e = (Class) C1271h.m3012a((Object) cls, "Resource class must not be null");
        this.f14431f = (Class) C1271h.m3012a((Object) cls2, "Transcode class must not be null");
        this.f14434i = (C5253j) C1271h.m3012a((Object) c5253j, "Argument must not be null");
    }

    public final void mo1158a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5151l) {
            C5151l c5151l = (C5151l) obj;
            if (this.f14427b.equals(c5151l.f14427b) && this.f14432g.equals(c5151l.f14432g) && this.f14429d == c5151l.f14429d && this.f14428c == c5151l.f14428c && this.f14433h.equals(c5151l.f14433h) && this.f14430e.equals(c5151l.f14430e) && this.f14431f.equals(c5151l.f14431f) && this.f14434i.equals(c5151l.f14434i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14435j == 0) {
            this.f14435j = this.f14427b.hashCode();
            this.f14435j = (this.f14435j * 31) + this.f14432g.hashCode();
            this.f14435j = (this.f14435j * 31) + this.f14428c;
            this.f14435j = (this.f14435j * 31) + this.f14429d;
            this.f14435j = (this.f14435j * 31) + this.f14433h.hashCode();
            this.f14435j = (this.f14435j * 31) + this.f14430e.hashCode();
            this.f14435j = (this.f14435j * 31) + this.f14431f.hashCode();
            this.f14435j = (31 * this.f14435j) + this.f14434i.hashCode();
        }
        return this.f14435j;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EngineKey{model=");
        stringBuilder.append(this.f14427b);
        stringBuilder.append(", width=");
        stringBuilder.append(this.f14428c);
        stringBuilder.append(", height=");
        stringBuilder.append(this.f14429d);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(this.f14430e);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(this.f14431f);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.f14432g);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(this.f14435j);
        stringBuilder.append(", transformations=");
        stringBuilder.append(this.f14433h);
        stringBuilder.append(", options=");
        stringBuilder.append(this.f14434i);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
