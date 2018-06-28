package mobi.mmdt.ott.view.components.imageslider.Tricks;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.C0511d.C0510a;
import android.support.v4.os.C0512e;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0565n;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0572s;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0546f;
import android.support.v4.widget.C0621g;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class ViewPagerEx extends ViewGroup {
    private static final C3181i ad = new C3181i();
    private static final int[] f9855d = new int[]{16842931};
    private static final Comparator<C3175b> f9856f = new C31711();
    private static final Interpolator f9857g = new C31722();
    private boolean f9858A;
    private boolean f9859B;
    private int f9860C;
    private int f9861D;
    private int f9862E;
    private float f9863F;
    private float f9864G;
    private float f9865H;
    private float f9866I;
    private int f9867J = -1;
    private VelocityTracker f9868K;
    private int f9869L;
    private int f9870M;
    private int f9871N;
    private int f9872O;
    private boolean f9873P;
    private C0621g f9874Q;
    private C0621g f9875R;
    private boolean f9876S = true;
    private boolean f9877T;
    private int f9878U;
    private ArrayList<C3178f> f9879V = new ArrayList();
    private C3178f f9880W;
    public Scroller f9881a;
    private C3177e aa;
    private Method ab;
    private ArrayList<View> ac;
    private final Runnable ae = new C31733(this);
    private int af = 0;
    public C3179g f9882b;
    public int f9883c;
    private int f9884e;
    private final ArrayList<C3175b> f9885h = new ArrayList();
    private final C3175b f9886i = new C3175b();
    private final Rect f9887j = new Rect();
    private C0565n f9888k;
    private int f9889l;
    private int f9890m = -1;
    private Parcelable f9891n = null;
    private ClassLoader f9892o = null;
    private C3180h f9893p;
    private int f9894q;
    private Drawable f9895r;
    private int f9896s;
    private int f9897t;
    private float f9898u = -3.4028235E38f;
    private float f9899v = Float.MAX_VALUE;
    private boolean f9900w;
    private boolean f9901x;
    private boolean f9902y;
    private int f9903z = 1;

    static class C31711 implements Comparator<C3175b> {
        C31711() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C3175b) obj).f9844b - ((C3175b) obj2).f9844b;
        }
    }

    static class C31722 implements Interpolator {
        C31722() {
        }

        public final float getInterpolation(float f) {
            f -= BallPulseIndicator.SCALE;
            return ((((f * f) * f) * f) * f) + BallPulseIndicator.SCALE;
        }
    }

    class C31733 implements Runnable {
        final /* synthetic */ ViewPagerEx f9839a;

        C31733(ViewPagerEx viewPagerEx) {
            this.f9839a = viewPagerEx;
        }

        public final void run() {
            this.f9839a.setScrollState(0);
            this.f9839a.m7684b();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0510a(new C60911());
        int f9840a;
        Parcelable f9841b;
        ClassLoader f9842c;

        static class C60911 implements C0512e<SavedState> {
            C60911() {
            }

            public final /* synthetic */ Object mo2268a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] mo2269a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f9840a = parcel.readInt();
            this.f9841b = parcel.readParcelable(classLoader);
            this.f9842c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.f9840a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f9840a);
            parcel.writeParcelable(this.f9841b, i);
        }
    }

    interface C3174a {
    }

    static class C3175b {
        Object f9843a;
        int f9844b;
        boolean f9845c;
        float f9846d;
        float f9847e;

        C3175b() {
        }
    }

    public static class C3176c extends LayoutParams {
        public boolean f9848a;
        public int f9849b;
        float f9850c = 0.0f;
        boolean f9851d;
        int f9852e;
        int f9853f;

        public C3176c() {
            super(-1, -1);
        }

        public C3176c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPagerEx.f9855d);
            this.f9849b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    interface C3177e {
    }

    public interface C3178f {
        void mo2266a(int i);
    }

    public interface C3179g {
        void mo2274b(View view, float f);
    }

    private class C3180h extends DataSetObserver {
        final /* synthetic */ ViewPagerEx f9854a;

        private C3180h(ViewPagerEx viewPagerEx) {
            this.f9854a = viewPagerEx;
        }

        public final void onChanged() {
            this.f9854a.m7681a();
        }

        public final void onInvalidated() {
            this.f9854a.m7681a();
        }
    }

    static class C3181i implements Comparator<View> {
        C3181i() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C3176c c3176c = (C3176c) ((View) obj).getLayoutParams();
            C3176c c3176c2 = (C3176c) ((View) obj2).getLayoutParams();
            return c3176c.f9848a != c3176c2.f9848a ? c3176c.f9848a ? 1 : -1 : c3176c.f9852e - c3176c2.f9852e;
        }
    }

    class C6092d extends C0547a {
        final /* synthetic */ ViewPagerEx f16352a;

        C6092d(ViewPagerEx viewPagerEx) {
            this.f16352a = viewPagerEx;
        }

        private boolean m13776a() {
            return this.f16352a.f9888k != null && this.f16352a.f9888k.mo2270b() > 1;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPagerEx.class.getName());
            C0546f a = C0546f.m1218a();
            a.f1843a.setScrollable(m13776a());
            if (accessibilityEvent.getEventType() == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT && this.f16352a.f9888k != null) {
                a.f1843a.setItemCount(this.f16352a.f9888k.mo2270b());
                a.f1843a.setFromIndex(this.f16352a.f9889l);
                a.f1843a.setToIndex(this.f16352a.f9889l);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            c0536b.m1195a(ViewPagerEx.class.getName());
            c0536b.m1202d(m13776a());
            if (this.f16352a.canScrollHorizontally(1)) {
                c0536b.m1192a((int) ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (this.f16352a.canScrollHorizontally(-1)) {
                c0536b.m1192a(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPagerEx viewPagerEx;
            if (i != ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
                if (i != 8192 || !this.f16352a.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPagerEx = this.f16352a;
                i = this.f16352a.f9889l - 1;
            } else if (!this.f16352a.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPagerEx = this.f16352a;
                i = this.f16352a.f9889l + 1;
            }
            viewPagerEx.setCurrentItem(i);
            return true;
        }
    }

    public ViewPagerEx(Context context) {
        super(context);
        m7672d();
    }

    public ViewPagerEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7672d();
    }

    private Rect m7652a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewPagerEx parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private C3175b m7653a(int i, int i2) {
        C3175b c3175b = new C3175b();
        c3175b.f9844b = i;
        c3175b.f9843a = this.f9888k.mo208a((ViewGroup) this, i);
        c3175b.f9846d = BallPulseIndicator.SCALE;
        if (i2 >= 0) {
            if (i2 < this.f9885h.size()) {
                this.f9885h.add(i2, c3175b);
                return c3175b;
            }
        }
        this.f9885h.add(c3175b);
        return c3175b;
    }

    private C3175b m7654a(View view) {
        for (int i = 0; i < this.f9885h.size(); i++) {
            C3175b c3175b = (C3175b) this.f9885h.get(i);
            if (this.f9888k.mo213a(view, c3175b.f9843a)) {
                return c3175b;
            }
        }
        return null;
    }

    private void m7655a(int i) {
        Iterator it = this.f9879V.iterator();
        while (it.hasNext()) {
            C3178f c3178f = (C3178f) it.next();
            if (c3178f != null) {
                C6093b c6093b = (C6093b) this.f9888k;
                if (c6093b.m13785e() != 0) {
                    c3178f.mo2266a(i % c6093b.m13785e());
                } else {
                    return;
                }
            }
        }
        if (this.f9880W != null) {
            this.f9880W.mo2266a(i);
        }
    }

    private void m7656a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f9885h.isEmpty()) {
            C3175b c = m7670c(this.f9889l);
            i = (int) ((c != null ? Math.min(c.f9847e, this.f9899v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                m7663a(false);
                scrollTo(i, getScrollY());
            }
            return;
        }
        int scrollX = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        scrollTo(scrollX, getScrollY());
        if (!this.f9881a.isFinished()) {
            this.f9881a.startScroll(scrollX, 0, (int) (m7670c(this.f9889l).f9847e * ((float) i)), 0, this.f9881a.getDuration() - this.f9881a.timePassed());
        }
    }

    private void m7657a(int i, boolean z, int i2, boolean z2) {
        C3175b c = m7670c(i);
        int clientWidth = c != null ? (int) (((float) getClientWidth()) * Math.max(this.f9898u, Math.min(c.f9847e, this.f9899v))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i3 = clientWidth - scrollX;
                int i4 = 0 - scrollY;
                if (i3 == 0 && i4 == 0) {
                    m7663a(false);
                    m7684b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth2 = getClientWidth();
                    clientWidth = clientWidth2 / 2;
                    float f = (float) clientWidth2;
                    float f2 = (float) clientWidth;
                    f2 += ((float) Math.sin((double) ((float) (((double) (Math.min(BallPulseIndicator.SCALE, (((float) Math.abs(i3)) * BallPulseIndicator.SCALE) / f) - 0.5f)) * 0.4712389167638204d)))) * f2;
                    i2 = Math.abs(i2);
                    this.f9881a.startScroll(scrollX, scrollY, i3, i4, Math.min(i2 > 0 ? 4 * Math.round(1000.0f * Math.abs(f2 / ((float) i2))) : (int) (((((float) Math.abs(i3)) / ((f * BallPulseIndicator.SCALE) + ((float) this.f9894q))) + BallPulseIndicator.SCALE) * 100.0f), IjkMediaCodecInfo.RANK_LAST_CHANCE));
                    C0571r.m1361e(this);
                }
            }
            if (z2) {
                m7655a(i);
                return;
            }
        }
        if (z2) {
            m7655a(i);
        }
        m7663a(false);
        scrollTo(clientWidth, 0);
        m7675f();
    }

    private void m7658a(int i, boolean z, boolean z2) {
        m7659a(i, z, z2, 0);
    }

    private void m7659a(int i, boolean z, boolean z2, int i2) {
        if (this.f9888k != null) {
            if (this.f9888k.mo2270b() > 0) {
                if (z2 || this.f9889l != i || this.f9885h.size() == 0) {
                    z2 = true;
                    if (i < 0) {
                        i = 0;
                    } else if (i >= this.f9888k.mo2270b()) {
                        i = this.f9888k.mo2270b() - 1;
                    }
                    int i3 = this.f9903z;
                    if (i > this.f9889l + i3 || i < this.f9889l - i3) {
                        for (i3 = 0; i3 < this.f9885h.size(); i3++) {
                            ((C3175b) this.f9885h.get(i3)).f9845c = true;
                        }
                    }
                    if (this.f9889l == i) {
                        z2 = false;
                    }
                    if (this.f9876S) {
                        this.f9889l = i;
                        m7655a(i);
                        requestLayout();
                        return;
                    }
                    m7668b(i);
                    m7657a(i, z, i2, z2);
                    return;
                }
                setScrollingCacheEnabled(false);
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    private void m7660a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9867J) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f9863F = motionEvent.getX(actionIndex);
            this.f9867J = motionEvent.getPointerId(actionIndex);
            if (this.f9868K != null) {
                this.f9868K.clear();
            }
        }
    }

    private void m7661a(C3175b c3175b, int i, C3175b c3175b2) {
        int i2;
        int b = this.f9888k.mo2270b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f9894q) / ((float) clientWidth) : 0.0f;
        if (c3175b2 != null) {
            int i3 = c3175b2.f9844b;
            if (i3 < c3175b.f9844b) {
                i2 = 0;
                float f2 = (c3175b2.f9847e + c3175b2.f9846d) + f;
                while (true) {
                    i3++;
                    if (i3 > c3175b.f9844b || r4 >= this.f9885h.size()) {
                        break;
                    }
                    while (true) {
                        c3175b2 = (C3175b) this.f9885h.get(i2);
                        if (i3 <= c3175b2.f9844b || i2 >= this.f9885h.size() - 1) {
                            while (i3 < c3175b2.f9844b) {
                                f2 += BallPulseIndicator.SCALE + f;
                                i3++;
                            }
                        } else {
                            i2++;
                        }
                    }
                    while (i3 < c3175b2.f9844b) {
                        f2 += BallPulseIndicator.SCALE + f;
                        i3++;
                    }
                    c3175b2.f9847e = f2;
                    f2 += c3175b2.f9846d + f;
                }
            } else if (i3 > c3175b.f9844b) {
                i2 = this.f9885h.size() - 1;
                float f3 = c3175b2.f9847e;
                i3--;
                while (i3 >= c3175b.f9844b && r4 >= 0) {
                    C3175b c3175b3;
                    while (true) {
                        c3175b3 = (C3175b) this.f9885h.get(i2);
                        if (i3 >= c3175b3.f9844b || i2 <= 0) {
                            while (i3 > c3175b3.f9844b) {
                                f3 -= BallPulseIndicator.SCALE + f;
                                i3--;
                            }
                        } else {
                            i2--;
                        }
                    }
                    while (i3 > c3175b3.f9844b) {
                        f3 -= BallPulseIndicator.SCALE + f;
                        i3--;
                    }
                    f3 -= c3175b3.f9846d + f;
                    c3175b3.f9847e = f3;
                    i3--;
                }
            }
        }
        int size = this.f9885h.size();
        float f4 = c3175b.f9847e;
        i2 = c3175b.f9844b - 1;
        this.f9898u = c3175b.f9844b == 0 ? c3175b.f9847e : -3.4028235E38f;
        b--;
        this.f9899v = c3175b.f9844b == b ? (c3175b.f9847e + c3175b.f9846d) - BallPulseIndicator.SCALE : Float.MAX_VALUE;
        int i4 = i - 1;
        while (i4 >= 0) {
            C3175b c3175b4 = (C3175b) this.f9885h.get(i4);
            while (i2 > c3175b4.f9844b) {
                i2--;
                f4 -= BallPulseIndicator.SCALE + f;
            }
            f4 -= c3175b4.f9846d + f;
            c3175b4.f9847e = f4;
            if (c3175b4.f9844b == 0) {
                this.f9898u = f4;
            }
            i4--;
            i2--;
        }
        f4 = (c3175b.f9847e + c3175b.f9846d) + f;
        int i5 = c3175b.f9844b + 1;
        i++;
        while (i < size) {
            C3175b c3175b5 = (C3175b) this.f9885h.get(i);
            while (i5 < c3175b5.f9844b) {
                i5++;
                f4 += BallPulseIndicator.SCALE + f;
            }
            if (c3175b5.f9844b == b) {
                this.f9899v = (c3175b5.f9846d + f4) - BallPulseIndicator.SCALE;
            }
            c3175b5.f9847e = f4;
            f4 += c3175b5.f9846d + f;
            i++;
            i5++;
        }
    }

    private void m7663a(boolean z) {
        boolean z2 = this.af == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f9881a.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f9881a.getCurrX();
            int currY = this.f9881a.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f9902y = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f9885h.size(); i++) {
            C3175b c3175b = (C3175b) this.f9885h.get(i);
            if (c3175b.f9845c) {
                c3175b.f9845c = false;
                z3 = true;
            }
        }
        if (z3) {
            if (z) {
                C0571r.m1343a((View) this, this.ae);
                return;
            }
            this.ae.run();
        }
    }

    private boolean m7664a(float f) {
        boolean z;
        float f2 = this.f9863F - f;
        this.f9863F = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) getClientWidth();
        float f3 = this.f9898u * f2;
        float f4 = this.f9899v * f2;
        boolean z2 = false;
        C3175b c3175b = (C3175b) this.f9885h.get(0);
        int i = 1;
        C3175b c3175b2 = (C3175b) this.f9885h.get(this.f9885h.size() - 1);
        if (c3175b.f9844b != 0) {
            f3 = c3175b.f9847e * f2;
            z = false;
        } else {
            z = true;
        }
        if (c3175b2.f9844b != this.f9888k.mo2270b() - 1) {
            f4 = c3175b2.f9847e * f2;
            i = 0;
        }
        if (f < f3) {
            if (z) {
                z2 = this.f9874Q.m1504a(Math.abs(f3 - f) / f2);
            }
            f = f3;
        } else if (f > f4) {
            if (i != 0) {
                z2 = this.f9875R.m1504a(Math.abs(f - f4) / f2);
            }
            f = f4;
        }
        int i2 = (int) f;
        this.f9863F += f - ((float) i2);
        scrollTo(i2, getScrollY());
        m7675f();
        return z2;
    }

    private boolean m7665a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view2.getScrollX();
            int scrollY = view2.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (m7665a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && C0571r.m1348a(view2, -i);
    }

    private C3175b m7667b(View view) {
        while (true) {
            ViewPagerEx parent = view.getParent();
            if (parent == this) {
                return m7654a(view);
            }
            if (parent == null) {
                break;
            } else if (!(parent instanceof View)) {
                break;
            } else {
                view = parent;
            }
        }
        return null;
    }

    private void m7668b(int r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r0.f9889l;
        if (r2 == r1) goto L_0x001a;
    L_0x0008:
        r2 = r0.f9889l;
        if (r2 >= r1) goto L_0x000f;
    L_0x000c:
        r2 = 66;
        goto L_0x0011;
    L_0x000f:
        r2 = 17;
    L_0x0011:
        r4 = r0.f9889l;
        r4 = r0.m7670c(r4);
        r0.f9889l = r1;
        goto L_0x001c;
    L_0x001a:
        r2 = 2;
        r4 = 0;
    L_0x001c:
        r1 = r0.f9888k;
        if (r1 != 0) goto L_0x0024;
    L_0x0020:
        r18.m7674e();
        return;
    L_0x0024:
        r1 = r0.f9902y;
        if (r1 == 0) goto L_0x002c;
    L_0x0028:
        r18.m7674e();
        return;
    L_0x002c:
        r1 = r18.getWindowToken();
        if (r1 != 0) goto L_0x0033;
    L_0x0032:
        return;
    L_0x0033:
        r1 = r0.f9888k;
        r1.mo210a(r0);
        r1 = r0.f9903z;
        r5 = r0.f9889l;
        r5 = r5 - r1;
        r6 = 0;
        r5 = java.lang.Math.max(r6, r5);
        r7 = r0.f9888k;
        r7 = r7.mo2270b();
        r8 = r7 + -1;
        r9 = r0.f9889l;
        r9 = r9 + r1;
        r1 = java.lang.Math.min(r8, r9);
        r8 = r0.f9884e;
        if (r7 == r8) goto L_0x00aa;
    L_0x0055:
        r1 = r18.getResources();	 Catch:{ NotFoundException -> 0x0062 }
        r2 = r18.getId();	 Catch:{ NotFoundException -> 0x0062 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0062 }
        goto L_0x006a;
    L_0x0062:
        r1 = r18.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x006a:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.<init>(r4);
        r4 = r0.f9884e;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r7);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r18.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.f9888k;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x00aa:
        r8 = r6;
    L_0x00ab:
        r9 = r0.f9885h;
        r9 = r9.size();
        if (r8 >= r9) goto L_0x00cb;
    L_0x00b3:
        r9 = r0.f9885h;
        r9 = r9.get(r8);
        r9 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r9;
        r10 = r9.f9844b;
        r11 = r0.f9889l;
        if (r10 < r11) goto L_0x00c8;
    L_0x00c1:
        r10 = r9.f9844b;
        r11 = r0.f9889l;
        if (r10 != r11) goto L_0x00cb;
    L_0x00c7:
        goto L_0x00cc;
    L_0x00c8:
        r8 = r8 + 1;
        goto L_0x00ab;
    L_0x00cb:
        r9 = 0;
    L_0x00cc:
        if (r9 != 0) goto L_0x00d6;
    L_0x00ce:
        if (r7 <= 0) goto L_0x00d6;
    L_0x00d0:
        r9 = r0.f9889l;
        r9 = r0.m7653a(r9, r8);
    L_0x00d6:
        if (r9 == 0) goto L_0x01d7;
    L_0x00d8:
        r11 = r8 + -1;
        if (r11 < 0) goto L_0x00e5;
    L_0x00dc:
        r12 = r0.f9885h;
        r12 = r12.get(r11);
        r12 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r12;
        goto L_0x00e6;
    L_0x00e5:
        r12 = 0;
    L_0x00e6:
        r13 = r18.getClientWidth();
        r14 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r13 > 0) goto L_0x00f0;
    L_0x00ee:
        r3 = 0;
        goto L_0x00fc;
    L_0x00f0:
        r15 = r9.f9846d;
        r15 = r14 - r15;
        r3 = r18.getPaddingLeft();
        r3 = (float) r3;
        r6 = (float) r13;
        r3 = r3 / r6;
        r3 = r3 + r15;
    L_0x00fc:
        r6 = r0.f9889l;
        r6 = r6 + -1;
        r15 = r11;
        r11 = r8;
        r8 = 0;
    L_0x0103:
        if (r6 < 0) goto L_0x0151;
    L_0x0105:
        r16 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x0128;
    L_0x0109:
        if (r6 >= r5) goto L_0x0128;
    L_0x010b:
        if (r12 == 0) goto L_0x0151;
    L_0x010d:
        r10 = r12.f9844b;
        if (r6 != r10) goto L_0x014e;
    L_0x0111:
        r10 = r12.f9845c;
        if (r10 != 0) goto L_0x014e;
    L_0x0115:
        r10 = r0.f9885h;
        r10.remove(r15);
        r10 = r0.f9888k;
        r12 = r12.f9843a;
        r10.mo211a(r0, r6, r12);
        r15 = r15 + -1;
        r11 = r11 + -1;
        if (r15 < 0) goto L_0x014c;
    L_0x0127:
        goto L_0x0143;
    L_0x0128:
        if (r12 == 0) goto L_0x0136;
    L_0x012a:
        r10 = r12.f9844b;
        if (r6 != r10) goto L_0x0136;
    L_0x012e:
        r10 = r12.f9846d;
        r8 = r8 + r10;
        r15 = r15 + -1;
        if (r15 < 0) goto L_0x014c;
    L_0x0135:
        goto L_0x0143;
    L_0x0136:
        r10 = r15 + 1;
        r10 = r0.m7653a(r6, r10);
        r10 = r10.f9846d;
        r8 = r8 + r10;
        r11 = r11 + 1;
        if (r15 < 0) goto L_0x014c;
    L_0x0143:
        r10 = r0.f9885h;
        r10 = r10.get(r15);
        r10 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r10;
        goto L_0x014d;
    L_0x014c:
        r10 = 0;
    L_0x014d:
        r12 = r10;
    L_0x014e:
        r6 = r6 + -1;
        goto L_0x0103;
    L_0x0151:
        r3 = r9.f9846d;
        r5 = r11 + 1;
        r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r6 >= 0) goto L_0x01d4;
    L_0x0159:
        r6 = r0.f9885h;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x016a;
    L_0x0161:
        r6 = r0.f9885h;
        r6 = r6.get(r5);
        r6 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r6;
        goto L_0x016b;
    L_0x016a:
        r6 = 0;
    L_0x016b:
        if (r13 > 0) goto L_0x016f;
    L_0x016d:
        r10 = 0;
        goto L_0x0178;
    L_0x016f:
        r8 = r18.getPaddingRight();
        r8 = (float) r8;
        r10 = (float) r13;
        r8 = r8 / r10;
        r10 = r8 + r14;
    L_0x0178:
        r8 = r0.f9889l;
    L_0x017a:
        r8 = r8 + 1;
        if (r8 >= r7) goto L_0x01d4;
    L_0x017e:
        r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r12 < 0) goto L_0x01ad;
    L_0x0182:
        if (r8 <= r1) goto L_0x01ad;
    L_0x0184:
        if (r6 == 0) goto L_0x01d4;
    L_0x0186:
        r12 = r6.f9844b;
        if (r8 != r12) goto L_0x01d3;
    L_0x018a:
        r12 = r6.f9845c;
        if (r12 != 0) goto L_0x01d3;
    L_0x018e:
        r12 = r0.f9885h;
        r12.remove(r5);
        r12 = r0.f9888k;
        r6 = r6.f9843a;
        r12.mo211a(r0, r8, r6);
        r6 = r0.f9885h;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x01ab;
    L_0x01a2:
        r6 = r0.f9885h;
        r6 = r6.get(r5);
        r6 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r6;
        goto L_0x01d3;
    L_0x01ab:
        r6 = 0;
        goto L_0x01d3;
    L_0x01ad:
        if (r6 == 0) goto L_0x01c1;
    L_0x01af:
        r12 = r6.f9844b;
        if (r8 != r12) goto L_0x01c1;
    L_0x01b3:
        r6 = r6.f9846d;
        r3 = r3 + r6;
        r5 = r5 + 1;
        r6 = r0.f9885h;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x01ab;
    L_0x01c0:
        goto L_0x01a2;
    L_0x01c1:
        r6 = r0.m7653a(r8, r5);
        r5 = r5 + 1;
        r6 = r6.f9846d;
        r3 = r3 + r6;
        r6 = r0.f9885h;
        r6 = r6.size();
        if (r5 >= r6) goto L_0x01ab;
    L_0x01d2:
        goto L_0x01a2;
    L_0x01d3:
        goto L_0x017a;
    L_0x01d4:
        r0.m7661a(r9, r11, r4);
    L_0x01d7:
        r1 = r0.f9888k;
        if (r9 == 0) goto L_0x01de;
    L_0x01db:
        r3 = r9.f9843a;
        goto L_0x01df;
    L_0x01de:
        r3 = 0;
    L_0x01df:
        r1.mo212a(r3);
        r1 = r0.f9888k;
        r1.mo214b(r0);
        r1 = r18.getChildCount();
        r3 = 0;
    L_0x01ec:
        if (r3 >= r1) goto L_0x0218;
    L_0x01ee:
        r4 = r0.getChildAt(r3);
        r5 = r4.getLayoutParams();
        r5 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3176c) r5;
        r5.f9853f = r3;
        r6 = r5.f9848a;
        if (r6 != 0) goto L_0x0214;
    L_0x01fe:
        r6 = r5.f9850c;
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x0215;
    L_0x0205:
        r4 = r0.m7654a(r4);
        if (r4 == 0) goto L_0x0215;
    L_0x020b:
        r6 = r4.f9846d;
        r5.f9850c = r6;
        r4 = r4.f9844b;
        r5.f9852e = r4;
        goto L_0x0215;
    L_0x0214:
        r7 = 0;
    L_0x0215:
        r3 = r3 + 1;
        goto L_0x01ec;
    L_0x0218:
        r18.m7674e();
        r1 = r18.hasFocus();
        if (r1 == 0) goto L_0x0255;
    L_0x0221:
        r1 = r18.findFocus();
        if (r1 == 0) goto L_0x022c;
    L_0x0227:
        r3 = r0.m7667b(r1);
        goto L_0x022d;
    L_0x022c:
        r3 = 0;
    L_0x022d:
        if (r3 == 0) goto L_0x0235;
    L_0x022f:
        r1 = r3.f9844b;
        r3 = r0.f9889l;
        if (r1 == r3) goto L_0x0255;
    L_0x0235:
        r1 = 0;
    L_0x0236:
        r3 = r18.getChildCount();
        if (r1 >= r3) goto L_0x0255;
    L_0x023c:
        r3 = r0.getChildAt(r1);
        r4 = r0.m7654a(r3);
        if (r4 == 0) goto L_0x0252;
    L_0x0246:
        r4 = r4.f9844b;
        r5 = r0.f9889l;
        if (r4 != r5) goto L_0x0252;
    L_0x024c:
        r3 = r3.requestFocus(r2);
        if (r3 != 0) goto L_0x0255;
    L_0x0252:
        r1 = r1 + 1;
        goto L_0x0236;
    L_0x0255:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.b(int):void");
    }

    private C3175b m7670c(int i) {
        for (int i2 = 0; i2 < this.f9885h.size(); i2++) {
            C3175b c3175b = (C3175b) this.f9885h.get(i2);
            if (c3175b.f9844b == i) {
                return c3175b;
            }
        }
        return null;
    }

    private void m7672d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f9881a = new Scroller(context, f9857g);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f9862E = C0572s.m1391a(viewConfiguration);
        this.f9869L = (int) (400.0f * f);
        this.f9870M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9874Q = new C0621g(context);
        this.f9875R = new C0621g(context);
        this.f9871N = (int) (25.0f * f);
        this.f9872O = (int) (2.0f * f);
        this.f9860C = (int) (16.0f * f);
        C0571r.m1340a((View) this, new C6092d(this));
        if (C0571r.m1364f(this) == 0) {
            C0571r.m1352b((View) this, 1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7673d(int r8) {
        /*
        r7 = this;
        r0 = r7.findFocus();
        r1 = 0;
        r2 = 0;
        r3 = 1;
        if (r0 != r7) goto L_0x000a;
    L_0x0009:
        goto L_0x0066;
    L_0x000a:
        if (r0 == 0) goto L_0x0065;
    L_0x000c:
        r4 = r0.getParent();
    L_0x0010:
        r5 = r4 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x001d;
    L_0x0014:
        if (r4 != r7) goto L_0x0018;
    L_0x0016:
        r4 = r3;
        goto L_0x001e;
    L_0x0018:
        r4 = r4.getParent();
        goto L_0x0010;
    L_0x001d:
        r4 = r2;
    L_0x001e:
        if (r4 != 0) goto L_0x0065;
    L_0x0020:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = r0.getClass();
        r5 = r5.getSimpleName();
        r4.append(r5);
        r0 = r0.getParent();
    L_0x0034:
        r5 = r0 instanceof android.view.ViewGroup;
        if (r5 == 0) goto L_0x004d;
    L_0x0038:
        r5 = " => ";
        r4.append(r5);
        r5 = r0.getClass();
        r5 = r5.getSimpleName();
        r4.append(r5);
        r0 = r0.getParent();
        goto L_0x0034;
    L_0x004d:
        r0 = "ViewPagerEx";
        r5 = new java.lang.StringBuilder;
        r6 = "arrowScroll tried to find focus based on non-child current focused view ";
        r5.<init>(r6);
        r4 = r4.toString();
        r5.append(r4);
        r4 = r5.toString();
        android.util.Log.e(r0, r4);
        goto L_0x0066;
    L_0x0065:
        r1 = r0;
    L_0x0066:
        r0 = android.view.FocusFinder.getInstance();
        r0 = r0.findNextFocus(r7, r1, r8);
        r4 = 66;
        r5 = 17;
        if (r0 == 0) goto L_0x00a9;
    L_0x0074:
        if (r0 == r1) goto L_0x00a9;
    L_0x0076:
        if (r8 != r5) goto L_0x0092;
    L_0x0078:
        r2 = r7.f9887j;
        r2 = r7.m7652a(r2, r0);
        r2 = r2.left;
        r3 = r7.f9887j;
        r3 = r7.m7652a(r3, r1);
        r3 = r3.left;
        if (r1 == 0) goto L_0x008d;
    L_0x008a:
        if (r2 < r3) goto L_0x008d;
    L_0x008c:
        goto L_0x00ca;
    L_0x008d:
        r0 = r0.requestFocus();
        goto L_0x00ce;
    L_0x0092:
        if (r8 != r4) goto L_0x00cf;
    L_0x0094:
        r4 = r7.f9887j;
        r4 = r7.m7652a(r4, r0);
        r4 = r4.left;
        r5 = r7.f9887j;
        r5 = r7.m7652a(r5, r1);
        r5 = r5.left;
        if (r1 == 0) goto L_0x008d;
    L_0x00a6:
        if (r4 <= r5) goto L_0x00b3;
    L_0x00a8:
        goto L_0x008d;
    L_0x00a9:
        if (r8 == r5) goto L_0x00ca;
    L_0x00ab:
        if (r8 != r3) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00ca;
    L_0x00ae:
        if (r8 == r4) goto L_0x00b3;
    L_0x00b0:
        r0 = 2;
        if (r8 != r0) goto L_0x00cf;
    L_0x00b3:
        r0 = r7.f9888k;
        if (r0 == 0) goto L_0x00cf;
    L_0x00b7:
        r0 = r7.f9889l;
        r1 = r7.f9888k;
        r1 = r1.mo2270b();
        r1 = r1 - r3;
        if (r0 >= r1) goto L_0x00cf;
    L_0x00c2:
        r0 = r7.f9889l;
        r0 = r0 + r3;
        r7.m7682a(r0, r3);
        r2 = r3;
        goto L_0x00cf;
    L_0x00ca:
        r0 = r7.m7680k();
    L_0x00ce:
        r2 = r0;
    L_0x00cf:
        if (r2 == 0) goto L_0x00d8;
    L_0x00d1:
        r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8);
        r7.playSoundEffect(r8);
    L_0x00d8:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.d(int):boolean");
    }

    private void m7674e() {
        if (this.f9883c != 0) {
            if (this.ac == null) {
                this.ac = new ArrayList();
            } else {
                this.ac.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ac.add(getChildAt(i));
            }
            Collections.sort(this.ac, ad);
        }
    }

    private boolean m7675f() {
        if (this.f9885h.size() == 0) {
            this.f9877T = false;
            m7676g();
            if (this.f9877T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        m7678i();
        getClientWidth();
        this.f9877T = false;
        m7676g();
        if (this.f9877T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m7676g() {
        int scrollX;
        int paddingLeft;
        int i = 0;
        if (this.f9878U > 0) {
            scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i2 = paddingRight;
            paddingRight = paddingLeft;
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                View childAt = getChildAt(paddingLeft);
                C3176c c3176c = (C3176c) childAt.getLayoutParams();
                if (c3176c.f9848a) {
                    int i3 = c3176c.f9849b & 7;
                    if (i3 != 1) {
                        if (i3 == 3) {
                            i3 = childAt.getWidth() + paddingRight;
                        } else if (i3 != 5) {
                            i3 = paddingRight;
                        } else {
                            i3 = (width - i2) - childAt.getMeasuredWidth();
                            i2 += childAt.getMeasuredWidth();
                        }
                        paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                        if (paddingRight != 0) {
                            childAt.offsetLeftAndRight(paddingRight);
                        }
                        paddingRight = i3;
                    } else {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingRight);
                    }
                    int i4 = i3;
                    i3 = paddingRight;
                    paddingRight = i4;
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                    paddingRight = i3;
                }
            }
        }
        Iterator it = this.f9879V.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (this.f9882b != null) {
            scrollX = getScrollX();
            paddingLeft = getChildCount();
            while (i < paddingLeft) {
                View childAt2 = getChildAt(i);
                if (!((C3176c) childAt2.getLayoutParams()).f9848a) {
                    this.f9882b.mo2274b(childAt2, ((float) (childAt2.getLeft() - scrollX)) / ((float) getClientWidth()));
                }
                i++;
            }
        }
        this.f9877T = true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void m7677h() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private C3175b m7678i() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f9894q) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = f2;
        int i = 0;
        int i2 = -1;
        C3175b c3175b = null;
        int i3 = 1;
        while (i < this.f9885h.size()) {
            C3175b c3175b2 = (C3175b) this.f9885h.get(i);
            if (i3 == 0) {
                i2++;
                if (c3175b2.f9844b != i2) {
                    c3175b2 = this.f9886i;
                    c3175b2.f9847e = (f2 + f3) + f;
                    c3175b2.f9844b = i2;
                    c3175b2.f9846d = BallPulseIndicator.SCALE;
                    i--;
                }
            }
            f2 = c3175b2.f9847e;
            float f4 = (c3175b2.f9846d + f2) + f;
            if (i3 == 0) {
                if (scrollX < f2) {
                    return c3175b;
                }
            }
            if (scrollX < f4 || i == this.f9885h.size() - 1) {
                return c3175b2;
            }
            i2 = c3175b2.f9844b;
            f3 = c3175b2.f9846d;
            i++;
            i3 = 0;
            c3175b = c3175b2;
        }
        return c3175b;
    }

    private void m7679j() {
        this.f9858A = false;
        this.f9859B = false;
        if (this.f9868K != null) {
            this.f9868K.recycle();
            this.f9868K = null;
        }
    }

    private boolean m7680k() {
        if (this.f9889l <= 0) {
            return false;
        }
        m7682a(this.f9889l - 1, true);
        return true;
    }

    private void setScrollState(int i) {
        if (this.af != i) {
            this.af = i;
            if (this.f9882b != null) {
                Object obj = i != 0 ? 1 : null;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C0571r.m1356c(getChildAt(i2), obj != null ? 2 : 0);
                }
            }
            Iterator it = this.f9879V.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f9901x != z) {
            this.f9901x = z;
        }
    }

    final void m7681a() {
        int b = this.f9888k.mo2270b();
        this.f9884e = b;
        boolean z = this.f9885h.size() < (this.f9903z * 2) + 1 && this.f9885h.size() < b;
        boolean z2 = z;
        int i = this.f9889l;
        int i2 = 0;
        int i3 = i2;
        while (i2 < this.f9885h.size()) {
            C3175b c3175b = (C3175b) this.f9885h.get(i2);
            int c = this.f9888k.mo2272c();
            if (c != -1) {
                if (c == -2) {
                    this.f9885h.remove(i2);
                    i2--;
                    if (i3 == 0) {
                        this.f9888k.mo210a((ViewGroup) this);
                        i3 = true;
                    }
                    this.f9888k.mo211a(this, c3175b.f9844b, c3175b.f9843a);
                    if (this.f9889l == c3175b.f9844b) {
                        i = Math.max(0, Math.min(this.f9889l, b - 1));
                    }
                } else if (c3175b.f9844b != c) {
                    if (c3175b.f9844b == this.f9889l) {
                        i = c;
                    }
                    c3175b.f9844b = c;
                }
                z2 = true;
            }
            i2++;
        }
        if (i3 != 0) {
            this.f9888k.mo214b((ViewGroup) this);
        }
        Collections.sort(this.f9885h, f9856f);
        if (z2) {
            b = getChildCount();
            for (i2 = 0; i2 < b; i2++) {
                C3176c c3176c = (C3176c) getChildAt(i2).getLayoutParams();
                if (!c3176c.f9848a) {
                    c3176c.f9850c = 0.0f;
                }
            }
            m7658a(i, false, true);
            requestLayout();
        }
    }

    public final void m7682a(int i, boolean z) {
        this.f9902y = false;
        m7658a(i, z, false);
    }

    public final void m7683a(C3178f c3178f) {
        if (!this.f9879V.contains(c3178f)) {
            this.f9879V.add(c3178f);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C3175b a = m7654a(childAt);
                    if (a != null && a.f9844b == this.f9889l) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (!(((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null)) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C3175b a = m7654a(childAt);
                if (a != null && a.f9844b == this.f9889l) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3176c c3176c = (C3176c) layoutParams;
        c3176c.f9848a |= view instanceof C3174a;
        if (!this.f9900w) {
            super.addView(view, i, layoutParams);
        } else if (c3176c == null || !c3176c.f9848a) {
            c3176c.f9851d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final void m7684b() {
        m7668b(this.f9889l);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f9888k == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f9898u)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f9899v));
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C3176c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f9881a.isFinished() || !this.f9881a.computeScrollOffset()) {
            m7663a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f9881a.getCurrX();
        int currY = this.f9881a.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m7675f()) {
                this.f9881a.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0571r.m1361e(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        boolean d;
        if (keyEvent.getAction() == 0) {
            int i;
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        i = 17;
                        break;
                    case 22:
                        i = 66;
                        break;
                    default:
                        break;
                }
            } else if (VERSION.SDK_INT >= 11) {
                if (keyEvent.hasNoModifiers()) {
                    i = 2;
                } else if (keyEvent.hasModifiers(1)) {
                    d = m7673d(1);
                    return d;
                }
            }
            d = m7673d(i);
            if (d) {
            }
        }
        d = false;
        if (d) {
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C3175b a = m7654a(childAt);
                if (a != null && a.f9844b == this.f9889l && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int b = C0571r.m1349b(this);
        int i = 0;
        if (b != 0) {
            if (b != 1 || this.f9888k == null || this.f9888k.mo2270b() <= 1) {
                this.f9874Q.f2048a.finish();
                this.f9875R.f2048a.finish();
                if (i != 0) {
                    C0571r.m1361e(this);
                }
            }
        }
        if (!this.f9874Q.f2048a.isFinished()) {
            b = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.f9898u * ((float) width));
            this.f9874Q.m1502a(height, width);
            i = 0 | this.f9874Q.m1505a(canvas);
            canvas.restoreToCount(b);
        }
        if (!this.f9875R.f2048a.isFinished()) {
            b = canvas.save();
            height = getWidth();
            width = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.f9899v + BallPulseIndicator.SCALE)) * ((float) height));
            this.f9875R.m1502a(width, height);
            i |= this.f9875R.m1505a(canvas);
            canvas.restoreToCount(b);
        }
        if (i != 0) {
            C0571r.m1361e(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9895r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C3176c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3176c(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0565n getAdapter() {
        return this.f9888k;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f9883c == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C3176c) ((View) this.ac.get(i2)).getLayoutParams()).f9853f;
    }

    public int getCurrentItem() {
        return this.f9889l;
    }

    public int getOffscreenPageLimit() {
        return this.f9903z;
    }

    public int getPageMargin() {
        return this.f9894q;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9876S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ae);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9894q > 0 && r0.f9895r != null && r0.f9885h.size() > 0 && r0.f9888k != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) r0.f9894q) / f;
            int i = 0;
            C3175b c3175b = (C3175b) r0.f9885h.get(0);
            float f3 = c3175b.f9847e;
            int size = r0.f9885h.size();
            int i2 = c3175b.f9844b;
            int i3 = ((C3175b) r0.f9885h.get(size - 1)).f9844b;
            while (i2 < i3) {
                float f4;
                float f5;
                while (i2 > c3175b.f9844b && i < size) {
                    i++;
                    c3175b = (C3175b) r0.f9885h.get(i);
                }
                if (i2 == c3175b.f9844b) {
                    f4 = (c3175b.f9847e + c3175b.f9846d) * f;
                    f3 = (c3175b.f9847e + c3175b.f9846d) + f2;
                } else {
                    f4 = (f3 + BallPulseIndicator.SCALE) * f;
                    f3 += BallPulseIndicator.SCALE + f2;
                }
                if (((float) r0.f9894q) + f4 > ((float) scrollX)) {
                    f5 = f2;
                    r0.f9895r.setBounds((int) f4, r0.f9896s, (int) ((((float) r0.f9894q) + f4) + 0.5f), r0.f9897t);
                    r0.f9895r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f5 = f2;
                }
                if (f4 <= ((float) (scrollX + width))) {
                    i2++;
                    f2 = f5;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view = this;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            if (action != 1) {
                if (action != 0) {
                    if (view.f9858A) {
                        return true;
                    }
                    if (view.f9859B) {
                        return false;
                    }
                }
                float x;
                if (action == 0) {
                    x = motionEvent.getX();
                    view.f9865H = x;
                    view.f9863F = x;
                    x = motionEvent.getY();
                    view.f9866I = x;
                    view.f9864G = x;
                    view.f9867J = motionEvent2.getPointerId(0);
                    view.f9859B = false;
                    view.f9881a.computeScrollOffset();
                    if (view.af != 2 || Math.abs(view.f9881a.getFinalX() - view.f9881a.getCurrX()) <= view.f9872O) {
                        m7663a(false);
                        view.f9858A = false;
                    } else {
                        view.f9881a.abortAnimation();
                        view.f9902y = false;
                        m7684b();
                        view.f9858A = true;
                        m7677h();
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    action = view.f9867J;
                    if (action != -1) {
                        action = motionEvent2.findPointerIndex(action);
                        float x2 = motionEvent2.getX(action);
                        float f = x2 - view.f9863F;
                        float abs = Math.abs(f);
                        float y = motionEvent2.getY(action);
                        float abs2 = Math.abs(y - view.f9866I);
                        if (f != 0.0f) {
                            x = view.f9863F;
                            boolean z = (x < ((float) view.f9861D) && f > 0.0f) || (x > ((float) (getWidth() - view.f9861D)) && f < 0.0f);
                            if (!z && m7665a(view, false, (int) f, (int) x2, (int) y)) {
                                view.f9863F = x2;
                                view.f9864G = y;
                                view.f9859B = true;
                                return false;
                            }
                        }
                        if (abs > ((float) view.f9862E) && abs * 0.5f > abs2) {
                            view.f9858A = true;
                            m7677h();
                            setScrollState(1);
                            view.f9863F = f > 0.0f ? view.f9865H + ((float) view.f9862E) : view.f9865H - ((float) view.f9862E);
                            view.f9864G = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) view.f9862E)) {
                            view.f9859B = true;
                        }
                        if (view.f9858A && m7664a(x2)) {
                            C0571r.m1361e(this);
                        }
                    }
                } else if (action == 6) {
                    m7660a(motionEvent);
                }
                if (view.f9868K == null) {
                    view.f9868K = VelocityTracker.obtain();
                }
                view.f9868K.addMovement(motionEvent2);
                return view.f9858A;
            }
        }
        view.f9858A = false;
        view.f9859B = false;
        view.f9867J = -1;
        if (view.f9868K != null) {
            view.f9868K.recycle();
            view.f9868K = null;
        }
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ViewPagerEx viewPagerEx = this;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                C3176c c3176c = (C3176c) childAt.getLayoutParams();
                if (c3176c.f9848a) {
                    int i9 = c3176c.f9849b & 7;
                    int i10 = c3176c.f9849b & 112;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                C3176c c3176c2 = (C3176c) childAt2.getLayoutParams();
                if (!c3176c2.f9848a) {
                    C3175b a = m7654a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        int i11 = ((int) (a.f9847e * f)) + paddingTop;
                        if (c3176c2.f9851d) {
                            c3176c2.f9851d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * c3176c2.f9850c), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        viewPagerEx.f9896s = paddingBottom;
        viewPagerEx.f9897t = i6 - i7;
        viewPagerEx.f9878U = i8;
        if (viewPagerEx.f9876S) {
            z2 = false;
            m7657a(viewPagerEx.f9889l, false, 0, false);
        } else {
            z2 = false;
        }
        viewPagerEx.f9876S = z2;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f9861D = Math.min(measuredWidth / 10, this.f9860C);
        measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = measuredHeight;
        measuredHeight = measuredWidth;
        measuredWidth = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (measuredWidth >= childCount) {
                break;
            }
            View childAt = getChildAt(measuredWidth);
            if (childAt.getVisibility() != 8) {
                C3176c c3176c = (C3176c) childAt.getLayoutParams();
                if (c3176c != null && c3176c.f9848a) {
                    int i6;
                    int i7;
                    int i8 = c3176c.f9849b & 7;
                    int i9 = c3176c.f9849b & 112;
                    if (i9 != 48) {
                        if (i9 != 80) {
                            i9 = z;
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    z2 = z;
                                }
                            }
                            i8 = Integer.MIN_VALUE;
                            if (i9 != 0) {
                                i6 = Integer.MIN_VALUE;
                                i8 = 1073741824;
                            } else {
                                i6 = z2 ? 1073741824 : Integer.MIN_VALUE;
                            }
                            if (c3176c.width == -2) {
                                i7 = c3176c.width == -1 ? c3176c.width : measuredHeight;
                                i8 = 1073741824;
                            } else {
                                i7 = measuredHeight;
                            }
                            if (c3176c.height == -2) {
                                i3 = c3176c.height == -1 ? c3176c.height : i4;
                            } else {
                                i3 = i4;
                                i5 = i6;
                            }
                            childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                            if (i9 != 0) {
                                i4 -= childAt.getMeasuredHeight();
                            } else if (z2) {
                                measuredHeight -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    i9 = true;
                    if (i8 != 3) {
                        if (i8 == 5) {
                            z2 = z;
                        }
                    }
                    i8 = Integer.MIN_VALUE;
                    if (i9 != 0) {
                        i6 = Integer.MIN_VALUE;
                        i8 = 1073741824;
                    } else if (z2) {
                    }
                    if (c3176c.width == -2) {
                        i7 = measuredHeight;
                    } else {
                        if (c3176c.width == -1) {
                        }
                        i8 = 1073741824;
                    }
                    if (c3176c.height == -2) {
                        i3 = i4;
                        i5 = i6;
                    } else if (c3176c.height == -1) {
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                    if (i9 != 0) {
                        i4 -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        measuredHeight -= childAt.getMeasuredWidth();
                    }
                }
            }
            measuredWidth++;
            z = false;
        }
        MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        i3 = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        r0.f9900w = true;
        m7684b();
        measuredWidth = 0;
        r0.f9900w = false;
        childCount = getChildCount();
        while (measuredWidth < childCount) {
            View childAt2 = getChildAt(measuredWidth);
            if (childAt2.getVisibility() != 8) {
                C3176c c3176c2 = (C3176c) childAt2.getLayoutParams();
                if (c3176c2 == null || !c3176c2.f9848a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) * c3176c2.f9850c), 1073741824), i3);
                }
            }
            measuredWidth++;
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) != 0) {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        } else {
            childCount--;
            i2 = -1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                C3175b a = m7654a(childAt);
                if (a != null && a.f9844b == this.f9889l && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f9888k != null) {
                this.f9888k.mo209a(savedState.f9841b, savedState.f9842c);
                m7658a(savedState.f9840a, false, true);
                return;
            }
            this.f9890m = savedState.f9840a;
            this.f9891n = savedState.f9841b;
            this.f9892o = savedState.f9842c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9840a = this.f9889l;
        if (this.f9888k != null) {
            savedState.f9841b = this.f9888k.mo207a();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m7656a(i, i3, this.f9894q, this.f9894q);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r8.f9873P;
        r1 = 1;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r9.getAction();
        r2 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x000d:
        r0 = r9.getEdgeFlags();
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        return r2;
    L_0x0014:
        r0 = r8.f9888k;
        if (r0 == 0) goto L_0x01a1;
    L_0x0018:
        r0 = r8.f9888k;
        r0 = r0.mo2270b();
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        return r2;
    L_0x0021:
        r0 = r8.f9868K;
        if (r0 != 0) goto L_0x002b;
    L_0x0025:
        r0 = android.view.VelocityTracker.obtain();
        r8.f9868K = r0;
    L_0x002b:
        r0 = r8.f9868K;
        r0.addMovement(r9);
        r0 = r9.getAction();
        r0 = r0 & 255;
        r3 = -1;
        switch(r0) {
            case 0: goto L_0x017b;
            case 1: goto L_0x00ea;
            case 2: goto L_0x007b;
            case 3: goto L_0x005d;
            case 4: goto L_0x003a;
            case 5: goto L_0x004d;
            case 6: goto L_0x003c;
            default: goto L_0x003a;
        };
    L_0x003a:
        goto L_0x019b;
    L_0x003c:
        r8.m7660a(r9);
        r0 = r8.f9867J;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r8.f9863F = r9;
        goto L_0x019b;
    L_0x004d:
        r0 = r9.getActionIndex();
        r3 = r9.getX(r0);
        r8.f9863F = r3;
        r9 = r9.getPointerId(r0);
        goto L_0x0199;
    L_0x005d:
        r9 = r8.f9858A;
        if (r9 == 0) goto L_0x019b;
    L_0x0061:
        r9 = r8.f9889l;
        r8.m7657a(r9, r1, r2, r2);
    L_0x0066:
        r8.f9867J = r3;
        r8.m7679j();
        r9 = r8.f9874Q;
        r9 = r9.m1503a();
        r0 = r8.f9875R;
        r0 = r0.m1503a();
        r2 = r9 | r0;
        goto L_0x019b;
    L_0x007b:
        r0 = r8.f9858A;
        if (r0 != 0) goto L_0x00d5;
    L_0x007f:
        r0 = r8.f9867J;
        r0 = r9.findPointerIndex(r0);
        r3 = r9.getX(r0);
        r4 = r8.f9863F;
        r4 = r3 - r4;
        r4 = java.lang.Math.abs(r4);
        r0 = r9.getY(r0);
        r5 = r8.f9864G;
        r5 = r0 - r5;
        r5 = java.lang.Math.abs(r5);
        r6 = r8.f9862E;
        r6 = (float) r6;
        r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x00d5;
    L_0x00a4:
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x00d5;
    L_0x00a8:
        r8.f9858A = r1;
        r8.m7677h();
        r4 = r8.f9865H;
        r3 = r3 - r4;
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x00bc;
    L_0x00b5:
        r3 = r8.f9865H;
        r4 = r8.f9862E;
        r4 = (float) r4;
        r3 = r3 + r4;
        goto L_0x00c2;
    L_0x00bc:
        r3 = r8.f9865H;
        r4 = r8.f9862E;
        r4 = (float) r4;
        r3 = r3 - r4;
    L_0x00c2:
        r8.f9863F = r3;
        r8.f9864G = r0;
        r8.setScrollState(r1);
        r8.setScrollingCacheEnabled(r1);
        r0 = r8.getParent();
        if (r0 == 0) goto L_0x00d5;
    L_0x00d2:
        r0.requestDisallowInterceptTouchEvent(r1);
    L_0x00d5:
        r0 = r8.f9858A;
        if (r0 == 0) goto L_0x019b;
    L_0x00d9:
        r0 = r8.f9867J;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r9 = r8.m7664a(r9);
        r2 = r2 | r9;
        goto L_0x019b;
    L_0x00ea:
        r0 = r8.f9858A;
        if (r0 == 0) goto L_0x019b;
    L_0x00ee:
        r0 = r8.f9868K;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r8.f9870M;
        r5 = (float) r5;
        r0.computeCurrentVelocity(r4, r5);
        r4 = r8.f9867J;
        r0 = r0.getXVelocity(r4);
        r0 = (int) r0;
        r8.f9902y = r1;
        r4 = r8.getClientWidth();
        r5 = r8.getScrollX();
        r6 = r8.m7678i();
        r7 = r6.f9844b;
        r5 = (float) r5;
        r4 = (float) r4;
        r5 = r5 / r4;
        r4 = r6.f9847e;
        r5 = r5 - r4;
        r4 = r6.f9846d;
        r5 = r5 / r4;
        r4 = r8.f9867J;
        r4 = r9.findPointerIndex(r4);
        r9 = r9.getX(r4);
        r4 = r8.f9865H;
        r9 = r9 - r4;
        r9 = (int) r9;
        r9 = java.lang.Math.abs(r9);
        r4 = r8.f9871N;
        if (r9 <= r4) goto L_0x013c;
    L_0x012e:
        r9 = java.lang.Math.abs(r0);
        r4 = r8.f9869L;
        if (r9 <= r4) goto L_0x013c;
    L_0x0136:
        if (r0 <= 0) goto L_0x0139;
    L_0x0138:
        goto L_0x014b;
    L_0x0139:
        r7 = r7 + 1;
        goto L_0x014b;
    L_0x013c:
        r9 = r8.f9889l;
        if (r7 < r9) goto L_0x0144;
    L_0x0140:
        r9 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        goto L_0x0147;
    L_0x0144:
        r9 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
    L_0x0147:
        r4 = (float) r7;
        r4 = r4 + r5;
        r4 = r4 + r9;
        r7 = (int) r4;
    L_0x014b:
        r9 = r8.f9885h;
        r9 = r9.size();
        if (r9 <= 0) goto L_0x0176;
    L_0x0153:
        r9 = r8.f9885h;
        r9 = r9.get(r2);
        r9 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r9;
        r2 = r8.f9885h;
        r4 = r8.f9885h;
        r4 = r4.size();
        r4 = r4 - r1;
        r2 = r2.get(r4);
        r2 = (mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.C3175b) r2;
        r9 = r9.f9844b;
        r2 = r2.f9844b;
        r2 = java.lang.Math.min(r7, r2);
        r7 = java.lang.Math.max(r9, r2);
    L_0x0176:
        r8.m7659a(r7, r1, r1, r0);
        goto L_0x0066;
    L_0x017b:
        r0 = r8.f9881a;
        r0.abortAnimation();
        r8.f9902y = r2;
        r8.m7684b();
        r0 = r9.getX();
        r8.f9865H = r0;
        r8.f9863F = r0;
        r0 = r9.getY();
        r8.f9866I = r0;
        r8.f9864G = r0;
        r9 = r9.getPointerId(r2);
    L_0x0199:
        r8.f9867J = r9;
    L_0x019b:
        if (r2 == 0) goto L_0x01a0;
    L_0x019d:
        android.support.v4.view.C0571r.m1361e(r8);
    L_0x01a0:
        return r1;
    L_0x01a1:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.imageslider.Tricks.ViewPagerEx.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f9900w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0565n c0565n) {
        if (this.f9888k != null) {
            int i;
            this.f9888k.m1266b(this.f9893p);
            this.f9888k.mo210a((ViewGroup) this);
            for (i = 0; i < this.f9885h.size(); i++) {
                C3175b c3175b = (C3175b) this.f9885h.get(i);
                this.f9888k.mo211a(this, c3175b.f9844b, c3175b.f9843a);
            }
            this.f9888k.mo214b((ViewGroup) this);
            this.f9885h.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((C3176c) getChildAt(i).getLayoutParams()).f9848a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.f9889l = 0;
            scrollTo(0, 0);
        }
        this.f9888k = c0565n;
        this.f9884e = 0;
        if (this.f9888k != null) {
            if (this.f9893p == null) {
                this.f9893p = new C3180h();
            }
            this.f9888k.m1258a(this.f9893p);
            this.f9902y = false;
            boolean z = this.f9876S;
            this.f9876S = true;
            this.f9884e = this.f9888k.mo2270b();
            if (this.f9890m >= 0) {
                this.f9888k.mo209a(this.f9891n, this.f9892o);
                m7658a(this.f9890m, false, true);
                this.f9890m = -1;
                this.f9891n = null;
                this.f9892o = null;
            } else if (z) {
                requestLayout();
            } else {
                m7684b();
            }
        }
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ab == null) {
                try {
                    this.ab = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPagerEx", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ab.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPagerEx", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f9902y = false;
        m7658a(i, this.f9876S ^ 1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to 1");
            Log.w("ViewPagerEx", stringBuilder.toString());
            i = 1;
        }
        if (i != this.f9903z) {
            this.f9903z = i;
            m7684b();
        }
    }

    void setOnAdapterChangeListener(C3177e c3177e) {
        this.aa = c3177e;
    }

    public void setPageMargin(int i) {
        int i2 = this.f9894q;
        this.f9894q = i;
        int width = getWidth();
        m7656a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0346c.m682a(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f9895r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f9895r) {
                return false;
            }
        }
        return true;
    }
}
