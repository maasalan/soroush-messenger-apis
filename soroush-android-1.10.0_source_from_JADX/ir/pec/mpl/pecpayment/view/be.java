package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2354h;

class be implements OnClickListener {
    final /* synthetic */ PaymentInitiator f7904a;

    be(PaymentInitiator paymentInitiator) {
        this.f7904a = paymentInitiator;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C2354h.m6385a(PaymentInitiator.f15713c).m6400a(null, null, -1, true, 2334);
        PaymentInitiator.f15718p = false;
    }
}
