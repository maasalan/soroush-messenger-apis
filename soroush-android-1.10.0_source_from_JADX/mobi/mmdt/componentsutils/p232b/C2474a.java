package mobi.mmdt.componentsutils.p232b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class C2474a {
    public static NetworkInfo m6717a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean m6718b(Context context) {
        NetworkInfo a = C2474a.m6717a(context);
        return a != null && a.isConnected();
    }
}
