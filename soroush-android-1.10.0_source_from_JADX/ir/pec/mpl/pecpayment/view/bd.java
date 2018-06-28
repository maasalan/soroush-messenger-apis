package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.p210a.C2340b;
import ir.pec.mpl.pecpayment.p209a.p211b.C2348e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2365i;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import java.util.HashMap;

class bd implements OnClickListener {
    final /* synthetic */ C2371o f7901a;
    final /* synthetic */ int f7902b;
    final /* synthetic */ PaymentInitiator f7903c;

    bd(PaymentInitiator paymentInitiator, C2371o c2371o, int i) {
        this.f7903c = paymentInitiator;
        this.f7901a = c2371o;
        this.f7902b = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2365i c2365i = (C2365i) this.f7901a.m6527c();
        if (this.f7902b != 0) {
            Toast.makeText(PaymentInitiator.f15713c, "خطایی رخ داده", 0).show();
            return;
        }
        HashMap a = C2340b.m6342a(c2365i.m6480f());
        if (!PaymentInitiator.f15712b) {
            PaymentInitiator.f15712b = true;
            this.f7903c.m12801a(c2365i.m6482g(), c2365i.m6484h(), c2365i.m6485i(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2365i.m6476d(), c2365i.m6474c(), c2365i.m6472b(), c2365i.m6468a());
            C2354h.m6385a(PaymentInitiator.f15713c).m6405b((C2348e) PaymentInitiator.f15713c);
            Editor edit = this.f7903c.getSharedPreferences(this.f7903c.f15727o, 0).edit();
            edit.putString("rooted", "yes");
            edit.apply();
        }
    }
}
