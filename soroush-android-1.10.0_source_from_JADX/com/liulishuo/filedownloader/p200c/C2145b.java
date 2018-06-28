package com.liulishuo.filedownloader.p200c;

import com.liulishuo.filedownloader.p205h.C2185f;

public final class C2145b {
    final long f7144a;
    final long f7145b;
    final long f7146c;
    final long f7147d;
    final boolean f7148e;
    final boolean f7149f;

    public static class C2144a {
        public static C2145b m5891a(long j, long j2, long j3, long j4) {
            return new C2145b(j, j2, j3, j4);
        }
    }

    private C2145b() {
        this.f7144a = 0;
        this.f7145b = 0;
        this.f7146c = 0;
        this.f7147d = 0;
        this.f7148e = false;
        this.f7149f = true;
    }

    private C2145b(long j, long j2, long j3, long j4) {
        this(j, j2, j3, j4, false);
    }

    private C2145b(long j, long j2, long j3, long j4, boolean z) {
        if (!(j == 0 && j3 == 0) && z) {
            throw new IllegalArgumentException();
        }
        this.f7144a = j;
        this.f7145b = j2;
        this.f7146c = j3;
        this.f7147d = j4;
        this.f7148e = z;
        this.f7149f = false;
    }

    public final String toString() {
        return C2185f.m5996a("range[%d, %d) current offset[%d]", Long.valueOf(this.f7144a), Long.valueOf(this.f7146c), Long.valueOf(this.f7145b));
    }
}
