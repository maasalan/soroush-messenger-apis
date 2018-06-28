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
import com.p111d.p112a.p121c.p124c.p125a.C7044a;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p138m.C1534n;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.util.HashSet;
import java.util.Map;

public final class C7081h extends C6485d {
    protected final C7087f f20193u;

    public C7081h(C1431e c1431e, C1445c c1445c, C1411c c1411c, Map<String, C6488s> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(c1431e, c1445c, c1411c, map, hashSet, z, z2);
        this.f20193u = c1431e.m3541e();
        if (this.t != null) {
            StringBuilder stringBuilder = new StringBuilder("Can not use Object Id with Builder-based deserialization (type ");
            stringBuilder.append(c1445c.m3615a());
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private C7081h(C7081h c7081h, C1416l c1416l) {
        super((C6485d) c7081h, c1416l);
        this.f20193u = c7081h.f20193u;
    }

    private C7081h(C7081h c7081h, C1534n c1534n) {
        super((C6485d) c7081h, c1534n);
        this.f20193u = c7081h.f20193u;
    }

    private C7081h(C7081h c7081h, HashSet<String> hashSet) {
        super((C6485d) c7081h, (HashSet) hashSet);
        this.f20193u = c7081h.f20193u;
    }

    private final Object m18439A(C5303j c5303j, C5347g c5347g) {
        Object a = this.d.mo1300a(c5347g);
        while (c5303j.getCurrentToken() != C1380m.END_OBJECT) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a2 = this.j.m3463a(currentName);
            if (a2 != null) {
                try {
                    a = a2.mo3337b(c5303j, c5347g, a);
                } catch (Throwable e) {
                    C6485d.m15489a(e, a, currentName, c5347g);
                }
            } else {
                m15501a(c5303j, c5347g, a, currentName);
            }
            c5303j.nextToken();
        }
        return a;
    }

    private Object m18440B(C5303j c5303j, C5347g c5347g) {
        if (this.e != null) {
            return this.d.mo1316a(c5347g, this.e.mo1304a(c5303j, c5347g));
        }
        if (this.g != null) {
            return m18441C(c5303j, c5347g);
        }
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartObject();
        Object a = this.d.mo1300a(c5347g);
        if (this.k != null) {
            m15502a(c5347g, a);
        }
        Class d = this.o ? c5347g.m11465d() : null;
        while (c5303j.getCurrentToken() != C1380m.END_OBJECT) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a2 = this.j.m3463a(currentName);
            if (a2 != null) {
                if (d == null || a2.m15547a(d)) {
                    try {
                        a = a2.mo3337b(c5303j, c5347g, a);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, a, currentName, c5347g);
                    }
                } else {
                    c5303j.skipChildren();
                }
            } else if (this.m == null || !this.m.contains(currentName)) {
                c6523u.writeFieldName(currentName);
                c6523u.copyCurrentStructure(c5303j);
                if (this.l != null) {
                    this.l.m3580a(c5303j, c5347g, a, currentName);
                }
            } else {
                m15508c(c5303j, c5347g, a, currentName);
            }
            c5303j.nextToken();
        }
        c6523u.writeEndObject();
        this.r.m3518a(c5347g, a, c6523u);
        return a;
    }

    private Object m18441C(C5303j c5303j, C5347g c5347g) {
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
                if (a.m3504a(a2, a2.m15538a(c5303j, c5347g))) {
                    C1380m nextToken = c5303j.nextToken();
                    try {
                        Object a3 = c1417o.m3497a(c5347g, a);
                        while (nextToken == C1380m.FIELD_NAME) {
                            c5303j.nextToken();
                            c6523u.copyCurrentStructure(c5303j);
                            nextToken = c5303j.nextToken();
                        }
                        c6523u.writeEndObject();
                        if (a3.getClass() == this.b.m11531e()) {
                            return this.r.m3518a(c5347g, a3, c6523u);
                        }
                        throw c5347g.m11462c("Can not create polymorphic instances with unwrapped values");
                    } catch (Throwable e) {
                        C6485d.m15489a(e, (Object) this.b.m11531e(), currentName, c5347g);
                    }
                } else {
                    continue;
                }
            } else if (!a.m3505a(currentName)) {
                a2 = this.j.m3463a(currentName);
                if (a2 != null) {
                    a.m3507b(a2, a2.m15538a(c5303j, c5347g));
                } else if (this.m == null || !this.m.contains(currentName)) {
                    c6523u.writeFieldName(currentName);
                    c6523u.copyCurrentStructure(c5303j);
                    if (this.l != null) {
                        a.m3502a(this.l, currentName, this.l.m3579a(c5303j, c5347g));
                    }
                } else {
                    m15508c(c5303j, c5347g, mo1307a(), currentName);
                }
            }
            currentToken = c5303j.nextToken();
        }
        try {
            return this.r.m3518a(c5347g, c1417o.m3497a(c5347g, a), c6523u);
        } catch (Throwable e2) {
            m15503a(e2, c5347g);
            return null;
        }
    }

    private Object m18442a(C5303j c5303j, C5347g c5347g, Object obj, Class<?> cls) {
        C1380m currentToken = c5303j.getCurrentToken();
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a = this.j.m3463a(currentName);
            if (a == null) {
                m15501a(c5303j, c5347g, obj, currentName);
            } else if (a.m15547a((Class) cls)) {
                try {
                    obj = a.mo3337b(c5303j, c5347g, obj);
                } catch (Throwable e) {
                    C6485d.m15489a(e, obj, currentName, c5347g);
                }
            } else {
                c5303j.skipChildren();
            }
            currentToken = c5303j.nextToken();
        }
        return obj;
    }

    private java.lang.Object m18443b(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4, java.lang.Object r5) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.k;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r2.m15502a(r4, r5);
    L_0x0007:
        r0 = r2.r;
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        r3 = r2.m18445c(r3, r4, r5);
        return r3;
    L_0x0010:
        r0 = r2.s;
        if (r0 == 0) goto L_0x0019;
    L_0x0014:
        r3 = r2.m18446d(r3, r4, r5);
        return r3;
    L_0x0019:
        r0 = r2.o;
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r0 = r4.m11465d();
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r2.m18442a(r3, r4, r5, r0);
        return r3;
    L_0x0028:
        r0 = r3.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        if (r0 != r1) goto L_0x0034;
    L_0x0030:
        r0 = r3.nextToken();
    L_0x0034:
        r1 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r0 != r1) goto L_0x005a;
    L_0x0038:
        r0 = r3.getCurrentName();
        r3.nextToken();
        r1 = r2.j;
        r1 = r1.m3463a(r0);
        if (r1 == 0) goto L_0x0052;
    L_0x0047:
        r1 = r1.mo3337b(r3, r4, r5);	 Catch:{ Exception -> 0x004d }
        r5 = r1;
        goto L_0x0030;
    L_0x004d:
        r1 = move-exception;
        com.p111d.p112a.p121c.p124c.C6485d.m15489a(r1, r5, r0, r4);
        goto L_0x0030;
    L_0x0052:
        r1 = r2.mo1307a();
        r2.m15501a(r3, r4, r1, r0);
        goto L_0x0030;
    L_0x005a:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.h.b(com.d.a.b.j, com.d.a.c.g, java.lang.Object):java.lang.Object");
    }

    private Object m18444b(C5347g c5347g, Object obj) {
        if (this.f20193u == null) {
            return obj;
        }
        try {
            return this.f20193u.m18500m().invoke(obj, new Object[0]);
        } catch (Throwable e) {
            m15503a(e, c5347g);
            return null;
        }
    }

    private Object m18445c(C5303j c5303j, C5347g c5347g, Object obj) {
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
                        obj = a.mo3337b(c5303j, c5347g, obj);
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

    private Object m18446d(C5303j c5303j, C5347g c5347g, Object obj) {
        Class d = this.o ? c5347g.m11465d() : null;
        C1415e a = this.s.m3486a();
        while (c5303j.getCurrentToken() != C1380m.END_OBJECT) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a2 = this.j.m3463a(currentName);
            if (a2 != null) {
                if (d == null || a2.m15547a(d)) {
                    try {
                        obj = a2.mo3337b(c5303j, c5347g, obj);
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
            c5303j.nextToken();
        }
        return a.m3487a(c5303j, c5347g, obj);
    }

    public final /* synthetic */ C6485d mo3328a(C1416l c1416l) {
        return new C7081h(this, c1416l);
    }

    public final /* synthetic */ C6485d mo3329a(HashSet hashSet) {
        return new C7081h(this, hashSet);
    }

    public final C1507k<Object> mo2806a(C1534n c1534n) {
        return new C7081h(this, c1534n);
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        Object A;
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_OBJECT) {
            c5303j.nextToken();
            if (this.i) {
                A = m18439A(c5303j, c5347g);
            }
            A = a_(c5303j, c5347g);
        } else {
            switch (currentToken) {
                case VALUE_STRING:
                    A = m15514f(c5303j, c5347g);
                    break;
                case VALUE_NUMBER_INT:
                    A = m15512e(c5303j, c5347g);
                    break;
                case VALUE_NUMBER_FLOAT:
                    A = m15515g(c5303j, c5347g);
                    break;
                case VALUE_EMBEDDED_OBJECT:
                    return c5303j.getEmbeddedObject();
                case VALUE_TRUE:
                case VALUE_FALSE:
                    A = m15516h(c5303j, c5347g);
                    break;
                case START_ARRAY:
                    A = m15517i(c5303j, c5347g);
                    break;
                case FIELD_NAME:
                case END_OBJECT:
                    break;
                default:
                    throw c5347g.m11457b(mo1307a());
            }
            A = a_(c5303j, c5347g);
        }
        return m18444b(c5347g, A);
    }

    public final Object mo1309a(C5303j c5303j, C5347g c5347g, Object obj) {
        return m18444b(c5347g, m18443b(c5303j, c5347g, obj));
    }

    public final Object a_(C5303j c5303j, C5347g c5347g) {
        if (!this.h) {
            Object a = this.d.mo1300a(c5347g);
            if (this.k != null) {
                m15502a(c5347g, a);
            }
            if (this.o) {
                Class d = c5347g.m11465d();
                if (d != null) {
                    return m18442a(c5303j, c5347g, a, d);
                }
            }
            while (c5303j.getCurrentToken() != C1380m.END_OBJECT) {
                String currentName = c5303j.getCurrentName();
                c5303j.nextToken();
                C6488s a2 = this.j.m3463a(currentName);
                if (a2 != null) {
                    try {
                        a = a2.mo3337b(c5303j, c5347g, a);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, a, currentName, c5347g);
                    }
                } else {
                    m15501a(c5303j, c5347g, a, currentName);
                }
                c5303j.nextToken();
            }
            return a;
        } else if (this.r != null) {
            return m18440B(c5303j, c5347g);
        } else {
            if (this.s == null) {
                return m15511d(c5303j, c5347g);
            }
            if (this.g == null) {
                return m18446d(c5303j, c5347g, this.d.mo1300a(c5347g));
            }
            throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
        }
    }

    protected final Object mo3331c(C5303j c5303j, C5347g c5347g) {
        C1417o c1417o = this.g;
        C1419r a = c1417o.m3495a(c5303j, c5347g, this.t);
        C1380m currentToken = c5303j.getCurrentToken();
        C6523u c6523u = null;
        while (currentToken == C1380m.FIELD_NAME) {
            String currentName = c5303j.getCurrentName();
            c5303j.nextToken();
            C6488s a2 = c1417o.m3496a(currentName);
            if (a2 != null) {
                if (a.m3504a(a2, a2.m15538a(c5303j, c5347g))) {
                    c5303j.nextToken();
                    try {
                        Object a3 = c1417o.m3497a(c5347g, a);
                        if (a3.getClass() != this.b.m11531e()) {
                            return m15498a(c5303j, c5347g, a3, c6523u);
                        }
                        if (c6523u != null) {
                            a3 = m15500a(c5347g, a3, c6523u);
                        }
                        return m18443b(c5303j, c5347g, a3);
                    } catch (Throwable e) {
                        C6485d.m15489a(e, (Object) this.b.m11531e(), currentName, c5347g);
                    }
                } else {
                    continue;
                }
            } else if (!a.m3505a(currentName)) {
                a2 = this.j.m3463a(currentName);
                if (a2 != null) {
                    a.m3507b(a2, a2.m15538a(c5303j, c5347g));
                } else if (this.m != null && this.m.contains(currentName)) {
                    m15508c(c5303j, c5347g, mo1307a(), currentName);
                } else if (this.l != null) {
                    a.m3502a(this.l, currentName, this.l.m3579a(c5303j, c5347g));
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
            Object a4 = c1417o.m3497a(c5347g, a);
            if (c6523u != null) {
                if (a4.getClass() != this.b.m11531e()) {
                    return m15498a(null, c5347g, a4, c6523u);
                }
                a4 = m15500a(c5347g, a4, c6523u);
            }
            return a4;
        } catch (Throwable e2) {
            m15503a(e2, c5347g);
            return null;
        }
    }

    protected final /* synthetic */ C6485d mo3332f() {
        return new C7044a(this, this.j.f4451c, this.f20193u);
    }
}
