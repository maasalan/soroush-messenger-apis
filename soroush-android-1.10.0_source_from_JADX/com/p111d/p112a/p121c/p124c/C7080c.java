package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.p125a.C1411c;
import com.p111d.p112a.p121c.p124c.p125a.C1415e;
import com.p111d.p112a.p121c.p124c.p125a.C1416l;
import com.p111d.p112a.p121c.p124c.p125a.C1417o;
import com.p111d.p112a.p121c.p124c.p125a.C1419r;
import com.p111d.p112a.p121c.p124c.p125a.C7045b;
import com.p111d.p112a.p121c.p138m.C1534n;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;

public class C7080c extends C6485d implements Serializable {
    protected C7080c(C6485d c6485d) {
        super(c6485d, c6485d.f17687n);
    }

    private C7080c(C6485d c6485d, C1416l c1416l) {
        super(c6485d, c1416l);
    }

    protected C7080c(C6485d c6485d, C1534n c1534n) {
        super(c6485d, c1534n);
    }

    private C7080c(C6485d c6485d, HashSet<String> hashSet) {
        super(c6485d, (HashSet) hashSet);
    }

    public C7080c(C1431e c1431e, C1445c c1445c, C1411c c1411c, Map<String, C6488s> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(c1431e, c1445c, c1411c, map, hashSet, z, z2);
    }

