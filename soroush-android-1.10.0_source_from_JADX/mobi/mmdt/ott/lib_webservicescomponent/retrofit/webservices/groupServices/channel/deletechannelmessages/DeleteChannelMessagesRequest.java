package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannelmessages;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class DeleteChannelMessagesRequest extends ChannelRequest {
    @C1904c(a = "MessagesID")
    private String messages;

    public DeleteChannelMessagesRequest(String str, String str2, String str3) {
        super(str, str2);
        this.messages = str3;
    }

    public String getMessages() {
        return this.messages;
    }

    public void setMessages(String str) {
        this.messages = str;
    }
}
