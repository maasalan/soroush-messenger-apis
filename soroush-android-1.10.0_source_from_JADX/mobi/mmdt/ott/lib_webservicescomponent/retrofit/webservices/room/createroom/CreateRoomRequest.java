package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.room.createroom;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class CreateRoomRequest extends RegisteredRequest {
    @C1904c(a = "JID")
    private String JID;
    @C1904c(a = "AvatarURL")
    private String avatarURL;
    @C1904c(a = "Description")
    private String description;
    @C1904c(a = "Mode")
    private String mode;
    @C1904c(a = "Nickname")
    private String nickName;
    @C1904c(a = "Subject")
    private String subject;
    @C1904c(a = "ThumbnailURL")
    private String thumbnailURL;

    public CreateRoomRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super(str);
        this.JID = str2;
        this.nickName = str3;
        this.description = str4;
        this.subject = str5;
        this.avatarURL = str6;
        this.thumbnailURL = str7;
        this.mode = str8;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public String getDescription() {
        return this.description;
    }

    public String getJID() {
        return this.JID;
    }

    public String getMode() {
        return this.mode;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getThumbnailURL() {
        return this.thumbnailURL;
    }

    public void setAvatarURL(String str) {
        this.avatarURL = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setJID(String str) {
        this.JID = str;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setThumbnailURL(String str) {
        this.thumbnailURL = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CreateRoomRequest{JID='");
        stringBuilder.append(this.JID);
        stringBuilder.append('\'');
        stringBuilder.append(", nickName='");
        stringBuilder.append(this.nickName);
        stringBuilder.append('\'');
        stringBuilder.append(", description='");
        stringBuilder.append(this.description);
        stringBuilder.append('\'');
        stringBuilder.append(", subject='");
        stringBuilder.append(this.subject);
        stringBuilder.append('\'');
        stringBuilder.append(", avatarURL='");
        stringBuilder.append(this.avatarURL);
        stringBuilder.append('\'');
        stringBuilder.append(", thumbnailURL='");
        stringBuilder.append(this.thumbnailURL);
        stringBuilder.append('\'');
        stringBuilder.append(", mode='");
        stringBuilder.append(this.mode);
        stringBuilder.append('\'');
        stringBuilder.append(", requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", userName='");
        stringBuilder.append(this.userName);
        stringBuilder.append('\'');
        stringBuilder.append(", hashMethod='");
        stringBuilder.append(this.hashMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", authValue='");
        stringBuilder.append(this.authValue);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
