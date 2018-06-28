package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2343a;
import ir.pec.mpl.pecpayment.p212b.p213a.C2371o;

class ag implements OnClickListener {
    final /* synthetic */ Dialog f7857a;
    final /* synthetic */ C2371o f7858b;
    final /* synthetic */ String f7859c;
    final /* synthetic */ boolean f7860d;
    final /* synthetic */ int f7861e;
    final /* synthetic */ C5740v f7862f;

    ag(C5740v c5740v, Dialog dialog, C2371o c2371o, String str, boolean z, int i) {
        this.f7862f = c5740v;
        this.f7857a = dialog;
        this.f7858b = c2371o;
        this.f7859c = str;
        this.f7860d = z;
        this.f7861e = i;
    }

    public void onClick(View view) {
        this.f7857a.dismiss();
        C2343a.m6350a(this.f7862f.f15751a).m6362a(this.f7858b.m6521a(), this.f7859c, this.f7858b.m6525b(), this.f7860d, this.f7861e);
        this.f7862f.f15764q = Integer.valueOf(0);
        this.f7862f.dismiss();
    }
}
