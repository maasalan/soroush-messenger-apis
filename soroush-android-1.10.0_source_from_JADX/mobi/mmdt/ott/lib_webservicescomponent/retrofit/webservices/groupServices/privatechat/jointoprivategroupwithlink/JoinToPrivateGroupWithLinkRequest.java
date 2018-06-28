package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.jointoprivategroupwithlink;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.GroupRequest;

public class JoinToPrivateGroupWithLinkRequest extends GroupRequest {
    @C1904c(a = "JoinToken")
    private String jonToken;

    public JoinToPrivateGroupWithLinkRequest(String str, String str2, String str3) {
        super(str, str2);
        this.jonToken = str3;
    }

    public String getJonToken() {
        return this.jonToken;
    }

    public void setJonToken(String str) {
        this.jonToken = str;
    }
}
