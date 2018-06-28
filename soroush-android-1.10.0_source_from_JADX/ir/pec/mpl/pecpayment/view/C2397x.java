package ir.pec.mpl.pecpayment.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

class C2397x implements OnClickListener {
    final /* synthetic */ ListView f7944a;
    final /* synthetic */ Button f7945b;
    final /* synthetic */ Button f7946c;
    final /* synthetic */ C5740v f7947d;

    C2397x(C5740v c5740v, ListView listView, Button button, Button button2) {
        this.f7947d = c5740v;
        this.f7944a = listView;
        this.f7945b = button;
        this.f7946c = button2;
    }

    public void onClick(View view) {
        this.f7944a.setVisibility(0);
        this.f7945b.setVisibility(0);
        this.f7946c.setVisibility(8);
    }
}
