package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p124c.p125a.C1411c;
import com.p111d.p112a.p121c.p124c.p125a.C1416l;
import com.p111d.p112a.p121c.p124c.p125a.C6471w;
import com.p111d.p112a.p121c.p124c.p125a.C7051n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class C1431e {
    protected final C1445c f4516a;
    protected final boolean f4517b;
    protected final boolean f4518c;
    protected final Map<String, C6488s> f4519d = new LinkedHashMap();
    protected List<C6471w> f4520e;
    protected HashMap<String, C6488s> f4521f;
    protected HashSet<String> f4522g;
    protected C1443v f4523h;
    protected C1416l f4524i;
    protected C1441r f4525j;
    protected boolean f4526k;
    protected C7087f f4527l;
    protected C1393a f4528m;

    public C1431e(C1445c c1445c, C7089f c7089f) {
        this.f4516a = c1445c;
        this.f4517b = c7089f.m11077a(C5385q.DEFAULT_VIEW_INCLUSION);
        this.f4518c = c7089f.m11077a(C5385q.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
    }

    public final C1441r m3524a() {
        return this.f4525j;
    }

    public final C6488s m3525a(C1549v c1549v) {
        return (C6488s) this.f4519d.get(c1549v.m4060b());
    }

    public final C1507k<?> m3526a(C5354j c5354j, String str) {
        boolean z;
        if (this.f4527l != null) {
            Class p = this.f4527l.m18503p();
            Class e = c5354j.m11531e();
            if (!(p == e || p.isAssignableFrom(e) || e.isAssignableFrom(p))) {
                StringBuilder stringBuilder = new StringBuilder("Build method '");
                stringBuilder.append(this.f4527l.m18501n());
                stringBuilder.append(" has bad return type (");
                stringBuilder.append(p.getName());
                stringBuilder.append("), not compatible with POJO type (");
                stringBuilder.append(c5354j.m11531e().getName());
                stringBuilder.append(")");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else if (!str.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder("Builder class ");
            stringBuilder2.append(this.f4516a.m3619b().getName());
            stringBuilder2.append(" does not have build method (name: '");
            stringBuilder2.append(str);
            stringBuilder2.append("')");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        Collection<C6488s> values = this.f4519d.values();
        C1411c a = C1411c.m3454a(values, this.f4518c);
        a.m3460a();
        boolean z2 = this.f4517b ^ 1;
        if (!z2) {
            for (C6488s o : values) {
                if (o.m15563o()) {
                    z = true;
                    break;
                }
            }
        }
        z = z2;
        if (this.f4524i != null) {
            a = a.m3461a(new C7051n(this.f4524i, C1548u.f4828a));
        }
        return new C7081h(this, this.f4516a, a, this.f4521f, this.f4522g, this.f4526k, z);
    }

    public final void m3527a(C1416l c1416l) {
        this.f4524i = c1416l;
    }

    public final void m3528a(C1441r c1441r) {
        if (this.f4525j != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.f4525j = c1441r;
    }

    public final void m3529a(C6488s c6488s) {
        this.f4519d.put(c6488s.m15554f(), c6488s);
    }

    public final void m3530a(C1443v c1443v) {
        this.f4523h = c1443v;
    }

    public final void m3531a(C7087f c7087f, C1393a c1393a) {
        this.f4527l = c7087f;
        this.f4528m = c1393a;
    }

    public final void m3532a(C1549v c1549v, C5354j c5354j, C1517a c1517a, C5328e c5328e, Object obj) {
        if (this.f4520e == null) {
            this.f4520e = new ArrayList();
        }
        this.f4520e.add(new C6471w(c1549v, c5354j, c1517a, c5328e, obj));
    }

    public final void m3533a(String str) {
        if (this.f4522g == null) {
            this.f4522g = new HashSet();
        }
        this.f4522g.add(str);
    }

    public final void m3534a(String str, C6488s c6488s) {
        if (this.f4521f == null) {
            this.f4521f = new HashMap(4);
        }
        this.f4521f.put(str, c6488s);
        if (this.f4519d != null) {
            this.f4519d.remove(c6488s.m15554f());
        }
    }

    public final void m3535a(boolean z) {
        this.f4526k = z;
    }

    public final C1443v m3536b() {
        return this.f4523h;
    }

    public final void m3537b(C6488s c6488s) {
        C6488s c6488s2 = (C6488s) this.f4519d.put(c6488s.m15554f(), c6488s);
        if (c6488s2 != null && c6488s2 != c6488s) {
            StringBuilder stringBuilder = new StringBuilder("Duplicate property '");
            stringBuilder.append(c6488s.m15554f());
            stringBuilder.append("' for ");
            stringBuilder.append(this.f4516a.m3615a());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final List<C6471w> m3538c() {
        return this.f4520e;
    }

    public final void m3539c(C6488s c6488s) {
        m3537b(c6488s);
    }

    public final C1416l m3540d() {
        return this.f4524i;
    }

    public final C7087f m3541e() {
        return this.f4527l;
    }

    public final C1507k<?> m3542f() {
        boolean z;
        Collection<C6488s> values = this.f4519d.values();
        C1411c a = C1411c.m3454a(values, this.f4518c);
        a.m3460a();
        boolean z2 = this.f4517b ^ 1;
        if (!z2) {
            for (C6488s o : values) {
                if (o.m15563o()) {
                    z = true;
                    break;
                }
            }
        }
        z = z2;
        if (this.f4524i != null) {
            a = a.m3461a(new C7051n(this.f4524i, C1548u.f4828a));
        }
        return new C7080c(this, this.f4516a, a, this.f4521f, this.f4522g, this.f4526k, z);
    }

    public final C5316a m3543g() {
        return new C5316a(this, this.f4516a, this.f4521f);
    }
}
