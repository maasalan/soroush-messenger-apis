package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p124c.C6485d;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.util.HashSet;

public final class C7044a extends C6485d {
    protected final C6485d f20123u;
    protected final C6488s[] f20124v;
    protected final C7087f f20125w;

    public C7044a(C6485d c6485d, C6488s[] c6488sArr, C7087f c7087f) {
        super(c6485d);
        this.f20123u = c6485d;
        this.f20124v = c6488sArr;
        this.f20125w = c7087f;
    }

    private Object m18228A(C5303j c5303j, C5347g c5347g) {
        if (!this.h) {
            Object a = this.d.mo1300a(c5347g);
            if (this.k != null) {
                m15502a(c5347g, a);
            }
            Class d = this.o ? c5347g.m11465d() : null;
            C6488s[] c6488sArr = this.f20124v;
            int length = c6488sArr.length;
            int i = 0;
            while (c5303j.nextToken() != C1380m.END_ARRAY) {
                if (i != length) {
                    C6488s c6488s = c6488sArr[i];
                    i++;
                    if (c6488s == null || !(d == null || c6488s.m15547a(d))) {
                        c5303j.skipChildren();
                    } else {
                        try {
                            c6488s.mo3337b(c5303j, c5347g, a);
                        } catch (Throwable e) {
                            C6485d.m15489a(e, a, c6488s.m15554f(), c5347g);
                        }
                    }
                } else if (this.n) {
                    while (c5303j.nextToken() != C1380m.END_ARRAY) {
                        c5303j.skipChildren();
                    }
                    return a;
                } else {
                    throw c5347g.m11446a("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
            }
            return a;
        } else if (this.e != null) {
            return this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g));
        } else {
            if (this.g != null) {
                return mo3331c(c5303j, c5347g);
            }
            StringBuilder stringBuilder;
            if (this.b.mo3388f()) {
                stringBuilder = new StringBuilder("Can not instantiate abstract type ");
                stringBuilder.append(this.b);
                stringBuilder.append(" (need to add/enable type information?)");
                throw C5364l.m11572a(c5303j, stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("No suitable constructor found for type ");
            stringBuilder.append(this.b);
            stringBuilder.append(": can not instantiate from JSON object (need to add/enable type information?)");
            throw C5364l.m11572a(c5303j, stringBuilder.toString());
        }
    }

    private Object m18229B(C5303j c5303j, C5347g c5347g) {
        throw c5347g.m11446a("Can not deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this.b.m11531e().getName(), c5303j.getCurrentToken());
    }

    private Object m18230b(C5347g c5347g, Object obj) {
        try {
            return this.f20125w.m18500m().invoke(obj, new Object[0]);
        } catch (Throwable e) {
            m15503a(e, c5347g);
            return null;
        }
    }

    public final /* synthetic */ C6485d mo3328a(C1416l c1416l) {
        return new C7044a(this.f20123u.mo3328a(c1416l), this.f20124v, this.f20125w);
    }

    public final /* synthetic */ C6485d mo3329a(HashSet hashSet) {
        return new C7044a(this.f20123u.mo3329a(hashSet), this.f20124v, this.f20125w);
    }

    public final C1507k<Object> mo2806a(C1534n c1534n) {
        return this.f20123u.mo2806a(c1534n);
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        Object B;
        if (!c5303j.isExpectedStartArrayToken()) {
            B = m18229B(c5303j, c5347g);
        } else if (this.i) {
            Object a = this.d.mo1300a(c5347g);
            C6488s[] c6488sArr = this.f20124v;
            int length = c6488sArr.length;
            int i = 0;
            while (c5303j.nextToken() != C1380m.END_ARRAY) {
                if (i != length) {
                    C6488s c6488s = c6488sArr[i];
                    if (c6488s != null) {
                        try {
                            a = c6488s.mo3337b(c5303j, c5347g, a);
                        } catch (Throwable e) {
                            C6485d.m15489a(e, a, c6488s.m15554f(), c5347g);
                        }
                    } else {
                        c5303j.skipChildren();
                    }
                    i++;
                } else if (this.n) {
                    while (c5303j.nextToken() != C1380m.END_ARRAY) {
                        c5303j.skipChildren();
                    }
                    return m18230b(c5347g, a);
                } else {
                    throw c5347g.m11446a("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
            }
            return m18230b(c5347g, a);
        } else {
            B = m18228A(c5303j, c5347g);
        }
        return m18230b(c5347g, B);
    }

    public final Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        if (this.k != null) {
            m15502a(c5347g, obj);
        }
        C6488s[] c6488sArr = this.f20124v;
        int length = c6488sArr.length;
        int i = 0;
        while (c5303j.nextToken() != C1380m.END_ARRAY) {
            if (i != length) {
                C6488s c6488s = c6488sArr[i];
                if (c6488s != null) {
                    try {
                        obj = c6488s.mo3337b(c5303j, c5347g, obj);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, obj, c6488s.m15554f(), c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
                i++;
            } else if (this.n) {
                while (c5303j.nextToken() != C1380m.END_ARRAY) {
                    c5303j.skipChildren();
                }
                return m18230b(c5347g, obj);
            } else {
                throw c5347g.m11446a("Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
            }
        }
        return m18230b(c5347g, obj);
    }

    public final Object a_(C5303j c5303j, C5347g c5347g) {
        return m18229B(c5303j, c5347g);
    }

    protected final Object mo3331c(C5303j c5303j, C5347g c5347g) {
        C1417o c1417o = this.g;
        C1419r a = c1417o.m3495a(c5303j, c5347g, this.t);
        C6488s[] c6488sArr = this.f20124v;
        int length = c6488sArr.length;
        int i = 0;
        Object obj = null;
        while (c5303j.nextToken() != C1380m.END_ARRAY) {
            C6488s c6488s = i < length ? c6488sArr[i] : null;
            if (c6488s == null) {
                c5303j.skipChildren();
            } else if (obj != null) {
                try {
                    obj = c6488s.mo3337b(c5303j, c5347g, obj);
                } catch (Throwable e) {
                    C6485d.m15489a(e, obj, c6488s.m15554f(), c5347g);
                }
            } else {
                String f = c6488s.m15554f();
                C6488s a2 = c1417o.m3496a(f);
                if (a2 != null) {
                    if (a.m3504a(a2, a2.m15538a(c5303j, c5347g))) {
                        try {
                            Object a3 = c1417o.m3497a(c5347g, a);
                            if (a3.getClass() != this.b.m11531e()) {
                                throw c5347g.m11446a("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", this.b.m11531e().getName(), a3.getClass().getName());
                            }
                            obj = a3;
                        } catch (Throwable e2) {
                            C6485d.m15489a(e2, (Object) this.b.m11531e(), f, c5347g);
                        }
                    } else {
                        continue;
                    }
                } else if (!a.m3505a(f)) {
                    a.m3507b(c6488s, c6488s.m15538a(c5303j, c5347g));
                }
            }
            i++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return c1417o.m3497a(c5347g, a);
        } catch (Throwable e3) {
            m15503a(e3, c5347g);
            return null;
        }
    }

    protected final /* bridge */ /* synthetic */ C6485d mo3332f() {
        return this;
    }
}
