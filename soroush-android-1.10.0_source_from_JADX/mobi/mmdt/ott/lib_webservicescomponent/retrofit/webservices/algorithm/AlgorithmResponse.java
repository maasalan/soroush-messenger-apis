package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.algorithm;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class AlgorithmResponse extends BaseResponse {
    @C1904c(a = "EncryptionMethod")
    private String encryptionMethod;
    @C1904c(a = "HashMethod")
    private String hashMethod;

    public AlgorithmResponse(int i, String str, String str2, String str3) {
        super(i, str);
        this.hashMethod = str2;
        this.encryptionMethod = str3;
    }

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    public String getHashMethod() {
        return this.hashMethod;
    }

    public void setEncryptionMethod(String str) {
        this.encryptionMethod = str;
    }

    public void setHashMethod(String str) {
        this.hashMethod = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AlgorithmResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", hashMethod='");
        stringBuilder.append(this.hashMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", encryptionMethod='");
        stringBuilder.append(this.encryptionMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
