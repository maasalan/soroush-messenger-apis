package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p092b.C1133d.C1132a;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import java.io.File;
import java.util.List;

final class C5155t implements C1095a<Object>, C1133d {
    private final C1132a f14447a;
    private final C1134e<?> f14448b;
    private int f14449c = 0;
    private int f14450d = -1;
    private C1208h f14451e;
    private List<C1173m<File, ?>> f14452f;
    private int f14453g;
    private volatile C1172a<?> f14454h;
    private File f14455i;
    private C5156u f14456j;

    public C5155t(C1134e<?> c1134e, C1132a c1132a) {
        this.f14448b = c1134e;
        this.f14447a = c1132a;
    }

    private boolean m10632c() {
        return this.f14453g < this.f14452f.size();
    }

    public final void mo1140a(Exception exception) {
        this.f14447a.mo1164a(this.f14456j, exception, this.f14454h.f3738c, C1102a.RESOURCE_DISK_CACHE);
    }

    public final void mo1141a(Object obj) {
        this.f14447a.mo1165a(this.f14451e, obj, this.f14454h.f3738c, C1102a.RESOURCE_DISK_CACHE, this.f14456j);
    }

    public final boolean mo1142a() {
        List c = this.f14448b.m2743c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        C1134e c1134e = this.f14448b;
        List b = c1134e.f3650c.f3874b.m2979b(c1134e.f3651d.getClass(), c1134e.f3654g, c1134e.f3658k);
        while (true) {
            if (this.f14452f != null) {
                if (m10632c()) {
                    break;
                }
            }
            this.f14450d++;
            if (this.f14450d >= b.size()) {
                this.f14449c++;
                if (this.f14449c >= c.size()) {
                    return false;
                }
                this.f14450d = 0;
            }
            C1208h c1208h = (C1208h) c.get(this.f14449c);
            Class cls = (Class) b.get(this.f14450d);
            C1208h c1208h2 = c1208h;
            this.f14456j = new C5156u(c1208h2, this.f14448b.f3661n, this.f14448b.f3652e, this.f14448b.f3653f, this.f14448b.m2742c(cls), cls, this.f14448b.f3656i);
            this.f14455i = this.f14448b.m2737a().mo1144a(this.f14456j);
            if (this.f14455i != null) {
                this.f14451e = c1208h;
                this.f14452f = this.f14448b.m2738a(this.f14455i);
                this.f14453g = 0;
            }
        }
        this.f14454h = null;
        while (!z && m10632c()) {
            c = this.f14452f;
            int i = this.f14453g;
            this.f14453g = i + 1;
            this.f14454h = ((C1173m) c.get(i)).mo1185a(this.f14455i, this.f14448b.f3652e, this.f14448b.f3653f, this.f14448b.f3656i);
            if (this.f14454h != null && this.f14448b.m2739a(this.f14454h.f3738c.mo1112d())) {
                this.f14454h.f3738c.mo1109a(this.f14448b.f3662o, this);
                z = true;
            }
        }
        return z;
    }

    public final void mo1143b() {
        C1172a c1172a = this.f14454h;
        if (c1172a != null) {
            c1172a.f3738c.mo1110b();
        }
    }
}
