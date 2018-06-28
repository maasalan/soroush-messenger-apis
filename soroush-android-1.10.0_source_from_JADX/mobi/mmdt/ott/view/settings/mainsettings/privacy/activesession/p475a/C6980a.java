package mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p475a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.mainsettings.privacy.activesession.p587b.C7227a;

public final class C6980a extends C6073e {
    private TextView f19929b = ((TextView) this.itemView.findViewById(R.id.textView1));
    private View f19930c = this.itemView.findViewById(R.id.divider_line);

    public C6980a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.active_session_description_item, null);
    }

    protected final void mo3180a(C6829g c6829g) {
        this.f19929b.setText(((C7227a) c6829g).f20870a);
        this.f19930c.setVisibility(4);
    }
}
