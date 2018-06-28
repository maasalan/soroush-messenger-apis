package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.UnRegisterRequest;

public class ActivationRequest extends UnRegisterRequest {
    @C1904c(a = "EncryptionMethod")
    private String encryptionMethod;
    @C1904c(a = "HashMethod")
    private String hashMethod;
    @C1902a
    @C1904c(a = "RegistrationNotify")
    private String registrationnotify;
    @C1904c(a = "VerificationToken")
    private String verificationToken;

    public ActivationRequest(String str, String str2, String str3, String str4, String str5, boolean z) {
        super(str, str2);
        this.verificationToken = str3;
        this.hashMethod = str4;
        this.encryptionMethod = str5;
        this.registrationnotify = z ? "1" : "0";
    }

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    public String getHashMethod() {
        return this.hashMethod;
    }

    public String getRegistrationnotify() {
        return this.registrationnotify;
    }

    public String getVerificationToken() {
        return this.verificationToken;
    }

    public void setEncryptionMethod(String str) {
        this.encryptionMethod = str;
    }

    public void setHashMethod(String str) {
        this.hashMethod = str;
    }

    public void setRegistrationnotify(String str) {
        this.registrationnotify = str;
    }

    public void setVerificationToken(String str) {
        this.verificationToken = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActivationRequest{requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNo='");
        stringBuilder.append(this.phoneNo);
        stringBuilder.append('\'');
        stringBuilder.append(", verificationToken='");
        stringBuilder.append(this.verificationToken);
        stringBuilder.append('\'');
        stringBuilder.append(", hashMethod='");
        stringBuilder.append(this.hashMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", encryptionMethod='");
        stringBuilder.append(this.encryptionMethod);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
