package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.removemember;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5841a extends C2566a {
    private RemoveMemberFromChannelRequest f16003a;

    public C5841a(String str, String str2, String str3) {
        this.f16003a = new RemoveMemberFromChannelRequest(str, str2, str3);
    }

    public final RemoveMemberFromChannelResponse m13046a(Context context) {
        return (RemoveMemberFromChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).removeMemberFromChannel(this.f16003a), this.f16003a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13046a(context);
    }
}
