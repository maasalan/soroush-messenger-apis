package android.arch.lifecycle;

import android.arch.lifecycle.C0088a.C0086a;
import android.arch.lifecycle.C0093d.C0091a;
import java.util.List;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    private final Object f17278a;
    private final C0086a f17279b = C0088a.f377a.m161b(this.f17278a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f17278a = obj;
    }

    public final void mo2476a(C0096g c0096g, C0091a c0091a) {
        C0086a c0086a = this.f17279b;
        Object obj = this.f17278a;
        C0086a.m157a((List) c0086a.f373a.get(c0091a), c0096g, c0091a, obj);
        C0086a.m157a((List) c0086a.f373a.get(C0091a.ON_ANY), c0096g, c0091a, obj);
    }
}
