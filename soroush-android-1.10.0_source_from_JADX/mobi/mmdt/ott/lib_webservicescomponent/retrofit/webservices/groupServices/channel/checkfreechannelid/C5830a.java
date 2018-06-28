package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.checkfreechannelid;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5830a extends C2566a {
    private CheckFreeChannelIdRequest f15992a;

    public C5830a(String str, String str2) {
        this.f15992a = new CheckFreeChannelIdRequest(str, str2);
    }

    public final CheckFreeChannelIdResponse m13035a(Context context) {
        return (CheckFreeChannelIdResponse) registeredSend(context, C2567b.m7018a().m7022a(context).checkFreeChannelId(this.f15992a), this.f15992a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13035a(context);
    }
}
