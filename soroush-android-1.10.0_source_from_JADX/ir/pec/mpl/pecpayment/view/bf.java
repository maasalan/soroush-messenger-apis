package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.p210a.C2340b;
import ir.pec.mpl.pecpayment.p209a.p211b.C2348e;
import ir.pec.mpl.pecpayment.p212b.p213a.C2363g;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;
import java.util.HashMap;

class bf implements OnClickListener {
    final /* synthetic */ C2371o f7905a;
    final /* synthetic */ int f7906b;
    final /* synthetic */ String f7907c;
    final /* synthetic */ PaymentInitiator f7908d;

    bf(PaymentInitiator paymentInitiator, C2371o c2371o, int i, String str) {
        this.f7908d = paymentInitiator;
        this.f7905a = c2371o;
        this.f7906b = i;
        this.f7907c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2363g c2363g = (C2363g) this.f7905a.m6527c();
        if (this.f7906b != 0) {
            Toast.makeText(PaymentInitiator.f15713c, this.f7907c, 0).show();
            return;
        }
        HashMap a = C2340b.m6342a(c2363g.m6459g());
        if (!PaymentInitiator.f15712b) {
            PaymentInitiator.f15712b = true;
            this.f7908d.f15722h = ((C2363g) this.f7905a.m6527c()).m6453d();
            this.f7908d.f15725k = ((C2363g) this.f7905a.m6527c()).m6451c();
            this.f7908d.m12801a(c2363g.m6461h(), c2363g.m6463i(), c2363g.m6465j(), (String) a.get("Exponent"), (String) a.get("Modulus"), c2363g.m6457f(), c2363g.m6449b(), c2363g.m6455e(), c2363g.m6446a());
            C2343a.m6350a(PaymentInitiator.f15713c).m6357a((C2348e) PaymentInitiator.f15713c);
            Editor edit = this.f7908d.getSharedPreferences(this.f7908d.f15727o, 0).edit();
            edit.putString("rooted", "yes");
            edit.apply();
        }
    }
}
