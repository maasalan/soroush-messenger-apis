package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import ir.pec.mpl.pecpayment.C2338R;

class at implements OnClickListener {
    final /* synthetic */ C5740v f7886a;

    at(C5740v c5740v) {
        this.f7886a = c5740v;
    }

    public void onClick(View view) {
        this.f7886a.f15769v.m6560a();
        this.f7886a.f15769v.m6562c();
        C5740v.f15729c = false;
        this.f7886a.getWindow().setSoftInputMode(2);
        this.f7886a.f15768u.setText(C2338R.string.payment_btn);
        this.f7886a.f15768u.setBackgroundColor(Color.parseColor("#43A047"));
        if (this.f7886a.f15746P != -1) {
            this.f7886a.f15770w.setText("");
            this.f7886a.f15746P = -1;
        }
        new Handler().postDelayed(new au(this), 100);
    }
}
