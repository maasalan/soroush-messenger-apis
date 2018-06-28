package com.p072b.p073a.p074a;

import com.p072b.p073a.p074a.C1026d.C5071a;
import com.p072b.p073a.p074a.p078e.C1028b;
import com.p072b.p073a.p074a.p079f.C1033b;
import com.p072b.p073a.p074a.p079f.p511a.C5079d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

final class C1023c {
    Set<String> f3308a;
    final C1075s f3309b;
    final String[] f3310c;
    final Collection<C1066j> f3311d = new ArrayList();
    final Collection<C1066j> f3312e = new ArrayList();
    private final C5071a f3313f;

    C1023c(C1075s c1075s, String[] strArr, C5071a c5071a) {
        this.f3309b = c1075s;
        this.f3310c = strArr;
        this.f3313f = c5071a;
    }

    final void m2497a(C5098l c5098l) {
        for (C1066j c1066j : this.f3311d) {
            try {
                c1066j.m2571a(3);
            } catch (Throwable th) {
                C1028b.m2505a(th, "job's on cancel has thrown an exception. Ignoring...", new Object[0]);
            }
            if (c1066j.f3476m.isPersistent()) {
                c5098l.f14233c.mo1067c(c1066j);
            }
        }
        if (this.f3313f != null) {
            Collection arrayList = new ArrayList(this.f3311d.size());
            Collection arrayList2 = new ArrayList(this.f3312e.size());
            for (C1066j c1066j2 : this.f3311d) {
                arrayList.add(c1066j2.f3476m);
            }
            for (C1066j c1066j22 : this.f3312e) {
                arrayList2.add(c1066j22.f3476m);
            }
            C1026d c1026d = new C1026d(arrayList, arrayList2);
            C1021b c1021b = c5098l.f14238h;
            C1033b c1033b = (C5079d) c1021b.f3304c.m2518a(C5079d.class);
            c1033b.f14183d = this.f3313f;
            c1033b.f14184e = c1026d;
            c1021b.f3302a.mo1082a(c1033b);
            c1021b.m2493a();
        }
        for (C1066j c1066j3 : this.f3311d) {
            c5098l.f14238h.m2495a(c1066j3.f3476m, true, c1066j3.f3481r);
        }
    }

    final boolean m2498a() {
        return this.f3308a.isEmpty();
    }
}
