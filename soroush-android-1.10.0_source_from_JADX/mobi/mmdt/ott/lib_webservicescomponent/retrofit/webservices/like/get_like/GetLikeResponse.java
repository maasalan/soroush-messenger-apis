package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessagesLikeCount;

public class GetLikeResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "MessagesLikeCount")
    private HashMap<String, String> messagesLikeCount;

    public GetLikeResponse(int i, String str, HashMap<String, String> hashMap) {
        super(i, str);
        this.messagesLikeCount = hashMap;
    }

    public MessagesLikeCount[] getMessagesLikeCount() {
        MessagesLikeCount[] messagesLikeCountArr = new MessagesLikeCount[this.messagesLikeCount.size()];
        int i = 0;
        for (String str : this.messagesLikeCount.keySet()) {
            int i2 = i + 1;
            messagesLikeCountArr[i] = new MessagesLikeCount(str, Integer.parseInt((String) this.messagesLikeCount.get(str)));
            i = i2;
        }
        return messagesLikeCountArr;
    }
}
