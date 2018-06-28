package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.p124c.C1441r;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p124c.p125a.C1418q.C5312a;
import com.p111d.p112a.p121c.p124c.p125a.C1418q.C5313b;
import com.p111d.p112a.p121c.p124c.p125a.C1418q.C5314c;
import java.util.BitSet;

public final class C1419r {
    protected final C5303j f4487a;
    protected final C5347g f4488b;
    protected final C1416l f4489c;
    protected final Object[] f4490d;
    protected int f4491e;
    protected int f4492f;
    protected final BitSet f4493g;
    protected C1418q f4494h;
    protected Object f4495i;

    public C1419r(C5303j c5303j, C5347g c5347g, int i, C1416l c1416l) {
        this.f4487a = c5303j;
        this.f4488b = c5347g;
        this.f4491e = i;
        this.f4489c = c1416l;
        this.f4490d = new Object[i];
        this.f4493g = i < 32 ? null : new BitSet();
    }

    private Object m3499a(C6488s c6488s) {
        if (c6488s.mo3349e() != null) {
            return this.f4488b.m11458b(c6488s.mo3349e());
        }
        if (c6488s.m11340p()) {
            throw this.f4488b.m11446a("Missing required creator property '%s' (index %d)", c6488s.m15554f(), Integer.valueOf(c6488s.mo3339d()));
        } else if (!this.f4488b.m11452a(C5348h.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            return c6488s.m15561m().mo2803a(this.f4488b);
        } else {
            throw this.f4488b.m11446a("Missing creator property '%s' (index %d); DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES enabled", c6488s.m15554f(), Integer.valueOf(c6488s.mo3339d()));
        }
    }

    protected final C1418q m3500a() {
        return this.f4494h;
    }

    public final Object m3501a(C5347g c5347g, Object obj) {
        if (this.f4489c != null) {
            if (this.f4495i != null) {
                c5347g.mo2811a(this.f4495i, this.f4489c.f4477c, this.f4489c.f4478d).m3513a(obj);
                C6488s c6488s = this.f4489c.f4480f;
                if (c6488s != null) {
                    return c6488s.mo3338b(obj, this.f4495i);
                }
            }
            throw c5347g.m11446a("No _idValue when handleIdValue called, on instance of %s", obj.getClass().getName());
        }
        return obj;
    }

    public final void m3502a(C1441r c1441r, String str, Object obj) {
        this.f4494h = new C5312a(this.f4494h, obj, c1441r, str);
    }

    public final void m3503a(Object obj, Object obj2) {
        this.f4494h = new C5313b(this.f4494h, obj2, obj);
    }

    public final boolean m3504a(C6488s c6488s, Object obj) {
        int d = c6488s.mo3339d();
        this.f4490d[d] = obj;
        int i;
        if (this.f4493g == null) {
            i = this.f4492f;
            d = (1 << d) | i;
            if (i != d) {
                this.f4492f = d;
                d = this.f4491e - 1;
                this.f4491e = d;
                if (d <= 0) {
                    return true;
                }
            }
        } else if (!this.f4493g.get(d)) {
            i = this.f4491e - 1;
            this.f4491e = i;
            if (i <= 0) {
                return true;
            }
            this.f4493g.set(d);
        }
        return false;
    }

    public final boolean m3505a(String str) {
        if (this.f4489c == null || !str.equals(this.f4489c.f4476b.m4060b())) {
            return false;
        }
        this.f4495i = this.f4489c.m3492a(this.f4487a, this.f4488b);
        return true;
    }

    protected final Object[] m3506a(C6488s[] c6488sArr) {
        if (this.f4491e > 0) {
            int i = 0;
            int length;
            if (this.f4493g != null) {
                length = this.f4490d.length;
                while (true) {
                    i = this.f4493g.nextClearBit(i);
                    if (i >= length) {
                        break;
                    }
                    this.f4490d[i] = m3499a(c6488sArr[i]);
                    i++;
                }
            } else {
                length = this.f4492f;
                int length2 = this.f4490d.length;
                while (i < length2) {
                    if ((length & 1) == 0) {
                        this.f4490d[i] = m3499a(c6488sArr[i]);
                    }
                    i++;
                    length >>= 1;
                }
            }
        }
        return this.f4490d;
    }

    public final void m3507b(C6488s c6488s, Object obj) {
        this.f4494h = new C5314c(this.f4494h, obj, c6488s);
    }
}
