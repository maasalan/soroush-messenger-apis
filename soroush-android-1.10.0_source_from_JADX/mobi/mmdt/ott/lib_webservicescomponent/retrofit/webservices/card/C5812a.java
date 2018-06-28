package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.card;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5812a extends C2566a {
    private GetUserChargeRequest f15975a;

    public C5812a(String str) {
        this.f15975a = new GetUserChargeRequest(str);
    }

    public final GetUserChargeResponse m13017a(Context context) {
        return (GetUserChargeResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getUserCharge(this.f15975a), this.f15975a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13017a(context);
    }
}
