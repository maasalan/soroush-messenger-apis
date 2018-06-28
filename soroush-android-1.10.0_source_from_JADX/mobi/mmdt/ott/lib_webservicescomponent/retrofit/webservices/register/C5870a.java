package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register;

import android.content.Context;
import java.util.UUID;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.C2560a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p258a.C2559b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.C2564b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2562b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import org.json.JSONException;
import org.json.JSONObject;

public final class C5870a extends C2566a {
    private RegisterRequest registerRequest;

    public C5870a(Context context, String str, String str2) {
        this.registerRequest = new RegisterRequest(C2547a.m6986a(), str, C2562b.m7014b(C2556b.m6999b(context)), UUID.randomUUID().toString().substring(0, 19), String.valueOf(System.currentTimeMillis()), str2);
    }

    public final RegisterResponse m13075a(Context context) {
        RegisterResponse registerResponse = (RegisterResponse) C2567b.m7018a().m7022a(context).registerClient(this.registerRequest).mo2060a().f7590a;
        if (registerResponse.getResultCode() == 200) {
            C2560a.m7006a(context);
            C2560a.f8368a.edit().putString("ServerHashMethod", registerResponse.getHashMethod()).apply();
            C2560a.m7006a(context);
            C2560a.f8368a.edit().putString("ServerEncryptionMethod", registerResponse.getEncryptionMethod()).apply();
            try {
                JSONObject jSONObject = new JSONObject(C2564b.m7016a(this.registerRequest));
                jSONObject.put("ServerNonce", registerResponse.getServerNonce());
                jSONObject.put("ServerTimestamp", registerResponse.getServerTimestamp());
                registerResponse.setActivationData(jSONObject.toString());
                return registerResponse;
            } catch (JSONException e) {
                e.printStackTrace();
                return registerResponse;
            }
        }
        throw new C2559b(registerResponse.getResultCode());
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13075a(context);
    }
}
