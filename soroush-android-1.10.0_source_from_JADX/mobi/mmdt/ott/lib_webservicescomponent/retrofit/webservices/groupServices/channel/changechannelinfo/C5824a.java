package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changechannelinfo;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5824a extends C2566a {
    ChangeChannelInformationRequest f15986a;

    public C5824a(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f15986a = new ChangeChannelInformationRequest(str, str2, str3, str4, str5, str6, i, str7);
    }

    public final ChangeChannelInformationResponse m13029a(Context context) {
        return (ChangeChannelInformationResponse) registeredSend(context, C2567b.m7018a().m7022a(context).changeChannelInformation(this.f15986a), this.f15986a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13029a(context);
    }
}
