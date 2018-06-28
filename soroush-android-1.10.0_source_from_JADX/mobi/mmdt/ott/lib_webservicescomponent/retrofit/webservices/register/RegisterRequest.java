package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.UnRegisterRequest;

public class RegisterRequest extends UnRegisterRequest {
    @C1904c(a = "ClientNonce")
    private String clientNonce;
    @C1904c(a = "ClientTimestamp")
    private String clientTimestamp;
    @C1904c(a = "DeviceId")
    private String deviceID;
    @C1904c(a = "Language")
    private String language;

    public RegisterRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str, str2);
        this.deviceID = str3;
        this.clientNonce = str4;
        this.clientTimestamp = str5;
        this.language = str6;
    }

    public String getClientNonce() {
        return this.clientNonce;
    }

    public String getClientTimestamp() {
        return this.clientTimestamp;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setClientNonce(String str) {
        this.clientNonce = str;
    }

    public void setClientTimestamp(String str) {
        this.clientTimestamp = str;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }
}
