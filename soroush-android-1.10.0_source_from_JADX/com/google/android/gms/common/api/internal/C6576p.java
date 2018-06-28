package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.C1708a.C1704a;
import com.google.android.gms.common.api.C1712d;

public final class C6576p<O extends C1704a> extends C5452e {
    private final C1712d<O> f18002a;

    public C6576p(C1712d<O> c1712d) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f18002a = c1712d;
    }

    public final Looper mo3015a() {
        return this.f18002a.f5225e;
    }
}
