package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;

public final class C5831a extends C2566a {
    private CreateChannelRequest f15993a;

    public C5831a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List<ChannelMemberRole> list, ChannelLocation[] channelLocationArr) {
        this.f15993a = new CreateChannelRequest(str, str2, str3, str4, str5, str6, str7, i, list, channelLocationArr);
    }

    public final CreateChannelResponse m13036a(Context context) {
        return (CreateChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).createChannel(this.f15993a), this.f15993a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13036a(context);
    }
}
