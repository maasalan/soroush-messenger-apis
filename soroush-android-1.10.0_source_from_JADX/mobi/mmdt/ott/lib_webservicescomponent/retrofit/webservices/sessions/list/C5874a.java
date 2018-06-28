package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.list;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5874a extends C2566a {
    private SessionListRequest f16038a;

    public C5874a(String str) {
        this.f16038a = new SessionListRequest(str);
    }

    public final SessionListResponse m13079a(Context context) {
        return (SessionListResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getActiveSessionList(this.f16038a), this.f16038a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13079a(context);
    }
}
