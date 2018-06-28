package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_categories;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerCategory;

public class StickersCategoriesResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Count")
    private int mCuont;
    @C1902a
    @C1904c(a = "Categories")
    private StickerCategory[] mStrickerCategories;

    public StickersCategoriesResponse(int i, String str, int i2, StickerCategory[] stickerCategoryArr) {
        super(i, str);
        this.mCuont = i2;
        this.mStrickerCategories = stickerCategoryArr;
    }

    public int getmCuont() {
        return this.mCuont;
    }

    public StickerCategory[] getmStrickerCategories() {
        return this.mStrickerCategories;
    }
}
