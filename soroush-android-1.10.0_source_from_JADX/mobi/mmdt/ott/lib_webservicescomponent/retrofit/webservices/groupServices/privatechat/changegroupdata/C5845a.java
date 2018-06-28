package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changegroupdata;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5845a extends C2566a {
    private ChangePrivateGroupDataRequest f16007a;

    public C5845a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f16007a = new ChangePrivateGroupDataRequest(str, str2, str3, str4, str5, str6);
    }

    public final ChangePrivateGroupDataResponse m13050a(Context context) {
        return (ChangePrivateGroupDataResponse) registeredSend(context, C2567b.m7018a().m7022a(context).changePrivateGroupData(this.f16007a), this.f16007a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13050a(context);
    }
}
