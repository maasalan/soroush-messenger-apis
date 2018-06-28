package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

import com.google.p164b.p165a.C1904c;

public class ConversaionList {
    @C1904c(a = "Id")
    private String conversationId;
    @C1904c(a = "LastSeen")
    private Long lastSeen;
    @C1904c(a = "Type")
    private ConversationType type;

    public ConversaionList(String str, ConversationType conversationType, Long l) {
        this.conversationId = str;
        this.type = conversationType;
        this.lastSeen = l;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public Long getLastSeen() {
        return this.lastSeen;
    }

    public ConversationType getType() {
        return this.type;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setLastSeen(Long l) {
        this.lastSeen = l;
    }

    public void setType(ConversationType conversationType) {
        this.type = conversationType;
    }
}
