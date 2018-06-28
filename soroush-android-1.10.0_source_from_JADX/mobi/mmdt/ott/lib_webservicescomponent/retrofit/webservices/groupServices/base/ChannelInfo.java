package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;

public class ChannelInfo {
    @C1902a
    @C1904c(a = "CategoryId")
    private int categoryId;
    @C1902a
    @C1904c(a = "ChannelID")
    private String channelID;
    @C1902a
    @C1904c(a = "Locations")
    private ChannelLocation[] channelLocation;
    @C1902a
    @C1904c(a = "Name")
    private String channelName;
    @C1902a
    @C1904c(a = "CreationDate")
    private long creationDate;
    @C1902a
    @C1904c(a = "Description")
    private String description;
    @C1902a
    @C1904c(a = "Flags")
    private ArrayList<String> flags;
    @C1902a
    @C1904c(a = "AvatarURL")
    private String groupAvatarURL;
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String groupThumbnailAvatarURL;
    @C1902a
    @C1904c(a = "Link")
    private String link;
    @C1902a
    @C1904c(a = "Public")
    private int mPublic;
    @C1902a
    @C1904c(a = "MembersCount")
    private int membersCount;
    @C1902a
    @C1904c(a = "MyRole")
    private Role myRole;
    @C1902a
    @C1904c(a = "OwnerUsername")
    private String ownerUsername;
    @C1902a
    @C1904c(a = "ReplyAllowed")
    private int replyAllow;

    public ChannelInfo(String str, String str2, Role role, String str3, String str4, String str5, long j, int i, int i2, int i3, String str6, int i4, ArrayList<String> arrayList, String str7, ChannelLocation[] channelLocationArr) {
        this.channelID = str;
        this.channelName = str2;
        this.myRole = role;
        this.groupAvatarURL = str3;
        this.groupThumbnailAvatarURL = str4;
        this.description = str5;
        this.creationDate = j;
        this.membersCount = i;
        this.replyAllow = i2;
        this.ownerUsername = str6;
        this.categoryId = i4;
        this.flags = arrayList;
        this.link = str7;
        this.channelLocation = channelLocationArr;
        this.mPublic = i3;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getChannelID() {
        return this.channelID;
    }

    public ChannelLocation[] getChannelLocation() {
        return this.channelLocation;
    }

    public String getChannelName() {
        return this.channelName;
    }

    public long getCreationDate() {
        return this.creationDate;
    }

    public String getDescription() {
        return this.description;
    }

    public ArrayList<String> getFlags() {
        return this.flags;
    }

    public String getGroupAvatarURL() {
        return this.groupAvatarURL;
    }

    public String getGroupThumbnailAvatarURL() {
        return this.groupThumbnailAvatarURL;
    }

    public String getLink() {
        return this.link;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public Role getMyRole() {
        return this.myRole;
    }

    public String getOwnerUsername() {
        return this.ownerUsername;
    }

    public int getReplyAllow() {
        return this.replyAllow;
    }

    public int getmPublic() {
        return this.mPublic;
    }

    public boolean isHavePayment() {
        return this.flags.contains("HAVEPAYMENT");
    }

    public boolean isOfficial() {
        return this.flags.contains("OFFICIAL");
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setChannelID(String str) {
        this.channelID = str;
    }

    public void setChannelLocation(ChannelLocation[] channelLocationArr) {
        this.channelLocation = channelLocationArr;
    }

    public void setChannelName(String str) {
        this.channelName = str;
    }

    public void setCreationDate(long j) {
        this.creationDate = j;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setFlags(ArrayList<String> arrayList) {
        this.flags = arrayList;
    }

    public void setGroupAvatarURL(String str) {
        this.groupAvatarURL = str;
    }

    public void setGroupThumbnailAvatarURL(String str) {
        this.groupThumbnailAvatarURL = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMembersCount(int i) {
        this.membersCount = i;
    }

    public void setMyRole(Role role) {
        this.myRole = role;
    }

    public void setOwnerUsername(String str) {
        this.ownerUsername = str;
    }

    public void setReplyAllow(int i) {
        this.replyAllow = i;
    }
}
