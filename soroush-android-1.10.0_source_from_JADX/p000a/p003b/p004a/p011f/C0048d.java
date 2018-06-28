package p000a.p003b.p004a.p011f;

import java.util.Collections;
import java.util.Set;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0041d.C6319c;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.p007c.C0034g;
import p000a.p003b.p004a.p014i.C0061g;

public final class C0048d<D extends C0061g> {
    public final C0065j f217a;
    public final C6319c f218b;
    public final boolean f219c;
    public final Set<C0034g> f220d;
    private final Set<D> f221e;
    private C4647b f222f;

    C0048d(C0065j c0065j, C0041d c0041d, Set<C0034g> set) {
        boolean z;
        this.f217a = c0065j;
        this.f218b = c0041d.f155c;
        Set a = c0041d.m58a(c0065j);
        this.f221e = a == null ? Collections.emptySet() : Collections.unmodifiableSet(a);
        if (set == null) {
            this.f220d = null;
            z = false;
        } else {
            this.f220d = Collections.unmodifiableSet(set);
            z = this.f220d.isEmpty();
        }
        this.f219c = z;
    }

    public final boolean m89a() {
        return this.f218b == C6319c.NO_ERROR;
    }

    public final Set<D> m90b() {
        m91c();
        return this.f221e;
    }

    public final void m91c() {
        Throwable th;
        if (m89a()) {
            th = null;
        } else {
            if (this.f222f == null) {
                this.f222f = new C4647b(this.f217a, this.f218b);
            }
            th = this.f222f;
        }
        if (th != null) {
            throw new IllegalStateException("Can not perform operation because the DNS resolution was unsuccessful", th);
        }
    }
}
