package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changegroupdata;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.GroupRequest;

public class ChangePrivateGroupDataRequest extends GroupRequest {
    @C1904c(a = "Description")
    private String description;
    @C1904c(a = "GroupAvatarThumbnailURL")
    private String groupAvatarThumbailURl;
    @C1904c(a = "GroupAvatarURL")
    private String groupAvatarURL;
    @C1904c(a = "GroupName")
    private String groupName;

    public ChangePrivateGroupDataRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str, str2);
        this.groupName = str3;
        this.groupAvatarURL = str4;
        this.groupAvatarThumbailURl = str5;
        this.description = str6;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupAvatarThumbailURl() {
        return this.groupAvatarThumbailURl;
    }

    public String getGroupAvatarURL() {
        return this.groupAvatarURL;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGroupAvatarThumbailURl(String str) {
        this.groupAvatarThumbailURl = str;
    }

    public void setGroupAvatarURL(String str) {
        this.groupAvatarURL = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }
}
