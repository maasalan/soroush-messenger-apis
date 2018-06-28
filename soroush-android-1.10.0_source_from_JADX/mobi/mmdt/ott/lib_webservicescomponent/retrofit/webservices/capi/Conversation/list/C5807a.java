package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5807a extends C2566a {
    private ConversationListRequest f15970a;

    public C5807a(String str) {
        this.f15970a = new ConversationListRequest(str);
    }

    public final ConversationListResponse m13012a(Context context) {
        return (ConversationListResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getconversationList(this.f15970a), this.f15970a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13012a(context);
    }
}
