package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.leavegroup;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5854a extends C2566a {
    LeaveFromPrivateGroupRequest f16016a;

    public C5854a(String str, String str2) {
        this.f16016a = new LeaveFromPrivateGroupRequest(str, str2);
    }

    public final LeaveFromPrivateGroupResponse m13059a(Context context) {
        return (LeaveFromPrivateGroupResponse) registeredSend(context, C2567b.m7018a().m7022a(context).leaveFromPrivateGroup(this.f16016a), this.f16016a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13059a(context);
    }
}
