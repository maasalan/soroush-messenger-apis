package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models;

import android.content.Context;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2564b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2562b;

public class RegisteredRequest {
    @C1904c(a = "AuthValue")
    protected String authValue;
    @C1904c(a = "HashMethod")
    protected String hashMethod;
    @C1904c(a = "RequestId")
    protected String requestId = C2547a.m6986a();
    @C1904c(a = "Username")
    protected String userName;

    public RegisteredRequest(String str) {
        this.userName = str;
        this.authValue = "";
    }

    public void createAuthValue(Context context) {
        String toJSON = toJSON();
        C2560a.m7006a(context);
        String b = C2560a.m7008b();
        String d = C2560a.m7010d();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(toJSON);
        stringBuilder.append(d);
        this.authValue = C2562b.m7013a(b, stringBuilder.toString());
    }

    public String getAuthValue() {
        return this.authValue;
    }

    public String getHashMethod() {
        return this.hashMethod;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAuthValue(String str) {
        this.authValue = str;
    }

    public void setHashMethod(String str) {
        this.hashMethod = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    protected String toJSON() {
        String a = C2564b.m7016a(this);
        C2480b.m6740d(a);
        return a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RegisteredRequest{requestId='");
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
