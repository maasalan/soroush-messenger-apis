package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class ap implements OnClickListener {
    final /* synthetic */ Intent f7880a;
    final /* synthetic */ an f7881b;

    ap(an anVar, Intent intent) {
        this.f7881b = anVar;
        this.f7880a = intent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7881b.f7878a.f15751a.startActivity(this.f7880a);
    }
}
