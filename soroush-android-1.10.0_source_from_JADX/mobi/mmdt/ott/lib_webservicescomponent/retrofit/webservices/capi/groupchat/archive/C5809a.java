package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.archive;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5809a extends C2566a {
    private GroupChatArchiveRequest f15972a;

    public C5809a(String str, String str2, int i, String str3) {
        this.f15972a = new GroupChatArchiveRequest(str, str2, i, str3);
    }

    public final GroupChatArchiveResponse m13014a(Context context) {
        return (GroupChatArchiveResponse) registeredSend(context, C2567b.m7018a().m7022a(context).groupChatArchive(this.f15972a), this.f15972a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13014a(context);
    }
}
