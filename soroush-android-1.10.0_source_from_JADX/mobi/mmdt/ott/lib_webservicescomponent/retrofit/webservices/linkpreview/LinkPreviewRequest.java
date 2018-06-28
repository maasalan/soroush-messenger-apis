package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview;

import com.google.p164b.p165a.C1904c;

public class LinkPreviewRequest {
    @C1904c(a = "Url")
    private String url;

    public LinkPreviewRequest(String str) {
        this.url = str;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
