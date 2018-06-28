package org.linphone.customized;

import android.content.Context;
import org.linphone.core.LinphoneAddress.TransportType;

public interface CustomizedICall {
    void answer(Context context);

    void call(Context context, String str);

    void hangUp(Context context);

    void register(Context context, String str, String str2, String str3, String str4, int i, TransportType transportType);

    void setHold(Context context, boolean z);

    void setMute(Context context, boolean z);

    void setSpeaker(Context context, boolean z);

    void unRegister(Context context);
}
