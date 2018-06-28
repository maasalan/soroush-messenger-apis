package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.C0249a.C0243f;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.AppBarLayout.C0259b;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p035d.C0443a;
import android.support.v4.p038g.C0477i;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.support.v7.p041a.C0645a.C0643i;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class CollapsingToolbarLayout extends FrameLayout {
    final C0310g f963a;
    Drawable f964b;
    int f965c;
    C0582z f966d;
    private boolean f967e;
    private int f968f;
    private Toolbar f969g;
    private View f970h;
    private View f971i;
    private int f972j;
    private int f973k;
    private int f974l;
    private int f975m;
    private final Rect f976n;
    private boolean f977o;
    private boolean f978p;
    private Drawable f979q;
    private int f980r;
    private boolean f981s;
    private ValueAnimator f982t;
    private long f983u;
    private int f984v;
    private C0259b f985w;

    class C02672 implements AnimatorUpdateListener {
        final /* synthetic */ CollapsingToolbarLayout f960a;

        C02672(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f960a = collapsingToolbarLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f960a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public static class C0268a extends LayoutParams {
        int f961a = 0;
        float f962b = 0.5f;

        public C0268a() {
            super(-1, -1);
        }

        public C0268a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.CollapsingToolbarLayout_Layout);
            this.f961a = obtainStyledAttributes.getInt(C0248k.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f962b = obtainStyledAttributes.getFloat(C0248k.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public C0268a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class C47341 implements C0564m {
        final /* synthetic */ CollapsingToolbarLayout f13069a;

        C47341(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f13069a = collapsingToolbarLayout;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            view = this.f13069a;
            C0582z c0582z2 = C0571r.m1386w(view) ? c0582z : null;
            if (!C0477i.m1005a(view.f966d, c0582z2)) {
                view.f966d = c0582z2;
                view.requestLayout();
            }
            return c0582z.m1432f();
        }
    }

    private class C4735b implements C0259b {
        final /* synthetic */ CollapsingToolbarLayout f13070a;

        C4735b(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.f13070a = collapsingToolbarLayout;
        }

        public final void mo158a(int i) {
            this.f13070a.f965c = i;
            int b = this.f13070a.f966d != null ? this.f13070a.f966d.m1428b() : 0;
            int childCount = this.f13070a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                int a;
                View childAt = this.f13070a.getChildAt(i2);
                C0268a c0268a = (C0268a) childAt.getLayoutParams();
                C0332w a2 = CollapsingToolbarLayout.m479a(childAt);
                switch (c0268a.f961a) {
                    case 1:
                        a = C0443a.m943a(-i, 0, this.f13070a.m484b(childAt));
                        break;
                    case 2:
                        a = Math.round(((float) (-i)) * c0268a.f962b);
                        break;
                    default:
                        continue;
                }
                a2.m654a(a);
            }
            this.f13070a.m483a();
            if (this.f13070a.f964b != null && b > 0) {
                C0571r.m1361e(this.f13070a);
            }
            this.f13070a.f963a.m593a(((float) Math.abs(i)) / ((float) ((this.f13070a.getHeight() - C0571r.m1379p(this.f13070a)) - b)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f967e = true;
        this.f976n = new Rect();
        this.f984v = -1;
        C0330t.m650a(context);
        this.f963a = new C0310g(this);
        this.f963a.m599a(C0296a.f1127e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.CollapsingToolbarLayout, i, C0247j.Widget_Design_CollapsingToolbar);
        this.f963a.m594a(obtainStyledAttributes.getInt(C0248k.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f963a.m603b(obtainStyledAttributes.getInt(C0248k.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f975m = dimensionPixelSize;
        this.f974l = dimensionPixelSize;
        this.f973k = dimensionPixelSize;
        this.f972j = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f972j = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f974l = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f973k = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f975m = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f977o = obtainStyledAttributes.getBoolean(C0248k.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(obtainStyledAttributes.getText(C0248k.CollapsingToolbarLayout_title));
        this.f963a.m607d(C0247j.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f963a.m606c(C0643i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f963a.m607d(obtainStyledAttributes.getResourceId(C0248k.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (obtainStyledAttributes.hasValue(C0248k.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f963a.m606c(obtainStyledAttributes.getResourceId(C0248k.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f984v = obtainStyledAttributes.getDimensionPixelSize(C0248k.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f983u = (long) obtainStyledAttributes.getInt(C0248k.CollapsingToolbarLayout_scrimAnimationDuration, IjkMediaCodecInfo.RANK_LAST_CHANCE);
        setContentScrim(obtainStyledAttributes.getDrawable(C0248k.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(C0248k.CollapsingToolbarLayout_statusBarScrim));
        this.f968f = obtainStyledAttributes.getResourceId(C0248k.CollapsingToolbarLayout_toolbarId, -1);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        C0571r.m1341a((View) this, new C47341(this));
    }

    static C0332w m479a(View view) {
        C0332w c0332w = (C0332w) view.getTag(C0243f.view_offset_helper);
        if (c0332w != null) {
            return c0332w;
        }
        c0332w = new C0332w(view);
        view.setTag(C0243f.view_offset_helper, c0332w);
        return c0332w;
    }

    private void m480b() {
        if (this.f967e) {
            Toolbar toolbar = null;
            this.f969g = null;
            this.f970h = null;
            if (this.f968f != -1) {
                this.f969g = (Toolbar) findViewById(this.f968f);
                if (this.f969g != null) {
                    View view = this.f969g;
                    CollapsingToolbarLayout parent = view.getParent();
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = parent;
                        }
                        parent = parent.getParent();
                    }
                    this.f970h = view;
                }
            }
            if (this.f969g == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                }
                this.f969g = toolbar;
            }
            m482c();
            this.f967e = false;
        }
    }

    private static int m481c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return (view.getHeight() + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin;
    }

    private void m482c() {
        if (!(this.f977o || this.f971i == null)) {
            ViewParent parent = this.f971i.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f971i);
            }
        }
        if (this.f977o && this.f969g != null) {
            if (this.f971i == null) {
                this.f971i = new View(getContext());
            }
            if (this.f971i.getParent() == null) {
                this.f969g.addView(this.f971i, -1, -1);
            }
        }
    }

    final void m483a() {
        if (this.f979q != null || this.f964b != null) {
            setScrimsShown(getHeight() + this.f965c < getScrimVisibleHeightTrigger());
        }
    }

    final int m484b(View view) {
        return ((getHeight() - m479a(view).f1274a) - view.getHeight()) - ((C0268a) view.getLayoutParams()).bottomMargin;
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0268a;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m480b();
        if (this.f969g == null && this.f979q != null && this.f980r > 0) {
            this.f979q.mutate().setAlpha(this.f980r);
            this.f979q.draw(canvas);
        }
        if (this.f977o && this.f978p) {
            this.f963a.m597a(canvas);
        }
        if (this.f964b != null && this.f980r > 0) {
            int b = this.f966d != null ? this.f966d.m1428b() : 0;
            if (b > 0) {
                this.f964b.setBounds(0, -this.f965c, getWidth(), b - this.f965c);
                this.f964b.mutate().setAlpha(this.f980r);
                this.f964b.draw(canvas);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
        r4 = this;
        r0 = r4.f979q;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0033;
    L_0x0006:
        r0 = r4.f980r;
        if (r0 <= 0) goto L_0x0033;
    L_0x000a:
        r0 = r4.f970h;
        if (r0 == 0) goto L_0x0018;
    L_0x000e:
        r0 = r4.f970h;
        if (r0 != r4) goto L_0x0013;
    L_0x0012:
        goto L_0x0018;
    L_0x0013:
        r0 = r4.f970h;
        if (r6 != r0) goto L_0x001e;
    L_0x0017:
        goto L_0x001c;
    L_0x0018:
        r0 = r4.f969g;
        if (r6 != r0) goto L_0x001e;
    L_0x001c:
        r0 = r1;
        goto L_0x001f;
    L_0x001e:
        r0 = r2;
    L_0x001f:
        if (r0 == 0) goto L_0x0033;
    L_0x0021:
        r0 = r4.f979q;
        r0 = r0.mutate();
        r3 = r4.f980r;
        r0.setAlpha(r3);
        r0 = r4.f979q;
        r0.draw(r5);
        r0 = r1;
        goto L_0x0034;
    L_0x0033:
        r0 = r2;
    L_0x0034:
        r5 = super.drawChild(r5, r6, r7);
        if (r5 != 0) goto L_0x003e;
    L_0x003a:
        if (r0 == 0) goto L_0x003d;
    L_0x003c:
        return r1;
    L_0x003d:
        return r2;
    L_0x003e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f964b;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        drawable = this.f979q;
        if (drawable != null && drawable.isStateful()) {
            i |= drawable.setState(drawableState);
        }
        if (this.f963a != null) {
            i |= this.f963a.m601a(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0268a();
    }

    protected /* synthetic */ LayoutParams m22240generateDefaultLayoutParams() {
        return new C0268a();
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0268a(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0268a(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f963a.f1190c;
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f963a.m592a();
    }

    public Drawable getContentScrim() {
        return this.f979q;
    }

    public int getExpandedTitleGravity() {
        return this.f963a.f1189b;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f975m;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f974l;
    }

    public int getExpandedTitleMarginStart() {
        return this.f972j;
    }

    public int getExpandedTitleMarginTop() {
        return this.f973k;
    }

    public Typeface getExpandedTitleTypeface() {
        C0310g c0310g = this.f963a;
        return c0310g.f1195h != null ? c0310g.f1195h : Typeface.DEFAULT;
    }

    int getScrimAlpha() {
        return this.f980r;
    }

    public long getScrimAnimationDuration() {
        return this.f983u;
    }

    public int getScrimVisibleHeightTrigger() {
        if (this.f984v >= 0) {
            return this.f984v;
        }
        int b = this.f966d != null ? this.f966d.m1428b() : 0;
        int p = C0571r.m1379p(this);
        return p > 0 ? Math.min((p * 2) + b, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f964b;
    }

    public CharSequence getTitle() {
        return this.f977o ? this.f963a.f1196i : null;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0571r.m1354b((View) this, C0571r.m1386w((View) parent));
            if (this.f985w == null) {
                this.f985w = new C4735b(this);
            }
            ((AppBarLayout) parent).m476a(this.f985w);
            C0571r.m1385v(this);
        }
    }

    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.f985w != null && (parent instanceof AppBarLayout)) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            C0259b c0259b = this.f985w;
            if (!(appBarLayout.f939d == null || c0259b == null)) {
                appBarLayout.f939d.remove(c0259b);
            }
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b;
        int childCount;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        if (this.f966d != null) {
            b = this.f966d.m1428b();
            childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!C0571r.m1386w(childAt) && childAt.getTop() < b) {
                    C0571r.m1359d(childAt, b);
                }
            }
        }
        if (this.f977o && this.f971i != null) {
            childCount = 1;
            z = C0571r.m1329G(this.f971i) && this.f971i.getVisibility() == 0;
            this.f978p = z;
            if (this.f978p) {
                if (C0571r.m1369h(this) != 1) {
                    childCount = 0;
                }
                b = m484b(this.f970h != null ? this.f970h : this.f969g);
                C0331u.m651a((ViewGroup) this, this.f971i, this.f976n);
                this.f963a.m604b(this.f976n.left + (childCount != 0 ? this.f969g.getTitleMarginEnd() : this.f969g.getTitleMarginStart()), (this.f976n.top + b) + this.f969g.getTitleMarginTop(), this.f976n.right + (childCount != 0 ? this.f969g.getTitleMarginStart() : this.f969g.getTitleMarginEnd()), (this.f976n.bottom + b) - this.f969g.getTitleMarginBottom());
                this.f963a.m595a(childCount != 0 ? this.f974l : this.f972j, this.f976n.top + this.f973k, (i3 - i) - (childCount != 0 ? this.f972j : this.f974l), (i4 - i2) - this.f975m);
                this.f963a.m602b();
            }
        }
        b = getChildCount();
        while (i5 < b) {
            m479a(getChildAt(i5)).m653a();
            i5++;
        }
        if (this.f969g != null) {
            View view;
            if (this.f977o && TextUtils.isEmpty(this.f963a.f1196i)) {
                this.f963a.m600a(this.f969g.getTitle());
            }
            if (this.f970h != null) {
                if (this.f970h != this) {
                    view = this.f970h;
                    setMinimumHeight(m481c(view));
                }
            }
            view = this.f969g;
            setMinimumHeight(m481c(view));
        }
        m483a();
    }

    protected void onMeasure(int i, int i2) {
        m480b();
        super.onMeasure(i, i2);
        i2 = MeasureSpec.getMode(i2);
        int b = this.f966d != null ? this.f966d.m1428b() : 0;
        if (i2 == 0 && b > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + b, 1073741824));
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f979q != null) {
            this.f979q.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f963a.m603b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f963a.m606c(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f963a.m596a(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C0310g c0310g = this.f963a;
        if (C0310g.m583a(c0310g.f1194g, typeface)) {
            c0310g.f1194g = typeface;
            c0310g.m602b();
        }
    }

    public void setContentScrim(Drawable drawable) {
        if (this.f979q != drawable) {
            Drawable drawable2 = null;
            if (this.f979q != null) {
                this.f979q.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f979q = drawable2;
            if (this.f979q != null) {
                this.f979q.setBounds(0, 0, getWidth(), getHeight());
                this.f979q.setCallback(this);
                this.f979q.setAlpha(this.f980r);
            }
            C0571r.m1361e(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0346c.m682a(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f963a.m594a(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f975m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f974l = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f972j = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f973k = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f963a.m607d(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f963a.m605b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C0310g c0310g = this.f963a;
        if (C0310g.m583a(c0310g.f1195h, typeface)) {
            c0310g.f1195h = typeface;
            c0310g.m602b();
        }
    }

    void setScrimAlpha(int i) {
        if (i != this.f980r) {
            if (!(this.f979q == null || this.f969g == null)) {
                C0571r.m1361e(this.f969g);
            }
            this.f980r = i;
            C0571r.m1361e(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f983u = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f984v != i) {
            this.f984v = i;
            m483a();
        }
    }

    public void setScrimsShown(boolean z) {
        int i = 0;
        int i2 = (!C0571r.m1326D(this) || isInEditMode()) ? 0 : 1;
        if (this.f981s != z) {
            int i3 = 255;
            if (i2 != 0) {
                if (!z) {
                    i3 = 0;
                }
                m480b();
                if (this.f982t == null) {
                    this.f982t = new ValueAnimator();
                    this.f982t.setDuration(this.f983u);
                    this.f982t.setInterpolator(i3 > this.f980r ? C0296a.f1125c : C0296a.f1126d);
                    this.f982t.addUpdateListener(new C02672(this));
                } else if (this.f982t.isRunning()) {
                    this.f982t.cancel();
                }
                this.f982t.setIntValues(new int[]{this.f980r, i3});
                this.f982t.start();
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.f981s = z;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        if (this.f964b != drawable) {
            Drawable drawable2 = null;
            if (this.f964b != null) {
                this.f964b.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f964b = drawable2;
            if (this.f964b != null) {
                if (this.f964b.isStateful()) {
                    this.f964b.setState(getDrawableState());
                }
                C0429a.m891b(this.f964b, C0571r.m1369h(this));
                this.f964b.setVisible(getVisibility() == 0, false);
                this.f964b.setCallback(this);
                this.f964b.setAlpha(this.f980r);
            }
            C0571r.m1361e(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0346c.m682a(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f963a.m600a(charSequence);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f977o) {
            this.f977o = z;
            m482c();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (!(this.f964b == null || this.f964b.isVisible() == z)) {
            this.f964b.setVisible(z, false);
        }
        if (this.f979q != null && this.f979q.isVisible() != z) {
            this.f979q.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(super.verifyDrawable(drawable) || drawable == this.f979q)) {
            if (drawable != this.f964b) {
                return false;
            }
        }
        return true;
    }
}
