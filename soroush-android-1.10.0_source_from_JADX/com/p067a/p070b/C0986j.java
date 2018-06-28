package com.p067a.p070b;

import java.io.Serializable;
import java.util.Map;

public final class C0986j implements Serializable {
    public final int f3170a;
    public final byte[] f3171b;
    public final Map<String, String> f3172c;
    public final boolean f3173d;
    public final long f3174e;

    public C0986j(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f3170a = i;
        this.f3171b = bArr;
        this.f3172c = map;
        this.f3173d = z;
        this.f3174e = j;
    }

    public C0986j(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
