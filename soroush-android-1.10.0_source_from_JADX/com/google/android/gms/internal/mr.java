package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class mr {
    private static final AtomicReference<mr> f6156a = new AtomicReference();

    private mr() {
    }

    public static mr m5010a() {
        f6156a.compareAndSet(null, new mr());
        return (mr) f6156a.get();
    }

    public static void m5011b() {
    }
}
