package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p130h.C1470c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C1503p;
import com.p111d.p112a.p121c.p138m.C1529i;
import java.lang.reflect.Type;

public class ag extends al<Object> implements C1470c, C1498j, C1503p {
    protected final C1529i<Object, ?> f17740a;
    protected final C5354j f17741b;
    protected final C1545o<Object> f17742c;

    public ag(C1529i<Object, ?> c1529i, C5354j c5354j, C1545o<?> c1545o) {
        super(c5354j);
        this.f17740a = c1529i;
        this.f17741b = c5354j;
        this.f17742c = c1545o;
    }

    private static C1545o<Object> m15692a(Object obj, aa aaVar) {
        return aaVar.m11040a(obj.getClass());
    }

    private Object m15693a() {
        return this.f17740a.m3990a();
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c1545o = this.f17742c;
        C5354j c5354j = this.f17741b;
        if (c1545o == null) {
            if (c5354j == null) {
                C1529i c1529i = this.f17740a;
                aaVar.mo1297b();
                c5354j = c1529i.m3992c();
            }
            if (!c5354j.m11543q()) {
                c1545o = aaVar.m11036a(c5354j);
            }
        }
        if (c1545o instanceof C1498j) {
            c1545o = aaVar.m11049b(c1545o, c1446d);
        }
        if (c1545o == this.f17742c && c5354j == this.f17741b) {
            return this;
        }
        C1529i c1529i2 = this.f17740a;
        if (getClass() == ag.class) {
            return new ag(c1529i2, c5354j, c1545o);
        }
        StringBuilder stringBuilder = new StringBuilder("Sub-class ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" must override 'withDelegate'");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void mo2919a(aa aaVar) {
        if (this.f17742c != null && (this.f17742c instanceof C1503p)) {
            ((C1503p) this.f17742c).mo2919a(aaVar);
        }
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        if (this.f17742c != null) {
            this.f17742c.acceptJsonFormatVisitor(c5345c, c5354j);
        }
    }

    public C1545o<?> getDelegatee() {
        return this.f17742c;
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return this.f17742c instanceof C1470c ? ((C1470c) this.f17742c).getSchema(aaVar, type) : super.getSchema(aaVar, type);
    }

    public C6524m getSchema(aa aaVar, Type type, boolean z) {
        return this.f17742c instanceof C1470c ? ((C1470c) this.f17742c).getSchema(aaVar, type, z) : super.getSchema(aaVar, type);
    }

    public boolean isEmpty(aa aaVar, Object obj) {
        return this.f17742c == null ? obj == null : this.f17742c.isEmpty(aaVar, m15693a());
    }

    @Deprecated
    public boolean isEmpty(Object obj) {
        return isEmpty(null, obj);
    }

    public void serialize(Object obj, C5301g c5301g, aa aaVar) {
        obj = m15693a();
        if (obj == null) {
            aaVar.m11043a(c5301g);
            return;
        }
        C1545o c1545o = this.f17742c;
        if (c1545o == null) {
            c1545o = ag.m15692a(obj, aaVar);
        }
        c1545o.serialize(obj, c5301g, aaVar);
    }

    public void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        Object a = m15693a();
        C1545o c1545o = this.f17742c;
        if (c1545o == null) {
            c1545o = ag.m15692a(obj, aaVar);
        }
        c1545o.serializeWithType(a, c5301g, aaVar, c1478f);
    }
}
