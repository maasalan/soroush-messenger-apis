package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0249a.C0241d;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.p035d.C0443a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0571r;
import android.support.v4.widget.C0634p;
import android.support.v4.widget.C0634p.C0633a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class BottomSheetBehavior<V extends View> extends C0270a<V> {
    int f13046a;
    int f13047b;
    boolean f13048c;
    public int f13049d = 4;
    C0634p f13050e;
    int f13051f;
    WeakReference<V> f13052g;
    WeakReference<View> f13053h;
    public C0265a f13054i;
    int f13055j;
    boolean f13056k;
    private float f13057l;
    private int f13058m;
    private boolean f13059n;
    private int f13060o;
    private boolean f13061p;
    private boolean f13062q;
    private int f13063r;
    private boolean f13064s;
    private VelocityTracker f13065t;
    private int f13066u;
    private final C0633a f13067v = new C47322(this);

    public static abstract class C0265a {
        public abstract void mo187a(int i);
    }

    private class C0266b implements Runnable {
        final /* synthetic */ BottomSheetBehavior f957a;
        private final View f958b;
        private final int f959c;

        C0266b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
            this.f957a = bottomSheetBehavior;
            this.f958b = view;
            this.f959c = i;
        }

        public final void run() {
            if (this.f957a.f13050e == null || !this.f957a.f13050e.m1570c()) {
                this.f957a.m8744d(this.f959c);
            } else {
                C0571r.m1343a(this.f958b, (Runnable) this);
            }
        }
    }

    class C47322 extends C0633a {
        final /* synthetic */ BottomSheetBehavior f13044a;

        C47322(BottomSheetBehavior bottomSheetBehavior) {
            this.f13044a = bottomSheetBehavior;
        }

        public final int mo141a() {
            return (this.f13044a.f13048c ? this.f13044a.f13051f : this.f13044a.f13047b) - this.f13044a.f13046a;
        }

        public final void mo142a(int i) {
            if (i == 1) {
                this.f13044a.m8744d(1);
            }
        }

        public final void mo143a(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 >= 0.0f) {
                if (this.f13044a.f13048c && this.f13044a.m8739a(view, f2)) {
                    i = this.f13044a.f13051f;
                    i2 = 5;
                    if (this.f13044a.f13050e.m1563a(view.getLeft(), i)) {
                        this.f13044a.m8744d(i2);
                    }
                    this.f13044a.m8744d(2);
                    C0571r.m1343a(view, new C0266b(this.f13044a, view, i2));
                    return;
                }
                if (f2 == 0.0f) {
                    i = view.getTop();
                    if (Math.abs(i - this.f13044a.f13046a) < Math.abs(i - this.f13044a.f13047b)) {
                    }
                }
                i = this.f13044a.f13047b;
                if (this.f13044a.f13050e.m1563a(view.getLeft(), i)) {
                    this.f13044a.m8744d(2);
                    C0571r.m1343a(view, new C0266b(this.f13044a, view, i2));
                    return;
                }
                this.f13044a.m8744d(i2);
            }
            i = this.f13044a.f13046a;
            i2 = 3;
            if (this.f13044a.f13050e.m1563a(view.getLeft(), i)) {
                this.f13044a.m8744d(2);
                C0571r.m1343a(view, new C0266b(this.f13044a, view, i2));
                return;
            }
            this.f13044a.m8744d(i2);
        }

        public final void mo144a(View view, int i, int i2) {
            this.f13044a.m8730a();
        }

        public final boolean mo145a(View view, int i) {
            if (this.f13044a.f13049d == 1 || this.f13044a.f13056k) {
                return false;
            }
            if (this.f13044a.f13049d == 3 && this.f13044a.f13055j == i) {
                View view2 = (View) this.f13044a.f13053h.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            return this.f13044a.f13052g != null && this.f13044a.f13052g.get() == view;
        }

        public final int mo146b(View view, int i) {
            return C0443a.m943a(i, this.f13044a.f13046a, this.f13044a.f13048c ? this.f13044a.f13051f : this.f13044a.f13047b);
        }

        public final int mo147c(View view, int i) {
            return view.getLeft();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02641();
        final int f13045a;

        static class C02641 implements ClassLoaderCreator<SavedState> {
            C02641() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13045a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f13045a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13045a);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C0248k.BottomSheetBehavior_Layout_behavior_peekHeight);
        int dimensionPixelSize = (peekValue == null || peekValue.data != -1) ? obtainStyledAttributes.getDimensionPixelSize(C0248k.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : peekValue.data;
        m8741b(dimensionPixelSize);
        this.f13048c = obtainStyledAttributes.getBoolean(C0248k.BottomSheetBehavior_Layout_behavior_hideable, false);
        this.f13061p = obtainStyledAttributes.getBoolean(C0248k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        obtainStyledAttributes.recycle();
        this.f13057l = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> m8727b(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0273d) {
            C0270a c0270a = ((C0273d) layoutParams).f987a;
            if (c0270a instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) c0270a;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void m8728b() {
        this.f13055j = -1;
        if (this.f13065t != null) {
            this.f13065t.recycle();
            this.f13065t = null;
        }
    }

    private View m8729c(View view) {
        if (C0571r.m1324B(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View c = m8729c(viewGroup.getChildAt(i));
                if (c != null) {
                    return c;
                }
            }
        }
        return null;
    }

    final void m8730a() {
        this.f13052g.get();
    }

    public final void mo148a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        int i;
        SavedState savedState = (SavedState) parcelable;
        super.mo148a(coordinatorLayout, (View) v, savedState.getSuperState());
        if (savedState.f13045a != 1) {
            if (savedState.f13045a != 2) {
                i = savedState.f13045a;
                this.f13049d = i;
            }
        }
        i = 4;
        this.f13049d = i;
    }

    public final void mo149a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f13053h.get())) {
            int top = v.getTop();
            i = top - i2;
            if (i2 <= 0) {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    if (i > this.f13047b) {
                        if (!this.f13048c) {
                            iArr[1] = top - this.f13047b;
                            C0571r.m1359d((View) v, -iArr[1]);
                            top = 4;
                        }
                    }
                    iArr[1] = i2;
                    C0571r.m1359d((View) v, -i2);
                    m8744d(1);
                }
                v.getTop();
                m8730a();
                this.f13063r = i2;
                this.f13064s = true;
            } else if (i < this.f13046a) {
                iArr[1] = top - this.f13046a;
                C0571r.m1359d((View) v, -iArr[1]);
                top = 3;
            } else {
                iArr[1] = i2;
                C0571r.m1359d((View) v, -i2);
                m8744d(1);
                v.getTop();
                m8730a();
                this.f13063r = i2;
                this.f13064s = true;
            }
            m8744d(top);
            v.getTop();
            m8730a();
            this.f13063r = i2;
            this.f13064s = true;
        }
    }

    final void m8733a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f13047b;
        } else if (i == 3) {
            i2 = this.f13046a;
        } else if (this.f13048c && i == 5) {
            i2 = this.f13051f;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Illegal state argument: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.f13050e.m1565a(view, view.getLeft(), i2)) {
            m8744d(2);
            C0571r.m1343a(view, new C0266b(this, view, i));
            return;
        }
        m8744d(i);
    }

    public final void mo150a(V v, View view) {
        int i = 3;
        if (v.getTop() == this.f13046a) {
            m8744d(3);
        } else if (this.f13053h != null && view == this.f13053h.get() && this.f13064s) {
            int i2;
            if (this.f13063r <= 0) {
                if (this.f13048c) {
                    this.f13065t.computeCurrentVelocity(IjkMediaCodecInfo.RANK_MAX, this.f13057l);
                    if (m8739a((View) v, this.f13065t.getYVelocity(this.f13055j))) {
                        i2 = this.f13051f;
                        i = 5;
                        if (this.f13050e.m1565a((View) v, v.getLeft(), i2)) {
                            m8744d(2);
                            C0571r.m1343a((View) v, new C0266b(this, v, i));
                        } else {
                            m8744d(i);
                        }
                        this.f13064s = false;
                    }
                }
                if (this.f13063r == 0) {
                    i2 = v.getTop();
                    if (Math.abs(i2 - this.f13046a) < Math.abs(i2 - this.f13047b)) {
                    }
                }
                i2 = this.f13047b;
                i = 4;
                if (this.f13050e.m1565a((View) v, v.getLeft(), i2)) {
                    m8744d(i);
                } else {
                    m8744d(2);
                    C0571r.m1343a((View) v, new C0266b(this, v, i));
                }
                this.f13064s = false;
            }
            i2 = this.f13046a;
            if (this.f13050e.m1565a((View) v, v.getLeft(), i2)) {
                m8744d(2);
                C0571r.m1343a((View) v, new C0266b(this, v, i));
            } else {
                m8744d(i);
            }
            this.f13064s = false;
        }
    }

    public final boolean mo151a(int i) {
        this.f13063r = 0;
        this.f13064s = false;
        return (i & 2) != 0;
    }

    public final boolean mo152a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (C0571r.m1386w(coordinatorLayout) && !C0571r.m1386w(v)) {
            C0571r.m1354b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.m14912a((View) v, i);
        this.f13051f = coordinatorLayout.getHeight();
        if (this.f13059n) {
            if (this.f13060o == 0) {
                this.f13060o = coordinatorLayout.getResources().getDimensionPixelSize(C0241d.design_bottom_sheet_peek_height_min);
            }
            i = Math.max(this.f13060o, this.f13051f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i = this.f13058m;
        }
        this.f13046a = Math.max(0, this.f13051f - v.getHeight());
        this.f13047b = Math.max(this.f13051f - i, this.f13046a);
        if (this.f13049d == 3) {
            i = this.f13046a;
        } else if (this.f13048c && this.f13049d == 5) {
            i = this.f13051f;
        } else if (this.f13049d == 4) {
            i = this.f13047b;
        } else {
            if (this.f13049d == 1 || this.f13049d == 2) {
                C0571r.m1359d((View) v, top - v.getTop());
            }
            if (this.f13050e == null) {
                this.f13050e = C0634p.m1546a((ViewGroup) coordinatorLayout, this.f13067v);
            }
            this.f13052g = new WeakReference(v);
            this.f13053h = new WeakReference(m8729c((View) v));
            return true;
        }
        C0571r.m1359d((View) v, i);
        if (this.f13050e == null) {
            this.f13050e = C0634p.m1546a((ViewGroup) coordinatorLayout, this.f13067v);
        }
        this.f13052g = new WeakReference(v);
        this.f13053h = new WeakReference(m8729c((View) v));
        return true;
    }

    public final boolean mo153a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m8728b();
            }
            if (this.f13065t == null) {
                this.f13065t = VelocityTracker.obtain();
            }
            this.f13065t.addMovement(motionEvent);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x = (int) motionEvent.getX();
                        this.f13066u = (int) motionEvent.getY();
                        View view = this.f13053h != null ? (View) this.f13053h.get() : null;
                        if (view != null && coordinatorLayout.m14916a(view, x, this.f13066u)) {
                            this.f13055j = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.f13056k = true;
                        }
                        boolean z = this.f13055j == -1 && !coordinatorLayout.m14916a((View) v, x, this.f13066u);
                        this.f13062q = z;
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            this.f13056k = false;
            this.f13055j = -1;
            if (this.f13062q) {
                this.f13062q = false;
                return false;
            }
            if (!this.f13062q && this.f13050e.m1564a(motionEvent)) {
                return true;
            }
            View view2 = (View) this.f13053h.get();
            return (actionMasked != 2 || view2 == null || this.f13062q || this.f13049d == 1 || coordinatorLayout.m14916a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || Math.abs(((float) this.f13066u) - motionEvent.getY()) <= ((float) this.f13050e.f2062b)) ? false : true;
        } else {
            this.f13062q = true;
            return false;
        }
    }

    public final boolean mo154a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f13053h.get() && (this.f13049d != 3 || super.mo154a(coordinatorLayout, (View) v, view, f, f2));
    }

    final boolean m8739a(View view, float f) {
        return this.f13061p ? true : view.getTop() >= this.f13047b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f13047b)) / ((float) this.f13058m) > 0.5f;
    }

    public final Parcelable mo155b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo155b(coordinatorLayout, v), this.f13049d);
    }

    public final void m8741b(int i) {
        boolean z = true;
        if (i != -1) {
            if (!this.f13059n) {
                if (this.f13058m != i) {
                }
            }
            this.f13059n = false;
            this.f13058m = Math.max(0, i);
            this.f13047b = this.f13051f - i;
            if (!z) {
            }
        } else if (!this.f13059n) {
            this.f13059n = true;
            if (!z && this.f13049d == 4 && this.f13052g != null) {
                View view = (View) this.f13052g.get();
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    public final boolean mo156b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13049d == 1 && actionMasked == 0) {
            return true;
        }
        this.f13050e.m1569b(motionEvent);
        if (actionMasked == 0) {
            m8728b();
        }
        if (this.f13065t == null) {
            this.f13065t = VelocityTracker.obtain();
        }
        this.f13065t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f13062q && Math.abs(((float) this.f13066u) - motionEvent.getY()) > ((float) this.f13050e.f2062b)) {
            this.f13050e.m1561a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f13062q;
    }

    public final void m8743c(final int i) {
        if (i != this.f13049d) {
            if (this.f13052g == null) {
                if (i == 4 || i == 3 || (this.f13048c && i == 5)) {
                    this.f13049d = i;
                }
                return;
            }
            final View view = (View) this.f13052g.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && C0571r.m1329G(view)) {
                    view.post(new Runnable(this) {
                        final /* synthetic */ BottomSheetBehavior f956c;

                        public final void run() {
                            this.f956c.m8733a(view, i);
                        }
                    });
                } else {
                    m8733a(view, i);
                }
            }
        }
    }

    final void m8744d(int i) {
        if (this.f13049d != i) {
            this.f13049d = i;
            if (!(((View) this.f13052g.get()) == null || this.f13054i == null)) {
                this.f13054i.mo187a(i);
            }
        }
    }
}
