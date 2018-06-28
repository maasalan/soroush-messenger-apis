package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class SendReportResponse extends BaseResponse {
    public SendReportResponse(int i, String str) {
        super(i, str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SendReportResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
