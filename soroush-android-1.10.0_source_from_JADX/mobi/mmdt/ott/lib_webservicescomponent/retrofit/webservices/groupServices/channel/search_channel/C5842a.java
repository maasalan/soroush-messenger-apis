package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5842a extends C2566a {
    private SearchChannelRequest f16004a;

    public C5842a(String str, String str2) {
        this.f16004a = new SearchChannelRequest(str, str2);
    }

    public final SearchChannelResponse m13047a(Context context) {
        return (SearchChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).searchChannel(this.f16004a), this.f16004a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13047a(context);
    }
}
