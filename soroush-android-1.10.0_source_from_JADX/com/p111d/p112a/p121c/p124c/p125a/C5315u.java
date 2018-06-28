package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.io.Serializable;

public final class C5315u extends C1507k<Object> implements Serializable {
    protected final C1475c f14738a;
    protected final C1507k<Object> f14739b;

    public C5315u(C1475c c1475c, C1507k<?> c1507k) {
        this.f14738a = c1475c;
        this.f14739b = c1507k;
    }

    public final Class<?> mo1307a() {
        return this.f14739b.mo1307a();
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return this.f14739b.mo1308a(c5303j, c5347g, this.f14738a);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }

    public final Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        return this.f14739b.mo1309a(c5303j, c5347g, obj);
    }
}
