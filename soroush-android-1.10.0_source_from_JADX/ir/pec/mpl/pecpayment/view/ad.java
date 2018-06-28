package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import ir.pec.mpl.pecpayment.C2338R;

class ad implements OnClickListener {
    final /* synthetic */ Dialog f7853a;
    final /* synthetic */ C5740v f7854b;

    ad(C5740v c5740v, Dialog dialog) {
        this.f7854b = c5740v;
        this.f7853a = dialog;
    }

    public void onClick(View view) {
        this.f7854b.m12854a(this.f7854b.f15754g, (LinearLayout) this.f7853a.findViewById(C2338R.id.sharing_layout));
    }
}
