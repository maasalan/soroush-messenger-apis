package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.UnRegisterRequest;

public class SendSmsRequest extends UnRegisterRequest {
    public SendSmsRequest(String str, String str2) {
        super(str, str2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendSmsRequest{requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNo='");
        stringBuilder.append(this.phoneNo);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
