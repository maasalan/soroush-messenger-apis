package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0249a.C0238a;
import android.support.design.C0249a.C0245h;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.C0325p.C0323a;
import android.support.design.widget.C0325p.C0324b;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.design.widget.SwipeDismissBehavior.C0280a;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.List;

public abstract class C0306b<B extends C0306b<B>> {
    static final Handler f1142a = new Handler(Looper.getMainLooper(), new C02971());
    private static final boolean f1143g;
    final ViewGroup f1144b;
    final Context f1145c;
    public final C0305e f1146d;
    int f1147e;
    final C0323a f1148f = new C47466(this);
    private final C0302b f1149h;
    private List<Object<B>> f1150i;
    private final AccessibilityManager f1151j;

    static class C02971 implements Callback {
        C02971() {
        }

        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0306b c0306b = (C0306b) message.obj;
                    if (c0306b.f1146d.getParent() == null) {
                        LayoutParams layoutParams = c0306b.f1146d.getLayoutParams();
                        if (layoutParams instanceof C0273d) {
                            C0273d c0273d = (C0273d) layoutParams;
                            C0270a c6350a = new C6350a(c0306b);
                            c6350a.f13108f = SwipeDismissBehavior.m8781a(0.1f);
                            c6350a.f13109g = SwipeDismissBehavior.m8781a(0.6f);
                            c6350a.f13106d = 0;
                            c6350a.f13105c = new C47477(c0306b);
                            c0273d.m507a(c6350a);
                            c0273d.f993g = 80;
                        }
                        c0306b.f1144b.addView(c0306b.f1146d);
                    }
                    c0306b.f1146d.setOnAttachStateChangeListener(new C47488(c0306b));
                    if (!C0571r.m1326D(c0306b.f1146d)) {
                        c0306b.f1146d.setOnLayoutChangeListener(new C47499(c0306b));
                        return true;
                    } else if (c0306b.m577e()) {
                        c0306b.m574b();
                        return true;
                    } else {
                        c0306b.m575c();
                        return true;
                    }
                case 1:
                    C0306b c0306b2 = (C0306b) message.obj;
                    int i = message.arg1;
                    if (!c0306b2.m577e() || c0306b2.f1146d.getVisibility() != 0) {
                        c0306b2.m576d();
                        return true;
                    } else if (VERSION.SDK_INT >= 12) {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(new int[]{0, c0306b2.f1146d.getHeight()});
                        valueAnimator.setInterpolator(C0296a.f1124b);
                        valueAnimator.setDuration(250);
                        valueAnimator.addListener(new C02982(c0306b2, i));
                        valueAnimator.addUpdateListener(new C02993(c0306b2));
                        valueAnimator.start();
                        return true;
                    } else {
                        Animation loadAnimation = AnimationUtils.loadAnimation(c0306b2.f1146d.getContext(), C0238a.design_snackbar_out);
                        loadAnimation.setInterpolator(C0296a.f1124b);
                        loadAnimation.setDuration(250);
                        loadAnimation.setAnimationListener(new C03004(c0306b2, i));
                        c0306b2.f1146d.startAnimation(loadAnimation);
                        return true;
                    }
                default:
                    return false;
            }
        }
    }

    class C02982 extends AnimatorListenerAdapter {
        final /* synthetic */ int f1133a;
        final /* synthetic */ C0306b f1134b;

        C02982(C0306b c0306b, int i) {
            this.f1134b = c0306b;
            this.f1133a = i;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f1134b.m576d();
        }

        public final void onAnimationStart(Animator animator) {
            this.f1134b.f1149h.mo127b();
        }
    }

    class C02993 implements AnimatorUpdateListener {
        final /* synthetic */ C0306b f1135a;
        private int f1136b = 0;

        C02993(C0306b c0306b) {
            this.f1135a = c0306b;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (C0306b.f1143g) {
                C0571r.m1359d(this.f1135a.f1146d, intValue - this.f1136b);
            } else {
                this.f1135a.f1146d.setTranslationY((float) intValue);
            }
            this.f1136b = intValue;
        }
    }

    class C03004 implements AnimationListener {
        final /* synthetic */ int f1137a;
        final /* synthetic */ C0306b f1138b;

        C03004(C0306b c0306b, int i) {
            this.f1138b = c0306b;
            this.f1137a = i;
        }

        public final void onAnimationEnd(Animation animation) {
            this.f1138b.m576d();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    public interface C0302b {
        void mo126a();

        void mo127b();
    }

    interface C0303c {
        void mo184a();
    }

    interface C0304d {
        void mo185a();
    }

    static class C0305e extends FrameLayout {
        private C0304d f1140a;
        private C0303c f1141b;

        C0305e(Context context) {
            this(context, null);
        }

        C0305e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C0248k.SnackbarLayout_elevation)) {
                C0571r.m1372i(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0248k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            C0571r.m1385v(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f1141b != null) {
                this.f1141b.mo184a();
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1140a != null) {
                this.f1140a.mo185a();
            }
        }

        void setOnAttachStateChangeListener(C0303c c0303c) {
            this.f1141b = c0303c;
        }

        void setOnLayoutChangeListener(C0304d c0304d) {
            this.f1140a = c0304d;
        }
    }

    class C47455 implements C0564m {
        final /* synthetic */ C0306b f13122a;

        C47455(C0306b c0306b) {
            this.f13122a = c0306b;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c0582z.m1430d());
            return c0582z;
        }
    }

    class C47466 implements C0323a {
        final /* synthetic */ C0306b f13123a;

        C47466(C0306b c0306b) {
            this.f13123a = c0306b;
        }

        public final void mo180a() {
            C0306b.f1142a.sendMessage(C0306b.f1142a.obtainMessage(0, this.f13123a));
        }

        public final void mo181a(int i) {
            C0306b.f1142a.sendMessage(C0306b.f1142a.obtainMessage(1, i, 0, this.f13123a));
        }
    }

    class C47477 implements C0280a {
        final /* synthetic */ C0306b f13124a;

        C47477(C0306b c0306b) {
            this.f13124a = c0306b;
        }

        public final void mo182a(int i) {
            switch (i) {
                case 0:
                    C0325p.m640a().m645b(this.f13124a.f1148f);
                    return;
                case 1:
                case 2:
                    C0325p.m640a().m641a(this.f13124a.f1148f);
                    return;
                default:
                    return;
            }
        }

        public final void mo183a(View view) {
            view.setVisibility(8);
            this.f13124a.m573a(0);
        }
    }

    class C47488 implements C0303c {
        final /* synthetic */ C0306b f13125a;

        class C03011 implements Runnable {
            final /* synthetic */ C47488 f1139a;

            C03011(C47488 c47488) {
                this.f1139a = c47488;
            }

            public final void run() {
                this.f1139a.f13125a.m576d();
            }
        }

        C47488(C0306b c0306b) {
            this.f13125a = c0306b;
        }

        public final void mo184a() {
            if (C0325p.m640a().m646c(this.f13125a.f1148f)) {
                C0306b.f1142a.post(new C03011(this));
            }
        }
    }

    class C47499 implements C0304d {
        final /* synthetic */ C0306b f13126a;

        C47499(C0306b c0306b) {
            this.f13126a = c0306b;
        }

        public final void mo185a() {
            this.f13126a.f1146d.setOnLayoutChangeListener(null);
            if (this.f13126a.m577e()) {
                this.f13126a.m574b();
            } else {
                this.f13126a.m575c();
            }
        }
    }

    final class C6350a extends SwipeDismissBehavior<C0305e> {
        final /* synthetic */ C0306b f17374a;

        C6350a(C0306b c0306b) {
            this.f17374a = c0306b;
        }

        private boolean m14920a(CoordinatorLayout coordinatorLayout, C0305e c0305e, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.m14916a((View) c0305e, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0325p.m640a().m641a(this.f17374a.f1148f);
                            break;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            C0325p.m640a().m645b(this.f17374a.f1148f);
            return super.mo153a(coordinatorLayout, (View) c0305e, motionEvent);
        }

        public final boolean mo2514b(View view) {
            return view instanceof C0305e;
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        f1143g = z;
    }

    protected C0306b(ViewGroup viewGroup, View view, C0302b c0302b) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (c0302b == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        } else {
            this.f1144b = viewGroup;
            this.f1149h = c0302b;
            this.f1145c = viewGroup.getContext();
            C0330t.m650a(this.f1145c);
            this.f1146d = (C0305e) LayoutInflater.from(this.f1145c).inflate(C0245h.design_layout_snackbar, this.f1144b, false);
            this.f1146d.addView(view);
            C0571r.m1373j(this.f1146d);
            C0571r.m1352b(this.f1146d, 1);
            C0571r.m1354b(this.f1146d, true);
            C0571r.m1341a(this.f1146d, new C47455(this));
            this.f1151j = (AccessibilityManager) this.f1145c.getSystemService("accessibility");
        }
    }

    public final void m572a() {
        C0325p a = C0325p.m640a();
        int i = this.f1147e;
        C0323a c0323a = this.f1148f;
        synchronized (a.f1257a) {
            if (a.m647d(c0323a)) {
                a.f1259c.f1254b = i;
                a.f1258b.removeCallbacksAndMessages(a.f1259c);
                a.m642a(a.f1259c);
                return;
            }
            if (a.m648e(c0323a)) {
                a.f1260d.f1254b = i;
            } else {
                a.f1260d = new C0324b(i, c0323a);
            }
            if (a.f1259c == null || !a.m643a(a.f1259c, 4)) {
                a.f1259c = null;
                a.m644b();
                return;
            }
        }
    }

    final void m573a(int i) {
        C0325p a = C0325p.m640a();
        C0323a c0323a = this.f1148f;
        synchronized (a.f1257a) {
            C0324b c0324b;
            if (a.m647d(c0323a)) {
                c0324b = a.f1259c;
            } else {
                if (a.m648e(c0323a)) {
                    c0324b = a.f1260d;
                }
            }
            a.m643a(c0324b, i);
        }
    }

    final void m574b() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.f1146d.getHeight();
            if (f1143g) {
                C0571r.m1359d(this.f1146d, height);
            } else {
                this.f1146d.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0296a.f1124b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ C0306b f1128a;

                {
                    this.f1128a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f1128a.m575c();
                }

                public final void onAnimationStart(Animator animator) {
                    this.f1128a.f1149h.mo126a();
                }
            });
            valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                final /* synthetic */ C0306b f1130b;
                private int f1131c = height;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0306b.f1143g) {
                        C0571r.m1359d(this.f1130b.f1146d, intValue - this.f1131c);
                    } else {
                        this.f1130b.f1146d.setTranslationY((float) intValue);
                    }
                    this.f1131c = intValue;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f1146d.getContext(), C0238a.design_snackbar_in);
        loadAnimation.setInterpolator(C0296a.f1124b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ C0306b f1132a;

            {
                this.f1132a = r1;
            }

            public final void onAnimationEnd(Animation animation) {
                this.f1132a.m575c();
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }
        });
        this.f1146d.startAnimation(loadAnimation);
    }

    final void m575c() {
        C0325p a = C0325p.m640a();
        C0323a c0323a = this.f1148f;
        synchronized (a.f1257a) {
            if (a.m647d(c0323a)) {
                a.m642a(a.f1259c);
            }
        }
        if (this.f1150i != null) {
            for (int size = this.f1150i.size() - 1; size >= 0; size--) {
                this.f1150i.get(size);
            }
        }
    }

    final void m576d() {
        C0325p a = C0325p.m640a();
        C0323a c0323a = this.f1148f;
        synchronized (a.f1257a) {
            if (a.m647d(c0323a)) {
                a.f1259c = null;
                if (a.f1260d != null) {
                    a.m644b();
                }
            }
        }
        if (this.f1150i != null) {
            for (int size = this.f1150i.size() - 1; size >= 0; size--) {
                this.f1150i.get(size);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f1146d.setVisibility(8);
        }
        ViewParent parent = this.f1146d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f1146d);
        }
    }

    final boolean m577e() {
        return !this.f1151j.isEnabled();
    }
}
