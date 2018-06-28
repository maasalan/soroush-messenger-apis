package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.clientCountry;

import com.google.p164b.p165a.C1902a;
import com.google.p164b.p165a.C1904c;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;

public class ClientCountryResponse extends BaseResponse {
    @C1902a
    @C1904c(a = "CountryCode")
    private String countryCode;
    @C1902a
    @C1904c(a = "CountryPrefix")
    private String countryPrefix;

    public ClientCountryResponse(int i, String str, String str2, String str3) {
        super(i, str);
        this.countryCode = str2;
        this.countryPrefix = str3;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryPrefix() {
        return this.countryPrefix;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCountryPrefix(String str) {
        this.countryPrefix = str;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientCountryResponse{countryCode='");
        stringBuilder.append(this.countryCode);
        stringBuilder.append('\'');
        stringBuilder.append(", countryPrefix='");
        stringBuilder.append(this.countryPrefix);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
