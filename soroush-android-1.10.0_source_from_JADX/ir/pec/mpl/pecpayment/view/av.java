package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import ir.pec.mpl.pecpayment.C2338R;

class av implements OnFocusChangeListener {
    final /* synthetic */ C5740v f7888a;

    av(C5740v c5740v) {
        this.f7888a = c5740v;
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            this.f7888a.f15769v.m6560a();
            this.f7888a.f15769v.m6562c();
            this.f7888a.getWindow().setSoftInputMode(2);
            this.f7888a.f15768u.setText(C2338R.string.payment_btn);
            this.f7888a.f15768u.setBackgroundColor(Color.parseColor("#43A047"));
            if (this.f7888a.f15746P != -1) {
                this.f7888a.f15770w.setText("");
                this.f7888a.f15746P = -1;
            }
            new Handler().postDelayed(new aw(this), 100);
        }
    }
}
