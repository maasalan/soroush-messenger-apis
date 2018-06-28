package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5877a extends C2566a {
    private CreateNewSessionRequest f16041a;

    public C5877a(String str, String str2, String str3, String[] strArr) {
        this.f16041a = new CreateNewSessionRequest(str, str2, str3, strArr);
    }

    public final CreateNewSessionResponse m13082a(Context context) {
        return (CreateNewSessionResponse) registeredSend(context, C2567b.m7018a().m7023b(context).createNewSession(this.f16041a), this.f16041a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13082a(context);
    }
}
