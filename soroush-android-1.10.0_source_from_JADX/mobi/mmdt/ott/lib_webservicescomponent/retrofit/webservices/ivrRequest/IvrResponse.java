package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class IvrResponse extends BaseResponse {
    public IvrResponse(int i, String str) {
        super(i, str);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IvrResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
