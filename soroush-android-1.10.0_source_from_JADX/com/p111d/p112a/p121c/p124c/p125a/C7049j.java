package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.lang.reflect.Method;

public final class C7049j extends C6488s {
    protected final C7087f f20136c;
    protected final transient Method f20137d;

    private C7049j(C7049j c7049j, C1507k<?> c1507k) {
        super((C6488s) c7049j, (C1507k) c1507k);
        this.f20136c = c7049j.f20136c;
        this.f20137d = c7049j.f20137d;
    }

    private C7049j(C7049j c7049j, C1549v c1549v) {
        super((C6488s) c7049j, c1549v);
        this.f20136c = c7049j.f20136c;
        this.f20137d = c7049j.f20137d;
    }

    public C7049j(C1451n c1451n, C5354j c5354j, C1475c c1475c, C1517a c1517a, C7087f c7087f) {
        super(c1451n, c5354j, c1475c, c1517a);
        this.f20136c = c7087f;
        this.f20137d = c7087f.m18494f();
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7049j(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7049j(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        Object a = m15538a(c5303j, c5347g);
        try {
            this.f20137d.invoke(obj, new Object[]{a});
        } catch (Exception e) {
            m15541a(c5303j, e, a);
        }
    }

    public final void mo3336a(Object obj, Object obj2) {
        try {
            this.f20137d.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            m15544a(e, obj2);
        }
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        try {
            Object invoke = this.f20137d.invoke(obj, new Object[]{m15538a(c5303j, c5347g)});
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            m15541a(c5303j, e, r5);
            return null;
        }
    }

    public final Object mo3338b(Object obj, Object obj2) {
        try {
            Object invoke = this.f20137d.invoke(obj, new Object[]{obj2});
            return invoke == null ? obj : invoke;
        } catch (Exception e) {
            m15544a(e, obj2);
            return null;
        }
    }

    public final C5328e mo1354c() {
        return this.f20136c;
    }
}
