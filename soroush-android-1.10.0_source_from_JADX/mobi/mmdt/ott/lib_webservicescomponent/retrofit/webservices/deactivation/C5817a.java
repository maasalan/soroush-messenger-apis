package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.deactivation;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5817a extends C2566a {
    private DeactivationRequest f15979a;

    public C5817a(String str) {
        this.f15979a = new DeactivationRequest(str);
    }

    public final DeactivationResponse m13022a(Context context) {
        return (DeactivationResponse) registeredSend(context, C2567b.m7018a().m7022a(context).deactivation(this.f15979a), this.f15979a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13022a(context);
    }
}
