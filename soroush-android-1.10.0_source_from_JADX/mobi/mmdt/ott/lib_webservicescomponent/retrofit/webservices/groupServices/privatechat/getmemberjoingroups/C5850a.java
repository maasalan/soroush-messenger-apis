package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5850a extends C2566a {
    private GetMemberJoinGroupListRequest f16012a;

    public C5850a(String str) {
        this.f16012a = new GetMemberJoinGroupListRequest(str);
    }

    public final GetMemberJoinGroupListResponse m13055a(Context context) {
        return (GetMemberJoinGroupListResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getMemberJoinGroupsList(this.f16012a), this.f16012a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13055a(context);
    }
}
