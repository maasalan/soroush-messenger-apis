package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class ChannelMember {
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String mAvatarThumbnailURL;
    @C1902a
    @C1904c(a = "Motto")
    private String mMotto;
    @C1902a
    @C1904c(a = "Nickname")
    private String mNickname;
    @C1902a
    @C1904c(a = "Role")
    private Role mRole;
    @C1902a
    @C1904c(a = "Username")
    private String mUsername;

    public ChannelMember(Role role, String str) {
        this.mRole = role;
        this.mUsername = str;
    }

    public ChannelMember(Role role, String str, String str2, String str3, String str4) {
        this.mRole = role;
        this.mUsername = str;
        this.mNickname = str2;
        this.mMotto = str3;
        this.mAvatarThumbnailURL = str4;
    }

    public String getmAvatarThumbnailURL() {
        return this.mAvatarThumbnailURL;
    }

    public String getmMotto() {
        return this.mMotto;
    }

    public String getmNickname() {
        return this.mNickname;
    }

    public Role getmRole() {
        return this.mRole;
    }

    public String getmUsername() {
        return this.mUsername;
    }
}
