package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannel;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5832a extends C2566a {
    private DeleteChannelRequest f15994a;

    public C5832a(String str, String str2) {
        this.f15994a = new DeleteChannelRequest(str, str2);
    }

    public final DeleteChannelResponse m13037a(Context context) {
        return (DeleteChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).deleteChannel(this.f15994a), this.f15994a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13037a(context);
    }
}
