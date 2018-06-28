package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview;

import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class LinkPreviewResponse extends BaseResponse {
    @C1904c(a = "description")
    private String description;
    @C1904c(a = "image:height")
    private String imageHeight;
    @C1904c(a = "image:width")
    private String imageWith;
    @C1904c(a = "image")
    private String linkPreviewImage;
    @C1904c(a = "type")
    private String previewType;
    @C1904c(a = "site_name")
    private String siteName;
    @C1904c(a = "title")
    private String siteTitle;

    public LinkPreviewResponse(int i, String str) {
        super(i, str);
    }

    public String getDescription() {
        return this.description;
    }

    public String getImageHeight() {
        return this.imageHeight;
    }

    public String getImageWith() {
        return this.imageWith;
    }

    public String getLinkPreviewImage() {
        return this.linkPreviewImage;
    }

    public String getPreviewType() {
        return this.previewType;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getSiteTitle() {
        return this.siteTitle;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImageHeight(String str) {
        this.imageHeight = str;
    }

    public void setImageWith(String str) {
        this.imageWith = str;
    }

    public void setLinkPreviewImage(String str) {
        this.linkPreviewImage = str;
    }

    public void setPreviewType(String str) {
        this.previewType = str;
    }

    public void setSiteName(String str) {
        this.siteName = str;
    }

    public void setSiteTitle(String str) {
        this.siteTitle = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LinkPreviewResponse{siteName='");
        stringBuilder.append(this.siteName);
        stringBuilder.append('\'');
        stringBuilder.append(", description='");
        stringBuilder.append(this.description);
        stringBuilder.append('\'');
        stringBuilder.append(", siteTitle='");
        stringBuilder.append(this.siteTitle);
        stringBuilder.append('\'');
        stringBuilder.append(", previewType='");
        stringBuilder.append(this.previewType);
        stringBuilder.append('\'');
        stringBuilder.append(", linkPreviewImage='");
        stringBuilder.append(this.linkPreviewImage);
        stringBuilder.append('\'');
        stringBuilder.append(", imageWith='");
        stringBuilder.append(this.imageWith);
        stringBuilder.append('\'');
        stringBuilder.append(", imageHeight='");
        stringBuilder.append(this.imageHeight);
        stringBuilder.append('\'');
        stringBuilder.append(", resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
