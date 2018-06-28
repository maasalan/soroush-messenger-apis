package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.addmember;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;

public final class C5821a extends C2566a {
    private AddMemberToChannelRequest f15983a;

    public C5821a(String str, String str2, ChannelMemberRole[] channelMemberRoleArr) {
        this.f15983a = new AddMemberToChannelRequest(str, str2, channelMemberRoleArr);
    }

    public final AddMemberToChannelResponse m13026a(Context context) {
        return (AddMemberToChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).addMemberToChannel(this.f15983a), this.f15983a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13026a(context);
    }
}
