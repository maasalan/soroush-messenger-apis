package com.google.p173d.p185e.p186a;

public class C2000b {
    public final int f6706a;
    public final int f6707b;

    public C2000b(int i, int i2) {
        this.f6706a = i;
        this.f6707b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2000b)) {
            return false;
        }
        C2000b c2000b = (C2000b) obj;
        return this.f6706a == c2000b.f6706a && this.f6707b == c2000b.f6707b;
    }

    public final int hashCode() {
        return this.f6706a ^ this.f6707b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f6706a);
        stringBuilder.append("(");
        stringBuilder.append(this.f6707b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
