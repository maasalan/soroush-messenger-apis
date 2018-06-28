package android.support.v4.widget;

import android.os.Build.VERSION;
import android.support.v4.view.C0555d;
import android.support.v4.view.C0571r;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class C0625j {
    static final C0624d f2052a;

    static class C0624d {
        private static Method f2050a;
        private static boolean f2051b;

        C0624d() {
        }

        public void mo3302a(android.widget.PopupWindow r7, int r8) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r6 = this;
            r0 = f2051b;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x001b;
        L_0x0006:
            r0 = android.widget.PopupWindow.class;	 Catch:{ Exception -> 0x0019 }
            r3 = "setWindowLayoutType";	 Catch:{ Exception -> 0x0019 }
            r4 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0019 }
            r5 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x0019 }
            r4[r1] = r5;	 Catch:{ Exception -> 0x0019 }
            r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ Exception -> 0x0019 }
            f2050a = r0;	 Catch:{ Exception -> 0x0019 }
            r0.setAccessible(r2);	 Catch:{ Exception -> 0x0019 }
        L_0x0019:
            f2051b = r2;
        L_0x001b:
            r0 = f2050a;
            if (r0 == 0) goto L_0x002c;
        L_0x001f:
            r0 = f2050a;	 Catch:{ Exception -> 0x002c }
            r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x002c }
            r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x002c }
            r2[r1] = r8;	 Catch:{ Exception -> 0x002c }
            r0.invoke(r7, r2);	 Catch:{ Exception -> 0x002c }
        L_0x002c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.j.d.a(android.widget.PopupWindow, int):void");
        }

        public void mo438a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0555d.m1224a(i3, C0571r.m1369h(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        public void mo2576a(PopupWindow popupWindow, boolean z) {
        }

        public boolean mo2577a(PopupWindow popupWindow) {
            return false;
        }
    }

    static class C4858a extends C0624d {
        C4858a() {
        }

        public final void mo438a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    static class C6383b extends C4858a {
        private static Field f17449a;

        static {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f17449a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C6383b() {
        }

        public void mo2576a(PopupWindow popupWindow, boolean z) {
            if (f17449a != null) {
                try {
                    f17449a.set(popupWindow, Boolean.valueOf(z));
                } catch (Throwable e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }

        public boolean mo2577a(PopupWindow popupWindow) {
            if (f17449a != null) {
                try {
                    return ((Boolean) f17449a.get(popupWindow)).booleanValue();
                } catch (Throwable e) {
                    Log.i("PopupWindowCompatApi21", "Could not get overlap anchor field in PopupWindow", e);
                }
            }
            return false;
        }
    }

    static class C7020c extends C6383b {
        C7020c() {
        }

        public final void mo3302a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        public final void mo2576a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public final boolean mo2577a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }
    }

    static {
        C0624d c7020c = VERSION.SDK_INT >= 23 ? new C7020c() : VERSION.SDK_INT >= 21 ? new C6383b() : VERSION.SDK_INT >= 19 ? new C4858a() : new C0624d();
        f2052a = c7020c;
    }

    public static void m1518a(PopupWindow popupWindow, int i) {
        f2052a.mo3302a(popupWindow, i);
    }

    public static void m1519a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f2052a.mo438a(popupWindow, view, i, i2, i3);
    }

    public static void m1520a(PopupWindow popupWindow, boolean z) {
        f2052a.mo2576a(popupWindow, z);
    }

    public static boolean m1521a(PopupWindow popupWindow) {
        return f2052a.mo2577a(popupWindow);
    }
}
