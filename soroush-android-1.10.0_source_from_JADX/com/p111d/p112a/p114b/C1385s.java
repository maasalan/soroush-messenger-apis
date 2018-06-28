package com.p111d.p112a.p114b;

import java.io.Serializable;

public final class C1385s implements Serializable, Comparable<C1385s> {
    private static final C1385s f4398g = new C1385s(0, 0, 0, null, null, null);
    protected final int f4399a;
    protected final int f4400b;
    protected final int f4401c;
    protected final String f4402d;
    protected final String f4403e;
    protected final String f4404f;

    public C1385s(int i, int i2, int i3, String str, String str2, String str3) {
        this.f4399a = i;
        this.f4400b = i2;
        this.f4401c = i3;
        this.f4404f = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f4402d = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f4403e = str3;
    }

    public static C1385s m3374a() {
        return f4398g;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1385s c1385s = (C1385s) obj;
        if (c1385s == this) {
            return 0;
        }
        int compareTo = this.f4402d.compareTo(c1385s.f4402d);
        if (compareTo == 0) {
            compareTo = this.f4403e.compareTo(c1385s.f4403e);
            if (compareTo == 0) {
                compareTo = this.f4399a - c1385s.f4399a;
                if (compareTo == 0) {
                    compareTo = this.f4400b - c1385s.f4400b;
                    if (compareTo == 0) {
                        compareTo = this.f4401c - c1385s.f4401c;
                    }
                }
            }
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C1385s c1385s = (C1385s) obj;
        return c1385s.f4399a == this.f4399a && c1385s.f4400b == this.f4400b && c1385s.f4401c == this.f4401c && c1385s.f4403e.equals(this.f4403e) && c1385s.f4402d.equals(this.f4402d);
    }

    public final int hashCode() {
        return this.f4403e.hashCode() ^ (((this.f4402d.hashCode() + this.f4399a) - this.f4400b) + this.f4401c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f4399a);
        stringBuilder.append('.');
        stringBuilder.append(this.f4400b);
        stringBuilder.append('.');
        stringBuilder.append(this.f4401c);
        Object obj = (this.f4404f == null || this.f4404f.length() <= 0) ? null : 1;
        if (obj != null) {
            stringBuilder.append('-');
            stringBuilder.append(this.f4404f);
        }
        return stringBuilder.toString();
    }
}
