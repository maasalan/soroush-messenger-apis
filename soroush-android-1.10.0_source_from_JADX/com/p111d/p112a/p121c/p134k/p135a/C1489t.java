package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;

public final class C1489t {
    public final af<?> f4648a;
    public Object f4649b;
    protected boolean f4650c = false;

    public C1489t(af<?> afVar) {
        this.f4648a = afVar;
    }

    public final Object m3833a(Object obj) {
        obj = this.f4648a.mo3343b(obj);
        this.f4649b = obj;
        return obj;
    }

    public final boolean m3834a(C5301g c5301g, aa aaVar, C1483i c1483i) {
        if (this.f4649b == null || (!this.f4650c && !c1483i.f4634e)) {
            return false;
        }
        if (c5301g.canWriteObjectId()) {
            c5301g.writeObjectRef(String.valueOf(this.f4649b));
        } else {
            c1483i.f4633d.serialize(this.f4649b, c5301g, aaVar);
        }
        return true;
    }

    public final void m3835b(C5301g c5301g, aa aaVar, C1483i c1483i) {
        this.f4650c = true;
        if (c5301g.canWriteObjectId()) {
            c5301g.writeObjectId(String.valueOf(this.f4649b));
            return;
        }
        C1382p c1382p = c1483i.f4631b;
        if (c1382p != null) {
            c5301g.writeFieldName(c1382p);
            c1483i.f4633d.serialize(this.f4649b, c5301g, aaVar);
        }
    }
}
