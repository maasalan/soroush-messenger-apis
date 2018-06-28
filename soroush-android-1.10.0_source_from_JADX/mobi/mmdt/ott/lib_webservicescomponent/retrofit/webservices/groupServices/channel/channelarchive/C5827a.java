package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5827a extends C2566a {
    private GetChannelArchiveRequest f15989a;

    public C5827a(String str, String str2, int i, int i2, String str3) {
        this.f15989a = new GetChannelArchiveRequest(str, str2, i, i2, str3);
    }

    public final GetChannelArchiveResponse m13032a(Context context) {
        return (GetChannelArchiveResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getchannelArchive(this.f15989a), this.f15989a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13032a(context);
    }
}
