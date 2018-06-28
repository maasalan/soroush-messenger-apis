package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0561i;
import android.support.v4.view.C0562j;
import android.support.v4.view.C0563l;
import android.support.v4.view.C0567p;
import android.support.v4.view.C0571r;
import android.support.v4.view.C4841h;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0546f;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public class NestedScrollView extends FrameLayout implements C4841h, C0562j, C0567p {
    private static final C4851a f17419w = new C4851a();
    private static final int[] f17420x = new int[]{16843130};
    private float f17421A;
    private C0589b f17422B;
    private long f17423a;
    private final Rect f17424b;
    private OverScroller f17425c;
    private EdgeEffect f17426d;
    private EdgeEffect f17427e;
    private int f17428f;
    private boolean f17429g;
    private boolean f17430h;
    private View f17431i;
    private boolean f17432j;
    private VelocityTracker f17433k;
    private boolean f17434l;
    private boolean f17435m;
    private int f17436n;
    private int f17437o;
    private int f17438p;
    private int f17439q;
    private final int[] f17440r;
    private final int[] f17441s;
    private int f17442t;
    private int f17443u;
    private SavedState f17444v;
    private final C0563l f17445y;
    private final C0561i f17446z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C05881();
        public int f1933a;

        static class C05881 implements Creator<SavedState> {
            C05881() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1933a = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.f1933a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1933a);
        }
    }

    public interface C0589b {
        void mo440a(NestedScrollView nestedScrollView, int i);
    }

    static class C4851a extends C0547a {
        C4851a() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0546f.m1219a(accessibilityEvent, nestedScrollView.getScrollX());
            C0546f.m1220b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0536b.m1195a(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0536b.m1202d(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0536b.m1192a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0536b.m1192a((int) ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                    }
                }
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
                i = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m15061a(i);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                i = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m15061a(i);
                return true;
            }
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17424b = new Rect();
        this.f17429g = true;
        this.f17430h = false;
        this.f17431i = null;
        this.f17432j = false;
        this.f17435m = true;
        this.f17439q = -1;
        this.f17440r = new int[2];
        this.f17441s = new int[2];
        this.f17425c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f17436n = viewConfiguration.getScaledTouchSlop();
        this.f17437o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17438p = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f17420x, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f17445y = new C0563l(this);
        this.f17446z = new C0561i(this);
        setNestedScrollingEnabled(true);
        C0571r.m1340a((View) this, f17419w);
    }

    private int m15038a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom <= i2 || rect.top <= scrollY) {
            if (rect.top < scrollY && rect.bottom < i2) {
                i = Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
            }
            return i;
        }
        return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
    }

    private void m15039a() {
        if (this.f17433k == null) {
            this.f17433k = VelocityTracker.obtain();
        }
    }

    private void m15040a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f17423a > 250) {
                i = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f17425c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, i)) - scrollY);
                C0571r.m1361e(this);
            } else {
                if (!this.f17425c.isFinished()) {
                    this.f17425c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f17423a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private void m15041a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17439q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f17428f = (int) motionEvent.getY(actionIndex);
            this.f17439q = motionEvent.getPointerId(actionIndex);
            if (this.f17433k != null) {
                this.f17433k.clear();
            }
        }
    }

    private boolean m15042a(int i, int i2, int i3) {
        boolean z;
        View view = this;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        Object obj = i4 == 33 ? 1 : null;
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        Object obj2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            View view3 = (View) focusables.get(i7);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i5 < bottom && top < i6) {
                Object obj3 = (i5 >= top || bottom >= i6) ? null : 1;
                if (view2 == null) {
                    view2 = view3;
                    obj2 = obj3;
                } else {
                    Object obj4 = ((obj == null || top >= view2.getTop()) && (obj != null || bottom <= view2.getBottom())) ? null : 1;
                    if (obj2 != null) {
                        if (!(obj3 == null || obj4 == null)) {
                        }
                    } else if (obj3 != null) {
                        view2 = view3;
                        obj2 = 1;
                    } else if (obj4 == null) {
                    }
                    view2 = view3;
                }
            }
        }
        if (view2 == null) {
            view2 = view;
        }
        if (i5 < scrollY || i6 > height) {
            m15059g(obj != null ? i5 - scrollY : i6 - height);
            z = true;
        } else {
            z = false;
        }
        if (view2 != findFocus()) {
            view2.requestFocus(i4);
        }
        return z;
    }

    private boolean m15043a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        i2 += 0;
        i += i3;
        i3 = 0 + i4;
        if (i2 <= 0) {
            if (i2 >= 0) {
                z = false;
                if (i > i3) {
                    z2 = true;
                } else if (i >= 0) {
                    z2 = true;
                    i3 = 0;
                } else {
                    i3 = i;
                    z2 = false;
                }
                if (z2 && !m15056d(1)) {
                    this.f17425c.springBack(i2, i3, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i2, i3, z, z2);
                return z || z2;
            }
        }
        z = true;
        i2 = 0;
        if (i > i3) {
            z2 = true;
        } else if (i >= 0) {
            i3 = i;
            z2 = false;
        } else {
            z2 = true;
            i3 = 0;
        }
        this.f17425c.springBack(i2, i3, 0, 0, 0, getScrollRange());
        onOverScrolled(i2, i3, z, z2);
        if (z) {
            return true;
        }
    }

    private boolean m15044a(int i, int i2, int[] iArr, int i3) {
        return this.f17446z.m1251a(0, i, 0, i2, iArr, i3);
    }

    private boolean m15045a(int i, int[] iArr, int[] iArr2, int i2) {
        return this.f17446z.m1253a(0, i, iArr, iArr2, i2);
    }

    private boolean m15046a(View view) {
        return !m15047a(view, 0, getHeight());
    }

    private boolean m15047a(View view, int i, int i2) {
        view.getDrawingRect(this.f17424b);
        offsetDescendantRectToMyCoords(view, this.f17424b);
        return this.f17424b.bottom + i >= getScrollY() && this.f17424b.top - i <= getScrollY() + i2;
    }

    private static boolean m15048a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m15048a((View) parent, view2);
    }

    private static int m15049b(int i, int i2, int i3) {
        if (i2 < i3) {
            if (i >= 0) {
                return i2 + i > i3 ? i3 - i2 : i;
            }
        }
        return 0;
    }

    private void m15050b() {
        if (this.f17433k != null) {
            this.f17433k.recycle();
            this.f17433k = null;
        }
    }

    private void m15051b(View view) {
        view.getDrawingRect(this.f17424b);
        offsetDescendantRectToMyCoords(view, this.f17424b);
        int a = m15038a(this.f17424b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    private boolean m15052b(int i) {
        return this.f17446z.m1249a(2, i);
    }

    private void m15053c() {
        this.f17432j = false;
        m15050b();
        m15054c(0);
        if (this.f17426d != null) {
            this.f17426d.onRelease();
            this.f17427e.onRelease();
        }
    }

    private void m15054c(int i) {
        this.f17446z.m1254b(i);
    }

    private void m15055d() {
        if (getOverScrollMode() == 2) {
            this.f17426d = null;
            this.f17427e = null;
        } else if (this.f17426d == null) {
            Context context = getContext();
            this.f17426d = new EdgeEffect(context);
            this.f17427e = new EdgeEffect(context);
        }
    }

    private boolean m15056d(int i) {
        return this.f17446z.m1248a(i);
    }

    private boolean m15057e(int i) {
        int i2 = i == 130 ? 1 : 0;
        int height = getHeight();
        this.f17424b.top = 0;
        this.f17424b.bottom = height;
        if (i2 != 0) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f17424b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.f17424b.top = this.f17424b.bottom - height;
            }
        }
        return m15042a(i, this.f17424b.top, this.f17424b.bottom);
    }

    private boolean m15058f(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m15047a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m15059g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f17424b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f17424b);
            m15059g(m15038a(this.f17424b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m15046a(findFocus)) {
            i = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    private void m15059g(int i) {
        if (i != 0) {
            if (this.f17435m) {
                m15040a(0, i);
                return;
            }
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f17421A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f17421A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f17421A;
    }

    private void m15060h(int i) {
        boolean z;
        float f;
        int scrollY = getScrollY();
        if (scrollY > 0 || i > 0) {
            if (scrollY >= getScrollRange()) {
                if (i < 0) {
                }
            }
            z = true;
            f = (float) i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, z);
                if (getChildCount() > 0) {
                    m15052b(1);
                    this.f17425c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 0);
                    this.f17443u = getScrollY();
                    C0571r.m1361e(this);
                }
            }
        }
        z = false;
        f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            if (getChildCount() > 0) {
                m15052b(1);
                this.f17425c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 0);
                this.f17443u = getScrollY();
                C0571r.m1361e(this);
            }
        }
    }

    public final void m15061a(int i) {
        m15040a(0 - getScrollX(), i - getScrollY());
    }

    public final boolean m15062a(KeyEvent keyEvent) {
        boolean z;
        View findFocus;
        int keyCode;
        int i;
        boolean z2;
        int childCount;
        this.f17424b.setEmpty();
        View childAt = getChildAt(0);
        if (childAt != null) {
            if (getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom()) {
                z = true;
                if (z) {
                    if (isFocused() && keyEvent.getKeyCode() != 4) {
                        findFocus = findFocus();
                        if (findFocus == this) {
                            findFocus = null;
                        }
                        findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                        return findFocus == null && findFocus != this && findFocus.requestFocus(130);
                    }
                }
                if (keyEvent.getAction() == 0) {
                    keyCode = keyEvent.getKeyCode();
                    i = 33;
                    if (keyCode == 62) {
                        switch (keyCode) {
                            case 19:
                                return keyEvent.isAltPressed() ? m15058f(33) : m15057e(33);
                            case 20:
                                return keyEvent.isAltPressed() ? m15058f(130) : m15057e(130);
                            default:
                                return false;
                        }
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 130;
                    }
                    z2 = i != 130;
                    keyCode = getHeight();
                    if (z2) {
                        this.f17424b.top = getScrollY() - keyCode;
                        if (this.f17424b.top < 0) {
                            this.f17424b.top = 0;
                        }
                    } else {
                        this.f17424b.top = getScrollY() + keyCode;
                        childCount = getChildCount();
                        if (childCount > 0) {
                            findFocus = getChildAt(childCount - 1);
                            if (this.f17424b.top + keyCode > findFocus.getBottom()) {
                                this.f17424b.top = findFocus.getBottom() - keyCode;
                            }
                        }
                    }
                    this.f17424b.bottom = this.f17424b.top + keyCode;
                    m15042a(i, this.f17424b.top, this.f17424b.bottom);
                }
                return false;
            }
        }
        z = false;
        if (z) {
            if (keyEvent.getAction() == 0) {
                keyCode = keyEvent.getKeyCode();
                i = 33;
                if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i = 130;
                    }
                    if (i != 130) {
                    }
                    keyCode = getHeight();
                    if (z2) {
                        this.f17424b.top = getScrollY() - keyCode;
                        if (this.f17424b.top < 0) {
                            this.f17424b.top = 0;
                        }
                    } else {
                        this.f17424b.top = getScrollY() + keyCode;
                        childCount = getChildCount();
                        if (childCount > 0) {
                            findFocus = getChildAt(childCount - 1);
                            if (this.f17424b.top + keyCode > findFocus.getBottom()) {
                                this.f17424b.top = findFocus.getBottom() - keyCode;
                            }
                        }
                    }
                    this.f17424b.bottom = this.f17424b.top + keyCode;
                    m15042a(i, this.f17424b.top, this.f17424b.bottom);
                } else {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed()) {
                            }
                        case 20:
                            if (keyEvent.isAltPressed()) {
                            }
                        default:
                            return false;
                    }
                }
            }
            return false;
        }
        findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        if (findFocus == null) {
        }
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        int i = 0;
        if (this.f17425c.computeScrollOffset()) {
            this.f17425c.getCurrX();
            int currY = this.f17425c.getCurrY();
            int i2 = currY - this.f17443u;
            if (m15045a(i2, this.f17441s, null, 1)) {
                i2 -= this.f17441s[1];
            }
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                m15043a(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                if (!m15044a(scrollY2, i2 - scrollY2, null, 1)) {
                    i2 = getOverScrollMode();
                    if (i2 == 0 || (i2 == 1 && scrollRange > 0)) {
                        i = 1;
                    }
                    if (i != 0) {
                        EdgeEffect edgeEffect;
                        m15055d();
                        if (currY <= 0 && scrollY > 0) {
                            edgeEffect = this.f17426d;
                        } else if (currY >= scrollRange && scrollY < scrollRange) {
                            edgeEffect = this.f17427e;
                        }
                        edgeEffect.onAbsorb((int) this.f17425c.getCurrVelocity());
                    }
                }
            }
            this.f17443u = currY;
            C0571r.m1361e(this);
            return;
        }
        if (m15056d(1)) {
            m15054c(1);
        }
        this.f17443u = 0;
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (!m15062a(keyEvent)) {
                return false;
            }
        }
        return true;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f17446z.m1247a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f17446z.m1246a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f17446z.m1252a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f17446z.m1250a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f17426d != null) {
            int save;
            int width;
            int scrollY = getScrollY();
            if (!this.f17426d.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f17426d.setSize(width, getHeight());
                if (this.f17426d.draw(canvas)) {
                    C0571r.m1361e(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f17427e.isFinished()) {
                save = canvas.save();
                width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f17427e.setSize(width, height);
                if (this.f17427e.draw(canvas)) {
                    C0571r.m1361e(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : BallPulseIndicator.SCALE;
    }

    public int getMaxScrollAmount() {
        return (int) (0.5f * ((float) getHeight()));
    }

    public int getNestedScrollAxes() {
        return this.f17445y.f1857a;
    }

    int getScrollRange() {
        return getChildCount() > 0 ? Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop())) : 0;
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : BallPulseIndicator.SCALE;
    }

    public boolean hasNestedScrollingParent() {
        return this.f17446z.m1248a(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f17446z.f1852a;
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17430h = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.f17432j)) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                verticalScrollFactorCompat = scrollY - verticalScrollFactorCompat;
                if (verticalScrollFactorCompat < 0) {
                    verticalScrollFactorCompat = 0;
                } else if (verticalScrollFactorCompat > scrollRange) {
                    verticalScrollFactorCompat = scrollRange;
                }
                if (verticalScrollFactorCompat != scrollY) {
                    super.scrollTo(getScrollX(), verticalScrollFactorCompat);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f17432j) {
            return true;
        }
        action &= 255;
        if (action != 6) {
            switch (action) {
                case 0:
                    boolean z;
                    action = (int) motionEvent.getY();
                    int x = (int) motionEvent.getX();
                    if (getChildCount() > 0) {
                        int scrollY = getScrollY();
                        View childAt = getChildAt(0);
                        if (action >= childAt.getTop() - scrollY && action < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                            z = true;
                            if (!z) {
                                this.f17428f = action;
                                this.f17439q = motionEvent.getPointerId(0);
                                if (this.f17433k != null) {
                                    this.f17433k = VelocityTracker.obtain();
                                } else {
                                    this.f17433k.clear();
                                }
                                this.f17433k.addMovement(motionEvent);
                                this.f17425c.computeScrollOffset();
                                this.f17432j = this.f17425c.isFinished() ^ true;
                                m15052b(0);
                                break;
                            }
                            this.f17432j = false;
                            m15050b();
                            break;
                        }
                    }
                    z = false;
                    if (!z) {
                        this.f17428f = action;
                        this.f17439q = motionEvent.getPointerId(0);
                        if (this.f17433k != null) {
                            this.f17433k.clear();
                        } else {
                            this.f17433k = VelocityTracker.obtain();
                        }
                        this.f17433k.addMovement(motionEvent);
                        this.f17425c.computeScrollOffset();
                        this.f17432j = this.f17425c.isFinished() ^ true;
                        m15052b(0);
                    } else {
                        this.f17432j = false;
                        m15050b();
                    }
                case 1:
                case 3:
                    this.f17432j = false;
                    this.f17439q = -1;
                    m15050b();
                    if (this.f17425c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C0571r.m1361e(this);
                    }
                    m15054c(0);
                    break;
                case 2:
                    action = this.f17439q;
                    if (action != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(action);
                        if (findPointerIndex != -1) {
                            action = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(action - this.f17428f) > this.f17436n && (2 & getNestedScrollAxes()) == 0) {
                                this.f17432j = true;
                                this.f17428f = action;
                                m15039a();
                                this.f17433k.addMovement(motionEvent);
                                this.f17442t = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder("Invalid pointerId=");
                        stringBuilder.append(action);
                        stringBuilder.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", stringBuilder.toString());
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        m15041a(motionEvent);
        return this.f17432j;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f17429g = false;
        if (this.f17431i != null && m15048a(this.f17431i, (View) this)) {
            m15051b(this.f17431i);
        }
        this.f17431i = null;
        if (!this.f17430h) {
            if (this.f17444v != null) {
                scrollTo(getScrollX(), this.f17444v.f1933a);
                this.f17444v = null;
            }
            i = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > i) {
                scrollTo(getScrollX(), i);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f17430h = true;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f17434l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m15060h((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f17445y.f1857a = i;
        startNestedScroll(2);
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        return (findNextFocus == null || m15046a(findNextFocus)) ? false : findNextFocus.requestFocus(i, rect);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f17444v = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1933a = getScrollY();
        return savedState;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f17422B != null) {
            this.f17422B.mo440a(this, i2);
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (!(findFocus == null || this == findFocus || !m15047a(findFocus, 0, i4))) {
            findFocus.getDrawingRect(this.f17424b);
            offsetDescendantRectToMyCoords(findFocus, this.f17424b);
            m15059g(m15038a(this.f17424b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f17445y.f1857a = 0;
        stopNestedScroll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r13.m15039a();
        r0 = android.view.MotionEvent.obtain(r14);
        r1 = r14.getActionMasked();
        r2 = 0;
        if (r1 != 0) goto L_0x0010;
    L_0x000e:
        r13.f17442t = r2;
    L_0x0010:
        r3 = r13.f17442t;
        r3 = (float) r3;
        r4 = 0;
        r0.offsetLocation(r4, r3);
        r3 = -1;
        r5 = 1;
        switch(r1) {
            case 0: goto L_0x01dd;
            case 1: goto L_0x01a5;
            case 2: goto L_0x006e;
            case 3: goto L_0x0043;
            case 4: goto L_0x001c;
            case 5: goto L_0x0030;
            case 6: goto L_0x001e;
            default: goto L_0x001c;
        };
    L_0x001c:
        goto L_0x0215;
    L_0x001e:
        r13.m15041a(r14);
        r1 = r13.f17439q;
        r1 = r14.findPointerIndex(r1);
        r14 = r14.getY(r1);
        r14 = (int) r14;
        r13.f17428f = r14;
        goto L_0x0215;
    L_0x0030:
        r1 = r14.getActionIndex();
        r2 = r14.getY(r1);
        r2 = (int) r2;
        r13.f17428f = r2;
        r14 = r14.getPointerId(r1);
        r13.f17439q = r14;
        goto L_0x0215;
    L_0x0043:
        r14 = r13.f17432j;
        if (r14 == 0) goto L_0x0067;
    L_0x0047:
        r14 = r13.getChildCount();
        if (r14 <= 0) goto L_0x0067;
    L_0x004d:
        r6 = r13.f17425c;
        r7 = r13.getScrollX();
        r8 = r13.getScrollY();
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = r13.getScrollRange();
        r14 = r6.springBack(r7, r8, r9, r10, r11, r12);
        if (r14 == 0) goto L_0x0067;
    L_0x0064:
        android.support.v4.view.C0571r.m1361e(r13);
    L_0x0067:
        r13.f17439q = r3;
        r13.m15053c();
        goto L_0x0215;
    L_0x006e:
        r1 = r13.f17439q;
        r1 = r14.findPointerIndex(r1);
        if (r1 != r3) goto L_0x0092;
    L_0x0076:
        r14 = "NestedScrollView";
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid pointerId=";
        r1.<init>(r2);
        r2 = r13.f17439q;
        r1.append(r2);
        r2 = " in onTouchEvent";
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.e(r14, r1);
        goto L_0x0215;
    L_0x0092:
        r3 = r14.getY(r1);
        r3 = (int) r3;
        r6 = r13.f17428f;
        r6 = r6 - r3;
        r7 = r13.f17441s;
        r8 = r13.f17440r;
        r7 = r13.m15045a(r6, r7, r8, r2);
        if (r7 == 0) goto L_0x00ba;
    L_0x00a4:
        r7 = r13.f17441s;
        r7 = r7[r5];
        r6 = r6 - r7;
        r7 = r13.f17440r;
        r7 = r7[r5];
        r7 = (float) r7;
        r0.offsetLocation(r4, r7);
        r7 = r13.f17442t;
        r8 = r13.f17440r;
        r8 = r8[r5];
        r7 = r7 + r8;
        r13.f17442t = r7;
    L_0x00ba:
        r7 = r13.f17432j;
        if (r7 != 0) goto L_0x00da;
    L_0x00be:
        r7 = java.lang.Math.abs(r6);
        r8 = r13.f17436n;
        if (r7 <= r8) goto L_0x00da;
    L_0x00c6:
        r7 = r13.getParent();
        if (r7 == 0) goto L_0x00cf;
    L_0x00cc:
        r7.requestDisallowInterceptTouchEvent(r5);
    L_0x00cf:
        r13.f17432j = r5;
        if (r6 <= 0) goto L_0x00d7;
    L_0x00d3:
        r7 = r13.f17436n;
        r6 = r6 - r7;
        goto L_0x00da;
    L_0x00d7:
        r7 = r13.f17436n;
        r6 = r6 + r7;
    L_0x00da:
        r7 = r13.f17432j;
        if (r7 == 0) goto L_0x0215;
    L_0x00de:
        r7 = r13.f17440r;
        r7 = r7[r5];
        r3 = r3 - r7;
        r13.f17428f = r3;
        r3 = r13.getScrollY();
        r7 = r13.getScrollRange();
        r8 = r13.getOverScrollMode();
        if (r8 == 0) goto L_0x00fa;
    L_0x00f3:
        if (r8 != r5) goto L_0x00f8;
    L_0x00f5:
        if (r7 <= 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00fa;
    L_0x00f8:
        r8 = r2;
        goto L_0x00fb;
    L_0x00fa:
        r8 = r5;
    L_0x00fb:
        r9 = r13.getScrollY();
        r9 = r13.m15043a(r6, r2, r9, r7);
        if (r9 == 0) goto L_0x0110;
    L_0x0105:
        r9 = r13.m15056d(r2);
        if (r9 != 0) goto L_0x0110;
    L_0x010b:
        r9 = r13.f17433k;
        r9.clear();
    L_0x0110:
        r9 = r13.getScrollY();
        r9 = r9 - r3;
        r10 = r6 - r9;
        r11 = r13.f17440r;
        r2 = r13.m15044a(r9, r10, r11, r2);
        if (r2 == 0) goto L_0x013b;
    L_0x011f:
        r14 = r13.f17428f;
        r1 = r13.f17440r;
        r1 = r1[r5];
        r14 = r14 - r1;
        r13.f17428f = r14;
        r14 = r13.f17440r;
        r14 = r14[r5];
        r14 = (float) r14;
        r0.offsetLocation(r4, r14);
        r14 = r13.f17442t;
        r1 = r13.f17440r;
        r1 = r1[r5];
        r14 = r14 + r1;
        r13.f17442t = r14;
        goto L_0x0215;
    L_0x013b:
        if (r8 == 0) goto L_0x0215;
    L_0x013d:
        r13.m15055d();
        r3 = r3 + r6;
        if (r3 >= 0) goto L_0x0167;
    L_0x0143:
        r2 = r13.f17426d;
        r3 = (float) r6;
        r4 = r13.getHeight();
        r4 = (float) r4;
        r3 = r3 / r4;
        r14 = r14.getX(r1);
        r1 = r13.getWidth();
        r1 = (float) r1;
        r14 = r14 / r1;
        android.support.v4.widget.C0621g.m1501a(r2, r3, r14);
        r14 = r13.f17427e;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x018d;
    L_0x0161:
        r14 = r13.f17427e;
    L_0x0163:
        r14.onRelease();
        goto L_0x018d;
    L_0x0167:
        if (r3 <= r7) goto L_0x018d;
    L_0x0169:
        r2 = r13.f17427e;
        r3 = (float) r6;
        r4 = r13.getHeight();
        r4 = (float) r4;
        r3 = r3 / r4;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r14 = r14.getX(r1);
        r1 = r13.getWidth();
        r1 = (float) r1;
        r14 = r14 / r1;
        r4 = r4 - r14;
        android.support.v4.widget.C0621g.m1501a(r2, r3, r4);
        r14 = r13.f17426d;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x018d;
    L_0x018a:
        r14 = r13.f17426d;
        goto L_0x0163;
    L_0x018d:
        r14 = r13.f17426d;
        if (r14 == 0) goto L_0x0215;
    L_0x0191:
        r14 = r13.f17426d;
        r14 = r14.isFinished();
        if (r14 == 0) goto L_0x01a1;
    L_0x0199:
        r14 = r13.f17427e;
        r14 = r14.isFinished();
        if (r14 != 0) goto L_0x0215;
    L_0x01a1:
        android.support.v4.view.C0571r.m1361e(r13);
        goto L_0x0215;
    L_0x01a5:
        r14 = r13.f17433k;
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r13.f17438p;
        r2 = (float) r2;
        r14.computeCurrentVelocity(r1, r2);
        r1 = r13.f17439q;
        r14 = r14.getYVelocity(r1);
        r14 = (int) r14;
        r1 = java.lang.Math.abs(r14);
        r2 = r13.f17437o;
        if (r1 <= r2) goto L_0x01c4;
    L_0x01be:
        r14 = -r14;
        r13.m15060h(r14);
        goto L_0x0067;
    L_0x01c4:
        r6 = r13.f17425c;
        r7 = r13.getScrollX();
        r8 = r13.getScrollY();
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = r13.getScrollRange();
        r14 = r6.springBack(r7, r8, r9, r10, r11, r12);
        if (r14 == 0) goto L_0x0067;
    L_0x01db:
        goto L_0x0064;
    L_0x01dd:
        r1 = r13.getChildCount();
        if (r1 != 0) goto L_0x01e4;
    L_0x01e3:
        return r2;
    L_0x01e4:
        r1 = r13.f17425c;
        r1 = r1.isFinished();
        r1 = r1 ^ r5;
        r13.f17432j = r1;
        if (r1 == 0) goto L_0x01f8;
    L_0x01ef:
        r1 = r13.getParent();
        if (r1 == 0) goto L_0x01f8;
    L_0x01f5:
        r1.requestDisallowInterceptTouchEvent(r5);
    L_0x01f8:
        r1 = r13.f17425c;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0205;
    L_0x0200:
        r1 = r13.f17425c;
        r1.abortAnimation();
    L_0x0205:
        r1 = r14.getY();
        r1 = (int) r1;
        r13.f17428f = r1;
        r14 = r14.getPointerId(r2);
        r13.f17439q = r14;
        r13.m15052b(r2);
    L_0x0215:
        r14 = r13.f17433k;
        if (r14 == 0) goto L_0x021e;
    L_0x0219:
        r14 = r13.f17433k;
        r14.addMovement(r0);
    L_0x021e:
        r0.recycle();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f17429g) {
            this.f17431i = view2;
        } else {
            m15051b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int a = m15038a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
                return z2;
            }
            m15040a(0, a);
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m15050b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f17429g = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i = m15049b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            i2 = m15049b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f17434l) {
            this.f17434l = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f17446z.m1245a(z);
    }

    public void setOnScrollChangeListener(C0589b c0589b) {
        this.f17422B = c0589b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f17435m = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f17446z.m1249a(i, 0);
    }

    public void stopNestedScroll() {
        this.f17446z.m1254b(0);
    }
}