    private final Object m18424A(C5303j c5303j, C5347g c5347g) {
        Object a = this.d.mo1300a(c5347g);
        c5303j.setCurrentValue(a);
        if (c5303j.hasTokenId(5)) {
            String currentName = c5303j.getCurrentName();
            do {
                c5303j.nextToken();
                C6488s a2 = this.j.m3463a(currentName);
                if (a2 != null) {
                    try {
                        a2.mo3335a(c5303j, c5347g, a);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, a, currentName, c5347g);
                    }
                } else {
                    m15501a(c5303j, c5347g, a, currentName);
                }
                currentName = c5303j.nextFieldName();
            } while (currentName != null);
        }
        return a;
    }

    private Object m18425B(C5303j c5303j, C5347g c5347g) {
        if (this.e != null) {
            return this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g));
        }
        if (this.g != null) {
            return m18426C(c5303j, c5347g);
        }
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartObject();
        Object a = this.d.mo1300a(c5347g);
        c5303j.setCurrentValue(a);
        if (this.k != null) {
            m15502a(c5347g, a);
        }
        String str = null;
        Class d = this.o ? c5347g.m11465d() : null;
        if (c5303j.hasTokenId(5)) {
            str = c5303j.getCurrentName();
        }
        while (str != null) {
            c5303j.nextToken();
            C6488s a2 = this.j.m3463a(str);
            if (a2 != null) {
                if (d == null || a2.m15547a(d)) {
                    try {
                        a2.mo3335a(c5303j, c5347g, a);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, a, str, c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
            } else if (this.m == null || !this.m.contains(str)) {
                c6523u.writeFieldName(str);
                c6523u.copyCurrentStructure(c5303j);
                if (this.l != null) {
                    this.l.m3580a(c5303j, c5347g, a, str);
                }
            } else {
                m15508c(c5303j, c5347g, a, str);
            }
            str = c5303j.nextFieldName();
        }
        c6523u.writeEndObject();
        this.r.m3518a(c5347g, a, c6523u);
        return a;
    }

    private Object m18426C(C5303j c5303j, C5347g c5347g) {
        C1417o c1417o = this.g;
        C1419r a = c1417o.m3495a(c5303j, c5347g, this.t);
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartObject();
        C1380m currentToken = c5303j.getCurrentToken();
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a2 = c1417o.m3496a(currentName);
            if (a2 != null) {
                if (a.m3504a(a2, m18428a(c5303j, c5347g, a2))) {
                    currentToken = c5303j.nextToken();
                    try {
                        Object a3 = c1417o.m3497a(c5347g, a);
                        c5303j.setCurrentValue(a3);
                        while (currentToken == C1380m.FIELD_NAME) {
                            c5303j.nextToken();
                            c6523u.copyCurrentStructure(c5303j);
                            currentToken = c5303j.nextToken();
                        }
                        c6523u.writeEndObject();
                        if (a3.getClass() == this.b.m11531e()) {
                            return this.r.m3518a(c5347g, a3, c6523u);
                        }
                        c6523u.close();
                        throw c5347g.m11462c("Can not create polymorphic instances with unwrapped values");
                    } catch (Throwable e) {
                        m15503a(e, c5347g);
                    }
                } else {
                    continue;
                }
            } else if (!a.m3505a(currentName)) {
                a2 = this.j.m3463a(currentName);
                if (a2 != null) {
                    a.m3507b(a2, m18428a(c5303j, c5347g, a2));
                } else if (this.m == null || !this.m.contains(currentName)) {
                    c6523u.writeFieldName(currentName);
                    c6523u.copyCurrentStructure(c5303j);
                    if (this.l != null) {
                        try {
                            a.m3502a(this.l, currentName, this.l.m3579a(c5303j, c5347g));
                        } catch (Throwable e2) {
                            C6485d.m15489a(e2, (Object) this.b.m11531e(), currentName, c5347g);
                        }
                    }
                } else {
                    m15508c(c5303j, c5347g, mo1307a(), currentName);
                }
            }
            currentToken = c5303j.nextToken();
        }
        try {
            return this.r.m3518a(c5347g, c1417o.m3497a(c5347g, a), c6523u);
        } catch (Throwable e3) {
            m15503a(e3, c5347g);
            return null;
        }
    }

    private Object m18427D(C5303j c5303j, C5347g c5347g) {
        C1415e a = this.s.m3486a();
        C1417o c1417o = this.g;
        C1419r a2 = c1417o.m3495a(c5303j, c5347g, this.t);
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartObject();
        C1380m currentToken = c5303j.getCurrentToken();
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a3 = c1417o.m3496a(currentName);
            if (a3 != null) {
                if (!a.m3489a(c5303j, c5347g, currentName, null) && a2.m3504a(a3, m18428a(c5303j, c5347g, a3))) {
                    C1380m nextToken = c5303j.nextToken();
                    try {
                        Object a4 = c1417o.m3497a(c5347g, a2);
                        while (nextToken == C1380m.FIELD_NAME) {
                            c5303j.nextToken();
                            c6523u.copyCurrentStructure(c5303j);
                            nextToken = c5303j.nextToken();
                        }
                        if (a4.getClass() == this.b.m11531e()) {
                            return a.m3487a(c5303j, c5347g, a4);
                        }
                        throw c5347g.m11462c("Can not create polymorphic instances with unwrapped values");
                    } catch (Throwable e) {
                        C6485d.m15489a(e, (Object) this.b.m11531e(), currentName, c5347g);
                    }
                }
            } else if (!a2.m3505a(currentName)) {
                a3 = this.j.m3463a(currentName);
                if (a3 != null) {
                    a2.m3507b(a3, a3.m15538a(c5303j, c5347g));
                } else if (!a.m3489a(c5303j, c5347g, currentName, null)) {
                    if (this.m != null && this.m.contains(currentName)) {
                        m15508c(c5303j, c5347g, mo1307a(), currentName);
                    } else if (this.l != null) {
                        a2.m3502a(this.l, currentName, this.l.m3579a(c5303j, c5347g));
                    }
                }
            }
            currentToken = c5303j.nextToken();
        }
        try {
            int length = a.f4471a.length;
            Object[] objArr = new Object[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj;
                String str = a.f4473c[i2];
                if (str == null) {
                    if (a.f4474d[i2] == null) {
                        continue;
                    } else if (a.f4471a[i2].m3483a()) {
                        str = a.f4471a[i2].m3485b();
                    } else {
                        throw c5347g.m11446a("Missing external type id property '%s'", a.f4471a[i2].f4469b);
                    }
                } else if (a.f4474d[i2] == null) {
                    throw c5347g.m11446a("Missing property '%s' for external type id '%s'", a.f4471a[i2].f4468a.m15554f(), a.f4471a[i2].f4469b);
                }
                C5303j a5 = a.f4474d[i2].m15743a(c5303j);
                if (a5.nextToken() == C1380m.VALUE_NULL) {
                    obj = null;
                } else {
                    C6523u c6523u2 = new C6523u(c5303j, c5347g);
                    c6523u2.writeStartArray();
                    c6523u2.writeString(str);
                    c6523u2.copyCurrentStructure(a5);
                    c6523u2.writeEndArray();
                    C5303j a6 = c6523u2.m15743a(c5303j);
                    a6.nextToken();
                    obj = a.f4471a[i2].f4468a.m15538a(a6, c5347g);
                }
                objArr[i2] = obj;
            }
            for (int i3 = 0; i3 < length; i3++) {
                C6488s c6488s = a.f4471a[i3].f4468a;
                if (c1417o.m3496a(c6488s.m15554f()) != null) {
                    a2.m3504a(c6488s, objArr[i3]);
                }
            }
            Object a7 = c1417o.m3497a(c5347g, a2);
            while (i < length) {
                C6488s c6488s2 = a.f4471a[i].f4468a;
                if (c1417o.m3496a(c6488s2.m15554f()) == null) {
                    c6488s2.mo3336a(a7, objArr[i]);
                }
                i++;
            }
            return a7;
        } catch (Throwable e2) {
            m15503a(e2, c5347g);
            return null;
        }
    }

    private Object m18428a(C5303j c5303j, C5347g c5347g, C6488s c6488s) {
        try {
            return c6488s.m15538a(c5303j, c5347g);
        } catch (Throwable e) {
            C6485d.m15489a(e, (Object) this.b.m11531e(), c6488s.m15554f(), c5347g);
            return null;
        }
    }

    private Object m18429a(C5303j c5303j, C5347g c5347g, Object obj, Class<?> cls) {
        if (c5303j.hasTokenId(5)) {
            String currentName = c5303j.getCurrentName();
            do {
                c5303j.nextToken();
                C6488s a = this.j.m3463a(currentName);
                if (a == null) {
                    m15501a(c5303j, c5347g, obj, currentName);
                } else if (a.m15547a((Class) cls)) {
                    try {
                        a.mo3335a(c5303j, c5347g, obj);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, obj, currentName, c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
                currentName = c5303j.nextFieldName();
            } while (currentName != null);
        }
        return obj;
    }

    private Object m18430b(C5303j c5303j, C5347g c5347g, Object obj) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_OBJECT) {
            currentToken = c5303j.nextToken();
        }
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartObject();
        Class d = this.o ? c5347g.m11465d() : null;
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            C6488s a = this.j.m3463a(currentName);
            c5303j.nextToken();
            if (a != null) {
                if (d == null || a.m15547a(d)) {
                    try {
                        a.mo3335a(c5303j, c5347g, obj);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, obj, currentName, c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
            } else if (this.m == null || !this.m.contains(currentName)) {
                c6523u.writeFieldName(currentName);
                c6523u.copyCurrentStructure(c5303j);
                if (this.l != null) {
                    this.l.m3580a(c5303j, c5347g, obj, currentName);
                }
            } else {
                m15508c(c5303j, c5347g, obj, currentName);
            }
            currentToken = c5303j.nextToken();
        }
        c6523u.writeEndObject();
        this.r.m3518a(c5347g, obj, c6523u);
        return obj;
    }

    private Object m18431c(C5303j c5303j, C5347g c5347g, Object obj) {
        Class d = this.o ? c5347g.m11465d() : null;
        C1415e a = this.s.m3486a();
        C1380m currentToken = c5303j.getCurrentToken();
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            currentToken = c5303j.nextToken();
            C6488s a2 = this.j.m3463a(currentName);
            if (a2 != null) {
                if (currentToken.f4397v) {
                    Integer num = (Integer) a.f4472b.get(currentName);
                    if (num != null) {
                        int intValue = num.intValue();
                        if (a.f4471a[intValue].m3484a(currentName)) {
                            String text = c5303j.getText();
                            Object obj2 = (obj == null || a.f4474d[intValue] == null) ? null : 1;
                            if (obj2 != null) {
                                a.m3488a(c5303j, c5347g, obj, intValue, text);
                                a.f4474d[intValue] = null;
                            } else {
                                a.f4473c[intValue] = text;
                            }
                        }
                    }
                }
                if (d == null || a2.m15547a(d)) {
                    try {
                        a2.mo3335a(c5303j, c5347g, obj);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, obj, currentName, c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
            } else if (this.m != null && this.m.contains(currentName)) {
                m15508c(c5303j, c5347g, obj, currentName);
            } else if (!a.m3489a(c5303j, c5347g, currentName, obj)) {
                if (this.l != null) {
                    this.l.m3580a(c5303j, c5347g, obj, currentName);
                } else {
                    mo2807b(c5303j, c5347g, obj, currentName);
                }
            }
            currentToken = c5303j.nextToken();
        }
        return a.m3487a(c5303j, c5347g, obj);
    }

    public final /* synthetic */ C6485d mo3328a(C1416l c1416l) {
        return new C7080c((C6485d) this, c1416l);
    }

    public final /* synthetic */ C6485d mo3329a(HashSet hashSet) {
        return new C7080c((C6485d) this, hashSet);
    }

    public C1507k<Object> mo2806a(C1534n c1534n) {
        return getClass() != C7080c.class ? this : new C7080c((C6485d) this, c1534n);
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        if (!c5303j.isExpectedStartObjectToken()) {
            switch (c5303j.getCurrentToken()) {
                case VALUE_STRING:
                    return m15514f(c5303j, c5347g);
                case VALUE_NUMBER_INT:
                    return m15512e(c5303j, c5347g);
                case VALUE_NUMBER_FLOAT:
                    return m15515g(c5303j, c5347g);
                case VALUE_EMBEDDED_OBJECT:
                    return m15518j(c5303j, c5347g);
                case VALUE_TRUE:
                case VALUE_FALSE:
                    return m15516h(c5303j, c5347g);
                case VALUE_NULL:
                    if (c5303j.requiresCustomCodec()) {
                        Object A;
                        C6523u c6523u = new C6523u(c5303j, c5347g);
                        c6523u.writeEndObject();
                        c5303j = c6523u.m15743a(c5303j);
                        c5303j.nextToken();
                        if (this.i) {
                            C1380m c1380m = C1380m.END_OBJECT;
                            A = m18424A(c5303j, c5347g);
                        } else {
                            A = a_(c5303j, c5347g);
                        }
                        c5303j.close();
                        return A;
                    }
                    throw c5347g.m11457b(mo1307a());
                case START_ARRAY:
                    return m15517i(c5303j, c5347g);
                case FIELD_NAME:
                case END_OBJECT:
                    return this.i ? m18424A(c5303j, c5347g) : this.t != null ? a_(c5303j, c5347g) : a_(c5303j, c5347g);
                default:
                    throw c5347g.m11457b(mo1307a());
            }
        } else if (this.i) {
            c5303j.nextToken();
            return m18424A(c5303j, c5347g);
        } else {
            c5303j.nextToken();
            return this.t != null ? a_(c5303j, c5347g) : a_(c5303j, c5347g);
        }
    }

    public final Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        c5303j.setCurrentValue(obj);
        if (this.k != null) {
            m15502a(c5347g, obj);
        }
        if (this.r != null) {
            return m18430b(c5303j, c5347g, obj);
        }
        if (this.s != null) {
            return m18431c(c5303j, c5347g, obj);
        }
        String nextFieldName;
        if (c5303j.isExpectedStartObjectToken()) {
            nextFieldName = c5303j.nextFieldName();
            if (nextFieldName == null) {
                return obj;
            }
        } else if (!c5303j.hasTokenId(5)) {
            return obj;
        } else {
            nextFieldName = c5303j.getCurrentName();
        }
        if (this.o) {
            Class d = c5347g.m11465d();
            if (d != null) {
                return m18429a(c5303j, c5347g, obj, d);
            }
        }
        do {
            c5303j.nextToken();
            C6488s a = this.j.m3463a(nextFieldName);
            if (a != null) {
                try {
                    a.mo3335a(c5303j, c5347g, obj);
                } catch (Throwable e) {
                    C6485d.m15489a(e, obj, nextFieldName, c5347g);
                }
            } else {
                m15501a(c5303j, c5347g, obj, nextFieldName);
            }
            nextFieldName = c5303j.nextFieldName();
        } while (nextFieldName != null);
        return obj;
    }

    public Object a_(C5303j c5303j, C5347g c5347g) {
        if (!this.h) {
            Object a = this.d.mo1300a(c5347g);
            c5303j.setCurrentValue(a);
            if (c5303j.canReadObjectId()) {
                Object objectId = c5303j.getObjectId();
                if (objectId != null) {
                    m15499a(c5303j, c5347g, a, objectId);
                }
            }
            if (this.k != null) {
                m15502a(c5347g, a);
            }
            if (this.o) {
                Class d = c5347g.m11465d();
                if (d != null) {
                    return m18429a(c5303j, c5347g, a, d);
                }
            }
            if (c5303j.hasTokenId(5)) {
                String currentName = c5303j.getCurrentName();
                do {
                    c5303j.nextToken();
                    C6488s a2 = this.j.m3463a(currentName);
                    if (a2 != null) {
                        try {
                            a2.mo3335a(c5303j, c5347g, a);
                        } catch (Throwable e) {
                            C6485d.m15489a(e, a, currentName, c5347g);
                        }
                    } else {
                        m15501a(c5303j, c5347g, a, currentName);
                    }
                    currentName = c5303j.nextFieldName();
                } while (currentName != null);
            }
            return a;
        } else if (this.r != null) {
            return m18425B(c5303j, c5347g);
        } else {
            if (this.s != null) {
                return this.g != null ? m18427D(c5303j, c5347g) : this.e != null ? this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g)) : m18431c(c5303j, c5347g, this.d.mo1300a(c5347g));
            } else {
                Object d2 = m15511d(c5303j, c5347g);
                if (this.k != null) {
                    m15502a(c5347g, d2);
                }
                return d2;
            }
        }
    }

    protected final Object mo3331c(C5303j c5303j, C5347g c5347g) {
        Object a;
        C1417o c1417o = this.g;
        C1419r a2 = c1417o.m3495a(c5303j, c5347g, this.t);
        C1380m currentToken = c5303j.getCurrentToken();
        C6523u c6523u = null;
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a3 = c1417o.m3496a(currentName);
            if (a3 != null) {
                if (a2.m3504a(a3, m18428a(c5303j, c5347g, a3))) {
                    Object a4;
                    c5303j.nextToken();
                    try {
                        a4 = c1417o.m3497a(c5347g, a2);
                    } catch (Throwable e) {
                        m15503a(e, c5347g);
                        a4 = null;
                    }
                    if (a4 == null) {
                        throw c5347g.m11441a(this.b.m11531e(), "JSON Creator returned null");
                    }
                    c5303j.setCurrentValue(a4);
                    if (a4.getClass() != this.b.m11531e()) {
                        return m15498a(c5303j, c5347g, a4, c6523u);
                    }
                    if (c6523u != null) {
                        a4 = m15500a(c5347g, a4, c6523u);
                    }
                    return mo1309a(c5303j, c5347g, a4);
                }
            } else if (!a2.m3505a(currentName)) {
                a3 = this.j.m3463a(currentName);
                if (a3 != null) {
                    a2.m3507b(a3, m18428a(c5303j, c5347g, a3));
                } else if (this.m != null && this.m.contains(currentName)) {
                    m15508c(c5303j, c5347g, mo1307a(), currentName);
                } else if (this.l != null) {
                    try {
                        a2.m3502a(this.l, currentName, this.l.m3579a(c5303j, c5347g));
                    } catch (Throwable e2) {
                        C6485d.m15489a(e2, (Object) this.b.m11531e(), currentName, c5347g);
                    }
                } else {
                    if (c6523u == null) {
                        c6523u = new C6523u(c5303j, c5347g);
                    }
                    c6523u.writeFieldName(currentName);
                    c6523u.copyCurrentStructure(c5303j);
                }
            }
            currentToken = c5303j.nextToken();
        }
        try {
            a = c1417o.m3497a(c5347g, a2);
        } catch (Throwable e3) {
            m15503a(e3, c5347g);
            a = null;
        }
        if (c6523u != null) {
            if (a.getClass() != this.b.m11531e()) {
                return m15498a(null, c5347g, a, c6523u);
            }
            a = m15500a(c5347g, a, c6523u);
        }
        return a;
    }

    protected final C6485d mo3332f() {
        return new C7045b(this, this.j.f4451c);
    }
}
