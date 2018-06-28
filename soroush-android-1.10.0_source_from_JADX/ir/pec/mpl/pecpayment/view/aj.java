package ir.pec.mpl.pecpayment.view;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import ir.pec.mpl.pecpayment.C2338R;

class aj implements OnClickListener {
    final /* synthetic */ Dialog f7868a;
    final /* synthetic */ C5740v f7869b;

    aj(C5740v c5740v, Dialog dialog) {
        this.f7869b = c5740v;
        this.f7868a = dialog;
    }

    public void onClick(View view) {
        this.f7869b.m12854a(this.f7869b.f15754g, (LinearLayout) this.f7868a.findViewById(C2338R.id.sharing_layout));
    }
}
