package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0571r {
    static final C0570j f1873a;

    static class C0570j {
        static Field f1864b = null;
        static boolean f1865c = false;
        private static Field f1866d;
        private static boolean f1867e;
        private static Field f1868f;
        private static boolean f1869g;
        private static WeakHashMap<View, String> f1870h;
        private static Method f1871i;
        WeakHashMap<View, C0579v> f1872a = null;

        C0570j() {
        }

        public static boolean m1272C(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = f1865c;
            r1 = 0;
            if (r0 == 0) goto L_0x0006;
        L_0x0005:
            return r1;
        L_0x0006:
            r0 = f1864b;
            r2 = 1;
            if (r0 != 0) goto L_0x001c;
        L_0x000b:
            r0 = android.view.View.class;	 Catch:{ Throwable -> 0x0019 }
            r3 = "mAccessibilityDelegate";	 Catch:{ Throwable -> 0x0019 }
            r0 = r0.getDeclaredField(r3);	 Catch:{ Throwable -> 0x0019 }
            f1864b = r0;	 Catch:{ Throwable -> 0x0019 }
            r0.setAccessible(r2);	 Catch:{ Throwable -> 0x0019 }
            goto L_0x001c;
        L_0x0019:
            f1865c = r2;
            return r1;
        L_0x001c:
            r0 = f1864b;	 Catch:{ Throwable -> 0x0026 }
            r4 = r0.get(r4);	 Catch:{ Throwable -> 0x0026 }
            if (r4 == 0) goto L_0x0025;
        L_0x0024:
            return r2;
        L_0x0025:
            return r1;
        L_0x0026:
            f1865c = r2;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.C(android.view.View):boolean");
        }

        private static void m1273D(View view) {
            float translationY = view.getTranslationY();
            view.setTranslationY(BallPulseIndicator.SCALE + translationY);
            view.setTranslationY(translationY);
        }

        public static void m1274a(View view, C0547a c0547a) {
            view.setAccessibilityDelegate(c0547a == null ? null : c0547a.getBridge());
        }

        public static void m1275a(ViewGroup viewGroup) {
            if (f1871i == null) {
                try {
                    f1871i = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
                }
                f1871i.setAccessible(true);
            }
            try {
                f1871i.invoke(viewGroup, new Object[]{Boolean.valueOf(true)});
            } catch (Throwable e2) {
                Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
            }
        }

        public Mode mo3607A(View view) {
            return view instanceof C0568q ? ((C0568q) view).getSupportBackgroundTintMode() : null;
        }

        public float mo3608B(View view) {
            return mo3619w(view) + mo3618v(view);
        }

        public C0582z mo3609a(View view, C0582z c0582z) {
            return c0582z;
        }

        public void mo3610a(View view, float f) {
        }

        public void mo2553a(View view, int i) {
        }

        public void mo2554a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidate(i, i2, i3, i4);
        }

        public void mo3611a(View view, ColorStateList colorStateList) {
            if (view instanceof C0568q) {
                ((C0568q) view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void mo3294a(View view, Paint paint) {
            view.setLayerType(view.getLayerType(), paint);
            view.invalidate();
        }

        public void mo3612a(View view, Mode mode) {
            if (view instanceof C0568q) {
                ((C0568q) view).setSupportBackgroundTintMode(mode);
            }
        }

        public void mo3500a(View view, Rect rect) {
        }

        public void mo2555a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public void mo3613a(View view, C0564m c0564m) {
        }

        public void mo3693a(View view, C0566o c0566o) {
        }

        public void mo2556a(View view, Runnable runnable) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }

        public void mo2557a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }

        public void mo2558a(View view, boolean z) {
        }

        public boolean mo407a(View view) {
            return false;
        }

        public C0582z mo3614b(View view, C0582z c0582z) {
            return c0582z;
        }

        public void mo3615b(View view, int i) {
            view.offsetLeftAndRight(i);
            if (view.getVisibility() == 0) {
                C0570j.m1273D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    C0570j.m1273D((View) parent);
                }
            }
        }

        public void mo3295b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        public boolean mo2559b(View view) {
            return false;
        }

        public void mo2560c(View view) {
            view.postInvalidate();
        }

        public void mo3616c(View view, int i) {
            view.offsetTopAndBottom(i);
            if (view.getVisibility() == 0) {
                C0570j.m1273D(view);
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    C0570j.m1273D((View) parent);
                }
            }
        }

        public int mo2561d(View view) {
            return 0;
        }

        public void mo3639d(View view, int i) {
        }

        public ViewParent mo2562e(View view) {
            return view.getParent();
        }

        public int mo2563f(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = f1867e;
            if (r0 != 0) goto L_0x0014;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0012 }
            r2 = "mMinWidth";	 Catch:{ NoSuchFieldException -> 0x0012 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0012 }
            f1866d = r1;	 Catch:{ NoSuchFieldException -> 0x0012 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0012 }
        L_0x0012:
            f1867e = r0;
        L_0x0014:
            r0 = f1866d;
            if (r0 == 0) goto L_0x0025;
        L_0x0018:
            r0 = f1866d;	 Catch:{ Exception -> 0x0025 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0025 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0025 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0025 }
            return r4;
        L_0x0025:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.f(android.view.View):int");
        }

        public int mo2564g(android.view.View r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r3 = this;
            r0 = f1869g;
            if (r0 != 0) goto L_0x0014;
        L_0x0004:
            r0 = 1;
            r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0012 }
            r2 = "mMinHeight";	 Catch:{ NoSuchFieldException -> 0x0012 }
            r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0012 }
            f1868f = r1;	 Catch:{ NoSuchFieldException -> 0x0012 }
            r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0012 }
        L_0x0012:
            f1869g = r0;
        L_0x0014:
            r0 = f1868f;
            if (r0 == 0) goto L_0x0025;
        L_0x0018:
            r0 = f1868f;	 Catch:{ Exception -> 0x0025 }
            r4 = r0.get(r4);	 Catch:{ Exception -> 0x0025 }
            r4 = (java.lang.Integer) r4;	 Catch:{ Exception -> 0x0025 }
            r4 = r4.intValue();	 Catch:{ Exception -> 0x0025 }
            return r4;
        L_0x0025:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.r.j.g(android.view.View):int");
        }

        public void mo2565h(View view) {
        }

        public boolean mo2566i(View view) {
            return false;
        }

        public boolean mo2567j(View view) {
            return true;
        }

        public int mo3296k(View view) {
            return 0;
        }

        public int mo3297l(View view) {
            return view.getPaddingLeft();
        }

        public int mo3298m(View view) {
            return view.getPaddingRight();
        }

        public int mo3299n(View view) {
            return 0;
        }

        public boolean mo3300o(View view) {
            return false;
        }

        public Display mo3301p(View view) {
            return mo3587t(view) ? ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay() : null;
        }

        public Rect mo3501q(View view) {
            return null;
        }

        public void mo3585r(View view) {
        }

        public boolean mo3586s(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean mo3587t(View view) {
            return view.getWindowToken() != null;
        }

        public String mo3617u(View view) {
            return f1870h == null ? null : (String) f1870h.get(view);
        }

        public float mo3618v(View view) {
            return 0.0f;
        }

        public float mo3619w(View view) {
            return 0.0f;
        }

        public boolean mo3620x(View view) {
            return view instanceof C0560g ? ((C0560g) view).isNestedScrollingEnabled() : false;
        }

        public void mo3621y(View view) {
            if (view instanceof C0560g) {
                ((C0560g) view).stopNestedScroll();
            }
        }

        public ColorStateList mo3622z(View view) {
            return view instanceof C0568q ? ((C0568q) view).getSupportBackgroundTintList() : null;
        }
    }

    static class C4843a extends C0570j {
        C4843a() {
        }

        public final boolean mo407a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class C6376b extends C4843a {
        C6376b() {
        }

        public void mo2553a(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }

        public final void mo2554a(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public final void mo2555a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public final void mo2556a(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public final void mo2557a(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public final void mo2558a(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public final boolean mo2559b(View view) {
            return view.hasTransientState();
        }

        public final void mo2560c(View view) {
            view.postInvalidateOnAnimation();
        }

        public final int mo2561d(View view) {
            return view.getImportantForAccessibility();
        }

        public final ViewParent mo2562e(View view) {
            return view.getParentForAccessibility();
        }

        public final int mo2563f(View view) {
            return view.getMinimumWidth();
        }

        public final int mo2564g(View view) {
            return view.getMinimumHeight();
        }

        public void mo2565h(View view) {
            view.requestFitSystemWindows();
        }

        public final boolean mo2566i(View view) {
            return view.getFitsSystemWindows();
        }

        public final boolean mo2567j(View view) {
            return view.hasOverlappingRendering();
        }
    }

    static class C7019c extends C6376b {
        C7019c() {
        }

        public final void mo3294a(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public final void mo3295b(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        public final int mo3296k(View view) {
            return view.getLayoutDirection();
        }

        public final int mo3297l(View view) {
            return view.getPaddingStart();
        }

        public final int mo3298m(View view) {
            return view.getPaddingEnd();
        }

        public final int mo3299n(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public final boolean mo3300o(View view) {
            return view.isPaddingRelative();
        }

        public final Display mo3301p(View view) {
            return view.getDisplay();
        }
    }

    static class C7253d extends C7019c {
        C7253d() {
        }

        public final void mo3500a(View view, Rect rect) {
            view.setClipBounds(rect);
        }

        public final Rect mo3501q(View view) {
            return view.getClipBounds();
        }
    }

    static class C7404e extends C7253d {
        C7404e() {
        }

        public final void mo2553a(View view, int i) {
            view.setImportantForAccessibility(i);
        }

        public final void mo3585r(View view) {
            view.setAccessibilityLiveRegion(1);
        }

        public final boolean mo3586s(View view) {
            return view.isLaidOut();
        }

        public final boolean mo3587t(View view) {
            return view.isAttachedToWindow();
        }
    }

    static class C7567f extends C7404e {
        private static ThreadLocal<Rect> f23115d;

        C7567f() {
        }

        private static Rect m20681a() {
            if (f23115d == null) {
                f23115d = new ThreadLocal();
            }
            Rect rect = (Rect) f23115d.get();
            if (rect == null) {
                rect = new Rect();
                f23115d.set(rect);
            }
            rect.setEmpty();
            return rect;
        }

        public final Mode mo3607A(View view) {
            return view.getBackgroundTintMode();
        }

        public final float mo3608B(View view) {
            return view.getZ();
        }

        public final C0582z mo3609a(View view, C0582z c0582z) {
            Object obj = (WindowInsets) C0582z.m1425a(c0582z);
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(obj);
            if (onApplyWindowInsets != obj) {
                obj = new WindowInsets(onApplyWindowInsets);
            }
            return C0582z.m1424a(obj);
        }

        public final void mo3610a(View view, float f) {
            view.setElevation(f);
        }

        public final void mo3611a(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void mo3612a(View view, Mode mode) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                Object obj = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? null : 1;
                if (background != null && obj != null) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        }

        public final void mo3613a(View view, final C0564m c0564m) {
            if (c0564m == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener(this) {
                    final /* synthetic */ C7567f f1863b;

                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return (WindowInsets) C0582z.m1425a(c0564m.mo139a(view, C0582z.m1424a((Object) windowInsets)));
                    }
                });
            }
        }

        public final C0582z mo3614b(View view, C0582z c0582z) {
            Object obj = (WindowInsets) C0582z.m1425a(c0582z);
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(obj);
            if (dispatchApplyWindowInsets != obj) {
                obj = new WindowInsets(dispatchApplyWindowInsets);
            }
            return C0582z.m1424a(obj);
        }

        public void mo3615b(View view, int i) {
            int intersects;
            Rect a = C7567f.m20681a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo3615b(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public void mo3616c(View view, int i) {
            int intersects;
            Rect a = C7567f.m20681a();
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                intersects = a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ 1;
            } else {
                intersects = 0;
            }
            super.mo3616c(view, i);
            if (intersects != 0 && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        }

        public final void mo2565h(View view) {
            view.requestApplyInsets();
        }

        public final String mo3617u(View view) {
            return view.getTransitionName();
        }

        public final float mo3618v(View view) {
            return view.getElevation();
        }

        public final float mo3619w(View view) {
            return view.getTranslationZ();
        }

        public final boolean mo3620x(View view) {
            return view.isNestedScrollingEnabled();
        }

        public final void mo3621y(View view) {
            view.stopNestedScroll();
        }

        public final ColorStateList mo3622z(View view) {
            return view.getBackgroundTintList();
        }
    }

    static class C7694g extends C7567f {
        C7694g() {
        }

        public final void mo3615b(View view, int i) {
            view.offsetLeftAndRight(i);
        }

        public final void mo3616c(View view, int i) {
            view.offsetTopAndBottom(i);
        }

        public final void mo3639d(View view, int i) {
            view.setScrollIndicators(i, 3);
        }
    }

    static class C7725h extends C7694g {
        C7725h() {
        }

        public final void mo3693a(View view, C0566o c0566o) {
            view.setPointerIcon((PointerIcon) (c0566o != null ? c0566o.f1861a : null));
        }
    }

    static class C7726i extends C7725h {
        C7726i() {
        }
    }

    static {
        C0570j c7726i = VERSION.SDK_INT >= 26 ? new C7726i() : VERSION.SDK_INT >= 24 ? new C7725h() : VERSION.SDK_INT >= 23 ? new C7694g() : VERSION.SDK_INT >= 21 ? new C7567f() : VERSION.SDK_INT >= 19 ? new C7404e() : VERSION.SDK_INT >= 18 ? new C7253d() : VERSION.SDK_INT >= 17 ? new C7019c() : VERSION.SDK_INT >= 16 ? new C6376b() : VERSION.SDK_INT >= 15 ? new C4843a() : new C0570j();
        f1873a = c7726i;
    }

    public static Mode m1323A(View view) {
        return f1873a.mo3607A(view);
    }

    public static boolean m1324B(View view) {
        return f1873a.mo3620x(view);
    }

    public static void m1325C(View view) {
        f1873a.mo3621y(view);
    }

    public static boolean m1326D(View view) {
        return f1873a.mo3586s(view);
    }

    public static float m1327E(View view) {
        return f1873a.mo3608B(view);
    }

    public static Rect m1328F(View view) {
        return f1873a.mo3501q(view);
    }

    public static boolean m1329G(View view) {
        return f1873a.mo3587t(view);
    }

    public static boolean m1330H(View view) {
        return f1873a.mo407a(view);
    }

    public static Display m1331I(View view) {
        return f1873a.mo3301p(view);
    }

    public static C0582z m1332a(View view, C0582z c0582z) {
        return f1873a.mo3609a(view, c0582z);
    }

    @Deprecated
    public static void m1333a(View view, float f) {
        view.setTranslationX(f);
    }

    public static void m1334a(View view, int i, int i2, int i3, int i4) {
        f1873a.mo2554a(view, i, i2, i3, i4);
    }

    public static void m1335a(View view, ColorStateList colorStateList) {
        f1873a.mo3611a(view, colorStateList);
    }

    public static void m1336a(View view, Paint paint) {
        f1873a.mo3294a(view, paint);
    }

    public static void m1337a(View view, Mode mode) {
        f1873a.mo3612a(view, mode);
    }

    public static void m1338a(View view, Rect rect) {
        f1873a.mo3500a(view, rect);
    }

    public static void m1339a(View view, Drawable drawable) {
        f1873a.mo2555a(view, drawable);
    }

    public static void m1340a(View view, C0547a c0547a) {
        C0570j.m1274a(view, c0547a);
    }

    public static void m1341a(View view, C0564m c0564m) {
        f1873a.mo3613a(view, c0564m);
    }

    public static void m1342a(View view, C0566o c0566o) {
        f1873a.mo3693a(view, c0566o);
    }

    public static void m1343a(View view, Runnable runnable) {
        f1873a.mo2556a(view, runnable);
    }

    public static void m1344a(View view, Runnable runnable, long j) {
        f1873a.mo2557a(view, runnable, j);
    }

    public static void m1345a(View view, boolean z) {
        f1873a.mo2558a(view, z);
    }

    public static void m1346a(ViewGroup viewGroup) {
        C0570j.m1275a(viewGroup);
    }

    @Deprecated
    public static boolean m1347a(View view) {
        return view.canScrollVertically(-1);
    }

    @Deprecated
    public static boolean m1348a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public static int m1349b(View view) {
        return view.getOverScrollMode();
    }

    public static C0582z m1350b(View view, C0582z c0582z) {
        return f1873a.mo3614b(view, c0582z);
    }

    @Deprecated
    public static void m1351b(View view, float f) {
        view.setTranslationY(f);
    }

    public static void m1352b(View view, int i) {
        f1873a.mo2553a(view, i);
    }

    public static void m1353b(View view, int i, int i2, int i3, int i4) {
        f1873a.mo3295b(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void m1354b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @Deprecated
    public static void m1355c(View view, float f) {
        view.setAlpha(f);
    }

    @Deprecated
    public static void m1356c(View view, int i) {
        view.setLayerType(i, null);
    }

    public static boolean m1357c(View view) {
        return C0570j.m1272C(view);
    }

    @Deprecated
    public static void m1358d(View view, float f) {
        view.setRotationX(f);
    }

    public static void m1359d(View view, int i) {
        f1873a.mo3616c(view, i);
    }

    public static boolean m1360d(View view) {
        return f1873a.mo2559b(view);
    }

    public static void m1361e(View view) {
        f1873a.mo2560c(view);
    }

    @Deprecated
    public static void m1362e(View view, float f) {
        view.setRotationY(f);
    }

    public static void m1363e(View view, int i) {
        f1873a.mo3615b(view, i);
    }

    public static int m1364f(View view) {
        return f1873a.mo2561d(view);
    }

    @Deprecated
    public static void m1365f(View view, float f) {
        view.setScaleX(f);
    }

    public static void m1366f(View view, int i) {
        f1873a.mo3639d(view, i);
    }

    @Deprecated
    public static float m1367g(View view) {
        return view.getAlpha();
    }

    @Deprecated
    public static void m1368g(View view, float f) {
        view.setScaleY(f);
    }

    public static int m1369h(View view) {
        return f1873a.mo3296k(view);
    }

    @Deprecated
    public static void m1370h(View view, float f) {
        view.setPivotX(f);
    }

    public static ViewParent m1371i(View view) {
        return f1873a.mo2562e(view);
    }

    public static void m1372i(View view, float f) {
        f1873a.mo3610a(view, f);
    }

    public static void m1373j(View view) {
        f1873a.mo3585r(view);
    }

    public static int m1374k(View view) {
        return f1873a.mo3297l(view);
    }

    public static int m1375l(View view) {
        return f1873a.mo3298m(view);
    }

    @Deprecated
    public static float m1376m(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float m1377n(View view) {
        return view.getTranslationY();
    }

    public static int m1378o(View view) {
        return f1873a.mo2563f(view);
    }

    public static int m1379p(View view) {
        return f1873a.mo2564g(view);
    }

    public static C0579v m1380q(View view) {
        C0570j c0570j = f1873a;
        if (c0570j.f1872a == null) {
            c0570j.f1872a = new WeakHashMap();
        }
        C0579v c0579v = (C0579v) c0570j.f1872a.get(view);
        if (c0579v != null) {
            return c0579v;
        }
        c0579v = new C0579v(view);
        c0570j.f1872a.put(view, c0579v);
        return c0579v;
    }

    @Deprecated
    public static void m1381r(View view) {
        view.setRotation(0.0f);
    }

    public static float m1382s(View view) {
        return f1873a.mo3618v(view);
    }

    public static String m1383t(View view) {
        return f1873a.mo3617u(view);
    }

    public static int m1384u(View view) {
        return f1873a.mo3299n(view);
    }

    public static void m1385v(View view) {
        f1873a.mo2565h(view);
    }

    public static boolean m1386w(View view) {
        return f1873a.mo2566i(view);
    }

    public static boolean m1387x(View view) {
        return f1873a.mo2567j(view);
    }

    public static boolean m1388y(View view) {
        return f1873a.mo3300o(view);
    }

    public static ColorStateList m1389z(View view) {
        return f1873a.mo3622z(view);
    }
}
