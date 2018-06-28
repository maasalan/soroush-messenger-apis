package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.urls.WebserviceUrls;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5861a extends C2566a {
    private LinkPreviewRequest f16025a;

    public C5861a(String str) {
        this.f16025a = new LinkPreviewRequest(str);
    }

    public final LinkPreviewResponse m13066a(Context context) {
        C2567b a = C2567b.m7018a();
        if (a.f8378a == null) {
            a.f8378a = (WebserviceUrls) a.m7021a(context, "https://wslb2.soroush-hamrah.ir/", false).m6293a(WebserviceUrls.class);
        }
        return (LinkPreviewResponse) a.f8378a.linkPreview(this.f16025a).mo2060a().f7590a;
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13066a(context);
    }
}
