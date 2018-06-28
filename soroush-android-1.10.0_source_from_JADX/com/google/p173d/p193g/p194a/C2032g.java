package com.google.p173d.p193g.p194a;

final class C2032g {
    private static final int[][] f6820c = new int[][]{new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    final C2031f f6821a;
    final byte f6822b;

    private C2032g(int i) {
        this.f6821a = C2031f.m5551a((i >> 3) & 3);
        this.f6822b = (byte) (i & 7);
    }

    static int m5552a(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    static C2032g m5553b(int i, int i2) {
        C2032g c = C2032g.m5554c(i, i2);
        return c != null ? c : C2032g.m5554c(i ^ 21522, i2 ^ 21522);
    }

    private static C2032g m5554c(int i, int i2) {
        int[][] iArr = f6820c;
        int length = iArr.length;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        int i5 = i3;
        while (i5 < length) {
            int[] iArr2 = iArr[i5];
            int i6 = iArr2[0];
            if (i6 != i) {
                if (i6 != i2) {
                    int bitCount = Integer.bitCount(i ^ i6);
                    if (bitCount < i4) {
                        i3 = iArr2[1];
                        i4 = bitCount;
                    }
                    if (i != i2) {
                        i6 = Integer.bitCount(i6 ^ i2);
                        if (i6 < i4) {
                            i3 = iArr2[1];
                            i4 = i6;
                        }
                    }
                    i5++;
                }
            }
            return new C2032g(iArr2[1]);
        }
        return i4 <= 3 ? new C2032g(i3) : null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2032g)) {
            return false;
        }
        C2032g c2032g = (C2032g) obj;
        return this.f6821a == c2032g.f6821a && this.f6822b == c2032g.f6822b;
    }

    public final int hashCode() {
        return (this.f6821a.ordinal() << 3) | this.f6822b;
    }
}
