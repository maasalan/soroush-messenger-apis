package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1544n;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p138m.C5378q;

public final class C7416p extends C7280r {
    protected final Object f21542a;

    public C7416p(Object obj) {
        this.f21542a = obj;
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        if (this.f21542a == null) {
            aaVar.m11043a(c5301g);
        } else if (this.f21542a instanceof C1544n) {
            ((C1544n) this.f21542a).mo1483a(c5301g, aaVar);
        } else {
            c5301g.writeObject(this.f21542a);
        }
    }

    public final String mo3532b() {
        return this.f21542a == null ? "null" : this.f21542a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C7416p)) {
            return false;
        }
        C7416p c7416p = (C7416p) obj;
        return this.f21542a == null ? c7416p.f21542a == null : this.f21542a.equals(c7416p.f21542a);
    }

    public final int hashCode() {
        return this.f21542a.hashCode();
    }

    public final String toString() {
        if (this.f21542a instanceof byte[]) {
            return String.format("(binary value of %d bytes)", new Object[]{Integer.valueOf(((byte[]) this.f21542a).length)});
        } else if (!(this.f21542a instanceof C5378q)) {
            return String.valueOf(this.f21542a);
        } else {
            return String.format("(raw value '%s')", new Object[]{((C5378q) this.f21542a).toString()});
        }
    }
}
