package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5862a extends C2566a {
    private LookupLinkRequest f16026a;

    public C5862a(String str, String str2) {
        this.f16026a = new LookupLinkRequest(str, str2);
    }

    public final LookupLinkResponse m13067a(Context context) {
        return (LookupLinkResponse) registeredSend(context, C2567b.m7018a().m7022a(context).lookupLink(this.f16026a), this.f16026a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13067a(context);
    }
}
