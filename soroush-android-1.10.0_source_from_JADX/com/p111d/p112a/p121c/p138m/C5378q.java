package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1544n;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;

public final class C5378q implements C1544n {
    protected Object f14937a;

    public C5378q(String str) {
        this.f14937a = str;
    }

    private void m11597b(C5301g c5301g) {
        if (this.f14937a instanceof C1382p) {
            c5301g.writeRawValue((C1382p) this.f14937a);
        } else {
            c5301g.writeRawValue(String.valueOf(this.f14937a));
        }
    }

    public final void m11598a(C5301g c5301g) {
        if (this.f14937a instanceof C1544n) {
            c5301g.writeObject(this.f14937a);
        } else {
            m11597b(c5301g);
        }
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        if (this.f14937a instanceof C1544n) {
            ((C1544n) this.f14937a).mo1483a(c5301g, aaVar);
        } else {
            m11597b(c5301g);
        }
    }

    public final void mo1484a(C5301g c5301g, aa aaVar, C1478f c1478f) {
        if (this.f14937a instanceof C1544n) {
            ((C1544n) this.f14937a).mo1484a(c5301g, aaVar, c1478f);
            return;
        }
        if (this.f14937a instanceof C1382p) {
            mo1483a(c5301g, aaVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5378q)) {
            return false;
        }
        C5378q c5378q = (C5378q) obj;
        return this.f14937a == c5378q.f14937a ? true : this.f14937a != null && this.f14937a.equals(c5378q.f14937a);
    }

    public final int hashCode() {
        return this.f14937a == null ? 0 : this.f14937a.hashCode();
    }

    public final String toString() {
        String str = "[RawValue of type %s]";
        Object[] objArr = new Object[1];
        objArr[0] = this.f14937a == null ? "NULL" : this.f14937a.getClass().getName();
        return String.format(str, objArr);
    }
}
