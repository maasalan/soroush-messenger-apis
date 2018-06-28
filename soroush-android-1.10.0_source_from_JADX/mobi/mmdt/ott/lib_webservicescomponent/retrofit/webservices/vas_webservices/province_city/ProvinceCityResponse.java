package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.province_city;

import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import org.json.JSONObject;

public class ProvinceCityResponse extends BaseResponse {
    private JSONObject data;

    public ProvinceCityResponse(int i, String str) {
        super(i, str);
    }

    public JSONObject getData() {
        return this.data;
    }

    public void setData(JSONObject jSONObject) {
        this.data = jSONObject;
    }
}
