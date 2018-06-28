package com.p111d.p112a.p121c.p137l;

import com.p111d.p112a.p121c.C5354j;
import java.util.ArrayList;
import java.util.Iterator;

public final class C1510c {
    protected final C1510c f4686a;
    protected final Class<?> f4687b;
    ArrayList<C7125i> f4688c;

    C1510c(C1510c c1510c, Class<?> cls) {
        this.f4686a = c1510c;
        this.f4687b = cls;
    }

    public C1510c(Class<?> cls) {
        this(null, cls);
    }

    public final C1510c m3895a(Class<?> cls) {
        if (this.f4687b == cls) {
            return this;
        }
        for (C1510c c1510c = this.f4686a; c1510c != null; c1510c = c1510c.f4686a) {
            if (c1510c.f4687b == cls) {
                return c1510c;
            }
        }
        return null;
    }

    public final void m3896a(C5354j c5354j) {
        if (this.f4688c != null) {
            Iterator it = this.f4688c.iterator();
            while (it.hasNext()) {
                ((C7125i) it.next()).m18711b(c5354j);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ClassStack (self-refs: ");
        stringBuilder.append(this.f4688c == null ? "0" : String.valueOf(this.f4688c.size()));
        stringBuilder.append(')');
        for (C1510c c1510c = this; c1510c != null; c1510c = c1510c.f4686a) {
            stringBuilder.append(' ');
            stringBuilder.append(c1510c.f4687b.getName());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
