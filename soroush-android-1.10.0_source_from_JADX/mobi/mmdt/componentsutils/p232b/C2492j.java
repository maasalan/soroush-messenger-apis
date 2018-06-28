package mobi.mmdt.componentsutils.p232b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.provider.Settings.Secure;
import java.security.MessageDigest;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;

public final class C2492j {
    public static String m6840a(Context context) {
        StringBuilder stringBuilder = new StringBuilder("android_");
        stringBuilder.append(C2492j.m6845d(context));
        stringBuilder.append("_");
        stringBuilder.append(Build.BRAND);
        stringBuilder.append("_");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append("_");
        String stringBuilder2 = stringBuilder.toString();
        try {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(C2492j.m6843b(C2492j.m6846e(context)));
            return stringBuilder3.toString();
        } catch (Throwable e) {
            C2480b.m6737b("Problem in hash userAgent", e);
            return stringBuilder2;
        }
    }

    public static String m6841a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] toCharArray = str.toLowerCase().toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            char c = toCharArray[i];
            if (((c <= 'z' ? 1 : 0) & (c >= 'a' ? 1 : 0)) != 0) {
                stringBuilder.append(Character.toString((char) (((((c - 96) + i) + 1) % 28) + 96)));
            } else {
                if (((c >= '0' ? 1 : 0) & (c <= '9' ? 1 : 0)) != 0) {
                    stringBuilder.append(((Character.getNumericValue(toCharArray[i]) + i) + 1) % 10);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String m6842b(Context context) {
        return C2492j.m6843b(C2492j.m6846e(context));
    }

    public static String m6843b(String str) {
        byte[] digest = MessageDigest.getInstance("SHA1").digest(str.getBytes());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {
            stringBuilder.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuilder.toString();
    }

    public static String m6844c(Context context) {
        String str = "android_";
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(C2492j.m6843b(C2492j.m6846e(context)));
            return stringBuilder.toString();
        } catch (Throwable e) {
            C2480b.m6737b("Problem in hash userAgent", e);
            return str;
        }
    }

    public static String m6845d(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable e) {
            C2480b.m6734a(e.getMessage(), e);
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    public static String m6846e(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }
}
