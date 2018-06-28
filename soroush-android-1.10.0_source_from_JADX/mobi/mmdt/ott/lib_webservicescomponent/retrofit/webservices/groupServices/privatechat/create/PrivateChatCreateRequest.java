package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.create;

import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.AddMemberModel;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.GroupRequest;

public class PrivateChatCreateRequest extends GroupRequest {
    @C1904c(a = "Description")
    private String description;
    @C1904c(a = "GroupAvatarThumbnailURL")
    private String groupAvatarThumbnailUrl;
    @C1904c(a = "GroupAvatarURL")
    private String groupAvatarUrl;
    @C1904c(a = "GroupName")
    private String groupName;
    @C1904c(a = "Members")
    List<AddMemberModel> memberList;

    public PrivateChatCreateRequest(String str, String str2, String str3, String str4, String str5, String str6, List<AddMemberModel> list) {
        super(str, str2);
        this.groupName = str3;
        this.groupAvatarUrl = str4;
        this.groupAvatarThumbnailUrl = str5;
        this.description = str6;
        this.memberList = list;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupAvatarThumbnailUrl() {
        return this.groupAvatarThumbnailUrl;
    }

    public String getGroupAvatarUrl() {
        return this.groupAvatarUrl;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public List<AddMemberModel> getMemberList() {
        return this.memberList;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setGroupAvatarThumbnailUrl(String str) {
        this.groupAvatarThumbnailUrl = str;
    }

    public void setGroupAvatarUrl(String str) {
        this.groupAvatarUrl = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setMemberList(List<AddMemberModel> list) {
        this.memberList = list;
    }
}
