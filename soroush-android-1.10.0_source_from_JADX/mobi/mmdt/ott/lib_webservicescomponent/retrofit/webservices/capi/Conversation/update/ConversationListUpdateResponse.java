package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversationResponse;

public class ConversationListUpdateResponse extends BaseResponse {
    @C1904c(a = "Conversations")
    private List<ConversationResponse> conversationList;
    @C1904c(a = "RequestTime")
    private String requestTime;

    public ConversationListUpdateResponse(int i, String str, String str2, List<ConversationResponse> list) {
        super(i, str);
        this.requestTime = str2;
        this.conversationList = list;
    }

    public List<ConversationResponse> getConversationList() {
        return this.conversationList;
    }

    public String getRequestTime() {
        return this.requestTime;
    }

    public void setConversationList(List<ConversationResponse> list) {
        this.conversationList = list;
    }
}
