package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0189h;
import android.support.constraint.p026a.C0189h.C0188a;

public final class C0171c {
    public C4702j f580a = new C4702j(this);
    final C0174d f581b;
    final C0170c f582c;
    public C0171c f583d;
    public int f584e = 0;
    int f585f = -1;
    int f586g = C0169b.f566a;
    int f587h = 0;
    public C0189h f588i;
    private int f589j = C0168a.f563a;

    public enum C0168a {
        ;
        
        public static final int f563a = 1;
        public static final int f564b = 2;

        static {
            f565c = new int[]{f563a, f564b};
        }
    }

    public enum C0169b {
        ;
        
        public static final int f566a = 1;
        public static final int f567b = 2;
        public static final int f568c = 3;

        static {
            f569d = new int[]{f566a, f567b, f568c};
        }
    }

    public enum C0170c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0171c(C0174d c0174d, C0170c c0170c) {
        this.f581b = c0174d;
        this.f582c = c0170c;
    }

    public final void m272a() {
        if (this.f588i == null) {
            this.f588i = new C0189h(C0188a.f725a);
        } else {
            this.f588i.m377b();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m273a(android.support.constraint.p026a.p027a.C0171c r5, int r6, int r7, int r8, int r9, boolean r10) {
        /*
        r4 = this;
        r0 = 1;
        r1 = 0;
        if (r5 != 0) goto L_0x0014;
    L_0x0004:
        r5 = 0;
        r4.f583d = r5;
        r4.f584e = r1;
        r5 = -1;
        r4.f585f = r5;
        r5 = android.support.constraint.p026a.p027a.C0171c.C0169b.f566a;
        r4.f586g = r5;
        r5 = 2;
        r4.f587h = r5;
        return r0;
    L_0x0014:
        if (r10 != 0) goto L_0x0098;
    L_0x0016:
        if (r5 != 0) goto L_0x001b;
    L_0x0018:
        r10 = r1;
        goto L_0x0095;
    L_0x001b:
        r10 = r5.f582c;
        r2 = r4.f582c;
        if (r10 != r2) goto L_0x003b;
    L_0x0021:
        r10 = r4.f582c;
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.BASELINE;
        if (r10 != r2) goto L_0x0038;
    L_0x0027:
        r10 = r5.f581b;
        r10 = r10.m316t();
        if (r10 == 0) goto L_0x0018;
    L_0x002f:
        r10 = r4.f581b;
        r10 = r10.m316t();
        if (r10 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0018;
    L_0x0038:
        r10 = r0;
        goto L_0x0095;
    L_0x003b:
        r2 = android.support.constraint.p026a.p027a.C0171c.C01671.f562a;
        r3 = r4.f582c;
        r3 = r3.ordinal();
        r2 = r2[r3];
        switch(r2) {
            case 1: goto L_0x0088;
            case 2: goto L_0x006f;
            case 3: goto L_0x006f;
            case 4: goto L_0x0054;
            case 5: goto L_0x0054;
            case 6: goto L_0x0018;
            case 7: goto L_0x0018;
            case 8: goto L_0x0018;
            case 9: goto L_0x0018;
            default: goto L_0x0048;
        };
    L_0x0048:
        r5 = new java.lang.AssertionError;
        r6 = r4.f582c;
        r6 = r6.name();
        r5.<init>(r6);
        throw r5;
    L_0x0054:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.TOP;
        if (r10 == r2) goto L_0x005f;
    L_0x0058:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.BOTTOM;
        if (r10 != r2) goto L_0x005d;
    L_0x005c:
        goto L_0x005f;
    L_0x005d:
        r2 = r1;
        goto L_0x0060;
    L_0x005f:
        r2 = r0;
    L_0x0060:
        r3 = r5.f581b;
        r3 = r3 instanceof android.support.constraint.p026a.p027a.C4700f;
        if (r3 == 0) goto L_0x006d;
    L_0x0066:
        if (r2 != 0) goto L_0x0038;
    L_0x0068:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_Y;
        if (r10 != r2) goto L_0x0018;
    L_0x006c:
        goto L_0x0038;
    L_0x006d:
        r10 = r2;
        goto L_0x0095;
    L_0x006f:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.LEFT;
        if (r10 == r2) goto L_0x007a;
    L_0x0073:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.RIGHT;
        if (r10 != r2) goto L_0x0078;
    L_0x0077:
        goto L_0x007a;
    L_0x0078:
        r2 = r1;
        goto L_0x007b;
    L_0x007a:
        r2 = r0;
    L_0x007b:
        r3 = r5.f581b;
        r3 = r3 instanceof android.support.constraint.p026a.p027a.C4700f;
        if (r3 == 0) goto L_0x006d;
    L_0x0081:
        if (r2 != 0) goto L_0x0038;
    L_0x0083:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_X;
        if (r10 != r2) goto L_0x0018;
    L_0x0087:
        goto L_0x0038;
    L_0x0088:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.BASELINE;
        if (r10 == r2) goto L_0x0018;
    L_0x008c:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_X;
        if (r10 == r2) goto L_0x0018;
    L_0x0090:
        r2 = android.support.constraint.p026a.p027a.C0171c.C0170c.CENTER_Y;
        if (r10 == r2) goto L_0x0018;
    L_0x0094:
        goto L_0x0038;
    L_0x0095:
        if (r10 != 0) goto L_0x0098;
    L_0x0097:
        return r1;
    L_0x0098:
        r4.f583d = r5;
        if (r6 <= 0) goto L_0x009f;
    L_0x009c:
        r4.f584e = r6;
        goto L_0x00a1;
    L_0x009f:
        r4.f584e = r1;
    L_0x00a1:
        r4.f585f = r7;
        r4.f586g = r8;
        r4.f587h = r9;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.a.a.c.a(android.support.constraint.a.a.c, int, int, int, int, boolean):boolean");
    }

    public final int m274b() {
        return this.f581b.f620X == 8 ? 0 : (this.f585f < 0 || this.f583d == null || this.f583d.f581b.f620X != 8) ? this.f584e : this.f585f;
    }

    public final void m275c() {
        this.f583d = null;
        this.f584e = 0;
        this.f585f = -1;
        this.f586g = C0169b.f567b;
        this.f587h = 0;
        this.f589j = C0168a.f563a;
        this.f580a.mo58b();
    }

    public final boolean m276d() {
        return this.f583d != null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f581b.f621Y);
        stringBuilder.append(":");
        stringBuilder.append(this.f582c.toString());
        return stringBuilder.toString();
    }
}
