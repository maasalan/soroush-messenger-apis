package com.google.p173d.p185e.p186a.p187a;

import com.google.p173d.p185e.p186a.C2000b;
import com.google.p173d.p185e.p186a.C2001c;

final class C1998a {
    final C2000b f6699a;
    final C2000b f6700b;
    final C2001c f6701c;
    private final boolean f6702d = true;

    C1998a(C2000b c2000b, C2000b c2000b2, C2001c c2001c) {
        this.f6699a = c2000b;
        this.f6700b = c2000b2;
        this.f6701c = c2001c;
    }

    private static int m5475a(Object obj) {
        return obj == null ? 0 : obj.hashCode();
    }

    private static boolean m5476a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1998a)) {
            return false;
        }
        C1998a c1998a = (C1998a) obj;
        return C1998a.m5476a(this.f6699a, c1998a.f6699a) && C1998a.m5476a(this.f6700b, c1998a.f6700b) && C1998a.m5476a(this.f6701c, c1998a.f6701c);
    }

    public final int hashCode() {
        return (C1998a.m5475a(this.f6699a) ^ C1998a.m5475a(this.f6700b)) ^ C1998a.m5475a(this.f6701c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ ");
        stringBuilder.append(this.f6699a);
        stringBuilder.append(" , ");
        stringBuilder.append(this.f6700b);
        stringBuilder.append(" : ");
        stringBuilder.append(this.f6701c == null ? "null" : Integer.valueOf(this.f6701c.f6708a));
        stringBuilder.append(" ]");
        return stringBuilder.toString();
    }
}
