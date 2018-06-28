package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.jointoprivategroupwithlink;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5853a extends C2566a {
    private JoinToPrivateGroupWithLinkRequest f16015a;

    public C5853a(String str, String str2, String str3) {
        this.f16015a = new JoinToPrivateGroupWithLinkRequest(str, str2, str3);
    }

    public final JoinToPrivateGroupWithLinkResponse m13058a(Context context) {
        return (JoinToPrivateGroupWithLinkResponse) registeredSend(context, C2567b.m7018a().m7022a(context).joinToPrivateGroupWithLink(this.f16015a), this.f16015a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13058a(context);
    }
}
