package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.io.Serializable;

public abstract class C7304t extends C7119d implements Serializable {
    protected C7304t() {
    }

    protected C7304t(C1451n c1451n, C1517a c1517a, C5354j c5354j, C1328b c1328b) {
        boolean z;
        Boolean valueOf;
        C1327a b;
        C5328e t = c1451n.mo1418t();
        if (c1328b != null) {
            C1327a b2 = c1328b.m3139b();
            if (!(b2 == C1327a.ALWAYS || b2 == C1327a.USE_DEFAULTS)) {
                z = true;
                if (c1328b != null) {
                    valueOf = Boolean.valueOf(false);
                } else {
                    b = c1328b.m3139b();
                    if (!(b == C1327a.ALWAYS || b == C1327a.NON_NULL)) {
                        if (b != C1327a.USE_DEFAULTS) {
                        }
                    }
                }
                super(c1451n, t, c1517a, c5354j, null, null, null, z, valueOf);
            }
        }
        z = false;
        if (c1328b != null) {
            b = c1328b.m3139b();
            valueOf = b != C1327a.USE_DEFAULTS ? c : null;
        } else {
            valueOf = Boolean.valueOf(false);
        }
        super(c1451n, t, c1517a, c5354j, null, null, null, z, valueOf);
    }

    public abstract Object mo3602a(aa aaVar);

    public final void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
        Object a = mo3602a(aaVar);
        if (a == null) {
            if (this.n != null) {
                c5301g.writeFieldName(this.d);
                this.n.serialize(null, c5301g, aaVar);
            }
            return;
        }
        C1545o c1545o = this.m;
        if (c1545o == null) {
            Class cls = a.getClass();
            C1486k c1486k = this.p;
            C1545o a2 = c1486k.mo1460a(cls);
            c1545o = a2 == null ? mo3543a(c1486k, cls, aaVar) : a2;
        }
        if (this.t != null) {
            if (c == this.t) {
                if (c1545o.isEmpty(aaVar, a)) {
                    return;
                }
            } else if (this.t.equals(a)) {
                return;
            }
        }
        if (a == obj) {
            C7119d.m18617a(c5301g, aaVar, c1545o);
        }
        c5301g.writeFieldName(this.d);
        if (this.o == null) {
            c1545o.serialize(a, c5301g, aaVar);
        } else {
            c1545o.serializeWithType(a, c5301g, aaVar, this.o);
        }
    }

    public final void mo3538b(Object obj, C5301g c5301g, aa aaVar) {
        Object a = mo3602a(aaVar);
        if (a != null) {
            C1545o c1545o = this.m;
            if (c1545o == null) {
                Class cls = a.getClass();
                C1486k c1486k = this.p;
                C1545o a2 = c1486k.mo1460a(cls);
                c1545o = a2 == null ? mo3543a(c1486k, cls, aaVar) : a2;
            }
            if (this.t != null) {
                if (c == this.t) {
                    if (c1545o.isEmpty(aaVar, a)) {
                        m18623a(c5301g, aaVar);
                        return;
                    }
                } else if (this.t.equals(a)) {
                    m18623a(c5301g, aaVar);
                    return;
                }
            }
            if (a == obj) {
                C7119d.m18617a(c5301g, aaVar, c1545o);
            }
            if (this.o == null) {
                c1545o.serialize(a, c5301g, aaVar);
            } else {
                c1545o.serializeWithType(a, c5301g, aaVar, this.o);
            }
        } else if (this.n != null) {
            this.n.serialize(null, c5301g, aaVar);
        } else {
            c5301g.writeNull();
        }
    }

    public abstract C7304t mo3603l();
}
