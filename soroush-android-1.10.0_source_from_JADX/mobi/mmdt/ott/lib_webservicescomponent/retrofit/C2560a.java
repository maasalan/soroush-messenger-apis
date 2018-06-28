package mobi.mmdt.ott.lib_webservicescomponent.retrofit;

import android.content.Context;
import android.content.SharedPreferences;

public final class C2560a {
    public static SharedPreferences f8368a;
    private static C2560a f8369b;

    private C2560a(Context context) {
        f8368a = context.getSharedPreferences("TestWebService", 0);
    }

    public static C2560a m7006a(Context context) {
        if (f8369b == null) {
            f8369b = new C2560a(context);
        }
        return f8369b;
    }

    public static boolean m7007a() {
        return f8368a.getBoolean("WS_CONNECTION_ENABLED", true);
    }

    public static String m7008b() {
        return f8368a.getString("ServerHashMethod", null);
    }

    public static String m7009c() {
        return f8368a.getString("ServerEncryptionMethod", null);
    }

    public static String m7010d() {
        return f8368a.getString("Token", null);
    }
}
