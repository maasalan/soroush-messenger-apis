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
import com.p111d.p112a.p121c.p124c.C6489t;
import com.p111d.p112a.p121c.p124c.p125a.C1421s.C1420a;
import com.p111d.p112a.p121c.p131i.C1475c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@C1387a
public class C7056f extends C6475g<Collection<Object>> implements C1434i {
    protected final C5354j f20148a;
    protected final C1507k<Object> f20149b;
    protected final C1475c f20150c;
    protected final C1443v f20151d;
    protected final C1507k<Object> f20152e;
    protected final Boolean f20153f;

    public static final class C1423b {
        final Class<?> f4504a;
        final Collection<Object> f4505b;
        List<C5317a> f4506c = new ArrayList();

        public C1423b(Class<?> cls, Collection<Object> collection) {
            this.f4504a = cls;
            this.f4505b = collection;
        }
    }

    private static final class C5317a extends C1420a {
        public final List<Object> f14763a = new ArrayList();
        private final C1423b f14764d;

        C5317a(C1423b c1423b, C6489t c6489t, Class<?> cls) {
            super(c6489t, cls);
            this.f14764d = c1423b;
        }

        public final void mo1305a(Object obj, Object obj2) {
            C1423b c1423b = this.f14764d;
            Iterator it = c1423b.f4506c.iterator();
            Collection collection = c1423b.f4505b;
            while (it.hasNext()) {
                C5317a c5317a = (C5317a) it.next();
                if (c5317a.m3509a(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(c5317a.f14763a);
                    return;
                }
                collection = c5317a.f14763a;
            }
            StringBuilder stringBuilder = new StringBuilder("Trying to resolve a forward reference with id [");
            stringBuilder.append(obj);
            stringBuilder.append("] that wasn't previously seen as unresolved.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public C7056f(C5354j c5354j, C1507k<Object> c1507k, C1475c c1475c, C1443v c1443v) {
        this(c5354j, c1507k, c1475c, c1443v, null, null);
    }

    protected C7056f(C5354j c5354j, C1507k<Object> c1507k, C1475c c1475c, C1443v c1443v, C1507k<Object> c1507k2, Boolean bool) {
        super(c5354j);
        this.f20148a = c5354j;
        this.f20149b = c1507k;
        this.f20150c = c1475c;
        this.f20151d = c1443v;
        this.f20152e = c1507k2;
        this.f20153f = bool;
    }

    protected C7056f mo3524a(C1507k<?> c1507k, C1507k<?> c1507k2, C1475c c1475c, Boolean bool) {
        if (c1507k == this.f20152e && c1507k2 == this.f20149b && c1475c == this.f20150c && this.f20153f == bool) {
            return this;
        }
        return new C7056f(this.f20148a, c1507k2, c1475c, this.f20151d, c1507k, bool);
    }

    public final /* synthetic */ C1507k mo2801a(C5347g c5347g, C1446d c1446d) {
        C1507k c1507k;
        if (this.f20151d == null || !this.f20151d.mo1327i()) {
            c1507k = null;
        } else {
            C5354j l = this.f20151d.mo1330l();
            if (l == null) {
                StringBuilder stringBuilder = new StringBuilder("Invalid delegate-creator definition for ");
                stringBuilder.append(this.f20148a);
                stringBuilder.append(": value instantiator (");
                stringBuilder.append(this.f20151d.getClass().getName());
                stringBuilder.append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            c1507k = c5347g.m11437a(l, c1446d);
        }
        Boolean a = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        C1507k a2 = C5320x.m11162a(c5347g, c1446d, this.f20149b);
        C5354j u = this.f20148a.mo3394u();
        C1507k a3 = a2 == null ? c5347g.m11437a(u, c1446d) : c5347g.m11455b(a2, c1446d, u);
        C1475c c1475c = this.f20150c;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        return mo3524a(c1507k, a3, c1475c, a);
    }

    public /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return b_(c5303j, c5347g);
    }

    public Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }

    public Collection<Object> mo3525a(C5303j c5303j, C5347g c5347g, Collection<Object> collection) {
        if (!c5303j.isExpectedStartArrayToken()) {
            return m18322b(c5303j, c5347g, collection);
        }
        c5303j.setCurrentValue(collection);
        C1507k c1507k = this.f20149b;
        C1475c c1475c = this.f20150c;
        C1423b c1423b = c1507k.mo1312d() == null ? null : new C1423b(this.f20148a.mo3394u().m11531e(), collection);
        while (true) {
            C1380m nextToken = c5303j.nextToken();
            if (nextToken == C1380m.END_ARRAY) {
                return collection;
            }
            int i = 1;
            try {
                Object a = nextToken == C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1475c == null ? c1507k.mo1304a(c5303j, c5347g) : c1507k.mo1308a(c5303j, c5347g, c1475c);
                if (c1423b == null) {
                    collection.add(a);
                } else if (c1423b.f4506c.isEmpty()) {
                    c1423b.f4505b.add(a);
                } else {
                    ((C5317a) c1423b.f4506c.get(c1423b.f4506c.size() - 1)).f14763a.add(a);
                }
            } catch (Throwable e) {
                if (c1423b == null) {
                    throw C5364l.m11573a(c5303j, "Unresolved forward reference but no identity info", e);
                }
                C1420a c5317a = new C5317a(c1423b, e, c1423b.f4504a);
                c1423b.f4506c.add(c5317a);
                e.f17711d.m3512a(c5317a);
            } catch (Throwable e2) {
                if (c5347g != null) {
                    if (!c5347g.m11452a(C5348h.WRAP_EXCEPTIONS)) {
                        i = 0;
                    }
                }
                if (i == 0 && (e2 instanceof RuntimeException)) {
                    throw ((RuntimeException) e2);
                }
                throw C5364l.m11579a(e2, (Object) collection, collection.size());
            }
        }
    }

    protected final Collection<Object> m18322b(C5303j c5303j, C5347g c5347g, Collection<Object> collection) {
        Object obj;
        C1507k c1507k;
        C1475c c1475c;
        if (this.f20153f != Boolean.TRUE) {
            if (this.f20153f != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                obj = null;
                if (obj != null) {
                    throw c5347g.m11457b(this.f20148a.m11531e());
                }
                c1507k = this.f20149b;
                c1475c = this.f20150c;
                try {
                    Object a = c5303j.getCurrentToken() != C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1475c != null ? c1507k.mo1304a(c5303j, c5347g) : c1507k.mo1308a(c5303j, c5347g, c1475c);
                    collection.add(a);
                    return collection;
                } catch (Throwable e) {
                    throw C5364l.m11579a(e, (Object) Object.class, collection.size());
                }
            }
        }
        obj = 1;
        if (obj != null) {
            c1507k = this.f20149b;
            c1475c = this.f20150c;
            if (c5303j.getCurrentToken() != C1380m.VALUE_NULL) {
                if (c1475c != null) {
                }
            }
            collection.add(a);
            return collection;
        }
        throw c5347g.m11457b(this.f20148a.m11531e());
    }

    public final boolean mo1311b() {
        return this.f20149b == null && this.f20150c == null && this.f20152e == null;
    }

    public Collection<Object> b_(C5303j c5303j, C5347g c5347g) {
        if (this.f20152e != null) {
            return (Collection) this.f20151d.mo1316a(c5347g, this.f20152e.mo1304a(c5303j, c5347g));
        }
        if (c5303j.hasToken(C1380m.VALUE_STRING)) {
            String text = c5303j.getText();
            if (text.length() == 0) {
                return (Collection) this.f20151d.mo1317a(c5347g, text);
            }
        }
        return mo3525a(c5303j, c5347g, (Collection) this.f20151d.mo1300a(c5347g));
    }

    public final C1507k<Object> mo3344f() {
        return this.f20149b;
    }
}
