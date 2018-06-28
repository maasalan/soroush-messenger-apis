package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C6521o;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.util.Iterator;

public abstract class C1545o<T> {

    public static abstract class C5383a extends C1545o<Object> {
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public C1545o<?> getDelegatee() {
        return null;
    }

    public Class<T> handledType() {
        return null;
    }

    public boolean isEmpty(aa aaVar, T t) {
        return t == null;
    }

    @Deprecated
    public boolean isEmpty(T t) {
        return isEmpty(null, t);
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public Iterator<C6521o> properties() {
        return C1527g.m3954a();
    }

    public C1545o<T> replaceDelegatee(C1545o<?> c1545o) {
        throw new UnsupportedOperationException();
    }

    public abstract void serialize(T t, C5301g c5301g, aa aaVar);

    public void serializeWithType(T t, C5301g c5301g, aa aaVar, C1478f c1478f) {
        Class handledType = handledType();
        if (handledType == null) {
            handledType = t.getClass();
        }
        throw C5364l.m11576a(String.format("Type id handling not implemented for type %s (by serializer of type %s)", new Object[]{handledType.getName(), getClass().getName()}));
    }

    public C1545o<T> unwrappingSerializer(C1534n c1534n) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    public C1545o<?> withFilterId(Object obj) {
        return this;
    }
}
