package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelMemberRole;

public class CreateChannelRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String avatarThumbnailURL;
    @C1902a
    @C1904c(a = "AvatarURL")
    private String avatarurl;
    @C1902a
    @C1904c(a = "CategoryID")
    private String categoryid;
    @C1902a
    @C1904c(a = "Locations")
    private ChannelLocation[] channelLocations;
    @C1902a
    @C1904c(a = "ChannelID")
    private String channelid;
    @C1902a
    @C1904c(a = "Description")
    private String description;
    @C1902a
    @C1904c(a = "Members")
    private List<ChannelMemberRole> members;
    @C1902a
    @C1904c(a = "Name")
    private String name;
    @C1902a
    @C1904c(a = "ReplyAllowed")
    private int replyallowed;

    public CreateChannelRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, List<ChannelMemberRole> list, ChannelLocation[] channelLocationArr) {
        super(str);
        this.categoryid = str2;
        this.channelid = str3;
        this.name = str4;
        this.avatarurl = str5;
        this.avatarThumbnailURL = str6;
        this.description = str7;
        this.replyallowed = i;
        this.members = list;
        this.channelLocations = channelLocationArr;
    }

    public String getAvatarThumbnailURL() {
        return this.avatarThumbnailURL;
    }

    public String getAvatarurl() {
        return this.avatarurl;
    }

    public String getCategoryid() {
        return this.categoryid;
    }

    public ChannelLocation[] getChannelLocations() {
        return this.channelLocations;
    }

    public String getChannelid() {
        return this.channelid;
    }

    public String getDescription() {
        return this.description;
    }

    public List<ChannelMemberRole> getMembers() {
        return this.members;
    }

    public String getName() {
        return this.name;
    }

    public int getReplyallowed() {
        return this.replyallowed;
    }

    public void setAvatarThumbnailURL(String str) {
        this.avatarThumbnailURL = str;
    }

    public void setAvatarurl(String str) {
        this.avatarurl = str;
    }

    public void setCategoryid(String str) {
        this.categoryid = str;
    }

    public void setChannelLocations(ChannelLocation[] channelLocationArr) {
        this.channelLocations = channelLocationArr;
    }

    public void setChannelid(String str) {
        this.channelid = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMembers(List<ChannelMemberRole> list) {
        this.members = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReplyallowed(int i) {
        this.replyallowed = i;
    }
}
