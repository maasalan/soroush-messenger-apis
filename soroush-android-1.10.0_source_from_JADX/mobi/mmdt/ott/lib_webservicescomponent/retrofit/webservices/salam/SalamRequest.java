package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class SalamRequest extends RegisteredRequest {
    @C1904c(a = "EncryptionMethod")
    private String encryptionMethod;
    @C1904c(a = "NetType")
    private String netType;

    public SalamRequest(String str, String str2, String str3) {
        super(str);
        this.netType = str2;
        this.encryptionMethod = str3;
    }

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    public String getNetType() {
        return this.netType;
    }

    public void setEncryptionMethod(String str) {
        this.encryptionMethod = str;
    }

    public void setNetType(String str) {
        this.netType = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SalamRequest{netType='");
        stringBuilder.append(this.netType);
        stringBuilder.append('\'');
        stringBuilder.append(", encryptionMethod='");
        stringBuilder.append(this.encryptionMethod);
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
