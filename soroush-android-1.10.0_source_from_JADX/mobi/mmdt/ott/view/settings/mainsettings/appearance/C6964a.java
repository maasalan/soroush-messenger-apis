package mobi.mmdt.ott.view.settings.mainsettings.appearance;

import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.settings.p583b.C7387l;
import mobi.mmdt.ott.view.settings.p583b.C7388m;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p480d.C4503a;

public final class C6964a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        String a = C4503a.m8194a(C2535a.m6888a().at());
        boolean au = C2535a.m6888a().au();
        int B = C2535a.m6888a().m6891B();
        String b = C2535a.m6888a().m6919b().equals("fa") ? C2491i.m6809b(B) : String.valueOf(B);
        list.clear();
        list.add(new C7386k(C4522p.m8236a(R.string.action_change_background), -1, 1010, 0));
        list.add(new C7386k(C4522p.m8236a(R.string.action_change_theme), -1, 1014, 1));
        list.add(new C7386k(C4522p.m8236a(R.string.action_change_tab), -1, 1015, 2));
        list.add(new C7387l(C4522p.m8236a(R.string.change_font), a, false, 8011, 3));
        list.add(new C7387l(C4522p.m8236a(R.string.messages_text_size), b, false, 8012, 4));
        list.add(new C7388m(C4522p.m8236a(R.string.wide_background_title), C4522p.m8236a(R.string.wide_background_comment), au, 5007, 5));
    }
}
