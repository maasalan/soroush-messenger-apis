package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6493h;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1517a;

public final class C7082k extends C6488s {
    protected final C6493h f20194c;
    protected final Object f20195d;
    protected final int f20196e;
    protected C6488s f20197f;

    private C7082k(C7082k c7082k, C1507k<?> c1507k) {
        super((C6488s) c7082k, (C1507k) c1507k);
        this.f20194c = c7082k.f20194c;
        this.f20196e = c7082k.f20196e;
        this.f20195d = c7082k.f20195d;
        this.f20197f = c7082k.f20197f;
    }

    private C7082k(C7082k c7082k, C1549v c1549v) {
        super((C6488s) c7082k, c1549v);
        this.f20194c = c7082k.f20194c;
        this.f20196e = c7082k.f20196e;
        this.f20195d = c7082k.f20195d;
        this.f20197f = c7082k.f20197f;
    }

    public C7082k(C1549v c1549v, C5354j c5354j, C1549v c1549v2, C1475c c1475c, C1517a c1517a, C6493h c6493h, int i, Object obj, C1548u c1548u) {
        super(c1549v, c5354j, c1549v2, c1475c, c1517a, c1548u);
        this.f20194c = c6493h;
        this.f20196e = i;
        this.f20195d = obj;
        this.f20197f = null;
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7082k(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7082k(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        mo3336a(obj, m15538a(c5303j, c5347g));
    }

    public final void m18457a(C6488s c6488s) {
        this.f20197f = c6488s;
    }

    public final void mo3336a(Object obj, Object obj2) {
        if (this.f20197f == null) {
            StringBuilder stringBuilder = new StringBuilder("No fallback setter/field defined: can not use creator property for ");
            stringBuilder.append(getClass().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.f20197f.mo3336a(obj, obj2);
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        return mo3338b(obj, m15538a(c5303j, c5347g));
    }

    public final Object mo3338b(Object obj, Object obj2) {
        if (this.f20197f != null) {
            return this.f20197f.mo3338b(obj, obj2);
        }
        StringBuilder stringBuilder = new StringBuilder("No fallback setter/field defined: can not use creator property for ");
        stringBuilder.append(getClass().getName());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final C5328e mo1354c() {
        return this.f20194c;
    }

    public final int mo3339d() {
        return this.f20196e;
    }

    public final Object mo3349e() {
        return this.f20195d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[creator property, name '");
        stringBuilder.append(m15554f());
        stringBuilder.append("'; inject id '");
        stringBuilder.append(this.f20195d);
        stringBuilder.append("']");
        return stringBuilder.toString();
    }
}
