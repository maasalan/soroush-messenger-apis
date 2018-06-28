package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.getcategorychannelbyid;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetCategoryAndChannelsByCategoryIdRequest extends RegisteredRequest {
    @C1904c(a = "IgnoreMembershipData")
    private int ignoreMemberShipData;

    public GetCategoryAndChannelsByCategoryIdRequest(String str, int i) {
        super(str);
        this.ignoreMemberShipData = i;
    }

    public int getIgnoreMemberShipData() {
        return this.ignoreMemberShipData;
    }

    public void setIgnoreMemberShipData(int i) {
        this.ignoreMemberShipData = i;
    }
}
