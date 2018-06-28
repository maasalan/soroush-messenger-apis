package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class ActivationResponse extends BaseResponse {
    @C1904c(a = "Iv")
    private String Iv;
    @C1904c(a = "EToken")
    private String eToken;
    @C1904c(a = "Username")
    private String userName;

    public ActivationResponse(int i, String str, String str2, String str3, String str4) {
        super(i, str);
        this.userName = str2;
        this.eToken = str3;
        this.Iv = str4;
    }

    public String getIv() {
        return this.Iv;
    }

    public String getUserName() {
        return this.userName;
    }

    public String geteToken() {
        return this.eToken;
    }

    public void setIv(String str) {
        this.Iv = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void seteToken(String str) {
        this.eToken = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ActivationResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", userName='");
        stringBuilder.append(this.userName);
        stringBuilder.append('\'');
        stringBuilder.append(", eToken='");
        stringBuilder.append(this.eToken);
        stringBuilder.append('\'');
        stringBuilder.append(", Iv='");
        stringBuilder.append(this.Iv);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
