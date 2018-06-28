package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.ArrayList;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.Role;

public class GetChannelInfoResponse extends BaseResponse {
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

    public GetChannelInfoResponse(int i, String str, String str2, String str3, Role role, String str4, String str5, String str6, long j, int i2, int i3, int i4, String str7, int i5, ArrayList<String> arrayList, String str8, ChannelLocation[] channelLocationArr) {
        super(i, str);
        this.channelID = str2;
        this.channelName = str3;
        this.myRole = role;
        this.groupAvatarURL = str4;
        this.groupThumbnailAvatarURL = str5;
        this.description = str6;
        this.creationDate = j;
        this.membersCount = i2;
        this.replyAllow = i3;
        this.ownerUsername = str7;
        this.categoryId = i5;
        this.flags = arrayList;
        this.link = str8;
        this.channelLocation = channelLocationArr;
        this.mPublic = i4;
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
