package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.get_new_username;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5820a extends C2566a {
    private GetNewUserNameRequest f15982a;

    public C5820a(String str) {
        this.f15982a = new GetNewUserNameRequest(str);
    }

    public final GetNewUserNameResponse m13025a(Context context) {
        return (GetNewUserNameResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getNewUserName(this.f15982a), this.f15982a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13025a(context);
    }
}
