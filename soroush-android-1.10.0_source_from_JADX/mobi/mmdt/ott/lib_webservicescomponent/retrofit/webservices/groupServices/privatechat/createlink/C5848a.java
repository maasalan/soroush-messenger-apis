package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.createlink;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5848a extends C2566a {
    CreatePrivateGroupNewLinkRequest f16010a;

    public C5848a(String str, String str2) {
        this.f16010a = new CreatePrivateGroupNewLinkRequest(str, str2);
    }

    public final CreatePrivateGroupNewLinkResponse m13053a(Context context) {
        return (CreatePrivateGroupNewLinkResponse) registeredSend(context, C2567b.m7018a().m7022a(context).createNewPrivateGroupLink(this.f16010a), this.f16010a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13053a(context);
    }
}
