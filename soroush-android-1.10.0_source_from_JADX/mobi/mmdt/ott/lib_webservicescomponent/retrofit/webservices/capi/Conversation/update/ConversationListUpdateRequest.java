package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversaionList;

public class ConversationListUpdateRequest extends RegisteredRequest {
    @C1904c(a = "Conversations")
    private List<ConversaionList> conversaions;
    @C1904c(a = "FromTimestamp")
    private Long fromTimeStamp;

    public ConversationListUpdateRequest(String str, Long l, List<ConversaionList> list) {
        super(str);
        this.fromTimeStamp = l;
        this.conversaions = list;
    }

    public List<ConversaionList> getConversaions() {
        return this.conversaions;
    }

    public Long getFromTimeStamp() {
        return this.fromTimeStamp;
    }

    public void setConversaions(List<ConversaionList> list) {
        this.conversaions = list;
    }

    public void setFromTimeStamp(Long l) {
        this.fromTimeStamp = l;
    }
}
