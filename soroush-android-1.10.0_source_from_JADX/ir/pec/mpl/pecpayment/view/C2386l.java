package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;

class C2386l implements OnClickListener {
    final /* synthetic */ KeyboardView f7933a;

    C2386l(KeyboardView keyboardView) {
        this.f7933a = keyboardView;
    }

    public void onClick(View view) {
        this.f7933a.f7830j.setVisibility(0);
        this.f7933a.f7822b.setHintTextColor(Color.parseColor("#616161"));
        this.f7933a.f7824d.setHintTextColor(Color.parseColor("#616161"));
        this.f7933a.f7825e.setHintTextColor(Color.parseColor("#616161"));
        this.f7933a.f7822b.setTextColor(Color.parseColor("#616161"));
        this.f7933a.f7824d.setTextColor(Color.parseColor("#616161"));
        this.f7933a.f7825e.setTextColor(Color.parseColor("#616161"));
        this.f7933a.f7823c.setHintTextColor(Color.parseColor("#039BE5"));
        this.f7933a.f7823c.setTextColor(Color.parseColor("#039BE5"));
        this.f7933a.f7829i = 2;
        C5740v.f15728b.post(new C2387m(this));
        this.f7933a.f7823c.setEnabled(false);
        this.f7933a.f7822b.setEnabled(true);
        this.f7933a.f7824d.setEnabled(true);
        this.f7933a.f7825e.setEnabled(true);
    }
}
