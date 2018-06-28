package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C1708a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ln;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class aw {
    public final Account f5376a;
    public final Set<Scope> f5377b;
    final Set<Scope> f5378c;
    public final String f5379d;
    final String f5380e;
    public final ln f5381f;
    public Integer f5382g;
    private final Map<C1708a<?>, ay> f5383h;
    private final int f5384i;
    private final View f5385j;

    public aw(Account account, Set<Scope> set, String str, String str2, ln lnVar) {
        this.f5376a = account;
        this.f5377b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f5383h = Collections.EMPTY_MAP;
        this.f5385j = null;
        this.f5384i = 0;
        this.f5379d = str;
        this.f5380e = str2;
        this.f5381f = lnVar;
        Set hashSet = new HashSet(this.f5377b);
        for (ay ayVar : this.f5383h.values()) {
            hashSet.addAll(ayVar.f5392a);
        }
        this.f5378c = Collections.unmodifiableSet(hashSet);
    }
}
