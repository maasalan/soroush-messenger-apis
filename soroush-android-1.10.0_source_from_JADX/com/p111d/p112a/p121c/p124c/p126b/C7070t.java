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
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p137l.C7122a;
import com.p111d.p112a.p121c.p138m.C1535o;
import java.lang.reflect.Array;

@C1387a
public final class C7070t extends C6475g<Object[]> implements C1434i {
    protected final C7122a f20185a;
    protected final boolean f20186b;
    protected final Class<?> f20187c;
    protected C1507k<Object> f20188d;
    protected final C1475c f20189e;
    protected final Boolean f20190f;

    private C7070t(C7070t c7070t, C1507k<Object> c1507k, C1475c c1475c, Boolean bool) {
        super(c7070t.f20185a);
        this.f20185a = c7070t.f20185a;
        this.f20187c = c7070t.f20187c;
        this.f20186b = c7070t.f20186b;
        this.f20188d = c1507k;
        this.f20189e = c1475c;
        this.f20190f = bool;
    }

    public C7070t(C7122a c7122a, C1507k<Object> c1507k, C1475c c1475c) {
        super(c7122a);
        this.f20185a = c7122a;
        this.f20187c = c7122a.mo3394u().m11531e();
        this.f20186b = this.f20187c == Object.class;
        this.f20188d = c1507k;
        this.f20189e = c1475c;
        this.f20190f = null;
    }

    private Object[] m18385c(C5303j c5303j, C5347g c5347g) {
        C1535o o;
        Object a;
        int i;
        Throwable e;
        int i2 = 0;
        if (c5303j.isExpectedStartArrayToken()) {
            o = c5347g.m11476o();
            a = o.m4008a();
            C1475c c1475c = this.f20189e;
            i = 0;
            while (true) {
                try {
                    C1380m nextToken = c5303j.nextToken();
                    if (nextToken == C1380m.END_ARRAY) {
                        break;
                    }
                    Object a2 = nextToken == C1380m.VALUE_NULL ? this.f20188d.mo2803a(c5347g) : c1475c == null ? this.f20188d.mo1304a(c5303j, c5347g) : this.f20188d.mo1308a(c5303j, c5347g, c1475c);
                    if (i >= a.length) {
                        i = 0;
                        a = o.m4009a(a);
                    }
                    int i3 = i + 1;
                    try {
                        a[i] = a2;
                        i = i3;
                    } catch (Exception e2) {
                        e = e2;
                        i = i3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            Object[] a3 = this.f20186b ? o.m4010a(a, i) : o.m4011a((Object[]) a, i, this.f20187c);
            c5347g.m11449a(o);
            return a3;
        } else if (c5303j.hasToken(C1380m.VALUE_STRING) && c5347g.m11452a(C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && c5303j.getText().length() == 0) {
            return null;
        } else {
            int i4;
            Object a4;
            Object[] objArr;
            if (this.f20190f != Boolean.TRUE) {
                if (this.f20190f != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    i4 = 0;
                    if (i4 == 0) {
                        a4 = c5303j.getCurrentToken() != C1380m.VALUE_NULL ? this.f20188d.mo2803a(c5347g) : this.f20189e != null ? this.f20188d.mo1304a(c5303j, c5347g) : this.f20188d.mo1308a(c5303j, c5347g, this.f20189e);
                        objArr = this.f20186b ? new Object[1] : (Object[]) Array.newInstance(this.f20187c, 1);
                        objArr[0] = a4;
                        return objArr;
                    } else if (c5303j.getCurrentToken() == C1380m.VALUE_STRING || this.f20187c != Byte.class) {
                        throw c5347g.m11457b(this.f20185a.m11531e());
                    } else {
                        byte[] binaryValue = c5303j.getBinaryValue(c5347g.m11473l());
                        Byte[] bArr = new Byte[binaryValue.length];
                        i4 = binaryValue.length;
                        while (i2 < i4) {
                            bArr[i2] = Byte.valueOf(binaryValue[i2]);
                            i2++;
                        }
                        return bArr;
                    }
                }
            }
            i4 = 1;
            if (i4 == 0) {
                if (c5303j.getCurrentToken() != C1380m.VALUE_NULL) {
                    if (this.f20189e != null) {
                    }
                }
                if (this.f20186b) {
                }
                objArr[0] = a4;
                return objArr;
            }
            if (c5303j.getCurrentToken() == C1380m.VALUE_STRING) {
            }
            throw c5347g.m11457b(this.f20185a.m11531e());
        }
        throw C5364l.m11579a(e, a, o.f4780a + i);
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1507k c1507k = this.f20188d;
        Boolean a = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        c1507k = C5320x.m11162a(c5347g, c1446d, c1507k);
        C5354j u = this.f20185a.mo3394u();
        C1507k a2 = c1507k == null ? c5347g.m11437a(u, c1446d) : c5347g.m11455b(c1507k, c1446d, u);
        C1475c c1475c = this.f20189e;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        return (a == this.f20190f && a2 == this.f20188d && c1475c == this.f20189e) ? this : new C7070t(this, a2, c1475c, a);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18385c(c5303j, c5347g);
    }

    public final /* synthetic */ Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return (Object[]) c1475c.mo2897b(c5303j, c5347g);
    }

    public final boolean mo1311b() {
        return this.f20188d == null && this.f20189e == null;
    }

    public final C1507k<Object> mo3344f() {
        return this.f20188d;
    }
}
