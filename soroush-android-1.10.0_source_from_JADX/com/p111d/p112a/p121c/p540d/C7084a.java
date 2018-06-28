package com.p111d.p112a.p121c.p540d;

import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C5303j;
import java.util.Collection;

public final class C7084a extends C6491c {
    private C7084a(C5303j c5303j, String str, C1375h c1375h, Class<?> cls, String str2, Collection<Object> collection) {
        super(c5303j, str, c1375h, cls, str2, collection);
    }

    public static C7084a m18465a(C5303j c5303j, Object obj, String str, Collection<Object> collection) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        Class cls = obj instanceof Class ? (Class) obj : obj.getClass();
        StringBuilder stringBuilder = new StringBuilder("Ignored field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" (class ");
        stringBuilder.append(cls.getName());
        stringBuilder.append(") encountered; mapper configured not to allow this");
        C7084a c7084a = new C7084a(c5303j, stringBuilder.toString(), c5303j.getCurrentLocation(), cls, str, collection);
        c7084a.m11584a(obj, str);
        return c7084a;
    }
}
