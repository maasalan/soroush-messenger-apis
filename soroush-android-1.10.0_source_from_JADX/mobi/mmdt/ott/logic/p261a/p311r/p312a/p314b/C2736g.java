package mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b;

import java.util.ArrayList;
import java.util.Iterator;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C6719h;
import mobi.mmdt.ott.logic.p360l.C5996e;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C2736g {
    public static ArrayList<String> m7074a() {
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = C2980g.m7430a(C2978e.GROUP).iterator();
        while (it.hasNext()) {
            C2976c c2976c = (C2976c) it.next();
            try {
                if (!c2976c.f9287g.equals(C3004f.NONE)) {
                    arrayList.add(c2976c.f9281a);
                    C5996e.m13260a().f16147a.m7103a(c2976c.f9281a);
                }
            } catch (Throwable e) {
                C2480b.m6737b("Problem in join to group", e);
            }
        }
        C2808d.m7148b(new C6719h());
        return arrayList;
    }
}
