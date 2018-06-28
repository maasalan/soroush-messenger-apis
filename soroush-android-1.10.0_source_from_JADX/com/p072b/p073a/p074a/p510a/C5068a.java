package com.p072b.p073a.p074a.p510a;

import com.p072b.p073a.p074a.C1029e;
import com.p072b.p073a.p074a.C1066j;
import com.p072b.p073a.p074a.C1069m;
import java.util.Set;

public final class C5068a implements C1069m {
    private C1069m f14158a;
    private Integer f14159b;

    public C5068a(C1069m c1069m) {
        this.f14158a = c1069m;
    }

    private boolean m10314c() {
        return this.f14159b != null && this.f14159b.intValue() == 0;
    }

    public final int mo1058a() {
        if (this.f14159b == null) {
            this.f14159b = Integer.valueOf(this.f14158a.mo1058a());
        }
        return this.f14159b.intValue();
    }

    public final int mo1059a(C1029e c1029e) {
        return m10314c() ? 0 : this.f14158a.mo1059a(c1029e);
    }

    public final C1066j mo1060a(String str) {
        return this.f14158a.mo1060a(str);
    }

    public final void mo1061a(C1066j c1066j, C1066j c1066j2) {
        this.f14159b = null;
        this.f14158a.mo1061a(c1066j, c1066j2);
    }

    public final boolean mo1062a(C1066j c1066j) {
        this.f14159b = null;
        return this.f14158a.mo1062a(c1066j);
    }

    public final C1066j mo1063b(C1029e c1029e) {
        if (m10314c()) {
            return null;
        }
        C1066j b = this.f14158a.mo1063b(c1029e);
        if (!(b == null || this.f14159b == null)) {
            this.f14159b = Integer.valueOf(this.f14159b.intValue() - 1);
        }
        return b;
    }

    public final void mo1064b() {
        this.f14159b = null;
        this.f14158a.mo1064b();
    }

    public final boolean mo1065b(C1066j c1066j) {
        this.f14159b = null;
        return this.f14158a.mo1065b(c1066j);
    }

    public final Long mo1066c(C1029e c1029e) {
        return this.f14158a.mo1066c(c1029e);
    }

    public final void mo1067c(C1066j c1066j) {
        this.f14159b = null;
        this.f14158a.mo1067c(c1066j);
    }

    public final Set<C1066j> mo1068d(C1029e c1029e) {
        return this.f14158a.mo1068d(c1029e);
    }

    public final void mo1069d(C1066j c1066j) {
        this.f14159b = null;
        this.f14158a.mo1069d(c1066j);
    }
}
