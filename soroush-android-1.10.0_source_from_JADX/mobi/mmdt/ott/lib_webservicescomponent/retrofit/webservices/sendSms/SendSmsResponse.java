package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class SendSmsResponse extends BaseResponse {
    public SendSmsResponse(int i, String str) {
        super(i, str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendSmsResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
