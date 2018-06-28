package com.p085c.p086a.p089c;

import java.io.IOException;

public final class C1204e extends IOException {
    private final int f3811a;

    public C1204e(int i) {
        StringBuilder stringBuilder = new StringBuilder("Http request failed with status code: ");
        stringBuilder.append(i);
        this(stringBuilder.toString(), i);
    }

    public C1204e(String str) {
        this(str, -1);
    }

    public C1204e(String str, int i) {
        this(str, i, (byte) 0);
    }

    private C1204e(String str, int i, byte b) {
        super(str, null);
        this.f3811a = i;
    }
}
