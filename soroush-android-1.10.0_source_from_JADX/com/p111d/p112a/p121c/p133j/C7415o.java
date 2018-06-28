package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class C7415o extends C7279f<C7415o> {
    protected final Map<String, C6524m> f21541b = new LinkedHashMap();

    public C7415o(C1480j c1480j) {
        super(c1480j);
    }

    private C7415o m19717c(String str, C6524m c6524m) {
        this.f21541b.put(str, c6524m);
        return this;
    }

    public final int mo3598a() {
        return this.f21541b.size();
    }

    public final C7415o m19719a(String str, String str2) {
        return m19717c(str, str2 == null ? C1480j.m3810a() : C1480j.m3815a(str2));
    }

    public final C7415o m19720a(String str, boolean z) {
        return m19717c(str, C1480j.m3809a(z));
    }

    public final C6524m mo3533a(String str) {
        return (C6524m) this.f21541b.get(str);
    }

    public final C6524m m19722a(String str, C6524m c6524m) {
        Object a;
        if (c6524m == null) {
            a = C1480j.m3810a();
        }
        this.f21541b.put(str, a);
        return this;
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeStartObject();
        for (Entry entry : this.f21541b.entrySet()) {
            c5301g.writeFieldName((String) entry.getKey());
            ((C7094b) entry.getValue()).mo1483a(c5301g, aaVar);
        }
        c5301g.writeEndObject();
    }

    public final void mo1484a(C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2907b((Object) this, c5301g);
        for (Entry entry : this.f21541b.entrySet()) {
            c5301g.writeFieldName((String) entry.getKey());
            ((C7094b) entry.getValue()).mo1483a(c5301g, aaVar);
        }
        c1478f.mo2911e(this, c5301g);
    }

    public final C7410a m19725b(String str) {
        C6524m f = m19406f();
        m19717c(str, f);
        return f;
    }

    public final C6524m m19726b(String str, C6524m c6524m) {
        Object a;
        if (c6524m == null) {
            a = C1480j.m3810a();
        }
        return (C6524m) this.f21541b.put(str, a);
    }

    public final Iterator<C6524m> mo3599c() {
        return this.f21541b.values().iterator();
    }

    public final Iterator<Entry<String, C6524m>> mo3601d() {
        return this.f21541b.entrySet().iterator();
    }

    public final boolean mo3600e() {
        return this.f21541b.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C7415o)) {
            return false;
        }
        return this.f21541b.equals(((C7415o) obj).f21541b);
    }

    public int hashCode() {
        return this.f21541b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(32 + (mo3598a() << 4));
        stringBuilder.append("{");
        int i = 0;
        for (Entry entry : this.f21541b.entrySet()) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            i++;
            C7417q.m19732a(stringBuilder, (String) entry.getKey());
            stringBuilder.append(':');
            stringBuilder.append(((C6524m) entry.getValue()).toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
