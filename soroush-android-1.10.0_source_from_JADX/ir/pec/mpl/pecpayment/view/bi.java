package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2355o;

class bi implements OnClickListener {
    final /* synthetic */ PaymentInitiator f7914a;

    bi(PaymentInitiator paymentInitiator) {
        this.f7914a = paymentInitiator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2355o.m6409a(PaymentInitiator.f15713c).m6422a(null, null, -1, true, 2334);
        PaymentInitiator.f15718p = false;
        PaymentInitiator.f15719q = false;
    }
}
