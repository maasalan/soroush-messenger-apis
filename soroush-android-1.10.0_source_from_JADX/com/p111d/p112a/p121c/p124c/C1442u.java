package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C1375h;

public final class C1442u {
    private final Object f4538a;
    private final C1375h f4539b;
    private final Class<?> f4540c;

    public C1442u(Object obj, Class<?> cls, C1375h c1375h) {
        this.f4538a = obj;
        this.f4540c = cls;
        this.f4539b = c1375h;
    }

    public final String toString() {
        String str = "Object id [%s] (for %s) at %s";
        Object[] objArr = new Object[3];
        objArr[0] = this.f4538a;
        objArr[1] = this.f4540c == null ? "NULL" : this.f4540c.getName();
        objArr[2] = this.f4539b;
        return String.format(str, objArr);
    }
}
