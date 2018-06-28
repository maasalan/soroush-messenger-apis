package com.p111d.p112a.p121c.p123b;

import com.p111d.p112a.p121c.p134k.C1497h;
import com.p111d.p112a.p121c.p134k.C1506s;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1520c;
import java.io.Serializable;

public final class C1410i implements Serializable {
    protected static final C1506s[] f4444a = new C1506s[0];
    protected static final C1497h[] f4445b = new C1497h[0];
    protected final C1506s[] f4446c;
    protected final C1506s[] f4447d;
    protected final C1497h[] f4448e;

    public C1410i() {
        this(null, null, null);
    }

    private C1410i(C1506s[] c1506sArr, C1506s[] c1506sArr2, C1497h[] c1497hArr) {
        if (c1506sArr == null) {
            c1506sArr = f4444a;
        }
        this.f4446c = c1506sArr;
        if (c1506sArr2 == null) {
            c1506sArr2 = f4444a;
        }
        this.f4447d = c1506sArr2;
        if (c1497hArr == null) {
            c1497hArr = f4445b;
        }
        this.f4448e = c1497hArr;
    }

    public final C1410i m3446a(C1497h c1497h) {
        if (c1497h == null) {
            throw new IllegalArgumentException("Can not pass null modifier");
        }
        return new C1410i(this.f4446c, this.f4447d, (C1497h[]) C1519b.m3937a(this.f4448e, (Object) c1497h));
    }

    public final C1410i m3447a(C1506s c1506s) {
        if (c1506s != null) {
            return new C1410i((C1506s[]) C1519b.m3937a(this.f4446c, (Object) c1506s), this.f4447d, this.f4448e);
        }
        throw new IllegalArgumentException("Can not pass null Serializers");
    }

    public final boolean m3448a() {
        return this.f4447d.length > 0;
    }

    public final C1410i m3449b(C1506s c1506s) {
        if (c1506s == null) {
            throw new IllegalArgumentException("Can not pass null Serializers");
        }
        return new C1410i(this.f4446c, (C1506s[]) C1519b.m3937a(this.f4447d, (Object) c1506s), this.f4448e);
    }

    public final boolean m3450b() {
        return this.f4448e.length > 0;
    }

    public final Iterable<C1506s> m3451c() {
        return new C1520c(this.f4446c);
    }

    public final Iterable<C1506s> m3452d() {
        return new C1520c(this.f4447d);
    }

    public final Iterable<C1497h> m3453e() {
        return new C1520c(this.f4448e);
    }
}
