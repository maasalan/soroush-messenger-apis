package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

import com.google.p164b.p165a.C1904c;
import java.util.HashMap;

public class ChatResult {
    @C1904c(a = "MS")
    private int ChatMessageReceivedStatus;
    @C1904c(a = "S")
    private ChatMessageStatus chatMessageStatus;
    @C1904c(a = "M")
    private HashMap<String, String> componentMessage;
    @C1904c(a = "B")
    private String messageBody;
    @C1904c(a = "I")
    private String messageId;
    @C1904c(a = "F")
    private String senderId;

    public ChatResult(String str, ChatMessageStatus chatMessageStatus, String str2, String str3, HashMap<String, String> hashMap, int i) {
        this.messageId = str;
        this.chatMessageStatus = chatMessageStatus;
        this.senderId = str2;
        this.messageBody = str3;
        this.componentMessage = hashMap;
        this.ChatMessageReceivedStatus = i;
    }

    public ChatMessageReceiveStatus getChatMessageReceivedStatus() {
        return ChatMessageReceiveStatus.getValue(this.ChatMessageReceivedStatus);
    }

    public ChatMessageStatus getChatMessageStatus() {
        return this.chatMessageStatus;
    }

    public HashMap<String, String> getComponentMessage() {
        return this.componentMessage;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChatResult{messageId='");
        stringBuilder.append(this.messageId);
        stringBuilder.append('\'');
        stringBuilder.append(", chatMessageStatus=");
        stringBuilder.append(this.chatMessageStatus);
        stringBuilder.append(", senderId='");
        stringBuilder.append(this.senderId);
        stringBuilder.append('\'');
        stringBuilder.append(", messageBody='");
        stringBuilder.append(this.messageBody);
        stringBuilder.append('\'');
        stringBuilder.append(", componentMessage=");
        stringBuilder.append(this.componentMessage);
        stringBuilder.append(", ChatMessageReceivedStatus=");
        stringBuilder.append(this.ChatMessageReceivedStatus);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
