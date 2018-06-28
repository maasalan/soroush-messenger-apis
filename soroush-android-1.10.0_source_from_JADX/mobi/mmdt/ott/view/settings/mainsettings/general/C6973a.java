package mobi.mmdt.ott.view.settings.mainsettings.general;

import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.settings.p583b.C7387l;
import mobi.mmdt.ott.view.settings.p583b.C7388m;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6973a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        int i;
        String a;
        boolean y = C2535a.m6888a().m6980y();
        String b = C2535a.m6888a().m6919b();
        int hashCode = b.hashCode();
        if (hashCode != 3121) {
            if (hashCode == 3259) {
                if (b.equals("fa")) {
                    i = 0;
                    switch (i) {
                        case 0:
                            i = R.string.farsi;
                            break;
                        case 1:
                            i = R.string.arabic;
                            break;
                        default:
                            i = R.string.english;
                            break;
                    }
                    a = C4522p.m8236a(i);
                    list.clear();
                    list.add(new C7387l(C4522p.m8236a(R.string.language), a, false, 8013, 0));
                    list.add(new C7386k(C4522p.m8236a(R.string.stickers), -1, 1005, 1));
                    list.add(new C7388m(C4522p.m8236a(R.string.open_internal_browser), C4522p.m8236a(R.string.comment_open_internal_browser), y, 5003, 2));
                }
            }
        } else if (b.equals("ar")) {
            i = 1;
            switch (i) {
                case 0:
                    i = R.string.farsi;
                    break;
                case 1:
                    i = R.string.arabic;
                    break;
                default:
                    i = R.string.english;
                    break;
            }
            a = C4522p.m8236a(i);
            list.clear();
            list.add(new C7387l(C4522p.m8236a(R.string.language), a, false, 8013, 0));
            list.add(new C7386k(C4522p.m8236a(R.string.stickers), -1, 1005, 1));
            list.add(new C7388m(C4522p.m8236a(R.string.open_internal_browser), C4522p.m8236a(R.string.comment_open_internal_browser), y, 5003, 2));
        }
        i = -1;
        switch (i) {
            case 0:
                i = R.string.farsi;
                break;
            case 1:
                i = R.string.arabic;
                break;
            default:
                i = R.string.english;
                break;
        }
        a = C4522p.m8236a(i);
        list.clear();
        list.add(new C7387l(C4522p.m8236a(R.string.language), a, false, 8013, 0));
        list.add(new C7386k(C4522p.m8236a(R.string.stickers), -1, 1005, 1));
        list.add(new C7388m(C4522p.m8236a(R.string.open_internal_browser), C4522p.m8236a(R.string.comment_open_internal_browser), y, 5003, 2));
    }
}
