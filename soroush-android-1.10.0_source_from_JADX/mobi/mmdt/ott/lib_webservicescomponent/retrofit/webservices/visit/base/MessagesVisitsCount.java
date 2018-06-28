package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.base;

public class MessagesVisitsCount {
    private String mMessageID;
    private long mVisitCount;

    public MessagesVisitsCount(String str, long j) {
        this.mMessageID = str;
        this.mVisitCount = j;
    }

    public String getmMessageID() {
        return this.mMessageID;
    }

    public long getmVisitCount() {
        return this.mVisitCount;
    }
}
