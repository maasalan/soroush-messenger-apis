package com.p111d.p112a.p121c.p128f;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class C1450g implements Iterable<C7087f> {
    protected LinkedHashMap<C1456r, C7087f> f4548a;

    public final C7087f m3664a(String str, Class<?>[] clsArr) {
        return this.f4548a == null ? null : (C7087f) this.f4548a.get(new C1456r(str, clsArr));
    }

    public final C7087f m3665a(Method method) {
        return this.f4548a != null ? (C7087f) this.f4548a.remove(new C1456r(method)) : null;
    }

    public final void m3666a(C7087f c7087f) {
        if (this.f4548a == null) {
            this.f4548a = new LinkedHashMap();
        }
        this.f4548a.put(new C1456r(c7087f.m18494f()), c7087f);
    }

    public final boolean m3667a() {
        if (this.f4548a != null) {
            if (this.f4548a.size() != 0) {
                return false;
            }
        }
        return true;
    }

    public final C7087f m3668b(Method method) {
        return this.f4548a == null ? null : (C7087f) this.f4548a.get(new C1456r(method));
    }

    public final Iterator<C7087f> iterator() {
        return this.f4548a != null ? this.f4548a.values().iterator() : Collections.emptyList().iterator();
    }
}
