package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5858a extends C2566a {
    private GetLandingPageRequest f16021a;
    private String f16022b;

    public C5858a(String str, String str2) {
        this.f16021a = new GetLandingPageRequest(str);
        this.f16022b = str2;
    }

    public final GetLandingPageResponse m13063a(Context context) {
        return (GetLandingPageResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getLandingPage(this.f16021a, this.f16022b), this.f16021a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13063a(context);
    }
}
