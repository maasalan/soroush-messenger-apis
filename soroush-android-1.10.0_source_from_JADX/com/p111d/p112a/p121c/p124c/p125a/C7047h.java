package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.lang.reflect.Constructor;

public final class C7047h extends C6488s {
    protected final C6488s f20130c;
    protected final transient Constructor<?> f20131d;

    private C7047h(C7047h c7047h, C1507k<?> c1507k) {
        super((C6488s) c7047h, (C1507k) c1507k);
        this.f20130c = c7047h.f20130c.mo3333a((C1507k) c1507k);
        this.f20131d = c7047h.f20131d;
    }

    private C7047h(C7047h c7047h, C1549v c1549v) {
        super((C6488s) c7047h, c1549v);
        this.f20130c = c7047h.f20130c.mo3334a(c1549v);
        this.f20131d = c7047h.f20131d;
    }

    public C7047h(C6488s c6488s, Constructor<?> constructor) {
        super(c6488s);
        this.f20130c = c6488s;
        this.f20131d = constructor;
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7047h(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7047h(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        Object a;
        if (c5303j.getCurrentToken() == C1380m.VALUE_NULL) {
            a = this.l.mo2803a(c5347g);
        } else if (this.m != null) {
            a = this.l.mo1308a(c5303j, c5347g, this.m);
        } else {
            Object newInstance;
            try {
                newInstance = this.f20131d.newInstance(new Object[]{obj});
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Failed to instantiate class ");
                stringBuilder.append(this.f20131d.getDeclaringClass().getName());
                stringBuilder.append(", problem: ");
                stringBuilder.append(e.getMessage());
                C1527g.m3960a(e, stringBuilder.toString());
                newInstance = null;
            }
            this.l.mo1309a(c5303j, c5347g, newInstance);
            a = newInstance;
        }
        mo3336a(obj, a);
    }

    public final void mo3336a(Object obj, Object obj2) {
        this.f20130c.mo3336a(obj, obj2);
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        return mo3338b(obj, m15538a(c5303j, c5347g));
    }

    public final Object mo3338b(Object obj, Object obj2) {
        return this.f20130c.mo3338b(obj, obj2);
    }

    public final C5328e mo1354c() {
        return this.f20130c.mo1354c();
    }
}
