package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.base.ChannelLocation;

public class ChannelInfoLocation {
    @C1902a(a = false, b = false)
    private ChannelLocation[] channelLocation;
    @C1902a
    @C1904c(a = "Name")
    private String channelName;
    @C1904c(a = "ID")
    private int id;
    @C1902a
    @C1904c(a = "Image")
    private String image;
    @C1904c(a = "Label")
    private String label;
    @C1904c(a = "Lat")
    private double latitude;
    @C1902a
    @C1904c(a = "Link")
    private String link;
    @C1904c(a = "Lon")
    private double longitude;
    @C1904c(a = "Category")
    private int parentCategory = -1;

    public ChannelLocation[] getChannelLocation() {
        ChannelLocation channelLocation = new ChannelLocation(this.id, this.latitude, this.longitude, this.label, this.parentCategory);
        return new ChannelLocation[]{channelLocation};
    }

    public String getChannelName() {
        return this.channelName;
    }

    public int getId() {
        return this.id;
    }

    public String getImage() {
        return this.image;
    }

    public String getLink() {
        return this.link;
    }
}
