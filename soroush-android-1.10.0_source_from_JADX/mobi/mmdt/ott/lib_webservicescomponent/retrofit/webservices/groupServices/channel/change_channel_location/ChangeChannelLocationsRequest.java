package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.change_channel_location;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.ChannelLocation;

public class ChangeChannelLocationsRequest extends ChannelRequest {
    @C1902a
    @C1904c(a = "Locations")
    private ChannelLocation[] channelLocations;

    public ChangeChannelLocationsRequest(String str, String str2, ChannelLocation[] channelLocationArr) {
        super(str, str2);
        this.channelLocations = channelLocationArr;
    }

    public ChannelLocation[] getChannelLocations() {
        return this.channelLocations;
    }

    public void setChannelLocations(ChannelLocation[] channelLocationArr) {
        this.channelLocations = channelLocationArr;
    }
}
