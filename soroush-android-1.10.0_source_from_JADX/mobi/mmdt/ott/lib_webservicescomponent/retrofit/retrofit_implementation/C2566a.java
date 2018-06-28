package mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import p207e.C2305b;
import p207e.C2314k;

public abstract class C2566a {
    protected <R extends BaseResponse, T extends RegisteredRequest> R registeredSend(Context context, C2305b<R> c2305b, T t) {
        C2560a.m7006a(context);
        t.setHashMethod(C2560a.m7008b());
        t.createAuthValue(context);
        C2314k a = c2305b.mo2060a();
        if (((BaseResponse) a.f7590a).getResultCode() == 200) {
            return (BaseResponse) a.f7590a;
        }
        throw new C2559b(((BaseResponse) a.f7590a).getResultCode());
    }

    protected <R extends BaseResponse> R send(C2305b<R> c2305b) {
        C2314k a = c2305b.mo2060a();
        if (((BaseResponse) a.f7590a).getResultCode() == 200) {
            return (BaseResponse) a.f7590a;
        }
        throw new C2559b(((BaseResponse) a.f7590a).getResultCode());
    }

    public abstract <T extends BaseResponse> T sendRequest(Context context);
}
