package com.p085c.p086a.p104f;

import android.support.v4.p038g.C4813a;
import com.p085c.p086a.p109i.C1270g;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class C1232d {
    public final C4813a<C1270g, List<Class<?>>> f3886a = new C4813a();
    private final AtomicReference<C1270g> f3887b = new AtomicReference();

    public final List<Class<?>> m2906a(Class<?> cls, Class<?> cls2) {
        List<Class<?>> list;
        Object obj = (C1270g) this.f3887b.getAndSet(null);
        if (obj == null) {
            obj = new C1270g(cls, cls2);
        } else {
            obj.m3011a(cls, cls2, null);
        }
        synchronized (this.f3886a) {
            list = (List) this.f3886a.get(obj);
        }
        this.f3887b.set(obj);
        return list;
    }
}
