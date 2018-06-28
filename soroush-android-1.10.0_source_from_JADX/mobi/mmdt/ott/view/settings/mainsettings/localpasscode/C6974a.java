package mobi.mmdt.ott.view.settings.mainsettings.localpasscode;

import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7385j;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.settings.p583b.C7387l;
import mobi.mmdt.ott.view.settings.p583b.C7389n;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6974a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        boolean t = C2535a.m6888a().m6972t();
        list.clear();
        list.add(new C7389n(C4522p.m8236a(R.string.local_pass_code), t, 4004, 0));
        if (t) {
            C4400b c4400b = C4400b.values()[C2535a.m6888a().m6979x()];
            String b = C2535a.m6888a().m6919b().equals("fa") ? C2491i.m6814b(C4522p.m8236a(c4400b.f12285f)) : C4522p.m8236a(c4400b.f12285f);
            list.add(new C7386k(C4522p.m8236a(R.string.change_pass_code), -1, 1019, 1));
            list.add(new C7387l(C4522p.m8236a(R.string.auto_lock_if_away_for), b, false, 8005, 2));
            list.add(new C7385j(C4522p.m8236a(R.string.in_case_of_forget_passcode_uninstall_and_reinstall_app)));
        }
    }
}
