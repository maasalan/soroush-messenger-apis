package ir.pec.mpl.pecpayment.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class as implements OnClickListener {
    final /* synthetic */ Intent f7884a;
    final /* synthetic */ aq f7885b;

    as(aq aqVar, Intent intent) {
        this.f7885b = aqVar;
        this.f7884a = intent;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7885b.f7882a.f15751a.startActivity(this.f7884a);
    }
}
