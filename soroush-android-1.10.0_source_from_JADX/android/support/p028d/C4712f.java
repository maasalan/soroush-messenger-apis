package android.support.p028d;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0571r;
import android.util.Property;
import android.view.View;

public final class C4712f extends C0233u {
    private static final String[] f12956i = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> f12957j = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        private Rect f837a = new Rect();

        public final /* synthetic */ Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f837a);
            return new PointF((float) this.f837a.left, (float) this.f837a.top);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f837a);
            this.f837a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f837a);
        }
    };
    private static final Property<C0217a, PointF> f12958k = new Property<C0217a, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0217a c0217a = (C0217a) obj;
            PointF pointF = (PointF) obj2;
            c0217a.f854a = Math.round(pointF.x);
            c0217a.f855b = Math.round(pointF.y);
            c0217a.f858e++;
            if (c0217a.f858e == c0217a.f859f) {
                c0217a.m422a();
            }
        }
    };
    private static final Property<C0217a, PointF> f12959l = new Property<C0217a, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0217a c0217a = (C0217a) obj;
            PointF pointF = (PointF) obj2;
            c0217a.f856c = Math.round(pointF.x);
            c0217a.f857d = Math.round(pointF.y);
            c0217a.f859f++;
            if (c0217a.f858e == c0217a.f859f) {
                c0217a.m422a();
            }
        }
    };
    private static final Property<View, PointF> f12960m = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            al.m403a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<View, PointF> f12961n = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            al.m403a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<View, PointF> f12962o = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            al.m403a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static C0227s f12963s = new C0227s();
    private int[] f12964p = new int[2];
    private boolean f12965q = false;
    private boolean f12966r = false;

    private static class C0217a {
        int f854a;
        int f855b;
        int f856c;
        int f857d;
        int f858e;
        int f859f;
        private View f860g;

        C0217a(View view) {
            this.f860g = view;
        }

        final void m422a() {
            al.m403a(this.f860g, this.f854a, this.f855b, this.f856c, this.f857d);
            this.f858e = 0;
            this.f859f = 0;
        }
    }

    private void m8671d(C0237z c0237z) {
        View view = c0237z.f923b;
        if (C0571r.m1326D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c0237z.f922a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c0237z.f922a.put("android:changeBounds:parent", c0237z.f923b.getParent());
            if (this.f12966r) {
                c0237z.f923b.getLocationInWindow(this.f12964p);
                c0237z.f922a.put("android:changeBounds:windowX", Integer.valueOf(this.f12964p[0]));
                c0237z.f922a.put("android:changeBounds:windowY", Integer.valueOf(this.f12964p[1]));
            }
            if (this.f12965q) {
                c0237z.f922a.put("android:changeBounds:clip", C0571r.m1328F(view));
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo91a(android.view.ViewGroup r21, android.support.p028d.C0237z r22, android.support.p028d.C0237z r23) {
        /*
        r20 = this;
        r8 = r20;
        r0 = r22;
        r1 = r23;
        if (r0 == 0) goto L_0x027d;
    L_0x0008:
        if (r1 != 0) goto L_0x000c;
    L_0x000a:
        goto L_0x027d;
    L_0x000c:
        r3 = r0.f922a;
        r4 = r1.f922a;
        r5 = "android:changeBounds:parent";
        r3 = r3.get(r5);
        r3 = (android.view.ViewGroup) r3;
        r5 = "android:changeBounds:parent";
        r4 = r4.get(r5);
        r4 = (android.view.ViewGroup) r4;
        if (r3 == 0) goto L_0x027b;
    L_0x0022:
        if (r4 != 0) goto L_0x0026;
    L_0x0024:
        goto L_0x027b;
    L_0x0026:
        r9 = r1.f923b;
        r5 = r8.f12966r;
        r11 = 1;
        if (r5 == 0) goto L_0x003c;
    L_0x002d:
        r5 = r8.m454b(r3, r11);
        if (r5 != 0) goto L_0x0038;
    L_0x0033:
        if (r3 != r4) goto L_0x0036;
    L_0x0035:
        goto L_0x003c;
    L_0x0036:
        r3 = 0;
        goto L_0x003d;
    L_0x0038:
        r3 = r5.f923b;
        if (r4 != r3) goto L_0x0036;
    L_0x003c:
        r3 = r11;
    L_0x003d:
        if (r3 == 0) goto L_0x01ce;
    L_0x003f:
        r3 = r0.f922a;
        r4 = "android:changeBounds:bounds";
        r3 = r3.get(r4);
        r3 = (android.graphics.Rect) r3;
        r4 = r1.f922a;
        r5 = "android:changeBounds:bounds";
        r4 = r4.get(r5);
        r4 = (android.graphics.Rect) r4;
        r5 = r3.left;
        r6 = r4.left;
        r7 = r3.top;
        r12 = r4.top;
        r13 = r3.right;
        r14 = r4.right;
        r3 = r3.bottom;
        r15 = r4.bottom;
        r4 = r13 - r5;
        r2 = r3 - r7;
        r11 = r14 - r6;
        r10 = r15 - r12;
        r0 = r0.f922a;
        r16 = r9;
        r9 = "android:changeBounds:clip";
        r0 = r0.get(r9);
        r0 = (android.graphics.Rect) r0;
        r1 = r1.f922a;
        r9 = "android:changeBounds:clip";
        r1 = r1.get(r9);
        r9 = r1;
        r9 = (android.graphics.Rect) r9;
        if (r4 == 0) goto L_0x0086;
    L_0x0084:
        if (r2 != 0) goto L_0x008a;
    L_0x0086:
        if (r11 == 0) goto L_0x0099;
    L_0x0088:
        if (r10 == 0) goto L_0x0099;
    L_0x008a:
        if (r5 != r6) goto L_0x0091;
    L_0x008c:
        if (r7 == r12) goto L_0x008f;
    L_0x008e:
        goto L_0x0091;
    L_0x008f:
        r1 = 0;
        goto L_0x0092;
    L_0x0091:
        r1 = 1;
    L_0x0092:
        if (r13 != r14) goto L_0x0096;
    L_0x0094:
        if (r3 == r15) goto L_0x009a;
    L_0x0096:
        r1 = r1 + 1;
        goto L_0x009a;
    L_0x0099:
        r1 = 0;
    L_0x009a:
        if (r0 == 0) goto L_0x00a2;
    L_0x009c:
        r17 = r0.equals(r9);
        if (r17 == 0) goto L_0x00a6;
    L_0x00a2:
        if (r0 != 0) goto L_0x00a8;
    L_0x00a4:
        if (r9 == 0) goto L_0x00a8;
    L_0x00a6:
        r1 = r1 + 1;
    L_0x00a8:
        if (r1 <= 0) goto L_0x020b;
    L_0x00aa:
        r18 = r9;
        r9 = r8.f12965q;
        r19 = r0;
        r0 = 2;
        if (r9 != 0) goto L_0x012f;
    L_0x00b3:
        r9 = r16;
        android.support.p028d.al.m403a(r9, r5, r7, r13, r3);
        if (r1 != r0) goto L_0x010b;
    L_0x00ba:
        if (r4 != r11) goto L_0x00cb;
    L_0x00bc:
        if (r2 != r10) goto L_0x00cb;
    L_0x00be:
        r0 = r8.f900h;
        r1 = (float) r5;
        r2 = (float) r7;
        r3 = (float) r6;
        r4 = (float) r12;
        r0 = r0.mo101a(r1, r2, r3, r4);
        r1 = f12962o;
        goto L_0x0129;
    L_0x00cb:
        r1 = new android.support.d.f$a;
        r1.<init>(r9);
        r2 = r8.f900h;
        r4 = (float) r5;
        r5 = (float) r7;
        r6 = (float) r6;
        r7 = (float) r12;
        r2 = r2.mo101a(r4, r5, r6, r7);
        r4 = f12958k;
        r2 = android.support.p028d.C0219h.m423a(r1, r4, r2);
        r4 = r8.f900h;
        r5 = (float) r13;
        r3 = (float) r3;
        r6 = (float) r14;
        r7 = (float) r15;
        r3 = r4.mo101a(r5, r3, r6, r7);
        r4 = f12959l;
        r3 = android.support.p028d.C0219h.m423a(r1, r4, r3);
        r4 = new android.animation.AnimatorSet;
        r4.<init>();
        r0 = new android.animation.Animator[r0];
        r5 = 0;
        r0[r5] = r2;
        r2 = 1;
        r0[r2] = r3;
        r4.playTogether(r0);
        r0 = new android.support.d.f$8;
        r0.<init>(r8, r1);
        r4.addListener(r0);
    L_0x0108:
        r3 = 1;
        goto L_0x01b4;
    L_0x010b:
        if (r5 != r6) goto L_0x011d;
    L_0x010d:
        if (r7 == r12) goto L_0x0110;
    L_0x010f:
        goto L_0x011d;
    L_0x0110:
        r0 = r8.f900h;
        r1 = (float) r13;
        r2 = (float) r3;
        r3 = (float) r14;
        r4 = (float) r15;
        r0 = r0.mo101a(r1, r2, r3, r4);
        r1 = f12960m;
        goto L_0x0129;
    L_0x011d:
        r0 = r8.f900h;
        r1 = (float) r5;
        r2 = (float) r7;
        r3 = (float) r6;
        r4 = (float) r12;
        r0 = r0.mo101a(r1, r2, r3, r4);
        r1 = f12961n;
    L_0x0129:
        r0 = android.support.p028d.C0219h.m423a(r9, r1, r0);
    L_0x012d:
        r4 = r0;
        goto L_0x0108;
    L_0x012f:
        r9 = r16;
        r1 = java.lang.Math.max(r4, r11);
        r3 = java.lang.Math.max(r2, r10);
        r1 = r1 + r5;
        r3 = r3 + r7;
        android.support.p028d.al.m403a(r9, r5, r7, r1, r3);
        if (r5 != r6) goto L_0x0145;
    L_0x0140:
        if (r7 == r12) goto L_0x0143;
    L_0x0142:
        goto L_0x0145;
    L_0x0143:
        r13 = 0;
        goto L_0x0156;
    L_0x0145:
        r1 = r8.f900h;
        r3 = (float) r5;
        r5 = (float) r7;
        r7 = (float) r6;
        r13 = (float) r12;
        r1 = r1.mo101a(r3, r5, r7, r13);
        r3 = f12962o;
        r1 = android.support.p028d.C0219h.m423a(r9, r3, r1);
        r13 = r1;
    L_0x0156:
        if (r19 != 0) goto L_0x015f;
    L_0x0158:
        r1 = new android.graphics.Rect;
        r3 = 0;
        r1.<init>(r3, r3, r4, r2);
        goto L_0x0162;
    L_0x015f:
        r3 = 0;
        r1 = r19;
    L_0x0162:
        if (r18 != 0) goto L_0x016a;
    L_0x0164:
        r2 = new android.graphics.Rect;
        r2.<init>(r3, r3, r11, r10);
        goto L_0x016c;
    L_0x016a:
        r2 = r18;
    L_0x016c:
        r4 = r1.equals(r2);
        if (r4 != 0) goto L_0x0199;
    L_0x0172:
        android.support.v4.view.C0571r.m1338a(r9, r1);
        r4 = "clipBounds";
        r5 = f12963s;
        r7 = new java.lang.Object[r0];
        r7[r3] = r1;
        r1 = 1;
        r7[r1] = r2;
        r10 = android.animation.ObjectAnimator.ofObject(r9, r4, r5, r7);
        r11 = new android.support.d.f$9;
        r7 = r0;
        r0 = r11;
        r1 = r8;
        r2 = r9;
        r3 = r18;
        r4 = r6;
        r5 = r12;
        r6 = r14;
        r12 = r7;
        r7 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r10.addListener(r11);
        r0 = r10;
        goto L_0x019b;
    L_0x0199:
        r12 = r0;
        r0 = 0;
    L_0x019b:
        if (r13 != 0) goto L_0x019e;
    L_0x019d:
        goto L_0x012d;
    L_0x019e:
        if (r0 != 0) goto L_0x01a3;
    L_0x01a0:
        r4 = r13;
        goto L_0x0108;
    L_0x01a3:
        r1 = new android.animation.AnimatorSet;
        r1.<init>();
        r2 = new android.animation.Animator[r12];
        r3 = 0;
        r2[r3] = r13;
        r3 = 1;
        r2[r3] = r0;
        r1.playTogether(r2);
        r4 = r1;
    L_0x01b4:
        r0 = r9.getParent();
        r0 = r0 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x01cd;
    L_0x01bc:
        r0 = r9.getParent();
        r0 = (android.view.ViewGroup) r0;
        android.support.p028d.ae.m393a(r0, r3);
        r1 = new android.support.d.f$10;
        r1.<init>(r8, r0);
        r8.mo103a(r1);
    L_0x01cd:
        return r4;
    L_0x01ce:
        r2 = r0.f922a;
        r3 = "android:changeBounds:windowX";
        r2 = r2.get(r3);
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r0 = r0.f922a;
        r3 = "android:changeBounds:windowY";
        r0 = r0.get(r3);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r3 = r1.f922a;
        r4 = "android:changeBounds:windowX";
        r3 = r3.get(r4);
        r3 = (java.lang.Integer) r3;
        r3 = r3.intValue();
        r1 = r1.f922a;
        r4 = "android:changeBounds:windowY";
        r1 = r1.get(r4);
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r2 != r3) goto L_0x020d;
    L_0x0208:
        if (r0 == r1) goto L_0x020b;
    L_0x020a:
        goto L_0x020d;
    L_0x020b:
        r0 = 0;
        return r0;
    L_0x020d:
        r4 = r8.f12964p;
        r5 = r21;
        r5.getLocationInWindow(r4);
        r4 = r9.getWidth();
        r6 = r9.getHeight();
        r7 = android.graphics.Bitmap.Config.ARGB_8888;
        r4 = android.graphics.Bitmap.createBitmap(r4, r6, r7);
        r6 = new android.graphics.Canvas;
        r6.<init>(r4);
        r9.draw(r6);
        r6 = new android.graphics.drawable.BitmapDrawable;
        r6.<init>(r4);
        r7 = android.support.p028d.al.m407c(r9);
        r4 = 0;
        android.support.p028d.al.m401a(r9, r4);
        r4 = android.support.p028d.al.m400a(r21);
        r4.mo74a(r6);
        r4 = r8.f900h;
        r10 = r8.f12964p;
        r11 = 0;
        r10 = r10[r11];
        r2 = r2 - r10;
        r2 = (float) r2;
        r10 = r8.f12964p;
        r12 = 1;
        r10 = r10[r12];
        r0 = r0 - r10;
        r0 = (float) r0;
        r10 = r8.f12964p;
        r10 = r10[r11];
        r3 = r3 - r10;
        r3 = (float) r3;
        r10 = r8.f12964p;
        r10 = r10[r12];
        r1 = r1 - r10;
        r1 = (float) r1;
        r0 = r4.mo101a(r2, r0, r3, r1);
        r1 = f12957j;
        r0 = android.support.p028d.C0223n.m426a(r1, r0);
        r1 = new android.animation.PropertyValuesHolder[r12];
        r1[r11] = r0;
        r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r1);
        r11 = new android.support.d.f$2;
        r0 = r11;
        r1 = r8;
        r2 = r5;
        r3 = r6;
        r4 = r9;
        r5 = r7;
        r0.<init>(r1, r2, r3, r4, r5);
        r10.addListener(r11);
        return r10;
    L_0x027b:
        r0 = 0;
        return r0;
    L_0x027d:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.f.a(android.view.ViewGroup, android.support.d.z, android.support.d.z):android.animation.Animator");
    }

    public final void mo92a(C0237z c0237z) {
        m8671d(c0237z);
    }

    public final String[] mo94a() {
        return f12956i;
    }

    public final void mo95b(C0237z c0237z) {
        m8671d(c0237z);
    }
}
