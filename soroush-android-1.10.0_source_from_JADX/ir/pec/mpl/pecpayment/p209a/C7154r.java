package ir.pec.mpl.pecpayment.p209a;

import android.support.v4.p038g.C4813a;
import com.p067a.p070b.C0994p.C0992a;
import com.p067a.p070b.C0994p.C0993b;
import com.p067a.p070b.p071a.C6439h;
import java.util.Map;
import org.json.JSONObject;

class C7154r extends C6439h {
    final /* synthetic */ C2355o f20476a;

    C7154r(C2355o c2355o, int i, String str, JSONObject jSONObject, C0993b c0993b, C0992a c0992a) {
        this.f20476a = c2355o;
        super(i, str, jSONObject, c0993b, c0992a);
    }

    public String getBodyContentType() {
        return "application/json";
    }

    public Map<String, String> getHeaders() {
        Map<String, String> c4813a = new C4813a();
        c4813a.put("appVersion", "1.7");
        return c4813a;
    }
}
