package mobi.mmdt.ott.view.settings.mainsettings.support;

import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6984a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        list.clear();
        list.add(new C7386k(C4522p.m8236a(R.string.frequently_asked_question), -1, 1025, 0));
        list.add(new C7386k(C4522p.m8236a(R.string.terms_and_conditions), -1, 1012, 1));
    }
}
