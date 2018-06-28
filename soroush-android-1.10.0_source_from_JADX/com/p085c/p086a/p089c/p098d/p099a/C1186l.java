package com.p085c.p086a.p089c.p098d.p099a;

import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public abstract class C1186l {
    public static final C1186l f3760a = new C5226e();
    public static final C1186l f3761b = new C5225d();
    public static final C1186l f3762c = new C5222a();
    public static final C1186l f3763d = new C5223b();
    public static final C1186l f3764e = new C5224c();
    public static final C1186l f3765f = new C5227f();
    public static final C1186l f3766g = f3761b;

    public enum C1185g {
        ;
        
        public static final int f3757a = 1;
        public static final int f3758b = 2;

        static {
            f3759c = new int[]{f3757a, f3758b};
        }
    }

    private static class C5222a extends C1186l {
        C5222a() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            i = Math.min(i2 / i4, i / i3);
            return i == 0 ? BallPulseIndicator.SCALE : BallPulseIndicator.SCALE / ((float) Integer.highestOneBit(i));
        }

        public final int mo1211a() {
            return C1185g.f3758b;
        }
    }

    private static class C5223b extends C1186l {
        C5223b() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            i3 = 1;
            i2 = Math.max(1, Integer.highestOneBit(i));
            if (i2 >= i) {
                i3 = 0;
            }
            return BallPulseIndicator.SCALE / ((float) (i2 << i3));
        }

        public final int mo1211a() {
            return C1185g.f3757a;
        }
    }

    private static class C5224c extends C1186l {
        C5224c() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            return Math.min(BallPulseIndicator.SCALE, a.mo1210a(i, i2, i3, i4));
        }

        public final int mo1211a() {
            return C1185g.f3758b;
        }
    }

    private static class C5225d extends C1186l {
        C5225d() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final int mo1211a() {
            return C1185g.f3758b;
        }
    }

    private static class C5226e extends C1186l {
        C5226e() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final int mo1211a() {
            return C1185g.f3758b;
        }
    }

    private static class C5227f extends C1186l {
        C5227f() {
        }

        public final float mo1210a(int i, int i2, int i3, int i4) {
            return BallPulseIndicator.SCALE;
        }

        public final int mo1211a() {
            return C1185g.f3758b;
        }
    }

    public abstract float mo1210a(int i, int i2, int i3, int i4);

    public abstract int mo1211a();
}
