package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public final class C5825a extends C2566a {
    private ChangeMemberRoleInChannelRequest f15987a;

    public C5825a(String str, String str2, String str3, Role role) {
        this.f15987a = new ChangeMemberRoleInChannelRequest(str, str2, str3, role);
    }

    public final ChangeMemberRoleInChannelResponse m13030a(Context context) {
        return (ChangeMemberRoleInChannelResponse) registeredSend(context, C2567b.m7018a().m7022a(context).changeMemberRoleInChannel(this.f15987a), this.f15987a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13030a(context);
    }
}
