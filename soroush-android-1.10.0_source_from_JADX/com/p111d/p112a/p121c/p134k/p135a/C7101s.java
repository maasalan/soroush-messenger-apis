package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.p136b.C6514d;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;

public final class C7101s extends C6514d implements Serializable {
    protected final C1534n f20227a;

    private C7101s(C7101s c7101s, C1483i c1483i) {
        super((C6514d) c7101s, c1483i);
        this.f20227a = c7101s.f20227a;
    }

    private C7101s(C7101s c7101s, C1483i c1483i, Object obj) {
        super((C6514d) c7101s, c1483i, obj);
        this.f20227a = c7101s.f20227a;
    }

    private C7101s(C7101s c7101s, String[] strArr) {
        super((C6514d) c7101s, strArr);
        this.f20227a = c7101s.f20227a;
    }

    public C7101s(C6514d c6514d, C1534n c1534n) {
        super(c6514d, c1534n);
        this.f20227a = c1534n;
    }

    protected final C6514d mo3366a() {
        return this;
    }

    public final C6514d mo3367a(C1483i c1483i) {
        return new C7101s(this, c1483i);
    }

    public final C6514d mo3368a(Object obj) {
        return new C7101s(this, this.i, obj);
    }

    protected final C6514d mo3369a(String[] strArr) {
        return new C7101s(this, strArr);
    }

    public final boolean isUnwrappingSerializer() {
        return true;
    }

    public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
        c5301g.setCurrentValue(obj);
        if (this.i != null) {
            m15710a(obj, c5301g, aaVar, false);
        } else if (this.g != null) {
            m15712b(obj, c5301g, aaVar);
        } else {
            m15708a(obj, c5301g, aaVar);
        }
    }

    public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        if (aaVar.m11046a(C5387z.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            throw C5364l.m11570a(c5301g, "Unwrapped property requires use of type information: can not serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
        }
        c5301g.setCurrentValue(obj);
        if (this.i != null) {
            m15709a(obj, c5301g, aaVar, c1478f);
        } else if (this.g != null) {
            m15712b(obj, c5301g, aaVar);
        } else {
            m15708a(obj, c5301g, aaVar);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnwrappingBeanSerializer for ");
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
