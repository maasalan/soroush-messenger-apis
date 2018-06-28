package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C7410a extends C7279f<C7410a> {
    private final List<C6524m> f21534b = new ArrayList();

    public C7410a(C1480j c1480j) {
        super(c1480j);
    }

    public final int mo3598a() {
        return this.f21534b.size();
    }

    public final C7410a m19700a(C6524m c6524m) {
        if (c6524m == null) {
            c6524m = C1480j.m3810a();
        }
        m19704b(c6524m);
        return this;
    }

    public final C6524m mo3533a(String str) {
        return null;
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        List list = this.f21534b;
        int size = list.size();
        c5301g.writeStartArray(size);
        for (int i = 0; i < size; i++) {
            C6524m c6524m = (C6524m) list.get(i);
            if (c6524m instanceof C7094b) {
                ((C7094b) c6524m).mo1483a(c5301g, aaVar);
            } else {
                c6524m.mo1483a(c5301g, aaVar);
            }
        }
        c5301g.writeEndArray();
    }

    public final void mo1484a(C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2909c(this, c5301g);
        for (C6524m c6524m : this.f21534b) {
            ((C7094b) c6524m).mo1483a(c5301g, aaVar);
        }
        c1478f.mo2912f(this, c5301g);
    }

    public final C7410a m19704b(C6524m c6524m) {
        this.f21534b.add(c6524m);
        return this;
    }

    public final Iterator<C6524m> mo3599c() {
        return this.f21534b.iterator();
    }

    public final boolean mo3600e() {
        return this.f21534b.isEmpty();
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj != null && (obj instanceof C7410a)) ? this.f21534b.equals(((C7410a) obj).f21534b) : false;
    }

    public int hashCode() {
        return this.f21534b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(16 + (mo3598a() << 4));
        stringBuilder.append('[');
        int size = this.f21534b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(((C6524m) this.f21534b.get(i)).toString());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
