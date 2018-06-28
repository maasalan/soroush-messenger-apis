package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.sticker_package_detail;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base.Stars;

public class StickerPackageDetailResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "Author")
    private String mAuthor;
    @C1902a
    @C1904c(a = "CategoryID")
    private String mCategoryId;
    @C1902a
    @C1904c(a = "DateAdded")
    private String mDateAdded;
    @C1902a
    @C1904c(a = "Description")
    private String mDescription;
    @C1902a
    @C1904c(a = "Downloads")
    private String mDownloads;
    @C1902a
    @C1904c(a = "ID")
    private String mId;
    @C1902a
    @C1904c(a = "Price")
    private String mPrice;
    @C1902a
    @C1904c(a = "Stars")
    private Stars mStars;
    @C1902a
    @C1904c(a = "StarMean")
    private String mStickerMean;
    @C1902a
    @C1904c(a = "StickersThumbnail")
    private String mStickerThumbnail;
    @C1902a
    @C1904c(a = "Thumbnail")
    private String mThumbnail;
    @C1902a
    @C1904c(a = "Title")
    private String mTitle;
    @C1902a
    @C1904c(a = "Version")
    private int mVersion;

    public StickerPackageDetailResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Stars stars, String str12, int i2) {
        super(i, str);
        this.mId = str2;
        this.mCategoryId = str3;
        this.mDateAdded = str4;
        this.mTitle = str5;
        this.mDescription = str6;
        this.mAuthor = str7;
        this.mPrice = str8;
        this.mThumbnail = str9;
        this.mStickerThumbnail = str10;
        this.mStickerMean = str11;
        this.mStars = stars;
        this.mDownloads = str12;
        this.mVersion = i2;
    }

    public String getmAuthor() {
        return this.mAuthor;
    }

    public String getmCategoryId() {
        return this.mCategoryId;
    }

    public String getmDateAdded() {
        return this.mDateAdded;
    }

    public String getmDescription() {
        return this.mDescription;
    }

    public String getmDownloads() {
        return this.mDownloads;
    }

    public String getmId() {
        return this.mId;
    }

    public String getmPrice() {
        return this.mPrice;
    }

    public Stars getmStars() {
        return this.mStars;
    }

    public String getmStickerMean() {
        return this.mStickerMean;
    }

    public String getmStickerThumbnail() {
        return this.mStickerThumbnail;
    }

    public String getmThumbnail() {
        return this.mThumbnail;
    }

    public String getmTitle() {
        return this.mTitle;
    }

    public int getmVersion() {
        return this.mVersion;
    }
}
