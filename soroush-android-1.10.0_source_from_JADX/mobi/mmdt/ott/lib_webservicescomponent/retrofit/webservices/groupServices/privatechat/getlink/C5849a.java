package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5849a extends C2566a {
    GetPrivateGroupLinkRequest f16011a;

    public C5849a(String str, String str2) {
        this.f16011a = new GetPrivateGroupLinkRequest(str, str2);
    }

    public final GetPrivateGroupLinkResponse m13054a(Context context) {
        return (GetPrivateGroupLinkResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getPrivateGroupLink(this.f16011a), this.f16011a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13054a(context);
    }
}
