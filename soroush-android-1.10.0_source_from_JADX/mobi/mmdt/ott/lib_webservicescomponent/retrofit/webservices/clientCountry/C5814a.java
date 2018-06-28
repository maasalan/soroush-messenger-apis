package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.clientCountry;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5814a extends C2566a {
    public final ClientCountryResponse m13019a(Context context) {
        return (ClientCountryResponse) send(C2567b.m7018a().m7022a(context).getCountry());
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13019a(context);
    }
}
