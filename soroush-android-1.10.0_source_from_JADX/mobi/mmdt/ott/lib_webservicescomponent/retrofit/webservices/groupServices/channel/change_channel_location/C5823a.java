package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.change_channel_location;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;

public final class C5823a extends C2566a {
    private ChangeChannelLocationsRequest f15985a;

    public C5823a(String str, String str2, ChannelLocation[] channelLocationArr) {
        this.f15985a = new ChangeChannelLocationsRequest(str, str2, channelLocationArr);
    }

    public final ChangeChannelLocationsResponse m13028a(Context context) {
        return (ChangeChannelLocationsResponse) registeredSend(context, C2567b.m7018a().m7022a(context).changeChannelLocations(this.f15985a), this.f15985a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13028a(context);
    }
}
