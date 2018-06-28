package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.HashMap;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.base.GetVisitMessagesData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.base.MessagesVisitsCount;

public class GetMessageVisitResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "MessagesData")
    private HashMap<String, GetVisitMessagesData> messageData;
    @C1902a
    @C1904c(a = "MessagesVisitCount")
    private HashMap<String, Long> messageVisitCount;

    public GetMessageVisitResponse(int i, String str, HashMap<String, Long> hashMap, HashMap<String, GetVisitMessagesData> hashMap2) {
        super(i, str);
        this.messageVisitCount = hashMap;
        this.messageData = hashMap2;
    }

    public GetVisitMessagesData[] getMessageData() {
        GetVisitMessagesData[] getVisitMessagesDataArr = new GetVisitMessagesData[this.messageData.size()];
        int i = 0;
        for (String str : this.messageData.keySet()) {
            getVisitMessagesDataArr[i] = (GetVisitMessagesData) this.messageData.get(str);
            int i2 = i + 1;
            getVisitMessagesDataArr[i].setmMessageId(str);
            i = i2;
        }
        return getVisitMessagesDataArr;
    }

    public HashMap<String, Integer> getMessageLikes() {
        HashMap<String, Integer> hashMap = new HashMap();
        for (String str : this.messageData.keySet()) {
            hashMap.put(str, Integer.valueOf(((GetVisitMessagesData) this.messageData.get(str)).getmLikeCount()));
        }
        return hashMap;
    }

    public MessagesVisitsCount[] getMessageVisitCount() {
        MessagesVisitsCount[] messagesVisitsCountArr = new MessagesVisitsCount[this.messageVisitCount.size()];
        int i = 0;
        for (String str : this.messageVisitCount.keySet()) {
            int i2 = i + 1;
            messagesVisitsCountArr[i] = new MessagesVisitsCount(str, ((Long) this.messageVisitCount.get(str)).longValue());
            i = i2;
        }
        return messagesVisitsCountArr;
    }
}
