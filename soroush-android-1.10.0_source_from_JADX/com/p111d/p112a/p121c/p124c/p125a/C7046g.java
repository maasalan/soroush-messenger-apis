package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6492d;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.lang.reflect.Field;

public final class C7046g extends C6488s {
    protected final C6492d f20128c;
    protected final transient Field f20129d;

    private C7046g(C7046g c7046g, C1507k<?> c1507k) {
        super((C6488s) c7046g, (C1507k) c1507k);
        this.f20128c = c7046g.f20128c;
        this.f20129d = c7046g.f20129d;
    }

    private C7046g(C7046g c7046g, C1549v c1549v) {
        super((C6488s) c7046g, c1549v);
        this.f20128c = c7046g.f20128c;
        this.f20129d = c7046g.f20129d;
    }

    public C7046g(C1451n c1451n, C5354j c5354j, C1475c c1475c, C1517a c1517a, C6492d c6492d) {
        super(c1451n, c5354j, c1475c, c1517a);
        this.f20128c = c6492d;
        this.f20129d = c6492d.m15573f();
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7046g(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7046g(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        Object a = m15538a(c5303j, c5347g);
        try {
            this.f20129d.set(obj, a);
        } catch (Exception e) {
            m15541a(c5303j, e, a);
        }
    }

    public final void mo3336a(Object obj, Object obj2) {
        try {
            this.f20129d.set(obj, obj2);
        } catch (Exception e) {
            m15544a(e, obj2);
        }
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        Object a = m15538a(c5303j, c5347g);
        try {
            this.f20129d.set(obj, a);
            return obj;
        } catch (Exception e) {
            m15541a(c5303j, e, a);
            return obj;
        }
    }

    public final Object mo3338b(Object obj, Object obj2) {
        try {
            this.f20129d.set(obj, obj2);
            return obj;
        } catch (Exception e) {
            m15544a(e, obj2);
            return obj;
        }
    }

    public final C5328e mo1354c() {
        return this.f20128c;
    }
}
