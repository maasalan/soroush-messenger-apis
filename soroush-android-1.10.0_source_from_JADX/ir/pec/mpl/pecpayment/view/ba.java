package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;

class ba implements OnClickListener {
    final /* synthetic */ PaymentInitiator f7898a;

    ba(PaymentInitiator paymentInitiator) {
        this.f7898a = paymentInitiator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2354h.m6385a(PaymentInitiator.f15713c).m6408e();
        C2354h.m6385a(PaymentInitiator.f15713c).m6405b(this.f7898a);
        Intent intent = new Intent();
        intent.putExtra("errorType", 201);
        intent.putExtra("OrderID", PaymentInitiator.f15711a);
        intent.putExtra("state", 2);
        this.f7898a.setResult(2, intent);
        this.f7898a.f15721f = true;
        C2343a.m6352b(PaymentInitiator.f15713c);
        C2355o.m6412b(PaymentInitiator.f15713c);
        C2354h.m6389b(PaymentInitiator.f15713c);
        this.f7898a.finish();
    }
}
