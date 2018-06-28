package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.get_category_and_channels;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetCategoryAndChannelsRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "IgnoreMembershipData")
    private int ignoreMemberShipData;

    public GetCategoryAndChannelsRequest(String str, int i) {
        super(str);
        this.ignoreMemberShipData = i;
    }
}
