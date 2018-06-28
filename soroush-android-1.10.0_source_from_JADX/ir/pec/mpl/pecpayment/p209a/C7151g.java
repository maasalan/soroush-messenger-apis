package ir.pec.mpl.pecpayment.p209a;

import android.support.v4.p038g.C4813a;
import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0994p.C0993b;
import com.p067a.p070b.p071a.C6439h;
import ir.pec.mpl.pecpayment.p212b.p213a.C2369m;
import java.util.Map;
import org.json.JSONObject;

class C7151g extends C6439h {
    final /* synthetic */ C2369m f20472a;
    final /* synthetic */ C2343a f20473b;

    C7151g(C2343a c2343a, int i, String str, JSONObject jSONObject, C0993b c0993b, C0992a c0992a, C2369m c2369m) {
        this.f20473b = c2343a;
        this.f20472a = c2369m;
        super(i, str, jSONObject, c0993b, c0992a);
    }

    public String getBodyContentType() {
        return "application/json";
    }

    public Map<String, String> getHeaders() {
        Map<String, String> c4813a = new C4813a();
        c4813a.put("appVersion", "1.7");
        c4813a.put("Token", this.f20472a.m6517b());
        return c4813a;
    }
}
