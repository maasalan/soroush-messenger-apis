package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.af.C1304a;
import com.p111d.p112a.p113a.ag.C6463c;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p134k.C7119d;

public final class C7098j extends C6463c {
    protected final C7119d f20223b;

    public C7098j(C1457t c1457t, C7119d c7119d) {
        this(c1457t.m3706b(), c7119d);
    }

    private C7098j(Class<?> cls, C7119d c7119d) {
        super(cls);
        this.f20223b = c7119d;
    }

    public final C1304a mo3340a(Object obj) {
        return obj == null ? null : new C1304a(getClass(), this.a, obj);
    }

    public final af<Object> mo3341a(Class<?> cls) {
        return cls == this.a ? this : new C7098j((Class) cls, this.f20223b);
    }

    public final boolean mo1268a(af<?> afVar) {
        if (afVar.getClass() == getClass()) {
            C7098j c7098j = (C7098j) afVar;
            if (c7098j.mo1267a() == this.a && c7098j.f20223b == this.f20223b) {
                return true;
            }
        }
        return false;
    }

    public final af<Object> mo3342b() {
        return this;
    }

    public final Object mo3343b(Object obj) {
        try {
            return this.f20223b.m18621a(obj);
        } catch (RuntimeException e) {
            throw e;
        } catch (Throwable e2) {
            StringBuilder stringBuilder = new StringBuilder("Problem accessing property '");
            stringBuilder.append(this.f20223b.m18635e());
            stringBuilder.append("': ");
            stringBuilder.append(e2.getMessage());
            throw new IllegalStateException(stringBuilder.toString(), e2);
        }
    }
}
