package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5857a extends C2566a {
    private GetCategoryItemsRequest f16019a;
    private long f16020b;

    public C5857a(String str, long j) {
        this.f16019a = new GetCategoryItemsRequest(str);
        this.f16020b = j;
    }

    public final GetCategoryItemsResponse m13062a(Context context) {
        return (GetCategoryItemsResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getLandingPageCategoryItems(this.f16019a, String.valueOf(this.f16020b)), this.f16019a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13062a(context);
    }
}
