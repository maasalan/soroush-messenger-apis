package mobi.mmdt.ott.view.passcode.p558a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.passcode.p582b.C7376d;

public final class C6943c extends C6073e {
    private FrameLayout f19829b = ((FrameLayout) this.itemView.findViewById(R.id.root_linearLayout));
    private TextView f19830c = ((TextView) this.itemView.findViewById(R.id.button));

    public C6943c(C3126i c3126i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.item_number_pass_code, c3126i);
        this.f19830c.setTypeface(this.f19830c.getTypeface(), 1);
    }

    protected final void mo3180a(C6829g c6829g) {
        this.f19830c.setText(((C7376d) c6829g).f21454a);
        this.f19830c.setTextColor(-1);
    }
}
