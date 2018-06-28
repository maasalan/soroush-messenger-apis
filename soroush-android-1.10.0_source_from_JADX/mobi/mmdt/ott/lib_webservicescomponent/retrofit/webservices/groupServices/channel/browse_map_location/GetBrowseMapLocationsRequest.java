package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.RegisteredRequest;

public class GetBrowseMapLocationsRequest extends RegisteredRequest {
    @C1902a
    @C1904c(a = "Categories")
    private int[] categories;

    public GetBrowseMapLocationsRequest(String str, int[] iArr) {
        super(str);
        this.categories = iArr;
    }

    public int[] getCategories() {
        return this.categories;
    }

    public void setCategories(int[] iArr) {
        this.categories = iArr;
    }
}
