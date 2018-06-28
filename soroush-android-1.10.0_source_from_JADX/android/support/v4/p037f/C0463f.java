package android.support.v4.p037f;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

public final class C0463f {
    @Deprecated
    public static final Locale f1601a = new Locale("", "");

    public static int m967a(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(f1601a))) {
            String a = C0457a.m958a(locale);
            if (a == null) {
                switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                    case (byte) 1:
                    case (byte) 2:
                        return 1;
                    default:
                        return 0;
                }
            } else if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
