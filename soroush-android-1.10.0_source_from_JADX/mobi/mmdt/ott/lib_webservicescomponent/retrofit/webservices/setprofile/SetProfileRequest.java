package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.setprofile;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class SetProfileRequest extends RegisteredRequest {
    @C1904c(a = "AvatarThumbnailURL")
    private String avatarThumbnailURL;
    @C1904c(a = "AvatarURL")
    private String avatarURL;
    @C1904c(a = "Motto")
    private String motto;
    @C1904c(a = "Nickname")
    private String nickName;
    @C1904c(a = "SoroushId")
    private String soroushId;

    public SetProfileRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.avatarURL = str2;
        this.avatarThumbnailURL = str3;
        this.nickName = str4;
        this.motto = str5;
        this.soroushId = str6;
    }

    public String getAvatarThumbnailURL() {
        return this.avatarThumbnailURL;
    }

    public String getAvatarURL() {
        return this.avatarURL;
    }

    public String getMotto() {
        return this.motto;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSoroushId() {
        return this.soroushId;
    }

    public void setAvatarThumbnailURL(String str) {
        this.avatarThumbnailURL = str;
    }

    public void setAvatarURL(String str) {
        this.avatarURL = str;
    }

    public void setMotto(String str) {
        this.motto = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSoroushId(String str) {
        this.soroushId = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SetProfileRequest{requestId='");
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
        stringBuilder.append(", avatarURL='");
        stringBuilder.append(this.avatarURL);
        stringBuilder.append('\'');
        stringBuilder.append(", avatarThumbnailURL='");
        stringBuilder.append(this.avatarThumbnailURL);
        stringBuilder.append('\'');
        stringBuilder.append(", nickName='");
        stringBuilder.append(this.nickName);
        stringBuilder.append('\'');
        stringBuilder.append(", motto='");
        stringBuilder.append(this.motto);
        stringBuilder.append('\'');
        stringBuilder.append(", soroushId='");
        stringBuilder.append(this.soroushId);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
