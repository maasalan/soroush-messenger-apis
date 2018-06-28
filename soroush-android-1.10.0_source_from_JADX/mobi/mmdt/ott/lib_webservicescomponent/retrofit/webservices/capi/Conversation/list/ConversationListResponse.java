package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list;

import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversationResponse;

public class ConversationListResponse extends BaseResponse {
    @C1904c(a = "Conversations")
    private ArrayList<ConversationResponse> conversationList;
    @C1904c(a = "RequestTime")
    private String requestTime;

    public ConversationListResponse(int i, String str, String str2, ArrayList<ConversationResponse> arrayList) {
        super(i, str);
        this.requestTime = str2;
        this.conversationList = arrayList;
    }

    public ArrayList<ConversationResponse> getConversationList() {
        return this.conversationList;
    }

    public String getRequestTime() {
        return this.requestTime;
    }

    public void setConversations(ArrayList<ConversationResponse> arrayList) {
        this.conversationList = arrayList;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConversationListResponse{serverTimeStamp=");
        stringBuilder.append(this.requestTime);
        stringBuilder.append(", conversationList=");
        stringBuilder.append(this.conversationList);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
