package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changechannelinfo;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;

public class ChangeChannelInformationRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "AvatarThumbnailURL")
    private String avatarThumbnailURL;
    @C1902a
    @C1904c(a = "AvatarURL")
    private String avatarURL;
    @C1902a
    @C1904c(a = "Link")
    private String channelLink;
    @C1902a
    @C1904c(a = "Description")
    private String description;
    @C1902a
    @C1904c(a = "Name")
    private String name;
    @C1902a
    @C1904c(a = "ReplyAllowed")
    private int replyAllow;

    public ChangeChannelInformationRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        super(str, str2);
        this.name = str3;
        this.avatarURL = str4;
        this.avatarThumbnailURL = str5;
        this.description = str6;
        this.replyAllow = i;
        this.channelLink = str7;
    }

    public String getAvatarThumbnailURL() {
        return this.avatarThumbnailURL;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public String getChannelLink() {
        return this.channelLink;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getReplyAllow() {
        return this.replyAllow;
    }

    public void setAvatarThumbnailURL(String str) {
        this.avatarThumbnailURL = str;
    }

    public void setAvatarURL(String str) {
        this.avatarURL = str;
    }

    public void setChannelLink(String str) {
        this.channelLink = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReplyAllow(int i) {
        this.replyAllow = i;
    }
}
