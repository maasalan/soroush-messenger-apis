package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.C0249a.C0240c;
import android.support.design.widget.C0328q.C0327a;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.C0571r;
import android.util.StateSet;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

class C0318j {
    static final Interpolator f1230a = C0296a.f1125c;
    static final int[] f1231k = new int[]{16842919, 16842910};
    static final int[] f1232l = new int[]{16842908, 16842910};
    static final int[] f1233m = new int[]{16842910};
    static final int[] f1234n = new int[0];
    int f1235b = 0;
    C4757n f1236c;
    float f1237d;
    Drawable f1238e;
    Drawable f1239f;
    C0309e f1240g;
    Drawable f1241h;
    float f1242i;
    float f1243j;
    final C0335z f1244o;
    final C0321o f1245p;
    OnPreDrawListener f1246q;
    private final C0328q f1247r;
    private final Rect f1248s = new Rect();

    class C03131 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean f1218a;
        final /* synthetic */ C0316c f1219b;
        final /* synthetic */ C0318j f1220c;
        private boolean f1221d;

        C03131(C0318j c0318j, boolean z, C0316c c0316c) {
            this.f1220c = c0318j;
            this.f1218a = z;
            this.f1219b = c0316c;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f1221d = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1220c.f1235b = 0;
            if (!this.f1221d) {
                this.f1220c.f1244o.m660a(this.f1218a ? 8 : 4, this.f1218a);
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f1220c.f1244o.m660a(0, this.f1218a);
            this.f1221d = false;
        }
    }

    class C03142 extends AnimatorListenerAdapter {
        final /* synthetic */ boolean f1222a;
        final /* synthetic */ C0316c f1223b;
        final /* synthetic */ C0318j f1224c;

        C03142(C0318j c0318j, boolean z, C0316c c0316c) {
            this.f1224c = c0318j;
            this.f1222a = z;
            this.f1223b = c0316c;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1224c.f1235b = 0;
        }

        public final void onAnimationStart(Animator animator) {
            this.f1224c.f1244o.m660a(0, this.f1222a);
        }
    }

    class C03153 implements OnPreDrawListener {
        final /* synthetic */ C0318j f1225a;

        C03153(C0318j c0318j) {
            this.f1225a = c0318j;
        }

        public final boolean onPreDraw() {
            C0318j c0318j = this.f1225a;
            float rotation = c0318j.f1244o.getRotation();
            if (c0318j.f1237d != rotation) {
                c0318j.f1237d = rotation;
                if (VERSION.SDK_INT == 19) {
                    if (c0318j.f1237d % 90.0f != 0.0f) {
                        if (c0318j.f1244o.getLayerType() != 1) {
                            c0318j.f1244o.setLayerType(1, null);
                        }
                    } else if (c0318j.f1244o.getLayerType() != 0) {
                        c0318j.f1244o.setLayerType(0, null);
                    }
                }
                if (c0318j.f1236c != null) {
                    C4757n c4757n = c0318j.f1236c;
                    float f = -c0318j.f1237d;
                    if (c4757n.f13144l != f) {
                        c4757n.f13144l = f;
                        c4757n.invalidateSelf();
                    }
                }
                if (c0318j.f1240g != null) {
                    C0309e c0309e = c0318j.f1240g;
                    float f2 = -c0318j.f1237d;
                    if (f2 != c0309e.f1163j) {
                        c0309e.f1163j = f2;
                        c0309e.invalidateSelf();
                    }
                }
            }
            return true;
        }
    }

    interface C0316c {
    }

    private abstract class C0317e extends AnimatorListenerAdapter implements AnimatorUpdateListener {
        private boolean f1226a;
        final /* synthetic */ C0318j f1227b;
        private float f1228c;
        private float f1229d;

        private C0317e(C0318j c0318j) {
            this.f1227b = c0318j;
        }

        protected abstract float mo188a();

