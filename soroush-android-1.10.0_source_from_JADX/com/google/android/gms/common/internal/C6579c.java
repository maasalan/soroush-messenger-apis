package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.api.C1708a.C5446f;
import com.google.android.gms.common.api.C1715e.C1713a;
import com.google.android.gms.common.api.C1715e.C1714b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;

public abstract class C6579c<T extends IInterface> extends ai<T> implements C5446f {
    private final aw f18034g;
    private final Set<Scope> f18035h;
    private final Account f18036i;

    protected C6579c(Context context, Looper looper, int i, aw awVar, C1713a c1713a, C1714b c1714b) {
        this(context, looper, C1758f.m4448a(context), C5458b.m11789a(), i, awVar, (C1713a) ac.m4376a((Object) c1713a), (C1714b) ac.m4376a((Object) c1714b));
    }

    private C6579c(Context context, Looper looper, C1758f c1758f, C5458b c5458b, int i, aw awVar, C1713a c1713a, C1714b c1714b) {
        ai aiVar = this;
        aw awVar2 = awVar;
        C1713a c1713a2 = c1713a;
        C1714b c1714b2 = c1714b;
        super(context, looper, c1758f, c5458b, i, c1713a2 == null ? null : new C5465d(c1713a2), c1714b2 == null ? null : new C5466e(c1714b2), awVar2.f5380e);
        aiVar.f18034g = awVar2;
        aiVar.f18036i = awVar2.f5376a;
        Set<Scope> set = awVar2.f5378c;
        for (Scope contains : set) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        aiVar.f18035h = set;
    }

    public final Account e_() {
        return this.f18036i;
    }

    protected final Set<Scope> mo3023f() {
        return this.f18035h;
    }

    public final zzc[] mo3024g() {
        return new zzc[0];
    }
}
