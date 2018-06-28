package org.linphone;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCore;

public final class LinphoneUtils {
    private LinphoneUtils() {
    }

    public static List<LinphoneCall> getLinphoneCalls(LinphoneCore linphoneCore) {
        return new ArrayList(Arrays.asList(linphoneCore.getCalls()));
    }

    private static boolean isConnectionFast(int i, int i2) {
        if (i == 0) {
            if (i2 != 11) {
                switch (i2) {
                    case 1:
                    case 2:
                        break;
                    default:
                        break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean isHighBandwidthConnection(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && isConnectionFast(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
    }

    public static void setVisibility(View view, int i, boolean z) {
        view.findViewById(i).setVisibility(z ? 0 : 8);
    }

    public static void setVisibility(View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }
}