        public void onAnimationEnd(Animator animator) {
            this.f1227b.f1236c.m8820a(this.f1229d);
            this.f1226a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1226a) {
                this.f1228c = this.f1227b.f1236c.f13142j;
                this.f1229d = mo188a();
                this.f1226a = true;
            }
            this.f1227b.f1236c.m8820a(this.f1228c + ((this.f1229d - this.f1228c) * valueAnimator.getAnimatedFraction()));
        }
    }

    private class C4753a extends C0317e {
        final /* synthetic */ C0318j f13129a;

        C4753a(C0318j c0318j) {
            this.f13129a = c0318j;
            super();
        }

        protected final float mo188a() {
            return 0.0f;
        }
    }

    private class C4754b extends C0317e {
        final /* synthetic */ C0318j f13130a;

        C4754b(C0318j c0318j) {
            this.f13130a = c0318j;
            super();
        }

        protected final float mo188a() {
            return this.f13130a.f1242i + this.f13130a.f1243j;
        }
    }

    private class C4755d extends C0317e {
        final /* synthetic */ C0318j f13131a;

        C4755d(C0318j c0318j) {
            this.f13131a = c0318j;
            super();
        }

        protected final float mo188a() {
            return this.f13131a.f1242i;
        }
    }

    C0318j(C0335z c0335z, C0321o c0321o) {
        this.f1244o = c0335z;
        this.f1245p = c0321o;
        this.f1247r = new C0328q();
        this.f1247r.m649a(f1231k, C0318j.m614a(new C4754b(this)));
        this.f1247r.m649a(f1232l, C0318j.m614a(new C4754b(this)));
        this.f1247r.m649a(f1233m, C0318j.m614a(new C4755d(this)));
        this.f1247r.m649a(f1234n, C0318j.m614a(new C4753a(this)));
        this.f1237d = this.f1244o.getRotation();
    }

    private static ValueAnimator m614a(C0317e c0317e) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1230a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(c0317e);
        valueAnimator.addUpdateListener(c0317e);
        valueAnimator.setFloatValues(new float[]{0.0f, BallPulseIndicator.SCALE});
        return valueAnimator;
    }

    private static ColorStateList m615b(int i) {
        r1 = new int[3][];
        int[] iArr = new int[]{f1232l, i, f1231k};
        iArr[1] = i;
        r1[2] = new int[0];
        iArr[2] = 0;
        return new ColorStateList(r1, iArr);
    }

    float mo189a() {
        return this.f1242i;
    }

    final C0309e m617a(int i, ColorStateList colorStateList) {
        Context context = this.f1244o.getContext();
        C0309e f = mo199f();
        int c = C0346c.m687c(context, C0240c.design_fab_stroke_top_outer_color);
        int c2 = C0346c.m687c(context, C0240c.design_fab_stroke_top_inner_color);
        int c3 = C0346c.m687c(context, C0240c.design_fab_stroke_end_inner_color);
        int c4 = C0346c.m687c(context, C0240c.design_fab_stroke_end_outer_color);
        f.f1158e = c;
        f.f1159f = c2;
        f.f1160g = c3;
        f.f1161h = c4;
        float f2 = (float) i;
        if (f.f1157d != f2) {
            f.f1157d = f2;
            f.f1154a.setStrokeWidth(f2 * 1.3333f);
            f.f1162i = true;
            f.invalidateSelf();
        }
        f.m578a(colorStateList);
        return f;
    }

    final void m618a(float f) {
        if (this.f1242i != f) {
            this.f1242i = f;
            mo190a(f, this.f1243j);
        }
    }

    void mo190a(float f, float f2) {
        if (this.f1236c != null) {
            this.f1236c.m8821a(f, this.f1243j + f);
            m627d();
        }
    }

    void mo191a(int i) {
        if (this.f1239f != null) {
            C0429a.m885a(this.f1239f, C0318j.m615b(i));
        }
    }

    void mo192a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.f1238e = C0429a.m896g(m630g());
        C0429a.m885a(this.f1238e, colorStateList);
        if (mode != null) {
            C0429a.m888a(this.f1238e, mode);
        }
        this.f1239f = C0429a.m896g(m630g());
        C0429a.m885a(this.f1239f, C0318j.m615b(i));
        if (i2 > 0) {
            this.f1240g = m617a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f1240g, this.f1238e, this.f1239f};
        } else {
            this.f1240g = null;
            drawableArr = new Drawable[]{this.f1238e, this.f1239f};
        }
        this.f1241h = new LayerDrawable(drawableArr);
        this.f1236c = new C4757n(this.f1244o.getContext(), this.f1241h, this.f1245p.mo162a(), this.f1242i, this.f1242i + this.f1243j);
        C4757n c4757n = this.f1236c;
        c4757n.f13143k = false;
        c4757n.invalidateSelf();
        this.f1245p.mo164a(this.f1236c);
    }

    void mo193a(Rect rect) {
        this.f1236c.getPadding(rect);
    }

    void mo194a(int[] iArr) {
        C0327a c0327a;
        C0328q c0328q = this.f1247r;
        int size = c0328q.f1264a.size();
        for (int i = 0; i < size; i++) {
            c0327a = (C0327a) c0328q.f1264a.get(i);
            if (StateSet.stateSetMatches(c0327a.f1262a, iArr)) {
                break;
            }
        }
        c0327a = null;
        if (c0327a != c0328q.f1265b) {
            if (!(c0328q.f1265b == null || c0328q.f1266c == null)) {
                c0328q.f1266c.cancel();
                c0328q.f1266c = null;
            }
            c0328q.f1265b = c0327a;
            if (c0327a != null) {
                c0328q.f1266c = c0327a.f1263b;
                c0328q.f1266c.start();
            }
        }
    }

    void mo195b() {
        C0328q c0328q = this.f1247r;
        if (c0328q.f1266c != null) {
            c0328q.f1266c.end();
            c0328q.f1266c = null;
        }
    }

    void mo196b(Rect rect) {
    }

    void mo197c() {
    }

    final void m627d() {
        Rect rect = this.f1248s;
        mo193a(rect);
        mo196b(rect);
        this.f1245p.mo163a(rect.left, rect.top, rect.right, rect.bottom);
    }

    boolean mo198e() {
        return true;
    }

    C0309e mo199f() {
        return new C0309e();
    }

    final GradientDrawable m630g() {
        GradientDrawable h = mo200h();
        h.setShape(1);
        h.setColor(-1);
        return h;
    }

    GradientDrawable mo200h() {
        return new GradientDrawable();
    }

    final boolean m632i() {
        return C0571r.m1326D(this.f1244o) && !this.f1244o.isInEditMode();
    }
}
