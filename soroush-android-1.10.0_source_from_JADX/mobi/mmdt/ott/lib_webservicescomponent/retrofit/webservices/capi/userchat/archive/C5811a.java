package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5811a extends C2566a {
    private UserChatArchiveRequest f15974a;

    public C5811a(String str, String str2, int i, String str3) {
        this.f15974a = new UserChatArchiveRequest(str, str2, i, str3);
    }

    public final UserChatArchiveResponse m13016a(Context context) {
        return (UserChatArchiveResponse) registeredSend(context, C2567b.m7018a().m7022a(context).UserMessageArchive(this.f15974a), this.f15974a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13016a(context);
    }
}
