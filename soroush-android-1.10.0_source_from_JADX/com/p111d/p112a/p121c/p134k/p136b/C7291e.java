package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;

@C1387a
public final class C7291e extends C7116v<Boolean> {
    protected final boolean f21035a;

    public C7291e(boolean z) {
        super(Boolean.class);
        this.f21035a = z;
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("boolean", this.f21035a ^ 1);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        c5301g.writeBoolean(((Boolean) obj).booleanValue());
    }
}
