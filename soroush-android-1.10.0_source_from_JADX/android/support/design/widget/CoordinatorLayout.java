package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.design.C0249a.C0247j;
import android.support.design.C0249a.C0248k;
import android.support.v4.p029a.C0346c;
import android.support.v4.p031b.p032a.C0429a;
import android.support.v4.p038g.C0477i;
import android.support.v4.p038g.C0480k.C0479a;
import android.support.v4.p038g.C0480k.C6367c;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0563l;
import android.support.v4.view.C0564m;
import android.support.v4.view.C0571r;
import android.support.v4.view.C0582z;
import android.support.v4.view.C4842k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.util.TemplatePrecompiler;

public class CoordinatorLayout extends ViewGroup implements C4842k {
    static final String f17351a;
    static final Class<?>[] f17352b = new Class[]{Context.class, AttributeSet.class};
    static final ThreadLocal<Map<String, Constructor<C0270a>>> f17353c = new ThreadLocal();
    static final Comparator<View> f17354d;
    private static final C0479a<Rect> f17355j = new C6367c(12);
    final C0311h<View> f17356e;
    final List<View> f17357f;
    C0582z f17358g;
    boolean f17359h;
    OnHierarchyChangeListener f17360i;
    private final List<View> f17361k;
    private final List<View> f17362l;
    private final int[] f17363m;
    private boolean f17364n;
    private boolean f17365o;
    private int[] f17366p;
    private View f17367q;
    private View f17368r;
    private C0274e f17369s;
    private boolean f17370t;
    private Drawable f17371u;
    private C0564m f17372v;
    private final C0563l f17373w;

    public static abstract class C0270a<V extends View> {
        public C0270a(Context context, AttributeSet attributeSet) {
        }

        public void mo159a(C0273d c0273d) {
        }

