package mobi.mmdt.ott.view.contact.p415a.p417b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.contact.p415a.p416a.C6868a;
import mobi.mmdt.ott.view.contact.p415a.p569c.C7338c;
import mobi.mmdt.ott.view.tools.C4522p;
import p000a.p001a.p002a.C0005c;

public final class C6870b extends C6073e {
    private final String f19594b = C2535a.m6888a().m6919b();
    private Activity f19595c;
    private TextView f19596d = ((TextView) this.itemView.findViewById(R.id.divider_textView));

    public C6870b(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater, viewGroup, R.layout.list_item_checkable_contacts_divider, null);
        this.f19595c = activity;
        C0005c.m0a().m6a((Object) this);
        C2491i.m6796a(this.f19596d, UIThemeManager.getmInstance().getAccent_color());
        C2491i.m6802a(this.f19596d, UIThemeManager.getmInstance().getButton_text_color());
    }

    protected final void mo3180a(C6829g c6829g) {
        TextView textView;
        CharSequence b;
        C7338c c7338c = (C7338c) c6829g;
        if (this.f19594b.equals("fa")) {
            textView = this.f19596d;
            b = C2491i.m6814b(String.format(C4522p.m8236a(R.string.divider_contact_selection), new Object[]{Integer.valueOf(c7338c.f21175b), Integer.valueOf(c7338c.f21174a), C4522p.m8236a(R.string.contacts_selected)}));
        } else {
            textView = this.f19596d;
            b = String.format(C4522p.m8236a(R.string.divider_contact_selection), new Object[]{Integer.valueOf(c7338c.f21175b), Integer.valueOf(c7338c.f21174a), C4522p.m8236a(R.string.contacts_selected)});
        }
        textView.setText(b);
    }

    protected final void finalize() {
        super.finalize();
        C0005c.m0a().m8c(this);
    }

    public final void onEvent(final C6868a c6868a) {
        if (this.f19595c != null) {
            this.f19595c.runOnUiThread(new Runnable(this) {
                final /* synthetic */ C6870b f10034b;

                public final void run() {
                    TextView b;
                    CharSequence b2;
                    if (this.f10034b.f19594b.equals("fa")) {
                        b = this.f10034b.f19596d;
                        b2 = C2491i.m6814b(String.format(C4522p.m8236a(R.string.divider_contact_selection), new Object[]{Integer.valueOf(c6868a.f10028a), Integer.valueOf(c6868a.f10029b), C4522p.m8236a(R.string.contacts_selected)}));
                    } else {
                        b = this.f10034b.f19596d;
                        b2 = String.format(C4522p.m8236a(R.string.divider_contact_selection), new Object[]{Integer.valueOf(c6868a.f10028a), Integer.valueOf(c6868a.f10029b), C4522p.m8236a(R.string.contacts_selected)});
                    }
                    b.setText(b2);
                }
            });
        }
    }
}
