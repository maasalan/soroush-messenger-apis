package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import ir.pec.mpl.pecpayment.p209a.C2354h;

class ab implements OnClickListener {
    final /* synthetic */ Dialog f7842a;
    final /* synthetic */ String f7843b;
    final /* synthetic */ String f7844c;
    final /* synthetic */ int f7845d;
    final /* synthetic */ boolean f7846e;
    final /* synthetic */ int f7847f;
    final /* synthetic */ C5740v f7848g;

    ab(C5740v c5740v, Dialog dialog, String str, String str2, int i, boolean z, int i2) {
        this.f7848g = c5740v;
        this.f7842a = dialog;
        this.f7843b = str;
        this.f7844c = str2;
        this.f7845d = i;
        this.f7846e = z;
        this.f7847f = i2;
    }

    public void onClick(View view) {
        this.f7848g.dismiss();
        this.f7842a.dismiss();
        C2354h.m6385a(this.f7848g.f15751a).m6400a(this.f7843b, this.f7844c, this.f7845d, this.f7846e, this.f7847f);
        this.f7848g.f15764q = Integer.valueOf(0);
    }
}
