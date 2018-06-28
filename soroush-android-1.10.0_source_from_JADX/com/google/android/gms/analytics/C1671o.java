package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C1785d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C1671o {
    public final C1673q f5147a;
    public final C1785d f5148b;
    public boolean f5149c;
    public long f5150d;
    public long f5151e;
    public long f5152f;
    public boolean f5153g;
    final Map<Class<? extends C1672p>, C1672p> f5154h;
    final List<C1680u> f5155i;
    private long f5156j;
    private long f5157k;

    private C1671o(C1671o c1671o) {
        this.f5147a = c1671o.f5147a;
        this.f5148b = c1671o.f5148b;
        this.f5150d = c1671o.f5150d;
        this.f5151e = c1671o.f5151e;
        this.f5152f = c1671o.f5152f;
        this.f5156j = c1671o.f5156j;
        this.f5157k = c1671o.f5157k;
        this.f5155i = new ArrayList(c1671o.f5155i);
        this.f5154h = new HashMap(c1671o.f5154h.size());
        for (Entry entry : c1671o.f5154h.entrySet()) {
            C1672p c = C1671o.m4259c((Class) entry.getKey());
            ((C1672p) entry.getValue()).mo1585a(c);
            this.f5154h.put((Class) entry.getKey(), c);
        }
    }

    C1671o(C1673q c1673q, C1785d c1785d) {
        ac.m4376a((Object) c1673q);
        ac.m4376a((Object) c1785d);
        this.f5147a = c1673q;
        this.f5148b = c1785d;
        this.f5156j = 1800000;
        this.f5157k = 3024000000L;
        this.f5154h = new HashMap();
        this.f5155i = new ArrayList();
    }

    @TargetApi(19)
    private static <T extends C1672p> T m4259c(Class<T> cls) {
        try {
            return (C1672p) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("Linkage exception", e);
            }
        }
    }

    public final C1671o m4260a() {
        return new C1671o(this);
    }

    public final <T extends C1672p> T m4261a(Class<T> cls) {
        return (C1672p) this.f5154h.get(cls);
    }

    public final void m4262a(C1672p c1672p) {
        ac.m4376a((Object) c1672p);
        Class cls = c1672p.getClass();
        if (cls.getSuperclass() != C1672p.class) {
            throw new IllegalArgumentException();
        }
        c1672p.mo1585a(m4263b(cls));
    }

    public final <T extends C1672p> T m4263b(Class<T> cls) {
        C1672p c1672p = (C1672p) this.f5154h.get(cls);
        if (c1672p != null) {
            return c1672p;
        }
        T c = C1671o.m4259c(cls);
        this.f5154h.put(cls, c);
        return c;
    }
}
