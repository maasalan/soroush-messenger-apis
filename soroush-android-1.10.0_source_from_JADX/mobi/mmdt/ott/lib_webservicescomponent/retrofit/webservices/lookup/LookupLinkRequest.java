package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class LookupLinkRequest extends RegisteredRequest {
    @C1904c(a = "Key")
    private String key;

    public LookupLinkRequest(String str, String str2) {
        super(str);
        this.key = str2;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }
}
