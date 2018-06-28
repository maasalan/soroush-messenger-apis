package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class GroupInfoResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "CreationDate")
    private long creationdate;
    @C1902a
    @C1904c(a = "Description")
    private String description;
    @C1902a
    @C1904c(a = "GroupAvatarThumbnailURL")
    private String groupAvatarThumbnailURL;
    @C1902a
    @C1904c(a = "GroupAvatarURL")
    private String groupavatarurl;
    @C1902a
    @C1904c(a = "GroupJID")
    private String groupjid;
    @C1902a
    @C1904c(a = "GroupName")
    private String groupname;
    @C1902a
    @C1904c(a = "MembersCount")
    private int memberscount;
    @C1902a
    @C1904c(a = "MyRole")
    private Role myrole;

    public GroupInfoResponse(int i, String str, long j, int i2, String str2, String str3, String str4, Role role, String str5, String str6) {
        super(i, str);
        this.creationdate = j;
        this.memberscount = i2;
        this.description = str2;
        this.groupAvatarThumbnailURL = str3;
        this.groupavatarurl = str4;
        this.myrole = role;
        this.groupname = str5;
        this.groupjid = str6;
    }

    public long getCreationdate() {
        return this.creationdate;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupAvatarThumbnailURL() {
        return this.groupAvatarThumbnailURL;
    }

    public String getGroupavatarurl() {
        return this.groupavatarurl;
    }

    public String getGroupjid() {
        return this.groupjid;
    }

    public String getGroupname() {
        return this.groupname;
    }

    public int getMemberscount() {
        return this.memberscount;
    }

    public Role getMyrole() {
        return this.myrole;
    }

    public void setCreationdate(long j) {
        this.creationdate = j;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGroupAvatarThumbnailURL(String str) {
        this.groupAvatarThumbnailURL = str;
    }

    public void setGroupavatarurl(String str) {
        this.groupavatarurl = str;
    }

    public void setGroupjid(String str) {
        this.groupjid = str;
    }

    public void setGroupname(String str) {
        this.groupname = str;
    }

    public void setMemberscount(int i) {
        this.memberscount = i;
    }

    public void setMyrole(Role role) {
        this.myrole = role;
    }
}
