package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.send;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike;

public class SendLikeRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "MessageLikes")
    private MessageLike[] messageLikes;

    public SendLikeRequest(String str, MessageLike[] messageLikeArr) {
        super(str);
        this.messageLikes = messageLikeArr;
    }

    public MessageLike[] getMessageLikes() {
        return this.messageLikes;
    }

    public void setMessageLikes(MessageLike[] messageLikeArr) {
        this.messageLikes = messageLikeArr;
    }
}
