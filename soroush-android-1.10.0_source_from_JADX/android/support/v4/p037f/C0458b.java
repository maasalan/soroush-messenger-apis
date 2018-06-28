package android.support.v4.p037f;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

final class C0458b {
    private static Method f1592a;

    static {
        try {
            f1592a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public static String m959a(Locale locale) {
        try {
            return ((Locale) f1592a.invoke(null, new Object[]{locale})).getScript();
        } catch (Throwable e) {
            Log.w("ICUCompatApi21", e);
            return locale.getScript();
        }
    }
}
