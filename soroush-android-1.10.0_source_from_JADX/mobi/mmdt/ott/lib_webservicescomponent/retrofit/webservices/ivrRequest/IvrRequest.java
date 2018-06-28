package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.UnRegisterRequest;

public class IvrRequest extends UnRegisterRequest {
    public IvrRequest(String str, String str2) {
        super(str, str2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IvrRequest{requestId='");
        stringBuilder.append(this.requestId);
        stringBuilder.append('\'');
        stringBuilder.append(", phoneNo='");
        stringBuilder.append(this.phoneNo);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
