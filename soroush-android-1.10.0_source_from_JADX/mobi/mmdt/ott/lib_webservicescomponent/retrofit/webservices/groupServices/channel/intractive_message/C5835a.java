package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5835a extends C2566a {
    private GetChannelInteractiveMessageRequest f15997a;

    public C5835a(String str, String str2, long j, int i) {
        this.f15997a = new GetChannelInteractiveMessageRequest(str, str2, j, i);
    }

    public final GetChannelInteractiveMessageResponse m13040a(Context context) {
        return (GetChannelInteractiveMessageResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getChannelInteractiveMessage(this.f15997a), this.f15997a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13040a(context);
    }
}
