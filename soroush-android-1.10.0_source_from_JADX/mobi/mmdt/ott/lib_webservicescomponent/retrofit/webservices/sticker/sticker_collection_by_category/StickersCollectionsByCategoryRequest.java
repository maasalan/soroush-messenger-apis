package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerWithSessionRequest;

public class StickersCollectionsByCategoryRequest extends StickerWithSessionRequest {
    @C1902a
    @C1904c(a = "Count")
    private String count;
    @C1902a
    @C1904c(a = "Offset")
    private String offset;

    public StickersCollectionsByCategoryRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.count = str3;
        this.offset = str4;
    }

    public String getCount() {
        return this.count;
    }

    public String getOffset() {
        return this.offset;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setOffset(String str) {
        this.offset = str;
    }
}
