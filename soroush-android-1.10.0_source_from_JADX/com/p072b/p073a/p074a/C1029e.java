package com.p072b.p073a.p074a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C1029e {
    public int f3318a;
    public C1075s f3319b;
    public final Set<String> f3320c = new HashSet();
    public final List<String> f3321d = new ArrayList();
    public final List<String> f3322e = new ArrayList();
    public boolean f3323f;
    public Long f3324g;
    public long f3325h;

    final void m2509a() {
        this.f3318a = 2;
        this.f3319b = null;
        this.f3320c.clear();
        this.f3321d.clear();
        this.f3322e.clear();
        this.f3323f = false;
        this.f3324g = null;
        this.f3325h = Long.MIN_VALUE;
    }

    final void m2510a(Collection<String> collection) {
        this.f3321d.clear();
        if (collection != null) {
            this.f3321d.addAll(collection);
        }
    }

    final void m2511a(String[] strArr) {
        this.f3320c.clear();
        if (strArr != null) {
            Collections.addAll(this.f3320c, strArr);
        }
    }
}
