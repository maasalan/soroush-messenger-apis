package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0249a.C0239b;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.design.widget.CoordinatorLayout.C0270a;
import android.support.design.widget.CoordinatorLayout.C0271b;
import android.support.design.widget.CoordinatorLayout.C0273d;
import android.support.v4.p035d.C0443a;
import android.support.v4.p038g.C0477i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

@C0271b(a = Behavior.class)
public class AppBarLayout extends LinearLayout {
    boolean f936a;
    int f937b;
    C0582z f938c;
    List<C0259b> f939d;
    boolean f940e;
    private int f941f;
    private int f942g;
    private int f943h;
    private boolean f944i;
    private int[] f945j;

    public static class C0258a extends LayoutParams {
        public int f934a = 1;
        Interpolator f935b;

        public C0258a() {
            super(-1, -2);
        }

        public C0258a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.AppBarLayout_Layout);
            this.f934a = obtainStyledAttributes.getInt(C0248k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C0248k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f935b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C0248k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C0258a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0258a(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0258a(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface C0259b {
        void mo158a(int i);
    }

    class C47311 implements C0564m {
        final /* synthetic */ AppBarLayout f13039a;

        C47311(AppBarLayout appBarLayout) {
            this.f13039a = appBarLayout;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            view = this.f13039a;
            C0582z c0582z2 = C0571r.m1386w(view) ? c0582z : null;
            if (!C0477i.m1005a(view.f938c, c0582z2)) {
                view.f938c = c0582z2;
                view.m474a();
            }
            return c0582z;
        }
    }

    public static class Behavior extends C6352l<AppBarLayout> {
        private int f20025b;
        private ValueAnimator f20026c;
        private int f20027d = -1;
        private boolean f20028e;
        private float f20029f;
        private WeakReference<View> f20030g;
        private C0257a f20031h;

        public static abstract class C0257a {
            public abstract boolean m470a();
        }

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C02561();
            int f13040a;
            float f13041b;
            boolean f13042c;

            static class C02561 implements ClassLoaderCreator<SavedState> {
                C02561() {
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
                this.f13040a = parcel.readInt();
                this.f13041b = parcel.readFloat();
                this.f13042c = parcel.readByte() != (byte) 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f13040a);
                parcel.writeFloat(this.f13041b);
                parcel.writeByte((byte) this.f13042c);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void m18071a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = mo3265a();
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int i2 = -a;
                if (childAt.getTop() <= i2 && childAt.getBottom() >= i2) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                int i3 = ((C0258a) childAt2.getLayoutParams()).f934a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    i2 = -childAt2.getBottom();
                    if (i == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m18074a(i3, 2)) {
                        i2 += C0571r.m1379p(childAt2);
                    } else if (m18074a(i3, 5)) {
                        childCount = C0571r.m1379p(childAt2) + i2;
                        if (a < childCount) {
                            i4 = childCount;
                        } else {
                            i2 = childCount;
                        }
                    }
                    if (a < (i2 + i4) / 2) {
                        i4 = i2;
                    }
                    m18072a(coordinatorLayout, appBarLayout, C0443a.m943a(i4, -appBarLayout.getTotalScrollRange(), 0));
                }
            }
        }

        private void m18072a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(mo3265a() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? 3 * Math.round(1000.0f * (((float) abs) / abs2)) : (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + BallPulseIndicator.SCALE) * 150.0f);
            if (mo3265a() == i) {
                if (this.f20026c != null && this.f20026c.isRunning()) {
                    this.f20026c.cancel();
                }
                return;
            }
            if (this.f20026c == null) {
                this.f20026c = new ValueAnimator();
                this.f20026c.setInterpolator(C0296a.f1127e);
                this.f20026c.addUpdateListener(new AnimatorUpdateListener(this) {
                    final /* synthetic */ Behavior f933c;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f933c.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f20026c.cancel();
            }
            this.f20026c.setDuration((long) Math.min(round, IjkMediaCodecInfo.RANK_LAST_CHANCE));
            this.f20026c.setIntValues(new int[]{abs, i});
            this.f20026c.start();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m18073a(android.support.design.widget.CoordinatorLayout r6, android.support.design.widget.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
            r0 = java.lang.Math.abs(r8);
            r1 = r7.getChildCount();
            r2 = 0;
            r3 = r2;
        L_0x000a:
            if (r3 >= r1) goto L_0x0020;
        L_0x000c:
            r4 = r7.getChildAt(r3);
            r5 = r4.getTop();
            if (r0 < r5) goto L_0x001d;
        L_0x0016:
            r5 = r4.getBottom();
            if (r0 > r5) goto L_0x001d;
        L_0x001c:
            goto L_0x0021;
        L_0x001d:
            r3 = r3 + 1;
            goto L_0x000a;
        L_0x0020:
            r4 = 0;
        L_0x0021:
            if (r4 == 0) goto L_0x00af;
        L_0x0023:
            r0 = r4.getLayoutParams();
            r0 = (android.support.design.widget.AppBarLayout.C0258a) r0;
            r0 = r0.f934a;
            r1 = r0 & 1;
            r3 = 1;
            if (r1 == 0) goto L_0x005b;
        L_0x0030:
            r1 = android.support.v4.view.C0571r.m1379p(r4);
            if (r9 <= 0) goto L_0x0049;
        L_0x0036:
            r9 = r0 & 12;
            if (r9 == 0) goto L_0x0049;
        L_0x003a:
            r8 = -r8;
            r9 = r4.getBottom();
            r9 = r9 - r1;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x005b;
        L_0x0047:
            r8 = r3;
            goto L_0x005c;
        L_0x0049:
            r9 = r0 & 2;
            if (r9 == 0) goto L_0x005b;
        L_0x004d:
            r8 = -r8;
            r9 = r4.getBottom();
            r9 = r9 - r1;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x005b;
        L_0x005a:
            goto L_0x0047;
        L_0x005b:
            r8 = r2;
        L_0x005c:
            r9 = r7.f940e;
            if (r9 == r8) goto L_0x0067;
        L_0x0060:
            r7.f940e = r8;
            r7.refreshDrawableState();
            r8 = r3;
            goto L_0x0068;
        L_0x0067:
            r8 = r2;
        L_0x0068:
            r9 = android.os.Build.VERSION.SDK_INT;
            r0 = 11;
            if (r9 < r0) goto L_0x00af;
        L_0x006e:
            if (r10 != 0) goto L_0x00ac;
        L_0x0070:
            if (r8 == 0) goto L_0x00af;
        L_0x0072:
            r8 = r6.f17356e;
            r8 = r8.m611b(r7);
            r9 = r6.f17357f;
            r9.clear();
            if (r8 == 0) goto L_0x0084;
        L_0x007f:
            r9 = r6.f17357f;
            r9.addAll(r8);
        L_0x0084:
            r6 = r6.f17357f;
            r8 = r6.size();
            r9 = r2;
        L_0x008b:
            if (r9 >= r8) goto L_0x00aa;
        L_0x008d:
            r10 = r6.get(r9);
            r10 = (android.view.View) r10;
            r10 = r10.getLayoutParams();
            r10 = (android.support.design.widget.CoordinatorLayout.C0273d) r10;
            r10 = r10.f987a;
            r0 = r10 instanceof android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
            if (r0 == 0) goto L_0x00a7;
        L_0x009f:
            r10 = (android.support.design.widget.AppBarLayout.ScrollingViewBehavior) r10;
            r6 = r10.f17390d;
            if (r6 == 0) goto L_0x00aa;
        L_0x00a5:
            r2 = r3;
            goto L_0x00aa;
        L_0x00a7:
            r9 = r9 + 1;
            goto L_0x008b;
        L_0x00aa:
            if (r2 == 0) goto L_0x00af;
        L_0x00ac:
            r7.jumpDrawablesToCurrentState();
        L_0x00af:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        private static boolean m18074a(int i, int i2) {
            return (i & i2) == i2;
        }

        final int mo3265a() {
            return super.mo3276c() + this.f20025b;
        }

        final /* synthetic */ int mo3266a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int a = mo3265a();
            if (i2 == 0 || a < i2 || a > i3) {
                this.f20025b = 0;
            } else {
                i = C0443a.m943a(i, i2, i3);
                if (a != i) {
                    int i4;
                    View childAt;
                    boolean a_;
                    List b;
                    C0270a c0270a;
                    if (appBarLayout.f936a) {
                        i2 = Math.abs(i);
                        i3 = appBarLayout.getChildCount();
                        i4 = 0;
                        while (i4 < i3) {
                            childAt = appBarLayout.getChildAt(i4);
                            C0258a c0258a = (C0258a) childAt.getLayoutParams();
                            Interpolator interpolator = c0258a.f935b;
                            if (i2 < childAt.getTop() || i2 > childAt.getBottom()) {
                                i4++;
                            } else if (interpolator != null) {
                                i3 = c0258a.f934a;
                                if ((i3 & 1) != 0) {
                                    i4 = ((childAt.getHeight() + c0258a.topMargin) + c0258a.bottomMargin) + 0;
                                    i3 = (i3 & 2) != 0 ? i4 - C0571r.m1379p(childAt) : i4;
                                } else {
                                    i3 = 0;
                                }
                                if (C0571r.m1386w(childAt)) {
                                    i3 -= appBarLayout.getTopInset();
                                }
                                if (i3 > 0) {
                                    float f = (float) i3;
                                    i2 = Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation(((float) (i2 - childAt.getTop())) / f)));
                                    a_ = super.a_(i2);
                                    i4 = a - i;
                                    this.f20025b = i - i2;
                                    if (!a_ && appBarLayout.f936a) {
                                        b = coordinatorLayout.f17356e.m611b(appBarLayout);
                                        if (!(b == null || b.isEmpty())) {
                                            for (i3 = 0; i3 < b.size(); i3++) {
                                                childAt = (View) b.get(i3);
                                                c0270a = ((C0273d) childAt.getLayoutParams()).f987a;
                                                if (c0270a != null) {
                                                    c0270a.mo160a(coordinatorLayout, childAt, (View) appBarLayout);
                                                }
                                            }
                                        }
                                    }
                                    appBarLayout.m475a(super.mo3276c());
                                    m18073a(coordinatorLayout, appBarLayout, i, i >= a ? -1 : 1, false);
                                    return i4;
                                }
                            }
                        }
                    }
                    i2 = i;
                    a_ = super.a_(i2);
                    i4 = a - i;
                    this.f20025b = i - i2;
                    b = coordinatorLayout.f17356e.m611b(appBarLayout);
                    for (i3 = 0; i3 < b.size(); i3++) {
                        childAt = (View) b.get(i3);
                        c0270a = ((C0273d) childAt.getLayoutParams()).f987a;
                        if (c0270a != null) {
                            c0270a.mo160a(coordinatorLayout, childAt, (View) appBarLayout);
                        }
                    }
                    appBarLayout.m475a(super.mo3276c());
                    if (i >= a) {
                    }
                    m18073a(coordinatorLayout, appBarLayout, i, i >= a ? -1 : 1, false);
                    return i4;
                }
            }
            return 0;
        }

        final /* synthetic */ int mo3267a(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        public final /* synthetic */ void mo148a(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo148a(coordinatorLayout, (View) appBarLayout, savedState.getSuperState());
                this.f20027d = savedState.f13040a;
                this.f20029f = savedState.f13041b;
                this.f20028e = savedState.f13042c;
                return;
            }
            super.mo148a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f20027d = -1;
        }

        public final /* synthetic */ void mo3269a(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i == 0) {
                m18071a(coordinatorLayout, appBarLayout);
            }
            this.f20030g = new WeakReference(view2);
        }

        public final /* synthetic */ void mo3270a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i4 < 0) {
                m14930b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        public final /* synthetic */ void mo3271a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i2 != 0) {
                int i4;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = m14930b(coordinatorLayout, appBarLayout, i2, i5, i6);
                }
            }
        }

        public final /* synthetic */ boolean mo152a(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean a = super.mo152a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f20027d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f20027d);
                a_(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f20028e ? C0571r.m1379p(childAt) + appBarLayout.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f20029f)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -appBarLayout.getUpNestedPreScrollRange();
                    if (z) {
                        m18072a(coordinatorLayout, appBarLayout, pendingAction);
                    } else {
                        a_(coordinatorLayout, appBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m18072a(coordinatorLayout, appBarLayout, 0);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f937b = 0;
            this.f20027d = -1;
            super.a_(C0443a.m943a(super.mo3276c(), -appBarLayout.getTotalScrollRange(), 0));
            m18073a(coordinatorLayout, appBarLayout, super.mo3276c(), 0, true);
            appBarLayout.m475a(super.mo3276c());
            return a;
        }

        public final /* synthetic */ boolean mo2519a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            View view2 = (AppBarLayout) view;
            if (((C0273d) view2.getLayoutParams()).height != -2) {
                return super.mo2519a(coordinatorLayout, view2, i, i2, i3, i4);
            }
            coordinatorLayout.m14913a(view2, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public final /* synthetic */ boolean mo3272a(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0) {
                if ((appBarLayout.getTotalScrollRange() != 0) && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()) {
                    z = true;
                }
            }
            if (z && this.f20026c != null) {
                this.f20026c.cancel();
            }
            this.f20030g = null;
            return z;
        }

        public final /* bridge */ /* synthetic */ boolean a_(int i) {
            return super.a_(i);
        }

        final /* synthetic */ int mo3274b(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        public final /* synthetic */ Parcelable mo155b(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            Parcelable b = super.mo155b(coordinatorLayout, appBarLayout);
            int c = super.mo3276c();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    Parcelable savedState = new SavedState(b);
                    savedState.f13040a = i;
                    if (bottom == C0571r.m1379p(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.f13042c = z;
                    savedState.f13041b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return b;
        }

        final /* synthetic */ boolean mo3275b() {
            if (this.f20031h != null) {
                return this.f20031h.m470a();
            }
            if (this.f20030g != null) {
                View view = (View) this.f20030g.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    return false;
                }
            }
            return true;
        }

        public final /* bridge */ /* synthetic */ int mo3276c() {
            return super.mo3276c();
        }
    }

    public static class ScrollingViewBehavior extends C6353m {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.ScrollingViewBehavior_Layout);
            this.f17390d = obtainStyledAttributes.getDimensionPixelSize(C0248k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0);
            obtainStyledAttributes.recycle();
        }

        private static AppBarLayout m18090b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        final /* synthetic */ View mo3277a(List list) {
            return m18090b(list);
        }

        public final /* bridge */ /* synthetic */ boolean mo2519a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2519a(coordinatorLayout, view, i, i2, i3, i4);
        }

        public final boolean mo3278a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout b = m18090b(coordinatorLayout.m14910a(view));
            if (b != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    b.m477a(false, z ^ 1, true);
                    return true;
                }
            }
            return false;
        }

        public final boolean mo160a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            C0270a c0270a = ((C0273d) view2.getLayoutParams()).f987a;
            if (c0270a instanceof Behavior) {
                C0571r.m1359d(view, (((view2.getBottom() - view.getTop()) + ((Behavior) c0270a).f20025b) + this.f17389c) - m14939d(view2));
            }
            return false;
        }

        public final boolean a_(View view) {
            return view instanceof AppBarLayout;
        }

        final float mo3279b(View view) {
            float f = 0.0f;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                C0270a c0270a = ((C0273d) appBarLayout.getLayoutParams()).f987a;
                int a = c0270a instanceof Behavior ? ((Behavior) c0270a).mo3265a() : 0;
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                totalScrollRange -= downNestedPreScrollRange;
                if (totalScrollRange != 0) {
                    f = BallPulseIndicator.SCALE + (((float) a) / ((float) totalScrollRange));
                }
            }
            return f;
        }

        public final /* bridge */ /* synthetic */ int mo3276c() {
            return super.mo3276c();
        }

        final int mo3280c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo3280c(view);
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f941f = -1;
        this.f942g = -1;
        this.f943h = -1;
        this.f937b = 0;
        setOrientation(1);
        C0330t.m650a(context);
        if (VERSION.SDK_INT >= 21) {
            C0334y.m657a(this);
            C0334y.m659a(this, attributeSet, C0247j.Widget_Design_AppBarLayout);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.AppBarLayout, 0, C0247j.Widget_Design_AppBarLayout);
        C0571r.m1339a((View) this, obtainStyledAttributes.getDrawable(C0248k.AppBarLayout_android_background));
        if (obtainStyledAttributes.hasValue(C0248k.AppBarLayout_expanded)) {
            m477a(obtainStyledAttributes.getBoolean(C0248k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && obtainStyledAttributes.hasValue(C0248k.AppBarLayout_elevation)) {
            C0334y.m658a(this, (float) obtainStyledAttributes.getDimensionPixelSize(C0248k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (obtainStyledAttributes.hasValue(C0248k.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(obtainStyledAttributes.getBoolean(C0248k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (obtainStyledAttributes.hasValue(C0248k.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(obtainStyledAttributes.getBoolean(C0248k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        obtainStyledAttributes.recycle();
        C0571r.m1341a((View) this, new C47311(this));
    }

    private C0258a m472a(AttributeSet attributeSet) {
        return new C0258a(getContext(), attributeSet);
    }

    private static C0258a m473a(ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new C0258a((MarginLayoutParams) layoutParams) : new C0258a(layoutParams) : new C0258a((LayoutParams) layoutParams);
    }

    final void m474a() {
        this.f941f = -1;
        this.f942g = -1;
        this.f943h = -1;
    }

    final void m475a(int i) {
        if (this.f939d != null) {
            int size = this.f939d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0259b c0259b = (C0259b) this.f939d.get(i2);
                if (c0259b != null) {
                    c0259b.mo158a(i);
                }
            }
        }
    }

    public final void m476a(C0259b c0259b) {
        if (this.f939d == null) {
            this.f939d = new ArrayList();
        }
        if (c0259b != null && !this.f939d.contains(c0259b)) {
            this.f939d.add(c0259b);
        }
    }

    final void m477a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f937b = i2 | i;
        requestLayout();
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0258a;
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0258a();
    }

    protected /* synthetic */ LayoutParams m22237generateDefaultLayoutParams() {
        return new C0258a();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m472a(attributeSet);
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m473a(layoutParams);
    }

    public /* synthetic */ LayoutParams m22238generateLayoutParams(AttributeSet attributeSet) {
        return m472a(attributeSet);
    }

    protected /* synthetic */ LayoutParams m22239generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m473a(layoutParams);
    }

    int getDownNestedPreScrollRange() {
        if (this.f942g != -1) {
            return this.f942g;
        }
        int childCount;
        int i = 0;
        for (childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C0258a c0258a = (C0258a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = c0258a.f934a;
            if ((i2 & 5) != 5) {
                if (i > 0) {
                    break;
                }
            } else {
                i += c0258a.topMargin + c0258a.bottomMargin;
                if ((i2 & 8) != 0) {
                    i += C0571r.m1379p(childAt);
                } else {
                    i += measuredHeight - ((i2 & 2) != 0 ? C0571r.m1379p(childAt) : getTopInset());
                }
            }
        }
        childCount = Math.max(0, i);
        this.f942g = childCount;
        return childCount;
    }

    int getDownNestedScrollRange() {
        if (this.f943h != -1) {
            return this.f943h;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = i;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C0258a c0258a = (C0258a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (c0258a.topMargin + c0258a.bottomMargin);
            int i3 = c0258a.f934a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += measuredHeight;
            if ((i3 & 2) != 0) {
                i2 -= C0571r.m1379p(childAt) + getTopInset();
                break;
            }
            i++;
        }
        childCount = Math.max(0, i2);
        this.f943h = childCount;
        return childCount;
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int p = C0571r.m1379p(this);
        if (p == 0) {
            p = getChildCount();
            p = p > 0 ? C0571r.m1379p(getChildAt(p - 1)) : 0;
            if (p == 0) {
                return getHeight() / 3;
            }
        }
        return (p * 2) + topInset;
    }

    int getPendingAction() {
        return this.f937b;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        return this.f938c != null ? this.f938c.m1428b() : 0;
    }

    public final int getTotalScrollRange() {
        if (this.f941f != -1) {
            return this.f941f;
        }
        int childCount = getChildCount();
        int i = 0;
        int i2 = i;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C0258a c0258a = (C0258a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = c0258a.f934a;
            if ((i3 & 1) == 0) {
                break;
            }
            i2 += (measuredHeight + c0258a.topMargin) + c0258a.bottomMargin;
            if ((i3 & 2) != 0) {
                i2 -= C0571r.m1379p(childAt);
                break;
            }
            i++;
        }
        childCount = Math.max(0, i2 - getTopInset());
        this.f941f = childCount;
        return childCount;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    protected int[] onCreateDrawableState(int i) {
        if (this.f945j == null) {
            this.f945j = new int[2];
        }
        int[] iArr = this.f945j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f944i ? C0239b.state_collapsible : -C0239b.state_collapsible;
        int i2 = (this.f944i && this.f940e) ? C0239b.state_collapsed : -C0239b.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m474a();
        z = false;
        this.f936a = false;
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            if (((C0258a) getChildAt(i2).getLayoutParams()).f935b != null) {
                this.f936a = true;
                break;
            }
        }
        i = getChildCount();
        for (i2 = 0; i2 < i; i2++) {
            C0258a c0258a = (C0258a) getChildAt(i2).getLayoutParams();
            boolean z2 = (c0258a.f934a & 1) == 1 && (c0258a.f934a & 10) != 0;
            if (z2) {
                z = true;
                break;
            }
        }
        if (this.f944i != z) {
            this.f944i = z;
            refreshDrawableState();
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m474a();
    }

    public void setExpanded(boolean z) {
        m477a(z, C0571r.m1326D(this), true);
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0334y.m658a(this, f);
        }
    }
}