        public void mo148a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public void mo3269a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo150a((View) v, view);
            }
        }

        @Deprecated
        public void mo3183a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        public void mo3270a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3183a(coordinatorLayout, (View) v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void mo149a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void mo3271a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo149a(coordinatorLayout, (View) v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void mo150a(V v, View view) {
        }

        @Deprecated
        public boolean mo151a(int i) {
            return false;
        }

        public boolean mo152a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean mo2519a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean mo3278a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public boolean mo153a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean mo160a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean mo154a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean mo3571a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean mo3272a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2) {
            return i2 == 0 ? mo151a(i) : false;
        }

        public boolean mo161a(V v, Rect rect) {
            return false;
        }

        public boolean a_(View view) {
            return false;
        }

        public Parcelable mo155b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        public boolean mo156b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface C0271b {
        Class<? extends C0270a> m505a();
    }

    private class C0272c implements OnHierarchyChangeListener {
        final /* synthetic */ CoordinatorLayout f986a;

        C0272c(CoordinatorLayout coordinatorLayout) {
            this.f986a = coordinatorLayout;
        }

        public final void onChildViewAdded(View view, View view2) {
            if (this.f986a.f17360i != null) {
                this.f986a.f17360i.onChildViewAdded(view, view2);
            }
        }

        public final void onChildViewRemoved(View view, View view2) {
            this.f986a.m14911a(2);
            if (this.f986a.f17360i != null) {
                this.f986a.f17360i.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class C0273d extends MarginLayoutParams {
        public C0270a f987a;
        boolean f988b = false;
        public int f989c = 0;
        public int f990d = 8388693;
        public int f991e = -1;
        int f992f = -1;
        public int f993g = 0;
        public int f994h = 0;
        int f995i;
        int f996j;
        View f997k;
        View f998l;
        boolean f999m;
        boolean f1000n;
        final Rect f1001o = new Rect();
        Object f1002p;
        private boolean f1003q;
        private boolean f1004r;

        public C0273d() {
            super(-2, -2);
        }

        C0273d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.CoordinatorLayout_Layout);
            this.f989c = obtainStyledAttributes.getInteger(C0248k.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f992f = obtainStyledAttributes.getResourceId(C0248k.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f990d = obtainStyledAttributes.getInteger(C0248k.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f991e = obtainStyledAttributes.getInteger(C0248k.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f993g = obtainStyledAttributes.getInt(C0248k.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f994h = obtainStyledAttributes.getInt(C0248k.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f988b = obtainStyledAttributes.hasValue(C0248k.CoordinatorLayout_Layout_layout_behavior);
            if (this.f988b) {
                this.f987a = CoordinatorLayout.m14895a(context, attributeSet, obtainStyledAttributes.getString(C0248k.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f987a != null) {
                this.f987a.mo159a(this);
            }
        }

        public C0273d(C0273d c0273d) {
            super(c0273d);
        }

        public C0273d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0273d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        final void m506a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f1003q = z;
                    return;
                case 1:
                    this.f1004r = z;
                    return;
                default:
                    return;
            }
        }

        public final void m507a(C0270a c0270a) {
            if (this.f987a != c0270a) {
                this.f987a = c0270a;
                this.f1002p = null;
                this.f988b = true;
                if (c0270a != null) {
                    c0270a.mo159a(this);
                }
            }
        }

        final boolean m508a(int i) {
            switch (i) {
                case 0:
                    return this.f1003q;
                case 1:
                    return this.f1004r;
                default:
                    return false;
            }
        }
    }

    class C0274e implements OnPreDrawListener {
        final /* synthetic */ CoordinatorLayout f1005a;

        C0274e(CoordinatorLayout coordinatorLayout) {
            this.f1005a = coordinatorLayout;
        }

        public final boolean onPreDraw() {
            this.f1005a.m14911a(0);
            return true;
        }
    }

    static class C0275f implements Comparator<View> {
        C0275f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            View view = (View) obj2;
            float E = C0571r.m1327E((View) obj);
            float E2 = C0571r.m1327E(view);
            return E > E2 ? -1 : E < E2 ? 1 : 0;
        }
    }

    class C47361 implements C0564m {
        final /* synthetic */ CoordinatorLayout f13071a;

        C47361(CoordinatorLayout coordinatorLayout) {
            this.f13071a = coordinatorLayout;
        }

        public final C0582z mo139a(View view, C0582z c0582z) {
            CoordinatorLayout coordinatorLayout = this.f13071a;
            if (!C0477i.m1005a(coordinatorLayout.f17358g, c0582z)) {
                coordinatorLayout.f17358g = c0582z;
                int i = 0;
                boolean z = true;
                boolean z2 = c0582z != null && c0582z.m1428b() > 0;
                coordinatorLayout.f17359h = z2;
                if (coordinatorLayout.f17359h || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!c0582z.m1431e()) {
                    int childCount = coordinatorLayout.getChildCount();
                    while (i < childCount) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        if (C0571r.m1386w(childAt) && ((C0273d) childAt.getLayoutParams()).f987a != null && c0582z.m1431e()) {
                            break;
                        }
                        i++;
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return c0582z;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02691();
        SparseArray<Parcelable> f13072a;

        static class C02691 implements ClassLoaderCreator<SavedState> {
            C02691() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f13072a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f13072a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int i2 = 0;
            int size = this.f13072a != null ? this.f13072a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            while (i2 < size) {
                iArr[i2] = this.f13072a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f13072a.valueAt(i2);
                i2++;
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f17351a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f17354d = new C0275f();
        } else {
            f17354d = null;
        }
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17361k = new ArrayList();
        this.f17356e = new C0311h();
        this.f17362l = new ArrayList();
        this.f17357f = new ArrayList();
        this.f17363m = new int[2];
        this.f17373w = new C0563l(this);
        C0330t.m650a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0248k.CoordinatorLayout, i, C0247j.Widget_Design_CoordinatorLayout);
        int i2 = 0;
        i = obtainStyledAttributes.getResourceId(C0248k.CoordinatorLayout_keylines, 0);
        if (i != 0) {
            Resources resources = context.getResources();
            this.f17366p = resources.getIntArray(i);
            float f = resources.getDisplayMetrics().density;
            i = this.f17366p.length;
            while (i2 < i) {
                this.f17366p[i2] = (int) (((float) this.f17366p[i2]) * f);
                i2++;
            }
        }
        this.f17371u = obtainStyledAttributes.getDrawable(C0248k.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m14907d();
        super.setOnHierarchyChangeListener(new C0272c(this));
    }

    private static Rect m14894a() {
        Rect rect = (Rect) f17355j.mo308a();
        return rect == null ? new Rect() : rect;
    }

    static C0270a m14895a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(TemplatePrecompiler.DEFAULT_DEST)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f17351a)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(f17351a);
            stringBuilder2.append('.');
            stringBuilder2.append(str);
            str = stringBuilder2.toString();
        }
        try {
            Map map = (Map) f17353c.get();
            if (map == null) {
                map = new HashMap();
                f17353c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(f17352b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0270a) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Could not inflate Behavior subclass ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    private static void m14896a(int i, Rect rect, Rect rect2, C0273d c0273d, int i2, int i3) {
        int i4 = c0273d.f989c;
        if (i4 == 0) {
            i4 = 17;
        }
        i4 = C0555d.m1224a(i4, i);
        i = C0555d.m1224a(m14904c(c0273d.f990d), i);
        int i5 = i4 & 7;
        i4 &= 112;
        int i6 = i & 7;
        i &= 112;
        i6 = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        i = i != 16 ? i != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            i6 -= i2 / 2;
        } else if (i5 != 5) {
            i6 -= i2;
        }
        if (i4 == 16) {
            i -= i3 / 2;
        } else if (i4 != 80) {
            i -= i3;
        }
        rect2.set(i6, i, i2 + i6, i3 + i);
    }

    private static void m14897a(Rect rect) {
        rect.setEmpty();
        f17355j.mo309a(rect);
    }

    private void m14898a(C0273d c0273d, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + c0273d.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0273d.rightMargin));
        int max = Math.max(getPaddingTop() + c0273d.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0273d.bottomMargin));
        rect.set(width, max, i + width, i2 + max);
    }

    private void m14899a(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested()) {
            if (view.getVisibility() != 8) {
                if (z) {
                    C0331u.m651a((ViewGroup) this, view, rect);
                    return;
                } else {
                    rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    return;
                }
            }
        }
        rect.setEmpty();
    }

    private boolean m14900a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f17362l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i2 = childCount - 1;
        while (i2 >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
            i2--;
        }
        if (f17354d != null) {
            Collections.sort(list, f17354d);
        }
        int size = list.size();
        boolean z = false;
        boolean z2 = z;
        MotionEvent motionEvent3 = null;
        for (i2 = z2; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0273d c0273d = (C0273d) view.getLayoutParams();
            C0270a c0270a = c0273d.f987a;
            if ((z || r8) && actionMasked != 0) {
                if (c0270a != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            c0270a.mo153a(r0, view, motionEvent3);
                            break;
                        case 1:
                            c0270a.mo156b(r0, view, motionEvent3);
                            break;
                        default:
                            break;
                    }
                }
            } else {
                boolean z3;
                if (!(z || c0270a == null)) {
                    switch (i) {
                        case 0:
                            z = c0270a.mo153a(r0, view, motionEvent2);
                            break;
                        case 1:
                            z = c0270a.mo156b(r0, view, motionEvent2);
                            break;
                        default:
                            break;
                    }
                    if (z) {
                        r0.f17367q = view;
                    }
                }
                if (c0273d.f987a == null) {
                    c0273d.f999m = false;
                }
                z2 = c0273d.f999m;
                boolean z4 = true;
                if (c0273d.f999m) {
                    z3 = true;
                } else {
                    z3 = c0273d.f999m | false;
                    c0273d.f999m = z3;
                }
                if (!z3 || z2) {
                    z4 = false;
                }
                if (!z3 || z4) {
                    z2 = z4;
                } else {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    private int m14901b(int i) {
        String str;
        StringBuilder stringBuilder;
        if (this.f17366p == null) {
            str = "CoordinatorLayout";
            stringBuilder = new StringBuilder("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
        } else {
            if (i >= 0) {
                if (i < this.f17366p.length) {
                    return this.f17366p[i];
                }
            }
            str = "CoordinatorLayout";
            stringBuilder = new StringBuilder("Keyline index ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for ");
            stringBuilder.append(this);
        }
        Log.e(str, stringBuilder.toString());
        return 0;
    }

    private static C0273d m14902b(View view) {
        C0273d c0273d = (C0273d) view.getLayoutParams();
        if (!c0273d.f988b) {
            C0271b c0271b = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                c0271b = (C0271b) cls.getAnnotation(C0271b.class);
                if (c0271b != null) {
                    break;
                }
            }
            if (c0271b != null) {
                try {
                    c0273d.m507a((C0270a) c0271b.m505a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder("Default behavior class ");
                    stringBuilder.append(c0271b.m505a().getName());
                    stringBuilder.append(" could not be instantiated. Did you forget a default constructor?");
                    Log.e("CoordinatorLayout", stringBuilder.toString(), e);
                }
            }
            c0273d.f988b = true;
        }
        return c0273d;
    }

    private void m14903b() {
        if (this.f17367q != null) {
            C0270a c0270a = ((C0273d) this.f17367q.getLayoutParams()).f987a;
            if (c0270a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                c0270a.mo156b(this, this.f17367q, obtain);
                obtain.recycle();
            }
            this.f17367q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C0273d) getChildAt(i).getLayoutParams()).f999m = false;
        }
        this.f17364n = false;
    }

    private static int m14904c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14905c() {
        /*
        r11 = this;
        r0 = r11.f17361k;
        r0.clear();
        r0 = r11.f17356e;
        r1 = r0.f1213b;
        r1 = r1.size();
        r2 = 0;
        r3 = r2;
    L_0x000f:
        if (r3 >= r1) goto L_0x0026;
    L_0x0011:
        r4 = r0.f1213b;
        r4 = r4.m1020c(r3);
        r4 = (java.util.ArrayList) r4;
        if (r4 == 0) goto L_0x0023;
    L_0x001b:
        r4.clear();
        r5 = r0.f1212a;
        r5.mo309a(r4);
    L_0x0023:
        r3 = r3 + 1;
        goto L_0x000f;
    L_0x0026:
        r0 = r0.f1213b;
        r0.clear();
        r0 = r11.getChildCount();
        r1 = r2;
    L_0x0030:
        if (r1 >= r0) goto L_0x018d;
    L_0x0032:
        r3 = r11.getChildAt(r1);
        r4 = m14902b(r3);
        r5 = r4.f992f;
        r6 = -1;
        r7 = 0;
        r8 = 1;
        if (r5 != r6) goto L_0x0047;
    L_0x0041:
        r4.f998l = r7;
        r4.f997k = r7;
        goto L_0x00cf;
    L_0x0047:
        r5 = r4.f997k;
        if (r5 == 0) goto L_0x007c;
    L_0x004b:
        r5 = r4.f997k;
        r5 = r5.getId();
        r6 = r4.f992f;
        if (r5 == r6) goto L_0x0057;
    L_0x0055:
        r5 = r2;
        goto L_0x007a;
    L_0x0057:
        r5 = r4.f997k;
        r6 = r4.f997k;
        r6 = r6.getParent();
    L_0x005f:
        if (r6 == r11) goto L_0x0077;
    L_0x0061:
        if (r6 == 0) goto L_0x0072;
    L_0x0063:
        if (r6 != r3) goto L_0x0066;
    L_0x0065:
        goto L_0x0072;
    L_0x0066:
        r9 = r6 instanceof android.view.View;
        if (r9 == 0) goto L_0x006d;
    L_0x006a:
        r5 = r6;
        r5 = (android.view.View) r5;
    L_0x006d:
        r6 = r6.getParent();
        goto L_0x005f;
    L_0x0072:
        r4.f998l = r7;
        r4.f997k = r7;
        goto L_0x0055;
    L_0x0077:
        r4.f998l = r5;
        r5 = r8;
    L_0x007a:
        if (r5 != 0) goto L_0x00cf;
    L_0x007c:
        r5 = r4.f992f;
        r5 = r11.findViewById(r5);
        r4.f997k = r5;
        r5 = r4.f997k;
        if (r5 == 0) goto L_0x00c7;
    L_0x0088:
        r5 = r4.f997k;
        if (r5 != r11) goto L_0x009b;
    L_0x008c:
        r5 = r11.isInEditMode();
        if (r5 == 0) goto L_0x0093;
    L_0x0092:
        goto L_0x0041;
    L_0x0093:
        r0 = new java.lang.IllegalStateException;
        r1 = "View can not be anchored to the the parent CoordinatorLayout";
        r0.<init>(r1);
        throw r0;
    L_0x009b:
        r5 = r4.f997k;
        r6 = r4.f997k;
        r6 = r6.getParent();
    L_0x00a3:
        if (r6 == r11) goto L_0x00c4;
    L_0x00a5:
        if (r6 == 0) goto L_0x00c4;
    L_0x00a7:
        if (r6 != r3) goto L_0x00b8;
    L_0x00a9:
        r5 = r11.isInEditMode();
        if (r5 == 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x0041;
    L_0x00b0:
        r0 = new java.lang.IllegalStateException;
        r1 = "Anchor must not be a descendant of the anchored view";
        r0.<init>(r1);
        throw r0;
    L_0x00b8:
        r9 = r6 instanceof android.view.View;
        if (r9 == 0) goto L_0x00bf;
    L_0x00bc:
        r5 = r6;
        r5 = (android.view.View) r5;
    L_0x00bf:
        r6 = r6.getParent();
        goto L_0x00a3;
    L_0x00c4:
        r4.f998l = r5;
        goto L_0x00cf;
    L_0x00c7:
        r5 = r11.isInEditMode();
        if (r5 == 0) goto L_0x0167;
    L_0x00cd:
        goto L_0x0041;
    L_0x00cf:
        r5 = r11.f17356e;
        r5.m610a(r3);
        r5 = r2;
    L_0x00d5:
        if (r5 >= r0) goto L_0x0163;
    L_0x00d7:
        if (r5 == r1) goto L_0x015f;
    L_0x00d9:
        r6 = r11.getChildAt(r5);
        r7 = r4.f998l;
        if (r6 == r7) goto L_0x0110;
    L_0x00e1:
        r7 = android.support.v4.view.C0571r.m1369h(r11);
        r9 = r6.getLayoutParams();
        r9 = (android.support.design.widget.CoordinatorLayout.C0273d) r9;
        r9 = r9.f993g;
        r9 = android.support.v4.view.C0555d.m1224a(r9, r7);
        if (r9 == 0) goto L_0x00fe;
    L_0x00f3:
        r10 = r4.f994h;
        r7 = android.support.v4.view.C0555d.m1224a(r10, r7);
        r7 = r7 & r9;
        if (r7 != r9) goto L_0x00fe;
    L_0x00fc:
        r7 = r8;
        goto L_0x00ff;
    L_0x00fe:
        r7 = r2;
    L_0x00ff:
        if (r7 != 0) goto L_0x0110;
    L_0x0101:
        r7 = r4.f987a;
        if (r7 == 0) goto L_0x010e;
    L_0x0105:
        r7 = r4.f987a;
        r7 = r7.a_(r6);
        if (r7 == 0) goto L_0x010e;
    L_0x010d:
        goto L_0x0110;
    L_0x010e:
        r7 = r2;
        goto L_0x0111;
    L_0x0110:
        r7 = r8;
    L_0x0111:
        if (r7 == 0) goto L_0x015f;
    L_0x0113:
        r7 = r11.f17356e;
        r7 = r7.f1213b;
        r7 = r7.containsKey(r6);
        if (r7 != 0) goto L_0x0122;
    L_0x011d:
        r7 = r11.f17356e;
        r7.m610a(r6);
    L_0x0122:
        r7 = r11.f17356e;
        r9 = r7.f1213b;
        r9 = r9.containsKey(r6);
        if (r9 == 0) goto L_0x0157;
    L_0x012c:
        r9 = r7.f1213b;
        r9 = r9.containsKey(r3);
        if (r9 != 0) goto L_0x0135;
    L_0x0134:
        goto L_0x0157;
    L_0x0135:
        r9 = r7.f1213b;
        r9 = r9.get(r6);
        r9 = (java.util.ArrayList) r9;
        if (r9 != 0) goto L_0x0153;
    L_0x013f:
        r9 = r7.f1212a;
        r9 = r9.mo308a();
        r9 = (java.util.ArrayList) r9;
        if (r9 != 0) goto L_0x014e;
    L_0x0149:
        r9 = new java.util.ArrayList;
        r9.<init>();
    L_0x014e:
        r7 = r7.f1213b;
        r7.put(r6, r9);
    L_0x0153:
        r9.add(r3);
        goto L_0x015f;
    L_0x0157:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "All nodes must be present in the graph before being added as an edge";
        r0.<init>(r1);
        throw r0;
    L_0x015f:
        r5 = r5 + 1;
        goto L_0x00d5;
    L_0x0163:
        r1 = r1 + 1;
        goto L_0x0030;
    L_0x0167:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not find CoordinatorLayout descendant view with id ";
        r1.<init>(r2);
        r2 = r11.getResources();
        r4 = r4.f992f;
        r2 = r2.getResourceName(r4);
        r1.append(r2);
        r2 = " to anchor view ";
        r1.append(r2);
        r1.append(r3);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x018d:
        r0 = r11.f17361k;
        r1 = r11.f17356e;
        r1 = r1.m609a();
        r0.addAll(r1);
        r0 = r11.f17361k;
        java.util.Collections.reverse(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.c():void");
    }

    private static int m14906d(int i) {
        return i == 0 ? 8388661 : i;
    }

    private void m14907d() {
        if (VERSION.SDK_INT >= 21) {
            if (C0571r.m1386w(this)) {
                if (this.f17372v == null) {
                    this.f17372v = new C47361(this);
                }
                C0571r.m1341a((View) this, this.f17372v);
                setSystemUiVisibility(1280);
                return;
            }
            C0571r.m1341a((View) this, null);
        }
    }

    private static void m14908d(View view, int i) {
        C0273d c0273d = (C0273d) view.getLayoutParams();
        if (c0273d.f995i != i) {
            C0571r.m1363e(view, i - c0273d.f995i);
            c0273d.f995i = i;
        }
    }

    private static void m14909e(View view, int i) {
        C0273d c0273d = (C0273d) view.getLayoutParams();
        if (c0273d.f996j != i) {
            C0571r.m1359d(view, i - c0273d.f996j);
            c0273d.f996j = i;
        }
    }

    public final List<View> m14910a(View view) {
        C0311h c0311h = this.f17356e;
        int size = c0311h.f1213b.size();
        Collection collection = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) c0311h.f1213b.m1020c(i);
            if (arrayList != null && arrayList.contains(view)) {
                if (collection == null) {
                    collection = new ArrayList();
                }
                collection.add(c0311h.f1213b.m1019b(i));
            }
        }
        this.f17357f.clear();
        if (collection != null) {
            this.f17357f.addAll(collection);
        }
        return this.f17357f;
    }

    final void m14911a(int i) {
        Rect rect;
        int i2 = i;
        int h = C0571r.m1369h(this);
        int size = this.f17361k.size();
        Rect a = m14894a();
        Rect a2 = m14894a();
        Rect a3 = m14894a();
        int i3 = 0;
        while (i3 < size) {
            int i4;
            int i5;
            int i6;
            Rect rect2;
            C0273d c0273d;
            C0273d c0273d2;
            int i7;
            C0270a c0270a;
            View view = (View) r0.f17361k.get(i3);
            C0273d c0273d3 = (C0273d) view.getLayoutParams();
            if (i2 == 0) {
                if (view.getVisibility() == 8) {
                    i4 = size;
                    rect = a3;
                    i5 = i3;
                    i3 = i5 + 1;
                    size = i4;
                    a3 = rect;
                }
            }
            int i8 = 0;
            while (i8 < i3) {
                Rect a4;
                int i9;
                if (c0273d3.f998l == ((View) r0.f17361k.get(i8))) {
                    C0273d c0273d4 = (C0273d) view.getLayoutParams();
                    if (c0273d4.f997k != null) {
                        Rect a5 = m14894a();
                        Rect a6 = m14894a();
                        a4 = m14894a();
                        C0331u.m651a((ViewGroup) r0, c0273d4.f997k, a5);
                        m14899a(view, false, a6);
                        int measuredWidth = view.getMeasuredWidth();
                        i6 = size;
                        size = view.getMeasuredHeight();
                        i5 = i3;
                        Rect rect3 = a6;
                        Rect rect4 = a5;
                        C0273d c0273d5 = c0273d4;
                        int i10 = measuredWidth;
                        rect2 = a3;
                        Object obj = 1;
                        i9 = i8;
                        c0273d = c0273d3;
                        m14896a(h, a5, a4, c0273d5, i10, size);
                        if (a4.left == rect3.left) {
                            if (a4.top == rect3.top) {
                                c0273d2 = c0273d5;
                                i4 = i10;
                                obj = null;
                                m14898a(c0273d2, a4, i4, size);
                                i4 = a4.left - rect3.left;
                                i7 = a4.top - rect3.top;
                                if (i4 != 0) {
                                    C0571r.m1363e(view, i4);
                                }
                                if (i7 != 0) {
                                    C0571r.m1359d(view, i7);
                                }
                                if (obj != null) {
                                    c0270a = c0273d2.f987a;
                                    if (c0270a != null) {
                                        c0270a.mo160a(r0, view, c0273d2.f997k);
                                    }
                                }
                                m14897a(rect4);
                                m14897a(rect3);
                                m14897a(a4);
                                i8 = i9 + 1;
                                size = i6;
                                i3 = i5;
                                a3 = rect2;
                                c0273d3 = c0273d;
                            }
                        }
                        c0273d2 = c0273d5;
                        i4 = i10;
                        m14898a(c0273d2, a4, i4, size);
                        i4 = a4.left - rect3.left;
                        i7 = a4.top - rect3.top;
                        if (i4 != 0) {
                            C0571r.m1363e(view, i4);
                        }
                        if (i7 != 0) {
                            C0571r.m1359d(view, i7);
                        }
                        if (obj != null) {
                            c0270a = c0273d2.f987a;
                            if (c0270a != null) {
                                c0270a.mo160a(r0, view, c0273d2.f997k);
                            }
                        }
                        m14897a(rect4);
                        m14897a(rect3);
                        m14897a(a4);
                        i8 = i9 + 1;
                        size = i6;
                        i3 = i5;
                        a3 = rect2;
                        c0273d3 = c0273d;
                    }
                }
                i9 = i8;
                c0273d = c0273d3;
                i6 = size;
                rect2 = a3;
                i5 = i3;
                i8 = i9 + 1;
                size = i6;
                i3 = i5;
                a3 = rect2;
                c0273d3 = c0273d;
            }
            c0273d = c0273d3;
            i6 = size;
            rect2 = a3;
            i5 = i3;
            m14899a(view, true, a2);
            c0273d2 = c0273d;
            if (!(c0273d2.f993g == 0 || a2.isEmpty())) {
                i4 = C0555d.m1224a(c0273d2.f993g, h);
                size = i4 & 112;
                if (size == 48) {
                    a.top = Math.max(a.top, a2.bottom);
                } else if (size == 80) {
                    a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                }
                i4 &= 7;
                if (i4 == 3) {
                    a.left = Math.max(a.left, a2.right);
                } else if (i4 == 5) {
                    a.right = Math.max(a.right, getWidth() - a2.left);
                }
            }
            if (c0273d2.f994h != 0 && view.getVisibility() == 0 && C0571r.m1326D(view) && view.getWidth() > 0) {
                if (view.getHeight() > 0) {
                    c0273d2 = (C0273d) view.getLayoutParams();
                    c0270a = c0273d2.f987a;
                    Rect a7 = m14894a();
                    a4 = m14894a();
                    a4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (c0270a == null || !c0270a.mo161a(view, a7)) {
                        a7.set(a4);
                    } else if (!a4.contains(a7)) {
                        StringBuilder stringBuilder = new StringBuilder("Rect should be within the child's bounds. Rect:");
                        stringBuilder.append(a7.toShortString());
                        stringBuilder.append(" | Bounds:");
                        stringBuilder.append(a4.toShortString());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    m14897a(a4);
                    if (!a7.isEmpty()) {
                        Object obj2;
                        i4 = C0555d.m1224a(c0273d2.f994h, h);
                        if ((i4 & 48) == 48) {
                            i7 = (a7.top - c0273d2.topMargin) - c0273d2.f996j;
                            if (i7 < a.top) {
                                m14909e(view, a.top - i7);
                                obj2 = 1;
                                if ((i4 & 80) == 80) {
                                    i7 = ((getHeight() - a7.bottom) - c0273d2.bottomMargin) + c0273d2.f996j;
                                    if (i7 < a.bottom) {
                                        m14909e(view, i7 - a.bottom);
                                        obj2 = 1;
                                    }
                                }
                                if (obj2 == null) {
                                    m14909e(view, 0);
                                }
                                if ((i4 & 3) == 3) {
                                    i7 = (a7.left - c0273d2.leftMargin) - c0273d2.f995i;
                                    if (i7 < a.left) {
                                        m14908d(view, a.left - i7);
                                        obj2 = 1;
                                        if ((i4 & 5) == 5) {
                                            i4 = ((getWidth() - a7.right) - c0273d2.rightMargin) + c0273d2.f995i;
                                            if (i4 < a.right) {
                                                m14908d(view, i4 - a.right);
                                                obj2 = 1;
                                            }
                                        }
                                        if (obj2 == null) {
                                            m14908d(view, 0);
                                        }
                                    }
                                }
                                obj2 = null;
                                if ((i4 & 5) == 5) {
                                    i4 = ((getWidth() - a7.right) - c0273d2.rightMargin) + c0273d2.f995i;
                                    if (i4 < a.right) {
                                        m14908d(view, i4 - a.right);
                                        obj2 = 1;
                                    }
                                }
                                if (obj2 == null) {
                                    m14908d(view, 0);
                                }
                            }
                        }
                        obj2 = null;
                        if ((i4 & 80) == 80) {
                            i7 = ((getHeight() - a7.bottom) - c0273d2.bottomMargin) + c0273d2.f996j;
                            if (i7 < a.bottom) {
                                m14909e(view, i7 - a.bottom);
                                obj2 = 1;
                            }
                        }
                        if (obj2 == null) {
                            m14909e(view, 0);
                        }
                        if ((i4 & 3) == 3) {
                            i7 = (a7.left - c0273d2.leftMargin) - c0273d2.f995i;
                            if (i7 < a.left) {
                                m14908d(view, a.left - i7);
                                obj2 = 1;
                                if ((i4 & 5) == 5) {
                                    i4 = ((getWidth() - a7.right) - c0273d2.rightMargin) + c0273d2.f995i;
                                    if (i4 < a.right) {
                                        m14908d(view, i4 - a.right);
                                        obj2 = 1;
                                    }
                                }
                                if (obj2 == null) {
                                    m14908d(view, 0);
                                }
                            }
                        }
                        obj2 = null;
                        if ((i4 & 5) == 5) {
                            i4 = ((getWidth() - a7.right) - c0273d2.rightMargin) + c0273d2.f995i;
                            if (i4 < a.right) {
                                m14908d(view, i4 - a.right);
                                obj2 = 1;
                            }
                        }
                        if (obj2 == null) {
                            m14908d(view, 0);
                        }
                    }
                    m14897a(a7);
                }
            }
            if (i2 != 2) {
                rect = rect2;
                rect.set(((C0273d) view.getLayoutParams()).f1001o);
                if (rect.equals(a2)) {
                    i4 = i6;
                    i3 = i5 + 1;
                    size = i4;
                    a3 = rect;
                } else {
                    ((C0273d) view.getLayoutParams()).f1001o.set(a2);
                }
            } else {
                rect = rect2;
            }
            i4 = i6;
            for (i3 = i5 + 1; i3 < i4; i3++) {
                View view2 = (View) r0.f17361k.get(i3);
                C0273d c0273d6 = (C0273d) view2.getLayoutParams();
                C0270a c0270a2 = c0273d6.f987a;
                if (c0270a2 != null && c0270a2.a_(view)) {
                    if (i2 == 0 && c0273d6.f1000n) {
                        c0273d6.f1000n = false;
                    } else {
                        boolean a8 = i2 != 2 ? c0270a2.mo160a(r0, view2, view) : true;
                        if (i2 == 1) {
                            c0273d6.f1000n = a8;
                        }
                    }
                }
            }
            i3 = i5 + 1;
            size = i4;
            a3 = rect;
        }
        rect = a3;
        m14897a(a);
        m14897a(a2);
        m14897a(rect);
    }

    public final void m14912a(View view, int i) {
        Rect a;
        Rect a2;
        C0273d c0273d = (C0273d) view.getLayoutParams();
        int i2 = 0;
        int i3 = (c0273d.f997k != null || c0273d.f992f == -1) ? 0 : 1;
        if (i3 != 0) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (c0273d.f997k != null) {
            View view2 = c0273d.f997k;
            view.getLayoutParams();
            a = m14894a();
            a2 = m14894a();
            try {
                C0331u.m651a((ViewGroup) this, view2, a);
                c0273d = (C0273d) view.getLayoutParams();
                r9 = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m14896a(i, a, a2, c0273d, r9, measuredHeight);
                m14898a(c0273d, a2, r9, measuredHeight);
                view.layout(a2.left, a2.top, a2.right, a2.bottom);
            } finally {
                m14897a(a);
                m14897a(a2);
            }
        } else if (c0273d.f991e >= 0) {
            int i4 = c0273d.f991e;
            C0273d c0273d2 = (C0273d) view.getLayoutParams();
            int a3 = C0555d.m1224a(m14906d(c0273d2.f989c), i);
            int i5 = a3 & 7;
            a3 &= 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            r9 = view.getMeasuredHeight();
            if (i == 1) {
                i4 = width - i4;
            }
            i = m14901b(i4) - measuredWidth;
            if (i5 == 1) {
                i += measuredWidth / 2;
            } else if (i5 == 5) {
                i += measuredWidth;
            }
            if (a3 == 16) {
                i2 = 0 + (r9 / 2);
            } else if (a3 == 80) {
                i2 = 0 + r9;
            }
            i = Math.max(getPaddingLeft() + c0273d2.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth) - c0273d2.rightMargin));
            i4 = Math.max(getPaddingTop() + c0273d2.topMargin, Math.min(i2, ((height - getPaddingBottom()) - r9) - c0273d2.bottomMargin));
            view.layout(i, i4, measuredWidth + i, r9 + i4);
        } else {
            c0273d = (C0273d) view.getLayoutParams();
            a = m14894a();
            a.set(getPaddingLeft() + c0273d.leftMargin, getPaddingTop() + c0273d.topMargin, (getWidth() - getPaddingRight()) - c0273d.rightMargin, (getHeight() - getPaddingBottom()) - c0273d.bottomMargin);
            if (!(this.f17358g == null || !C0571r.m1386w(this) || C0571r.m1386w(view))) {
                a.left += this.f17358g.m1426a();
                a.top += this.f17358g.m1428b();
                a.right -= this.f17358g.m1429c();
                a.bottom -= this.f17358g.m1430d();
            }
            a2 = m14894a();
            C0555d.m1225a(m14904c(c0273d.f989c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
            m14897a(a);
            m14897a(a2);
        }
    }

    public final void m14913a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void mo2509a(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int i8;
            if (childAt.getVisibility() != 8) {
                C0273d c0273d = (C0273d) childAt.getLayoutParams();
                i8 = i5;
                if (c0273d.m508a(i8)) {
                    C0270a c0270a = c0273d.f987a;
                    if (c0270a != null) {
                        c0270a.mo3270a(r9, childAt, view, i, i2, i3, i4, i8);
                        i6 = 1;
                    }
                }
            } else {
                i8 = i5;
            }
        }
        if (i6 != 0) {
            m14911a(1);
        }
    }

    public final void mo2510a(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = i4;
        int i6 = i5;
        int i7 = i6;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0273d c0273d = (C0273d) childAt.getLayoutParams();
                if (c0273d.m508a(i3)) {
                    C0270a c0270a = c0273d.f987a;
                    if (c0270a != null) {
                        int[] iArr2 = r8.f17363m;
                        r8.f17363m[1] = 0;
                        iArr2[0] = 0;
                        c0270a.mo3271a(r8, childAt, view, i, i2, r8.f17363m, i3);
                        i6 = i > 0 ? Math.max(i6, r8.f17363m[0]) : Math.min(i6, r8.f17363m[0]);
                        i7 = i2 > 0 ? Math.max(i7, r8.f17363m[1]) : Math.min(i7, r8.f17363m[1]);
                        i4 = 1;
                    }
                }
            }
            i5++;
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (i4 != 0) {
            m14911a(1);
        }
    }

    public final boolean m14916a(View view, int i, int i2) {
        Rect a = m14894a();
        C0331u.m651a((ViewGroup) this, view, a);
        try {
            boolean contains = a.contains(i, i2);
            return contains;
        } finally {
            m14897a(a);
        }
    }

    public final void mo2511b(View view, int i) {
        this.f17373w.f1857a = i;
        this.f17368r = view;
        int childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
    }

    public final boolean mo2512b(View view, int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = i3;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0273d c0273d = (C0273d) childAt.getLayoutParams();
                C0270a c0270a = c0273d.f987a;
                if (c0270a != null) {
                    boolean a = c0270a.mo3272a(this, childAt, view, i, i2);
                    z |= a;
                    c0273d.m506a(i2, a);
                } else {
                    c0273d.m506a(i2, false);
                }
            }
            i3++;
        }
        return z;
    }

    public final void mo2513c(View view, int i) {
        this.f17373w.f1857a = 0;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0273d c0273d = (C0273d) childAt.getLayoutParams();
            if (c0273d.m508a(i)) {
                C0270a c0270a = c0273d.f987a;
                if (c0270a != null) {
                    c0270a.mo3269a(this, childAt, view, i);
                }
                c0273d.m506a(i, false);
                c0273d.f1000n = false;
            }
        }
        this.f17368r = null;
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0273d) && super.checkLayoutParams(layoutParams);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f17371u;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return new C0273d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0273d(getContext(), attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0273d ? new C0273d((C0273d) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0273d((MarginLayoutParams) layoutParams) : new C0273d(layoutParams);
    }

    final List<View> getDependencySortedChildren() {
        m14905c();
        return Collections.unmodifiableList(this.f17361k);
    }

    final C0582z getLastWindowInsets() {
        return this.f17358g;
    }

    public int getNestedScrollAxes() {
        return this.f17373w.f1857a;
    }

    public Drawable getStatusBarBackground() {
        return this.f17371u;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m14903b();
        if (this.f17370t) {
            if (this.f17369s == null) {
                this.f17369s = new C0274e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f17369s);
        }
        if (this.f17358g == null && C0571r.m1386w(this)) {
            C0571r.m1385v(this);
        }
        this.f17365o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m14903b();
        if (this.f17370t && this.f17369s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f17369s);
        }
        if (this.f17368r != null) {
            onStopNestedScroll(this.f17368r);
        }
        this.f17365o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17359h && this.f17371u != null) {
            int b = this.f17358g != null ? this.f17358g.m1428b() : 0;
            if (b > 0) {
                this.f17371u.setBounds(0, 0, getWidth(), b);
                this.f17371u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m14903b();
        }
        boolean a = m14900a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m14903b();
        }
        return a;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int h = C0571r.m1369h(this);
        i = this.f17361k.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.f17361k.get(i2);
            if (view.getVisibility() != 8) {
                C0270a c0270a = ((C0273d) view.getLayoutParams()).f987a;
                if (c0270a == null || !c0270a.mo152a(this, view, h)) {
                    m14912a(view, h);
                }
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int size;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        CoordinatorLayout coordinatorLayout = this;
        m14905c();
        int childCount = getChildCount();
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0311h c0311h = coordinatorLayout.f17356e;
            size = c0311h.f1213b.size();
            for (i4 = 0; i4 < size; i4++) {
                ArrayList arrayList = (ArrayList) c0311h.f1213b.m1020c(i4);
                if (arrayList != null && arrayList.contains(childAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        if (z2 != coordinatorLayout.f17370t) {
            if (z2) {
                if (coordinatorLayout.f17365o) {
                    if (coordinatorLayout.f17369s == null) {
                        coordinatorLayout.f17369s = new C0274e(coordinatorLayout);
                    }
                    getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f17369s);
                }
                coordinatorLayout.f17370t = true;
            } else {
                if (coordinatorLayout.f17365o && coordinatorLayout.f17369s != null) {
                    getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f17369s);
                }
                coordinatorLayout.f17370t = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        childCount = getPaddingTop();
        int paddingRight = getPaddingRight();
        i3 = getPaddingBottom();
        int h = C0571r.m1369h(this);
        boolean z4 = h == 1;
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size3 = MeasureSpec.getSize(i2);
        int i5 = paddingLeft + paddingRight;
        int i6 = childCount + i3;
        childCount = getSuggestedMinimumWidth();
        i3 = getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.f17358g != null && C0571r.m1386w(this);
        i4 = coordinatorLayout.f17361k.size();
        int i7 = childCount;
        int i8 = i3;
        z = false;
        size = z;
        while (size < i4) {
            int i9;
            Object obj;
            int i10;
            View view = (View) coordinatorLayout.f17361k.get(size);
            int i11;
            if (view.getVisibility() != 8) {
                int i12;
                boolean z6;
                int max;
                int i13;
                int i14;
                C0270a c0270a;
                View view2;
                int i15;
                int i16;
                boolean z7;
                View view3;
                C0273d c0273d = (C0273d) view.getLayoutParams();
                if (c0273d.f991e < 0 || mode == 0) {
                    i12 = i8;
                    z6 = z;
                } else {
                    childCount = m14901b(c0273d.f991e);
                    i12 = i8;
                    i8 = C0555d.m1224a(m14906d(c0273d.f989c), h) & 7;
                    z6 = z;
                    if ((i8 == 3 && !z4) || (i8 == 5 && z4)) {
                        i11 = 0;
                        max = Math.max(0, (size2 - paddingRight) - childCount);
                        if (z5) {
                        }
                        i13 = i;
                        i14 = i2;
                        c0270a = c0273d.f987a;
                        if (c0270a != null) {
                            view2 = view;
                            i15 = i7;
                            i9 = i4;
                            i16 = i12;
                            z7 = z6;
                            obj = null;
                            i10 = size;
                            m14913a(view2, i13, max, i14, 0);
                        } else {
                            childAt = view;
                            i16 = i12;
                            view2 = childAt;
                            z7 = z6;
                            obj = null;
                            i15 = i7;
                            i10 = size;
                            i9 = i4;
                            if (!c0270a.mo2519a(coordinatorLayout, childAt, i13, max, i14, 0)) {
                                m14913a(view2, i13, max, i14, 0);
                            }
                        }
                        view3 = view2;
                        i3 = Math.max(i15, ((i5 + view3.getMeasuredWidth()) + c0273d.leftMargin) + c0273d.rightMargin);
                        i8 = Math.max(i16, ((i6 + view3.getMeasuredHeight()) + c0273d.topMargin) + c0273d.bottomMargin);
                        z = View.combineMeasuredStates(z7, view3.getMeasuredState());
                        i7 = i3;
                    } else if ((i8 == 5 && !z4) || (i8 == 3 && z4)) {
                        max = Math.max(0, childCount - paddingLeft);
                        if (z5 || C0571r.m1386w(view)) {
                            i13 = i;
                            i14 = i2;
                        } else {
                            i8 = coordinatorLayout.f17358g.m1428b() + coordinatorLayout.f17358g.m1430d();
                            i13 = MeasureSpec.makeMeasureSpec(size2 - (coordinatorLayout.f17358g.m1426a() + coordinatorLayout.f17358g.m1429c()), mode);
                            i14 = MeasureSpec.makeMeasureSpec(size3 - i8, mode2);
                        }
                        c0270a = c0273d.f987a;
                        if (c0270a != null) {
                            childAt = view;
                            i16 = i12;
                            view2 = childAt;
                            z7 = z6;
                            obj = null;
                            i15 = i7;
                            i10 = size;
                            i9 = i4;
                            if (c0270a.mo2519a(coordinatorLayout, childAt, i13, max, i14, 0)) {
                                m14913a(view2, i13, max, i14, 0);
                            }
                        } else {
                            view2 = view;
                            i15 = i7;
                            i9 = i4;
                            i16 = i12;
                            z7 = z6;
                            obj = null;
                            i10 = size;
                            m14913a(view2, i13, max, i14, 0);
                        }
                        view3 = view2;
                        i3 = Math.max(i15, ((i5 + view3.getMeasuredWidth()) + c0273d.leftMargin) + c0273d.rightMargin);
                        i8 = Math.max(i16, ((i6 + view3.getMeasuredHeight()) + c0273d.topMargin) + c0273d.bottomMargin);
                        z = View.combineMeasuredStates(z7, view3.getMeasuredState());
                        i7 = i3;
                    }
                }
                max = 0;
                if (z5) {
                }
                i13 = i;
                i14 = i2;
                c0270a = c0273d.f987a;
                if (c0270a != null) {
                    childAt = view;
                    i16 = i12;
                    view2 = childAt;
                    z7 = z6;
                    obj = null;
                    i15 = i7;
                    i10 = size;
                    i9 = i4;
                    if (c0270a.mo2519a(coordinatorLayout, childAt, i13, max, i14, 0)) {
                        m14913a(view2, i13, max, i14, 0);
                    }
                } else {
                    view2 = view;
                    i15 = i7;
                    i9 = i4;
                    i16 = i12;
                    z7 = z6;
                    obj = null;
                    i10 = size;
                    m14913a(view2, i13, max, i14, 0);
                }
                view3 = view2;
                i3 = Math.max(i15, ((i5 + view3.getMeasuredWidth()) + c0273d.leftMargin) + c0273d.rightMargin);
                i8 = Math.max(i16, ((i6 + view3.getMeasuredHeight()) + c0273d.topMargin) + c0273d.bottomMargin);
                z = View.combineMeasuredStates(z7, view3.getMeasuredState());
                i7 = i3;
            } else {
                z3 = z;
                i10 = size;
                i9 = i4;
                obj = null;
                i11 = i8;
                i8 = i7;
                i8 = i11;
                z = z3;
            }
            size = i10 + 1;
            Object obj2 = obj;
            i4 = i9;
        }
        z3 = z;
        setMeasuredDimension(View.resolveSizeAndState(i7, i, -16777216 & z3), View.resolveSizeAndState(i8, i2, z3 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        int i = 0;
        boolean z2 = i;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0273d c0273d = (C0273d) childAt.getLayoutParams();
                if (c0273d.m508a(0)) {
                    C0270a c0270a = c0273d.f987a;
                    if (c0270a != null) {
                        z2 |= c0270a.mo3571a(this, childAt, view, f, f2, z);
                    }
                }
            }
            i++;
        }
        if (z2) {
            m14911a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        boolean z = i;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0273d c0273d = (C0273d) childAt.getLayoutParams();
                if (c0273d.m508a(0)) {
                    C0270a c0270a = c0273d.f987a;
                    if (c0270a != null) {
                        z |= c0270a.mo154a(this, childAt, view, f, f2);
                    }
                }
            }
            i++;
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2510a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2509a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo2511b(view2, i);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            SparseArray sparseArray = savedState.f13072a;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                C0270a c0270a = m14902b(childAt).f987a;
                if (!(id == -1 || c0270a == null)) {
                    Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                    if (parcelable2 != null) {
                        c0270a.mo148a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0270a c0270a = ((C0273d) childAt.getLayoutParams()).f987a;
            if (!(id == -1 || c0270a == null)) {
                Parcelable b = c0270a.mo155b(this, childAt);
                if (b != null) {
                    sparseArray.append(id, b);
                }
            }
        }
        savedState.f13072a = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2512b(view, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo2513c(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        boolean a;
        if (this.f17367q == null) {
            a = m14900a(motionEvent, 1);
            if (a) {
            }
            motionEvent2 = null;
            if (this.f17367q == null) {
                z |= super.onTouchEvent(motionEvent);
            } else if (a) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 || actionMasked == 3) {
                m14903b();
            }
            return z;
        }
        a = false;
        C0270a c0270a = ((C0273d) this.f17367q.getLayoutParams()).f987a;
        if (c0270a != null) {
            z = c0270a.mo156b(this, this.f17367q, motionEvent);
        }
        motionEvent2 = null;
        if (this.f17367q == null) {
            z |= super.onTouchEvent(motionEvent);
        } else if (a) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m14903b();
        return z;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0270a c0270a = ((C0273d) view.getLayoutParams()).f987a;
        return (c0270a == null || !c0270a.mo3278a(this, view, rect, z)) ? super.requestChildRectangleOnScreen(view, rect, z) : true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f17364n) {
            m14903b();
            this.f17364n = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m14907d();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f17360i = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        if (this.f17371u != drawable) {
            Drawable drawable2 = null;
            if (this.f17371u != null) {
                this.f17371u.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f17371u = drawable2;
            if (this.f17371u != null) {
                if (this.f17371u.isStateful()) {
                    this.f17371u.setState(getDrawableState());
                }
                C0429a.m891b(this.f17371u, C0571r.m1369h(this));
                this.f17371u.setVisible(getVisibility() == 0, false);
                this.f17371u.setCallback(this);
            }
            C0571r.m1361e(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0346c.m682a(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f17371u != null && this.f17371u.isVisible() != z) {
            this.f17371u.setVisible(z, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f17371u) {
                return false;
            }
        }
        return true;
    }
}
