package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5859a extends C2566a {
    private GetLikeRequest f16023a;

    public C5859a(String str, String[] strArr) {
        this.f16023a = new GetLikeRequest(str, strArr);
    }

    public final GetLikeResponse m13064a(Context context) {
        return (GetLikeResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getLike(this.f16023a), this.f16023a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13064a(context);
    }
}
