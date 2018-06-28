package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p134k.p136b.C7115u;
import java.util.Map;

public final class C5355a {
    protected final C1446d f4651a;
    protected final C5328e f4652b;
    protected C1545o<Object> f4653c;
    protected C7115u f4654d;

    public C5355a(C1446d c1446d, C5328e c5328e, C1545o<?> c1545o) {
        this.f4652b = c5328e;
        this.f4651a = c1446d;
        this.f4653c = c1545o;
        if (c1545o instanceof C7115u) {
            this.f4654d = (C7115u) c1545o;
        }
    }

    public final void m3836a(aa aaVar) {
        if (this.f4653c instanceof C1498j) {
            C1545o a = aaVar.m11039a(this.f4653c, this.f4651a);
            this.f4653c = a;
            if (a instanceof C7115u) {
                this.f4654d = (C7115u) a;
            }
        }
    }

    public final void m3837a(Object obj, C5301g c5301g, aa aaVar) {
        obj = this.f4652b.mo2817b(obj);
        if (obj != null) {
            if (!(obj instanceof Map)) {
                StringBuilder stringBuilder = new StringBuilder("Value returned by 'any-getter' (");
                stringBuilder.append(this.f4652b.mo1360b());
                stringBuilder.append("()) not java.util.Map but ");
                stringBuilder.append(obj.getClass().getName());
                throw C5364l.m11570a(c5301g, stringBuilder.toString());
            } else if (this.f4654d != null) {
                this.f4654d.m18612a((Map) obj, c5301g, aaVar);
            } else {
                this.f4653c.serialize(obj, c5301g, aaVar);
            }
        }
    }

    public final void m3838a(Object obj, C5301g c5301g, aa aaVar, C1502n c1502n) {
        obj = this.f4652b.mo2817b(obj);
        if (obj != null) {
            if (!(obj instanceof Map)) {
                StringBuilder stringBuilder = new StringBuilder("Value returned by 'any-getter' (");
                stringBuilder.append(this.f4652b.mo1360b());
                stringBuilder.append("()) not java.util.Map but ");
                stringBuilder.append(obj.getClass().getName());
                throw C5364l.m11570a(c5301g, stringBuilder.toString());
            } else if (this.f4654d != null) {
                this.f4654d.m18613a((Map) obj, c5301g, aaVar, c1502n, null);
            } else {
                this.f4653c.serialize(obj, c5301g, aaVar);
            }
        }
    }
}
