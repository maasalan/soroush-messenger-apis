package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class StickerCategory {
    @C1902a
    @C1904c(a = "Description")
    private String mDescription;
    @C1902a
    @C1904c(a = "ID")
    private String mID;
    @C1902a
    @C1904c(a = "Name")
    private String mName;
    @C1902a
    @C1904c(a = "Thumbnail")
    private String mThumbnailAddress;

    public StickerCategory(String str, String str2, String str3, String str4) {
        this.mID = str;
        this.mName = str2;
        this.mDescription = str3;
        this.mThumbnailAddress = str4;
    }

    public String getmDescription() {
        return this.mDescription;
    }

    public String getmID() {
        return this.mID;
    }

    public String getmName() {
        return this.mName;
    }

    public String getmThumbnailAddress() {
        return this.mThumbnailAddress;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StickerCategory{mID='");
        stringBuilder.append(this.mID);
        stringBuilder.append('\'');
        stringBuilder.append(", mName='");
        stringBuilder.append(this.mName);
        stringBuilder.append('\'');
        stringBuilder.append(", mDescription='");
        stringBuilder.append(this.mDescription);
        stringBuilder.append('\'');
        stringBuilder.append(", mThumbnailAddress='");
        stringBuilder.append(this.mThumbnailAddress);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
