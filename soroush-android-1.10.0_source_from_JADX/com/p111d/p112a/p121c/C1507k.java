package com.p111d.p112a.p121c;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.p125a.C1416l;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.util.Collection;

public abstract class C1507k<T> {

    public static abstract class C5355a extends C1507k<Object> {
        private C5355a() {
        }
    }

    public C6488s mo1310a(String str) {
        StringBuilder stringBuilder = new StringBuilder("Can not handle managed/back reference '");
        stringBuilder.append(str);
        stringBuilder.append("': type: value deserializer of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" does not support them");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public C1507k<T> mo2806a(C1534n c1534n) {
        return this;
    }

    public Class<?> mo1307a() {
        return null;
    }

    public abstract T mo1304a(C5303j c5303j, C5347g c5347g);

    public Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2899d(c5303j, c5347g);
    }

    public T mo1309a(C5303j c5303j, C5347g c5347g, T t) {
        StringBuilder stringBuilder = new StringBuilder("Can not update object of type ");
        stringBuilder.append(t.getClass().getName());
        stringBuilder.append(" (by deserializer of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(")");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public T mo2803a(C5347g c5347g) {
        return mo2804e();
    }

    public T mo3346b(C5347g c5347g) {
        return mo2804e();
    }

    public boolean mo1311b() {
        return false;
    }

    public Collection<Object> mo2808c() {
        return null;
    }

    public C1416l mo1312d() {
        return null;
    }

    @Deprecated
    public T mo2804e() {
        return null;
    }
}
