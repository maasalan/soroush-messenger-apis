package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p134k.p135a.C1483i;
import com.p111d.p112a.p121c.p134k.p135a.C7095b;
import com.p111d.p112a.p121c.p134k.p135a.C7101s;
import com.p111d.p112a.p121c.p134k.p136b.C6514d;
import com.p111d.p112a.p121c.p138m.C1534n;

public final class C7120e extends C6514d {
    public C7120e(C5354j c5354j, C1496f c1496f, C7119d[] c7119dArr, C7119d[] c7119dArr2) {
        super(c5354j, c1496f, c7119dArr, c7119dArr2);
    }

    private C7120e(C6514d c6514d, C1483i c1483i, Object obj) {
        super(c6514d, c1483i, obj);
    }

    private C7120e(C6514d c6514d, String[] strArr) {
        super(c6514d, strArr);
    }

    public static C7120e m18642a(C5354j c5354j) {
        return new C7120e(c5354j, null, c, null);
    }

    protected final C6514d mo3366a() {
        return (this.i == null && this.f == null && this.g == null) ? new C7095b(this) : this;
    }

    public final C6514d mo3367a(C1483i c1483i) {
        return new C7120e(this, c1483i, this.g);
    }

    public final C6514d mo3368a(Object obj) {
        return new C7120e(this, this.i, obj);
    }

    protected final C6514d mo3369a(String[] strArr) {
        return new C7120e(this, strArr);
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        if (this.i != null) {
            c5301g.setCurrentValue(obj);
            m15710a(obj, c5301g, aaVar, true);
            return;
        }
        c5301g.writeStartObject();
        c5301g.setCurrentValue(obj);
        if (this.g != null) {
            m15712b(obj, c5301g, aaVar);
        } else {
            m15708a(obj, c5301g, aaVar);
        }
        c5301g.writeEndObject();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BeanSerializer for ");
        stringBuilder.append(handledType().getName());
        return stringBuilder.toString();
    }

    public final C1545o<Object> unwrappingSerializer(C1534n c1534n) {
        return new C7101s((C6514d) this, c1534n);
    }

    public final /* synthetic */ C1545o withFilterId(Object obj) {
        return mo3368a(obj);
    }
}
