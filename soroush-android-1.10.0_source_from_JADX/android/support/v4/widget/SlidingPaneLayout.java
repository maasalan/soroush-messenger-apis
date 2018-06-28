package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0571r;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class SlidingPaneLayout extends ViewGroup {
    static final C0594d f1941h;
    View f1942a;
    float f1943b;
    int f1944c;
    boolean f1945d;
    final C0634p f1946e;
    boolean f1947f;
    final ArrayList<C0591a> f1948g;
    private int f1949i;
    private int f1950j;
    private Drawable f1951k;
    private Drawable f1952l;
    private final int f1953m;
    private boolean f1954n;
    private float f1955o;
    private int f1956p;
    private float f1957q;
    private float f1958r;
    private C0593c f1959s;
    private boolean f1960t;
    private final Rect f1961u;

    private class C0591a implements Runnable {
        final View f1934a;
        final /* synthetic */ SlidingPaneLayout f1935b;

        C0591a(SlidingPaneLayout slidingPaneLayout, View view) {
            this.f1935b = slidingPaneLayout;
            this.f1934a = view;
        }

        public final void run() {
            if (this.f1934a.getParent() == this.f1935b) {
                this.f1934a.setLayerType(0, null);
                this.f1935b.m1460a(this.f1934a);
            }
            this.f1935b.f1948g.remove(this);
        }
    }

    public static class C0592b extends MarginLayoutParams {
        private static final int[] f1936e = new int[]{16843137};
        public float f1937a = 0.0f;
        boolean f1938b;
        boolean f1939c;
        Paint f1940d;

        public C0592b() {
            super(-1, -1);
        }

        public C0592b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1936e);
            this.f1937a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public C0592b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0592b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public interface C0593c {
    }

    interface C0594d {
        void mo415a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05901();
        boolean f13455a;

        static class C05901 implements ClassLoaderCreator<SavedState> {
            C05901() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel, null);
            this.f13455a = parcel.readInt() != 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13455a);
        }
    }

    static class C4852e implements C0594d {
        C4852e() {
        }

        public void mo415a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0571r.m1334a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    static class C6379f extends C4852e {
        private Method f17447a;
        private Field f17448b;

        C6379f() {
            try {
                this.f17447a = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f17448b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f17448b.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        public final void mo415a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f17447a == null || this.f17448b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f17448b.setBoolean(view, true);
                this.f17447a.invoke(view, null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
            }
            super.mo415a(slidingPaneLayout, view);
        }
    }

    static class C6380g extends C4852e {
        C6380g() {
        }

        public final void mo415a(SlidingPaneLayout slidingPaneLayout, View view) {
            C0571r.m1336a(view, ((C0592b) view.getLayoutParams()).f1940d);
        }
    }

    static {
        C0594d c6380g = VERSION.SDK_INT >= 17 ? new C6380g() : VERSION.SDK_INT >= 16 ? new C6379f() : new C4852e();
        f1941h = c6380g;
    }

    private void m1455a(View view, float f, int i) {
        C0592b c0592b = (C0592b) view.getLayoutParams();
        if (f <= 0.0f || i == 0) {
            if (view.getLayerType() != 0) {
                if (c0592b.f1940d != null) {
                    c0592b.f1940d.setColorFilter(null);
                }
                Runnable c0591a = new C0591a(this, view);
                this.f1948g.add(c0591a);
                C0571r.m1343a((View) this, c0591a);
            }
            return;
        }
        int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
        if (c0592b.f1940d == null) {
            c0592b.f1940d = new Paint();
        }
        c0592b.f1940d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, c0592b.f1940d);
        }
        m1460a(view);
    }

    private boolean m1456a() {
        if (!this.f1960t) {
            if (!m1457a(0.0f)) {
                return false;
            }
        }
        this.f1947f = false;
        return true;
    }

    private boolean m1457a(float f) {
        if (!this.f1954n) {
            return false;
        }
        int width;
        C0592b c0592b = (C0592b) this.f1942a.getLayoutParams();
        if (m1458b()) {
            width = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + c0592b.rightMargin)) + (f * ((float) this.f1944c))) + ((float) this.f1942a.getWidth())));
        } else {
            width = (int) (((float) (getPaddingLeft() + c0592b.leftMargin)) + (f * ((float) this.f1944c)));
        }
        if (!this.f1946e.m1565a(this.f1942a, width, this.f1942a.getTop())) {
            return false;
        }
        width = getChildCount();
        for (int i = 0; i < width; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
        C0571r.m1361e(this);
        return true;
    }

    private boolean m1458b() {
        return C0571r.m1369h(this) == 1;
    }

    private boolean m1459b(View view) {
        if (view == null) {
            return false;
        }
        return this.f1954n && ((C0592b) view.getLayoutParams()).f1939c && this.f1943b > 0.0f;
    }

    final void m1460a(View view) {
        f1941h.mo415a(this, view);
    }

    protected final boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0592b) && super.checkLayoutParams(layoutParams);
    }

    public final void computeScroll() {
        if (this.f1946e.m1570c()) {
            if (this.f1954n) {
                C0571r.m1361e(this);
            } else {
                this.f1946e.m1567b();
            }
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = m1458b() ? this.f1952l : this.f1951k;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int right;
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m1458b()) {
                right = childAt.getRight();
                intrinsicWidth += right;
            } else {
                right = childAt.getLeft();
                int i = right - intrinsicWidth;
                intrinsicWidth = right;
                right = i;
            }
            drawable.setBounds(right, top, intrinsicWidth, bottom);
            drawable.draw(canvas);
        }
    }

    protected final boolean drawChild(Canvas canvas, View view, long j) {
        C0592b c0592b = (C0592b) view.getLayoutParams();
        int save = canvas.save(2);
        if (!(!this.f1954n || c0592b.f1938b || this.f1942a == null)) {
            canvas.getClipBounds(this.f1961u);
            if (m1458b()) {
                this.f1961u.left = Math.max(this.f1961u.left, this.f1942a.getRight());
            } else {
                this.f1961u.right = Math.min(this.f1961u.right, this.f1942a.getLeft());
            }
            canvas.clipRect(this.f1961u);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    protected final LayoutParams generateDefaultLayoutParams() {
        return new C0592b();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0592b(getContext(), attributeSet);
    }

    protected final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0592b((MarginLayoutParams) layoutParams) : new C0592b(layoutParams);
    }

    public final int getCoveredFadeColor() {
        return this.f1950j;
    }

    public final int getParallaxDistance() {
        return this.f1956p;
    }

    public final int getSliderFadeColor() {
        return this.f1949i;
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1960t = true;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1960t = true;
        int size = this.f1948g.size();
        for (int i = 0; i < size; i++) {
            ((C0591a) this.f1948g.get(i)).run();
        }
        this.f1948g.clear();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f1954n && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f1947f = C0634p.m1555b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY()) ^ true;
            }
        }
        if (this.f1954n) {
            if (!this.f1945d || actionMasked == 0) {
                if (actionMasked != 3) {
                    if (actionMasked != 1) {
                        boolean z;
                        float x;
                        float y;
                        if (actionMasked == 0) {
                            this.f1945d = false;
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            this.f1957q = x;
                            this.f1958r = y;
                            if (C0634p.m1555b(this.f1942a, (int) x, (int) y) && m1459b(this.f1942a)) {
                                z = true;
                                return this.f1946e.m1564a(motionEvent) || z;
                            }
                        } else if (actionMasked == 2) {
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            x = Math.abs(x - this.f1957q);
                            y = Math.abs(y - this.f1958r);
                            if (x > ((float) this.f1946e.f2062b) && y > x) {
                                this.f1946e.m1560a();
                                this.f1945d = true;
                                return false;
                            }
                        }
                        z = false;
                        if (this.f1946e.m1564a(motionEvent)) {
                            return true;
                        }
                    }
                }
                this.f1946e.m1560a();
                return false;
            }
        }
        this.f1946e.m1560a();
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int min;
        SlidingPaneLayout slidingPaneLayout = this;
        boolean b = m1458b();
        if (b) {
            slidingPaneLayout.f1946e.f2069i = 2;
        } else {
            slidingPaneLayout.f1946e.f2069i = 1;
        }
        int i6 = i3 - i;
        int paddingRight = b ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = b ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (slidingPaneLayout.f1960t) {
            float f = (slidingPaneLayout.f1954n && slidingPaneLayout.f1947f) ? BallPulseIndicator.SCALE : 0.0f;
            slidingPaneLayout.f1943b = f;
        }
        int i7 = paddingRight;
        int i8 = i7;
        paddingRight = 0;
        while (true) {
            int i9 = 8;
            if (paddingRight >= childCount) {
                break;
            }
            View childAt = getChildAt(paddingRight);
            if (childAt.getVisibility() != 8) {
                int i10;
                C0592b c0592b = (C0592b) childAt.getLayoutParams();
                measuredWidth = childAt.getMeasuredWidth();
                if (c0592b.f1938b) {
                    i5 = i6 - paddingLeft;
                    min = (Math.min(i7, i5 - slidingPaneLayout.f1953m) - i8) - (c0592b.leftMargin + c0592b.rightMargin);
                    slidingPaneLayout.f1944c = min;
                    i10 = b ? c0592b.rightMargin : c0592b.leftMargin;
                    c0592b.f1939c = ((i8 + i10) + min) + (measuredWidth / 2) > i5;
                    i5 = (int) (((float) min) * slidingPaneLayout.f1943b);
                    i10 = (i10 + i5) + i8;
                    slidingPaneLayout.f1943b = ((float) i5) / ((float) slidingPaneLayout.f1944c);
                    i5 = 0;
                } else {
                    i5 = (!slidingPaneLayout.f1954n || slidingPaneLayout.f1956p == 0) ? 0 : (int) ((BallPulseIndicator.SCALE - slidingPaneLayout.f1943b) * ((float) slidingPaneLayout.f1956p));
                    i10 = i7;
                }
                if (b) {
                    min = (i6 - i10) + i5;
                    i5 = min - measuredWidth;
                } else {
                    i5 = i10 - i5;
                    min = i5 + measuredWidth;
                }
                childAt.layout(i5, paddingTop, min, childAt.getMeasuredHeight() + paddingTop);
                i7 += childAt.getWidth();
                i8 = i10;
            }
            paddingRight++;
        }
        if (slidingPaneLayout.f1960t) {
            boolean b2;
            int i11;
            int bottom;
            View view;
            boolean z2;
            if (slidingPaneLayout.f1954n) {
                if (slidingPaneLayout.f1956p != 0) {
                    Object obj;
                    View childAt2;
                    float f2 = slidingPaneLayout.f1943b;
                    b2 = m1458b();
                    C0592b c0592b2 = (C0592b) slidingPaneLayout.f1942a.getLayoutParams();
                    if (c0592b2.f1939c) {
                        if ((b2 ? c0592b2.rightMargin : c0592b2.leftMargin) <= 0) {
                            obj = 1;
                            paddingRight = getChildCount();
                            for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                                childAt2 = getChildAt(paddingLeft);
                                if (childAt2 != slidingPaneLayout.f1942a) {
                                    childCount = (int) ((BallPulseIndicator.SCALE - slidingPaneLayout.f1955o) * ((float) slidingPaneLayout.f1956p));
                                    slidingPaneLayout.f1955o = f2;
                                    childCount -= (int) ((BallPulseIndicator.SCALE - f2) * ((float) slidingPaneLayout.f1956p));
                                    if (b2) {
                                        childCount = -childCount;
                                    }
                                    childAt2.offsetLeftAndRight(childCount);
                                    if (obj != null) {
                                        m1455a(childAt2, b2 ? slidingPaneLayout.f1955o - BallPulseIndicator.SCALE : BallPulseIndicator.SCALE - slidingPaneLayout.f1955o, slidingPaneLayout.f1950j);
                                    }
                                }
                            }
                        }
                    }
                    obj = null;
                    paddingRight = getChildCount();
                    for (paddingLeft = 0; paddingLeft < paddingRight; paddingLeft++) {
                        childAt2 = getChildAt(paddingLeft);
                        if (childAt2 != slidingPaneLayout.f1942a) {
                            childCount = (int) ((BallPulseIndicator.SCALE - slidingPaneLayout.f1955o) * ((float) slidingPaneLayout.f1956p));
                            slidingPaneLayout.f1955o = f2;
                            childCount -= (int) ((BallPulseIndicator.SCALE - f2) * ((float) slidingPaneLayout.f1956p));
                            if (b2) {
                                childCount = -childCount;
                            }
                            childAt2.offsetLeftAndRight(childCount);
                            if (obj != null) {
                                if (b2) {
                                }
                                m1455a(childAt2, b2 ? slidingPaneLayout.f1955o - BallPulseIndicator.SCALE : BallPulseIndicator.SCALE - slidingPaneLayout.f1955o, slidingPaneLayout.f1950j);
                            }
                        }
                    }
                }
                if (((C0592b) slidingPaneLayout.f1942a.getLayoutParams()).f1939c) {
                    m1455a(slidingPaneLayout.f1942a, slidingPaneLayout.f1943b, slidingPaneLayout.f1949i);
                }
            } else {
                for (i11 = 0; i11 < childCount; i11++) {
                    m1455a(getChildAt(i11), 0.0f, slidingPaneLayout.f1949i);
                }
            }
            View view2 = slidingPaneLayout.f1942a;
            b2 = m1458b();
            i6 = b2 ? getWidth() - getPaddingRight() : getPaddingLeft();
            paddingRight = b2 ? getPaddingLeft() : getWidth() - getPaddingRight();
            paddingLeft = getPaddingTop();
            paddingTop = getHeight() - getPaddingBottom();
            if (view2 != null) {
                Object obj2;
                if (!view2.isOpaque()) {
                    if (VERSION.SDK_INT < 18) {
                        Drawable background = view2.getBackground();
                        if (background != null && background.getOpacity() == -1) {
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                        i5 = view2.getLeft();
                        childCount = view2.getRight();
                        min = view2.getTop();
                        bottom = view2.getBottom();
                        i7 = getChildCount();
                        i8 = 0;
                        while (i8 < i7) {
                            childAt = getChildAt(i8);
                            if (childAt != view2) {
                                break;
                            }
                            if (childAt.getVisibility() != i9) {
                                i9 = Math.max(b2 ? paddingRight : i6, childAt.getLeft());
                                measuredWidth = Math.max(paddingLeft, childAt.getTop());
                                if (b2) {
                                    view = view2;
                                    z2 = b2;
                                    i11 = i6;
                                } else {
                                    view = view2;
                                    z2 = b2;
                                    i11 = paddingRight;
                                }
                                i11 = (i9 >= i5 || measuredWidth < min || Math.min(i11, childAt.getRight()) > childCount || Math.min(paddingTop, childAt.getBottom()) > bottom) ? 0 : 4;
                                childAt.setVisibility(i11);
                            } else {
                                view = view2;
                                z2 = b2;
                            }
                            i8++;
                            view2 = view;
                            b2 = z2;
                            i9 = 8;
                        }
                    }
                }
                obj2 = 1;
                if (obj2 != null) {
                    i5 = view2.getLeft();
                    childCount = view2.getRight();
                    min = view2.getTop();
                    bottom = view2.getBottom();
                    i7 = getChildCount();
                    i8 = 0;
                    while (i8 < i7) {
                        childAt = getChildAt(i8);
                        if (childAt != view2) {
                            break;
                        }
                        if (childAt.getVisibility() != i9) {
                            view = view2;
                            z2 = b2;
                        } else {
                            if (b2) {
                            }
                            i9 = Math.max(b2 ? paddingRight : i6, childAt.getLeft());
                            measuredWidth = Math.max(paddingLeft, childAt.getTop());
                            if (b2) {
                                view = view2;
                                z2 = b2;
                                i11 = paddingRight;
                            } else {
                                view = view2;
                                z2 = b2;
                                i11 = i6;
                            }
                            if (i9 >= i5) {
                            }
                            childAt.setVisibility(i11);
                        }
                        i8++;
                        view2 = view;
                        b2 = z2;
                        i9 = 8;
                    }
                }
            }
            childCount = 0;
            i5 = 0;
            min = 0;
            bottom = 0;
            i7 = getChildCount();
            i8 = 0;
            while (i8 < i7) {
                childAt = getChildAt(i8);
                if (childAt != view2) {
                    break;
                }
                if (childAt.getVisibility() != i9) {
                    if (b2) {
                    }
                    i9 = Math.max(b2 ? paddingRight : i6, childAt.getLeft());
                    measuredWidth = Math.max(paddingLeft, childAt.getTop());
                    if (b2) {
                        view = view2;
                        z2 = b2;
                        i11 = i6;
                    } else {
                        view = view2;
                        z2 = b2;
                        i11 = paddingRight;
                    }
                    if (i9 >= i5) {
                    }
                    childAt.setVisibility(i11);
                } else {
                    view = view2;
                    z2 = b2;
                }
                i8++;
                view2 = view;
                b2 = z2;
                i9 = 8;
            }
        }
        slidingPaneLayout.f1960t = false;
    }

    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        SlidingPaneLayout slidingPaneLayout = this;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = IjkMediaCodecInfo.RANK_SECURE;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                size2 = IjkMediaCodecInfo.RANK_SECURE;
                mode2 = Integer.MIN_VALUE;
            }
        }
        boolean z = false;
        if (mode2 != Integer.MIN_VALUE) {
            size2 = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = size2;
        } else {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            size2 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        slidingPaneLayout.f1942a = null;
        boolean z2 = false;
        int i5 = size2;
        int i6 = paddingLeft;
        float f = 0.0f;
        size2 = z2;
        while (true) {
            int i7 = 8;
            if (size2 >= childCount) {
                break;
            }
            View childAt = getChildAt(size2);
            C0592b c0592b = (C0592b) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                c0592b.f1939c = z;
            } else {
                if (c0592b.f1937a > 0.0f) {
                    f += c0592b.f1937a;
                    if (c0592b.width == 0) {
                    }
                }
                i4 = c0592b.leftMargin + c0592b.rightMargin;
                if (c0592b.width == -2) {
                    mode = MeasureSpec.makeMeasureSpec(paddingLeft - i4, Integer.MIN_VALUE);
                } else {
                    if (c0592b.width == -1) {
                        mode = paddingLeft - i4;
                        i4 = 1073741824;
                    } else {
                        i4 = 1073741824;
                        mode = c0592b.width;
                    }
                    mode = MeasureSpec.makeMeasureSpec(mode, i4);
                }
                if (c0592b.height == -2) {
                    i4 = Integer.MIN_VALUE;
                } else if (c0592b.height == -1) {
                    i4 = 1073741824;
                } else {
                    i7 = MeasureSpec.makeMeasureSpec(c0592b.height, 1073741824);
                    childAt.measure(mode, i7);
                    mode = childAt.getMeasuredWidth();
                    i4 = childAt.getMeasuredHeight();
                    if (mode2 == Integer.MIN_VALUE && i4 > i5) {
                        i5 = Math.min(i4, i3);
                    }
                    i6 -= mode;
                    z = i6 >= 0;
                    c0592b.f1938b = z;
                    z |= z2;
                    if (c0592b.f1938b) {
                        slidingPaneLayout.f1942a = childAt;
                    }
                    z2 = z;
                }
                i7 = MeasureSpec.makeMeasureSpec(i3, i4);
                childAt.measure(mode, i7);
                mode = childAt.getMeasuredWidth();
                i4 = childAt.getMeasuredHeight();
                i5 = Math.min(i4, i3);
                i6 -= mode;
                if (i6 >= 0) {
                }
                c0592b.f1938b = z;
                z |= z2;
                if (c0592b.f1938b) {
                    slidingPaneLayout.f1942a = childAt;
                }
                z2 = z;
            }
            size2++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            mode = paddingLeft - slidingPaneLayout.f1953m;
            mode2 = 0;
            while (mode2 < childCount) {
                int i8;
                View childAt2 = getChildAt(mode2);
                if (childAt2.getVisibility() != i7) {
                    C0592b c0592b2 = (C0592b) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i7) {
                        Object obj = (c0592b2.width != 0 || c0592b2.f1937a <= 0.0f) ? null : 1;
                        i4 = obj != null ? 0 : childAt2.getMeasuredWidth();
                        int i9;
                        int i10;
                        if (!z2 || childAt2 == slidingPaneLayout.f1942a) {
                            if (c0592b2.f1937a > 0.0f) {
                                int makeMeasureSpec;
                                if (c0592b2.width != 0) {
                                    i9 = 1073741824;
                                    i7 = childAt2.getMeasuredHeight();
                                } else if (c0592b2.height == -2) {
                                    i7 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    if (z2) {
                                        i10 = paddingLeft - (c0592b2.leftMargin + c0592b2.rightMargin);
                                        i8 = mode;
                                        mode = MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                        if (i4 != i10) {
                                            childAt2.measure(mode, i7);
                                        }
                                        mode2++;
                                        mode = i8;
                                        i7 = 8;
                                    } else {
                                        i8 = mode;
                                        childAt2.measure(MeasureSpec.makeMeasureSpec(i4 + ((int) ((c0592b2.f1937a * ((float) Math.max(0, i6))) / f)), 1073741824), i7);
                                        mode2++;
                                        mode = i8;
                                        i7 = 8;
                                    }
                                } else if (c0592b2.height == -1) {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                    i7 = makeMeasureSpec;
                                    if (z2) {
                                        i8 = mode;
                                        childAt2.measure(MeasureSpec.makeMeasureSpec(i4 + ((int) ((c0592b2.f1937a * ((float) Math.max(0, i6))) / f)), 1073741824), i7);
                                        mode2++;
                                        mode = i8;
                                        i7 = 8;
                                    } else {
                                        i10 = paddingLeft - (c0592b2.leftMargin + c0592b2.rightMargin);
                                        i8 = mode;
                                        mode = MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                        if (i4 != i10) {
                                            childAt2.measure(mode, i7);
                                        }
                                        mode2++;
                                        mode = i8;
                                        i7 = 8;
                                    }
                                } else {
                                    i9 = 1073741824;
                                    i7 = c0592b2.height;
                                }
                                makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, i9);
                                i7 = makeMeasureSpec;
                                if (z2) {
                                    i10 = paddingLeft - (c0592b2.leftMargin + c0592b2.rightMargin);
                                    i8 = mode;
                                    mode = MeasureSpec.makeMeasureSpec(i10, 1073741824);
                                    if (i4 != i10) {
                                        childAt2.measure(mode, i7);
                                    }
                                    mode2++;
                                    mode = i8;
                                    i7 = 8;
                                } else {
                                    i8 = mode;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i4 + ((int) ((c0592b2.f1937a * ((float) Math.max(0, i6))) / f)), 1073741824), i7);
                                    mode2++;
                                    mode = i8;
                                    i7 = 8;
                                }
                            }
                        } else if (c0592b2.width < 0 && (i4 > mode || c0592b2.f1937a > 0.0f)) {
                            if (obj != null) {
                                if (c0592b2.height == -2) {
                                    i10 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i9 = 1073741824;
                                } else if (c0592b2.height == -1) {
                                    i9 = 1073741824;
                                    i10 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i9 = 1073741824;
                                    i10 = c0592b2.height;
                                }
                                childAt2.measure(MeasureSpec.makeMeasureSpec(mode, i9), i10);
                            } else {
                                i9 = 1073741824;
                                i10 = childAt2.getMeasuredHeight();
                            }
                            i10 = MeasureSpec.makeMeasureSpec(i10, i9);
                            childAt2.measure(MeasureSpec.makeMeasureSpec(mode, i9), i10);
                        }
                    }
                }
                i8 = mode;
                mode2++;
                mode = i8;
                i7 = 8;
            }
        }
        setMeasuredDimension(size, (i5 + getPaddingTop()) + getPaddingBottom());
        slidingPaneLayout.f1954n = z2;
        if (slidingPaneLayout.f1946e.f2061a != 0 && !z2) {
            slidingPaneLayout.f1946e.m1567b();
        }
    }

    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (!savedState.f13455a) {
                m1456a();
            } else if (this.f1960t || m1457a((float) BallPulseIndicator.SCALE)) {
                this.f1947f = true;
            }
            this.f1947f = savedState.f13455a;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected final Parcelable onSaveInstanceState() {
        boolean z;
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (this.f1954n) {
            if (this.f1954n) {
                if (this.f1943b != BallPulseIndicator.SCALE) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = this.f1947f;
        }
        savedState.f13455a = z;
        return savedState;
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1960t = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1954n) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1946e.m1569b(motionEvent);
        float x;
        float y;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                y = motionEvent.getY();
                this.f1957q = x;
                this.f1958r = y;
                break;
            case 1:
                if (m1459b(this.f1942a)) {
                    x = motionEvent.getX();
                    y = motionEvent.getY();
                    float f = x - this.f1957q;
                    float f2 = y - this.f1958r;
                    int i = this.f1946e.f2062b;
                    if ((f * f) + (f2 * f2) < ((float) (i * i)) && C0634p.m1555b(this.f1942a, (int) x, (int) y)) {
                        m1456a();
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f1954n) {
            this.f1947f = view == this.f1942a;
        }
    }

    public final void setCoveredFadeColor(int i) {
        this.f1950j = i;
    }

    public final void setPanelSlideListener(C0593c c0593c) {
        this.f1959s = c0593c;
    }

    public final void setParallaxDistance(int i) {
        this.f1956p = i;
        requestLayout();
    }

    @Deprecated
    public final void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public final void setShadowDrawableLeft(Drawable drawable) {
        this.f1951k = drawable;
    }

    public final void setShadowDrawableRight(Drawable drawable) {
        this.f1952l = drawable;
    }

    @Deprecated
    public final void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public final void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0346c.m682a(getContext(), i));
    }

    public final void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0346c.m682a(getContext(), i));
    }

    public final void setSliderFadeColor(int i) {
        this.f1949i = i;
    }
}
