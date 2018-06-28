package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C6519i;

public abstract class C7102a<T> extends C6519i<T> implements C1498j {
    protected final C1446d f20228c;
    protected final Boolean f20229d;

    protected C7102a(C7102a<?> c7102a, C1446d c1446d, Boolean bool) {
        super(c7102a._handledType, (byte) 0);
        this.f20228c = c1446d;
        this.f20229d = bool;
    }

    protected C7102a(Class<T> cls) {
        super((Class) cls);
        this.f20228c = null;
        this.f20229d = null;
    }

    public C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        if (c1446d != null) {
            C1319d a = c1446d.mo1349a(aaVar.m11058c());
            if (a != null) {
                Boolean a2 = a.m3114a(C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                if (a2 != this.f20229d) {
                    return mo3541a(c1446d, a2);
                }
            }
        }
        return this;
    }

    public abstract C1545o<?> mo3541a(C1446d c1446d, Boolean bool);

    protected abstract void mo3542a(T t, C5301g c5301g, aa aaVar);

    public void serialize(T t, C5301g c5301g, aa aaVar) {
        if (((this.f20229d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.f20229d == Boolean.TRUE) && mo3374a((Object) t)) {
            mo3542a(t, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray();
        c5301g.setCurrentValue(t);
        mo3542a(t, c5301g, aaVar);
        c5301g.writeEndArray();
    }

    public final void serializeWithType(T t, C5301g c5301g, aa aaVar, C1478f c1478f) {
        c1478f.mo2909c(t, c5301g);
        c5301g.setCurrentValue(t);
        mo3542a(t, c5301g, aaVar);
        c1478f.mo2912f(t, c5301g);
    }
}
