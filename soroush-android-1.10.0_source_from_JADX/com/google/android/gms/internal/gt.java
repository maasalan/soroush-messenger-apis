package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class gt implements Callable<String> {
    private /* synthetic */ String f5893a;
    private /* synthetic */ gr f5894b;

    gt(gr grVar, String str) {
        this.f5894b = grVar;
        this.f5893a = str;
    }

    public final /* synthetic */ Object call() {
        es b = this.f5894b.m4912k().m16078b(this.f5893a);
        if (b != null) {
            return b.m4776b();
        }
        this.f5894b.m4906e().f18136c.m4846a("App info was null when attempting to get app instance id");
        return null;
    }
}
