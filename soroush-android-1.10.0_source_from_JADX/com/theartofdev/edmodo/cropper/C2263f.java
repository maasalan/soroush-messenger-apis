package com.theartofdev.edmodo.cropper;

import android.graphics.PointF;
import android.graphics.RectF;

final class C2263f {
    final C2260e f7549a;
    final int f7550b;
    final PointF f7551c = new PointF();

    static /* synthetic */ class C22611 {
        static final /* synthetic */ int[] f7538a = new int[C2262a.m6177a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = com.theartofdev.edmodo.cropper.C2263f.C2262a.m6177a();
            r0 = r0.length;
            r0 = new int[r0];
            f7538a = r0;
            r0 = 1;
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7539a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7540b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7541c;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7542d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7543e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r3 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7544f;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r3 = 6;	 Catch:{ NoSuchFieldError -> 0x0039 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7545g;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r3 = 7;	 Catch:{ NoSuchFieldError -> 0x0041 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0041 }
        L_0x0041:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7546h;	 Catch:{ NoSuchFieldError -> 0x004a }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x004a }
            r3 = 8;	 Catch:{ NoSuchFieldError -> 0x004a }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x004a }
        L_0x004a:
            r1 = f7538a;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r2 = com.theartofdev.edmodo.cropper.C2263f.C2262a.f7547i;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r0 = 9;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.f.1.<clinit>():void");
        }
    }

    public enum C2262a {
        ;
        
        public static final int f7539a = 1;
        public static final int f7540b = 2;
        public static final int f7541c = 3;
        public static final int f7542d = 4;
        public static final int f7543e = 5;
        public static final int f7544f = 6;
        public static final int f7545g = 7;
        public static final int f7546h = 8;
        public static final int f7547i = 9;

        static {
            f7548j = new int[]{f7539a, f7540b, f7541c, f7542d, f7543e, f7544f, f7545g, f7546h, f7547i};
        }

        public static int[] m6177a() {
            return (int[]) f7548j.clone();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2263f(int r3, com.theartofdev.edmodo.cropper.C2260e r4, float r5, float r6) {
        /*
        r2 = this;
        r2.<init>();
        r0 = new android.graphics.PointF;
        r0.<init>();
        r2.f7551c = r0;
        r2.f7550b = r3;
        r2.f7549a = r4;
        r3 = r2.f7549a;
        r3 = r3.m6169a();
        r4 = com.theartofdev.edmodo.cropper.C2263f.C22611.f7538a;
        r0 = r2.f7550b;
        r0 = r0 + -1;
        r4 = r4[r0];
        r0 = 0;
        switch(r4) {
            case 1: goto L_0x0044;
            case 2: goto L_0x0041;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0030;
            case 6: goto L_0x0048;
            case 7: goto L_0x002d;
            case 8: goto L_0x003e;
            case 9: goto L_0x0022;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r0;
        goto L_0x004b;
    L_0x0022:
        r4 = r3.centerX();
        r0 = r4 - r5;
        r3 = r3.centerY();
        goto L_0x004a;
    L_0x002d:
        r3 = r3.right;
        goto L_0x0032;
    L_0x0030:
        r3 = r3.left;
    L_0x0032:
        r3 = r3 - r5;
        r1 = r0;
        r0 = r3;
        r3 = r1;
        goto L_0x004b;
    L_0x0037:
        r4 = r3.right;
        goto L_0x003c;
    L_0x003a:
        r4 = r3.left;
    L_0x003c:
        r0 = r4 - r5;
    L_0x003e:
        r3 = r3.bottom;
        goto L_0x004a;
    L_0x0041:
        r4 = r3.right;
        goto L_0x0046;
    L_0x0044:
        r4 = r3.left;
    L_0x0046:
        r0 = r4 - r5;
    L_0x0048:
        r3 = r3.top;
    L_0x004a:
        r3 = r3 - r6;
    L_0x004b:
        r4 = r2.f7551c;
        r4.x = r0;
        r4 = r2.f7551c;
        r4.y = r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.f.<init>(int, com.theartofdev.edmodo.cropper.e, float, float):void");
    }

    final void m6178a(float f) {
        RectF a = this.f7549a.m6169a();
        a.left = a.right - (a.height() * f);
        this.f7549a.m6170a(a);
    }

    final void m6179a(float f, RectF rectF, float f2, float f3, boolean z, boolean z2) {
        RectF a = this.f7549a.m6169a();
        if (f < 0.0f) {
            f /= 1.05f;
            PointF pointF = this.f7551c;
            pointF.x -= f / 1.1f;
        }
        if (f - rectF.left < f2) {
            f = rectF.left;
        }
        if (a.right - f < this.f7549a.m6171b()) {
            f = a.right - this.f7549a.m6171b();
        }
        if (a.right - f > this.f7549a.m6173d()) {
            f = a.right - this.f7549a.m6173d();
        }
        if (f - rectF.left < f2) {
            f = rectF.left;
        }
        if (f3 > 0.0f) {
            float f4;
            float height;
            f2 = (a.right - f) / f3;
            if (f2 < this.f7549a.m6172c()) {
                f = Math.max(rectF.left, a.right - (this.f7549a.m6172c() * f3));
                f2 = (a.right - f) / f3;
            }
            if (f2 > this.f7549a.m6174e()) {
                f = Math.max(rectF.left, a.right - (this.f7549a.m6174e() * f3));
                f2 = (a.right - f) / f3;
            }
            if (z && z2) {
                f2 = rectF.left;
                f4 = a.right;
                height = rectF.height();
            } else {
                if (z && a.bottom - r8 < rectF.top) {
                    f = Math.max(rectF.left, a.right - ((a.bottom - rectF.top) * f3));
                    f2 = (a.right - f) / f3;
                }
                if (z2 && a.top + r8 > rectF.bottom) {
                    f2 = rectF.left;
                    f4 = a.right;
                    height = rectF.bottom - a.top;
                }
            }
            f = Math.max(f, Math.max(f2, f4 - (height * f3)));
        }
        a.left = f;
        this.f7549a.m6170a(a);
    }

    final void m6180a(float f, RectF rectF, int i, float f2, float f3, boolean z, boolean z2) {
        RectF a = this.f7549a.m6169a();
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            PointF pointF = this.f7551c;
            pointF.x -= (f - f4) / 1.1f;
        }
        if (rectF.right - f < f2) {
            f = rectF.right;
        }
        if (f - a.left < this.f7549a.m6171b()) {
            f = a.left + this.f7549a.m6171b();
        }
        if (f - a.left > this.f7549a.m6173d()) {
            f = a.left + this.f7549a.m6173d();
        }
        if (rectF.right - f < f2) {
            f = rectF.right;
        }
        if (f3 > 0.0f) {
            float height;
            f4 = (f - a.left) / f3;
            if (f4 < this.f7549a.m6172c()) {
                f = Math.min(rectF.right, a.left + (this.f7549a.m6172c() * f3));
                f4 = (f - a.left) / f3;
            }
            if (f4 > this.f7549a.m6174e()) {
                f = Math.min(rectF.right, a.left + (this.f7549a.m6174e() * f3));
                f4 = (f - a.left) / f3;
            }
            if (z && z2) {
                f4 = rectF.right;
                f2 = a.left;
                height = rectF.height();
            } else {
                if (z && a.bottom - r7 < rectF.top) {
                    f = Math.min(rectF.right, a.left + ((a.bottom - rectF.top) * f3));
                    f4 = (f - a.left) / f3;
                }
                if (z2 && a.top + r7 > rectF.bottom) {
                    f4 = rectF.right;
                    f2 = a.left;
                    height = rectF.bottom - a.top;
                }
            }
            f = Math.min(f, Math.min(f4, f2 + (height * f3)));
        }
        a.right = f;
        this.f7549a.m6170a(a);
    }

    final void m6181a(RectF rectF, float f) {
        RectF a = this.f7549a.m6169a();
        a.inset((a.width() - (a.height() * f)) / 2.0f, 0.0f);
        if (a.left < rectF.left) {
            a.offset(rectF.left - a.left, 0.0f);
        }
        if (a.right > rectF.right) {
            a.offset(rectF.right - a.right, 0.0f);
        }
        this.f7549a.m6170a(a);
    }

    final void m6182b(float f) {
        RectF a = this.f7549a.m6169a();
        a.top = a.bottom - (a.width() / f);
        this.f7549a.m6170a(a);
    }

    final void m6183b(float f, RectF rectF, float f2, float f3, boolean z, boolean z2) {
        RectF a = this.f7549a.m6169a();
        if (f < 0.0f) {
            f /= 1.05f;
            PointF pointF = this.f7551c;
            pointF.y -= f / 1.1f;
        }
        if (f - rectF.top < f2) {
            f = rectF.top;
        }
        if (a.bottom - f < this.f7549a.m6172c()) {
            f = a.bottom - this.f7549a.m6172c();
        }
        if (a.bottom - f > this.f7549a.m6174e()) {
            f = a.bottom - this.f7549a.m6174e();
        }
        if (f - rectF.top < f2) {
            f = rectF.top;
        }
        if (f3 > 0.0f) {
            float f4;
            float width;
            f2 = (a.bottom - f) * f3;
            if (f2 < this.f7549a.m6171b()) {
                f = Math.max(rectF.top, a.bottom - (this.f7549a.m6171b() / f3));
                f2 = (a.bottom - f) * f3;
            }
            if (f2 > this.f7549a.m6173d()) {
                f = Math.max(rectF.top, a.bottom - (this.f7549a.m6173d() / f3));
                f2 = (a.bottom - f) * f3;
            }
            if (z && z2) {
                f2 = rectF.top;
                f4 = a.bottom;
                width = rectF.width();
            } else {
                if (z && a.right - r8 < rectF.left) {
                    f = Math.max(rectF.top, a.bottom - ((a.right - rectF.left) / f3));
                    f2 = (a.bottom - f) * f3;
                }
                if (z2 && a.left + r8 > rectF.right) {
                    f2 = rectF.top;
                    f4 = a.bottom;
                    width = rectF.right - a.left;
                }
            }
            f = Math.max(f, Math.max(f2, f4 - (width / f3)));
        }
        a.top = f;
        this.f7549a.m6170a(a);
    }

    final void m6184b(float f, RectF rectF, int i, float f2, float f3, boolean z, boolean z2) {
        RectF a = this.f7549a.m6169a();
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            PointF pointF = this.f7551c;
            pointF.y -= (f - f4) / 1.1f;
        }
        if (rectF.bottom - f < f2) {
            f = rectF.bottom;
        }
        if (f - a.top < this.f7549a.m6172c()) {
            f = a.top + this.f7549a.m6172c();
        }
        if (f - a.top > this.f7549a.m6174e()) {
            f = a.top + this.f7549a.m6174e();
        }
        if (rectF.bottom - f < f2) {
            f = rectF.bottom;
        }
        if (f3 > 0.0f) {
            float width;
            f4 = (f - a.top) * f3;
            if (f4 < this.f7549a.m6171b()) {
                f = Math.min(rectF.bottom, a.top + (this.f7549a.m6171b() / f3));
                f4 = (f - a.top) * f3;
            }
            if (f4 > this.f7549a.m6173d()) {
                f = Math.min(rectF.bottom, a.top + (this.f7549a.m6173d() / f3));
                f4 = (f - a.top) * f3;
            }
            if (z && z2) {
                f4 = rectF.bottom;
                f2 = a.top;
                width = rectF.width();
            } else {
                if (z && a.right - r7 < rectF.left) {
                    f = Math.min(rectF.bottom, a.top + ((a.right - rectF.left) / f3));
                    f4 = (f - a.top) * f3;
                }
                if (z2 && a.left + r7 > rectF.right) {
                    f4 = rectF.bottom;
                    f2 = a.top;
                    width = rectF.right - a.left;
                }
            }
            f = Math.min(f, Math.min(f4, f2 + (width / f3)));
        }
        a.bottom = f;
        this.f7549a.m6170a(a);
    }

    final void m6185b(RectF rectF, float f) {
        RectF a = this.f7549a.m6169a();
        a.inset(0.0f, (a.height() - (a.width() / f)) / 2.0f);
        if (a.top < rectF.top) {
            a.offset(0.0f, rectF.top - a.top);
        }
        if (a.bottom > rectF.bottom) {
            a.offset(0.0f, rectF.bottom - a.bottom);
        }
        this.f7549a.m6170a(a);
    }

    final void m6186c(float f) {
        RectF a = this.f7549a.m6169a();
        a.right = a.left + (a.height() * f);
        this.f7549a.m6170a(a);
    }

    final void m6187d(float f) {
        RectF a = this.f7549a.m6169a();
        a.bottom = a.top + (a.width() / f);
        this.f7549a.m6170a(a);
    }
}
