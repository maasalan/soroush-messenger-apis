package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_address;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerUrl;

public class StickerPackageAddressResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "PackageData")
    private StickerUrl mPackageData;
    @C1902a
    @C1904c(a = "PackageID")
    private String mPackageId;
    @C1902a
    @C1904c(a = "SessionKey")
    private String mSesstionKey;

    public StickerPackageAddressResponse(int i, String str, String str2, StickerUrl stickerUrl) {
        super(i, str);
        this.mPackageId = str2;
        this.mPackageData = stickerUrl;
    }

    public StickerUrl getmPackageData() {
        return this.mPackageData;
    }

    public String getmPackageId() {
        return this.mPackageId;
    }

    public String getmSesstionKey() {
        return this.mSesstionKey;
    }
}
