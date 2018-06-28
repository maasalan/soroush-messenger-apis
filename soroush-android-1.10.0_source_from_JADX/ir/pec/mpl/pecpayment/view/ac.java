package ir.pec.mpl.pecpayment.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

class ac implements OnClickListener {
    final /* synthetic */ ListView f7849a;
    final /* synthetic */ Button f7850b;
    final /* synthetic */ Button f7851c;
    final /* synthetic */ C5740v f7852d;

    ac(C5740v c5740v, ListView listView, Button button, Button button2) {
        this.f7852d = c5740v;
        this.f7849a = listView;
        this.f7850b = button;
        this.f7851c = button2;
    }

    public void onClick(View view) {
        this.f7849a.setVisibility(0);
        this.f7850b.setVisibility(0);
        this.f7851c.setVisibility(8);
    }
}
