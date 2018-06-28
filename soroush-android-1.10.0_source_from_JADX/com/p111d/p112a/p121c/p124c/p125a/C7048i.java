package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p138m.C1517a;
import java.util.Collection;
import java.util.Map;

public final class C7048i extends C6488s {
    protected final String f20132c;
    protected final boolean f20133d;
    protected final C6488s f20134e;
    protected final C6488s f20135f;

    private C7048i(C7048i c7048i, C1507k<?> c1507k) {
        super((C6488s) c7048i, (C1507k) c1507k);
        this.f20132c = c7048i.f20132c;
        this.f20133d = c7048i.f20133d;
        this.f20134e = c7048i.f20134e;
        this.f20135f = c7048i.f20135f;
    }

    private C7048i(C7048i c7048i, C1549v c1549v) {
        super((C6488s) c7048i, c1549v);
        this.f20132c = c7048i.f20132c;
        this.f20133d = c7048i.f20133d;
        this.f20134e = c7048i.f20134e;
        this.f20135f = c7048i.f20135f;
    }

    public C7048i(C6488s c6488s, String str, C6488s c6488s2, C1517a c1517a, boolean z) {
        super(c6488s.m15555g(), c6488s.mo1350a(), c6488s.m15556h(), c6488s.m15562n(), c1517a, c6488s.mo1353b());
        this.f20132c = str;
        this.f20134e = c6488s;
        this.f20135f = c6488s2;
        this.f20133d = z;
    }

    public final /* synthetic */ C6488s mo3333a(C1507k c1507k) {
        return new C7048i(this, c1507k);
    }

    public final /* synthetic */ C6488s mo3334a(C1549v c1549v) {
        return new C7048i(this, c1549v);
    }

    public final void mo3335a(C5303j c5303j, C5347g c5347g, Object obj) {
        mo3338b(obj, this.f20134e.m15538a(c5303j, c5347g));
    }

    public final void mo3336a(Object obj, Object obj2) {
        mo3338b(obj, obj2);
    }

    public final Object mo3337b(C5303j c5303j, C5347g c5347g, Object obj) {
        return mo3338b(obj, m15538a(c5303j, c5347g));
    }

    public final Object mo3338b(Object obj, Object obj2) {
        if (obj2 != null) {
            if (!this.f20133d) {
                this.f20135f.mo3336a(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this.f20135f.mo3336a(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object next : (Collection) obj2) {
                    if (next != null) {
                        this.f20135f.mo3336a(next, obj);
                    }
                }
            } else if (obj2 instanceof Map) {
                for (Object next2 : ((Map) obj2).values()) {
                    if (next2 != null) {
                        this.f20135f.mo3336a(next2, obj);
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unsupported container type (");
                stringBuilder.append(obj2.getClass().getName());
                stringBuilder.append(") when resolving reference '");
                stringBuilder.append(this.f20132c);
                stringBuilder.append("'");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return this.f20134e.mo3338b(obj, obj2);
    }

    public final C5328e mo1354c() {
        return this.f20134e.mo1354c();
    }
}
