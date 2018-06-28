package android.support.v4.p031b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.p029a.p030a.C4761a.C0341c;
import android.support.v4.p029a.p030a.C4761a.C4762b;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public final class C7016f extends C6363d {
    private static final Class f20034a;
    private static final Constructor f20035b;
    private static final Method f20036c;
    private static final Method f20037d;
    private static final Method f20038e;
    private static final Method f20039f;
    private static final Method f20040g;

    static {
        Class cls;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method declaredMethod;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            constructor = constructor2;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            cls = null;
            declaredMethod = cls;
            method = declaredMethod;
            method2 = method;
            method3 = method2;
            method4 = method3;
        }
        f20035b = constructor;
        f20034a = cls;
        f20036c = method;
        f20037d = method2;
        f20038e = method3;
        f20039f = method4;
        f20040g = declaredMethod;
    }

    private static Typeface m18114a(Object obj) {
        try {
            Array.set(Array.newInstance(f20034a, 1), 0, obj);
            return (Typeface) f20040g.invoke(null, new Object[]{r0, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m18115a() {
        if (f20036c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f20036c != null;
    }

    private static boolean m18116a(Context context, Object obj, String str, int i, int i2) {
        try {
            return ((Boolean) f20036c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(i2), null})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m18117a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f20037d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static Object m18118b() {
        try {
            return f20035b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m18119b(Object obj) {
        try {
            return ((Boolean) f20038e.invoke(obj, new Object[0])).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m18120c(Object obj) {
        try {
            return ((Boolean) f20039f.invoke(obj, new Object[0])).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final Typeface mo291a(Context context, Resources resources, int i, String str, int i2) {
        if (!C7016f.m18115a()) {
            return super.mo291a(context, resources, i, str, i2);
        }
        Object b = C7016f.m18118b();
        if (C7016f.m18116a(context, b, str, -1, -1)) {
            return !C7016f.m18119b(b) ? null : C7016f.m18114a(b);
        } else {
            C7016f.m18120c(b);
            return null;
        }
    }

    public final Typeface mo292a(Context context, C4762b c4762b, Resources resources, int i) {
        if (!C7016f.m18115a()) {
            return super.mo292a(context, c4762b, resources, i);
        }
        Object b = C7016f.m18118b();
        C0341c[] c0341cArr = c4762b.f13159a;
        i = c0341cArr.length;
        int i2 = 0;
        while (i2 < i) {
            C0341c c0341c = c0341cArr[i2];
            if (C7016f.m18116a(context, b, c0341c.f1294a, c0341c.f1295b, c0341c.f1296c)) {
                i2++;
            } else {
                C7016f.m18120c(b);
                return null;
            }
        }
        return !C7016f.m18119b(b) ? null : C7016f.m18114a(b);
    }

    public final android.graphics.Typeface mo293a(android.content.Context r9, android.support.v4.p036e.C0449b.C0448b[] r10, int r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = 0;
        r1 = r10.length;
        if (r1 > 0) goto L_0x0005;
    L_0x0004:
        return r0;
    L_0x0005:
        r1 = android.support.v4.p031b.C7016f.m18115a();
        if (r1 != 0) goto L_0x0055;
    L_0x000b:
        r10 = r8.m9172a(r10, r11);
        r9 = r9.getContentResolver();
        r11 = r10.f1560a;	 Catch:{ IOException -> 0x0054 }
        r1 = "r";	 Catch:{ IOException -> 0x0054 }
        r9 = r9.openFileDescriptor(r11, r1, r0);	 Catch:{ IOException -> 0x0054 }
        r11 = new android.graphics.Typeface$Builder;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r1 = r9.getFileDescriptor();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r11.<init>(r1);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r1 = r10.f1562c;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r11 = r11.setWeight(r1);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r10 = r10.f1563d;	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r10 = r11.setItalic(r10);	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        r10 = r10.build();	 Catch:{ Throwable -> 0x003d, all -> 0x003a }
        if (r9 == 0) goto L_0x0039;
    L_0x0036:
        r9.close();	 Catch:{ IOException -> 0x0054 }
    L_0x0039:
        return r10;
    L_0x003a:
        r10 = move-exception;
        r11 = r0;
        goto L_0x0043;
    L_0x003d:
        r10 = move-exception;
        throw r10;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r11 = move-exception;
        r7 = r11;
        r11 = r10;
        r10 = r7;
    L_0x0043:
        if (r9 == 0) goto L_0x0053;
    L_0x0045:
        if (r11 == 0) goto L_0x0050;
    L_0x0047:
        r9.close();	 Catch:{ Throwable -> 0x004b }
        goto L_0x0053;
    L_0x004b:
        r9 = move-exception;
        r11.addSuppressed(r9);	 Catch:{ IOException -> 0x0054 }
        goto L_0x0053;	 Catch:{ IOException -> 0x0054 }
    L_0x0050:
        r9.close();	 Catch:{ IOException -> 0x0054 }
    L_0x0053:
        throw r10;	 Catch:{ IOException -> 0x0054 }
    L_0x0054:
        return r0;
    L_0x0055:
        r9 = android.support.v4.p036e.C0449b.m948a(r9, r10);
        r11 = android.support.v4.p031b.C7016f.m18118b();
        r1 = 0;
        r2 = r10.length;
        r3 = r1;
    L_0x0060:
        if (r1 >= r2) goto L_0x0082;
    L_0x0062:
        r4 = r10[r1];
        r5 = r4.f1560a;
        r5 = r9.get(r5);
        r5 = (java.nio.ByteBuffer) r5;
        if (r5 == 0) goto L_0x007f;
    L_0x006e:
        r3 = r4.f1561b;
        r6 = r4.f1562c;
        r4 = r4.f1563d;
        r3 = android.support.v4.p031b.C7016f.m18117a(r11, r5, r3, r6, r4);
        if (r3 != 0) goto L_0x007e;
    L_0x007a:
        android.support.v4.p031b.C7016f.m18120c(r11);
        return r0;
    L_0x007e:
        r3 = 1;
    L_0x007f:
        r1 = r1 + 1;
        goto L_0x0060;
    L_0x0082:
        if (r3 != 0) goto L_0x0088;
    L_0x0084:
        android.support.v4.p031b.C7016f.m18120c(r11);
        return r0;
    L_0x0088:
        r9 = android.support.v4.p031b.C7016f.m18119b(r11);
        if (r9 != 0) goto L_0x008f;
    L_0x008e:
        return r0;
    L_0x008f:
        r9 = android.support.v4.p031b.C7016f.m18114a(r11);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.f.a(android.content.Context, android.support.v4.e.b$b[], int):android.graphics.Typeface");
    }
}
