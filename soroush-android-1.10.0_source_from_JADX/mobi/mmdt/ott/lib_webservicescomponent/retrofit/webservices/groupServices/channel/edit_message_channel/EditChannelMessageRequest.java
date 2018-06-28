package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.edit_message_channel;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class EditChannelMessageRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "MessageID")
    private String messageID;
    @C1902a
    @C1904c(a = "NewBody")
    private String newBody;

    public EditChannelMessageRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.messageID = str3;
        this.newBody = str4;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public String getNewBody() {
        return this.newBody;
    }

    public void setMessageID(String str) {
        this.messageID = str;
    }

    public void setNewBody(String str) {
        this.newBody = str;
    }
}
