package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p121c.C1448e;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p131i.C1472a;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public final class C6506p extends C5352o {
    protected final C5306f<?> f17732a;
    protected final HashMap<String, String> f17733b;
    protected final HashMap<String, C5354j> f17734e;

    private C6506p(C5306f<?> c5306f, C5354j c5354j, HashMap<String, String> hashMap, HashMap<String, C5354j> hashMap2) {
        super(c5354j, c5306f.m11092p());
        this.f17732a = c5306f;
        this.f17733b = hashMap;
        this.f17734e = hashMap2;
    }

    public static C6506p m15677a(C5306f<?> c5306f, C5354j c5354j, Collection<C1472a> collection, boolean z, boolean z2) {
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        HashMap hashMap = null;
        HashMap hashMap2 = z ? new HashMap() : null;
        if (z2) {
            hashMap = new HashMap();
        }
        if (collection != null) {
            for (C1472a c1472a : collection) {
                Class a = c1472a.m3762a();
                Object b = c1472a.m3764c() ? c1472a.m3763b() : C6506p.m15679b(a);
                if (z) {
                    hashMap2.put(a.getName(), b);
                }
                if (z2) {
                    C5354j c5354j2 = (C5354j) hashMap.get(b);
                    if (c5354j2 == null || !a.isAssignableFrom(c5354j2.m11531e())) {
                        hashMap.put(b, c5306f.m11079b(a));
                    }
                }
            }
        }
        return new C6506p(c5306f, c5354j, hashMap2, hashMap);
    }

    private String m15678a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String str;
        Class e = this.c.m3927b((Type) cls).m11531e();
        String name = e.getName();
        synchronized (this.f17733b) {
            str = (String) this.f17733b.get(name);
            if (str == null) {
                if (this.f17732a.m11085i()) {
                    str = this.f17732a.mo3358a().findTypeName(this.f17732a.m11081c(e).mo1373c());
                }
                if (str == null) {
                    str = C6506p.m15679b(e);
                }
                this.f17733b.put(name, str);
            }
        }
        return str;
    }

    private static String m15679b(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf < 0 ? name : name.substring(lastIndexOf + 1);
    }

    public final C5354j mo1455a(C1448e c1448e, String str) {
        return (C5354j) this.f17734e.get(str);
    }

    public final String mo2913a(Object obj) {
        return m15678a(obj.getClass());
    }

    public final String mo2914a(Object obj, Class<?> cls) {
        return obj == null ? m15678a((Class) cls) : mo2913a(obj);
    }

    public final String mo2915b() {
        return new TreeSet(this.f17734e.keySet()).toString();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(getClass().getName());
        stringBuilder.append("; id-to-type=");
        stringBuilder.append(this.f17734e);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
