package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5888a extends C2566a {
    private GetMessageVisitRequest f16057a;

    public C5888a(String str, String[] strArr) {
        this.f16057a = new GetMessageVisitRequest(str, strArr);
    }

    public final GetMessageVisitResponse m13093a(Context context) {
        return (GetMessageVisitResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getMessageVisit(this.f16057a), this.f16057a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13093a(context);
    }
}
