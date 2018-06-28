package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5872a extends C2566a {
    private SalamRequest f16036a;

    public C5872a(String str, String str2, String str3) {
        this.f16036a = new SalamRequest(str, str3, str2);
    }

    public final SalamResponse m13077a(Context context) {
        return (SalamResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getSalam(this.f16036a), this.f16036a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13077a(context);
    }
}
