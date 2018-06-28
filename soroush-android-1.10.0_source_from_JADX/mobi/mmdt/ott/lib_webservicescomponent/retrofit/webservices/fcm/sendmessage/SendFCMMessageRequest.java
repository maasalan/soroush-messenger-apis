package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendmessage;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMData;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMPriority;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.base.FCMType;

public class SendFCMMessageRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "MessagePriority")
    private FCMPriority messagePriority;
    @C1902a
    @C1904c(a = "MessageTTL")
    private long messageTTL;
    @C1902a
    @C1904c(a = "MessageType")
    private FCMType messageType;
    @C1902a
    @C1904c(a = "MessageData")
    private FCMData messsageData;
    @C1902a
    @C1904c(a = "ToUsername")
    private String toUserName;

    public SendFCMMessageRequest(String str, String str2, FCMType fCMType, FCMData fCMData, FCMPriority fCMPriority, long j) {
        super(str);
        this.toUserName = str2;
        this.messageType = fCMType;
        this.messsageData = fCMData;
        this.messagePriority = fCMPriority;
        this.messageTTL = j;
    }

    public FCMPriority getMessagePriority() {
        return this.messagePriority;
    }

    public long getMessageTTL() {
        return this.messageTTL;
    }

    public FCMType getMessageType() {
        return this.messageType;
    }

    public FCMData getMesssageData() {
        return this.messsageData;
    }

    public String getToUserName() {
        return this.toUserName;
    }

    public void setMessagePriority(FCMPriority fCMPriority) {
        this.messagePriority = fCMPriority;
    }

    public void setMessageTTL(long j) {
        this.messageTTL = j;
    }

    public void setMessageType(FCMType fCMType) {
        this.messageType = fCMType;
    }

    public void setMesssageData(FCMData fCMData) {
        this.messsageData = fCMData;
    }

    public void setToUserName(String str) {
        this.toUserName = str;
    }
}
