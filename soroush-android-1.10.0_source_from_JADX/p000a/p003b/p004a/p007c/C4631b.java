package p000a.p003b.p004a.p007c;

import java.util.Collections;
import java.util.Set;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0041d.C4642a;
import p000a.p003b.p004a.C0076k;
import p000a.p003b.p004a.p014i.C4665q;

public final class C4631b extends C0041d {
    public final Set<C0034g> f12738r;
    private final Set<C0076k<C4665q>> f12739s;

    C4631b(C4642a c4642a, Set<C0076k<C4665q>> set, Set<C0034g> set2) {
        boolean z;
        if (set2 != null) {
            if (!set2.isEmpty()) {
                z = false;
                c4642a.f113i = z;
                super(c4642a);
                this.f12739s = Collections.unmodifiableSet(set);
                this.f12738r = set2 != null ? Collections.emptySet() : Collections.unmodifiableSet(set2);
            }
        }
        z = true;
        c4642a.f113i = z;
        super(c4642a);
        this.f12739s = Collections.unmodifiableSet(set);
        if (set2 != null) {
        }
        this.f12738r = set2 != null ? Collections.emptySet() : Collections.unmodifiableSet(set2);
    }
}
