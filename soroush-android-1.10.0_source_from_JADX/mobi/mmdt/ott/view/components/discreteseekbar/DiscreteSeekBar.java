package mobi.mmdt.ott.view.components.discreteseekbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.p031b.p032a.C0429a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.WindowManager;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.C2540d.C2534a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C3140a;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C3140a.C3139a;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C3140a.C6082b;
import mobi.mmdt.ott.view.components.discreteseekbar.p403a.C6083b;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6086a;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6087b.C3146a;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6088d;
import mobi.mmdt.ott.view.components.discreteseekbar.p404b.C6089e;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import org.linphone.core.Privacy;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class DiscreteSeekBar extends View {
    private static final boolean f9727b = (VERSION.SDK_INT >= 21);
    private float f9728A;
    private float f9729B;
    private float f9730C;
    private Runnable f9731D;
    private C3146a f9732E;
    public boolean f9733a;
    private C6088d f9734c;
    private C6089e f9735d;
    private C6089e f9736e;
    private Drawable f9737f;
    private int f9738g;
    private int f9739h;
    private int f9740i;
    private int f9741j;
    private int f9742k;
    private int f9743l;
    private int f9744m;
    private boolean f9745n;
    private boolean f9746o;
    private boolean f9747p;
    private String f9748q;
    private C3137b f9749r;
    private C3138c f9750s;
    private int f9751t;
    private Rect f9752u;
    private Rect f9753v;
    private C3149b f9754w;
    private C3140a f9755x;
    private float f9756y;
    private int f9757z;

    class C31352 implements Runnable {
        final /* synthetic */ DiscreteSeekBar f9723a;

        C31352(DiscreteSeekBar discreteSeekBar) {
            this.f9723a = discreteSeekBar;
        }

        public final void run() {
            DiscreteSeekBar.m7607a(this.f9723a);
        }
    }

    static class CustomState extends BaseSavedState {
        public static final Creator<CustomState> CREATOR = new C31361();
        private int f9724a;
        private int f9725b;
        private int f9726c;

        static class C31361 implements Creator<CustomState> {
            C31361() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CustomState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CustomState[i];
            }
        }

        public CustomState(Parcel parcel) {
            super(parcel);
            this.f9724a = parcel.readInt();
            this.f9725b = parcel.readInt();
            this.f9726c = parcel.readInt();
        }

        public CustomState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9724a);
            parcel.writeInt(this.f9725b);
            parcel.writeInt(this.f9726c);
        }
    }

    public static abstract class C3137b {
        public abstract int mo2256a(int i);
    }

    public interface C3138c {
        void mo2277a(int i, boolean z);

        void mo2278a(DiscreteSeekBar discreteSeekBar);
    }

    class C60791 implements C3139a {
        final /* synthetic */ DiscreteSeekBar f16264a;

        C60791(DiscreteSeekBar discreteSeekBar) {
            this.f16264a = discreteSeekBar;
        }

        public final void mo2253a(float f) {
            this.f16264a.setAnimationPosition(f);
        }
    }

    class C60803 implements C3146a {
        final /* synthetic */ DiscreteSeekBar f16265a;

        C60803(DiscreteSeekBar discreteSeekBar) {
            this.f16265a = discreteSeekBar;
        }

        public final void mo2254a() {
            this.f16265a.f9734c.m13742a();
        }

        public final void mo2255b() {
        }
    }

    private static class C6081a extends C3137b {
        private C6081a() {
        }

        public final int mo2256a(int i) {
            return i;
        }
    }

    public DiscreteSeekBar(Context context) {
        this(context, null);
    }

    public DiscreteSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.discreteSeekBarStyle);
    }

    public DiscreteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9744m = 1;
        this.f9745n = false;
        this.f9746o = true;
        this.f9747p = true;
        this.f9752u = new Rect();
        this.f9753v = new Rect();
        this.f9731D = new C31352(this);
        this.f9732E = new C60803(this);
        setFocusable(true);
        setWillNotDraw(false);
        this.f9729B = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        float f = context.getResources().getDisplayMetrics().density;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C2534a.DiscreteSeekBar, i2, R.style.Widget.DiscreteSeekBar);
        this.f9745n = obtainStyledAttributes.getBoolean(9, this.f9745n);
        this.f9746o = obtainStyledAttributes.getBoolean(0, this.f9746o);
        this.f9747p = obtainStyledAttributes.getBoolean(4, this.f9747p);
        this.f9738g = obtainStyledAttributes.getDimensionPixelSize(15, (int) (BallPulseIndicator.SCALE * f));
        this.f9739h = obtainStyledAttributes.getDimensionPixelSize(12, (int) (4.0f * f));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(13, (int) (12.0f * f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, (int) (5.0f * f));
        this.f9740i = Math.max(0, (((int) (f * 32.0f)) - dimensionPixelSize) / 2);
        TypedValue typedValue = new TypedValue();
        int i3 = 100;
        if (obtainStyledAttributes.getValue(7, typedValue)) {
            i3 = typedValue.type == 5 ? obtainStyledAttributes.getDimensionPixelSize(7, 100) : obtainStyledAttributes.getInteger(7, 100);
        }
        int dimensionPixelSize3 = obtainStyledAttributes.getValue(8, typedValue) ? typedValue.type == 5 ? obtainStyledAttributes.getDimensionPixelSize(8, 0) : obtainStyledAttributes.getInteger(8, 0) : 0;
        int dimensionPixelSize4 = obtainStyledAttributes.getValue(16, typedValue) ? typedValue.type == 5 ? obtainStyledAttributes.getDimensionPixelSize(16, 0) : obtainStyledAttributes.getInteger(16, 0) : 0;
        r0.f9742k = dimensionPixelSize3;
        r0.f9741j = Math.max(dimensionPixelSize3 + 1, i3);
        r0.f9743l = Math.max(dimensionPixelSize3, Math.min(i3, dimensionPixelSize4));
        m7611b();
        r0.f9748q = obtainStyledAttributes.getString(3);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(14);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(10);
        ColorStateList colorStateList3 = obtainStyledAttributes.getColorStateList(11);
        boolean isInEditMode = isInEditMode();
        if (isInEditMode || colorStateList3 == null) {
            colorStateList3 = new ColorStateList(new int[][]{new int[0]}, new int[]{-12303292});
        }
        if (isInEditMode || colorStateList == null) {
            colorStateList = new ColorStateList(new int[][]{new int[0]}, new int[]{-7829368});
        }
        if (isInEditMode || colorStateList2 == null) {
            colorStateList2 = new ColorStateList(new int[][]{new int[0]}, new int[]{-16738680});
        }
        r0.f9737f = VERSION.SDK_INT >= 21 ? new RippleDrawable(colorStateList3, null, null) : new C6086a(colorStateList3);
        if (f9727b) {
            Drawable drawable = r0.f9737f;
            if (VERSION.SDK_INT >= 16) {
                setBackground(drawable);
            } else {
                setBackgroundDrawable(drawable);
            }
        } else {
            r0.f9737f.setCallback(r0);
        }
        r0.f9735d = new C6089e(colorStateList);
        r0.f9735d.setCallback(r0);
        r0.f9736e = new C6089e(colorStateList2);
        r0.f9736e.setCallback(r0);
        r0.f9734c = new C6088d(colorStateList2, dimensionPixelSize);
        r0.f9734c.setCallback(r0);
        r0.f9734c.setBounds(0, 0, r0.f9734c.getIntrinsicWidth(), r0.f9734c.getIntrinsicHeight());
        if (!isInEditMode) {
            r0.f9754w = new C3149b(context2, attributeSet2, i2, m7609b(r0.f9741j), dimensionPixelSize, (r0.f9740i + dimensionPixelSize) + dimensionPixelSize2);
            r0.f9754w.f9771d = r0.f9732E;
        }
        obtainStyledAttributes.recycle();
        setNumericTransformer(new C6081a());
    }

    private void m7602a() {
        if (!isInEditMode()) {
            C3149b c3149b = this.f9754w;
            String b = m7609b(this.f9749r.mo2256a(this.f9741j));
            c3149b.m7629a();
            if (c3149b.f9770c != null) {
                c3149b.f9770c.f16273a.m13715a(b);
            }
        }
    }

    private void m7603a(float f, float f2) {
        C0429a.m882a(this.f9737f, f, f2);
    }

    private void m7604a(int i) {
        if (!isInEditMode()) {
            C3149b c3149b = this.f9754w;
            c3149b.f9770c.f16273a.setValue(m7609b(this.f9749r.mo2256a(i)));
        }
    }

    private void m7605a(int i, boolean z) {
        i = Math.max(this.f9742k, Math.min(this.f9741j, i));
        if (m7617e()) {
            this.f9755x.mo2257a();
        }
        if (this.f9743l != i) {
            this.f9743l = i;
            m7612b(i, z);
            m7604a(i);
            m7618f();
        }
    }

    private void m7606a(MotionEvent motionEvent) {
        m7603a(motionEvent.getX(), motionEvent.getY());
        int x = (int) motionEvent.getX();
        int width = this.f9734c.getBounds().width() / 2;
        int i = this.f9740i;
        x = (x - this.f9751t) + width;
        int paddingLeft = (getPaddingLeft() + width) + i;
        width = getWidth() - ((getPaddingRight() + width) + i);
        if (x < paddingLeft) {
            x = paddingLeft;
        } else if (x > width) {
            x = width;
        }
        m7605a(Math.round(((((float) (x - paddingLeft)) / ((float) (width - paddingLeft))) * ((float) (this.f9741j - this.f9742k))) + ((float) this.f9742k)), true);
    }

    static /* synthetic */ void m7607a(DiscreteSeekBar discreteSeekBar) {
        if (!discreteSeekBar.isInEditMode()) {
            C6088d c6088d = discreteSeekBar.f9734c;
            c6088d.scheduleSelf(c6088d.f16306b, SystemClock.uptimeMillis() + 100);
            c6088d.f16305a = true;
            C3149b c3149b = discreteSeekBar.f9754w;
            Rect bounds = discreteSeekBar.f9734c.getBounds();
            if (c3149b.f9769b) {
                c3149b.f9770c.f16273a.m13717c();
                return;
            }
            IBinder windowToken = discreteSeekBar.getWindowToken();
            if (windowToken != null) {
                LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.gravity = 8388659;
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.format = -3;
                layoutParams.flags = ((((layoutParams.flags & -426521) | Privacy.DEFAULT) | 8) | 16) | IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
                layoutParams.type = IjkMediaCodecInfo.RANK_MAX;
                layoutParams.token = windowToken;
                layoutParams.softInputMode = 3;
                StringBuilder stringBuilder = new StringBuilder("DiscreteSeekBar Indicator:");
                stringBuilder.append(Integer.toHexString(c3149b.hashCode()));
                layoutParams.setTitle(stringBuilder.toString());
                layoutParams.gravity = 8388659;
                int i = bounds.bottom;
                DisplayMetrics displayMetrics = discreteSeekBar.getResources().getDisplayMetrics();
                c3149b.f9773f.set(displayMetrics.widthPixels, displayMetrics.heightPixels);
                c3149b.f9770c.measure(MeasureSpec.makeMeasureSpec(c3149b.f9773f.x, 1073741824), MeasureSpec.makeMeasureSpec(c3149b.f9773f.y, Integer.MIN_VALUE));
                int measuredHeight = c3149b.f9770c.getMeasuredHeight();
                int paddingBottom = c3149b.f9770c.f16273a.getPaddingBottom();
                discreteSeekBar.getLocationInWindow(c3149b.f9772e);
                layoutParams.x = 0;
                layoutParams.y = ((c3149b.f9772e[1] - measuredHeight) + i) + paddingBottom;
                layoutParams.width = c3149b.f9773f.x;
                layoutParams.height = measuredHeight;
                c3149b.f9769b = true;
                c3149b.m7630a(bounds.centerX());
                c3149b.f9768a.addView(c3149b.f9770c, layoutParams);
                c3149b.f9770c.f16273a.m13717c();
            }
        }
    }

    private boolean m7608a(MotionEvent motionEvent, boolean z) {
        Rect rect = this.f9753v;
        this.f9734c.copyBounds(rect);
        rect.inset(-this.f9740i, -this.f9740i);
        this.f9733a = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (!(this.f9733a || !this.f9746o || z)) {
            this.f9733a = true;
            this.f9751t = (rect.width() / 2) - this.f9740i;
            m7606a(motionEvent);
            this.f9734c.copyBounds(rect);
            rect.inset(-this.f9740i, -this.f9740i);
        }
        if (this.f9733a) {
            setPressed(true);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            m7603a(motionEvent.getX(), motionEvent.getY());
            this.f9751t = (int) ((motionEvent.getX() - ((float) rect.left)) - ((float) this.f9740i));
        }
        return this.f9733a;
    }

    private String m7609b(int i) {
        return this.f9730C > 0.0f ? C2491i.m6774a(getContext(), (long) ((this.f9730C / 1000.0f) * ((float) i)), false) : String.valueOf(i);
    }

    private void m7611b() {
        int i = this.f9741j - this.f9742k;
        if (this.f9744m == 0 || i / this.f9744m > 20) {
            this.f9744m = Math.max(1, Math.round(((float) i) / 20.0f));
        }
    }

    private void m7612b(int i, boolean z) {
        if (this.f9750s != null) {
            this.f9750s.mo2277a(i, z);
        }
    }

    private void m7613c() {
        int[] drawableState = getDrawableState();
        int i = 0;
        int length = drawableState.length;
        int i2 = 0;
        int i3 = i2;
        while (i < length) {
            int i4 = drawableState[i];
            if (i4 == 16842908) {
                i2 = true;
            } else if (i4 == 16842919) {
                i3 = true;
            }
            i++;
        }
        if (!isEnabled() || ((r3 == 0 && r4 == 0) || !this.f9747p)) {
            removeCallbacks(this.f9731D);
            if (!isInEditMode()) {
                C6084a a = this.f9754w.f9770c.f16273a;
                a.f16270b.stop();
                a.f16269a.setVisibility(4);
                C6087b c6087b = a.f16270b;
                c6087b.f16291c = true;
                c6087b.unscheduleSelf(c6087b.f16300l);
                if (c6087b.f16289a > 0.0f) {
                    c6087b.f16292d = true;
                    c6087b.f16294f = c6087b.f16289a;
                    c6087b.f16293e = 250 - ((int) (250.0f * (BallPulseIndicator.SCALE - c6087b.f16289a)));
                    c6087b.f16290b = SystemClock.uptimeMillis();
                    c6087b.scheduleSelf(c6087b.f16300l, c6087b.f16290b + 16);
                } else {
                    c6087b.m13738a();
                }
            }
        } else {
            removeCallbacks(this.f9731D);
            postDelayed(this.f9731D, 150);
        }
        this.f9734c.setState(drawableState);
        this.f9735d.setState(drawableState);
        this.f9736e.setState(drawableState);
        this.f9737f.setState(drawableState);
    }

    private void m7614c(int i) {
        float animationPosition = m7617e() ? getAnimationPosition() : (float) getProgress();
        if (i < this.f9742k) {
            i = this.f9742k;
        } else if (i > this.f9741j) {
            i = this.f9741j;
        }
        if (this.f9755x != null) {
            this.f9755x.mo2257a();
        }
        this.f9757z = i;
        float f = (float) i;
        C3139a c60791 = new C60791(this);
        this.f9755x = VERSION.SDK_INT >= 11 ? new C6083b(animationPosition, f, c60791) : new C6082b(f, c60791);
        this.f9755x.mo2259c();
        this.f9755x.mo2260d();
    }

    private void m7615d() {
        if (this.f9750s != null) {
            this.f9750s.mo2278a(this);
        }
        this.f9733a = false;
        setPressed(false);
    }

    private void m7616d(int i) {
        int intrinsicWidth = this.f9734c.getIntrinsicWidth();
        int i2 = intrinsicWidth / 2;
        int paddingLeft = getPaddingLeft() + this.f9740i;
        i += paddingLeft;
        this.f9734c.copyBounds(this.f9752u);
        this.f9734c.setBounds(i, this.f9752u.top, intrinsicWidth + i, this.f9752u.bottom);
        this.f9736e.getBounds().left = paddingLeft + i2;
        this.f9736e.getBounds().right = i + i2;
        Rect rect = this.f9753v;
        this.f9734c.copyBounds(rect);
        if (!isInEditMode()) {
            C3149b c3149b = this.f9754w;
            i2 = rect.centerX();
            if (c3149b.f9769b) {
                c3149b.m7630a(i2);
            }
        }
        this.f9752u.inset(-this.f9740i, -this.f9740i);
        rect.inset(-this.f9740i, -this.f9740i);
        this.f9752u.union(rect);
        Drawable drawable = this.f9737f;
        i2 = rect.left;
        paddingLeft = rect.top;
        int i3 = rect.right;
        i = rect.bottom;
        if (VERSION.SDK_INT >= 21) {
            int i4 = (i3 - i2) / 8;
            C0429a.m884a(drawable, i2 + i4, paddingLeft + i4, i3 - i4, i - i4);
        } else {
            drawable.setBounds(i2, paddingLeft, i3, i);
        }
        invalidate(this.f9752u);
    }

    private boolean m7617e() {
        return this.f9755x != null && this.f9755x.mo2258b();
    }

    private void m7618f() {
        int intrinsicWidth = this.f9734c.getIntrinsicWidth();
        int i = this.f9740i;
        intrinsicWidth /= 2;
        m7616d((int) (((((float) (this.f9743l - this.f9742k)) / ((float) (this.f9741j - this.f9742k))) * ((float) ((getWidth() - ((getPaddingRight() + intrinsicWidth) + i)) - ((getPaddingLeft() + intrinsicWidth) + i)))) + 0.5f));
    }

    private int getAnimatedProgress() {
        return m7617e() ? getAnimationTarget() : this.f9743l;
    }

    private int getAnimationTarget() {
        return this.f9757z;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m7613c();
    }

    float getAnimationPosition() {
        return this.f9756y;
    }

    public float getFloatProgress() {
        return ((float) this.f9743l) / 1000.0f;
    }

    public int getMax() {
        return this.f9741j;
    }

    public int getMin() {
        return this.f9742k;
    }

    public C3137b getNumericTransformer() {
        return this.f9749r;
    }

    public int getProgress() {
        return this.f9743l;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f9731D);
        if (!isInEditMode()) {
            this.f9754w.m7629a();
        }
    }

    protected synchronized void onDraw(Canvas canvas) {
        if (!f9727b) {
            this.f9737f.draw(canvas);
        }
        super.onDraw(canvas);
        this.f9735d.draw(canvas);
        this.f9736e.draw(canvas);
        this.f9734c.draw(canvas);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
        r4 = this;
        r0 = r4.isEnabled();
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0024;
    L_0x0008:
        r0 = r4.getAnimatedProgress();
        switch(r5) {
            case 21: goto L_0x0018;
            case 22: goto L_0x0010;
            default: goto L_0x000f;
        };
    L_0x000f:
        goto L_0x0024;
    L_0x0010:
        r3 = r4.f9741j;
        if (r0 >= r3) goto L_0x0022;
    L_0x0014:
        r3 = r4.f9744m;
        r0 = r0 + r3;
        goto L_0x001f;
    L_0x0018:
        r3 = r4.f9742k;
        if (r0 <= r3) goto L_0x0022;
    L_0x001c:
        r3 = r4.f9744m;
        r0 = r0 - r3;
    L_0x001f:
        r4.m7614c(r0);
    L_0x0022:
        r0 = r2;
        goto L_0x0025;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        if (r0 != 0) goto L_0x002f;
    L_0x0027:
        r5 = super.onKeyDown(r5, r6);
        if (r5 == 0) goto L_0x002e;
    L_0x002d:
        return r2;
    L_0x002e:
        return r1;
    L_0x002f:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            removeCallbacks(this.f9731D);
            if (!isInEditMode()) {
                this.f9754w.m7629a();
            }
            m7613c();
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(MeasureSpec.getSize(i), ((this.f9734c.getIntrinsicHeight() + getPaddingTop()) + getPaddingBottom()) + (this.f9740i * 2));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable.getClass().equals(CustomState.class)) {
                CustomState customState = (CustomState) parcelable;
                setMin(customState.f9726c);
                setMax(customState.f9725b);
                m7605a(customState.f9724a, false);
                super.onRestoreInstanceState(customState.getSuperState());
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable customState = new CustomState(super.onSaveInstanceState());
        customState.f9724a = getProgress();
        customState.f9725b = this.f9741j;
        customState.f9726c = this.f9742k;
        return customState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i = this.f9734c.getIntrinsicWidth();
        i2 = this.f9734c.getIntrinsicHeight();
        i3 = this.f9740i;
        i4 = i / 2;
        int paddingLeft = getPaddingLeft() + i3;
        int paddingRight = getPaddingRight();
        int height = (getHeight() - getPaddingBottom()) - i3;
        this.f9734c.setBounds(paddingLeft, height - i2, i + paddingLeft, height);
        i = Math.max(this.f9738g / 2, 1);
        paddingLeft += i4;
        height -= i4;
        this.f9735d.setBounds(paddingLeft, height - i, ((getWidth() - i4) - paddingRight) - i3, i + height);
        i = Math.max(this.f9739h / 2, 2);
        this.f9736e.setBounds(paddingLeft, height - i, paddingLeft, height + i);
        m7618f();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.isEnabled();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r6.getActionMasked();
        r2 = 1;
        switch(r0) {
            case 0: goto L_0x003e;
            case 1: goto L_0x002f;
            case 2: goto L_0x0015;
            case 3: goto L_0x0011;
            default: goto L_0x0010;
        };
    L_0x0010:
        return r2;
    L_0x0011:
        r5.m7615d();
        return r2;
    L_0x0015:
        r0 = r5.f9733a;
        if (r0 == 0) goto L_0x001d;
    L_0x0019:
        r5.m7606a(r6);
        return r2;
    L_0x001d:
        r0 = r6.getX();
        r3 = r5.f9728A;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r3 = r5.f9729B;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0067;
    L_0x002e:
        goto L_0x0064;
    L_0x002f:
        r0 = r5.f9733a;
        if (r0 != 0) goto L_0x0011;
    L_0x0033:
        r0 = r5.f9746o;
        if (r0 == 0) goto L_0x0011;
    L_0x0037:
        r5.m7608a(r6, r1);
        r5.m7606a(r6);
        goto L_0x0011;
    L_0x003e:
        r0 = r6.getX();
        r5.f9728A = r0;
        r0 = r5.getParent();
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 14;
        if (r3 < r4) goto L_0x0064;
    L_0x004e:
        if (r0 == 0) goto L_0x0064;
    L_0x0050:
        r3 = r0 instanceof android.view.ViewGroup;
        if (r3 == 0) goto L_0x0064;
    L_0x0054:
        r3 = r0;
        r3 = (android.view.ViewGroup) r3;
        r3 = r3.shouldDelayChildPressedState();
        if (r3 == 0) goto L_0x005f;
    L_0x005d:
        r1 = r2;
        goto L_0x0064;
    L_0x005f:
        r0 = r0.getParent();
        goto L_0x004e;
    L_0x0064:
        r5.m7608a(r6, r1);
    L_0x0067:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.discreteseekbar.DiscreteSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    void setAnimationPosition(float f) {
        this.f9756y = f;
        f = (f - ((float) this.f9742k)) / ((float) (this.f9741j - this.f9742k));
        int width = this.f9734c.getBounds().width() / 2;
        int i = this.f9740i;
        int width2 = (getWidth() - ((getPaddingRight() + width) + i)) - ((getPaddingLeft() + width) + i);
        width = Math.round((((float) (this.f9741j - this.f9742k)) * f) + ((float) this.f9742k));
        if (width != getProgress()) {
            this.f9743l = width;
            m7612b(this.f9743l, true);
            m7604a(width);
        }
        m7616d((int) ((f * ((float) width2)) + 0.5f));
    }

    public void setFloatProgress(float f) {
        m7605a((int) (f * 1000.0f), false);
    }

    public void setIndicatorFormatter(String str) {
        this.f9748q = str;
        m7604a(this.f9743l);
    }

    public void setIndicatorPopupEnabled(boolean z) {
        this.f9747p = z;
    }

    public void setMax(int i) {
        this.f9741j = i;
        if (this.f9741j < this.f9742k) {
            setMin(this.f9741j - 1);
        }
        m7611b();
        if (this.f9743l < this.f9742k || this.f9743l > this.f9741j) {
            setProgress(this.f9742k);
        }
        m7602a();
    }

    public void setMin(int i) {
        this.f9742k = i;
        if (this.f9742k > this.f9741j) {
            setMax(this.f9742k + 1);
        }
        m7611b();
        if (this.f9743l < this.f9742k || this.f9743l > this.f9741j) {
            setProgress(this.f9742k);
        }
    }

    public void setNumericTransformer(C3137b c3137b) {
        if (c3137b == null) {
            c3137b = new C6081a();
        }
        this.f9749r = c3137b;
        m7602a();
        m7604a(this.f9743l);
    }

    public void setOnProgressChangeListener(C3138c c3138c) {
        this.f9750s = c3138c;
    }

    public void setProgress(int i) {
        m7605a(i, false);
    }

    public void setRippleColor(int i) {
        setRippleColor(new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable = this.f9737f;
        if (VERSION.SDK_INT >= 21) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        } else {
            ((C6086a) drawable).m13728a(colorStateList);
        }
    }

    public void setScrubberColor(int i) {
        this.f9736e.m7628b(ColorStateList.valueOf(i));
    }

    public void setScrubberColor(ColorStateList colorStateList) {
        this.f9736e.m7628b(colorStateList);
    }

    public void setTrackColor(int i) {
        this.f9735d.m7628b(ColorStateList.valueOf(i));
    }

    public void setTrackColor(ColorStateList colorStateList) {
        this.f9735d.m7628b(colorStateList);
    }

    public void setVideoDuration(float f) {
        this.f9730C = f;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!(drawable == this.f9734c || drawable == this.f9735d || drawable == this.f9736e || drawable == this.f9737f)) {
            if (!super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }
}
