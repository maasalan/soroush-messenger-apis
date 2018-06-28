package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models;

import com.google.p164b.p165a.C1904c;

public class UnRegisterRequest {
    @C1904c(a = "PhoneNo")
    protected String phoneNo;
    @C1904c(a = "RequestId")
    protected String requestId;

    public UnRegisterRequest(String str, String str2) {
        this.requestId = str;
        this.phoneNo = str2;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setPhoneNo(String str) {
        this.phoneNo = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnRegisterRequest{requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNo='");
        stringBuilder.append(this.phoneNo);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
