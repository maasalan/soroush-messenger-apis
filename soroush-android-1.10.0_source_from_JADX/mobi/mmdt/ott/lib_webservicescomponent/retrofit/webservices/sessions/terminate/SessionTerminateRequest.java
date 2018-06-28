package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.terminate;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class SessionTerminateRequest extends RegisteredRequest {
    @C1904c(a = "DeviceId")
    private String deviceId;

    public SessionTerminateRequest(String str, String str2) {
        super(str);
        this.deviceId = str2;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }
}
