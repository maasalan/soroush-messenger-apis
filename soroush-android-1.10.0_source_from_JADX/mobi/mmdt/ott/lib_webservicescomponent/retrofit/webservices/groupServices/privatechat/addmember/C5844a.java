package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.addmember;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;

public final class C5844a extends C2566a {
    private AddMemberToPrivateGroupRequest f16006a;

    public C5844a(String str, String str2, List<AddMemberModel> list) {
        this.f16006a = new AddMemberToPrivateGroupRequest(str, str2, list);
    }

    public final AddMemberToPrivateGroupResponse m13049a(Context context) {
        return (AddMemberToPrivateGroupResponse) registeredSend(context, C2567b.m7018a().m7022a(context).addMemberPrivateGroup(this.f16006a), this.f16006a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13049a(context);
    }
}
