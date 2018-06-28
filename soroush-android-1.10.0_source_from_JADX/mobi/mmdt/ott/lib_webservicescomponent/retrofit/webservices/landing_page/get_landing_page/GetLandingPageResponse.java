package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.List;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.base.LandingPageRow;

public class GetLandingPageResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "LandingPageId")
    private int landingPageId;
    @C1902a
    @C1904c(a = "Rows")
    private List<LandingPageRow> rows = null;

    public GetLandingPageResponse(int i, String str) {
        super(i, str);
    }

    public int getLandingPageId() {
        return this.landingPageId;
    }

    public String getResultMessage() {
        return this.resultMessage;
    }

    public List<LandingPageRow> getRows() {
        return this.rows;
    }

    public void setLandingPageId(int i) {
        this.landingPageId = i;
    }

    public void setResultMessage(String str) {
        this.resultMessage = str;
    }

    public void setRows(List<LandingPageRow> list) {
        this.rows = list;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GetLandingPageResponse{resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", rows=");
        stringBuilder.append(this.rows);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
