package mobi.mmdt.ott.view.settings.mainsettings.mediastorage;

import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.settings.C6260b;
import mobi.mmdt.ott.view.settings.p583b.C7379d;
import mobi.mmdt.ott.view.settings.p583b.C7386k;
import mobi.mmdt.ott.view.settings.p583b.C7389n;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6975a extends C6260b {
    protected final void mo3261a(List<C6829g> list) {
        List<C6829g> list2 = list;
        boolean z = C2535a.m6888a().m6981z();
        boolean s = C2535a.m6888a().m6970s();
        boolean l = C2535a.m6888a().m6956l();
        boolean n = C2535a.m6888a().m6960n();
        boolean r = C2535a.m6888a().m6968r();
        boolean q = C2535a.m6888a().m6966q();
        String str = "";
        if (l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(C4522p.m8236a(R.string.action_photo));
            str = stringBuilder.toString();
        }
        if (l && n) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(", ");
            str = stringBuilder.toString();
        }
        if (n) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(C4522p.m8236a(R.string.action_video));
            str = stringBuilder2.toString();
        }
        if ((l || n) && r) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(", ");
            str = stringBuilder2.toString();
        }
        if (r) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(C4522p.m8236a(R.string.action_gif));
            str = stringBuilder3.toString();
        }
        if ((l || n || r) && q) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(", ");
            str = stringBuilder3.toString();
        }
        if (q) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(C4522p.m8236a(R.string.action_file));
            str = stringBuilder4.toString();
        }
        if (str.isEmpty()) {
            str = C4522p.m8236a(R.string.no_media);
        }
        boolean k = C2535a.m6888a().m6954k();
        boolean m = C2535a.m6888a().m6958m();
        boolean p = C2535a.m6888a().m6964p();
        boolean o = C2535a.m6888a().m6962o();
        String str2 = "";
        if (k) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str2);
            stringBuilder2.append(C4522p.m8236a(R.string.action_photo));
            str2 = stringBuilder2.toString();
        }
        if (k && m) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(", ");
            str2 = stringBuilder5.toString();
        }
        if (m) {
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(C4522p.m8236a(R.string.action_video));
            str2 = stringBuilder5.toString();
        }
        if ((k || m) && p) {
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(", ");
            str2 = stringBuilder5.toString();
        }
        if (p) {
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(C4522p.m8236a(R.string.action_gif));
            str2 = stringBuilder5.toString();
        }
        if ((k || m || p) && o) {
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(", ");
            str2 = stringBuilder5.toString();
        }
        if (o) {
            stringBuilder5 = new StringBuilder();
            stringBuilder5.append(str2);
            stringBuilder5.append(C4522p.m8236a(R.string.action_file));
            str2 = stringBuilder5.toString();
        }
        if (str2.isEmpty()) {
            str2 = C4522p.m8236a(R.string.no_media);
        }
        if (!(l || n || r || q || k || m || p)) {
            if (!o) {
                l = false;
                list.clear();
                list2.add(new C7386k(C4522p.m8236a(R.string.cache_settings), -1, 1011, 0));
                list2.add(new C7389n(C4522p.m8236a(R.string.save_to_gallery), s, 4001, 1));
                list2.add(new C7389n(C4522p.m8236a(R.string.autoplay_gifs), z, 4007, 2));
                list2.add(new C7389n(C4522p.m8236a(R.string.automatic_media_download), l, 4006, 3));
                if (l) {
                    list2.add(new C7379d(C4522p.m8236a(R.string.when_using_mobile_data), str, 2002, 4));
                    list2.add(new C7379d(C4522p.m8236a(R.string.when_using_wifi), str2, 2003, 5));
                }
            }
        }
        l = true;
        list.clear();
        list2.add(new C7386k(C4522p.m8236a(R.string.cache_settings), -1, 1011, 0));
        list2.add(new C7389n(C4522p.m8236a(R.string.save_to_gallery), s, 4001, 1));
        list2.add(new C7389n(C4522p.m8236a(R.string.autoplay_gifs), z, 4007, 2));
        list2.add(new C7389n(C4522p.m8236a(R.string.automatic_media_download), l, 4006, 3));
        if (l) {
            list2.add(new C7379d(C4522p.m8236a(R.string.when_using_mobile_data), str, 2002, 4));
            list2.add(new C7379d(C4522p.m8236a(R.string.when_using_wifi), str2, 2003, 5));
        }
    }
}
