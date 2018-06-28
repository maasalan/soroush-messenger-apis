package android.support.p028d;

import java.lang.reflect.Method;

class ap extends ao {
    private static Method f20933a;
    private static boolean f20934b;
    private static Method f20935c;
    private static boolean f20936d;

    ap() {
    }

    public final void mo79a(android.view.View r7, android.graphics.Matrix r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = f20934b;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        r0 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r3 = "transformMatrixToGlobal";	 Catch:{ NoSuchMethodException -> 0x001a }
        r4 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001a }
        r5 = android.graphics.Matrix.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x001a }
        f20933a = r0;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001a }
        goto L_0x0022;
    L_0x001a:
        r0 = move-exception;
        r3 = "ViewUtilsApi21";
        r4 = "Failed to retrieve transformMatrixToGlobal method";
        android.util.Log.i(r3, r4, r0);
    L_0x0022:
        f20934b = r2;
    L_0x0024:
        r0 = f20933a;
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = f20933a;	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r2[r1] = r8;	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r0.invoke(r7, r2);	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        return;
    L_0x0032:
        r7 = move-exception;
        r8 = new java.lang.RuntimeException;
        r7 = r7.getCause();
        r8.<init>(r7);
        throw r8;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.ap.a(android.view.View, android.graphics.Matrix):void");
    }

    public final void mo81b(android.view.View r7, android.graphics.Matrix r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = f20936d;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x0024;
    L_0x0006:
        r0 = android.view.View.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r3 = "transformMatrixToLocal";	 Catch:{ NoSuchMethodException -> 0x001a }
        r4 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001a }
        r5 = android.graphics.Matrix.class;	 Catch:{ NoSuchMethodException -> 0x001a }
        r4[r1] = r5;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0 = r0.getDeclaredMethod(r3, r4);	 Catch:{ NoSuchMethodException -> 0x001a }
        f20935c = r0;	 Catch:{ NoSuchMethodException -> 0x001a }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001a }
        goto L_0x0022;
    L_0x001a:
        r0 = move-exception;
        r3 = "ViewUtilsApi21";
        r4 = "Failed to retrieve transformMatrixToLocal method";
        android.util.Log.i(r3, r4, r0);
    L_0x0022:
        f20936d = r2;
    L_0x0024:
        r0 = f20935c;
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = f20935c;	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r2 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r2[r1] = r8;	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        r0.invoke(r7, r2);	 Catch:{ IllegalAccessException -> 0x003d, InvocationTargetException -> 0x0032 }
        return;
    L_0x0032:
        r7 = move-exception;
        r8 = new java.lang.RuntimeException;
        r7 = r7.getCause();
        r8.<init>(r7);
        throw r8;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.ap.b(android.view.View, android.graphics.Matrix):void");
    }
}
