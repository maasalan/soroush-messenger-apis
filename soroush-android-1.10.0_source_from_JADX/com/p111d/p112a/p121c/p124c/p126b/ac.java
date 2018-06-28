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
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1535o;

@C1387a
public final class ac extends C5320x<String[]> implements C1434i {
    public static final ac f17641a = new ac();
    protected C1507k<String> f17642b;
    protected final Boolean f17643c;

    public ac() {
        this(null, null);
    }

    private ac(C1507k<?> c1507k, Boolean bool) {
        super(String[].class);
        this.f17642b = c1507k;
        this.f17643c = bool;
    }

    private String[] m15422c(C5303j c5303j, C5347g c5347g) {
        C1535o o;
        Object a;
        int i;
        Throwable e;
        if (!c5303j.isExpectedStartArrayToken()) {
            int i2;
            String[] strArr;
            String[] strArr2;
            if (this.f17643c != Boolean.TRUE) {
                if (this.f17643c != null || !c5347g.m11452a(C5348h.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                    i2 = 0;
                    strArr = null;
                    if (i2 == 0) {
                        strArr2 = new String[1];
                        if (c5303j.hasToken(C1380m.VALUE_NULL)) {
                            strArr = m11187x(c5303j, c5347g);
                        }
                        strArr2[0] = strArr;
                        return strArr2;
                    } else if (!c5303j.hasToken(C1380m.VALUE_STRING) && c5347g.m11452a(C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && c5303j.getText().length() == 0) {
                        return null;
                    } else {
                        throw c5347g.m11457b(this.y);
                    }
                }
            }
            i2 = 1;
            strArr = null;
            if (i2 == 0) {
                if (!c5303j.hasToken(C1380m.VALUE_STRING)) {
                }
                throw c5347g.m11457b(this.y);
            }
            strArr2 = new String[1];
            if (c5303j.hasToken(C1380m.VALUE_NULL)) {
                strArr = m11187x(c5303j, c5347g);
            }
            strArr2[0] = strArr;
            return strArr2;
        } else if (this.f17642b != null) {
            return m15423d(c5303j, c5347g);
        } else {
            o = c5347g.m11476o();
            a = o.m4008a();
            i = 0;
            while (true) {
                try {
                    String nextTextValue = c5303j.nextTextValue();
                    if (nextTextValue == null) {
                        C1380m currentToken = c5303j.getCurrentToken();
                        if (currentToken == C1380m.END_ARRAY) {
                            String[] strArr3 = (String[]) o.m4011a((Object[]) a, i, String.class);
                            c5347g.m11449a(o);
                            return strArr3;
                        } else if (currentToken != C1380m.VALUE_NULL) {
                            nextTextValue = m11187x(c5303j, c5347g);
                        }
                    }
                    if (i >= a.length) {
                        i = 0;
                        a = o.m4009a(a);
                    }
                    int i3 = i + 1;
                    try {
                        a[i] = nextTextValue;
                        i = i3;
                    } catch (Exception e2) {
                        e = e2;
                        i = i3;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }
        throw C5364l.m11579a(e, a, o.f4780a + i);
    }

    private String[] m15423d(C5303j c5303j, C5347g c5347g) {
        C1535o o = c5347g.m11476o();
        Object[] a = o.m4008a();
        C1507k c1507k = this.f17642b;
        int i = 0;
        while (true) {
            Object a2;
            if (c5303j.nextTextValue() == null) {
                C1380m currentToken = c5303j.getCurrentToken();
                if (currentToken != C1380m.END_ARRAY) {
                    a2 = currentToken == C1380m.VALUE_NULL ? c1507k.mo2803a(c5347g) : c1507k.mo1304a(c5303j, c5347g);
                } else {
                    String[] strArr = (String[]) o.m4011a(a, i, String.class);
                    c5347g.m11449a(o);
                    return strArr;
                }
            }
            try {
                a2 = c1507k.mo1304a(c5303j, c5347g);
            } catch (Exception e) {
                Throwable e2 = e;
            }
            String str = (String) a2;
            if (i >= a.length) {
                a = o.m4009a(a);
                i = 0;
            }
            int i2 = i + 1;
            try {
                a[i] = str;
                i = i2;
            } catch (Exception e3) {
                e2 = e3;
                i = i2;
            }
        }
        throw C5364l.m11579a(e2, (Object) String.class, i);
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        C1507k a = C5320x.m11162a(c5347g, c1446d, this.f17642b);
        C5354j a2 = c5347g.m11435a(String.class);
        a = a == null ? c5347g.m11437a(a2, c1446d) : c5347g.m11455b(a, c1446d, a2);
        Boolean a3 = C5320x.m11163a(c5347g, c1446d, C1316a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        if (a != null && C1527g.m3962a((Object) a)) {
            a = null;
        }
        return (this.f17642b == a && this.f17643c == a3) ? this : new ac(a, a3);
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m15422c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2897b(c5303j, c5347g);
    }
}
