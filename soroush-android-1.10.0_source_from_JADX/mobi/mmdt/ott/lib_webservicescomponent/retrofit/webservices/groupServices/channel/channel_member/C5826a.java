package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberType;

public final class C5826a extends C2566a {
    GetAllChannelMembersRequest f15988a;

    public C5826a(String str, String str2, int i, int i2, ChannelMemberType channelMemberType) {
        this.f15988a = new GetAllChannelMembersRequest(str, str2, i, i2, channelMemberType.getNumber());
    }

    public final GetAllChannelMembersResponse m13031a(Context context) {
        return (GetAllChannelMembersResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getAllChannelMembers(this.f15988a), this.f15988a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13031a(context);
    }
}
