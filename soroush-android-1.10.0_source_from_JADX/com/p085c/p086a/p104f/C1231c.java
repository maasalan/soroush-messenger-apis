package com.p085c.p086a.p104f;

import android.support.v4.p038g.C4813a;
import com.p085c.p086a.p089c.p092b.C1158q;
import com.p085c.p086a.p109i.C1270g;
import java.util.concurrent.atomic.AtomicReference;

public final class C1231c {
    public final C4813a<C1270g, C1158q<?, ?, ?>> f3884a = new C4813a();
    private final AtomicReference<C1270g> f3885b = new AtomicReference();

    private C1270g m2903c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1270g c1270g = (C1270g) this.f3885b.getAndSet(null);
        if (c1270g == null) {
            c1270g = new C1270g();
        }
        c1270g.m3011a(cls, cls2, cls3);
        return c1270g;
    }

    public final boolean m2904a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        boolean containsKey;
        C1270g c = m2903c(cls, cls2, cls3);
        synchronized (this.f3884a) {
            containsKey = this.f3884a.containsKey(c);
        }
        this.f3885b.set(c);
        return containsKey;
    }

    public final <Data, TResource, Transcode> C1158q<Data, TResource, Transcode> m2905b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1158q<Data, TResource, Transcode> c1158q;
        C1270g c = m2903c(cls, cls2, cls3);
        synchronized (this.f3884a) {
            c1158q = (C1158q) this.f3884a.get(c);
        }
        this.f3885b.set(c);
        return c1158q;
    }
}
