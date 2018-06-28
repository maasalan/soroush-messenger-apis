package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class SearchChannelModel {
    @C1902a
    @C1904c(a = "Flags")
    private String[] flags;
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String mAvatarThumbnailURL;
    @C1902a
    @C1904c(a = "AvatarURL")
    private String mAvatarURL;
    @C1902a
    @C1904c(a = "ChannelID")
    private String mChannelID;
    @C1902a
    @C1904c(a = "Link")
    private String mChannelLink;
    @C1902a
    @C1904c(a = "CreationDate")
    private long mCreationDateInMilliSecond;
    @C1902a
    @C1904c(a = "Description")
    private String mDescription;
    @C1902a
    @C1904c(a = "Followed")
    private boolean mFollowed;
    @C1902a(a = false, b = false)
    private boolean mHavePayment;
    @C1902a(a = false, b = false)
    private boolean mIsOfficial;
    @C1902a
    @C1904c(a = "MembersCount")
    private int mMembersCount;
    @C1902a
    @C1904c(a = "MyRole")
    private Role mMyRole;
    @C1902a
    @C1904c(a = "Name")
    private String mName;

    public String getAvatarThumbnailURL() {
        return this.mAvatarThumbnailURL;
    }

    public String getAvatarURL() {
        return this.mAvatarURL;
    }

    public String getChannelID() {
        return this.mChannelID;
    }

    public String getChannelLink() {
        return this.mChannelLink;
    }

    public long getCreationDateInMilliSecond() {
        return this.mCreationDateInMilliSecond;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String[] getFlags() {
        return this.flags;
    }

    public int getMembersCount() {
        return this.mMembersCount;
    }

    public Role getMyRole() {
        return this.mMyRole;
    }

    public String getName() {
        return this.mName;
    }

    public boolean isFollowed() {
        return this.mFollowed;
    }

    public boolean isHavePayment() {
        for (String equals : this.flags) {
            if (equals.equals("HAVEPAYMENT")) {
                this.mHavePayment = true;
            }
        }
        return this.mHavePayment;
    }

    public boolean isOfficial() {
        for (String equals : this.flags) {
            if (equals.equals("OFFICIAL")) {
                this.mIsOfficial = true;
            }
        }
        return this.mIsOfficial;
    }
}
