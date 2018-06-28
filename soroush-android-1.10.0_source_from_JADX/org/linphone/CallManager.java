package org.linphone;

import android.content.Context;
import mobi.mmdt.componentsutils.b.c.b;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCore;

public class CallManager {
    public static void inviteAddress(Context context, LinphoneAddress linphoneAddress, boolean z) {
        LinphoneCore linphoneLc = LinphoneManager.getInstance(context).getLinphoneLc(context);
        LinphoneCallParams createCallParams = linphoneLc.createCallParams(null);
        createCallParams.setVideoEnabled(false);
        if (z) {
            createCallParams.enableLowBandwidth(true);
            b.f("Low bandwidth enabled in call params");
        }
        linphoneLc.inviteAddressWithParams(linphoneAddress, createCallParams);
    }
}
