package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5880a extends C2566a {
    private StickersCollectionsByCategoryRequest f16044a;
    private String f16045b;

    public C5880a(String str, String str2, String str3, String str4, String str5) {
        this.f16044a = new StickersCollectionsByCategoryRequest(str, str2, str3, str4);
        this.f16045b = str5;
    }

    public final StickersCollectionsByCategoryResponse m13085a(Context context) {
        return (StickersCollectionsByCategoryResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getStickersCollectionsByCategory(this.f16044a, this.f16045b), this.f16044a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13085a(context);
    }
}
