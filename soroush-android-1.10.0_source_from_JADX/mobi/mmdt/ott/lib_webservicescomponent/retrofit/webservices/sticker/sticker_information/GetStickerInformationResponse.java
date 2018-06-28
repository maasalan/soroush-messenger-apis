package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_information;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.StickerUrl;

public class GetStickerInformationResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "FromUsername")
    private String mFromUserName;
    @C1902a
    @C1904c(a = "PackageStickerID")
    private String mPackageStickerId;
    @C1902a
    @C1904c(a = "Resolution")
    private String mResolution;
    @C1902a
    @C1904c(a = "StickerID")
    private String mStickerId;
    @C1902a
    @C1904c(a = "StickerURL")
    private StickerUrl mStickerUrl;
    @C1902a
    @C1904c(a = "StickerViewMultiplier")
    private int mStickerViewMultiplier;
    @C1902a
    @C1904c(a = "StickerVersion")
    private String mVersion;

    public GetStickerInformationResponse(int i, String str, String str2, String str3, String str4, String str5, StickerUrl stickerUrl, String str6, int i2) {
        super(i, str);
        this.mStickerId = str2;
        this.mPackageStickerId = str3;
        this.mFromUserName = str4;
        this.mVersion = str5;
        this.mStickerUrl = stickerUrl;
        this.mResolution = str6;
        this.mStickerViewMultiplier = i2;
    }

    public String getmFromUserName() {
        return this.mFromUserName;
    }

    public String getmPackageStickerId() {
        return this.mPackageStickerId;
    }

    public String getmResolution() {
        return this.mResolution;
    }

    public String getmStickerId() {
        return this.mStickerId;
    }

    public StickerUrl getmStickerUrl() {
        return this.mStickerUrl;
    }

    public int getmStickerViewMultiplier() {
        return this.mStickerViewMultiplier;
    }

    public String getmVersion() {
        return this.mVersion;
    }
}
