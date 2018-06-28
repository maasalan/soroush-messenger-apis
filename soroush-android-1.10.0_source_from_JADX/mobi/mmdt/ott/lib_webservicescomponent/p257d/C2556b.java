package mobi.mmdt.ott.lib_webservicescomponent.p257d;

import android.content.Context;
import android.provider.Settings.Secure;
import org.jivesoftware.smackx.bookmarks.Bookmarks;

public final class C2556b {
    public static String m6997a(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        return i <= 120 ? "ldpi" : (i <= 120 || i > 160) ? (i <= 160 || i > 240) ? (i <= 240 || i > 320) ? (i <= 320 || i > 480) ? "xxxhdpi" : "xxhdpi" : "xhdpi" : "hdpi" : "mdpi";
    }

    public static String m6998a(String str) {
        return str.replace("cdn1.fs", "cdn111-fs2").replace("cdn2.fs", "cdn112-fs2").replace("cdn3.fs", "cdn113-fs2").replace("cdn4.fs", "cdn114-fs2").replace("ws.stickers", "ws-stickers2");
    }

    public static String m6999b(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String m7000b(String str) {
        return (str.toLowerCase().contains("https://storage.filesrvcloud.ir") || str.toLowerCase().contains("http://storage.filesrvcloud.ir")) ? str.replaceFirst(Bookmarks.ELEMENT, "cdn") : str;
    }

    public static String m7001c(String str) {
        return (str.toLowerCase().contains("https://cdn.filesrvcloud.ir") || str.toLowerCase().contains("http://cdn.filesrvcloud.ir")) ? str.replaceFirst("cdn", Bookmarks.ELEMENT) : str;
    }
}
