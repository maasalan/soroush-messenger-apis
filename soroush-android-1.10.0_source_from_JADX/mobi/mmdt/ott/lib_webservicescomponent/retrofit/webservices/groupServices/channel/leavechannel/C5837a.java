package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.leavechannel;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5837a extends C2566a {
    private LeaveChannelRequest f15999a;

    public C5837a(String str, String str2) {
        this.f15999a = new LeaveChannelRequest(str, str2);
    }

    public final LeaveChannelResponse m13042a(Context context) {
        return (LeaveChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).leaveChannel(this.f15999a), this.f15999a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13042a(context);
    }
}
