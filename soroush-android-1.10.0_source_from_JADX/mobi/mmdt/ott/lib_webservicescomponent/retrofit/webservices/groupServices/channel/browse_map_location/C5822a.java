package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public final class C5822a extends C2566a {
    private GetBrowseMapLocationsRequest f15984a;

    public C5822a(String str, int[] iArr) {
        this.f15984a = new GetBrowseMapLocationsRequest(str, iArr);
    }

    public final GetBrowseMapLocationsResponse m13027a(Context context) {
        return (GetBrowseMapLocationsResponse) registeredSend(context, C2567b.m7018a().m7022a(context).getBrowseMapLocations(this.f15984a), this.f15984a);
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13027a(context);
    }
}
