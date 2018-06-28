package com.google.p173d.p177b;

import java.util.List;

public final class C1969e {
    public final byte[] f6612a;
    public int f6613b;
    public final String f6614c;
    public final List<byte[]> f6615d;
    public final String f6616e;
    public Integer f6617f;
    public Integer f6618g;
    public Object f6619h;
    public final int f6620i;
    public final int f6621j;

    public C1969e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public C1969e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f6612a = bArr;
        this.f6613b = bArr == null ? 0 : bArr.length * 8;
        this.f6614c = str;
        this.f6615d = list;
        this.f6616e = str2;
        this.f6620i = i2;
        this.f6621j = i;
    }
}
