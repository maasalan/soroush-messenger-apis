package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.create;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;

public final class C5847a extends C2566a {
    private PrivateChatCreateRequest f16009a;

    public C5847a(String str, String str2, String str3, String str4, String str5, String str6, List<AddMemberModel> list) {
        this.f16009a = new PrivateChatCreateRequest(str, str2, str3, str4, str5, str6, list);
    }

    public final PrivateChatCreateResponse m13052a(Context context) {
        return (PrivateChatCreateResponse) registeredSend(context, C2567b.m7018a().m7022a(context).createPrivateGroup(this.f16009a), this.f16009a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13052a(context);
    }
}
