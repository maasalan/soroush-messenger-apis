package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices;

import com.google.p164b.p165a.C1904c;

public class ResponseMember {
    public static final int VALUE_CAN_REPLAY = 1;
    public static final int VALUE_IS_OFFICIAL_USER = 1;
    @C1904c(a = "AvatarURL")
    private String avatarURL;
    @C1904c(a = "CanReply")
    private String canReply;
    private boolean isOfficialUser;
    @C1904c(a = "AvatarThumbnailURL")
    private String mAvatarThumbnailUrl;
    private boolean mCanReply;
    @C1904c(a = "LastActivity")
    private long mLastActivity;
    @C1904c(a = "MemberID")
    private String mMemberID;
    @C1904c(a = "PhoneNo")
    private String mPhoneNumber;
    @C1904c(a = "SoroushId")
    private String mSoroushId;
    @C1904c(a = "Username")
    private String mUsername;
    @C1904c(a = "Motto")
    private String motto;
    @C1904c(a = "Nickname")
    private String nickname;
    @C1904c(a = "OfficialUser")
    private String officialUsr;
    @C1904c(a = "Weight")
    private int weight;

    public ResponseMember(String str, int i, String str2, String str3, String str4, String str5, int i2, Long l, String str6) {
        this.mMemberID = str;
        boolean z = false;
        this.mCanReply = i == 1;
        this.avatarURL = str2;
        this.nickname = str4;
        this.motto = str5;
        this.mAvatarThumbnailUrl = str3;
        if (i2 == 1) {
            z = true;
        }
        this.isOfficialUser = z;
        this.mLastActivity = l.longValue();
        this.mSoroushId = str6;
    }

    public ResponseMember(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, Long l, String str8) {
        this.mMemberID = str3;
        boolean z = false;
        this.mCanReply = i == 1;
        this.avatarURL = str4;
        this.nickname = str6;
        this.motto = str7;
        this.mAvatarThumbnailUrl = str5;
        if (i2 == 1) {
            z = true;
        }
        this.isOfficialUser = z;
        this.mLastActivity = l.longValue();
        this.mUsername = str;
        this.mPhoneNumber = str2;
        this.mSoroushId = str8;
    }

    public ResponseMember(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, Long l, String str8, int i3) {
        this.mMemberID = str3;
        boolean z = false;
        this.mCanReply = i == 1;
        this.avatarURL = str4;
        this.nickname = str6;
        this.motto = str7;
        this.mAvatarThumbnailUrl = str5;
        if (i2 == 1) {
            z = true;
        }
        this.isOfficialUser = z;
        this.mLastActivity = l.longValue();
        this.mUsername = str;
        this.mPhoneNumber = str2;
        this.mSoroushId = str8;
        this.weight = i3;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public boolean getCanReply() {
        this.mCanReply = this.canReply.equals("1");
        return this.mCanReply;
    }

    public String getMemberID() {
        return this.mMemberID;
    }

    public String getMotto() {
        return this.motto;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getSoroushId() {
        return this.mSoroushId;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getmAvatarThumbnailUrl() {
        return this.mAvatarThumbnailUrl;
    }

    public Long getmLastActivity() {
        return Long.valueOf(this.mLastActivity);
    }

    public String getmPhoneNumber() {
        return this.mPhoneNumber;
    }

    public String getmUsername() {
        return this.mUsername;
    }

    public boolean isOfficialUser() {
        this.isOfficialUser = this.officialUsr.equals("1");
        return this.isOfficialUser;
    }
}
