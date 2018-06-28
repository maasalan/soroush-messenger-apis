package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5873a extends C2566a {
    private SendSmsRequest f16037a;

    public C5873a(String str) {
        this.f16037a = new SendSmsRequest(C2547a.m6986a(), str);
    }

    public final SendSmsResponse m13078a(Context context) {
        return (SendSmsResponse) send(C2567b.m7018a().m7022a(context).sendSMS(this.f16037a));
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13078a(context);
    }
}
