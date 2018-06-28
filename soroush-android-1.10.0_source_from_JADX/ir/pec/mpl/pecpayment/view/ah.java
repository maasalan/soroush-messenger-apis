package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import ir.pec.mpl.pecpayment.C2338R;

class ah implements OnCheckedChangeListener {
    final /* synthetic */ C5740v f7863a;

    ah(C5740v c5740v) {
        this.f7863a = c5740v;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f7863a.f15768u.setText(C2338R.string.payment_btn);
            this.f7863a.f15768u.setBackgroundColor(Color.parseColor("#43A047"));
        }
    }
}
