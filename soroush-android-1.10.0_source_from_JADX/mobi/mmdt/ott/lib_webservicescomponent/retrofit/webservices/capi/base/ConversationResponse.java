package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class ConversationResponse {
    @C1902a
    @C1904c(a = "Id")
    private String conversationId;
    @C1902a
    @C1904c(a = "Type")
    private ConversationType conversationType;
    @C1902a
    @C1904c(a = "DraftMessage")
    private String draftMessage;
    @C1902a
    @C1904c(a = "DraftReplyMessageId")
    private String draftReplyMessageId;
    @C1902a
    @C1904c(a = "DraftUpdateTime")
    private String draftUpdateTime;
    @C1902a
    @C1904c(a = "LastClearTime")
    private String lastClearTime;
    @C1902a
    @C1904c(a = "LastMessage")
    private String lastMessage;
    @C1902a
    @C1904c(a = "LastMessageId")
    private String lastMessageId;
    @C1902a
    @C1904c(a = "LastMessageState")
    private String lastMessageState;
    @C1902a
    @C1904c(a = "LastMessageTime")
    private String lastMessageTime;
    @C1902a
    @C1904c(a = "LastSeen")
    private String lastSeen;
    @C1902a
    @C1904c(a = "LastUpdate")
    private String lastUpdate;
    @C1902a
    @C1904c(a = "Mute")
    private String mute;
    @C1902a
    @C1904c(a = "Pinned")
    private String pinned;
    @C1902a
    @C1904c(a = "RLastSeen")
    private String rLastSeen;
    @C1902a
    @C1904c(a = "UnreadCount")
    private String unreadCount;

    public String getConversationId() {
        return this.conversationId.split("@")[0];
    }

    public ConversationType getConversationType() {
        return this.conversationType;
    }

    public String getDraftMessage() {
        return this.draftMessage;
    }

    public String getDraftReplyMessageId() {
        return this.draftReplyMessageId;
    }

    public String getDraftUpdateTime() {
        return this.draftUpdateTime;
    }

    public long getLastClearTime() {
        return (this.lastClearTime == null || this.lastClearTime.length() <= 0) ? 0 : Long.parseLong(this.lastClearTime);
    }

    public String getLastMessage() {
        return this.lastMessage;
    }

    public String getLastMessageId() {
        return this.lastMessageId;
    }

    public int getLastMessageState() {
        return (this.lastMessageState == null || this.lastMessageState.length() <= 0) ? 0 : Integer.parseInt(this.lastMessageState);
    }

    public long getLastMessageTime() {
        return (this.lastClearTime == null || this.lastClearTime.length() <= 0) ? 0 : Long.parseLong(this.lastMessageTime);
    }

    public long getLastSeen() {
        return (this.lastSeen == null || this.lastSeen.length() <= 0) ? 0 : Long.parseLong(this.lastSeen);
    }

    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public int getMute() {
        return (this.mute == null || this.mute.length() <= 0) ? 0 : Integer.parseInt(this.mute);
    }

    public int getPinned() {
        return (this.pinned == null || this.pinned.length() <= 0) ? 0 : Integer.parseInt(this.pinned);
    }

    public int getUnreadCount() {
        return (this.unreadCount == null || this.unreadCount.length() <= 0) ? 0 : Integer.parseInt(this.unreadCount);
    }

    public long getrLastSeen() {
        return (this.rLastSeen == null || this.rLastSeen.length() <= 0) ? 0 : Long.parseLong(this.rLastSeen);
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationType(ConversationType conversationType) {
        this.conversationType = conversationType;
    }

    public void setDraftMessage(String str) {
        this.draftMessage = str;
    }

    public void setDraftReplyMessageId(String str) {
        this.draftReplyMessageId = str;
    }

    public void setDraftUpdateTime(String str) {
        this.draftUpdateTime = str;
    }

    public void setLastMessage(String str) {
        this.lastMessage = str;
    }

    public void setLastMessageId(String str) {
        this.lastMessageId = str;
    }

    public void setLastUpdate(String str) {
        this.lastUpdate = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConversationResponse{conversationId='");
        stringBuilder.append(this.conversationId);
        stringBuilder.append('\'');
        stringBuilder.append(", type='");
        stringBuilder.append(this.conversationType);
        stringBuilder.append('\'');
        stringBuilder.append(", draftMessage='");
        stringBuilder.append(this.draftMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", draftReplyMessageId='");
        stringBuilder.append(this.draftReplyMessageId);
        stringBuilder.append('\'');
        stringBuilder.append(", draftUpdateTime=");
        stringBuilder.append(this.draftUpdateTime);
        stringBuilder.append(", lastClearTime=");
        stringBuilder.append(this.lastClearTime);
        stringBuilder.append(", lastMessage='");
        stringBuilder.append(this.lastMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", lastMessageId='");
        stringBuilder.append(this.lastMessageId);
        stringBuilder.append('\'');
        stringBuilder.append(", lastMessageState=");
        stringBuilder.append(this.lastMessageState);
        stringBuilder.append(", lastMessageTime=");
        stringBuilder.append(this.lastMessageTime);
        stringBuilder.append(", lastSeen=");
        stringBuilder.append(this.lastSeen);
        stringBuilder.append(", rLastSeen=");
        stringBuilder.append(this.rLastSeen);
        stringBuilder.append(", mute=");
        stringBuilder.append(this.mute);
        stringBuilder.append(", pinned=");
        stringBuilder.append(this.pinned);
        stringBuilder.append(", unreadCount=");
        stringBuilder.append(this.unreadCount);
        stringBuilder.append(", lastUpdate=");
        stringBuilder.append(this.lastUpdate);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
