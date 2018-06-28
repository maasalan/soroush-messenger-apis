package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1708a.C5446f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1763l;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.ao;
import java.util.Set;

final class C5456n implements ad, ao {
    final C5446f f15136a;
    final aj<?> f15137b;
    boolean f15138c = false;
    final /* synthetic */ C1723g f15139d;
    private C1763l f15140e = null;
    private Set<Scope> f15141f = null;

    public C5456n(C1723g c1723g, C5446f c5446f, aj<?> ajVar) {
        this.f15139d = c1723g;
        this.f15136a = c5446f;
        this.f15137b = ajVar;
    }

    final void m11779a() {
        if (this.f15138c && this.f15140e != null) {
            this.f15136a.m11755a(this.f15140e, this.f15141f);
        }
    }

    public final void mo1554a(ConnectionResult connectionResult) {
        this.f15139d.f5264d.post(new C1727o(this, connectionResult));
    }

    public final void mo1555a(C1763l c1763l, Set<Scope> set) {
        if (c1763l != null) {
            if (set != null) {
                this.f15140e = c1763l;
                this.f15141f = set;
                m11779a();
                return;
            }
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        mo1556b(new ConnectionResult(4));
    }

    public final void mo1556b(ConnectionResult connectionResult) {
        C6575i c6575i = (C6575i) this.f15139d.f5271n.get(this.f15137b);
        ac.m4380a(c6575i.f17996g.f5264d);
        c6575i.f17990a.m11752a();
        c6575i.mo3013a(connectionResult);
    }
}
