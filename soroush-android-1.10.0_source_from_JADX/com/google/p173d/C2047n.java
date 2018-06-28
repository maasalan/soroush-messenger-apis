package com.google.p173d;

import java.util.EnumMap;
import java.util.Map;

public final class C2047n {
    public final String f6872a;
    public final byte[] f6873b;
    public C2049p[] f6874c;
    public final C1958a f6875d;
    public Map<C2048o, Object> f6876e;
    private final int f6877f;
    private final long f6878g;

    public C2047n(String str, byte[] bArr, int i, C2049p[] c2049pArr, C1958a c1958a, long j) {
        this.f6872a = str;
        this.f6873b = bArr;
        this.f6877f = i;
        this.f6874c = c2049pArr;
        this.f6875d = c1958a;
        this.f6876e = null;
        this.f6878g = j;
    }

    public C2047n(String str, byte[] bArr, C2049p[] c2049pArr, C1958a c1958a) {
        this(str, bArr, c2049pArr, c1958a, System.currentTimeMillis());
    }

    private C2047n(String str, byte[] bArr, C2049p[] c2049pArr, C1958a c1958a, long j) {
        this(str, bArr, bArr == null ? 0 : 8 * bArr.length, c2049pArr, c1958a, j);
    }

    public final void m5581a(C2048o c2048o, Object obj) {
        if (this.f6876e == null) {
            this.f6876e = new EnumMap(C2048o.class);
        }
        this.f6876e.put(c2048o, obj);
    }

    public final void m5582a(Map<C2048o, Object> map) {
        if (map != null) {
            if (this.f6876e == null) {
                this.f6876e = map;
                return;
            }
            this.f6876e.putAll(map);
        }
    }

    public final String toString() {
        return this.f6872a;
    }
}
