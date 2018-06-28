package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p114b.p120g.C1372f;
import com.p111d.p112a.p121c.p123b.C5306f;
import java.io.Serializable;

public final class C1549v implements Serializable {
    public static final C1549v f4835a = new C1549v("", null);
    public static final C1549v f4836b = new C1549v(new String(""), null);
    protected final String f4837c;
    protected final String f4838d;
    protected C1382p f4839e;

    public C1549v(String str) {
        this(str, null);
    }

    private C1549v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.f4837c = str;
        this.f4838d = str2;
    }

    public static C1549v m4055a(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return new C1549v(C1372f.f4330a.m3329a(str), null);
            }
        }
        return f4835a;
    }

    public static C1549v m4056a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.length() == 0) ? f4835a : new C1549v(C1372f.f4330a.m3329a(str), str2);
    }

    public final C1382p m4057a(C5306f<?> c5306f) {
        C1382p c1382p = this.f4839e;
        if (c1382p == null) {
            c1382p = c5306f == null ? new C5293j(this.f4837c) : C5306f.m11073a(this.f4837c);
            this.f4839e = c1382p;
        }
        return c1382p;
    }

    public final C1549v m4058a() {
        if (this.f4837c.length() == 0) {
            return this;
        }
        String a = C1372f.f4330a.m3329a(this.f4837c);
        return a == this.f4837c ? this : new C1549v(a, this.f4838d);
    }

    public final C1549v m4059b(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.f4837c) ? this : new C1549v(str, this.f4838d);
    }

    public final String m4060b() {
        return this.f4837c;
    }

    public final boolean m4061c() {
        return this.f4837c.length() > 0;
    }

    public final boolean m4062c(String str) {
        return str == null ? this.f4837c == null : str.equals(this.f4837c);
    }

    public final boolean m4063d() {
        return this.f4838d != null;
    }

    public final boolean m4064e() {
        return this.f4838d == null && this.f4837c.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C1549v c1549v = (C1549v) obj;
        if (this.f4837c == null) {
            if (c1549v.f4837c != null) {
                return false;
            }
        } else if (!this.f4837c.equals(c1549v.f4837c)) {
            return false;
        }
        return this.f4838d == null ? c1549v.f4838d == null : this.f4838d.equals(c1549v.f4838d);
    }

    public final int hashCode() {
        return this.f4838d == null ? this.f4837c.hashCode() : this.f4838d.hashCode() ^ this.f4837c.hashCode();
    }

    public final String toString() {
        if (this.f4838d == null) {
            return this.f4837c;
        }
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append(this.f4838d);
        stringBuilder.append("}");
        stringBuilder.append(this.f4837c);
        return stringBuilder.toString();
    }
}
