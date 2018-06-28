package com.google.p173d.p177b.p179b;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import org.jivesoftware.smack.roster.Roster;

public final class C1962a {
    public static final C1962a f6555a = new C1962a(4201, ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 1);
    public static final C1962a f6556b = new C1962a(1033, Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE, 1);
    public static final C1962a f6557c = new C1962a(67, 64, 1);
    public static final C1962a f6558d = new C1962a(19, 16, 1);
    public static final C1962a f6559e = new C1962a(285, 256, 0);
    public static final C1962a f6560f;
    public static final C1962a f6561g;
    public static final C1962a f6562h = f6557c;
    final int[] f6563i;
    final C1963b f6564j;
    final C1963b f6565k;
    final int f6566l;
    final int f6567m;
    private final int[] f6568n;
    private final int f6569o;

    static {
        C1962a c1962a = new C1962a(301, 256, 1);
        f6560f = c1962a;
        f6561g = c1962a;
    }

    private C1962a(int i, int i2, int i3) {
        this.f6569o = i;
        this.f6566l = i2;
        this.f6567m = i3;
        this.f6563i = new int[i2];
        this.f6568n = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f6563i[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (i = 0; i < i2 - 1; i++) {
            this.f6568n[this.f6563i[i]] = i;
        }
        this.f6564j = new C1963b(this, new int[]{0});
        this.f6565k = new C1963b(this, new int[]{1});
    }

    static int m5400b(int i, int i2) {
        return i ^ i2;
    }

    final int m5401a(int i) {
        if (i != 0) {
            return this.f6568n[i];
        }
        throw new IllegalArgumentException();
    }

    final C1963b m5402a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f6564j;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C1963b(this, iArr);
        }
    }

    final int m5403b(int i) {
        if (i != 0) {
            return this.f6563i[(this.f6566l - this.f6568n[i]) - 1];
        }
        throw new ArithmeticException();
    }

    final int m5404c(int i, int i2) {
        if (i != 0) {
            if (i2 != 0) {
                return this.f6563i[(this.f6568n[i] + this.f6568n[i2]) % (this.f6566l - 1)];
            }
        }
        return 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString(this.f6569o));
        stringBuilder.append(',');
        stringBuilder.append(this.f6566l);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
