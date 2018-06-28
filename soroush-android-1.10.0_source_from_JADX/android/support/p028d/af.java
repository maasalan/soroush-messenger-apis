package android.support.p028d;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class af implements ah {
    private static LayoutTransition f12939a;
    private static Field f12940b;
    private static boolean f12941c;
    private static Method f12942d;
    private static boolean f12943e;

    class C02001 extends LayoutTransition {
        final /* synthetic */ af f817a;

        C02001(af afVar) {
            this.f817a = afVar;
        }

        public final boolean isChangingLayout() {
            return true;
        }
    }

    af() {
    }

    public ad mo72a(ViewGroup viewGroup) {
        return (ab) ai.m8636c(viewGroup);
    }

    public void mo73a(android.view.ViewGroup r6, boolean r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = f12939a;
        r1 = 1;
        r2 = 0;
        r3 = 0;
        if (r0 != 0) goto L_0x0028;
    L_0x0007:
        r0 = new android.support.d.af$1;
        r0.<init>(r5);
        f12939a = r0;
        r4 = 2;
        r0.setAnimator(r4, r3);
        r0 = f12939a;
        r0.setAnimator(r2, r3);
        r0 = f12939a;
        r0.setAnimator(r1, r3);
        r0 = f12939a;
        r4 = 3;
        r0.setAnimator(r4, r3);
        r0 = f12939a;
        r4 = 4;
        r0.setAnimator(r4, r3);
    L_0x0028:
        if (r7 == 0) goto L_0x007a;
    L_0x002a:
        r7 = r6.getLayoutTransition();
        if (r7 == 0) goto L_0x0074;
    L_0x0030:
        r0 = r7.isRunning();
        if (r0 == 0) goto L_0x006b;
    L_0x0036:
        r0 = f12943e;
        if (r0 != 0) goto L_0x0053;
    L_0x003a:
        r0 = android.animation.LayoutTransition.class;	 Catch:{ NoSuchMethodException -> 0x004a }
        r3 = "cancel";	 Catch:{ NoSuchMethodException -> 0x004a }
        r4 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x004a }
        r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x004a }
        f12942d = r0;	 Catch:{ NoSuchMethodException -> 0x004a }
        r0.setAccessible(r1);	 Catch:{ NoSuchMethodException -> 0x004a }
        goto L_0x0051;
    L_0x004a:
        r0 = "ViewGroupUtilsApi14";
        r3 = "Failed to access cancel method by reflection";
        android.util.Log.i(r0, r3);
    L_0x0051:
        f12943e = r1;
    L_0x0053:
        r0 = f12942d;
        if (r0 == 0) goto L_0x006b;
    L_0x0057:
        r0 = f12942d;	 Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x005f }
        r1 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x005f }
        r0.invoke(r7, r1);	 Catch:{ IllegalAccessException -> 0x0064, InvocationTargetException -> 0x005f }
        goto L_0x006b;
    L_0x005f:
        r0 = "ViewGroupUtilsApi14";
        r1 = "Failed to invoke cancel method by reflection";
        goto L_0x0068;
    L_0x0064:
        r0 = "ViewGroupUtilsApi14";
        r1 = "Failed to access cancel method by reflection";
    L_0x0068:
        android.util.Log.i(r0, r1);
    L_0x006b:
        r0 = f12939a;
        if (r7 == r0) goto L_0x0074;
    L_0x006f:
        r0 = android.support.p028d.C0226r.C0225a.transition_layout_save;
        r6.setTag(r0, r7);
    L_0x0074:
        r7 = f12939a;
        r6.setLayoutTransition(r7);
        return;
    L_0x007a:
        r6.setLayoutTransition(r3);
        r7 = f12941c;
        if (r7 != 0) goto L_0x0098;
    L_0x0081:
        r7 = android.view.ViewGroup.class;	 Catch:{ NoSuchFieldException -> 0x008f }
        r0 = "mLayoutSuppressed";	 Catch:{ NoSuchFieldException -> 0x008f }
        r7 = r7.getDeclaredField(r0);	 Catch:{ NoSuchFieldException -> 0x008f }
        f12940b = r7;	 Catch:{ NoSuchFieldException -> 0x008f }
        r7.setAccessible(r1);	 Catch:{ NoSuchFieldException -> 0x008f }
        goto L_0x0096;
    L_0x008f:
        r7 = "ViewGroupUtilsApi14";
        r0 = "Failed to access mLayoutSuppressed field by reflection";
        android.util.Log.i(r7, r0);
    L_0x0096:
        f12941c = r1;
    L_0x0098:
        r7 = f12940b;
        if (r7 == 0) goto L_0x00b5;
    L_0x009c:
        r7 = f12940b;	 Catch:{ IllegalAccessException -> 0x00ae }
        r7 = r7.getBoolean(r6);	 Catch:{ IllegalAccessException -> 0x00ae }
        if (r7 == 0) goto L_0x00ac;
    L_0x00a4:
        r0 = f12940b;	 Catch:{ IllegalAccessException -> 0x00aa }
        r0.setBoolean(r6, r2);	 Catch:{ IllegalAccessException -> 0x00aa }
        goto L_0x00ac;
    L_0x00aa:
        r2 = r7;
        goto L_0x00ae;
    L_0x00ac:
        r2 = r7;
        goto L_0x00b5;
    L_0x00ae:
        r7 = "ViewGroupUtilsApi14";
        r0 = "Failed to get mLayoutSuppressed field by reflection";
        android.util.Log.i(r7, r0);
    L_0x00b5:
        if (r2 == 0) goto L_0x00ba;
    L_0x00b7:
        r6.requestLayout();
    L_0x00ba:
        r7 = android.support.p028d.C0226r.C0225a.transition_layout_save;
        r7 = r6.getTag(r7);
        r7 = (android.animation.LayoutTransition) r7;
        if (r7 == 0) goto L_0x00cc;
    L_0x00c4:
        r0 = android.support.p028d.C0226r.C0225a.transition_layout_save;
        r6.setTag(r0, r3);
        r6.setLayoutTransition(r7);
    L_0x00cc:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.af.a(android.view.ViewGroup, boolean):void");
    }
}
