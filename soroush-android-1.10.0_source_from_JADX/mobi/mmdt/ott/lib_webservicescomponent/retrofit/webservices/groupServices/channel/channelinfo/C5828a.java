package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5828a extends C2566a {
    private GetChannelInfoRequest f15990a;

    public C5828a(String str, String str2) {
        this.f15990a = new GetChannelInfoRequest(str, str2);
    }

    public final GetChannelInfoResponse m13033a(Context context) {
        return (GetChannelInfoResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getChannelInfo(this.f15990a), this.f15990a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13033a(context);
    }
}
