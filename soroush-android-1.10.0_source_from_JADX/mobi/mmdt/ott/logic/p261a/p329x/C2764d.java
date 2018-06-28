package mobi.mmdt.ott.logic.p261a.p329x;

import android.app.Activity;
import android.content.Intent;
import ir.pec.mpl.pecpayment.view.PaymentInitiator;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import org.json.JSONObject;

public final class C2764d {
    public static void m7089a(Activity activity, JSONObject jSONObject) {
        Throwable e;
        Intent intent;
        String str = "";
        int i = 0;
        try {
            if (jSONObject.has("Token") && jSONObject.has("OrderId")) {
                String string = jSONObject.getString("Token");
                try {
                    i = jSONObject.getInt("OrderId");
                    str = string;
                } catch (Exception e2) {
                    e = e2;
                    str = string;
                    C2480b.m6737b("problem in parsian token", e);
                    intent = new Intent(activity, PaymentInitiator.class);
                    intent.putExtra("Type", "1");
                    intent.putExtra("Token", str);
                    intent.putExtra("OrderId", i);
                    activity.startActivityForResult(intent, 1);
                }
            }
        } catch (Exception e3) {
            e = e3;
            C2480b.m6737b("problem in parsian token", e);
            intent = new Intent(activity, PaymentInitiator.class);
            intent.putExtra("Type", "1");
            intent.putExtra("Token", str);
            intent.putExtra("OrderId", i);
            activity.startActivityForResult(intent, 1);
        }
        intent = new Intent(activity, PaymentInitiator.class);
        intent.putExtra("Type", "1");
        intent.putExtra("Token", str);
        intent.putExtra("OrderId", i);
        activity.startActivityForResult(intent, 1);
    }
}
