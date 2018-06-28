package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class aq implements Callable<String> {
    private /* synthetic */ ap f5528a;

    aq(ap apVar) {
        this.f5528a = apVar;
    }

    public final /* synthetic */ Object call() {
        C1825u c1825u = this.f5528a;
        String a = c1825u.m15979a(c1825u.f6279f.m5161b().f5164a);
        return a == null ? c1825u.m15982d() : a;
    }
}
