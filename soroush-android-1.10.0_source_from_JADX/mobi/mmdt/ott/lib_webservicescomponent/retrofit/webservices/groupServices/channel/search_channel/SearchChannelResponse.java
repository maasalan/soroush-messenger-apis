package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base.SearchChannelModel;

public class SearchChannelResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Channels")
    private SearchChannelModel[] mSearchChannelModel;

    public SearchChannelResponse(int i, String str, SearchChannelModel[] searchChannelModelArr) {
        super(i, str);
        this.mSearchChannelModel = searchChannelModelArr;
    }

    public SearchChannelModel[] getSearchChannelModel() {
        return this.mSearchChannelModel;
    }

    public void setSearchChannelModel(SearchChannelModel[] searchChannelModelArr) {
        this.mSearchChannelModel = searchChannelModelArr;
    }
}
