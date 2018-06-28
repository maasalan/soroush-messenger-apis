package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2343a;

class bg implements OnClickListener {
    final /* synthetic */ PaymentInitiator f7909a;

    bg(PaymentInitiator paymentInitiator) {
        this.f7909a = paymentInitiator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2343a.m6350a(PaymentInitiator.f15713c).m6362a(null, null, -1, true, 2334);
        PaymentInitiator.f15718p = false;
    }
}
