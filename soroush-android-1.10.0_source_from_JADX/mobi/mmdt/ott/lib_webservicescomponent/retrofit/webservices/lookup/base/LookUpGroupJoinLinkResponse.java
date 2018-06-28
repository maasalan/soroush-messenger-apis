package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base;

public class LookUpGroupJoinLinkResponse extends BaseLookup {
    private String mAvatarThumbnailURL;
    private String mAvatarURL;
    private long mCreationDate;
    private String mDescription;
    private String mJID;
    private String mJoinToken;
    private int mMembersCount;
    private String mName;

    public LookUpGroupJoinLinkResponse(String str, String str2, String str3, String str4, String str5, int i, String str6, long j) {
        this.mJID = str;
        this.mName = str2;
        this.mDescription = str3;
        this.mAvatarURL = str4;
        this.mAvatarThumbnailURL = str5;
        this.mMembersCount = i;
        this.mJoinToken = str6;
        this.mCreationDate = j * 1000;
    }

    public String getmAvatarThumbnailURL() {
        return this.mAvatarThumbnailURL;
    }

    public String getmAvatarURL() {
        return this.mAvatarURL;
    }

    public long getmCreationDate() {
        return this.mCreationDate;
    }

    public String getmDescription() {
        return this.mDescription;
    }

    public String getmJID() {
        return this.mJID;
    }

    public String getmJoinToken() {
        return this.mJoinToken;
    }

    public int getmMembersCount() {
        return this.mMembersCount;
    }

    public String getmName() {
        return this.mName;
    }
}
