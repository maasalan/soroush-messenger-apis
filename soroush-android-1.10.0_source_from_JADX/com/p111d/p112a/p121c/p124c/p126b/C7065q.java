package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1435j;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

@C1387a
public final class C7065q extends C6475g<Entry<Object, Object>> implements C1434i {
    protected final C5354j f20176a;
    protected final C1546p f20177b;
    protected final C1507k<Object> f20178c;
    protected final C1475c f20179d;

    private C7065q(C7065q c7065q, C1546p c1546p, C1507k<Object> c1507k, C1475c c1475c) {
        super(c7065q.f20176a);
        this.f20176a = c7065q.f20176a;
        this.f20177b = c1546p;
        this.f20178c = c1507k;
        this.f20179d = c1475c;
    }

    public C7065q(C5354j c5354j, C1546p c1546p, C1507k<Object> c1507k, C1475c c1475c) {
        super(c5354j);
        if (c5354j.mo2935w() != 2) {
            StringBuilder stringBuilder = new StringBuilder("Missing generic type information for ");
            stringBuilder.append(c5354j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.f20176a = c5354j;
        this.f20177b = c1546p;
        this.f20178c = c1507k;
        this.f20179d = c1475c;
    }

    private Entry<Object, Object> m18370c(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_OBJECT || currentToken == C1380m.FIELD_NAME || currentToken == C1380m.END_OBJECT) {
            if (currentToken == C1380m.START_OBJECT) {
                currentToken = c5303j.nextToken();
            }
            if (currentToken == C1380m.FIELD_NAME) {
                Object a;
                C1546p c1546p = this.f20177b;
                C1507k c1507k = this.f20178c;
                C1475c c1475c = this.f20179d;
                String currentName = c5303j.getCurrentName();
                Object a2 = c1546p.mo1336a(currentName, c5347g);
                try {
                    a = c5303j.nextToken() == C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1475c == null ? c1507k.mo1304a(c5303j, c5347g) : c1507k.mo1308a(c5303j, c5347g, c1475c);
                } catch (Throwable e) {
                    C6475g.m15453a(e, Entry.class, currentName);
                    a = null;
                }
                C1380m nextToken = c5303j.nextToken();
                if (nextToken == C1380m.END_OBJECT) {
                    return new SimpleEntry(a2, a);
                }
                if (nextToken == C1380m.FIELD_NAME) {
                    StringBuilder stringBuilder = new StringBuilder("Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '");
                    stringBuilder.append(c5303j.getCurrentName());
                    stringBuilder.append("')");
                    throw c5347g.m11462c(stringBuilder.toString());
                }
                StringBuilder stringBuilder2 = new StringBuilder("Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: ");
                stringBuilder2.append(nextToken);
                throw c5347g.m11462c(stringBuilder2.toString());
            } else if (currentToken == C1380m.END_OBJECT) {
                throw c5347g.m11462c("Can not deserialize a Map.Entry out of empty JSON Object");
            } else {
                throw c5347g.m11440a(mo1307a(), currentToken);
            }
        }
        m11188y(c5303j, c5347g);
        return null;
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1546p c1546p = this.f20177b;
        if (c1546p == null) {
            c1546p = c5347g.m11463c(this.f20176a.mo2932a(0));
        } else if (c1546p instanceof C1435j) {
            c1546p = ((C1435j) c1546p).m3545a();
        }
        C1507k a = C5320x.m11162a(c5347g, c1446d, this.f20178c);
        C5354j a2 = this.f20176a.mo2932a(1);
        C1507k a3 = a == null ? c5347g.m11437a(a2, c1446d) : c5347g.m11455b(a, c1446d, a2);
        C1475c c1475c = this.f20179d;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        return (this.f20177b == c1546p && this.f20178c == a3 && this.f20179d == c1475c) ? this : new C7065q(this, c1546p, a3, c1475c);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18370c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2896a(c5303j, c5347g);
    }

    public final /* synthetic */ Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        throw new IllegalStateException("Can not update Map.Entry values");
    }

    public final C1507k<Object> mo3344f() {
        return this.f20178c;
    }
}
