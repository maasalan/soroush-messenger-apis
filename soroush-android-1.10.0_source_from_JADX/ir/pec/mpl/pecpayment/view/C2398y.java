package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import ir.pec.mpl.pecpayment.C2338R;

class C2398y implements OnClickListener {
    final /* synthetic */ Dialog f7948a;
    final /* synthetic */ C5740v f7949b;

    C2398y(C5740v c5740v, Dialog dialog) {
        this.f7949b = c5740v;
        this.f7948a = dialog;
    }

    public void onClick(View view) {
        this.f7949b.m12854a(this.f7949b.f15754g, (LinearLayout) this.f7948a.findViewById(C2338R.id.sharing_layout));
    }
}
