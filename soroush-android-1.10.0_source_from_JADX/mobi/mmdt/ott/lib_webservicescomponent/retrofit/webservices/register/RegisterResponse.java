package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class RegisterResponse extends BaseResponse {
    private String activationData;
    @C1904c(a = "DeviceId")
    private String deviceId;
    @C1904c(a = "EncryptionMethod")
    private String encryptionMethod;
    @C1904c(a = "HashMethod")
    private String hashMethod;
    @C1904c(a = "PhoneNo")
    private String phoneNo;
    @C1904c(a = "ServerNonce")
    private String serverNonce;
    @C1904c(a = "ServerTimestamp")
    private String serverTimestamp;

    public RegisterResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(i, str);
        this.phoneNo = str2;
        this.deviceId = str3;
        this.serverNonce = str4;
        this.serverTimestamp = str5;
        this.hashMethod = str6;
        this.encryptionMethod = str7;
    }

    public String getActivationData() {
        return this.activationData;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    public String getHashMethod() {
        return this.hashMethod;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getServerNonce() {
        return this.serverNonce;
    }

    public String getServerTimestamp() {
        return this.serverTimestamp;
    }

    public void setActivationData(String str) {
        this.activationData = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setEncryptionMethod(String str) {
        this.encryptionMethod = str;
    }

    public void setHashMethod(String str) {
        this.hashMethod = str;
    }

    public void setPhoneNo(String str) {
        this.phoneNo = str;
    }

    public void setServerNonce(String str) {
        this.serverNonce = str;
    }

    public void setServerTimestamp(String str) {
        this.serverTimestamp = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RegisterResponse{phoneNo='");
        stringBuilder.append(this.phoneNo);
        stringBuilder.append('\'');
        stringBuilder.append(", deviceId='");
        stringBuilder.append(this.deviceId);
        stringBuilder.append('\'');
        stringBuilder.append(", serverNonce='");
        stringBuilder.append(this.serverNonce);
        stringBuilder.append('\'');
        stringBuilder.append(", serverTimestamp='");
        stringBuilder.append(this.serverTimestamp);
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
