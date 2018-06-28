package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update;

import android.content.Context;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversaionList;

public final class C5808a extends C2566a {
    private ConversationListUpdateRequest f15971a;

    public C5808a(String str, Long l, List<ConversaionList> list) {
        this.f15971a = new ConversationListUpdateRequest(str, l, list);
    }

    public final ConversationListUpdateResponse m13013a(Context context) {
        return (ConversationListUpdateResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getconversationListUpdate(this.f15971a), this.f15971a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13013a(context);
    }
}
