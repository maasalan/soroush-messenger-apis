package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendtoken;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5819a extends C2566a {
    private SendFCMTokenRequest f15981a;

    public C5819a(String str, String str2) {
        this.f15981a = new SendFCMTokenRequest(str, str2);
    }

    public final SendFCMTokenResponse m13024a(Context context) {
        return (SendFCMTokenResponse) registeredSend(context, C2567b.m7018a().m7022a(context).sendFCMToken(this.f15981a), this.f15981a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13024a(context);
    }
}
