package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5863a extends C2566a {
    private MemberInfoRequest f16027a;

    public C5863a(String str, String[] strArr) {
        this.f16027a = new MemberInfoRequest(str, strArr);
    }

    public final MemberInfoResponse m13068a(Context context) {
        return (MemberInfoResponse) registeredSend(context, C2567b.m7018a().m7022a(context).memberInfo(this.f16027a), this.f16027a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13068a(context);
    }
}
