package ir.pec.mpl.pecpayment.view;

import android.graphics.Color;
import android.view.View;
import android.view.View.OnFocusChangeListener;

class C2384j implements OnFocusChangeListener {
    final /* synthetic */ KeyboardView f7931a;

    C2384j(KeyboardView keyboardView) {
        this.f7931a = keyboardView;
    }

    public void onFocusChange(View view, boolean z) {
        this.f7931a.f7830j.setVisibility(0);
        this.f7931a.f7822b.setHintTextColor(Color.parseColor("#616161"));
        this.f7931a.f7824d.setHintTextColor(Color.parseColor("#616161"));
        this.f7931a.f7825e.setHintTextColor(Color.parseColor("#616161"));
        this.f7931a.f7822b.setTextColor(Color.parseColor("#616161"));
        this.f7931a.f7824d.setTextColor(Color.parseColor("#616161"));
        this.f7931a.f7825e.setTextColor(Color.parseColor("#616161"));
        this.f7931a.f7823c.setHintTextColor(Color.parseColor("#039BE5"));
        this.f7931a.f7823c.setTextColor(Color.parseColor("#039BE5"));
        this.f7931a.f7829i = 2;
        C5740v.f15728b.post(new C2385k(this));
        this.f7931a.f7823c.setEnabled(false);
        this.f7931a.f7822b.setEnabled(true);
        this.f7931a.f7824d.setEnabled(true);
        this.f7931a.f7825e.setEnabled(true);
    }
}
