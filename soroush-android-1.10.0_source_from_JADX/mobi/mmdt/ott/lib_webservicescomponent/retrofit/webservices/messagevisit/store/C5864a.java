package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5864a extends C2566a {
    private MessageVisitStoreRequest f16028a;

    public C5864a(String str, String[] strArr) {
        this.f16028a = new MessageVisitStoreRequest(str, strArr);
    }

    public final MessageVisitStoreResponse m13069a(Context context) {
        return (MessageVisitStoreResponse) registeredSend(context, C2567b.m7018a().m7022a(context).messageVisitSore(this.f16028a), this.f16028a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13069a(context);
    }
}
