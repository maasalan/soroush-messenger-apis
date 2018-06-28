package mobi.mmdt.ott.view.settings.mainsettings.privacy;

import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7377b;
import mobi.mmdt.ott.view.settings.p583b.C7379d;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6978a extends C6260b {
    boolean f19927b = false;

    protected final void mo3261a(List<C6829g> list) {
        list.clear();
        C2535a.m6888a().f8278a.getBoolean("mobi.mmdt.ott.model.pref.PrefKeys.KEY_IS_SHARE_LOCATION_ENABLE", false);
        list.add(new C7386k(C4522p.m8236a(R.string.local_pass_code), -1, 1018, 0));
        list.add(new C7379d(C4522p.m8236a(R.string.blocked_contacts), C4522p.m8236a(R.string.add_remove_blocked_contacts), 2007, 1));
        list.add(new C7386k(C4522p.m8236a(R.string.active_session), -1, 1020, 2));
        list.add(new C7386k(C4522p.m8236a(R.string.privacy_policy), -1, 1013, 3));
        if (this.f19927b) {
            list.add(new C7377b(C4522p.m8236a(R.string.deactivate_account)));
        }
    }
}
