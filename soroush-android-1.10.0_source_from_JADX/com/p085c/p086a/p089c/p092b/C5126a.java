package com.p085c.p086a.p089c.p092b;

import com.p085c.p086a.p089c.C1102a;
import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p089c.p090a.C1096b.C1095a;
import com.p085c.p086a.p089c.p092b.C1133d.C1132a;
import com.p085c.p086a.p089c.p097c.C1173m;
import com.p085c.p086a.p089c.p097c.C1173m.C1172a;
import java.io.File;
import java.util.List;

final class C5126a implements C1095a<Object>, C1133d {
    private List<C1208h> f14331a;
    private final C1134e<?> f14332b;
    private final C1132a f14333c;
    private int f14334d;
    private C1208h f14335e;
    private List<C1173m<File, ?>> f14336f;
    private int f14337g;
    private volatile C1172a<?> f14338h;
    private File f14339i;

    C5126a(C1134e<?> c1134e, C1132a c1132a) {
        this(c1134e.m2743c(), c1134e, c1132a);
    }

    C5126a(List<C1208h> list, C1134e<?> c1134e, C1132a c1132a) {
        this.f14334d = -1;
        this.f14331a = list;
        this.f14332b = c1134e;
        this.f14333c = c1132a;
    }

    private boolean m10538c() {
        return this.f14337g < this.f14336f.size();
    }

    public final void mo1140a(Exception exception) {
        this.f14333c.mo1164a(this.f14335e, exception, this.f14338h.f3738c, C1102a.DATA_DISK_CACHE);
    }

    public final void mo1141a(Object obj) {
        this.f14333c.mo1165a(this.f14335e, obj, this.f14338h.f3738c, C1102a.DATA_DISK_CACHE, this.f14335e);
    }

    public final boolean mo1142a() {
        boolean z;
        while (true) {
            z = false;
            if (this.f14336f != null) {
                if (m10538c()) {
                    break;
                }
            }
            this.f14334d++;
            if (this.f14334d >= this.f14331a.size()) {
                return false;
            }
            C1208h c1208h = (C1208h) this.f14331a.get(this.f14334d);
            this.f14339i = this.f14332b.m2737a().mo1144a(new C5135b(c1208h, this.f14332b.f3661n));
            if (this.f14339i != null) {
                this.f14335e = c1208h;
                this.f14336f = this.f14332b.m2738a(this.f14339i);
                this.f14337g = 0;
            }
        }
        this.f14338h = null;
        while (!z && m10538c()) {
            List list = this.f14336f;
            int i = this.f14337g;
            this.f14337g = i + 1;
            this.f14338h = ((C1173m) list.get(i)).mo1185a(this.f14339i, this.f14332b.f3652e, this.f14332b.f3653f, this.f14332b.f3656i);
            if (this.f14338h != null && this.f14332b.m2739a(this.f14338h.f3738c.mo1112d())) {
                this.f14338h.f3738c.mo1109a(this.f14332b.f3662o, this);
                z = true;
            }
        }
        return z;
    }

    public final void mo1143b() {
        C1172a c1172a = this.f14338h;
        if (c1172a != null) {
            c1172a.f3738c.mo1110b();
        }
    }
}
