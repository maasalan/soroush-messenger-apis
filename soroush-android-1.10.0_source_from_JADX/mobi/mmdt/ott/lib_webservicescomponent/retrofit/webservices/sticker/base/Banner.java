package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sticker.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class Banner {
    @C1902a
    @C1904c(a = "BannerId")
    private String mBannerId;
    @C1902a
    @C1904c(a = "LocationUrl")
    private String mLocationUrl;
    @C1902a
    @C1904c(a = "ShowTime")
    private int mShowTime;

    public Banner(String str, String str2, int i) {
        this.mBannerId = str;
        this.mLocationUrl = str2;
        this.mShowTime = i;
    }

    public String getmBannerId() {
        return this.mBannerId;
    }

    public String getmLocationUrl() {
        return this.mLocationUrl;
    }

    public int getmShowTime() {
        return this.mShowTime;
    }
}
