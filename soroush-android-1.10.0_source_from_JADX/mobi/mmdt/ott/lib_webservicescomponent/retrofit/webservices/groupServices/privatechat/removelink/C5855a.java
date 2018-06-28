package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removelink;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5855a extends C2566a {
    RemovePrivateGroupLinkRequest f16017a;

    public C5855a(String str, String str2) {
        this.f16017a = new RemovePrivateGroupLinkRequest(str, str2);
    }

    public final RemovePrivateGroupLinkResponse m13060a(Context context) {
        return (RemovePrivateGroupLinkResponse) registeredSend(context, C2567b.m7018a().m7022a(context).removePrivateGroupLink(this.f16017a), this.f16017a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13060a(context);
    }
}
