package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;

class bc implements OnClickListener {
    final /* synthetic */ PaymentInitiator f7900a;

    bc(PaymentInitiator paymentInitiator) {
        this.f7900a = paymentInitiator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2355o.m6409a(PaymentInitiator.f15713c).m6423b(this.f7900a);
        Intent intent = new Intent();
        intent.putExtra("errorType", 201);
        intent.putExtra("state", 4);
        this.f7900a.setResult(4, intent);
        PaymentInitiator.f15719q = false;
        PaymentInitiator.f15718p = false;
        PaymentInitiator.f15712b = false;
        C2343a.m6352b(PaymentInitiator.f15713c);
        C2355o.m6412b(PaymentInitiator.f15713c);
        C2354h.m6389b(PaymentInitiator.f15713c);
        this.f7900a.finish();
    }
}
