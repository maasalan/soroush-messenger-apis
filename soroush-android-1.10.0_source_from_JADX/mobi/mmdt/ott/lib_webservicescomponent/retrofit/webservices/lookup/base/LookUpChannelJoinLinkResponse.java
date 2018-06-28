package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base;

public class LookUpChannelJoinLinkResponse extends BaseLookup {
    private String mAvatarThumbnailURL;
    private String mAvatarURL;
    private String mCategoryId;
    private long mCreationDate;
    private String mDescription;
    private String mFlags;
    private String mID;
    private String mJoinToken;
    private String mLink;
    private int mMembersCount;
    private String mName;
    private String mOwnerUsername;
    private boolean mReplyAllowed;

    public LookUpChannelJoinLinkResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, long j, boolean z, String str7, String str8, String str9, String str10) {
        this.mID = str;
        this.mLink = str3;
        this.mName = str2;
        this.mDescription = str4;
        this.mAvatarURL = str5;
        this.mAvatarThumbnailURL = str6;
        this.mMembersCount = i;
        this.mCreationDate = j;
        this.mReplyAllowed = z;
        this.mOwnerUsername = str7;
        this.mCategoryId = str8;
        this.mFlags = str9;
        this.mJoinToken = str10;
    }

    public String getmAvatarThumbnailURL() {
        return this.mAvatarThumbnailURL;
    }

    public String getmAvatarURL() {
        return this.mAvatarURL;
    }

    public String getmCategoryId() {
        return this.mCategoryId;
    }

    public long getmCreationDate() {
        return this.mCreationDate;
    }

    public String getmDescription() {
        return this.mDescription;
    }

    public String getmFlags() {
        return this.mFlags;
    }

    public String getmID() {
        return this.mID;
    }

    public String getmJoinToken() {
        return this.mJoinToken;
    }

    public String getmLink() {
        return this.mLink;
    }

    public int getmMembersCount() {
        return this.mMembersCount;
    }

    public String getmName() {
        return this.mName;
    }

    public String getmOwnerUsername() {
        return this.mOwnerUsername;
    }

    public boolean ismReplyAllowed() {
        return this.mReplyAllowed;
    }
}
