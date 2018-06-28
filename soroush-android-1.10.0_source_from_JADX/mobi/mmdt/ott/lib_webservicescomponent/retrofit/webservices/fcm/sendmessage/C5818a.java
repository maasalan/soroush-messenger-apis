package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendmessage;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMPriority;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMType;

public final class C5818a extends C2566a {
    private SendFCMMessageRequest f15980a;

    public C5818a(String str, String str2, FCMType fCMType, FCMData fCMData, FCMPriority fCMPriority) {
        this.f15980a = new SendFCMMessageRequest(str, str2, fCMType, fCMData, fCMPriority, 10);
    }

    public final SendFCMMessageResponse m13023a(Context context) {
        return (SendFCMMessageResponse) registeredSend(context, C2567b.m7018a().m7022a(context).sendFCMMessage(this.f15980a), this.f15980a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13023a(context);
    }
}
