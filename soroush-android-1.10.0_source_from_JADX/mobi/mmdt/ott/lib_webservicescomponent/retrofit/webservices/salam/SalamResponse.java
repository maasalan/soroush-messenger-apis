package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import java.util.Arrays;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.base.Servers;

public class SalamResponse extends BaseResponse {
    @C1902a
    private String authValue;
    @C1904c(a = "Servers")
    private Servers[] servers;
    @C1904c(a = "SinceLastConnection")
    private String sinceLastConnection;

    public SalamResponse(int i, String str) {
        super(i, str);
    }

    public String getAuthValue() {
        return this.authValue;
    }

    public Servers[] getServers() {
        return this.servers;
    }

    public String getSinceLastConnection() {
        return this.sinceLastConnection;
    }

    public void setAuthValue(String str) {
        this.authValue = str;
    }

    public void setServers(Servers[] serversArr) {
        this.servers = serversArr;
    }

    public void setSinceLastConnection(String str) {
        this.sinceLastConnection = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SalamResponse{resultCode=");
        stringBuilder.append(this.resultCode);
        stringBuilder.append(", resultMessage='");
        stringBuilder.append(this.resultMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", servers=");
        stringBuilder.append(Arrays.toString(this.servers));
        stringBuilder.append(", sinceLastConnection='");
        stringBuilder.append(this.sinceLastConnection);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
