package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class SendNewMessageToChannelRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "MessageBody")
    private String messageBody;
    @C1902a
    @C1904c(a = "MessageID")
    private String messageID;
    @C1902a
    @C1904c(a = "MessageParams")
    private HashMap messageParams;

    public SendNewMessageToChannelRequest(String str, String str2, String str3, String str4, HashMap hashMap) {
        super(str, str2);
        this.messageID = str3;
        this.messageBody = str4;
        this.messageParams = hashMap;
    }

    public String getMessageBody() {
        return this.messageBody;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public HashMap getMessageParams() {
        return this.messageParams;
    }

    public void setMessageBody(String str) {
        this.messageBody = str;
    }

    public void setMessageID(String str) {
        this.messageID = str;
    }

    public void setMessageParams(HashMap hashMap) {
        this.messageParams = hashMap;
    }
}
