package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class ChannelRequest extends RegisteredRequest {
    @C1904c(a = "ChannelID")
    private String channelID;

    public ChannelRequest(String str, String str2) {
        super(str);
        this.channelID = str2;
    }
}
