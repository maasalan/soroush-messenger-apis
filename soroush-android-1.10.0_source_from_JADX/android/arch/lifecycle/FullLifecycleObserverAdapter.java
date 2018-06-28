package android.arch.lifecycle;

import android.arch.lifecycle.C0093d.C0091a;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    private final FullLifecycleObserver f17275a;

    FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver) {
        this.f17275a = fullLifecycleObserver;
    }

    public final void mo2476a(C0096g c0096g, C0091a c0091a) {
        switch (c0091a) {
            case ON_CREATE:
            case ON_START:
            case ON_RESUME:
            case ON_PAUSE:
            case ON_STOP:
            case ON_DESTROY:
                return;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
