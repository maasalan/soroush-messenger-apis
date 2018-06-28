package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base;

public class LookUpUserDataResponse extends BaseLookup {
    private String mAvatarThumbnailURL;
    private String mAvatarURL;
    private String mMotto;
    private String mNickname;
    private boolean mOfficialUser;
    private String mUserId;
    private String mUserName;

    public LookUpUserDataResponse(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.mUserId = str;
        this.mUserName = str2;
        this.mNickname = str3;
        this.mAvatarURL = str4;
        this.mAvatarThumbnailURL = str5;
        this.mOfficialUser = z;
        this.mMotto = str6;
    }

    public String getmAvatarThumbnailURL() {
        return this.mAvatarThumbnailURL;
    }

    public String getmAvatarURL() {
        return this.mAvatarURL;
    }

    public String getmMotto() {
        return this.mMotto;
    }

    public String getmNickname() {
        return this.mNickname;
    }

    public String getmUserId() {
        return this.mUserId;
    }

    public String getmUserName() {
        return this.mUserName;
    }

    public boolean ismOfficialUser() {
        return this.mOfficialUser;
    }
}
