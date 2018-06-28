package com.p111d.p112a.p121c;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1529i;
import com.p111d.p112a.p121c.p138m.C1529i.C5372a;
import java.lang.reflect.Type;

public abstract class C1448e {
    public final af<?> m3648a(C1457t c1457t) {
        Class c = c1457t.m3707c();
        C5306f a = mo1296a();
        a.m11090n();
        return ((af) C1527g.m3951a(c, a.m11086j())).mo3341a(c1457t.m3706b());
    }

    public abstract C5306f<?> mo1296a();

    public final C5354j m3650a(C5354j c5354j, Class<?> cls) {
        return c5354j.m11531e() == cls ? c5354j : mo1296a().m11076a(c5354j, cls);
    }

    public final C5354j m3651a(Type type) {
        return mo1297b().m3927b(type);
    }

    public final C1529i<Object, Object> m3652a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C1529i) {
            return (C1529i) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == C5372a.class || C1527g.m3983r(cls)) {
                return null;
            }
            if (C1529i.class.isAssignableFrom(cls)) {
                C5306f a = mo1296a();
                a.m11090n();
                return (C1529i) C1527g.m3951a(cls, a.m11086j());
            }
            StringBuilder stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append("; expected Class<Converter>");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("AnnotationIntrospector returned Converter definition of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append("; expected type Converter or Class<Converter> instead");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final ah m3653b(C1457t c1457t) {
        Class d = c1457t.m3708d();
        C5306f a = mo1296a();
        a.m11090n();
        return (ah) C1527g.m3951a(d, a.m11086j());
    }

    public abstract C1513m mo1297b();
}
