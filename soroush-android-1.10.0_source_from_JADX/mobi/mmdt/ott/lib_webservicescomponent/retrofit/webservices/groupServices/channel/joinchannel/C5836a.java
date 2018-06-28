package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.joinchannel;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5836a extends C2566a {
    JoinChannelRequest f15998a;

    public C5836a(String str, String str2) {
        this.f15998a = new JoinChannelRequest(str, str2);
    }

    public final JoinChannelResponse m13041a(Context context) {
        return (JoinChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).joinChannel(this.f15998a), this.f15998a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13041a(context);
    }
}
