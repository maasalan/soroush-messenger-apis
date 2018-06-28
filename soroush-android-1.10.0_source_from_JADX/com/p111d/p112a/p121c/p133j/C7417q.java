package com.p111d.p112a.p121c.p133j;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C1345a;
import com.p111d.p112a.p121c.aa;

public final class C7417q extends C7280r {
    static final C7417q f21543a = new C7417q("");
    protected final String f21544b;

    private C7417q(String str) {
        this.f21544b = str;
    }

    protected static void m19732a(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\"');
        C1345a.m3179a(stringBuilder, str);
        stringBuilder.append('\"');
    }

    public static C7417q m19733b(String str) {
        return str == null ? null : str.length() == 0 ? f21543a : new C7417q(str);
    }

    public final void mo1483a(C5301g c5301g, aa aaVar) {
        if (this.f21544b == null) {
            c5301g.writeNull();
        } else {
            c5301g.writeString(this.f21544b);
        }
    }

    public final String mo3532b() {
        return this.f21544b;
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj != null && (obj instanceof C7417q)) ? ((C7417q) obj).f21544b.equals(this.f21544b) : false;
    }

    public final int hashCode() {
        return this.f21544b.hashCode();
    }

    public final String toString() {
        int length = this.f21544b.length();
        StringBuilder stringBuilder = new StringBuilder((length + 2) + (length >> 4));
        C7417q.m19732a(stringBuilder, this.f21544b);
        return stringBuilder.toString();
    }
}
