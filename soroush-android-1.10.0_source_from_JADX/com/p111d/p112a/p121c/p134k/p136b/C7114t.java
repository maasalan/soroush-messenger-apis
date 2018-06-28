package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.C6521o;
import com.p111d.p112a.p121c.p137l.C1513m;

public final class C7114t extends C6521o {
    protected final C1478f f20242c;
    protected final C1446d f20243d;
    protected Object f20244e;
    protected C1545o<Object> f20245f;
    protected C1545o<Object> f20246g;

    public C7114t(C1478f c1478f, C1446d c1446d) {
        super(c1446d == null ? C1548u.f4830c : c1446d.mo1353b());
        this.f20242c = c1478f;
        this.f20243d = c1446d;
    }

    public final C5354j mo1350a() {
        return this.f20243d == null ? C1513m.m3911b() : this.f20243d.mo1350a();
    }

    public final void mo1351a(C5346d c5346d, aa aaVar) {
        if (this.f20243d != null) {
            this.f20243d.mo1351a(c5346d, aaVar);
        }
    }

    @Deprecated
    public final void mo3375a(C7415o c7415o, aa aaVar) {
    }

    public final void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
        this.f20245f.serialize(this.f20244e, c5301g, aaVar);
        if (this.f20242c == null) {
            this.f20246g.serialize(obj, c5301g, aaVar);
        } else {
            this.f20246g.serializeWithType(obj, c5301g, aaVar, this.f20242c);
        }
    }

    public final void m18598a(Object obj, C1545o<Object> c1545o, C1545o<Object> c1545o2) {
        this.f20244e = obj;
        this.f20245f = c1545o;
        this.f20246g = c1545o2;
    }

    public final C5328e mo1354c() {
        return this.f20243d == null ? null : this.f20243d.mo1354c();
    }
}
