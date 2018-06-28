package android.support.v4.p037f;

import android.os.Build.VERSION;
import java.util.Locale;

public final class C0457a {
    private static final C0456b f1591a = (VERSION.SDK_INT >= 21 ? new C4808a() : new C0456b());

    static class C0456b {
        C0456b() {
        }

        public String mo295a(Locale locale) {
            return C0459c.m961a(locale);
        }
    }

    static class C4808a extends C0456b {
        C4808a() {
        }

        public final String mo295a(Locale locale) {
            return C0458b.m959a(locale);
        }
    }

    public static String m958a(Locale locale) {
        return f1591a.mo295a(locale);
    }
}
