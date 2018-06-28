package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ArchiveRetrieveMode;

public class UserWindowArchiveRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "Count")
    private int count;
    @C1902a
    @C1904c(a = "MessageId")
    private String messageID;
    @C1902a
    @C1904c(a = "RetrieveMode")
    private ArchiveRetrieveMode mode;
    @C1902a
    @C1904c(a = "Timestamp")
    private long time;
    @C1902a
    @C1904c(a = "UserId")
    private String userId;

    UserWindowArchiveRequest(String str, String str2, int i, String str3, long j, ArchiveRetrieveMode archiveRetrieveMode) {
        super(str);
        this.userId = str2;
        this.count = i;
        this.messageID = str3;
        this.time = j;
        this.mode = archiveRetrieveMode;
    }

    public int getCount() {
        return this.count;
    }

    public String getMessageID() {
        return this.messageID;
    }

    public ArchiveRetrieveMode getMode() {
        return this.mode;
    }

    public long getTime() {
        return this.time;
    }

    public String getUserId() {
        return this.userId;
    }
}
