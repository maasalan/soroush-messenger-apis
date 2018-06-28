package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;

public class WindowsGroupArchiveRequest extends RegisteredRequest {
    @C1904c(a = "RetrieveMode")
    private ArchiveRetrieveMode RetrieveMode;
    @C1904c(a = "Factor")
    private double factor;
    @C1904c(a = "GroupId")
    private String groupId;
    @C1904c(a = "MessageId")
    private String messageId;
    @C1904c(a = "Timestamp")
    private Long timeStamp;

    public WindowsGroupArchiveRequest(String str, String str2, ArchiveRetrieveMode archiveRetrieveMode, String str3, Long l, double d) {
        super(str);
        this.groupId = str2;
        this.RetrieveMode = archiveRetrieveMode;
        this.messageId = str3;
        this.timeStamp = l;
        this.factor = d;
    }

    public double getFactor() {
        return this.factor;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public ArchiveRetrieveMode getRetrieveMode() {
        return this.RetrieveMode;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public void setFactor(double d) {
        this.factor = d;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setRetrieveMode(ArchiveRetrieveMode archiveRetrieveMode) {
        this.RetrieveMode = archiveRetrieveMode;
    }

    public void setTimeStamp(Long l) {
        this.timeStamp = l;
    }
}
