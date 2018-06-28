package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.terminate;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5875a extends C2566a {
    private SessionTerminateRequest f16039a;

    public C5875a(String str, String str2) {
        this.f16039a = new SessionTerminateRequest(str, str2);
    }

    public final SessionTerminateResponse m13080a(Context context) {
        return (SessionTerminateResponse) registeredSend(context, C2567b.m7018a().m7022a(context).terminateSession(this.f16039a), this.f16039a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13080a(context);
    }
}
