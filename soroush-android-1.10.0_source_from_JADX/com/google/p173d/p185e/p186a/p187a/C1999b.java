package com.google.p173d.p185e.p186a.p187a;

import java.util.ArrayList;
import java.util.List;

final class C1999b {
    final List<C1998a> f6703a;
    final int f6704b;
    private final boolean f6705c = false;

    C1999b(List<C1998a> list, int i) {
        this.f6703a = new ArrayList(list);
        this.f6704b = i;
    }

    final boolean m5477a(List<C1998a> list) {
        return this.f6703a.equals(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1999b)) {
            return false;
        }
        C1999b c1999b = (C1999b) obj;
        return this.f6703a.equals(c1999b.f6703a) && this.f6705c == c1999b.f6705c;
    }

    public final int hashCode() {
        return this.f6703a.hashCode() ^ Boolean.valueOf(this.f6705c).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("{ ");
        stringBuilder.append(this.f6703a);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
