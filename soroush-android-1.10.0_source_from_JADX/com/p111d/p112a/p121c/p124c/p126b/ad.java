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
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.util.Collection;

@C1387a
public final class ad extends C6475g<Collection<String>> implements C1434i {
    protected final C5354j f20142a;
    protected final C1507k<String> f20143b;
    protected final C1443v f20144c;
    protected final C1507k<Object> f20145d;
    protected final Boolean f20146e;

    private ad(C5354j c5354j, C1443v c1443v, C1507k<?> c1507k, C1507k<?> c1507k2, Boolean bool) {
        super(c5354j);
        this.f20142a = c5354j;
        this.f20143b = c1507k2;
        this.f20144c = c1443v;
        this.f20145d = c1507k;
        this.f20146e = bool;
    }

    public ad(C5354j c5354j, C1507k<?> c1507k, C1443v c1443v) {
        this(c5354j, c1443v, null, c1507k, null);
    }

    private Collection<String> m18301a(C5303j c5303j, C5347g c5347g, Collection<String> collection) {
        Object obj;
        C1507k c1507k;
        if (!c5303j.isExpectedStartArrayToken()) {
            Object obj2;
            if (this.f20146e != Boolean.TRUE) {
                if (this.f20146e != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    obj = null;
                    if (obj != null) {
                        throw c5347g.m11457b(this.f20142a.m11531e());
                    }
                    c1507k = this.f20143b;
                    if (c5303j.getCurrentToken() != C1380m.VALUE_NULL) {
                        if (c1507k != null) {
                            obj2 = null;
                            collection.add(obj2);
                            return collection;
                        }
                        obj2 = c1507k.mo2803a(c5347g);
                    } else if (c1507k != null) {
                        obj2 = m11187x(c5303j, c5347g);
                        collection.add(obj2);
                        return collection;
                    } else {
                        obj2 = c1507k.mo1304a(c5303j, c5347g);
                    }
                    obj2 = (String) obj2;
                    collection.add(obj2);
                    return collection;
                }
            }
            obj = 1;
            if (obj != null) {
                c1507k = this.f20143b;
                if (c5303j.getCurrentToken() != C1380m.VALUE_NULL) {
                    if (c1507k != null) {
                        obj2 = c1507k.mo1304a(c5303j, c5347g);
                    } else {
                        obj2 = m11187x(c5303j, c5347g);
                        collection.add(obj2);
                        return collection;
                    }
                } else if (c1507k != null) {
                    obj2 = c1507k.mo2803a(c5347g);
                } else {
                    obj2 = null;
                    collection.add(obj2);
                    return collection;
                }
                obj2 = (String) obj2;
                collection.add(obj2);
                return collection;
            }
            throw c5347g.m11457b(this.f20142a.m11531e());
        } else if (this.f20143b != null) {
            c1507k = this.f20143b;
            while (true) {
                Object a;
                if (c5303j.nextTextValue() == null) {
                    r1 = c5303j.getCurrentToken();
                    if (r1 == C1380m.END_ARRAY) {
                        return collection;
                    }
                    if (r1 == C1380m.VALUE_NULL) {
                        a = c1507k.mo2803a(c5347g);
                        collection.add((String) a);
                    }
                }
                a = c1507k.mo1304a(c5303j, c5347g);
                collection.add((String) a);
            }
        } else {
            while (true) {
                try {
                    obj = c5303j.nextTextValue();
                    if (obj == null) {
                        r1 = c5303j.getCurrentToken();
                        if (r1 == C1380m.END_ARRAY) {
                            return collection;
                        }
                        if (r1 != C1380m.VALUE_NULL) {
                            obj = m11187x(c5303j, c5347g);
                        }
                    }
                    collection.add(obj);
                } catch (Throwable e) {
                    throw C5364l.m11579a(e, (Object) collection, collection.size());
                }
            }
        }
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1507k a = (this.f20144c == null || this.f20144c.mo1333o() == null) ? null : c5347g.m11437a(this.f20144c.mo1330l(), c1446d);
        C1507k c1507k = this.f20143b;
        C5354j u = this.f20142a.mo3394u();
        if (c1507k == null) {
            c1507k = C5320x.m11162a(c5347g, c1446d, c1507k);
            if (c1507k == null) {
                c1507k = c5347g.m11437a(u, c1446d);
            }
        } else {
            c1507k = c5347g.m11455b(c1507k, c1446d, u);
        }
        Boolean a2 = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        C1507k c1507k2 = C1527g.m3962a((Object) c1507k) ? null : c1507k;
        return (this.f20146e == a2 && this.f20143b == c1507k2 && this.f20145d == a) ? this : new ad(this.f20142a, this.f20144c, a, c1507k2, a2);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return this.f20143b == null && this.f20145d == null;
    }

    public final C1507k<Object> mo3344f() {
        return this.f20143b;
    }
}
