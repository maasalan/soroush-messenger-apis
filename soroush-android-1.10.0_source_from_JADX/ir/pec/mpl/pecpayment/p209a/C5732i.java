package ir.pec.mpl.pecpayment.p209a;

import android.util.Log;
import com.p067a.p070b.C0994p.C0993b;
import ir.pec.mpl.pecpayment.p212b.p213a.C2358b;
import ir.pec.mpl.pecpayment.p212b.p213a.C2365i;
import ir.pec.mpl.pecpayment.p212b.p213a.C2368l;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class C5732i implements C0993b<JSONObject> {
    final /* synthetic */ C2354h f15703a;

    C5732i(C2354h c2354h) {
        this.f15703a = c2354h;
    }

    public void m12792a(JSONObject jSONObject) {
        Log.d("*******************", "sad2222");
        C2371o c2371o = new C2371o();
        Object c2365i = new C2365i();
        try {
            c2371o.m6526b(jSONObject.getString("Message"));
            c2371o.m6524a((short) jSONObject.getInt("Status"));
            try {
                jSONObject = jSONObject.getJSONObject("Data");
                c2365i.m6483g(jSONObject.getString("MethodName"));
                c2365i.m6479e(jSONObject.getString("PublicTransKey"));
                c2365i.m6481f(jSONObject.getString("PaymentURL"));
                c2365i.m6470a(Boolean.valueOf(jSONObject.getBoolean("Force4Factor")));
                try {
                    this.f15703a.f7721i = jSONObject.getString("Nonce");
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f15703a.f7721i = "";
                }
                c2365i.m6469a(jSONObject.getInt("Amount"));
                this.f15703a.m6391a(c2365i.m6478e());
                c2365i.m6471a(jSONObject.getString("LogoURL"));
                C2368l.m6509a().m6511b(String.valueOf(jSONObject.getInt("Amount")));
                c2365i.m6473b(jSONObject.getString("EShopName"));
                C2354h.f7712j = jSONObject.getString("LogoURL");
                try {
                    JSONArray jSONArray = new JSONArray(jSONObject.getString("CardList"));
                    int length = !jSONArray.toString().equals("[]") ? jSONArray.length() : 0;
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        c2365i.m6477d(jSONObject2.getString("CardNumber"));
                        c2365i.m6475c(jSONObject2.getString("CardToken"));
                        C2358b c2358b = new C2358b();
                        c2358b.m6429a(jSONObject2.getString("CardNumber"));
                        c2358b.m6430b(jSONObject2.getString("CardToken"));
                        C2354h.f7711b.add(c2358b);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            c2371o.m6522a(c2365i);
            this.f15703a.m6399a(c2371o.m6528d(), c2371o.m6525b(), false, -1);
            this.f15703a.m6397a(c2371o, c2371o.m6528d(), c2371o.m6525b(), false, -1);
        } catch (Exception e22) {
            e22.printStackTrace();
        }
    }

    public /* synthetic */ void onResponse(Object obj) {
        m12792a((JSONObject) obj);
    }
}
