package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.InteractiveMessage;

public class GetChannelInteractiveMessageResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Messages")
    private ArrayList<InteractiveMessage> messages;
    @C1902a
    @C1904c(a = "MessagesCount")
    private int messagesCount;
    @C1902a
    @C1904c(a = "MoreMessagesExists")
    private int moreMessagesExists;

    public GetChannelInteractiveMessageResponse(int i, String str, int i2, int i3, ArrayList<InteractiveMessage> arrayList) {
        super(i, str);
        this.moreMessagesExists = i2;
        this.messagesCount = i3;
        this.messages = arrayList;
    }

    public ArrayList<InteractiveMessage> getMessages() {
        return this.messages;
    }

    public int getMessagesCount() {
        return this.messagesCount;
    }

    public int getMoreMessagesExists() {
        return this.moreMessagesExists;
    }

    public boolean isMoreMessagesExists() {
        return this.moreMessagesExists == 1;
    }

    public void setMessages(ArrayList<InteractiveMessage> arrayList) {
        this.messages = arrayList;
    }

    public void setMessagesCount(int i) {
        this.messagesCount = i;
    }
}
