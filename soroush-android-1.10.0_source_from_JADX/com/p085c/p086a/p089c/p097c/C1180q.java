package com.p085c.p086a.p089c.p097c;

import android.support.v4.p038g.C0480k.C0479a;
import com.p085c.p086a.C1254h.C5277c;
import com.p085c.p086a.p089c.C5253j;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import com.p085c.p086a.p109i.C1271h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C1180q {
    private static final C1179c f3746a = new C1179c();
    private static final C1173m<Object, Object> f3747b = new C5200a();
    private final List<C1178b<?, ?>> f3748c;
    private final C1179c f3749d;
    private final Set<C1178b<?, ?>> f3750e;
    private final C0479a<List<Exception>> f3751f;

    private static class C1178b<Model, Data> {
        final Class<Data> f3743a;
        final C1174n<Model, Data> f3744b;
        private final Class<Model> f3745c;

        public C1178b(Class<Model> cls, Class<Data> cls2, C1174n<Model, Data> c1174n) {
            this.f3745c = cls;
            this.f3743a = cls2;
            this.f3744b = c1174n;
        }

        public final boolean m2801a(Class<?> cls) {
            return this.f3745c.isAssignableFrom(cls);
        }
    }

    static class C1179c {
        C1179c() {
        }
    }

    private static class C5200a implements C1173m<Object, Object> {
        C5200a() {
        }

        public final C1172a<Object> mo1185a(Object obj, int i, int i2, C5253j c5253j) {
            return null;
        }

        public final boolean mo1186a(Object obj) {
            return false;
        }
    }

    public C1180q(C0479a<List<Exception>> c0479a) {
        this(c0479a, f3746a);
    }

    private C1180q(C0479a<List<Exception>> c0479a, C1179c c1179c) {
        this.f3748c = new ArrayList();
        this.f3750e = new HashSet();
        this.f3751f = c0479a;
        this.f3749d = c1179c;
    }

    private <Model, Data> C1173m<Model, Data> m2802a(C1178b<?, ?> c1178b) {
        return (C1173m) C1271h.m3012a(c1178b.f3744b.mo1184a(this), "Argument must not be null");
    }

    public final synchronized <Model, Data> C1173m<Model, Data> m2803a(Class<Model> cls, Class<Data> cls2) {
        try {
            List arrayList = new ArrayList();
            int i = 0;
            for (C1178b c1178b : this.f3748c) {
                if (this.f3750e.contains(c1178b)) {
                    i = 1;
                } else {
                    int i2 = (c1178b.m2801a(cls) && c1178b.f3743a.isAssignableFrom(cls2)) ? 1 : 0;
                    if (i2 != 0) {
                        this.f3750e.add(c1178b);
                        arrayList.add(m2802a(c1178b));
                        this.f3750e.remove(c1178b);
                    }
                }
            }
            if (arrayList.size() > 1) {
                return new C5199p(arrayList, this.f3751f);
            } else if (arrayList.size() == 1) {
                return (C1173m) arrayList.get(0);
            } else if (i != 0) {
                return f3747b;
            } else {
                throw new C5277c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f3750e.clear();
        }
    }

    final synchronized <Model> List<C1173m<Model, ?>> m2804a(Class<Model> cls) {
        List<C1173m<Model, ?>> arrayList;
        try {
            arrayList = new ArrayList();
            for (C1178b c1178b : this.f3748c) {
                if (!this.f3750e.contains(c1178b) && c1178b.m2801a(cls)) {
                    this.f3750e.add(c1178b);
                    arrayList.add(m2802a(c1178b));
                    this.f3750e.remove(c1178b);
                }
            }
        } catch (Throwable th) {
            this.f3750e.clear();
        }
        return arrayList;
    }

    final synchronized <Model, Data> void m2805a(Class<Model> cls, Class<Data> cls2, C1174n<Model, Data> c1174n) {
        this.f3748c.add(this.f3748c.size(), new C1178b(cls, cls2, c1174n));
    }

    final synchronized List<Class<?>> m2806b(Class<?> cls) {
        List<Class<?>> arrayList;
        arrayList = new ArrayList();
        for (C1178b c1178b : this.f3748c) {
            if (!arrayList.contains(c1178b.f3743a) && c1178b.m2801a(cls)) {
                arrayList.add(c1178b.f3743a);
            }
        }
        return arrayList;
    }
}
