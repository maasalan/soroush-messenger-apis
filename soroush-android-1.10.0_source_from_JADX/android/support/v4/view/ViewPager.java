package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.p029a.C0346c;
import android.support.v4.view.p039a.C0536b;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class ViewPager extends ViewGroup {
    static final int[] f1748a = new int[]{16842931};
    private static final C0526i ai = new C0526i();
    private static final Comparator<C0520b> f1749g = new C05151();
    private static final Interpolator f1750h = new C05162();
    private boolean f1751A;
    private boolean f1752B;
    private int f1753C = 1;
    private boolean f1754D;
    private boolean f1755E;
    private int f1756F;
    private int f1757G;
    private int f1758H;
    private float f1759I;
    private float f1760J;
    private float f1761K;
    private float f1762L;
    private int f1763M = -1;
    private VelocityTracker f1764N;
    private int f1765O;
    private int f1766P;
    private int f1767Q;
    private int f1768R;
    private boolean f1769S;
    private EdgeEffect f1770T;
    private EdgeEffect f1771U;
    private boolean f1772V = true;
    private boolean f1773W = false;
    private boolean aa;
    private int ab;
    private C0523f ac;
    private C0523f ad;
    private C0524g ae;
    private int af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj = new C05173(this);
    private int ak = 0;
    C0565n f1774b;
    int f1775c;
    public List<C0523f> f1776d;
    public List<C0522e> f1777e;
    private int f1778f;
    private final ArrayList<C0520b> f1779i = new ArrayList();
    private final C0520b f1780j = new C0520b();
    private final Rect f1781k = new Rect();
    private int f1782l = -1;
    private Parcelable f1783m = null;
    private ClassLoader f1784n = null;
    private Scroller f1785o;
    private boolean f1786p;
    private C0525h f1787q;
    private int f1788r;
    private Drawable f1789s;
    private int f1790t;
    private int f1791u;
    private float f1792v = -3.4028235E38f;
    private float f1793w = Float.MAX_VALUE;
    private int f1794x;
    private int f1795y;
    private boolean f1796z;

    static class C05151 implements Comparator<C0520b> {
        C05151() {
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C0520b) obj).f1737b - ((C0520b) obj2).f1737b;
        }
    }

    static class C05162 implements Interpolator {
        C05162() {
        }

        public final float getInterpolation(float f) {
            f -= BallPulseIndicator.SCALE;
            return ((((f * f) * f) * f) * f) + BallPulseIndicator.SCALE;
        }
    }

    class C05173 implements Runnable {
        final /* synthetic */ ViewPager f1735a;

        C05173(ViewPager viewPager) {
            this.f1735a = viewPager;
        }

        public final void run() {
            this.f1735a.setScrollState(0);
            this.f1735a.m1156b();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface C0519a {
    }

    static class C0520b {
        Object f1736a;
        int f1737b;
        boolean f1738c;
        float f1739d;
        float f1740e;

        C0520b() {
        }
    }

    public static class C0521c extends LayoutParams {
        public boolean f1741a;
        public int f1742b;
        float f1743c = 0.0f;
        boolean f1744d;
        int f1745e;
        int f1746f;

        public C0521c() {
            super(-1, -1);
        }

        public C0521c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1748a);
            this.f1742b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface C0522e {
        void mo172a(ViewPager viewPager, C0565n c0565n);
    }

    public interface C0523f {
        void mo173a(int i);

        void mo174a(int i, float f, int i2);

        void mo175b(int i);
    }

    public interface C0524g {
    }

    private class C0525h extends DataSetObserver {
        final /* synthetic */ ViewPager f1747a;

        C0525h(ViewPager viewPager) {
            this.f1747a = viewPager;
        }

        public final void onChanged() {
            this.f1747a.m1153a();
        }

        public final void onInvalidated() {
            this.f1747a.m1153a();
        }
    }

    static class C0526i implements Comparator<View> {
        C0526i() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C0521c c0521c = (C0521c) ((View) obj).getLayoutParams();
            C0521c c0521c2 = (C0521c) ((View) obj2).getLayoutParams();
            return c0521c.f1741a != c0521c2.f1741a ? c0521c.f1741a ? 1 : -1 : c0521c.f1745e - c0521c2.f1745e;
        }
    }

    class C48254 implements C0564m {
        final /* synthetic */ ViewPager f13404a;
        private final Rect f13405b = new Rect();

        C48254(ViewPager viewPager) {
            this.f13404a = viewPager;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            C0582z a = C0571r.m1332a(view, c0582z);
            if (a.m1431e()) {
                return a;
            }
            Rect rect = this.f13405b;
            rect.left = a.m1426a();
            rect.top = a.m1428b();
            rect.right = a.m1429c();
            rect.bottom = a.m1430d();
            int childCount = this.f13404a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0582z b = C0571r.m1350b(this.f13404a.getChildAt(i), a);
                rect.left = Math.min(b.m1426a(), rect.left);
                rect.top = Math.min(b.m1428b(), rect.top);
                rect.right = Math.min(b.m1429c(), rect.right);
                rect.bottom = Math.min(b.m1430d(), rect.bottom);
            }
            return a.m1427a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05181();
        int f13406a;
        Parcelable f13407b;
        ClassLoader f13408c;

        static class C05181 implements ClassLoaderCreator<SavedState> {
            C05181() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f13406a = parcel.readInt();
            this.f13407b = parcel.readParcelable(classLoader);
            this.f13408c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.f13406a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13406a);
            parcel.writeParcelable(this.f13407b, i);
        }
    }

    class C4826d extends C0547a {
        final /* synthetic */ ViewPager f13409a;

        C4826d(ViewPager viewPager) {
            this.f13409a = viewPager;
        }

        private boolean m9279a() {
            return this.f13409a.f1774b != null && this.f13409a.f1774b.mo2270b() > 1;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m9279a());
            if (accessibilityEvent.getEventType() == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT && this.f13409a.f1774b != null) {
                accessibilityEvent.setItemCount(this.f13409a.f1774b.mo2270b());
                accessibilityEvent.setFromIndex(this.f13409a.f1775c);
                accessibilityEvent.setToIndex(this.f13409a.f1775c);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            c0536b.m1195a(ViewPager.class.getName());
            c0536b.m1202d(m9279a());
            if (this.f13409a.canScrollHorizontally(1)) {
                c0536b.m1192a((int) ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (this.f13409a.canScrollHorizontally(-1)) {
                c0536b.m1192a(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager;
            if (i != ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
                if (i != 8192 || !this.f13409a.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = this.f13409a;
                i = this.f13409a.f1775c - 1;
            } else if (!this.f13409a.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = this.f13409a;
                i = this.f13409a.f1775c + 1;
            }
            viewPager.setCurrentItem(i);
            return true;
        }
    }

    public ViewPager(Context context) {
        super(context);
        m1143c();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1143c();
    }

    private Rect m1127a(Rect rect, View view) {
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
        ViewPager parent = view.getParent();
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

    private C0520b m1128a(int i, int i2) {
        C0520b c0520b = new C0520b();
        c0520b.f1737b = i;
        c0520b.f1736a = this.f1774b.mo208a((ViewGroup) this, i);
        c0520b.f1739d = BallPulseIndicator.SCALE;
        if (i2 >= 0) {
            if (i2 < this.f1779i.size()) {
                this.f1779i.add(i2, c0520b);
                return c0520b;
            }
        }
        this.f1779i.add(c0520b);
        return c0520b;
    }

    private C0520b m1129a(View view) {
        for (int i = 0; i < this.f1779i.size(); i++) {
            C0520b c0520b = (C0520b) this.f1779i.get(i);
            if (this.f1774b.mo213a(view, c0520b.f1736a)) {
                return c0520b;
            }
        }
        return null;
    }

    private void m1130a(int r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r0.f1775c;
        if (r2 == r1) goto L_0x0011;
    L_0x0008:
        r2 = r0.f1775c;
        r2 = r0.m1141b(r2);
        r0.f1775c = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = 0;
    L_0x0012:
        r1 = r0.f1774b;
        if (r1 != 0) goto L_0x001a;
    L_0x0016:
        r18.m1145d();
        return;
    L_0x001a:
        r1 = r0.f1752B;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r18.m1145d();
        return;
    L_0x0022:
        r1 = r18.getWindowToken();
        if (r1 != 0) goto L_0x0029;
    L_0x0028:
        return;
    L_0x0029:
        r1 = r0.f1774b;
        r1.mo210a(r0);
        r1 = r0.f1753C;
        r4 = r0.f1775c;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.f1774b;
        r6 = r6.mo2270b();
        r7 = r6 + -1;
        r8 = r0.f1775c;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.f1778f;
        if (r6 == r7) goto L_0x00a0;
    L_0x004b:
        r1 = r18.getResources();	 Catch:{ NotFoundException -> 0x0058 }
        r2 = r18.getId();	 Catch:{ NotFoundException -> 0x0058 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0058 }
        goto L_0x0060;
    L_0x0058:
        r1 = r18.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x0060:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.<init>(r4);
        r4 = r0.f1778f;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r18.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.f1774b;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x00a0:
        r7 = r5;
    L_0x00a1:
        r8 = r0.f1779i;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x00c1;
    L_0x00a9:
        r8 = r0.f1779i;
        r8 = r8.get(r7);
        r8 = (android.support.v4.view.ViewPager.C0520b) r8;
        r9 = r8.f1737b;
        r10 = r0.f1775c;
        if (r9 < r10) goto L_0x00be;
    L_0x00b7:
        r9 = r8.f1737b;
        r10 = r0.f1775c;
        if (r9 != r10) goto L_0x00c1;
    L_0x00bd:
        goto L_0x00c2;
    L_0x00be:
        r7 = r7 + 1;
        goto L_0x00a1;
    L_0x00c1:
        r8 = 0;
    L_0x00c2:
        if (r8 != 0) goto L_0x00cc;
    L_0x00c4:
        if (r6 <= 0) goto L_0x00cc;
    L_0x00c6:
        r8 = r0.f1775c;
        r8 = r0.m1128a(r8, r7);
    L_0x00cc:
        r9 = 0;
        if (r8 == 0) goto L_0x01cf;
    L_0x00cf:
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x00dc;
    L_0x00d3:
        r11 = r0.f1779i;
        r11 = r11.get(r10);
        r11 = (android.support.v4.view.ViewPager.C0520b) r11;
        goto L_0x00dd;
    L_0x00dc:
        r11 = 0;
    L_0x00dd:
        r12 = r18.getClientWidth();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 > 0) goto L_0x00e7;
    L_0x00e5:
        r3 = r9;
        goto L_0x00f4;
    L_0x00e7:
        r14 = r8.f1739d;
        r14 = r13 - r14;
        r15 = r18.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
    L_0x00f4:
        r14 = r0.f1775c;
        r14 = r14 + -1;
        r15 = r10;
        r10 = r7;
        r7 = r9;
    L_0x00fb:
        if (r14 < 0) goto L_0x014a;
    L_0x00fd:
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x0120;
    L_0x0101:
        if (r14 >= r4) goto L_0x0120;
    L_0x0103:
        if (r11 == 0) goto L_0x014a;
    L_0x0105:
        r5 = r11.f1737b;
        if (r14 != r5) goto L_0x0146;
    L_0x0109:
        r5 = r11.f1738c;
        if (r5 != 0) goto L_0x0146;
    L_0x010d:
        r5 = r0.f1779i;
        r5.remove(r15);
        r5 = r0.f1774b;
        r11 = r11.f1736a;
        r5.mo211a(r0, r14, r11);
        r15 = r15 + -1;
        r10 = r10 + -1;
        if (r15 < 0) goto L_0x0144;
    L_0x011f:
        goto L_0x013b;
    L_0x0120:
        if (r11 == 0) goto L_0x012e;
    L_0x0122:
        r5 = r11.f1737b;
        if (r14 != r5) goto L_0x012e;
    L_0x0126:
        r5 = r11.f1739d;
        r7 = r7 + r5;
        r15 = r15 + -1;
        if (r15 < 0) goto L_0x0144;
    L_0x012d:
        goto L_0x013b;
    L_0x012e:
        r5 = r15 + 1;
        r5 = r0.m1128a(r14, r5);
        r5 = r5.f1739d;
        r7 = r7 + r5;
        r10 = r10 + 1;
        if (r15 < 0) goto L_0x0144;
    L_0x013b:
        r5 = r0.f1779i;
        r5 = r5.get(r15);
        r5 = (android.support.v4.view.ViewPager.C0520b) r5;
        goto L_0x0145;
    L_0x0144:
        r5 = 0;
    L_0x0145:
        r11 = r5;
    L_0x0146:
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00fb;
    L_0x014a:
        r3 = r8.f1739d;
        r4 = r10 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x01cc;
    L_0x0152:
        r5 = r0.f1779i;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x0163;
    L_0x015a:
        r5 = r0.f1779i;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0520b) r5;
        goto L_0x0164;
    L_0x0163:
        r5 = 0;
    L_0x0164:
        if (r12 > 0) goto L_0x0168;
    L_0x0166:
        r7 = r9;
        goto L_0x0170;
    L_0x0168:
        r7 = r18.getPaddingRight();
        r7 = (float) r7;
        r11 = (float) r12;
        r7 = r7 / r11;
        r7 = r7 + r13;
    L_0x0170:
        r11 = r0.f1775c;
    L_0x0172:
        r11 = r11 + 1;
        if (r11 >= r6) goto L_0x01cc;
    L_0x0176:
        r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r12 < 0) goto L_0x01a5;
    L_0x017a:
        if (r11 <= r1) goto L_0x01a5;
    L_0x017c:
        if (r5 == 0) goto L_0x01cc;
    L_0x017e:
        r12 = r5.f1737b;
        if (r11 != r12) goto L_0x01cb;
    L_0x0182:
        r12 = r5.f1738c;
        if (r12 != 0) goto L_0x01cb;
    L_0x0186:
        r12 = r0.f1779i;
        r12.remove(r4);
        r12 = r0.f1774b;
        r5 = r5.f1736a;
        r12.mo211a(r0, r11, r5);
        r5 = r0.f1779i;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01a3;
    L_0x019a:
        r5 = r0.f1779i;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0520b) r5;
        goto L_0x01cb;
    L_0x01a3:
        r5 = 0;
        goto L_0x01cb;
    L_0x01a5:
        if (r5 == 0) goto L_0x01b9;
    L_0x01a7:
        r12 = r5.f1737b;
        if (r11 != r12) goto L_0x01b9;
    L_0x01ab:
        r5 = r5.f1739d;
        r3 = r3 + r5;
        r4 = r4 + 1;
        r5 = r0.f1779i;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01a3;
    L_0x01b8:
        goto L_0x019a;
    L_0x01b9:
        r5 = r0.m1128a(r11, r4);
        r4 = r4 + 1;
        r5 = r5.f1739d;
        r3 = r3 + r5;
        r5 = r0.f1779i;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01a3;
    L_0x01ca:
        goto L_0x019a;
    L_0x01cb:
        goto L_0x0172;
    L_0x01cc:
        r0.m1136a(r8, r10, r2);
    L_0x01cf:
        r1 = r0.f1774b;
        if (r8 == 0) goto L_0x01d6;
    L_0x01d3:
        r3 = r8.f1736a;
        goto L_0x01d7;
    L_0x01d6:
        r3 = 0;
    L_0x01d7:
        r1.mo212a(r3);
        r1 = r0.f1774b;
        r1.mo214b(r0);
        r1 = r18.getChildCount();
        r2 = 0;
    L_0x01e4:
        if (r2 >= r1) goto L_0x020d;
    L_0x01e6:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (android.support.v4.view.ViewPager.C0521c) r4;
        r4.f1746f = r2;
        r5 = r4.f1741a;
        if (r5 != 0) goto L_0x020a;
    L_0x01f6:
        r5 = r4.f1743c;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x020a;
    L_0x01fc:
        r3 = r0.m1129a(r3);
        if (r3 == 0) goto L_0x020a;
    L_0x0202:
        r5 = r3.f1739d;
        r4.f1743c = r5;
        r3 = r3.f1737b;
        r4.f1745e = r3;
    L_0x020a:
        r2 = r2 + 1;
        goto L_0x01e4;
    L_0x020d:
        r18.m1145d();
        r1 = r18.hasFocus();
        if (r1 == 0) goto L_0x024b;
    L_0x0216:
        r1 = r18.findFocus();
        if (r1 == 0) goto L_0x0221;
    L_0x021c:
        r3 = r0.m1142b(r1);
        goto L_0x0222;
    L_0x0221:
        r3 = 0;
    L_0x0222:
        if (r3 == 0) goto L_0x022a;
    L_0x0224:
        r1 = r3.f1737b;
        r2 = r0.f1775c;
        if (r1 == r2) goto L_0x024b;
    L_0x022a:
        r1 = 0;
    L_0x022b:
        r2 = r18.getChildCount();
        if (r1 >= r2) goto L_0x024b;
    L_0x0231:
        r2 = r0.getChildAt(r1);
        r3 = r0.m1129a(r2);
        if (r3 == 0) goto L_0x0248;
    L_0x023b:
        r3 = r3.f1737b;
        r4 = r0.f1775c;
        if (r3 != r4) goto L_0x0248;
    L_0x0241:
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 != 0) goto L_0x024b;
    L_0x0248:
        r1 = r1 + 1;
        goto L_0x022b;
    L_0x024b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void m1131a(int i, float f, int i2) {
        int scrollX;
        int paddingLeft;
        int i3 = 0;
        if (this.ab > 0) {
            scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i4 = paddingRight;
            paddingRight = paddingLeft;
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                View childAt = getChildAt(paddingLeft);
                C0521c c0521c = (C0521c) childAt.getLayoutParams();
                if (c0521c.f1741a) {
                    int i5 = c0521c.f1742b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i5 = childAt.getWidth() + paddingRight;
                        } else if (i5 != 5) {
                            i5 = paddingRight;
                        } else {
                            i5 = (width - i4) - childAt.getMeasuredWidth();
                            i4 += childAt.getMeasuredWidth();
                        }
                        paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                        if (paddingRight != 0) {
                            childAt.offsetLeftAndRight(paddingRight);
                        }
                        paddingRight = i5;
                    } else {
                        i5 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingRight);
                    }
                    int i6 = i5;
                    i5 = paddingRight;
                    paddingRight = i6;
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                    paddingRight = i5;
                }
            }
        }
        if (this.ac != null) {
            this.ac.mo174a(i, f, i2);
        }
        if (this.f1776d != null) {
            scrollX = this.f1776d.size();
            for (paddingLeft = 0; paddingLeft < scrollX; paddingLeft++) {
                C0523f c0523f = (C0523f) this.f1776d.get(paddingLeft);
                if (c0523f != null) {
                    c0523f.mo174a(i, f, i2);
                }
            }
        }
        if (this.ad != null) {
            this.ad.mo174a(i, f, i2);
        }
        if (this.ae != null) {
            getScrollX();
            i = getChildCount();
            while (i3 < i) {
                View childAt2 = getChildAt(i3);
                if (!((C0521c) childAt2.getLayoutParams()).f1741a) {
                    childAt2.getLeft();
                    getClientWidth();
                }
                i3++;
            }
        }
        this.aa = true;
    }

    private void m1132a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f1779i.isEmpty()) {
            C0520b b = m1141b(this.f1775c);
            i = (int) ((b != null ? Math.min(b.f1740e, this.f1793w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                m1138a(false);
                scrollTo(i, getScrollY());
            }
        } else if (this.f1785o.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.f1785o.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    private void m1133a(int i, boolean z, int i2, boolean z2) {
        C0520b b = m1141b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f1792v, Math.min(b.f1740e, this.f1793w))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int currX;
                z = (this.f1785o == null || this.f1785o.isFinished()) ? false : true;
                if (z) {
                    currX = this.f1786p ? this.f1785o.getCurrX() : this.f1785o.getStartX();
                    this.f1785o.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    currX = getScrollX();
                }
                int i3 = currX;
                int scrollY = getScrollY();
                int i4 = clientWidth - i3;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    m1138a(false);
                    m1156b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    currX = getClientWidth();
                    clientWidth = currX / 2;
                    float f = (float) currX;
                    float f2 = (float) clientWidth;
                    f2 += ((float) Math.sin((double) ((Math.min(BallPulseIndicator.SCALE, (((float) Math.abs(i4)) * BallPulseIndicator.SCALE) / f) - 0.5f) * 0.47123894f))) * f2;
                    i2 = Math.abs(i2);
                    int min = Math.min(i2 > 0 ? 4 * Math.round(1000.0f * Math.abs(f2 / ((float) i2))) : (int) (((((float) Math.abs(i4)) / ((f * BallPulseIndicator.SCALE) + ((float) this.f1788r))) + BallPulseIndicator.SCALE) * 100.0f), IjkMediaCodecInfo.RANK_LAST_CHANCE);
                    this.f1786p = false;
                    this.f1785o.startScroll(i3, scrollY, i4, i5, min);
                    C0571r.m1361e(this);
                }
            }
            if (z2) {
                m1146d(i);
                return;
            }
        }
        if (z2) {
            m1146d(i);
        }
        m1138a(false);
        scrollTo(clientWidth, 0);
        m1144c(clientWidth);
    }

    private void m1134a(int i, boolean z, boolean z2) {
        m1135a(i, z, z2, 0);
    }

    private void m1135a(int i, boolean z, boolean z2, int i2) {
        if (this.f1774b != null) {
            if (this.f1774b.mo2270b() > 0) {
                if (z2 || this.f1775c != i || this.f1779i.size() == 0) {
                    z2 = true;
                    if (i < 0) {
                        i = 0;
                    } else if (i >= this.f1774b.mo2270b()) {
                        i = this.f1774b.mo2270b() - 1;
                    }
                    int i3 = this.f1753C;
                    if (i > this.f1775c + i3 || i < this.f1775c - i3) {
                        for (i3 = 0; i3 < this.f1779i.size(); i3++) {
                            ((C0520b) this.f1779i.get(i3)).f1738c = true;
                        }
                    }
                    if (this.f1775c == i) {
                        z2 = false;
                    }
                    if (this.f1772V) {
                        this.f1775c = i;
                        if (z2) {
                            m1146d(i);
                        }
                        requestLayout();
                        return;
                    }
                    m1130a(i);
                    m1133a(i, z, i2, z2);
                    return;
                }
                setScrollingCacheEnabled(false);
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    private void m1136a(C0520b c0520b, int i, C0520b c0520b2) {
        int i2;
        int size;
        int b = this.f1774b.mo2270b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f1788r) / ((float) clientWidth) : 0.0f;
        if (c0520b2 != null) {
            int i3 = c0520b2.f1737b;
            C0520b c0520b3;
            if (i3 < c0520b.f1737b) {
                float f2 = (c0520b2.f1740e + c0520b2.f1739d) + f;
                i3++;
                i2 = 0;
                while (i3 <= c0520b.f1737b && r12 < this.f1779i.size()) {
                    while (true) {
                        c0520b3 = (C0520b) this.f1779i.get(i2);
                        if (i3 <= c0520b3.f1737b || i2 >= this.f1779i.size() - 1) {
                            while (i3 < c0520b3.f1737b) {
                                f2 += BallPulseIndicator.SCALE + f;
                                i3++;
                            }
                        } else {
                            i2++;
                        }
                    }
                    while (i3 < c0520b3.f1737b) {
                        f2 += BallPulseIndicator.SCALE + f;
                        i3++;
                    }
                    c0520b3.f1740e = f2;
                    f2 += c0520b3.f1739d + f;
                    i3++;
                }
            } else if (i3 > c0520b.f1737b) {
                size = this.f1779i.size() - 1;
                float f3 = c0520b2.f1740e;
                i3--;
                while (i3 >= c0520b.f1737b && r5 >= 0) {
                    while (true) {
                        c0520b3 = (C0520b) this.f1779i.get(size);
                        if (i3 >= c0520b3.f1737b || size <= 0) {
                            while (i3 > c0520b3.f1737b) {
                                f3 -= BallPulseIndicator.SCALE + f;
                                i3--;
                            }
                        } else {
                            size--;
                        }
                    }
                    while (i3 > c0520b3.f1737b) {
                        f3 -= BallPulseIndicator.SCALE + f;
                        i3--;
                    }
                    f3 -= c0520b3.f1739d + f;
                    c0520b3.f1740e = f3;
                    i3--;
                }
            }
        }
        i2 = this.f1779i.size();
        float f4 = c0520b.f1740e;
        size = c0520b.f1737b - 1;
        this.f1792v = c0520b.f1737b == 0 ? c0520b.f1740e : -3.4028235E38f;
        b--;
        this.f1793w = c0520b.f1737b == b ? (c0520b.f1740e + c0520b.f1739d) - BallPulseIndicator.SCALE : Float.MAX_VALUE;
        int i4 = i - 1;
        while (i4 >= 0) {
            C0520b c0520b4 = (C0520b) this.f1779i.get(i4);
            while (size > c0520b4.f1737b) {
                size--;
                f4 -= BallPulseIndicator.SCALE + f;
            }
            f4 -= c0520b4.f1739d + f;
            c0520b4.f1740e = f4;
            if (c0520b4.f1737b == 0) {
                this.f1792v = f4;
            }
            i4--;
            size--;
        }
        f4 = (c0520b.f1740e + c0520b.f1739d) + f;
        int i5 = c0520b.f1737b + 1;
        i++;
        while (i < i2) {
            C0520b c0520b5 = (C0520b) this.f1779i.get(i);
            while (i5 < c0520b5.f1737b) {
                i5++;
                f4 += BallPulseIndicator.SCALE + f;
            }
            if (c0520b5.f1737b == b) {
                this.f1793w = (c0520b5.f1739d + f4) - BallPulseIndicator.SCALE;
            }
            c0520b5.f1740e = f4;
            f4 += c0520b5.f1739d + f;
            i++;
            i5++;
        }
        this.f1773W = false;
    }

    private void m1137a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1763M) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f1759I = motionEvent.getX(actionIndex);
            this.f1763M = motionEvent.getPointerId(actionIndex);
            if (this.f1764N != null) {
                this.f1764N.clear();
            }
        }
    }

    private void m1138a(boolean z) {
        int scrollX;
        int i = this.ak == 2 ? 1 : false;
        if (i != 0) {
            setScrollingCacheEnabled(false);
            if ((this.f1785o.isFinished() ^ 1) != 0) {
                this.f1785o.abortAnimation();
                scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f1785o.getCurrX();
                int currY = this.f1785o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m1144c(currX);
                    }
                }
            }
        }
        this.f1752B = false;
        scrollX = i;
        for (i = 0; i < this.f1779i.size(); i++) {
            C0520b c0520b = (C0520b) this.f1779i.get(i);
            if (c0520b.f1738c) {
                c0520b.f1738c = false;
                scrollX = 1;
            }
        }
        if (scrollX != 0) {
            if (z) {
                C0571r.m1343a((View) this, this.aj);
                return;
            }
            this.aj.run();
        }
    }

    private boolean m1139a(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f1759I - f;
        this.f1759I = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) getClientWidth();
        float f3 = this.f1792v * f2;
        float f4 = this.f1793w * f2;
        boolean z3 = false;
        C0520b c0520b = (C0520b) this.f1779i.get(0);
        C0520b c0520b2 = (C0520b) this.f1779i.get(this.f1779i.size() - 1);
        if (c0520b.f1737b != 0) {
            f3 = c0520b.f1740e * f2;
            z = false;
        } else {
            z = true;
        }
        if (c0520b2.f1737b != this.f1774b.mo2270b() - 1) {
            f4 = c0520b2.f1740e * f2;
            z2 = false;
        } else {
            z2 = true;
        }
        if (f < f3) {
            if (z) {
                this.f1770T.onPull(Math.abs(f3 - f) / f2);
                z3 = true;
            }
            f = f3;
        } else if (f > f4) {
            if (z2) {
                this.f1771U.onPull(Math.abs(f - f4) / f2);
                z3 = true;
            }
            f = f4;
        }
        int i = (int) f;
        this.f1759I += f - ((float) i);
        scrollTo(i, getScrollY());
        m1144c(i);
        return z3;
    }

    private boolean m1140a(View view, boolean z, int i, int i2, int i3) {
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
                        if (m1140a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && view2.canScrollHorizontally(-i);
    }

    private C0520b m1141b(int i) {
        for (int i2 = 0; i2 < this.f1779i.size(); i2++) {
            C0520b c0520b = (C0520b) this.f1779i.get(i2);
            if (c0520b.f1737b == i) {
                return c0520b;
            }
        }
        return null;
    }

    private C0520b m1142b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return m1129a(view);
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

    private void m1143c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f1785o = new Scroller(context, f1750h);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1758H = viewConfiguration.getScaledPagingTouchSlop();
        this.f1765O = (int) (400.0f * f);
        this.f1766P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1770T = new EdgeEffect(context);
        this.f1771U = new EdgeEffect(context);
        this.f1767Q = (int) (25.0f * f);
        this.f1768R = (int) (2.0f * f);
        this.f1756F = (int) (16.0f * f);
        C0571r.m1340a((View) this, new C4826d(this));
        if (C0571r.m1364f(this) == 0) {
            C0571r.m1352b((View) this, 1);
        }
        C0571r.m1341a((View) this, new C48254(this));
    }

    private boolean m1144c(int i) {
        if (this.f1779i.size() != 0) {
            C0520b g = m1150g();
            int clientWidth = getClientWidth();
            int i2 = this.f1788r + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.f1788r) / f;
            int i3 = g.f1737b;
            float f3 = ((((float) i) / f) - g.f1740e) / (g.f1739d + f2);
            int i4 = (int) (((float) i2) * f3);
            this.aa = false;
            m1131a(i3, f3, i4);
            if (this.aa) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f1772V) {
            return false;
        } else {
            this.aa = false;
            m1131a(0, 0.0f, 0);
            if (this.aa) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private void m1145d() {
        if (this.ag != 0) {
            if (this.ah == null) {
                this.ah = new ArrayList();
            } else {
                this.ah.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, ai);
        }
    }

    private void m1146d(int i) {
        if (this.ac != null) {
            this.ac.mo175b(i);
        }
        if (this.f1776d != null) {
            int size = this.f1776d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0523f c0523f = (C0523f) this.f1776d.get(i2);
                if (c0523f != null) {
                    c0523f.mo175b(i);
                }
            }
        }
        if (this.ad != null) {
            this.ad.mo175b(i);
        }
    }

    private boolean m1147e() {
        this.f1763M = -1;
        this.f1754D = false;
        this.f1755E = false;
        if (this.f1764N != null) {
            this.f1764N.recycle();
            this.f1764N = null;
        }
        this.f1770T.onRelease();
        this.f1771U.onRelease();
        if (!this.f1770T.isFinished()) {
            if (!this.f1771U.isFinished()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1148e(int r8) {
        /*
        r7 = this;
        r0 = r7.findFocus();
        r1 = 1;
        r2 = 0;
        r3 = 0;
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
        r4 = r1;
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
        r0 = "ViewPager";
        r5 = new java.lang.StringBuilder;
        r6 = "arrowScroll tried to find focus based on non-child current focused view ";
        r5.<init>(r6);
        r4 = r4.toString();
        r5.append(r4);
        r4 = r5.toString();
        android.util.Log.e(r0, r4);
        goto L_0x0066;
    L_0x0065:
        r3 = r0;
    L_0x0066:
        r0 = android.view.FocusFinder.getInstance();
        r0 = r0.findNextFocus(r7, r3, r8);
        r4 = 66;
        r5 = 17;
        if (r0 == 0) goto L_0x00a9;
    L_0x0074:
        if (r0 == r3) goto L_0x00a9;
    L_0x0076:
        if (r8 != r5) goto L_0x0092;
    L_0x0078:
        r1 = r7.f1781k;
        r1 = r7.m1127a(r1, r0);
        r1 = r1.left;
        r2 = r7.f1781k;
        r2 = r7.m1127a(r2, r3);
        r2 = r2.left;
        if (r3 == 0) goto L_0x008d;
    L_0x008a:
        if (r1 < r2) goto L_0x008d;
    L_0x008c:
        goto L_0x00b8;
    L_0x008d:
        r2 = r0.requestFocus();
        goto L_0x00bc;
    L_0x0092:
        if (r8 != r4) goto L_0x00bc;
    L_0x0094:
        r1 = r7.f1781k;
        r1 = r7.m1127a(r1, r0);
        r1 = r1.left;
        r2 = r7.f1781k;
        r2 = r7.m1127a(r2, r3);
        r2 = r2.left;
        if (r3 == 0) goto L_0x008d;
    L_0x00a6:
        if (r1 <= r2) goto L_0x00b3;
    L_0x00a8:
        goto L_0x008d;
    L_0x00a9:
        if (r8 == r5) goto L_0x00b8;
    L_0x00ab:
        if (r8 != r1) goto L_0x00ae;
    L_0x00ad:
        goto L_0x00b8;
    L_0x00ae:
        if (r8 == r4) goto L_0x00b3;
    L_0x00b0:
        r0 = 2;
        if (r8 != r0) goto L_0x00bc;
    L_0x00b3:
        r2 = r7.m1152i();
        goto L_0x00bc;
    L_0x00b8:
        r2 = r7.m1151h();
    L_0x00bc:
        if (r2 == 0) goto L_0x00c5;
    L_0x00be:
        r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8);
        r7.playSoundEffect(r8);
    L_0x00c5:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.e(int):boolean");
    }

    private void m1149f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private C0520b m1150g() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f1788r) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = f2;
        int i = 0;
        int i2 = -1;
        C0520b c0520b = null;
        int i3 = 1;
        while (i < this.f1779i.size()) {
            C0520b c0520b2 = (C0520b) this.f1779i.get(i);
            if (i3 == 0) {
                i2++;
                if (c0520b2.f1737b != i2) {
                    c0520b2 = this.f1780j;
                    c0520b2.f1740e = (f2 + f3) + f;
                    c0520b2.f1737b = i2;
                    c0520b2.f1739d = BallPulseIndicator.SCALE;
                    i--;
                }
            }
            f2 = c0520b2.f1740e;
            float f4 = (c0520b2.f1739d + f2) + f;
            if (i3 == 0) {
                if (scrollX < f2) {
                    return c0520b;
                }
            }
            if (scrollX < f4 || i == this.f1779i.size() - 1) {
                return c0520b2;
            }
            i2 = c0520b2.f1737b;
            f3 = c0520b2.f1739d;
            i++;
            i3 = 0;
            c0520b = c0520b2;
        }
        return c0520b;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private boolean m1151h() {
        if (this.f1775c <= 0) {
            return false;
        }
        m1154a(this.f1775c - 1, true);
        return true;
    }

    private boolean m1152i() {
        if (this.f1774b == null || this.f1775c >= this.f1774b.mo2270b() - 1) {
            return false;
        }
        m1154a(this.f1775c + 1, true);
        return true;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f1751A != z) {
            this.f1751A = z;
        }
    }

    final void m1153a() {
        int b = this.f1774b.mo2270b();
        this.f1778f = b;
        boolean z = this.f1779i.size() < (this.f1753C * 2) + 1 && this.f1779i.size() < b;
        boolean z2 = z;
        int i = this.f1775c;
        int i2 = 0;
        int i3 = i2;
        while (i2 < this.f1779i.size()) {
            C0520b c0520b = (C0520b) this.f1779i.get(i2);
            int c = this.f1774b.mo2272c();
            if (c != -1) {
                if (c == -2) {
                    this.f1779i.remove(i2);
                    i2--;
                    if (i3 == 0) {
                        this.f1774b.mo210a((ViewGroup) this);
                        i3 = true;
                    }
                    this.f1774b.mo211a(this, c0520b.f1737b, c0520b.f1736a);
                    if (this.f1775c == c0520b.f1737b) {
                        i = Math.max(0, Math.min(this.f1775c, b - 1));
                    }
                } else if (c0520b.f1737b != c) {
                    if (c0520b.f1737b == this.f1775c) {
                        i = c;
                    }
                    c0520b.f1737b = c;
                }
                z2 = true;
            }
            i2++;
        }
        if (i3 != 0) {
            this.f1774b.mo214b((ViewGroup) this);
        }
        Collections.sort(this.f1779i, f1749g);
        if (z2) {
            b = getChildCount();
            for (i2 = 0; i2 < b; i2++) {
                C0521c c0521c = (C0521c) getChildAt(i2).getLayoutParams();
                if (!c0521c.f1741a) {
                    c0521c.f1743c = 0.0f;
                }
            }
            m1134a(i, false, true);
            requestLayout();
        }
    }

    public final void m1154a(int i, boolean z) {
        this.f1752B = false;
        m1134a(i, z, false);
    }

    public final void m1155a(C0523f c0523f) {
        if (this.f1776d == null) {
            this.f1776d = new ArrayList();
        }
        this.f1776d.add(c0523f);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0520b a = m1129a(childAt);
                    if (a != null && a.f1737b == this.f1775c) {
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
                C0520b a = m1129a(childAt);
                if (a != null && a.f1737b == this.f1775c) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0521c c0521c = (C0521c) layoutParams;
        c0521c.f1741a |= view.getClass().getAnnotation(C0519a.class) != null ? 1 : 0;
        if (!this.f1796z) {
            super.addView(view, i, layoutParams);
        } else if (c0521c == null || !c0521c.f1741a) {
            c0521c.f1744d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final void m1156b() {
        m1130a(this.f1775c);
    }

    public final void m1157b(C0523f c0523f) {
        if (this.f1776d != null) {
            this.f1776d.remove(c0523f);
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f1774b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f1792v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f1793w));
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0521c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f1786p = true;
        if (this.f1785o.isFinished() || !this.f1785o.computeScrollOffset()) {
            m1138a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f1785o.getCurrX();
        int currY = this.f1785o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m1144c(currX)) {
                this.f1785o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0571r.m1361e(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
        r5 = this;
        r0 = super.dispatchKeyEvent(r6);
        r1 = 1;
        if (r0 != 0) goto L_0x0056;
    L_0x0007:
        r0 = r6.getAction();
        r2 = 0;
        if (r0 != 0) goto L_0x0051;
    L_0x000e:
        r0 = r6.getKeyCode();
        r3 = 61;
        r4 = 2;
        if (r0 == r3) goto L_0x003b;
    L_0x0017:
        switch(r0) {
            case 21: goto L_0x0029;
            case 22: goto L_0x001b;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x0051;
    L_0x001b:
        r6 = r6.hasModifiers(r4);
        if (r6 == 0) goto L_0x0026;
    L_0x0021:
        r6 = r5.m1152i();
        goto L_0x0052;
    L_0x0026:
        r6 = 66;
        goto L_0x0036;
    L_0x0029:
        r6 = r6.hasModifiers(r4);
        if (r6 == 0) goto L_0x0034;
    L_0x002f:
        r6 = r5.m1151h();
        goto L_0x0052;
    L_0x0034:
        r6 = 17;
    L_0x0036:
        r6 = r5.m1148e(r6);
        goto L_0x0052;
    L_0x003b:
        r0 = r6.hasNoModifiers();
        if (r0 == 0) goto L_0x0046;
    L_0x0041:
        r6 = r5.m1148e(r4);
        goto L_0x0052;
    L_0x0046:
        r6 = r6.hasModifiers(r1);
        if (r6 == 0) goto L_0x0051;
    L_0x004c:
        r6 = r5.m1148e(r1);
        goto L_0x0052;
    L_0x0051:
        r6 = r2;
    L_0x0052:
        if (r6 == 0) goto L_0x0055;
    L_0x0054:
        return r1;
    L_0x0055:
        return r2;
    L_0x0056:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0520b a = m1129a(childAt);
                if (a != null && a.f1737b == this.f1775c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        int i = 0;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || this.f1774b == null || this.f1774b.mo2270b() <= 1) {
                this.f1770T.finish();
                this.f1771U.finish();
                if (i != 0) {
                    C0571r.m1361e(this);
                }
            }
        }
        if (!this.f1770T.isFinished()) {
            overScrollMode = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.f1792v * ((float) width));
            this.f1770T.setSize(height, width);
            i = 0 | this.f1770T.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (!this.f1771U.isFinished()) {
            overScrollMode = canvas.save();
            height = getWidth();
            width = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.f1793w + BallPulseIndicator.SCALE)) * ((float) height));
            this.f1771U.setSize(width, height);
            i |= this.f1771U.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (i != 0) {
            C0571r.m1361e(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1789s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0521c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0521c(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0565n getAdapter() {
        return this.f1774b;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0521c) ((View) this.ah.get(i2)).getLayoutParams()).f1746f;
    }

    public int getCurrentItem() {
        return this.f1775c;
    }

    public int getOffscreenPageLimit() {
        return this.f1753C;
    }

    public int getPageMargin() {
        return this.f1788r;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1772V = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        if (!(this.f1785o == null || this.f1785o.isFinished())) {
            this.f1785o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1788r > 0 && r0.f1789s != null && r0.f1779i.size() > 0 && r0.f1774b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) r0.f1788r) / f;
            int i = 0;
            C0520b c0520b = (C0520b) r0.f1779i.get(0);
            float f3 = c0520b.f1740e;
            int size = r0.f1779i.size();
            int i2 = c0520b.f1737b;
            int i3 = ((C0520b) r0.f1779i.get(size - 1)).f1737b;
            while (i2 < i3) {
                float f4;
                float f5;
                while (i2 > c0520b.f1737b && i < size) {
                    i++;
                    c0520b = (C0520b) r0.f1779i.get(i);
                }
                if (i2 == c0520b.f1737b) {
                    f4 = (c0520b.f1740e + c0520b.f1739d) * f;
                    f3 = (c0520b.f1740e + c0520b.f1739d) + f2;
                } else {
                    f4 = (f3 + BallPulseIndicator.SCALE) * f;
                    f3 += BallPulseIndicator.SCALE + f2;
                }
                if (((float) r0.f1788r) + f4 > ((float) scrollX)) {
                    f5 = f2;
                    r0.f1789s.setBounds(Math.round(f4), r0.f1790t, Math.round(((float) r0.f1788r) + f4), r0.f1791u);
                    r0.f1789s.draw(canvas);
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
                    if (view.f1754D) {
                        return true;
                    }
                    if (view.f1755E) {
                        return false;
                    }
                }
                float x;
                if (action == 0) {
                    x = motionEvent.getX();
                    view.f1761K = x;
                    view.f1759I = x;
                    x = motionEvent.getY();
                    view.f1762L = x;
                    view.f1760J = x;
                    view.f1763M = motionEvent2.getPointerId(0);
                    view.f1755E = false;
                    view.f1786p = true;
                    view.f1785o.computeScrollOffset();
                    if (view.ak != 2 || Math.abs(view.f1785o.getFinalX() - view.f1785o.getCurrX()) <= view.f1768R) {
                        m1138a(false);
                        view.f1754D = false;
                    } else {
                        view.f1785o.abortAnimation();
                        view.f1752B = false;
                        m1156b();
                        view.f1754D = true;
                        m1149f();
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    action = view.f1763M;
                    if (action != -1) {
                        action = motionEvent2.findPointerIndex(action);
                        float x2 = motionEvent2.getX(action);
                        float f = x2 - view.f1759I;
                        float abs = Math.abs(f);
                        float y = motionEvent2.getY(action);
                        float abs2 = Math.abs(y - view.f1762L);
                        if (f != 0.0f) {
                            x = view.f1759I;
                            boolean z = (x < ((float) view.f1757G) && f > 0.0f) || (x > ((float) (getWidth() - view.f1757G)) && f < 0.0f);
                            if (!z && m1140a(view, false, (int) f, (int) x2, (int) y)) {
                                view.f1759I = x2;
                                view.f1760J = y;
                                view.f1755E = true;
                                return false;
                            }
                        }
                        if (abs > ((float) view.f1758H) && abs * 0.5f > abs2) {
                            view.f1754D = true;
                            m1149f();
                            setScrollState(1);
                            view.f1759I = f > 0.0f ? view.f1761K + ((float) view.f1758H) : view.f1761K - ((float) view.f1758H);
                            view.f1760J = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) view.f1758H)) {
                            view.f1755E = true;
                        }
                        if (view.f1754D && m1139a(x2)) {
                            C0571r.m1361e(this);
                        }
                    }
                } else if (action == 6) {
                    m1137a(motionEvent);
                }
                if (view.f1764N == null) {
                    view.f1764N = VelocityTracker.obtain();
                }
                view.f1764N.addMovement(motionEvent2);
                return view.f1754D;
            }
        }
        m1147e();
        return false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ViewPager viewPager = this;
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
                C0521c c0521c = (C0521c) childAt.getLayoutParams();
                if (c0521c.f1741a) {
                    int i9 = c0521c.f1742b & 7;
                    int i10 = c0521c.f1742b & 112;
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
                C0521c c0521c2 = (C0521c) childAt2.getLayoutParams();
                if (!c0521c2.f1741a) {
                    C0520b a = m1129a(childAt2);
                    if (a != null) {
                        float f = (float) i5;
                        int i11 = ((int) (a.f1740e * f)) + paddingTop;
                        if (c0521c2.f1744d) {
                            c0521c2.f1744d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * c0521c2.f1743c), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        viewPager.f1790t = paddingBottom;
        viewPager.f1791u = i6 - i7;
        viewPager.ab = i8;
        if (viewPager.f1772V) {
            z2 = false;
            m1133a(viewPager.f1775c, false, 0, false);
        } else {
            z2 = false;
        }
        viewPager.f1772V = z2;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f1757G = Math.min(measuredWidth / 10, this.f1756F);
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
                C0521c c0521c = (C0521c) childAt.getLayoutParams();
                if (c0521c != null && c0521c.f1741a) {
                    int i6;
                    int i7;
                    int i8 = c0521c.f1742b & 7;
                    int i9 = c0521c.f1742b & 112;
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
                            if (c0521c.width == -2) {
                                i7 = c0521c.width == -1 ? c0521c.width : measuredHeight;
                                i8 = 1073741824;
                            } else {
                                i7 = measuredHeight;
                            }
                            if (c0521c.height == -2) {
                                i3 = c0521c.height == -1 ? c0521c.height : i4;
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
                    if (c0521c.width == -2) {
                        i7 = measuredHeight;
                    } else {
                        if (c0521c.width == -1) {
                        }
                        i8 = 1073741824;
                    }
                    if (c0521c.height == -2) {
                        i3 = i4;
                        i5 = i6;
                    } else if (c0521c.height == -1) {
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
        r0.f1794x = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        r0.f1795y = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        r0.f1796z = true;
        m1156b();
        i3 = 0;
        r0.f1796z = false;
        measuredWidth = getChildCount();
        while (i3 < measuredWidth) {
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                C0521c c0521c2 = (C0521c) childAt2.getLayoutParams();
                if (c0521c2 == null || !c0521c2.f1741a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) * c0521c2.f1743c), 1073741824), r0.f1795y);
                }
            }
            i3++;
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
                C0520b a = m1129a(childAt);
                if (a != null && a.f1737b == this.f1775c && childAt.requestFocus(i, rect)) {
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
            if (this.f1774b != null) {
                this.f1774b.mo209a(savedState.f13407b, savedState.f13408c);
                m1134a(savedState.f13406a, false, true);
                return;
            }
            this.f1782l = savedState.f13406a;
            this.f1783m = savedState.f13407b;
            this.f1784n = savedState.f13408c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f13406a = this.f1775c;
        if (this.f1774b != null) {
            savedState.f13407b = this.f1774b.mo207a();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m1132a(i, i3, this.f1788r, this.f1788r);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r0 = r8.f1769S;
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
        r0 = r8.f1774b;
        if (r0 == 0) goto L_0x0199;
    L_0x0018:
        r0 = r8.f1774b;
        r0 = r0.mo2270b();
        if (r0 != 0) goto L_0x0021;
    L_0x0020:
        return r2;
    L_0x0021:
        r0 = r8.f1764N;
        if (r0 != 0) goto L_0x002b;
    L_0x0025:
        r0 = android.view.VelocityTracker.obtain();
        r8.f1764N = r0;
    L_0x002b:
        r0 = r8.f1764N;
        r0.addMovement(r9);
        r0 = r9.getAction();
        r0 = r0 & 255;
        switch(r0) {
            case 0: goto L_0x0173;
            case 1: goto L_0x00de;
            case 2: goto L_0x006b;
            case 3: goto L_0x005c;
            case 4: goto L_0x0039;
            case 5: goto L_0x004c;
            case 6: goto L_0x003b;
            default: goto L_0x0039;
        };
    L_0x0039:
        goto L_0x0193;
    L_0x003b:
        r8.m1137a(r9);
        r0 = r8.f1763M;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r8.f1759I = r9;
        goto L_0x0193;
    L_0x004c:
        r0 = r9.getActionIndex();
        r3 = r9.getX(r0);
        r8.f1759I = r3;
        r9 = r9.getPointerId(r0);
        goto L_0x0191;
    L_0x005c:
        r9 = r8.f1754D;
        if (r9 == 0) goto L_0x0193;
    L_0x0060:
        r9 = r8.f1775c;
        r8.m1133a(r9, r1, r2, r2);
    L_0x0065:
        r2 = r8.m1147e();
        goto L_0x0193;
    L_0x006b:
        r0 = r8.f1754D;
        if (r0 != 0) goto L_0x00c9;
    L_0x006f:
        r0 = r8.f1763M;
        r0 = r9.findPointerIndex(r0);
        r3 = -1;
        if (r0 != r3) goto L_0x0079;
    L_0x0078:
        goto L_0x0065;
    L_0x0079:
        r3 = r9.getX(r0);
        r4 = r8.f1759I;
        r4 = r3 - r4;
        r4 = java.lang.Math.abs(r4);
        r0 = r9.getY(r0);
        r5 = r8.f1760J;
        r5 = r0 - r5;
        r5 = java.lang.Math.abs(r5);
        r6 = r8.f1758H;
        r6 = (float) r6;
        r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x00c9;
    L_0x0098:
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 <= 0) goto L_0x00c9;
    L_0x009c:
        r8.f1754D = r1;
        r8.m1149f();
        r4 = r8.f1761K;
        r3 = r3 - r4;
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x00b0;
    L_0x00a9:
        r3 = r8.f1761K;
        r4 = r8.f1758H;
        r4 = (float) r4;
        r3 = r3 + r4;
        goto L_0x00b6;
    L_0x00b0:
        r3 = r8.f1761K;
        r4 = r8.f1758H;
        r4 = (float) r4;
        r3 = r3 - r4;
    L_0x00b6:
        r8.f1759I = r3;
        r8.f1760J = r0;
        r8.setScrollState(r1);
        r8.setScrollingCacheEnabled(r1);
        r0 = r8.getParent();
        if (r0 == 0) goto L_0x00c9;
    L_0x00c6:
        r0.requestDisallowInterceptTouchEvent(r1);
    L_0x00c9:
        r0 = r8.f1754D;
        if (r0 == 0) goto L_0x0193;
    L_0x00cd:
        r0 = r8.f1763M;
        r0 = r9.findPointerIndex(r0);
        r9 = r9.getX(r0);
        r9 = r8.m1139a(r9);
        r2 = r2 | r9;
        goto L_0x0193;
    L_0x00de:
        r0 = r8.f1754D;
        if (r0 == 0) goto L_0x0193;
    L_0x00e2:
        r0 = r8.f1764N;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r8.f1766P;
        r4 = (float) r4;
        r0.computeCurrentVelocity(r3, r4);
        r3 = r8.f1763M;
        r0 = r0.getXVelocity(r3);
        r0 = (int) r0;
        r8.f1752B = r1;
        r3 = r8.getClientWidth();
        r4 = r8.getScrollX();
        r5 = r8.m1150g();
        r6 = r8.f1788r;
        r6 = (float) r6;
        r3 = (float) r3;
        r6 = r6 / r3;
        r7 = r5.f1737b;
        r4 = (float) r4;
        r4 = r4 / r3;
        r3 = r5.f1740e;
        r4 = r4 - r3;
        r3 = r5.f1739d;
        r3 = r3 + r6;
        r4 = r4 / r3;
        r3 = r8.f1763M;
        r3 = r9.findPointerIndex(r3);
        r9 = r9.getX(r3);
        r3 = r8.f1761K;
        r9 = r9 - r3;
        r9 = (int) r9;
        r9 = java.lang.Math.abs(r9);
        r3 = r8.f1767Q;
        if (r9 <= r3) goto L_0x0135;
    L_0x0127:
        r9 = java.lang.Math.abs(r0);
        r3 = r8.f1765O;
        if (r9 <= r3) goto L_0x0135;
    L_0x012f:
        if (r0 <= 0) goto L_0x0132;
    L_0x0131:
        goto L_0x0143;
    L_0x0132:
        r7 = r7 + 1;
        goto L_0x0143;
    L_0x0135:
        r9 = r8.f1775c;
        if (r7 < r9) goto L_0x013d;
    L_0x0139:
        r9 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        goto L_0x0140;
    L_0x013d:
        r9 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
    L_0x0140:
        r4 = r4 + r9;
        r9 = (int) r4;
        r7 = r7 + r9;
    L_0x0143:
        r9 = r8.f1779i;
        r9 = r9.size();
        if (r9 <= 0) goto L_0x016e;
    L_0x014b:
        r9 = r8.f1779i;
        r9 = r9.get(r2);
        r9 = (android.support.v4.view.ViewPager.C0520b) r9;
        r2 = r8.f1779i;
        r3 = r8.f1779i;
        r3 = r3.size();
        r3 = r3 - r1;
        r2 = r2.get(r3);
        r2 = (android.support.v4.view.ViewPager.C0520b) r2;
        r9 = r9.f1737b;
        r2 = r2.f1737b;
        r2 = java.lang.Math.min(r7, r2);
        r7 = java.lang.Math.max(r9, r2);
    L_0x016e:
        r8.m1135a(r7, r1, r1, r0);
        goto L_0x0065;
    L_0x0173:
        r0 = r8.f1785o;
        r0.abortAnimation();
        r8.f1752B = r2;
        r8.m1156b();
        r0 = r9.getX();
        r8.f1761K = r0;
        r8.f1759I = r0;
        r0 = r9.getY();
        r8.f1762L = r0;
        r8.f1760J = r0;
        r9 = r9.getPointerId(r2);
    L_0x0191:
        r8.f1763M = r9;
    L_0x0193:
        if (r2 == 0) goto L_0x0198;
    L_0x0195:
        android.support.v4.view.C0571r.m1361e(r8);
    L_0x0198:
        return r1;
    L_0x0199:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f1796z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0565n c0565n) {
        int i;
        int i2 = false;
        if (this.f1774b != null) {
            this.f1774b.m1269c(null);
            this.f1774b.mo210a((ViewGroup) this);
            for (i = 0; i < this.f1779i.size(); i++) {
                C0520b c0520b = (C0520b) this.f1779i.get(i);
                this.f1774b.mo211a(this, c0520b.f1737b, c0520b.f1736a);
            }
            this.f1774b.mo214b((ViewGroup) this);
            this.f1779i.clear();
            i = 0;
            while (i < getChildCount()) {
                if (!((C0521c) getChildAt(i).getLayoutParams()).f1741a) {
                    removeViewAt(i);
                    i--;
                }
                i++;
            }
            this.f1775c = 0;
            scrollTo(0, 0);
        }
        this.f1774b = c0565n;
        this.f1778f = 0;
        if (this.f1774b != null) {
            if (this.f1787q == null) {
                this.f1787q = new C0525h(this);
            }
            this.f1774b.m1269c(this.f1787q);
            this.f1752B = false;
            boolean z = this.f1772V;
            this.f1772V = true;
            this.f1778f = this.f1774b.mo2270b();
            if (this.f1782l >= 0) {
                this.f1774b.mo209a(this.f1783m, this.f1784n);
                m1134a(this.f1782l, false, true);
                this.f1782l = -1;
                this.f1783m = null;
                this.f1784n = null;
            } else if (z) {
                requestLayout();
            } else {
                m1156b();
            }
        }
        if (this.f1777e != null && !this.f1777e.isEmpty()) {
            i = this.f1777e.size();
            while (i2 < i) {
                ((C0522e) this.f1777e.get(i2)).mo172a(this, c0565n);
                i2++;
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f1752B = false;
        m1134a(i, this.f1772V ^ 1, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to 1");
            Log.w("ViewPager", stringBuilder.toString());
            i = 1;
        }
        if (i != this.f1753C) {
            this.f1753C = i;
            m1156b();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0523f c0523f) {
        this.ac = c0523f;
    }

    public void setPageMargin(int i) {
        int i2 = this.f1788r;
        this.f1788r = i;
        int width = getWidth();
        m1132a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0346c.m682a(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f1789s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i) {
        if (this.ak != i) {
            int i2;
            this.ak = i;
            int i3 = 0;
            if (this.ae != null) {
                i2 = i != 0 ? 1 : 0;
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    getChildAt(i4).setLayerType(i2 != 0 ? this.af : 0, null);
                }
            }
            if (this.ac != null) {
                this.ac.mo173a(i);
            }
            if (this.f1776d != null) {
                i2 = this.f1776d.size();
                while (i3 < i2) {
                    C0523f c0523f = (C0523f) this.f1776d.get(i3);
                    if (c0523f != null) {
                        c0523f.mo173a(i);
                    }
                    i3++;
                }
            }
            if (this.ad != null) {
                this.ad.mo173a(i);
            }
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f1789s) {
                return false;
            }
        }
        return true;
    }
}
