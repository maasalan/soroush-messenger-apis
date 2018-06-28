package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class StickerCollection {
    @C1902a
    @C1904c(a = "Downloads")
    private String mDownloads;
    @C1902a
    @C1904c(a = "ID")
    private String mID;
    @C1902a
    @C1904c(a = "Price")
    private String mPrice;
    @C1902a
    @C1904c(a = "Thumbnail")
    private String mThumbnail;
    @C1902a
    @C1904c(a = "Title")
    private String mTitle;

    public StickerCollection(String str, String str2, String str3, String str4, String str5) {
        this.mThumbnail = str3;
        this.mDownloads = str5;
        this.mTitle = str2;
        this.mPrice = str4;
        this.mID = str;
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

    public String getmThumbnail() {
        return this.mThumbnail;
    }

    public String getmTitle() {
        return this.mTitle;
    }
}
