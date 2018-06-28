package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.aa;

public final class C7412e extends C7280r {
    public static final C7412e f21537a = new C7412e(true);
    public static final C7412e f21538b = new C7412e(false);
    private final boolean f21539c;

    private C7412e(boolean z) {
        this.f21539c = z;
    }

    public static C7412e m19710f() {
        return f21537a;
    }

    public static C7412e m19711g() {
        return f21538b;
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        c5301g.writeBoolean(this.f21539c);
    }

    public final String mo3532b() {
        return this.f21539c ? "true" : "false";
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : obj != null && (obj instanceof C7412e) && this.f21539c == ((C7412e) obj).f21539c;
    }

    public final int hashCode() {
        return this.f21539c ? 3 : 1;
    }
}
