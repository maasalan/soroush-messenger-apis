package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.base;

public class LookUpStickerPackageDataResponse extends BaseLookup {
    private String mAuthor;
    private String mDateAdded;
    private String mDescription;
    private String mDownloads;
    private String mID;
    private boolean mOfficialPackage;
    private String mPrice;
    private String mStickersThumbnail;
    private String mThumbnail;
    private String mTitle;
    private String mVersion;

    public LookUpStickerPackageDataResponse(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.mID = str;
        this.mTitle = str2;
        this.mDescription = str3;
        this.mOfficialPackage = z;
        this.mAuthor = str4;
        this.mPrice = str5;
        this.mThumbnail = str6;
        this.mStickersThumbnail = str7;
        this.mVersion = str8;
        this.mDownloads = str9;
        this.mDateAdded = str10;
    }

    public String getmAuthor() {
        return this.mAuthor;
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

    public String getmID() {
        return this.mID;
    }

    public String getmPrice() {
        return this.mPrice;
    }

    public String getmStickersThumbnail() {
        return this.mStickersThumbnail;
    }

    public String getmThumbnail() {
        return this.mThumbnail;
    }

    public String getmTitle() {
        return this.mTitle;
    }

    public String getmVersion() {
        return this.mVersion;
    }

    public boolean ismOfficialPackage() {
        return this.mOfficialPackage;
    }
}
