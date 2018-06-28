package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import ir.pec.mpl.pecpayment.p209a.C2355o;
import ir.pec.mpl.pecpayment.p209a.p210a.C2340b;
import ir.pec.mpl.pecpayment.p209a.p211b.C2349f;
import ir.pec.mpl.pecpayment.p212b.p213a.C2367k;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import java.util.HashMap;

class bh implements OnClickListener {
    final /* synthetic */ C2371o f7910a;
    final /* synthetic */ int f7911b;
    final /* synthetic */ String f7912c;
    final /* synthetic */ PaymentInitiator f7913d;

    bh(PaymentInitiator paymentInitiator, C2371o c2371o, int i, String str) {
        this.f7913d = paymentInitiator;
        this.f7910a = c2371o;
        this.f7911b = i;
        this.f7912c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2367k c2367k = (C2367k) this.f7910a.m6527c();
        if (this.f7911b != 0) {
            Toast.makeText(PaymentInitiator.f15713c, this.f7912c, 0).show();
            return;
        }
        HashMap a = C2340b.m6342a(c2367k.m6503g());
        if (!PaymentInitiator.f15712b) {
            PaymentInitiator.f15712b = true;
            this.f7913d.f15723i = ((C2367k) this.f7910a.m6527c()).m6497d();
            this.f7913d.f15724j = ((C2367k) this.f7910a.m6527c()).m6495c();
            this.f7913d.m12801a(c2367k.m6505h(), c2367k.m6507i(), c2367k.m6508j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2367k.m6501f(), c2367k.m6493b(), c2367k.m6499e(), c2367k.m6489a());
            C2355o.m6409a(PaymentInitiator.f15713c).m6423b((C2349f) PaymentInitiator.f15713c);
            Editor edit = this.f7913d.getSharedPreferences(this.f7913d.f15727o, 0).edit();
            edit.putString("rooted", "yes");
            edit.apply();
        }
    }
}
