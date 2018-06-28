package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removemember;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5856a extends C2566a {
    RemoveMemberFromGroupRequest f16018a;

    public C5856a(String str, String str2, String str3) {
        this.f16018a = new RemoveMemberFromGroupRequest(str, str2, str3);
    }

    public final RemoveMemberFromGroupResponse m13061a(Context context) {
        return (RemoveMemberFromGroupResponse) registeredSend(context, C2567b.m7018a().m7022a(context).removeMemberFromGroup(this.f16018a), this.f16018a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13061a(context);
    }
}
