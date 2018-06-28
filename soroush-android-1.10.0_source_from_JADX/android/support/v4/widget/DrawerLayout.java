package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0547a;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0574t;
import android.support.v4.view.p039a.C0536b;
import android.support.v4.view.p039a.C0536b.C0532a;
import android.support.v4.widget.C0634p.C0633a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public class DrawerLayout extends ViewGroup {
    static final int[] f1894a = new int[]{16842931};
    static final boolean f1895b = (VERSION.SDK_INT >= 19);
    private static final int[] f1896l = new int[]{16843828};
    private static final boolean f1897m;
    private int f1898A;
    private boolean f1899B;
    private C0585c f1900C;
    private float f1901D;
    private float f1902E;
    private Drawable f1903F;
    private Drawable f1904G;
    private Drawable f1905H;
    private Drawable f1906I;
    private Drawable f1907J;
    private Drawable f1908K;
    private Drawable f1909L;
    private final ArrayList<View> f1910M;
    final C0634p f1911c;
    final C0634p f1912d;
    int f1913e;
    boolean f1914f;
    List<C0585c> f1915g;
    CharSequence f1916h;
    CharSequence f1917i;
    Object f1918j;
    boolean f1919k;
    private final C4849b f1920n;
    private float f1921o;
    private int f1922p;
    private int f1923q;
    private float f1924r;
    private Paint f1925s;
    private final C4850e f1926t;
    private final C4850e f1927u;
    private boolean f1928v;
    private boolean f1929w;
    private int f1930x;
    private int f1931y;
    private int f1932z;

    class C05831 implements OnApplyWindowInsetsListener {
        final /* synthetic */ DrawerLayout f1888a;

        C05831(DrawerLayout drawerLayout) {
            this.f1888a = drawerLayout;
        }

        @TargetApi(21)
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = false;
            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.f1918j = windowInsets;
            drawerLayout.f1919k = z2;
            if (!z2 && drawerLayout.getBackground() == null) {
                z = true;
            }
            drawerLayout.setWillNotDraw(z);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public interface C0585c {
        void mo2405a(View view);
    }

    public static class C0586d extends MarginLayoutParams {
        public int f1889a = 0;
        float f1890b;
        boolean f1891c;
        int f1892d;

        public C0586d() {
            super(-1, -1);
        }

        public C0586d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1894a);
            this.f1889a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0586d(C0586d c0586d) {
            super(c0586d);
            this.f1889a = c0586d.f1889a;
        }

        public C0586d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0586d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05841();
        int f13444a = 0;
        int f13445b;
        int f13446c;
        int f13447d;
        int f13448e;

        static class C05841 implements ClassLoaderCreator<SavedState> {
            C05841() {
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
            this.f13444a = parcel.readInt();
            this.f13445b = parcel.readInt();
            this.f13446c = parcel.readInt();
            this.f13447d = parcel.readInt();
            this.f13448e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13444a);
            parcel.writeInt(this.f13445b);
            parcel.writeInt(this.f13446c);
            parcel.writeInt(this.f13447d);
            parcel.writeInt(this.f13448e);
        }
    }

    class C4848a extends C0547a {
        final /* synthetic */ DrawerLayout f13449a;
        private final Rect f13450b = new Rect();

        C4848a(DrawerLayout drawerLayout) {
            this.f13449a = drawerLayout;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View a = this.f13449a.m1444a();
            if (a != null) {
                int c = this.f13449a.m1450c(a);
                View view2 = this.f13449a;
                c = C0555d.m1224a(c, C0571r.m1369h(view2));
                Object obj = c == 3 ? view2.f1916h : c == 5 ? view2.f1917i : null;
                if (obj != null) {
                    text.add(obj);
                }
            }
            return true;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            if (DrawerLayout.f1895b) {
                super.onInitializeAccessibilityNodeInfo(view, c0536b);
            } else {
                C0536b a = C0536b.m1190a(c0536b);
                super.onInitializeAccessibilityNodeInfo(view, a);
                c0536b.f1836b.setSource(view);
                ViewParent i = C0571r.m1371i(view);
                if (i instanceof View) {
                    c0536b.m1194a((View) i);
                }
                Rect rect = this.f13450b;
                a.m1193a(rect);
                c0536b.f1836b.setBoundsInParent(rect);
                a.m1199b(rect);
                c0536b.f1836b.setBoundsInScreen(rect);
                C0536b.f1835a.mo384a(c0536b.f1836b, C0536b.f1835a.mo385a(a.f1836b));
                c0536b.f1836b.setPackageName(a.f1836b.getPackageName());
                c0536b.m1195a(a.f1836b.getClassName());
                c0536b.f1836b.setContentDescription(a.f1836b.getContentDescription());
                c0536b.f1836b.setEnabled(a.f1836b.isEnabled());
                c0536b.f1836b.setClickable(a.f1836b.isClickable());
                c0536b.m1200b(a.f1836b.isFocusable());
                c0536b.m1201c(a.f1836b.isFocused());
                C0536b.f1835a.mo386b(c0536b.f1836b, C0536b.f1835a.mo387b(a.f1836b));
                c0536b.f1836b.setSelected(a.f1836b.isSelected());
                c0536b.f1836b.setLongClickable(a.f1836b.isLongClickable());
                c0536b.m1192a(a.f1836b.getActions());
                a.f1836b.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (DrawerLayout.m1441h(childAt)) {
                        c0536b.f1836b.addChild(childAt);
                    }
                }
            }
            c0536b.m1195a(DrawerLayout.class.getName());
            c0536b.m1200b(false);
            c0536b.m1201c(false);
            c0536b.m1198a(C0532a.f1806a);
            c0536b.m1198a(C0532a.f1807b);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f1895b) {
                if (!DrawerLayout.m1441h(view)) {
                    return false;
                }
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    static final class C4849b extends C0547a {
        C4849b() {
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C0536b c0536b) {
            super.onInitializeAccessibilityNodeInfo(view, c0536b);
            if (!DrawerLayout.m1441h(view)) {
                c0536b.m1194a(null);
            }
        }
    }

    private class C4850e extends C0633a {
        final int f13451a;
        C0634p f13452b;
        final /* synthetic */ DrawerLayout f13453c;
        private final Runnable f13454d = new C05871(this);

        class C05871 implements Runnable {
            final /* synthetic */ C4850e f1893a;

            C05871(C4850e c4850e) {
                this.f1893a = c4850e;
            }

            public final void run() {
                View a;
                int i;
                C4850e c4850e = this.f1893a;
                int i2 = c4850e.f13452b.f2068h;
                int i3 = 0;
                boolean z = c4850e.f13451a == 3;
                if (z) {
                    a = c4850e.f13453c.m1445a(3);
                    i = (a != null ? -a.getWidth() : 0) + i2;
                } else {
                    a = c4850e.f13453c.m1445a(5);
                    i = c4850e.f13453c.getWidth() - i2;
                }
                if (a == null) {
                    return;
                }
                if (((z && a.getLeft() < i) || (!z && a.getLeft() > i)) && c4850e.f13453c.m1443a(a) == 0) {
                    C0586d c0586d = (C0586d) a.getLayoutParams();
                    c4850e.f13452b.m1565a(a, i, a.getTop());
                    c0586d.f1891c = true;
                    c4850e.f13453c.invalidate();
                    c4850e.m9321c();
                    DrawerLayout drawerLayout = c4850e.f13453c;
                    if (!drawerLayout.f1914f) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        while (i3 < childCount) {
                            drawerLayout.getChildAt(i3).dispatchTouchEvent(obtain);
                            i3++;
                        }
                        obtain.recycle();
                        drawerLayout.f1914f = true;
                    }
                }
            }
        }

        C4850e(DrawerLayout drawerLayout, int i) {
            this.f13453c = drawerLayout;
            this.f13451a = i;
        }

        public final int mo170a(View view) {
            return DrawerLayout.m1439d(view) ? view.getWidth() : 0;
        }

        public final void mo142a(int i) {
            C0586d c0586d;
            View rootView;
            DrawerLayout drawerLayout = this.f13453c;
            View view = this.f13452b.f2070j;
            int i2 = drawerLayout.f1911c.f2061a;
            int i3 = drawerLayout.f1912d.f2061a;
            int i4 = 2;
            if (i2 != 1) {
                if (i3 != 1) {
                    if (i2 != 2) {
                        if (i3 != 2) {
                            i4 = 0;
                        }
                    }
                    if (view != null && i == 0) {
                        c0586d = (C0586d) view.getLayoutParams();
                        if (c0586d.f1890b == 0.0f) {
                            c0586d = (C0586d) view.getLayoutParams();
                            if ((c0586d.f1892d & 1) == 1) {
                                c0586d.f1892d = 0;
                                if (drawerLayout.f1915g != null) {
                                    for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                                        drawerLayout.f1915g.get(i);
                                    }
                                }
                                drawerLayout.m1448a(view, false);
                                if (drawerLayout.hasWindowFocus()) {
                                    rootView = drawerLayout.getRootView();
                                    if (rootView != null) {
                                        rootView.sendAccessibilityEvent(32);
                                    }
                                }
                            }
                        } else if (c0586d.f1890b == BallPulseIndicator.SCALE) {
                            c0586d = (C0586d) view.getLayoutParams();
                            if ((c0586d.f1892d & 1) == 0) {
                                c0586d.f1892d = 1;
                                if (drawerLayout.f1915g != null) {
                                    for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                                        ((C0585c) drawerLayout.f1915g.get(i)).mo2405a(view);
                                    }
                                }
                                drawerLayout.m1448a(view, true);
                                if (drawerLayout.hasWindowFocus()) {
                                    drawerLayout.sendAccessibilityEvent(32);
                                }
                            }
                        }
                    }
                    if (i4 != drawerLayout.f1913e) {
                        drawerLayout.f1913e = i4;
                        if (drawerLayout.f1915g != null) {
                            for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                                drawerLayout.f1915g.get(i);
                            }
                        }
                    }
                }
            }
            i4 = 1;
            c0586d = (C0586d) view.getLayoutParams();
            if (c0586d.f1890b == 0.0f) {
                c0586d = (C0586d) view.getLayoutParams();
                if ((c0586d.f1892d & 1) == 1) {
                    c0586d.f1892d = 0;
                    if (drawerLayout.f1915g != null) {
                        for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                            drawerLayout.f1915g.get(i);
                        }
                    }
                    drawerLayout.m1448a(view, false);
                    if (drawerLayout.hasWindowFocus()) {
                        rootView = drawerLayout.getRootView();
                        if (rootView != null) {
                            rootView.sendAccessibilityEvent(32);
                        }
                    }
                }
            } else if (c0586d.f1890b == BallPulseIndicator.SCALE) {
                c0586d = (C0586d) view.getLayoutParams();
                if ((c0586d.f1892d & 1) == 0) {
                    c0586d.f1892d = 1;
                    if (drawerLayout.f1915g != null) {
                        for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                            ((C0585c) drawerLayout.f1915g.get(i)).mo2405a(view);
                        }
                    }
                    drawerLayout.m1448a(view, true);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
            if (i4 != drawerLayout.f1913e) {
                drawerLayout.f1913e = i4;
                if (drawerLayout.f1915g != null) {
                    for (i = drawerLayout.f1915g.size() - 1; i >= 0; i--) {
                        drawerLayout.f1915g.get(i);
                    }
                }
            }
        }

        public final void mo413a(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = this.f13453c;
                i3 = 3;
            } else {
                drawerLayout = this.f13453c;
                i3 = 5;
            }
            View a = drawerLayout.m1445a(i3);
            if (a != null && this.f13453c.m1443a(a) == 0) {
                this.f13452b.m1561a(a, i2);
            }
        }

        public final void mo143a(View view, float f, float f2) {
            int i;
            f2 = DrawerLayout.m1437b(view);
            int width = view.getWidth();
            if (this.f13453c.m1449a(view, 3)) {
                if (f <= 0.0f) {
                    if (f != 0.0f || f2 <= 0.5f) {
                        i = -width;
                    }
                }
                i = 0;
            } else {
                int width2 = this.f13453c.getWidth();
                if (f < 0.0f || (f == 0.0f && f2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f13452b.m1563a(i, view.getTop());
            this.f13453c.invalidate();
        }

        public final void mo144a(View view, int i, int i2) {
            i2 = view.getWidth();
            float width = (this.f13453c.m1449a(view, 3) ? (float) (i + i2) : (float) (this.f13453c.getWidth() - i)) / ((float) i2);
            this.f13453c.m1447a(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            this.f13453c.invalidate();
        }

        public final boolean mo145a(View view, int i) {
            return DrawerLayout.m1439d(view) && this.f13453c.m1449a(view, this.f13451a) && this.f13453c.m1443a(view) == 0;
        }

        public final int mo146b(View view, int i) {
            return view.getTop();
        }

        public final void m9319b() {
            this.f13453c.removeCallbacks(this.f13454d);
        }

        public final int mo147c(View view, int i) {
            int i2;
            int i3;
            if (this.f13453c.m1449a(view, 3)) {
                i2 = -view.getWidth();
                i3 = 0;
            } else {
                i3 = this.f13453c.getWidth();
                i2 = i3 - view.getWidth();
            }
            return Math.max(i2, Math.min(i, i3));
        }

        final void m9321c() {
            int i = 3;
            if (this.f13451a == 3) {
                i = 5;
            }
            View a = this.f13453c.m1445a(i);
            if (a != null) {
                this.f13453c.m1452f(a);
            }
        }

        public final void mo414d() {
            this.f13453c.postDelayed(this.f13454d, 160);
        }

        public final void mo171d(View view, int i) {
            ((C0586d) view.getLayoutParams()).f1891c = false;
            m9321c();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1897m = z;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1920n = new C4849b();
        this.f1923q = -1728053248;
        this.f1925s = new Paint();
        this.f1929w = true;
        this.f1930x = 3;
        this.f1931y = 3;
        this.f1932z = 3;
        this.f1898A = 3;
        this.f1906I = null;
        this.f1907J = null;
        this.f1908K = null;
        this.f1909L = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1922p = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f1926t = new C4850e(this, 3);
        this.f1927u = new C4850e(this, 5);
        this.f1911c = C0634p.m1545a((ViewGroup) this, (float) BallPulseIndicator.SCALE, this.f1926t);
        this.f1911c.f2069i = 1;
        this.f1911c.f2067g = f2;
        this.f1926t.f13452b = this.f1911c;
        this.f1912d = C0634p.m1545a((ViewGroup) this, (float) BallPulseIndicator.SCALE, this.f1927u);
        this.f1912d.f2069i = 2;
        this.f1912d.f2067g = f2;
        this.f1927u.f13452b = this.f1912d;
        setFocusableInTouchMode(true);
        C0571r.m1352b((View) this, 1);
        C0571r.m1340a((View) this, new C4848a(this));
        C0574t.m1394a(this);
        if (C0571r.m1386w(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C05831(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f1896l);
                try {
                    this.f1903F = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f1903F = null;
            }
        }
        this.f1921o = 10.0f * f;
        this.f1910M = new ArrayList();
    }

    private void m1434a(int i, int i2) {
        int a = C0555d.m1224a(i2, C0571r.m1369h(this));
        if (i2 == 3) {
            this.f1930x = i;
        } else if (i2 == 5) {
            this.f1931y = i;
        } else if (i2 == 8388611) {
            this.f1932z = i;
        } else if (i2 == 8388613) {
            this.f1898A = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1911c : this.f1912d).m1560a();
        }
        View a2;
        switch (i) {
            case 1:
                a2 = m1445a(a);
                if (a2 != null) {
                    m1452f(a2);
                    break;
                }
                break;
            case 2:
                a2 = m1445a(a);
                if (a2 != null) {
                    m1451e(a2);
                    return;
                }
                break;
            default:
                return;
        }
    }

    private void m1435a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        int i2 = i;
        while (i < childCount) {
            View childAt = getChildAt(i);
            C0586d c0586d = (C0586d) childAt.getLayoutParams();
            if (m1439d(childAt) && (!z || c0586d.f1891c)) {
                i2 |= m1449a(childAt, 3) ? this.f1911c.m1565a(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1912d.m1565a(childAt, getWidth(), childAt.getTop());
                c0586d.f1891c = false;
            }
            i++;
        }
        this.f1926t.m9319b();
        this.f1927u.m9319b();
        if (i2 != 0) {
            invalidate();
        }
    }

    private static boolean m1436a(Drawable drawable, int i) {
        if (drawable != null) {
            if (C0429a.m890b(drawable)) {
                C0429a.m891b(drawable, i);
                return true;
            }
        }
        return false;
    }

    static float m1437b(View view) {
        return ((C0586d) view.getLayoutParams()).f1890b;
    }

    private View m1438b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C0586d) childAt.getLayoutParams()).f1892d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    static boolean m1439d(View view) {
        int a = C0555d.m1224a(((C0586d) view.getLayoutParams()).f1889a, C0571r.m1369h(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    public static boolean m1440g(View view) {
        if (m1439d(view)) {
            return (((C0586d) view.getLayoutParams()).f1892d & 1) == 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    static boolean m1441h(View view) {
        return (C0571r.m1364f(view) == 4 || C0571r.m1364f(view) == 2) ? false : true;
    }

    private static boolean m1442i(View view) {
        return ((C0586d) view.getLayoutParams()).f1889a == 0;
    }

    public final int m1443a(View view) {
        if (m1439d(view)) {
            int i = ((C0586d) view.getLayoutParams()).f1889a;
            int h = C0571r.m1369h(this);
            if (i != 3) {
                if (i != 5) {
                    if (i != 8388611) {
                        if (i == 8388613) {
                            if (this.f1898A != 3) {
                                return this.f1898A;
                            }
                            i = h == 0 ? this.f1931y : this.f1930x;
                            if (i != 3) {
                                return i;
                            }
                        }
                    } else if (this.f1932z != 3) {
                        return this.f1932z;
                    } else {
                        i = h == 0 ? this.f1930x : this.f1931y;
                        if (i != 3) {
                            return i;
                        }
                    }
                } else if (this.f1931y != 3) {
                    return this.f1931y;
                } else {
                    i = h == 0 ? this.f1898A : this.f1932z;
                    if (i != 3) {
                        return i;
                    }
                }
            } else if (this.f1930x != 3) {
                return this.f1930x;
            } else {
                i = h == 0 ? this.f1932z : this.f1898A;
                if (i != 3) {
                    return i;
                }
            }
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final View m1444a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1439d(childAt)) {
                if (m1439d(childAt)) {
                    if ((((C0586d) childAt.getLayoutParams()).f1890b > 0.0f ? 1 : null) != null) {
                        return childAt;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder("View ");
                    stringBuilder.append(childAt);
                    stringBuilder.append(" is not a drawer");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        return null;
    }

    final View m1445a(int i) {
        i = C0555d.m1224a(i, C0571r.m1369h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m1450c(childAt) & 7) == i) {
                return childAt;
            }
        }
        return null;
    }

    public final void m1446a(C0585c c0585c) {
        if (c0585c != null) {
            if (this.f1915g == null) {
                this.f1915g = new ArrayList();
            }
            this.f1915g.add(c0585c);
        }
    }

    final void m1447a(View view, float f) {
        C0586d c0586d = (C0586d) view.getLayoutParams();
        if (f != c0586d.f1890b) {
            c0586d.f1890b = f;
            if (this.f1915g != null) {
                for (int size = this.f1915g.size() - 1; size >= 0; size--) {
                    this.f1915g.get(size);
                }
            }
        }
    }

    final void m1448a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int i2 = ((z || m1439d(childAt)) && !(z && childAt == view)) ? 4 : 1;
            C0571r.m1352b(childAt, i2);
        }
    }

    final boolean m1449a(View view, int i) {
        return (m1450c(view) & i) == i;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            int i5 = i4;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (!m1439d(childAt)) {
                    this.f1910M.add(childAt);
                } else if (m1440g(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    i5 = 1;
                }
                i4++;
            }
            if (i5 == 0) {
                childCount = this.f1910M.size();
                while (i3 < childCount) {
                    View view = (View) this.f1910M.get(i3);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                    i3++;
                }
            }
            this.f1910M.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m1438b() == null) {
            if (!m1439d(view)) {
                i = 1;
                C0571r.m1352b(view, i);
                if (!f1895b) {
                    C0571r.m1340a(view, this.f1920n);
                }
            }
        }
        i = 4;
        C0571r.m1352b(view, i);
        if (!f1895b) {
            C0571r.m1340a(view, this.f1920n);
        }
    }

    final int m1450c(View view) {
        return C0555d.m1224a(((C0586d) view.getLayoutParams()).f1889a, C0571r.m1369h(this));
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0586d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C0586d) getChildAt(i).getLayoutParams()).f1890b);
        }
        this.f1924r = f;
        boolean c = this.f1911c.m1570c();
        boolean c2 = this.f1912d.m1570c();
        if (c || c2) {
            C0571r.m1361e(this);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean i3 = m1442i(view);
        int width = getWidth();
        int save = canvas.save();
        if (i3) {
            int childCount = getChildCount();
            i = width;
            width = 0;
            i2 = width;
            while (width < childCount) {
                View childAt = getChildAt(width);
                if (childAt != view2 && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    int i4 = (background == null || background.getOpacity() != -1) ? 0 : 1;
                    if (i4 != 0 && m1439d(childAt) && childAt.getHeight() >= height) {
                        int right;
                        if (m1449a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            right = childAt.getLeft();
                            if (right < i) {
                                i = right;
                            }
                        }
                    }
                }
                width++;
            }
            canvas2.clipRect(i2, 0, i, getHeight());
        } else {
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save);
        if (r0.f1924r <= 0.0f || !i3) {
            Drawable drawable;
            int right2;
            float max;
            if (r0.f1904G != null && m1449a(view2, 3)) {
                height = r0.f1904G.getIntrinsicWidth();
                right2 = view.getRight();
                max = Math.max(0.0f, Math.min(((float) right2) / ((float) r0.f1911c.f2068h), BallPulseIndicator.SCALE));
                r0.f1904G.setBounds(right2, view.getTop(), height + right2, view.getBottom());
                r0.f1904G.setAlpha((int) (255.0f * max));
                drawable = r0.f1904G;
            } else if (r0.f1905H == null || !m1449a(view2, 5)) {
                return drawChild;
            } else {
                height = r0.f1905H.getIntrinsicWidth();
                right2 = view.getLeft();
                max = Math.max(0.0f, Math.min(((float) (getWidth() - right2)) / ((float) r0.f1912d.f2068h), BallPulseIndicator.SCALE));
                r0.f1905H.setBounds(right2 - height, view.getTop(), right2, view.getBottom());
                r0.f1905H.setAlpha((int) (255.0f * max));
                drawable = r0.f1905H;
            }
            drawable.draw(canvas2);
            return drawChild;
        }
        r0.f1925s.setColor((((int) (((float) ((r0.f1923q & -16777216) >>> 24)) * r0.f1924r)) << 24) | (r0.f1923q & 16777215));
        canvas2.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), r0.f1925s);
        return drawChild;
    }

    public final void m1451e(View view) {
        if (m1439d(view)) {
            C0586d c0586d = (C0586d) view.getLayoutParams();
            if (this.f1929w) {
                c0586d.f1890b = BallPulseIndicator.SCALE;
                c0586d.f1892d = 1;
                m1448a(view, true);
            } else {
                C0634p c0634p;
                int i;
                c0586d.f1892d |= 2;
                if (m1449a(view, 3)) {
                    c0634p = this.f1911c;
                    i = 0;
                } else {
                    c0634p = this.f1912d;
                    i = getWidth() - view.getWidth();
                }
                c0634p.m1565a(view, i, view.getTop());
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void m1452f(View view) {
        if (m1439d(view)) {
            C0586d c0586d = (C0586d) view.getLayoutParams();
            if (this.f1929w) {
                c0586d.f1890b = 0.0f;
                c0586d.f1892d = 0;
            } else {
                C0634p c0634p;
                int i;
                c0586d.f1892d |= 4;
                if (m1449a(view, 3)) {
                    c0634p = this.f1911c;
                    i = -view.getWidth();
                } else {
                    c0634p = this.f1912d;
                    i = getWidth();
                }
                c0634p.m1565a(view, i, view.getTop());
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0586d();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0586d(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0586d ? new C0586d((C0586d) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0586d((MarginLayoutParams) layoutParams) : new C0586d(layoutParams);
    }

    public float getDrawerElevation() {
        return f1897m ? this.f1921o : 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1903F;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1929w = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1929w = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1919k && this.f1903F != null) {
            int systemWindowInsetTop = (VERSION.SDK_INT < 21 || this.f1918j == null) ? 0 : ((WindowInsets) this.f1918j).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f1903F.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1903F.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int length;
        int a = this.f1911c.m1564a(motionEvent) | this.f1912d.m1564a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1901D = x;
                this.f1902E = y;
                if (this.f1924r > 0.0f) {
                    View b = this.f1911c.m1566b((int) x, (int) y);
                    if (b != null && m1442i(b)) {
                        z = true;
                        this.f1899B = false;
                        this.f1914f = false;
                        break;
                    }
                }
                z = false;
                this.f1899B = false;
                this.f1914f = false;
            case 1:
            case 3:
                m1435a(true);
                this.f1899B = false;
                this.f1914f = false;
                break;
            case 2:
                C0634p c0634p = this.f1911c;
                length = c0634p.f2063c.length;
                int i = 0;
                while (i < length) {
                    boolean z2;
                    if (c0634p.m1562a(i)) {
                        float f = c0634p.f2065e[i] - c0634p.f2063c[i];
                        float f2 = c0634p.f2066f[i] - c0634p.f2064d[i];
                        if ((f * f) + (f2 * f2) > ((float) (c0634p.f2062b * c0634p.f2062b))) {
                            z2 = true;
                            if (z2) {
                                z = true;
                                if (z) {
                                    this.f1926t.m9319b();
                                    this.f1927u.m9319b();
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        z = true;
                        if (z) {
                            this.f1926t.m9319b();
                            this.f1927u.m9319b();
                        }
                    } else {
                        i++;
                    }
                }
                z = false;
                if (z) {
                    this.f1926t.m9319b();
                    this.f1927u.m9319b();
                }
                break;
            default:
                break;
        }
        z = false;
        if (a == 0 && !r9) {
            int childCount = getChildCount();
            length = 0;
            while (length < childCount) {
                if (((C0586d) getChildAt(length).getLayoutParams()).f1891c) {
                    z = true;
                    return z || this.f1914f;
                } else {
                    length++;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (m1444a() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View a = m1444a();
        if (a != null && m1443a(a) == 0) {
            m1435a(false);
        }
        return a != null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = true;
        this.f1928v = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0586d c0586d = (C0586d) childAt.getLayoutParams();
                if (m1442i(childAt)) {
                    childAt.layout(c0586d.leftMargin, c0586d.topMargin, c0586d.leftMargin + childAt.getMeasuredWidth(), c0586d.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1449a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i7 = (-measuredWidth) + ((int) (c0586d.f1890b * f2));
                        f = ((float) (measuredWidth + i7)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i5 - ((int) (c0586d.f1890b * f3));
                        f = ((float) (i5 - i8)) / f3;
                        i7 = i8;
                    }
                    boolean z3 = f != c0586d.f1890b ? z2 : false;
                    int i9 = c0586d.f1889a & 112;
                    int i10;
                    if (i9 == 16) {
                        i10 = i4 - i2;
                        i9 = (i10 - measuredHeight) / 2;
                        if (i9 < c0586d.topMargin) {
                            i9 = c0586d.topMargin;
                        } else if (i9 + measuredHeight > i10 - c0586d.bottomMargin) {
                            i9 = (i10 - c0586d.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i7, i9, measuredWidth + i7, measuredHeight + i9);
                    } else if (i9 != 80) {
                        childAt.layout(i7, c0586d.topMargin, measuredWidth + i7, c0586d.topMargin + measuredHeight);
                    } else {
                        i10 = i4 - i2;
                        childAt.layout(i7, (i10 - c0586d.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i10 - c0586d.bottomMargin);
                    }
                    if (z3) {
                        m1447a(childAt, f);
                    }
                    int i11 = c0586d.f1890b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
            i6++;
            z2 = true;
        }
        r0.f1928v = false;
        r0.f1929w = false;
    }

    protected void onMeasure(int i, int i2) {
        DrawerLayout drawerLayout = this;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = IjkMediaCodecInfo.RANK_SECURE;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = IjkMediaCodecInfo.RANK_SECURE;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        mode = (drawerLayout.f1918j == null || !C0571r.m1386w(this)) ? 0 : 1;
        int h = C0571r.m1369h(this);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = i4;
        int i6 = i5;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0586d c0586d = (C0586d) childAt.getLayoutParams();
                if (mode != 0) {
                    mode2 = C0555d.m1224a(c0586d.f1889a, h);
                    WindowInsets windowInsets;
                    if (C0571r.m1386w(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            windowInsets = (WindowInsets) drawerLayout.f1918j;
                            if (mode2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (mode2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        windowInsets = (WindowInsets) drawerLayout.f1918j;
                        if (mode2 == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (mode2 == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        c0586d.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        c0586d.topMargin = windowInsets.getSystemWindowInsetTop();
                        c0586d.rightMargin = windowInsets.getSystemWindowInsetRight();
                        c0586d.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (m1442i(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - c0586d.leftMargin) - c0586d.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - c0586d.topMargin) - c0586d.bottomMargin, 1073741824));
                } else if (m1439d(childAt)) {
                    if (f1897m && C0571r.m1382s(childAt) != drawerLayout.f1921o) {
                        C0571r.m1372i(childAt, drawerLayout.f1921o);
                    }
                    mode2 = m1450c(childAt) & 7;
                    int i7 = mode2 == 3 ? 1 : i3;
                    if ((i7 == 0 || r10 == 0) && (i7 != 0 || r11 == 0)) {
                        if (i7 != 0) {
                            i5 = 1;
                        } else {
                            i6 = 1;
                        }
                        childAt.measure(getChildMeasureSpec(i, (drawerLayout.f1922p + c0586d.leftMargin) + c0586d.rightMargin, c0586d.width), getChildMeasureSpec(i2, c0586d.topMargin + c0586d.bottomMargin, c0586d.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Child drawer has absolute gravity ");
                        String toHexString = (mode2 & 3) == 3 ? "LEFT" : (mode2 & 5) == 5 ? "RIGHT" : Integer.toHexString(mode2);
                        stringBuilder.append(toHexString);
                        stringBuilder.append(" but this DrawerLayout already has a drawer view along that edge");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder("Child ");
                    stringBuilder2.append(childAt);
                    stringBuilder2.append(" at index ");
                    stringBuilder2.append(i4);
                    stringBuilder2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            int i8 = i;
            int i9 = i2;
            i4++;
            i3 = 0;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.f13444a != 0) {
                View a = m1445a(savedState.f13444a);
                if (a != null) {
                    m1451e(a);
                }
            }
            if (savedState.f13445b != 3) {
                m1434a(savedState.f13445b, 3);
            }
            if (savedState.f13446c != 3) {
                m1434a(savedState.f13446c, 5);
            }
            if (savedState.f13447d != 3) {
                m1434a(savedState.f13447d, 8388611);
            }
            if (savedState.f13448e != 3) {
                m1434a(savedState.f13448e, 8388613);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onRtlPropertiesChanged(int i) {
        if (!f1897m) {
            Drawable drawable;
            i = C0571r.m1369h(this);
            if (i == 0) {
                if (this.f1906I != null) {
                    m1436a(this.f1906I, i);
                    drawable = this.f1906I;
                    this.f1904G = drawable;
                    i = C0571r.m1369h(this);
                    if (i == 0) {
                        if (this.f1907J != null) {
                            m1436a(this.f1907J, i);
                            drawable = this.f1907J;
                            this.f1905H = drawable;
                        }
                    } else if (this.f1906I != null) {
                        m1436a(this.f1906I, i);
                        drawable = this.f1906I;
                        this.f1905H = drawable;
                    }
                    drawable = this.f1909L;
                    this.f1905H = drawable;
                }
            } else if (this.f1907J != null) {
                m1436a(this.f1907J, i);
                drawable = this.f1907J;
                this.f1904G = drawable;
                i = C0571r.m1369h(this);
                if (i == 0) {
                    if (this.f1906I != null) {
                        m1436a(this.f1906I, i);
                        drawable = this.f1906I;
                        this.f1905H = drawable;
                    }
                } else if (this.f1907J != null) {
                    m1436a(this.f1907J, i);
                    drawable = this.f1907J;
                    this.f1905H = drawable;
                }
                drawable = this.f1909L;
                this.f1905H = drawable;
            }
            drawable = this.f1908K;
            this.f1904G = drawable;
            i = C0571r.m1369h(this);
            if (i == 0) {
                if (this.f1907J != null) {
                    m1436a(this.f1907J, i);
                    drawable = this.f1907J;
                    this.f1905H = drawable;
                }
            } else if (this.f1906I != null) {
                m1436a(this.f1906I, i);
                drawable = this.f1906I;
                this.f1905H = drawable;
            }
            drawable = this.f1909L;
            this.f1905H = drawable;
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            C0586d c0586d = (C0586d) getChildAt(i).getLayoutParams();
            Object obj = 1;
            Object obj2 = c0586d.f1892d == 1 ? 1 : null;
            if (c0586d.f1892d != 2) {
                obj = null;
            }
            if (obj2 == null) {
                if (obj == null) {
                    i++;
                }
            }
            savedState.f13444a = c0586d.f1889a;
            break;
        }
        savedState.f13445b = this.f1930x;
        savedState.f13446c = this.f1931y;
        savedState.f13447d = this.f1932z;
        savedState.f13448e = this.f1898A;
        return savedState;
    }

    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0070 in {3, 14, 15, 16, 18, 19, 21, 22} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = r6.f1911c;
        r0.m1569b(r7);
        r0 = r6.f1912d;
        r0.m1569b(r7);
        r0 = r7.getAction();
        r0 = r0 & 255;
        r1 = 3;
        r2 = 1;
        r3 = 0;
        if (r0 == r1) goto L_0x006c;
    L_0x0015:
        switch(r0) {
            case 0: goto L_0x005b;
            case 1: goto L_0x0019;
            default: goto L_0x0018;
        };
    L_0x0018:
        return r2;
    L_0x0019:
        r0 = r7.getX();
        r7 = r7.getY();
        r1 = r6.f1911c;
        r4 = (int) r0;
        r5 = (int) r7;
        r1 = r1.m1566b(r4, r5);
        if (r1 == 0) goto L_0x0054;
    L_0x002b:
        r1 = m1442i(r1);
        if (r1 == 0) goto L_0x0054;
    L_0x0031:
        r1 = r6.f1901D;
        r0 = r0 - r1;
        r1 = r6.f1902E;
        r7 = r7 - r1;
        r1 = r6.f1911c;
        r1 = r1.f2062b;
        r0 = r0 * r0;
        r7 = r7 * r7;
        r0 = r0 + r7;
        r1 = r1 * r1;
        r7 = (float) r1;
        r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r7 >= 0) goto L_0x0054;
    L_0x0044:
        r7 = r6.m1438b();
        if (r7 == 0) goto L_0x0054;
    L_0x004a:
        r7 = r6.m1443a(r7);
        r0 = 2;
        if (r7 != r0) goto L_0x0052;
    L_0x0051:
        goto L_0x0054;
    L_0x0052:
        r7 = r3;
        goto L_0x0055;
    L_0x0054:
        r7 = r2;
    L_0x0055:
        r6.m1435a(r7);
        r6.f1899B = r3;
        return r2;
    L_0x005b:
        r0 = r7.getX();
        r7 = r7.getY();
        r6.f1901D = r0;
        r6.f1902E = r7;
    L_0x0067:
        r6.f1899B = r3;
        r6.f1914f = r3;
        return r2;
    L_0x006c:
        r6.m1435a(r2);
        goto L_0x0067;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1899B = z;
        if (z) {
            m1435a(true);
        }
    }

    public void requestLayout() {
        if (!this.f1928v) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1921o = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m1439d(childAt)) {
                C0571r.m1372i(childAt, this.f1921o);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0585c c0585c) {
        if (this.f1900C != null) {
            C0585c c0585c2 = this.f1900C;
            if (!(c0585c2 == null || this.f1915g == null)) {
                this.f1915g.remove(c0585c2);
            }
        }
        if (c0585c != null) {
            m1446a(c0585c);
        }
        this.f1900C = c0585c;
    }

    public void setDrawerLockMode(int i) {
        m1434a(i, 3);
        m1434a(i, 5);
    }

    public void setScrimColor(int i) {
        this.f1923q = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f1903F = i != 0 ? C0346c.m682a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f1903F = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f1903F = new ColorDrawable(i);
        invalidate();
    }
}
