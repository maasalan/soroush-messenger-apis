package mobi.mmdt.ott.logic.notifications.notifsData;

import java.util.Iterator;
import java.util.LinkedHashMap;

public final class C6000a extends C2876b {
    public final LinkedHashMap<String, C2876b> f16159a = new LinkedHashMap();

    public C6000a() {
        super(null);
    }

    public final void m13275a(String str, C2876b c2876b) {
        if (this.f16159a.containsKey(str)) {
            C2876b c2876b2 = (C2876b) this.f16159a.get(str);
            if (c2876b2 != null) {
                Object obj = c2876b2 instanceof C6003f ? 1 : c2876b2 instanceof C6002d ? 2 : c2876b2 instanceof C6001c ? 3 : null;
                Iterator it;
                switch (obj) {
                    case 1:
                        C6003f c6003f = (C6003f) c2876b;
                        it = ((C6003f) c2876b2).f16168a.iterator();
                        while (it.hasNext()) {
                            c6003f.f16168a.add((C2877e) it.next());
                        }
                        break;
                    case 2:
                        C6002d c6002d = (C6002d) c2876b;
                        it = ((C6002d) c2876b2).f16164a.iterator();
                        while (it.hasNext()) {
                            c6002d.f16164a.add((C2877e) it.next());
                        }
                        break;
                    case 3:
                        C6001c c6001c = (C6001c) c2876b;
                        it = ((C6001c) c2876b2).f16160a.iterator();
                        while (it.hasNext()) {
                            c6001c.f16160a.add((C2877e) it.next());
                        }
                        break;
                    default:
                        break;
                }
                this.f16159a.remove(str);
            }
        }
        this.f16159a.put(str, c2876b);
    }
}
