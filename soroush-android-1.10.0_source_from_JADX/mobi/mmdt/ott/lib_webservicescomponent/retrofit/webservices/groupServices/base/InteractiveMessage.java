package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;

public class InteractiveMessage {
    @C1902a
    @C1904c(a = "GI")
    private String interactiveId;
    @C1902a
    @C1904c(a = "M")
    private HashMap message;
    @C1902a
    @C1904c(a = "B")
    private String messageBody;
    @C1902a
    @C1904c(a = "I")
    private String messageId;
    @C1902a
    @C1904c(a = "S")
    private ChatMessageStatus messageStatus;
    @C1902a
    @C1904c(a = "F")
    private String senderId;

    public InteractiveMessage(String str, String str2, ChatMessageStatus chatMessageStatus, String str3, String str4, HashMap hashMap) {
        this.messageId = str;
        this.interactiveId = str2;
        this.messageStatus = chatMessageStatus;
        this.senderId = str3;
        this.messageBody = str4;
        this.message = hashMap;
    }

    public String getInteractiveId() {
        return this.interactiveId;
    }

    public HashMap getMessage() {
        return this.message;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public ChatMessageStatus getMessageStatus() {
        return this.messageStatus;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("InteractiveMessage{messageId='");
        stringBuilder.append(this.messageId);
        stringBuilder.append('\'');
        stringBuilder.append(", interactiveId='");
        stringBuilder.append(this.interactiveId);
        stringBuilder.append('\'');
        stringBuilder.append(", messageStatus=");
        stringBuilder.append(this.messageStatus);
        stringBuilder.append(", senderId='");
        stringBuilder.append(this.senderId);
        stringBuilder.append('\'');
        stringBuilder.append(", messageBody='");
        stringBuilder.append(this.messageBody);
        stringBuilder.append('\'');
        stringBuilder.append(", message='");
        stringBuilder.append(this.message);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
