package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation;

import android.content.Context;
import mobi.mmdt.ott.lib_webservicescomponent.p250a.p251a.C2547a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.p259b.p260a.C2562b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2566a;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.C2567b;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.base.data_models.BaseResponse;
import org.json.JSONObject;

public final class C5805a extends C2566a {
    private ActivationRequest f15968a;

    public C5805a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str3);
        stringBuilder.append(str4);
        stringBuilder.append(jSONObject.getString("ServerTimestamp"));
        stringBuilder.append(jSONObject.getString("ServerNonce"));
        this.f15968a = new ActivationRequest(C2547a.m6986a(), str3, C2562b.m7013a(str, stringBuilder.toString()), str, str2, true);
    }

    public final ActivationResponse m13010a(Context context) {
        return (ActivationResponse) send(C2567b.m7018a().m7022a(context).activation(this.f15968a));
    }

    public final /* synthetic */ BaseResponse sendRequest(Context context) {
        return m13010a(context);
    }
}
