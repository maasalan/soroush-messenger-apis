package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changerole;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public final class C5846a extends C2566a {
    private ChangeMemberRolePrivateGroupRequest f16008a;

    public C5846a(String str, String str2, String str3, Role role) {
        this.f16008a = new ChangeMemberRolePrivateGroupRequest(str, str2, str3, role);
    }

    public final ChangeMemberRolePrivateGroupResponse m13051a(Context context) {
        return (ChangeMemberRolePrivateGroupResponse) registeredSend(context, C2567b.m7018a().m7022a(context).changeRoleMemberFromPrivateGroup(this.f16008a), this.f16008a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13051a(context);
    }
}
