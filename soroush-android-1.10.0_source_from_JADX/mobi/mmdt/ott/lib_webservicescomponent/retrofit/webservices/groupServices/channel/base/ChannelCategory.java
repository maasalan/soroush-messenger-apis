package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;

public class ChannelCategory {
    @C1902a
    @C1904c(a = "BannerUrl")
    private String bannerURL;
    @C1902a
    @C1904c(a = "CategoryID")
    private String categoryID;
    @C1902a
    @C1904c(a = "CategoryName")
    private String categoryName;
    @C1902a
    @C1904c(a = "Description")
    private String descriptoin;
    @C1902a
    @C1904c(a = "ParentCategoryId")
    private String parentCategoryID;

    public ChannelCategory(String str, String str2, String str3, String str4, String str5) {
        this.categoryID = str;
        this.categoryName = str2;
        this.bannerURL = str3;
        this.descriptoin = str4;
        this.parentCategoryID = str5;
    }

    public String getBannerURL() {
        return this.bannerURL;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getDescriptoin() {
        return this.descriptoin;
    }

    public String getParentCategoryID() {
        return this.parentCategoryID;
    }
}
