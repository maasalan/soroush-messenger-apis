package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.EnumMap;

public final class C7059j extends C6475g<EnumMap<?, ?>> implements C1434i {
    protected final C5354j f20158a;
    protected final Class<?> f20159b;
    protected C1546p f20160c;
    protected C1507k<Object> f20161d;
    protected final C1475c f20162e;

    public C7059j(C5354j c5354j, C1546p c1546p, C1507k<?> c1507k, C1475c c1475c) {
        super(c5354j);
        this.f20158a = c5354j;
        this.f20159b = c5354j.mo3398t().m11531e();
        this.f20160c = c1546p;
        this.f20161d = c1507k;
        this.f20162e = c1475c;
    }

    private EnumMap<?, ?> m18333c(C5303j c5303j, C5347g c5347g) {
        if (c5303j.getCurrentToken() != C1380m.START_OBJECT) {
            m11188y(c5303j, c5347g);
            return null;
        }
        EnumMap<?, ?> enumMap = new EnumMap(this.f20159b);
        C1507k c1507k = this.f20161d;
        C1475c c1475c = this.f20162e;
        while (c5303j.nextToken() == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            Enum enumR = (Enum) this.f20160c.mo1336a(currentName, c5347g);
            if (enumR != null) {
                try {
                    Object a = c5303j.nextToken() == C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1475c == null ? c1507k.mo1304a(c5303j, c5347g) : c1507k.mo1308a(c5303j, c5347g, c1475c);
                    enumMap.put(enumR, a);
                } catch (Throwable e) {
                    C6475g.m15453a(e, enumMap, currentName);
                    return null;
                }
            } else if (c5347g.m11452a(C5348h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                c5303j.nextToken();
                c5303j.skipChildren();
            } else {
                Class cls = this.f20159b;
                StringBuilder stringBuilder = new StringBuilder("value not one of declared Enum instance names for ");
                stringBuilder.append(this.f20158a.mo3398t());
                throw c5347g.m11445a(currentName, cls, stringBuilder.toString());
            }
        }
        return enumMap;
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1546p c1546p = this.f20160c;
        if (c1546p == null) {
            c1546p = c5347g.m11463c(this.f20158a.mo3398t());
        }
        C1507k c1507k = this.f20161d;
        C5354j u = this.f20158a.mo3394u();
        C1507k a = c1507k == null ? c5347g.m11437a(u, c1446d) : c5347g.m11455b(c1507k, c1446d, u);
        C1475c c1475c = this.f20162e;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        return (c1546p == this.f20160c && a == this.f20161d && c1475c == this.f20162e) ? this : new C7059j(this.f20158a, c1546p, a, this.f20162e);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18333c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2896a(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return this.f20161d == null && this.f20160c == null && this.f20162e == null;
    }

    public final C1507k<Object> mo3344f() {
        return this.f20161d;
    }
}
