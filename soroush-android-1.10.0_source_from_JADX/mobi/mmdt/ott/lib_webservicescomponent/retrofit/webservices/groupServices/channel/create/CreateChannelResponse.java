package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class CreateChannelResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "ChannelID")
    private String channelId;

    public CreateChannelResponse(int i, String str, String str2) {
        super(i, str);
        this.channelId = str2;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }
}
