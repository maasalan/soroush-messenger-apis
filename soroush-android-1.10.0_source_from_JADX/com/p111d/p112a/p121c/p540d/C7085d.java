package com.p111d.p112a.p121c.p540d;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C5303j;
import java.util.Collection;

public final class C7085d extends C6491c {
    private C7085d(C5303j c5303j, String str, C1375h c1375h, Class<?> cls, String str2, Collection<Object> collection) {
        super(c5303j, str, c1375h, cls, str2, collection);
    }

    public static C7085d m18466a(C5303j c5303j, Object obj, String str, Collection<Object> collection) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        Class cls = obj instanceof Class ? (Class) obj : obj.getClass();
        StringBuilder stringBuilder = new StringBuilder("Unrecognized field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" (class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append("), not marked as ignorable");
        C7085d c7085d = new C7085d(c5303j, stringBuilder.toString(), c5303j.getCurrentLocation(), cls, str, collection);
        c7085d.m11584a(obj, str);
        return c7085d;
    }
}
