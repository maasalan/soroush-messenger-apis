package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.C1712d.C1711a;
import com.google.android.gms.common.api.internal.ae;
import com.google.android.gms.common.api.internal.ai;

public final class C1738k {
    ae f5295a;
    private Looper f5296b;

    public final C1711a m4357a() {
        if (this.f5295a == null) {
            this.f5295a = new ai();
        }
        if (this.f5296b == null) {
            this.f5296b = Looper.getMainLooper();
        }
        return new C1711a(this.f5295a, this.f5296b);
    }
}
