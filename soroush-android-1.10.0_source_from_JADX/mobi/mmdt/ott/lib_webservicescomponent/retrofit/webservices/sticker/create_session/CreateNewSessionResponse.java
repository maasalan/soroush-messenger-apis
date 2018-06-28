package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CreateNewSessionResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "SessionKey")
    private String mSessionKey;

    public CreateNewSessionResponse(int i, String str, String str2) {
        super(i, str);
        this.mSessionKey = str2;
    }

    public String getSessionKey() {
        return this.mSessionKey;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CreateNewSessionResponse{mSessionKey='");
        stringBuilder.append(this.mSessionKey);
        stringBuilder.append('\'');
        stringBuilder.append(", resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
