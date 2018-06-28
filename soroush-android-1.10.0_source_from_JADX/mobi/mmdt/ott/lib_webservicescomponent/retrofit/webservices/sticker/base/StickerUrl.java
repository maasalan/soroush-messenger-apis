package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class StickerUrl {
    @C1902a
    @C1904c(a = "hdpi")
    private String mHdpi;
    @C1902a
    @C1904c(a = "ldpi")
    private String mLdpi;
    @C1902a
    @C1904c(a = "mdpi")
    private String mMdpi;
    @C1902a
    @C1904c(a = "xhdpi")
    private String mXhdpi;
    @C1902a
    @C1904c(a = "xxhdpi")
    private String mXxhdpi;
    @C1902a
    @C1904c(a = "xxxhdpi")
    private String mXxxhdpi;

    public StickerUrl(String str, String str2, String str3, String str4, String str5, String str6) {
        this.mHdpi = str3;
        this.mXhdpi = str4;
        this.mXxhdpi = str5;
        this.mLdpi = str;
        this.mMdpi = str2;
        this.mXxxhdpi = str6;
    }

    public String getmHdpi() {
        return this.mHdpi;
    }

    public String getmLdpi() {
        return this.mLdpi;
    }

    public String getmMdpi() {
        return this.mMdpi;
    }

    public String getmXhdpi() {
        return this.mXhdpi;
    }

    public String getmXxhdpi() {
        return this.mXxhdpi;
    }

    public String getmXxxhdpi() {
        return this.mXxxhdpi;
    }
}
