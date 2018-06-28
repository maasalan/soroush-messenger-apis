package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;

public final class C5362p extends C1545o<Object> {
    protected final C1478f f14927a;
    protected final C1545o<Object> f14928b;

    public C5362p(C1478f c1478f, C1545o<?> c1545o) {
        this.f14927a = c1478f;
        this.f14928b = c1545o;
    }

    public final Class<Object> handledType() {
        return Object.class;
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        this.f14928b.serializeWithType(obj, c5301g, aaVar, this.f14927a);
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        this.f14928b.serializeWithType(obj, c5301g, aaVar, c1478f);
    }
}
