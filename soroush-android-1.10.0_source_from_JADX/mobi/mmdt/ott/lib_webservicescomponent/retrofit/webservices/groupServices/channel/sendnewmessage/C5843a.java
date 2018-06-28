package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage;

import android.content.Context;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5843a extends C2566a {
    private SendNewMessageToChannelRequest f16005a;

    public C5843a(String str, String str2, String str3, String str4, HashMap hashMap) {
        this.f16005a = new SendNewMessageToChannelRequest(str, str2, str3, str4, hashMap);
    }

    public final SendNewMessageToChannelResponse m13048a(Context context) {
        return (SendNewMessageToChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).sendNewMessageToChannel(this.f16005a), this.f16005a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13048a(context);
    }
}
