package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.create_session;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class CreateNewSessionRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "DeviceId")
    private String deviceID;
    @C1902a
    @C1904c(a = "Language")
    private String language;
    @C1902a
    @C1904c(a = "Resolution")
    private String resolution;

    public CreateNewSessionRequest(String str, String str2, String str3, String[] strArr) {
        super(str);
        this.language = str2;
        this.deviceID = str3;
        this.resolution = getResolutions(strArr);
    }

    private String getResolutions(String[] strArr) {
        String str = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(",");
            stringBuilder.append(strArr[i]);
            str = stringBuilder.toString();
        }
        return str;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getResolution() {
        return this.resolution;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }
}
