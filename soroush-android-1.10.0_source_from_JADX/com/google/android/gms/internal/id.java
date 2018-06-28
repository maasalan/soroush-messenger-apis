package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class id implements Callable<String> {
    private /* synthetic */ hs f5989a;

    id(hs hsVar) {
        this.f5989a = hsVar;
    }

    public final /* synthetic */ Object call() {
        String z = this.f5989a.mo1624u().m16289z();
        if (z != null) {
            return z;
        }
        fv fvVar;
        String str;
        hp f = this.f5989a.mo1609f();
        String str2 = null;
        if (f.mo1622s().m16361z()) {
            fvVar = f.mo1623t().f18134a;
            str = "Cannot retrieve app instance id from analytics worker thread";
        } else {
            f.mo1622s();
            if (gm.m16332y()) {
                fvVar = f.mo1623t().f18134a;
                str = "Cannot retrieve app instance id from main thread";
            } else {
                long b = f.mo1614k().mo1576b();
                String a = f.m16389a(120000);
                long b2 = f.mo1614k().mo1576b() - b;
                str2 = (a != null || b2 >= 120000) ? a : f.m16389a(120000 - b2);
                if (str2 != null) {
                    throw new TimeoutException();
                }
                f = this.f5989a.mo1624u();
                synchronized (f.f18157l) {
                    f.f18155j = str2;
                    f.f18156k = f.mo1614k().mo1576b();
                }
                return str2;
            }
        }
        fvVar.m4846a(str);
        if (str2 != null) {
            f = this.f5989a.mo1624u();
            synchronized (f.f18157l) {
                f.f18155j = str2;
                f.f18156k = f.mo1614k().mo1576b();
            }
            return str2;
        }
        throw new TimeoutException();
    }
}
