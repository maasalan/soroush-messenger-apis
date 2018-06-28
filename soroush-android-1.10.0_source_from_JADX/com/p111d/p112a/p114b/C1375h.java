package com.p111d.p112a.p114b;

import java.io.Serializable;

public class C1375h implements Serializable {
    public static final C1375h f4345a = new C1375h("N/A", -1, -1, -1, -1);
    final long f4346b;
    final long f4347c;
    final int f4348d;
    final int f4349e;
    final transient Object f4350f;

    public C1375h(Object obj, int i, int i2) {
        this(obj, -1, -1, i, i2);
    }

    public C1375h(Object obj, long j, long j2, int i, int i2) {
        this.f4350f = obj;
        this.f4346b = j;
        this.f4347c = j2;
        this.f4348d = i;
        this.f4349e = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1375h)) {
            return false;
        }
        C1375h c1375h = (C1375h) obj;
        if (this.f4350f == null) {
            if (c1375h.f4350f != null) {
                return false;
            }
        } else if (!this.f4350f.equals(c1375h.f4350f)) {
            return false;
        }
        return this.f4348d == c1375h.f4348d && this.f4349e == c1375h.f4349e && this.f4347c == c1375h.f4347c && this.f4346b == c1375h.f4346b;
    }

    public int hashCode() {
        return ((((this.f4350f == null ? 1 : this.f4350f.hashCode()) ^ this.f4348d) + this.f4349e) ^ ((int) this.f4347c)) + ((int) this.f4346b);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("[Source: ");
        stringBuilder.append(this.f4350f == null ? "UNKNOWN" : this.f4350f.toString());
        stringBuilder.append("; line: ");
        stringBuilder.append(this.f4348d);
        stringBuilder.append(", column: ");
        stringBuilder.append(this.f4349e);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
