package ir.pec.mpl.pecpayment.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

class ai implements OnClickListener {
    final /* synthetic */ ListView f7864a;
    final /* synthetic */ Button f7865b;
    final /* synthetic */ Button f7866c;
    final /* synthetic */ C5740v f7867d;

    ai(C5740v c5740v, ListView listView, Button button, Button button2) {
        this.f7867d = c5740v;
        this.f7864a = listView;
        this.f7865b = button;
        this.f7866c = button2;
    }

    public void onClick(View view) {
        this.f7864a.setVisibility(0);
        this.f7865b.setVisibility(0);
        this.f7866c.setVisibility(8);
    }
}
