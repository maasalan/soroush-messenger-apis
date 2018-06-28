package mobi.mmdt.ott.view.tools;

import android.app.Activity;

public final class C4504d {
    public static void m8198a(Activity activity, String str) {
        str = C4504d.m8202c(str);
        if (str != null) {
            if (!str.isEmpty()) {
                C4504d.m8200b(activity, str);
                return;
            }
        }
        throw new NullPointerException("Service SoroushId must not be null");
    }

    public static boolean m8199a(String str) {
        str = C4504d.m8202c(str);
        if (str != null) {
            if (!str.isEmpty()) {
                return C4504d.m8201b(str);
            }
        }
        return false;
    }

    public static void m8200b(Activity activity, String str) {
        if (str.equalsIgnoreCase("CHARGE")) {
            C4478a.m8171g(activity);
        } else if (str.equalsIgnoreCase("OWGHAT")) {
            C4478a.m8170f(activity);
        } else if (str.equalsIgnoreCase("BILLPAY")) {
            C4478a.m8172h(activity);
        } else {
            if (str.equalsIgnoreCase("WEATHER")) {
                C4478a.m8173i(activity);
            }
        }
    }

    public static boolean m8201b(String str) {
        if (!(str.equalsIgnoreCase("CHARGE") || str.equalsIgnoreCase("OWGHAT") || str.equalsIgnoreCase("BILLPAY"))) {
            if (!str.equalsIgnoreCase("WEATHER")) {
                return false;
            }
        }
        return true;
    }

    private static String m8202c(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                String[] split = str.split("/");
                return split[split.length - 1];
            }
        }
        throw new NullPointerException("Service SoroushId must not be null");
    }
}
