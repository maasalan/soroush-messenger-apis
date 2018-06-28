package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.lang.reflect.Method;

public final class C7053t extends C6488s {
    protected final C7087f f20140c;
    protected final Method f20141d;

    private C7053t(C7053t c7053t, C1507k<?> c1507k) {
        super((C6488s) c7053t, (C1507k) c1507k);
        this.f20140c = c7053t.f20140c;
        this.f20141d = c7053t.f20141d;
    }

    private C7053t(C7053t c7053t, C1549v c1549v) {
        super((C6488s) c7053t, c1549v);
        this.f20140c = c7053t.f20140c;
        this.f20141d = c7053t.f20141d;
    }

    public C7053t(C1451n c1451n, C5354j c5354j, C1475c c1475c, C1517a c1517a, C7087f c7087f) {
        super(c1451n, c5354j, c1475c, c1517a);
        this.f20140c = c7087f;
        this.f20141d = c7087f.m18494f();
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7053t(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7053t(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        if (c5303j.getCurrentToken() != C1380m.VALUE_NULL) {
            StringBuilder stringBuilder;
            if (this.m != null) {
                stringBuilder = new StringBuilder("Problem deserializing 'setterless' property (\"");
                stringBuilder.append(m15554f());
                stringBuilder.append("\"): no way to handle typed deser with setterless yet");
                throw C5364l.m11572a(c5303j, stringBuilder.toString());
            }
            try {
                obj = this.f20141d.invoke(obj, new Object[0]);
                if (obj == null) {
                    stringBuilder = new StringBuilder("Problem deserializing 'setterless' property '");
                    stringBuilder.append(m15554f());
                    stringBuilder.append("': get method returned null");
                    throw C5364l.m11572a(c5303j, stringBuilder.toString());
                }
                this.l.mo1309a(c5303j, c5347g, obj);
            } catch (Exception e) {
                C6488s.m15533a(c5303j, e);
            }
        }
    }

    public final void mo3336a(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call 'set' on setterless property");
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        mo3335a(c5303j, c5347g, obj);
        return obj;
    }

    public final Object mo3338b(Object obj, Object obj2) {
        mo3336a(obj, obj2);
        return null;
    }

    public final C5328e mo1354c() {
        return this.f20140c;
    }
}
