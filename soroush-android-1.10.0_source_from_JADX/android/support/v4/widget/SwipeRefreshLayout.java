package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.C0560g;
import android.support.v4.view.C0561i;
import android.support.v4.view.C0562j;
import android.support.v4.view.C0563l;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class SwipeRefreshLayout extends ViewGroup implements C0560g, C0562j {
    private static final int[] f13456D = new int[]{16842766};
    private static final String f13457m = "SwipeRefreshLayout";
    private int f13458A;
    private boolean f13459B;
    private final DecelerateInterpolator f13460C;
    private int f13461E;
    private Animation f13462F;
    private Animation f13463G;
    private Animation f13464H;
    private Animation f13465I;
    private Animation f13466J;
    private int f13467K;
    private C0603a f13468L;
    private AnimationListener f13469M;
    private final Animation f13470N;
    private final Animation f13471O;
    C0604b f13472a;
    boolean f13473b;
    int f13474c;
    boolean f13475d;
    C0609b f13476e;
    protected int f13477f;
    float f13478g;
    protected int f13479h;
    int f13480i;
    C0613c f13481j;
    boolean f13482k;
    boolean f13483l;
    private View f13484n;
    private int f13485o;
    private float f13486p;
    private float f13487q;
    private final C0563l f13488r;
    private final C0561i f13489s;
    private final int[] f13490t;
    private final int[] f13491u;
    private boolean f13492v;
    private int f13493w;
    private float f13494x;
    private float f13495y;
    private boolean f13496z;

    class C05951 implements AnimationListener {
        final /* synthetic */ SwipeRefreshLayout f1962a;

        C05951(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1962a = swipeRefreshLayout;
        }

        public final void onAnimationEnd(Animation animation) {
            if (this.f1962a.f13473b) {
                this.f1962a.f13481j.setAlpha(255);
                this.f1962a.f13481j.start();
                if (this.f1962a.f13482k && this.f1962a.f13472a != null) {
                    C0604b c0604b = this.f1962a.f13472a;
                }
                this.f1962a.f13474c = this.f1962a.f13476e.getTop();
                return;
            }
            this.f1962a.m9334a();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    class C05962 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f1963a;

        C05962(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1963a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f1963a.setAnimationProgress(f);
        }
    }

    class C05973 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f1964a;

        C05973(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1964a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f1964a.setAnimationProgress(BallPulseIndicator.SCALE - f);
        }
    }

    class C05995 implements AnimationListener {
        final /* synthetic */ SwipeRefreshLayout f1968a;

        C05995(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1968a = swipeRefreshLayout;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f1968a.f13475d) {
                this.f1968a.m9336a(null);
            }
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    class C06006 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f1969a;

        C06006(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1969a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f1969a.setTargetOffsetTopAndBottom((this.f1969a.f13477f + ((int) (((float) ((!this.f1969a.f13483l ? this.f1969a.f13480i - Math.abs(this.f1969a.f13479h) : this.f1969a.f13480i) - this.f1969a.f13477f)) * f))) - this.f1969a.f13476e.getTop());
            this.f1969a.f13481j.m1490a(BallPulseIndicator.SCALE - f);
        }
    }

    class C06017 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f1970a;

        C06017(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1970a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f1970a.m9335a(f);
        }
    }

    class C06028 extends Animation {
        final /* synthetic */ SwipeRefreshLayout f1971a;

        C06028(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1971a = swipeRefreshLayout;
        }

        public final void applyTransformation(float f, Transformation transformation) {
            this.f1971a.setAnimationProgress(this.f1971a.f13478g + ((-this.f1971a.f13478g) * f));
            this.f1971a.m9335a(f);
        }
    }

    public interface C0603a {
        boolean m1462a();
    }

    public interface C0604b {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13473b = false;
        this.f13486p = -1.0f;
        this.f13490t = new int[2];
        this.f13491u = new int[2];
        this.f13458A = -1;
        this.f13461E = -1;
        this.f13469M = new C05951(this);
        this.f13470N = new C06006(this);
        this.f13471O = new C06017(this);
        this.f13485o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13493w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f13460C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f13467K = (int) (40.0f * displayMetrics.density);
        this.f13476e = new C0609b(getContext());
        this.f13481j = new C0613c(getContext());
        this.f13481j.m1491a(1);
        this.f13476e.setImageDrawable(this.f13481j);
        this.f13476e.setVisibility(8);
        addView(this.f13476e);
        C0571r.m1346a((ViewGroup) this);
        this.f13480i = (int) (64.0f * displayMetrics.density);
        this.f13486p = (float) this.f13480i;
        this.f13488r = new C0563l(this);
        this.f13489s = new C0561i(this);
        setNestedScrollingEnabled(true);
        int i = -this.f13467K;
        this.f13474c = i;
        this.f13479h = i;
        m9335a((float) BallPulseIndicator.SCALE);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f13456D);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private Animation m9325a(final int i, final int i2) {
        Animation c05984 = new Animation(this) {
            final /* synthetic */ SwipeRefreshLayout f1967c;

            public final void applyTransformation(float f, Transformation transformation) {
                this.f1967c.f13481j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        c05984.setDuration(300);
        this.f13476e.f2005a = null;
        this.f13476e.clearAnimation();
        this.f13476e.startAnimation(c05984);
        return c05984;
    }

    private void m9326a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13458A) {
            this.f13458A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m9327a(boolean z, boolean z2) {
        if (this.f13473b != z) {
            this.f13482k = z2;
            m9329b();
            this.f13473b = z;
            if (this.f13473b) {
                int i = this.f13474c;
                AnimationListener animationListener = this.f13469M;
                this.f13477f = i;
                this.f13470N.reset();
                this.f13470N.setDuration(200);
                this.f13470N.setInterpolator(this.f13460C);
                if (animationListener != null) {
                    this.f13476e.f2005a = animationListener;
                }
                this.f13476e.clearAnimation();
                this.f13476e.startAnimation(this.f13470N);
                return;
            }
            m9336a(this.f13469M);
        }
    }

    private static boolean m9328a(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void m9329b() {
        if (this.f13484n == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f13476e)) {
                    i++;
                } else {
                    this.f13484n = childAt;
                    return;
                }
            }
        }
    }

    private void m9330b(float f) {
        this.f13481j.m1492a(true);
        float min = Math.min(BallPulseIndicator.SCALE, Math.abs(f / this.f13486p));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float f2 = (float) (this.f13483l ? this.f13480i - this.f13479h : this.f13480i);
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f) - this.f13486p, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.f13479h + ((int) ((f2 * min) + ((f2 * pow) * 2.0f)));
        if (this.f13476e.getVisibility() != 0) {
            this.f13476e.setVisibility(0);
        }
        if (!this.f13475d) {
            this.f13476e.setScaleX(BallPulseIndicator.SCALE);
            this.f13476e.setScaleY(BallPulseIndicator.SCALE);
        }
        if (this.f13475d) {
            setAnimationProgress(Math.min(BallPulseIndicator.SCALE, f / this.f13486p));
        }
        if (f < this.f13486p) {
            if (this.f13481j.getAlpha() > 76 && !m9328a(this.f13464H)) {
                this.f13464H = m9325a(this.f13481j.getAlpha(), 76);
            }
        } else if (this.f13481j.getAlpha() < 255 && !m9328a(this.f13465I)) {
            this.f13465I = m9325a(this.f13481j.getAlpha(), 255);
        }
        this.f13481j.m1493b(Math.min(0.8f, max * 0.8f));
        this.f13481j.m1490a(Math.min(BallPulseIndicator.SCALE, max));
        f = ((-0.25f + (0.4f * max)) + (pow * 2.0f)) * 0.5f;
        C0613c c0613c = this.f13481j;
        c0613c.f2035a.f2017g = f;
        c0613c.invalidateSelf();
        setTargetOffsetTopAndBottom(i - this.f13474c);
    }

    private void m9331c(float f) {
        if (f > this.f13486p) {
            m9327a(true, true);
            return;
        }
        C0609b c0609b;
        Animation animation;
        this.f13473b = false;
        this.f13481j.m1493b(0.0f);
        AnimationListener animationListener = null;
        if (!this.f13475d) {
            animationListener = new C05995(this);
        }
        int i = this.f13474c;
        if (this.f13475d) {
            this.f13477f = i;
            this.f13478g = this.f13476e.getScaleX();
            this.f13466J = new C06028(this);
            this.f13466J.setDuration(150);
            if (animationListener != null) {
                this.f13476e.f2005a = animationListener;
            }
            this.f13476e.clearAnimation();
            c0609b = this.f13476e;
            animation = this.f13466J;
        } else {
            this.f13477f = i;
            this.f13471O.reset();
            this.f13471O.setDuration(200);
            this.f13471O.setInterpolator(this.f13460C);
            if (animationListener != null) {
                this.f13476e.f2005a = animationListener;
            }
            this.f13476e.clearAnimation();
            c0609b = this.f13476e;
            animation = this.f13471O;
        }
        c0609b.startAnimation(animation);
        this.f13481j.m1492a(false);
    }

    private boolean m9332c() {
        if (this.f13468L != null) {
            return this.f13468L.m1462a();
        }
        if (!(this.f13484n instanceof ListView)) {
            return this.f13484n.canScrollVertically(-1);
        }
        ListView listView = (ListView) this.f13484n;
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(-1);
        }
        if (listView.getChildCount() != 0) {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int top = listView.getChildAt(0).getTop();
            if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
                return true;
            }
        }
        return false;
    }

    private void m9333d(float f) {
        if (f - this.f13495y > ((float) this.f13485o) && !this.f13496z) {
            this.f13494x = this.f13495y + ((float) this.f13485o);
            this.f13496z = true;
            this.f13481j.setAlpha(76);
        }
    }

    private void setColorViewAlpha(int i) {
        this.f13476e.getBackground().setAlpha(i);
        this.f13481j.setAlpha(i);
    }

    final void m9334a() {
        this.f13476e.clearAnimation();
        this.f13481j.stop();
        this.f13476e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f13475d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f13479h - this.f13474c);
        }
        this.f13474c = this.f13476e.getTop();
    }

    final void m9335a(float f) {
        setTargetOffsetTopAndBottom((this.f13477f + ((int) (((float) (this.f13479h - this.f13477f)) * f))) - this.f13476e.getTop());
    }

    final void m9336a(AnimationListener animationListener) {
        this.f13463G = new C05973(this);
        this.f13463G.setDuration(150);
        this.f13476e.f2005a = animationListener;
        this.f13476e.clearAnimation();
        this.f13476e.startAnimation(this.f13463G);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f13489s.m1247a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f13489s.m1246a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f13489s.m1252a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f13489s.m1250a(i, i2, i3, i4, iArr);
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f13461E < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f13461E;
        }
        if (i2 >= this.f13461E) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f13488r.f1857a;
    }

    public int getProgressCircleDiameter() {
        return this.f13467K;
    }

    public int getProgressViewEndOffset() {
        return this.f13480i;
    }

    public int getProgressViewStartOffset() {
        return this.f13479h;
    }

    public boolean hasNestedScrollingParent() {
        return this.f13489s.m1248a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f13489s.f1852a;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9334a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
        r3 = this;
        r3.m9329b();
        r0 = r4.getActionMasked();
        r1 = r3.f13459B;
        r2 = 0;
        if (r1 == 0) goto L_0x0010;
    L_0x000c:
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r3.f13459B = r2;
    L_0x0010:
        r1 = r3.isEnabled();
        if (r1 == 0) goto L_0x007d;
    L_0x0016:
        r1 = r3.f13459B;
        if (r1 != 0) goto L_0x007d;
    L_0x001a:
        r1 = r3.m9332c();
        if (r1 != 0) goto L_0x007d;
    L_0x0020:
        r1 = r3.f13473b;
        if (r1 != 0) goto L_0x007d;
    L_0x0024:
        r1 = r3.f13492v;
        if (r1 == 0) goto L_0x0029;
    L_0x0028:
        return r2;
    L_0x0029:
        r1 = 6;
        if (r0 == r1) goto L_0x0077;
    L_0x002c:
        r1 = -1;
        switch(r0) {
            case 0: goto L_0x0053;
            case 1: goto L_0x004e;
            case 2: goto L_0x0031;
            case 3: goto L_0x004e;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x007a;
    L_0x0031:
        r0 = r3.f13458A;
        if (r0 != r1) goto L_0x003d;
    L_0x0035:
        r4 = f13457m;
        r0 = "Got ACTION_MOVE event but don't have an active pointer id.";
        android.util.Log.e(r4, r0);
        return r2;
    L_0x003d:
        r0 = r3.f13458A;
        r0 = r4.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x0046;
    L_0x0045:
        return r2;
    L_0x0046:
        r4 = r4.getY(r0);
        r3.m9333d(r4);
        goto L_0x007a;
    L_0x004e:
        r3.f13496z = r2;
        r3.f13458A = r1;
        goto L_0x007a;
    L_0x0053:
        r0 = r3.f13479h;
        r1 = r3.f13476e;
        r1 = r1.getTop();
        r0 = r0 - r1;
        r3.setTargetOffsetTopAndBottom(r0);
        r0 = r4.getPointerId(r2);
        r3.f13458A = r0;
        r3.f13496z = r2;
        r0 = r3.f13458A;
        r0 = r4.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x0070;
    L_0x006f:
        return r2;
    L_0x0070:
        r4 = r4.getY(r0);
        r3.f13495y = r4;
        goto L_0x007a;
    L_0x0077:
        r3.m9326a(r4);
    L_0x007a:
        r4 = r3.f13496z;
        return r4;
    L_0x007d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        i = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f13484n == null) {
                m9329b();
            }
            if (this.f13484n != null) {
                View view = this.f13484n;
                i3 = getPaddingLeft();
                i4 = getPaddingTop();
                view.layout(i3, i4, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + i3, ((i - getPaddingTop()) - getPaddingBottom()) + i4);
                i = this.f13476e.getMeasuredWidth();
                measuredWidth /= 2;
                i /= 2;
                this.f13476e.layout(measuredWidth - i, this.f13474c, measuredWidth + i, this.f13474c + this.f13476e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f13484n == null) {
            m9329b();
        }
        if (this.f13484n != null) {
            this.f13484n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f13476e.measure(MeasureSpec.makeMeasureSpec(this.f13467K, 1073741824), MeasureSpec.makeMeasureSpec(this.f13467K, 1073741824));
            this.f13461E = -1;
            for (i = 0; i < getChildCount(); i++) {
                if (getChildAt(i) == this.f13476e) {
                    this.f13461E = i;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f13487q > 0.0f) {
            float f = (float) i2;
            if (f > this.f13487q) {
                iArr[1] = i2 - ((int) this.f13487q);
                this.f13487q = 0.0f;
            } else {
                this.f13487q -= f;
                iArr[1] = i2;
            }
            m9330b(this.f13487q);
        }
        if (this.f13483l && i2 > 0 && this.f13487q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f13476e.setVisibility(8);
        }
        int[] iArr2 = this.f13490t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f13491u);
        i4 += this.f13491u[1];
        if (i4 < 0 && !m9332c()) {
            this.f13487q += (float) Math.abs(i4);
            m9330b(this.f13487q);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f13488r.f1857a = i;
        startNestedScroll(i & 2);
        this.f13487q = 0.0f;
        this.f13492v = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f13459B || this.f13473b || (i & 2) == 0) ? false : true;
    }

    public void onStopNestedScroll(View view) {
        this.f13488r.f1857a = 0;
        this.f13492v = false;
        if (this.f13487q > 0.0f) {
            m9331c(this.f13487q);
            this.f13487q = 0.0f;
        }
        stopNestedScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = r5.getActionMasked();
        r1 = r4.f13459B;
        r2 = 0;
        if (r1 == 0) goto L_0x000d;
    L_0x0009:
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        r4.f13459B = r2;
    L_0x000d:
        r1 = r4.isEnabled();
        if (r1 == 0) goto L_0x009e;
    L_0x0013:
        r1 = r4.f13459B;
        if (r1 != 0) goto L_0x009e;
    L_0x0017:
        r1 = r4.m9332c();
        if (r1 != 0) goto L_0x009e;
    L_0x001d:
        r1 = r4.f13473b;
        if (r1 != 0) goto L_0x009e;
    L_0x0021:
        r1 = r4.f13492v;
        if (r1 == 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        switch(r0) {
            case 0: goto L_0x0094;
            case 1: goto L_0x006f;
            case 2: goto L_0x0046;
            case 3: goto L_0x0045;
            case 4: goto L_0x002b;
            case 5: goto L_0x0030;
            case 6: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x009c;
    L_0x002c:
        r4.m9326a(r5);
        goto L_0x009c;
    L_0x0030:
        r0 = r5.getActionIndex();
        if (r0 >= 0) goto L_0x003e;
    L_0x0036:
        r5 = f13457m;
        r0 = "Got ACTION_POINTER_DOWN event but have an invalid action index.";
        android.util.Log.e(r5, r0);
        return r2;
    L_0x003e:
        r5 = r5.getPointerId(r0);
        r4.f13458A = r5;
        goto L_0x009c;
    L_0x0045:
        return r2;
    L_0x0046:
        r0 = r4.f13458A;
        r0 = r5.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x0056;
    L_0x004e:
        r5 = f13457m;
        r0 = "Got ACTION_MOVE event but have an invalid active pointer id.";
        android.util.Log.e(r5, r0);
        return r2;
    L_0x0056:
        r5 = r5.getY(r0);
        r4.m9333d(r5);
        r0 = r4.f13496z;
        if (r0 == 0) goto L_0x009c;
    L_0x0061:
        r0 = r4.f13494x;
        r5 = r5 - r0;
        r5 = r5 * r1;
        r0 = 0;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x006e;
    L_0x006a:
        r4.m9330b(r5);
        goto L_0x009c;
    L_0x006e:
        return r2;
    L_0x006f:
        r0 = r4.f13458A;
        r0 = r5.findPointerIndex(r0);
        if (r0 >= 0) goto L_0x007f;
    L_0x0077:
        r5 = f13457m;
        r0 = "Got ACTION_UP event but don't have an active pointer id.";
        android.util.Log.e(r5, r0);
        return r2;
    L_0x007f:
        r3 = r4.f13496z;
        if (r3 == 0) goto L_0x0090;
    L_0x0083:
        r5 = r5.getY(r0);
        r0 = r4.f13494x;
        r5 = r5 - r0;
        r5 = r5 * r1;
        r4.f13496z = r2;
        r4.m9331c(r5);
    L_0x0090:
        r5 = -1;
        r4.f13458A = r5;
        return r2;
    L_0x0094:
        r5 = r5.getPointerId(r2);
        r4.f13458A = r5;
        r4.f13496z = r2;
    L_0x009c:
        r5 = 1;
        return r5;
    L_0x009e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.SwipeRefreshLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f13484n instanceof AbsListView)) {
            return;
        }
        if (this.f13484n == null || C0571r.m1324B(this.f13484n)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    void setAnimationProgress(float f) {
        this.f13476e.setScaleX(f);
        this.f13476e.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m9329b();
        C0613c c0613c = this.f13481j;
        c0613c.f2035a.m1478a(iArr);
        c0613c.f2035a.m1476a(0);
        c0613c.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0346c.m687c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f13486p = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m9334a();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f13489s.m1245a(z);
    }

    public void setOnChildScrollUpCallback(C0603a c0603a) {
        this.f13468L = c0603a;
    }

    public void setOnRefreshListener(C0604b c0604b) {
        this.f13472a = c0604b;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f13476e.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0346c.m687c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f13473b == z) {
            m9327a(z, false);
            return;
        }
        this.f13473b = z;
        setTargetOffsetTopAndBottom((!this.f13483l ? this.f13480i + this.f13479h : this.f13480i) - this.f13474c);
        this.f13482k = false;
        AnimationListener animationListener = this.f13469M;
        this.f13476e.setVisibility(0);
        if (VERSION.SDK_INT >= 11) {
            this.f13481j.setAlpha(255);
        }
        this.f13462F = new C05962(this);
        this.f13462F.setDuration((long) this.f13493w);
        if (animationListener != null) {
            this.f13476e.f2005a = animationListener;
        }
        this.f13476e.clearAnimation();
        this.f13476e.startAnimation(this.f13462F);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f13467K = (int) ((i == 0 ? 56.0f : 40.0f) * getResources().getDisplayMetrics().density);
            this.f13476e.setImageDrawable(null);
            this.f13481j.m1491a(i);
            this.f13476e.setImageDrawable(this.f13481j);
        }
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f13476e.bringToFront();
        C0571r.m1359d(this.f13476e, i);
        this.f13474c = this.f13476e.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f13489s.m1249a(i, 0);
    }

    public void stopNestedScroll() {
        this.f13489s.m1254b(0);
    }
}
