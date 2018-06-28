package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo;

import com.google.p164b.p165a.C1904c;
import java.util.Arrays;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class MemberInfoRequest extends RegisteredRequest {
    @C1904c(a = "ContactList")
    private String[] contactList;

    public MemberInfoRequest(String str, String[] strArr) {
        super(str);
        this.contactList = strArr;
    }

    public String[] getContactList() {
        return this.contactList;
    }

    public void setContactList(String[] strArr) {
        this.contactList = strArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MemberInfoRequest{contactList=");
        stringBuilder.append(Arrays.toString(this.contactList));
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
