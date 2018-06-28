package android.support.v4.p031b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.p029a.p030a.C4761a.C0341c;
import android.support.v4.p029a.p030a.C4761a.C4762b;
import android.support.v4.p036e.C0449b.C0448b;
import android.support.v4.p038g.C0482m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

final class C6364e extends C4804g {
    private static final Class f17410a;
    private static final Constructor f17411b;
    private static final Method f17412c;
    private static final Method f17413d;

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (Throwable e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = cls;
            method = method2;
        }
        f17411b = constructor;
        f17410a = cls;
        f17412c = method;
        f17413d = method2;
    }

    C6364e() {
    }

    private static Typeface m14982a(Object obj) {
        try {
            Array.set(Array.newInstance(f17410a, 1), 0, obj);
            return (Typeface) f17413d.invoke(null, new Object[]{r0});
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean m14983a() {
        if (f17412c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f17412c != null;
    }

    private static boolean m14984a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f17412c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static Object m14985b() {
        try {
            return f17411b.newInstance(new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final Typeface mo292a(Context context, C4762b c4762b, Resources resources, int i) {
        Object b = C6364e.m14985b();
        for (C0341c c0341c : c4762b.f13159a) {
            if (!C6364e.m14984a(b, C0440h.m933a(context, resources, c0341c.f1297d), 0, c0341c.f1295b, c0341c.f1296c)) {
                return null;
            }
        }
        return C6364e.m14982a(b);
    }

    public final Typeface mo293a(Context context, C0448b[] c0448bArr, int i) {
        Object b = C6364e.m14985b();
        C0482m c0482m = new C0482m();
        for (C0448b c0448b : c0448bArr) {
            Uri uri = c0448b.f1560a;
            ByteBuffer byteBuffer = (ByteBuffer) c0482m.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0440h.m934a(context, uri);
                c0482m.put(uri, byteBuffer);
            }
            if (!C6364e.m14984a(b, byteBuffer, c0448b.f1561b, c0448b.f1562c, c0448b.f1563d)) {
                return null;
            }
        }
        return C6364e.m14982a(b);
    }
}
