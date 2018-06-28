package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5354j;

public final class C1483i {
    public final C5354j f4630a;
    public final C1382p f4631b;
    public final af<?> f4632c;
    public final C1545o<Object> f4633d;
    public final boolean f4634e;

    public C1483i(C5354j c5354j, C1382p c1382p, af<?> afVar, C1545o<?> c1545o, boolean z) {
        this.f4630a = c5354j;
        this.f4631b = c1382p;
        this.f4632c = afVar;
        this.f4633d = c1545o;
        this.f4634e = z;
    }

    public static C1483i m3821a(C5354j c5354j, C1549v c1549v, af<?> afVar, boolean z) {
        C5293j c5293j = null;
        String b = c1549v == null ? null : c1549v.m4060b();
        if (b != null) {
            c5293j = new C5293j(b);
        }
        return new C1483i(c5354j, c5293j, afVar, null, z);
    }
}
