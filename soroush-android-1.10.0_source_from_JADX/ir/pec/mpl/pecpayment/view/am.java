package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2355o;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;

class am implements OnClickListener {
    final /* synthetic */ Dialog f7872a;
    final /* synthetic */ C2371o f7873b;
    final /* synthetic */ String f7874c;
    final /* synthetic */ boolean f7875d;
    final /* synthetic */ int f7876e;
    final /* synthetic */ C5740v f7877f;

    am(C5740v c5740v, Dialog dialog, C2371o c2371o, String str, boolean z, int i) {
        this.f7877f = c5740v;
        this.f7872a = dialog;
        this.f7873b = c2371o;
        this.f7874c = str;
        this.f7875d = z;
        this.f7876e = i;
    }

    public void onClick(View view) {
        this.f7872a.dismiss();
        C2355o.m6409a(this.f7877f.f15751a).m6422a(this.f7873b.m6521a(), this.f7874c, this.f7873b.m6525b(), this.f7875d, this.f7876e);
        this.f7877f.f15764q = Integer.valueOf(0);
        this.f7877f.dismiss();
    }
}
