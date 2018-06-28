package org.p501b.p502a.p504b;

import java.io.Serializable;
import org.p501b.p506b.C4617c;

public abstract class C4612c implements Serializable, CharSequence {
    private final String f12676a;

    protected C4612c(String str) {
        this.f12676a = str;
    }

    protected static void m8368b(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length > 1023) {
            throw new C4617c(str, "Given string is longer then 1023 bytes");
        } else if (toCharArray.length == 0) {
            throw new C4617c(str, "Argument can't be the empty string");
        }
    }

    public final char charAt(int i) {
        return this.f12676a.charAt(i);
    }

    public final boolean equals(Object obj) {
        return this == obj ? true : this.f12676a.equals(obj.toString());
    }

    public final int hashCode() {
        return this.f12676a.hashCode();
    }

    public final int length() {
        return this.f12676a.length();
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f12676a.subSequence(i, i2);
    }

    public final String toString() {
        return this.f12676a;
    }
}
