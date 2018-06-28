package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_filter;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5881a extends C2566a {
    private GetStickersCollectionsByFilterRequest f16046a;
    private String f16047b;

    public C5881a(String str, String str2, String str3, String str4, String str5) {
        this.f16046a = new GetStickersCollectionsByFilterRequest(str, str2, str3, str4);
        this.f16047b = str5;
    }

    public final GetStickersCollectionsByFilterResponse m13086a(Context context) {
        return (GetStickersCollectionsByFilterResponse) registeredSend(context, C2567b.m7018a().m7023b(context).getGetStickersCollectionsByFilter(this.f16046a, this.f16047b), this.f16046a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13086a(context);
    }
}
