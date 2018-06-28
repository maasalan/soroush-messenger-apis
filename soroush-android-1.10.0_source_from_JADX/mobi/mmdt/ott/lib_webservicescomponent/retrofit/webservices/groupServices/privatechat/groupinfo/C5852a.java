package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5852a extends C2566a {
    private GroupInfoRequest f16014a;

    public C5852a(String str, String str2) {
        this.f16014a = new GroupInfoRequest(str, str2);
    }

    public final GroupInfoResponse m13057a(Context context) {
        return (GroupInfoResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getGroupInfo(this.f16014a), this.f16014a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13057a(context);
    }
}
