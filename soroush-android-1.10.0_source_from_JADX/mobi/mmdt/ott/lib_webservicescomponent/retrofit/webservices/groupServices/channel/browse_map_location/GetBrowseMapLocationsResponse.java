package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelInfoLocation;

public class GetBrowseMapLocationsResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Locations")
    private ChannelInfoLocation[] channels;

    public GetBrowseMapLocationsResponse(int i, String str, ChannelInfoLocation[] channelInfoLocationArr) {
        super(i, str);
        this.channels = channelInfoLocationArr;
    }

    public ChannelInfoLocation[] getChannels() {
        return this.channels;
    }
}
