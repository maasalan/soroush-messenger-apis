package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import com.google.p164b.p165a.C1904c;

public class PrivateGroupInfo {
    @C1904c(a = "CreationDate")
    private long creationDate;
    @C1904c(a = "Description")
    private String description;
    @C1904c(a = "GroupAvatarURL")
    private String groupAvatarURL;
    @C1904c(a = "GroupJID")
    private String groupJID;
    @C1904c(a = "GroupName")
    private String groupName;
    @C1904c(a = "GroupAvatarThumbnailURL")
    private String groupThumbnailAvatarURL;
    @C1904c(a = "MembersCount")
    private int membersCount;
    @C1904c(a = "MyRole")
    private Role myRole;

    public PrivateGroupInfo(String str, String str2, Role role, String str3, String str4, String str5, long j, int i) {
        this.groupJID = str;
        this.groupName = str2;
        this.myRole = role;
        this.groupAvatarURL = str3;
        this.groupThumbnailAvatarURL = str4;
        this.description = str5;
        this.creationDate = j;
        this.membersCount = i;
    }

    public long getCreationDate() {
        return this.creationDate;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupAvatarURL() {
        return this.groupAvatarURL;
    }

    public String getGroupJID() {
        return this.groupJID;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getGroupThumbnailAvatarURL() {
        return this.groupThumbnailAvatarURL;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public Role getMyRole() {
        return this.myRole;
    }

    public void setCreationDate(long j) {
        this.creationDate = j;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGroupAvatarURL(String str) {
        this.groupAvatarURL = str;
    }

    public void setGroupJID(String str) {
        this.groupJID = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setGroupThumbnailAvatarURL(String str) {
        this.groupThumbnailAvatarURL = str;
    }

    public void setMembersCount(int i) {
        this.membersCount = i;
    }

    public void setMyRole(Role role) {
        this.myRole = role;
    }
}
