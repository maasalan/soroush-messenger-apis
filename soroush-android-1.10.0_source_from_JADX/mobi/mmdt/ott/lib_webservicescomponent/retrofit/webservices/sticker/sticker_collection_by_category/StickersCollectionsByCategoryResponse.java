package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_collection_by_category;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerCollection;

public class StickersCollectionsByCategoryResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Count")
    private int mCount;
    @C1902a
    @C1904c(a = "Offset")
    private int mOffset;
    @C1902a
    @C1904c(a = "Packages")
    private StickerCollection[] mStickerCollections;

    public StickersCollectionsByCategoryResponse(int i, String str, int i2, int i3, StickerCollection[] stickerCollectionArr) {
        super(i, str);
        this.mCount = i2;
        this.mOffset = i3;
        this.mStickerCollections = stickerCollectionArr;
    }

    public int getmCount() {
        return this.mCount;
    }

    public int getmOffset() {
        return this.mOffset;
    }

    public StickerCollection[] getmStickerCollections() {
        return this.mStickerCollections;
    }
}
