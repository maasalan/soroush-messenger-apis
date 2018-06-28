package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class StickerWithSessionRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "SessionKey")
    private String sessionKey;

    public StickerWithSessionRequest(String str, String str2) {
        super(str);
        this.sessionKey = str2;
    }

    public String getSessionKey() {
        return this.sessionKey;
    }

    public void setSessionKey(String str) {
        this.sessionKey = str;
    }
}
