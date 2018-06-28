package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.province_city;

import android.content.Context;
import com.google.p164b.C1944k;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import org.json.JSONException;
import org.json.JSONObject;

public final class C5886a extends C2566a {
    private ProvinceCityRequest f16054a = new ProvinceCityRequest();
    private String f16055b;

    public C5886a(String str) {
        this.f16055b = str;
    }

    public final ProvinceCityResponse m13091a(Context context) {
        JSONObject jSONObject;
        int i;
        String string;
        ProvinceCityResponse provinceCityResponse;
        String str = "";
        try {
            jSONObject = new JSONObject(((C1944k) C2567b.m7018a().m7022a(context).getProvinceCity(this.f16055b).mo2060a().f7590a).toString());
        } catch (JSONException e) {
            JSONException e2;
            e2.printStackTrace();
            jSONObject = null;
        }
        try {
            i = jSONObject.getInt("ResultCode");
            try {
                string = jSONObject.getString("ResultMessage");
            } catch (JSONException e3) {
                e2 = e3;
                e2.printStackTrace();
                string = str;
                provinceCityResponse = new ProvinceCityResponse(i, string);
                if (provinceCityResponse.getResultCode() == 200) {
                    throw new C2559b(provinceCityResponse.getResultCode());
                }
                provinceCityResponse.setData(jSONObject);
                return provinceCityResponse;
            }
        } catch (JSONException e4) {
            JSONException jSONException = e4;
            i = 0;
            e2 = jSONException;
            e2.printStackTrace();
            string = str;
            provinceCityResponse = new ProvinceCityResponse(i, string);
            if (provinceCityResponse.getResultCode() == 200) {
                provinceCityResponse.setData(jSONObject);
                return provinceCityResponse;
            }
            throw new C2559b(provinceCityResponse.getResultCode());
        }
        provinceCityResponse = new ProvinceCityResponse(i, string);
        if (provinceCityResponse.getResultCode() == 200) {
            provinceCityResponse.setData(jSONObject);
            return provinceCityResponse;
        }
        throw new C2559b(provinceCityResponse.getResultCode());
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13091a(context);
    }
}
