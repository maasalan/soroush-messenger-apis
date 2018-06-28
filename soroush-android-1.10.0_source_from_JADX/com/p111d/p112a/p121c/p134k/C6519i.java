package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.p136b.al;

public abstract class C6519i<T> extends al<T> {
    protected C6519i(C5354j c5354j) {
        super(c5354j);
    }

    protected C6519i(C6519i<?> c6519i) {
        super(c6519i._handledType, false);
    }

    protected C6519i(Class<T> cls) {
        super((Class) cls);
    }

    protected C6519i(Class<?> cls, byte b) {
        super(cls, false);
    }

    public abstract C6519i<?> mo3373a(C1478f c1478f);

    public abstract boolean mo3374a(T t);

    @Deprecated
    public boolean isEmpty(T t) {
        return isEmpty(null, t);
    }
}
