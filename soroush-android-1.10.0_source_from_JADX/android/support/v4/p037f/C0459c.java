package android.support.v4.p037f;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Locale;

final class C0459c {
    private static Method f1593a;
    private static Method f1594b;

    static {
        try {
            Class cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f1593a = cls.getMethod("getScript", new Class[]{String.class});
                f1594b = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Throwable e) {
            f1593a = null;
            f1594b = null;
            Log.w("ICUCompatIcs", e);
        }
    }

    private static String m960a(String str) {
        try {
            if (f1593a != null) {
                return (String) f1593a.invoke(null, new Object[]{str});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        }
        return null;
    }

    public static String m961a(Locale locale) {
        String b = C0459c.m962b(locale);
        return b != null ? C0459c.m960a(b) : null;
    }

    private static String m962b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f1594b != null) {
                return (String) f1594b.invoke(null, new Object[]{locale2});
            }
        } catch (Throwable e) {
            Log.w("ICUCompatIcs", e);
        }
        return locale2;
    }
}
