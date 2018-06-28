package com.p111d.p112a.p114b.p116c;

import com.p111d.p112a.p114b.C1382p;
import java.io.Serializable;

public final class C5293j implements C1382p, Serializable {
    protected final String f14680a;
    protected byte[] f14681b;
    protected byte[] f14682c;
    protected char[] f14683d;

    public C5293j(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f14680a = str;
    }

    public final int appendQuotedUTF8(byte[] bArr, int i) {
        Object obj = this.f14681b;
        if (obj == null) {
            obj = C1349e.m3216a().m3219b(this.f14680a);
            this.f14681b = obj;
        }
        int length = obj.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(obj, 0, bArr, i, length);
        return length;
    }

    public final char[] asQuotedChars() {
        char[] cArr = this.f14683d;
        if (cArr != null) {
            return cArr;
        }
        cArr = C1349e.m3216a().m3218a(this.f14680a);
        this.f14683d = cArr;
        return cArr;
    }

    public final byte[] asQuotedUTF8() {
        byte[] bArr = this.f14681b;
        if (bArr != null) {
            return bArr;
        }
        bArr = C1349e.m3216a().m3219b(this.f14680a);
        this.f14681b = bArr;
        return bArr;
    }

    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this.f14682c;
        if (bArr != null) {
            return bArr;
        }
        bArr = C1349e.m3216a().m3220c(this.f14680a);
        this.f14682c = bArr;
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                return this.f14680a.equals(((C5293j) obj).f14680a);
            }
        }
        return false;
    }

    public final String getValue() {
        return this.f14680a;
    }

    public final int hashCode() {
        return this.f14680a.hashCode();
    }

    public final String toString() {
        return this.f14680a;
    }
}
