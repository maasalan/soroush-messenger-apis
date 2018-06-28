package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class BaseResponse {
    @C1902a
    @C1904c(a = "ResultCode")
    protected int resultCode;
    @C1902a
    @C1904c(a = "ResultMessage")
    protected String resultMessage;

    public BaseResponse(int i, String str) {
        this.resultCode = i;
        this.resultMessage = str;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
