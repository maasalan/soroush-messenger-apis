package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class C0576u {
    static final C0575c f1876a;

    static class C0575c {
        C0575c() {
        }

        public void mo2568a(ViewParent viewParent, View view) {
            if (viewParent instanceof C0562j) {
                ((C0562j) viewParent).onStopNestedScroll(view);
            }
        }

        public void mo2569a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C0562j) {
                ((C0562j) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        public void mo2570a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C0562j) {
                ((C0562j) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        public boolean mo2571a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof C0562j ? ((C0562j) viewParent).onNestedPreFling(view, f, f2) : false;
        }

        public boolean mo2572a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof C0562j ? ((C0562j) viewParent).onNestedFling(view, f, f2, z) : false;
        }

        public boolean mo2573a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof C0562j ? ((C0562j) viewParent).onStartNestedScroll(view, view2, i) : false;
        }

        public void mo2574b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C0562j) {
                ((C0562j) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    static class C4845a extends C0575c {
        C4845a() {
        }
    }

    static class C6378b extends C4845a {
        C6378b() {
        }

        public final void mo2568a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final void mo2569a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final void mo2570a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }

        public final boolean mo2571a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final boolean mo2572a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedFling");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final boolean mo2573a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onStartNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
                return false;
            }
        }

        public final void mo2574b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }
    }

    static {
        C0575c c6378b = VERSION.SDK_INT >= 21 ? new C6378b() : VERSION.SDK_INT >= 19 ? new C4845a() : new C0575c();
        f1876a = c6378b;
    }

    public static void m1402a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C4842k) {
            ((C4842k) viewParent).mo2513c(view, i);
            return;
        }
        if (i == 0) {
            f1876a.mo2568a(viewParent, view);
        }
    }

    public static void m1403a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C4842k) {
            ((C4842k) viewParent).mo2509a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            f1876a.mo2569a(viewParent, view, i, i2, i3, i4);
        }
    }

    public static void m1404a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C4842k) {
            ((C4842k) viewParent).mo2510a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            f1876a.mo2570a(viewParent, view, i, i2, iArr);
        }
    }

    public static boolean m1405a(ViewParent viewParent, View view, float f, float f2) {
        return f1876a.mo2571a(viewParent, view, f, f2);
    }

    public static boolean m1406a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1876a.mo2572a(viewParent, view, f, f2, z);
    }

    public static boolean m1407a(ViewParent viewParent, View view, View view2, int i, int i2) {
        return viewParent instanceof C4842k ? ((C4842k) viewParent).mo2512b(view, i, i2) : i2 == 0 ? f1876a.mo2573a(viewParent, view, view2, i) : false;
    }

    public static void m1408b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C4842k) {
            ((C4842k) viewParent).mo2511b(view2, i);
            return;
        }
        if (i2 == 0) {
            f1876a.mo2574b(viewParent, view, view2, i);
        }
    }
}
