package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendtoken;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class SendFCMTokenRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "RegistrationId")
    private String registrationID;

    public SendFCMTokenRequest(String str, String str2) {
        super(str);
        this.registrationID = str2;
    }

    public String getRegistrationID() {
        return this.registrationID;
    }

    public void setRegistrationID(String str) {
        this.registrationID = str;
    }
}
