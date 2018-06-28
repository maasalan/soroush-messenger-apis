package ir.pec.mpl.pecpayment.view;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p209a.C2354h;
import ir.pec.mpl.pecpayment.p209a.C2355o;

class az implements OnClickListener {
    final /* synthetic */ C5740v f7896a;

    az(C5740v c5740v) {
        this.f7896a = c5740v;
    }

    public void onClick(View view) {
        PaymentInitiator.f15712b = false;
        if (this.f7896a.f15763p) {
            C2343a.m6350a(this.f7896a.f15751a).m6361a(null, null, -1, true, 201, null);
            this.f7896a.f15763p = false;
            this.f7896a.f15747Q = false;
            Log.d("QQQQQQQQ", "in bill exit");
        } else if (this.f7896a.f15747Q) {
            Log.d("QQQQQQQQ", "in top up exit");
            C2355o.m6409a(this.f7896a.f15751a).m6421a(null, null, -1, true, 201, null);
            this.f7896a.f15747Q = false;
            this.f7896a.f15763p = false;
        } else {
            Log.d("QQQQQQQQ", "in pay exit");
            C2354h.m6385a(this.f7896a.f15751a).m6401a(null, null, -1, true, 201, null);
            this.f7896a.f15763p = false;
            this.f7896a.f15747Q = false;
        }
        C5740v.f15729c = false;
        C2355o.m6409a(this.f7896a.f15751a).m6414a(this.f7896a);
        C2354h.m6385a(this.f7896a.f15751a).m6404b(this.f7896a);
        C2343a.m6350a(this.f7896a.f15751a).m6364b(this.f7896a);
        this.f7896a.dismiss();
    }
}
