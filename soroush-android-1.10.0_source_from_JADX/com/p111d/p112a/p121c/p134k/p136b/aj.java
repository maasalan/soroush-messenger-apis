package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C1484d;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public final class aj {
    protected static final C1545o<Object> f4658a = new ai();
    protected static final C1545o<Object> f4659b = new C6512c();

    public static class C6510a extends al<Object> {
        protected final int f17743a;

        public C6510a(int i, Class<?> cls) {
            super(cls, false);
            this.f17743a = i;
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            switch (this.f17743a) {
                case 1:
                    aaVar.m11053b((Date) obj, c5301g);
                    return;
                case 2:
                    aaVar.m11042a(((Calendar) obj).getTimeInMillis(), c5301g);
                    return;
                case 3:
                    c5301g.writeFieldName(((Class) obj).getName());
                    return;
                case 4:
                    c5301g.writeFieldName(aaVar.m11046a(C5387z.f14983n) ? obj.toString() : ((Enum) obj).name());
                    return;
                default:
                    c5301g.writeFieldName(obj.toString());
                    return;
            }
        }
    }

    public static class C6511b extends al<Object> {
        protected transient C1486k f17744a = C5357b.f14921b;

        public C6511b() {
            super(String.class, false);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            Class cls = obj.getClass();
            C1486k c1486k = this.f17744a;
            C1545o a = c1486k.mo1460a(cls);
            if (a == null) {
                a = aaVar.m11050b(cls);
                C1484d c1484d = new C1484d(a, c1486k.mo1459a(cls, a));
                if (c1486k != c1484d.f4636b) {
                    this.f17744a = c1484d.f4636b;
                }
                a = c1484d.f4635a;
            }
            a.serialize(obj, c5301g, aaVar);
        }
    }

    public static class C6512c extends al<Object> {
        public C6512c() {
            super(String.class, false);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeFieldName((String) obj);
        }
    }

    public static C1545o<Object> m3841a(Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new C6511b();
            }
            if (cls.isEnum()) {
                return new C6510a(4, cls);
            }
        }
        return f4658a;
    }

    public static C1545o<Object> m3842a(Class<?> cls, boolean z) {
        if (cls != null) {
            if (cls != Object.class) {
                if (cls == String.class) {
                    return f4659b;
                }
                if (!cls.isPrimitive()) {
                    if (!Number.class.isAssignableFrom(cls)) {
                        return cls == Class.class ? new C6510a(3, cls) : Date.class.isAssignableFrom(cls) ? new C6510a(1, cls) : Calendar.class.isAssignableFrom(cls) ? new C6510a(2, cls) : cls == UUID.class ? new C6510a(5, cls) : z ? f4658a : null;
                    }
                }
                return f4658a;
            }
        }
        return new C6511b();
    }
}
