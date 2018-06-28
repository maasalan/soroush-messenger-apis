package p000a.p001a.p002a;

import java.lang.reflect.Method;

final class C0013k {
    final Method f57a;
    final C0016n f58b;
    final Class<?> f59c;
    String f60d;

    C0013k(Method method, C0016n c0016n, Class<?> cls) {
        this.f57a = method;
        this.f58b = c0016n;
        this.f59c = cls;
    }

    private synchronized void m15a() {
        if (this.f60d == null) {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append(this.f57a.getDeclaringClass().getName());
            stringBuilder.append('#');
            stringBuilder.append(this.f57a.getName());
            stringBuilder.append('(');
            stringBuilder.append(this.f59c.getName());
            this.f60d = stringBuilder.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0013k)) {
            return false;
        }
        m15a();
        C0013k c0013k = (C0013k) obj;
        c0013k.m15a();
        return this.f60d.equals(c0013k.f60d);
    }

    public final int hashCode() {
        return this.f57a.hashCode();
    }
}
