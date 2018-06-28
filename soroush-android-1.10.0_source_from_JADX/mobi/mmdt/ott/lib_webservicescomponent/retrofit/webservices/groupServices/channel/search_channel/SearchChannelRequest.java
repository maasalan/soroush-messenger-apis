package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class SearchChannelRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "Name")
    private String queryName;

    public SearchChannelRequest(String str, String str2) {
        super(str);
        this.queryName = str2;
    }

    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String str) {
        this.queryName = str;
    }
}
