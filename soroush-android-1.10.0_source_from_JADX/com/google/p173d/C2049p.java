package com.google.p173d;

import com.google.p173d.p177b.p178a.C1959a;

public class C2049p {
    public final float f6891a;
    public final float f6892b;

    public C2049p(float f, float f2) {
        this.f6891a = f;
        this.f6892b = f2;
    }

    public static float m5583a(C2049p c2049p, C2049p c2049p2) {
        return C1959a.m5386a(c2049p.f6891a, c2049p.f6892b, c2049p2.f6891a, c2049p2.f6892b);
    }

    public static void m5584a(C2049p[] c2049pArr) {
        C2049p c2049p;
        C2049p c2049p2;
        C2049p c2049p3;
        float a = C2049p.m5583a(c2049pArr[0], c2049pArr[1]);
        float a2 = C2049p.m5583a(c2049pArr[1], c2049pArr[2]);
        float a3 = C2049p.m5583a(c2049pArr[0], c2049pArr[2]);
        if (a2 >= a && a2 >= a3) {
            c2049p = c2049pArr[0];
            c2049p2 = c2049pArr[1];
            c2049p3 = c2049pArr[2];
        } else if (a3 < a2 || a3 < a) {
            c2049p = c2049pArr[2];
            c2049p2 = c2049pArr[0];
            c2049p3 = c2049pArr[1];
        } else {
            c2049p = c2049pArr[1];
            c2049p2 = c2049pArr[0];
            c2049p3 = c2049pArr[2];
        }
        float f = c2049p.f6891a;
        float f2 = c2049p.f6892b;
        if (((c2049p3.f6891a - f) * (c2049p2.f6892b - f2)) - ((c2049p3.f6892b - f2) * (c2049p2.f6891a - f)) < 0.0f) {
            C2049p c2049p4 = c2049p3;
            c2049p3 = c2049p2;
            c2049p2 = c2049p4;
        }
        c2049pArr[0] = c2049p2;
        c2049pArr[1] = c2049p;
        c2049pArr[2] = c2049p3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2049p) {
            C2049p c2049p = (C2049p) obj;
            if (this.f6891a == c2049p.f6891a && this.f6892b == c2049p.f6892b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (31 * Float.floatToIntBits(this.f6891a)) + Float.floatToIntBits(this.f6892b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.f6891a);
        stringBuilder.append(',');
        stringBuilder.append(this.f6892b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
