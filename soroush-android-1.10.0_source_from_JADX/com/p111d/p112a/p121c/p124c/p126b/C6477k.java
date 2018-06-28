package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.EnumSet;

public final class C6477k extends C5320x<EnumSet<?>> implements C1434i {
    protected final C5354j f17659a;
    protected final Class<Enum> f17660b;
    protected C1507k<Enum<?>> f17661c;
    protected final Boolean f17662d;

    private C6477k(C6477k c6477k, C1507k<?> c1507k, Boolean bool) {
        super(EnumSet.class);
        this.f17659a = c6477k.f17659a;
        this.f17660b = c6477k.f17660b;
        this.f17661c = c1507k;
        this.f17662d = bool;
    }

    public C6477k(C5354j c5354j) {
        super(EnumSet.class);
        this.f17659a = c5354j;
        this.f17660b = c5354j.m11531e();
        if (this.f17660b.isEnum()) {
            this.f17661c = null;
            this.f17662d = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Type ");
        stringBuilder.append(c5354j);
        stringBuilder.append(" not Java Enum type");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private EnumSet<?> m15459c(C5303j c5303j, C5347g c5347g) {
        if (!c5303j.isExpectedStartArrayToken()) {
            return m15460d(c5303j, c5347g);
        }
        Object noneOf = EnumSet.noneOf(this.f17660b);
        while (true) {
            try {
                C1380m nextToken = c5303j.nextToken();
                if (nextToken == C1380m.END_ARRAY) {
                    return noneOf;
                }
                if (nextToken == C1380m.VALUE_NULL) {
                    throw c5347g.m11457b(this.f17660b);
                }
                Enum enumR = (Enum) this.f17661c.mo1304a(c5303j, c5347g);
                if (enumR != null) {
                    noneOf.add(enumR);
                }
            } catch (Throwable e) {
                throw C5364l.m11579a(e, noneOf, noneOf.size());
            }
        }
    }

    private EnumSet<?> m15460d(C5303j c5303j, C5347g c5347g) {
        Object obj;
        Enum enumR;
        if (this.f17662d != Boolean.TRUE) {
            if (this.f17662d != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                obj = null;
                if (obj != null) {
                    throw c5347g.m11457b(EnumSet.class);
                }
                obj = EnumSet.noneOf(this.f17660b);
                if (c5303j.hasToken(C1380m.VALUE_NULL)) {
                    try {
                        enumR = (Enum) this.f17661c.mo1304a(c5303j, c5347g);
                        if (enumR != null) {
                            obj.add(enumR);
                        }
                        return obj;
                    } catch (Throwable e) {
                        throw C5364l.m11579a(e, obj, obj.size());
                    }
                }
                throw c5347g.m11457b(this.f17660b);
            }
        }
        obj = 1;
        if (obj != null) {
            obj = EnumSet.noneOf(this.f17660b);
            if (c5303j.hasToken(C1380m.VALUE_NULL)) {
                enumR = (Enum) this.f17661c.mo1304a(c5303j, c5347g);
                if (enumR != null) {
                    obj.add(enumR);
                }
                return obj;
            }
            throw c5347g.m11457b(this.f17660b);
        }
        throw c5347g.m11457b(EnumSet.class);
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        Boolean a = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        C1507k c1507k = this.f17661c;
        C1507k a2 = c1507k == null ? c5347g.m11437a(this.f17659a, c1446d) : c5347g.m11455b(c1507k, c1446d, this.f17659a);
        return (this.f17662d == a && this.f17661c == a2) ? this : new C6477k(this, a2, a);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m15459c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return this.f17659a.mo2930A() == null;
    }
}
