package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.get_sticker_banner;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.Banner;

public class StickerBannersResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Banners")
    private Banner[] mBanners;

    public StickerBannersResponse(int i, String str, Banner[] bannerArr) {
        super(i, str);
        this.mBanners = bannerArr;
    }

    public Banner[] getmBanners() {
        return this.mBanners;
    }
}
