package android.support.p028d;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0571r;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

final class al {
    static final Property<View, Float> f823a = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(al.m407c((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            al.m401a((View) obj, ((Float) obj2).floatValue());
        }
    };
    static final Property<View, Rect> f824b = new Property<View, Rect>(Rect.class, "clipBounds") {
        public final /* synthetic */ Object get(Object obj) {
            return C0571r.m1328F((View) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0571r.m1338a((View) obj, (Rect) obj2);
        }
    };
    private static final ar f825c;
    private static Field f826d;
    private static boolean f827e;

    static {
        ar aqVar = VERSION.SDK_INT >= 22 ? new aq() : VERSION.SDK_INT >= 21 ? new ap() : VERSION.SDK_INT >= 19 ? new ao() : VERSION.SDK_INT >= 18 ? new an() : new am();
        f825c = aqVar;
    }

    static ak m400a(View view) {
        return f825c.mo76a(view);
    }

    static void m401a(View view, float f) {
        f825c.mo77a(view, f);
    }

    static void m402a(android.view.View r3, int r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = f827e;
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        r0 = 1;
        r1 = android.view.View.class;	 Catch:{ NoSuchFieldException -> 0x0013 }
        r2 = "mViewFlags";	 Catch:{ NoSuchFieldException -> 0x0013 }
        r1 = r1.getDeclaredField(r2);	 Catch:{ NoSuchFieldException -> 0x0013 }
        f826d = r1;	 Catch:{ NoSuchFieldException -> 0x0013 }
        r1.setAccessible(r0);	 Catch:{ NoSuchFieldException -> 0x0013 }
        goto L_0x001a;
    L_0x0013:
        r1 = "ViewUtils";
        r2 = "fetchViewFlagsField: ";
        android.util.Log.i(r1, r2);
    L_0x001a:
        f827e = r0;
    L_0x001c:
        r0 = f826d;
        if (r0 == 0) goto L_0x002e;
    L_0x0020:
        r0 = f826d;	 Catch:{ IllegalAccessException -> 0x002e }
        r0 = r0.getInt(r3);	 Catch:{ IllegalAccessException -> 0x002e }
        r1 = f826d;	 Catch:{ IllegalAccessException -> 0x002e }
        r0 = r0 & -13;	 Catch:{ IllegalAccessException -> 0x002e }
        r4 = r4 | r0;	 Catch:{ IllegalAccessException -> 0x002e }
        r1.setInt(r3, r4);	 Catch:{ IllegalAccessException -> 0x002e }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.al.a(android.view.View, int):void");
    }

    static void m403a(View view, int i, int i2, int i3, int i4) {
        f825c.mo78a(view, i, i2, i3, i4);
    }

    static void m404a(View view, Matrix matrix) {
        f825c.mo79a(view, matrix);
    }

    static av m405b(View view) {
        return f825c.mo80b(view);
    }

    static void m406b(View view, Matrix matrix) {
        f825c.mo81b(view, matrix);
    }

    static float m407c(View view) {
        return f825c.mo82c(view);
    }

    static void m408d(View view) {
        f825c.mo83d(view);
    }

    static void m409e(View view) {
        f825c.mo84e(view);
    }
}
