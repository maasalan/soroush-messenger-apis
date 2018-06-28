package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_filter;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerWithSessionRequest;

public class GetStickersCollectionsByFilterRequest extends StickerWithSessionRequest {
    @C1902a
    @C1904c(a = "Count")
    private String count;
    @C1902a
    @C1904c(a = "Offset")
    private String offset;

    public GetStickersCollectionsByFilterRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.count = str3;
        this.offset = str4;
    }
}
