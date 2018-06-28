package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;

class C2390p implements OnClickListener {
    final /* synthetic */ KeyboardView f7937a;

    C2390p(KeyboardView keyboardView) {
        this.f7937a = keyboardView;
    }

    public void onClick(View view) {
        this.f7937a.f7830j.setVisibility(0);
        this.f7937a.f7822b.setHintTextColor(Color.parseColor("#616161"));
        this.f7937a.f7823c.setHintTextColor(Color.parseColor("#616161"));
        this.f7937a.f7825e.setHintTextColor(Color.parseColor("#616161"));
        this.f7937a.f7822b.setTextColor(Color.parseColor("#616161"));
        this.f7937a.f7823c.setTextColor(Color.parseColor("#616161"));
        this.f7937a.f7825e.setTextColor(Color.parseColor("#616161"));
        this.f7937a.f7824d.setHintTextColor(Color.parseColor("#039BE5"));
        this.f7937a.f7824d.setTextColor(Color.parseColor("#039BE5"));
        this.f7937a.f7829i = 3;
        C5740v.f15728b.post(new C2391q(this));
        this.f7937a.f7824d.setEnabled(false);
        this.f7937a.f7823c.setEnabled(true);
        this.f7937a.f7822b.setEnabled(true);
        this.f7937a.f7825e.setEnabled(true);
    }
}
