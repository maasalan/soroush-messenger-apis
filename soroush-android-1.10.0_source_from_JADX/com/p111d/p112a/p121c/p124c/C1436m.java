package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p113a.C1320j.C1318c;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1507k.C5355a;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p124c.p126b.C6480w;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p137l.C7122a;
import com.p111d.p112a.p121c.p137l.C7123d;
import com.p111d.p112a.p121c.p137l.C7124f;
import com.p111d.p112a.p121c.p137l.C7305e;
import com.p111d.p112a.p121c.p137l.C7306g;
import com.p111d.p112a.p121c.p137l.C7307h;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1529i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class C1436m implements Serializable {
    protected final ConcurrentHashMap<C5354j, C1507k<Object>> f4530a = new ConcurrentHashMap(64, 0.75f, 4);
    protected final HashMap<C5354j, C1507k<Object>> f4531b = new HashMap(8);

    private static C1507k<?> m3546a(C5347g c5347g, C1437n c1437n, C5354j c5354j, C1445c c1445c) {
        if (c5354j.m11536j()) {
            return c1437n.mo1340a(c5347g, c5354j, c1445c);
        }
        if (c5354j.mo3391n()) {
            if (c5354j.mo3390i()) {
                return c1437n.mo1341a(c5347g, (C7122a) c5354j);
            }
            if (c5354j.mo3397p()) {
                C7124f c7124f = (C7124f) c5354j;
                return c7124f.m18685E() ? c1437n.mo1345a(c5347g, (C7306g) c7124f, c1445c) : c1437n.mo1344a(c5347g, c7124f);
            } else if (c5354j.mo3396o()) {
                C1319d p = c1445c.mo1386p();
                if (p == null || p.f4140b != C1318c.OBJECT) {
                    C7123d c7123d = (C7123d) c5354j;
                    return c7123d.m18666E() ? c1437n.mo1343a(c5347g, (C7305e) c7123d, c1445c) : c1437n.mo1342a(c5347g, c7123d);
                }
            }
        }
        return c5354j.mo3560a() ? c1437n.mo1346a(c5347g, (C7307h) c5354j) : C6524m.class.isAssignableFrom(c5354j.m11531e()) ? c1437n.mo1348b(c5354j) : c1437n.mo2810c(c5347g, c5354j, c1445c);
    }

    private C1507k<Object> m3547a(C5354j c5354j) {
        if (c5354j != null) {
            return C1436m.m3549b(c5354j) ? null : (C1507k) this.f4530a.get(c5354j);
        } else {
            throw new IllegalArgumentException("Null JavaType passed");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p111d.p112a.p121c.C1507k<java.lang.Object> m3548b(com.p111d.p112a.p121c.C5347g r4, com.p111d.p112a.p121c.p124c.C1437n r5, com.p111d.p112a.p121c.C5354j r6) {
        /*
        r3 = this;
        r0 = r3.f4531b;
        monitor-enter(r0);
        r1 = r3.m3547a(r6);	 Catch:{ all -> 0x0045 }
        if (r1 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return r1;
    L_0x000b:
        r1 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r1 = r1.size();	 Catch:{ all -> 0x0045 }
        if (r1 <= 0) goto L_0x001f;
    L_0x0013:
        r2 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r2 = r2.get(r6);	 Catch:{ all -> 0x0045 }
        r2 = (com.p111d.p112a.p121c.C1507k) r2;	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return r2;
    L_0x001f:
        r4 = r3.m3550c(r4, r5, r6);	 Catch:{ all -> 0x0034 }
        if (r1 != 0) goto L_0x0032;
    L_0x0025:
        r5 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r5 = r5.size();	 Catch:{ all -> 0x0045 }
        if (r5 <= 0) goto L_0x0032;
    L_0x002d:
        r5 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r5.clear();	 Catch:{ all -> 0x0045 }
    L_0x0032:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return r4;
    L_0x0034:
        r4 = move-exception;
        if (r1 != 0) goto L_0x0044;
    L_0x0037:
        r5 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r5 = r5.size();	 Catch:{ all -> 0x0045 }
        if (r5 <= 0) goto L_0x0044;
    L_0x003f:
        r5 = r3.f4531b;	 Catch:{ all -> 0x0045 }
        r5.clear();	 Catch:{ all -> 0x0045 }
    L_0x0044:
        throw r4;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.m.b(com.d.a.c.g, com.d.a.c.c.n, com.d.a.c.j):com.d.a.c.k<java.lang.Object>");
    }

    private static boolean m3549b(C5354j c5354j) {
        if (c5354j.mo3391n()) {
            c5354j = c5354j.mo3394u();
            if (c5354j != null) {
                if (c5354j.mo2930A() == null) {
                    if (c5354j.mo2931B() == null) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private C1507k<Object> m3550c(C5347g c5347g, C1437n c1437n, C5354j c5354j) {
        try {
            C5354j c5354j2;
            C1445c b;
            C1449a c;
            Object findDeserializer;
            C1507k<Object> c1507k;
            Object findDeserializationConverter;
            C1529i a;
            C5308b g;
            C5354j c5354j3;
            C5354j t;
            Object findKeyDeserializer;
            C1546p d;
            C5354j u;
            Object findContentDeserializer;
            String str;
            Class cls;
            StringBuilder stringBuilder;
            Class t2;
            C5354j b2;
            boolean z;
            Object obj;
            C7089f c2 = c5347g.m11460c();
            if (!(c5354j.mo3388f() || c5354j.mo3397p())) {
                if (!c5354j.mo3396o()) {
                    c5354j2 = c5354j;
                    b = c2.m18510b(c5354j2);
                    c = b.mo1373c();
                    findDeserializer = c5347g.m11468g().findDeserializer(c);
                    if (findDeserializer != null) {
                        c1507k = null;
                    } else {
                        c1507k = c5347g.mo2812c(findDeserializer);
                        findDeserializationConverter = c5347g.m11468g().findDeserializationConverter(c);
                        a = findDeserializationConverter != null ? null : c5347g.m3652a(findDeserializationConverter);
                        if (a == null) {
                            c5347g.mo1297b();
                            c1507k = new C6480w(a, a.m3991b(), c1507k);
                        }
                    }
                    if (c1507k != null) {
                        c = b.mo1373c();
                        g = c5347g.m11468g();
                        if (g != null) {
                            c5354j3 = c5354j2;
                        } else {
                            if (c5354j2.mo3397p()) {
                                t = c5354j2.mo3398t();
                                if (t != null && t.mo2930A() == null) {
                                    findKeyDeserializer = g.findKeyDeserializer(c);
                                    if (findKeyDeserializer != null) {
                                        d = c5347g.mo2813d(findKeyDeserializer);
                                        if (d != null) {
                                            t = ((C7124f) c5354j2).mo3558i(d);
                                            u = t.mo3394u();
                                            if (u != null && u.mo2930A() == null) {
                                                findContentDeserializer = g.findContentDeserializer(c);
                                                if (findContentDeserializer != null) {
                                                    if (!(findContentDeserializer instanceof C1507k)) {
                                                        str = "findContentDeserializer";
                                                        cls = C5355a.class;
                                                        if (findContentDeserializer != null) {
                                                            if (findContentDeserializer instanceof Class) {
                                                                stringBuilder = new StringBuilder("AnnotationIntrospector.");
                                                                stringBuilder.append(str);
                                                                stringBuilder.append("() returned value of type ");
                                                                stringBuilder.append(findContentDeserializer.getClass().getName());
                                                                stringBuilder.append(": expected type JsonSerializer or Class<JsonSerializer> instead");
                                                                throw new IllegalStateException(stringBuilder.toString());
                                                            }
                                                            findContentDeserializer = (Class) findContentDeserializer;
                                                            if (findContentDeserializer != cls) {
                                                                if (C1527g.m3983r(findContentDeserializer)) {
                                                                }
                                                                if (findContentDeserializer != null) {
                                                                    findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                                                    if (findContentDeserializer != null) {
                                                                        t = t.mo3386d(findContentDeserializer);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        findContentDeserializer = null;
                                                        if (findContentDeserializer != null) {
                                                            findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                                            if (findContentDeserializer != null) {
                                                                t = t.mo3386d(findContentDeserializer);
                                                            }
                                                        }
                                                    }
                                                    findContentDeserializer = null;
                                                    if (findContentDeserializer != null) {
                                                        t = t.mo3386d(findContentDeserializer);
                                                    }
                                                }
                                            }
                                            c5354j3 = g.refineDeserializationType(c5347g.m11460c(), c, t);
                                        }
                                    }
                                }
                            }
                            t = c5354j2;
                            u = t.mo3394u();
                            findContentDeserializer = g.findContentDeserializer(c);
                            if (findContentDeserializer != null) {
                                if (findContentDeserializer instanceof C1507k) {
                                    str = "findContentDeserializer";
                                    cls = C5355a.class;
                                    if (findContentDeserializer != null) {
                                        if (findContentDeserializer instanceof Class) {
                                            findContentDeserializer = (Class) findContentDeserializer;
                                            if (findContentDeserializer != cls) {
                                                if (C1527g.m3983r(findContentDeserializer)) {
                                                }
                                                if (findContentDeserializer != null) {
                                                    findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                                    if (findContentDeserializer != null) {
                                                        t = t.mo3386d(findContentDeserializer);
                                                    }
                                                }
                                            }
                                        } else {
                                            stringBuilder = new StringBuilder("AnnotationIntrospector.");
                                            stringBuilder.append(str);
                                            stringBuilder.append("() returned value of type ");
                                            stringBuilder.append(findContentDeserializer.getClass().getName());
                                            stringBuilder.append(": expected type JsonSerializer or Class<JsonSerializer> instead");
                                            throw new IllegalStateException(stringBuilder.toString());
                                        }
                                    }
                                    findContentDeserializer = null;
                                    if (findContentDeserializer != null) {
                                        findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                        if (findContentDeserializer != null) {
                                            t = t.mo3386d(findContentDeserializer);
                                        }
                                    }
                                }
                                findContentDeserializer = null;
                                if (findContentDeserializer != null) {
                                    t = t.mo3386d(findContentDeserializer);
                                }
                            }
                            c5354j3 = g.refineDeserializationType(c5347g.m11460c(), c, t);
                        }
                        if (c5354j3 != c5354j2) {
                            b = c2.m18510b(c5354j3);
                            c5354j2 = c5354j3;
                        }
                        t2 = b.mo1390t();
                        if (t2 == null) {
                            c1507k = c1437n.mo2809a(c5347g, c5354j2, t2);
                        } else {
                            a = b.mo1388r();
                            if (a != null) {
                                c1507k = C1436m.m3546a(c5347g, c1437n, c5354j2, b);
                            } else {
                                c5347g.mo1297b();
                                b2 = a.m3991b();
                                if (!b2.m11526c(c5354j2.m11531e())) {
                                    b = c2.m18510b(b2);
                                }
                                c1507k = new C6480w(a, b2, C1436m.m3546a(c5347g, c1437n, b2, b));
                            }
                        }
                    }
                    if (c1507k == null) {
                        return null;
                    }
                    z = c1507k instanceof C1440q;
                    obj = (C1436m.m3549b(c5354j) || !c1507k.mo1311b()) ? null : 1;
                    if (z) {
                        this.f4531b.put(c5354j, c1507k);
                        ((C1440q) c1507k).mo2802c(c5347g);
                        this.f4531b.remove(c5354j);
                    }
                    if (obj != null) {
                        this.f4530a.put(c5354j, c1507k);
                    }
                    return c1507k;
                }
            }
            c5354j2 = c1437n.mo1339a(c5354j);
            b = c2.m18510b(c5354j2);
            c = b.mo1373c();
            findDeserializer = c5347g.m11468g().findDeserializer(c);
            if (findDeserializer != null) {
                c1507k = c5347g.mo2812c(findDeserializer);
                findDeserializationConverter = c5347g.m11468g().findDeserializationConverter(c);
                if (findDeserializationConverter != null) {
                }
                if (a == null) {
                    c5347g.mo1297b();
                    c1507k = new C6480w(a, a.m3991b(), c1507k);
                }
            } else {
                c1507k = null;
            }
            if (c1507k != null) {
                c = b.mo1373c();
                g = c5347g.m11468g();
                if (g != null) {
                    if (c5354j2.mo3397p()) {
                        t = c5354j2.mo3398t();
                        findKeyDeserializer = g.findKeyDeserializer(c);
                        if (findKeyDeserializer != null) {
                            d = c5347g.mo2813d(findKeyDeserializer);
                            if (d != null) {
                                t = ((C7124f) c5354j2).mo3558i(d);
                                u = t.mo3394u();
                                findContentDeserializer = g.findContentDeserializer(c);
                                if (findContentDeserializer != null) {
                                    if (findContentDeserializer instanceof C1507k) {
                                        str = "findContentDeserializer";
                                        cls = C5355a.class;
                                        if (findContentDeserializer != null) {
                                            if (findContentDeserializer instanceof Class) {
                                                stringBuilder = new StringBuilder("AnnotationIntrospector.");
                                                stringBuilder.append(str);
                                                stringBuilder.append("() returned value of type ");
                                                stringBuilder.append(findContentDeserializer.getClass().getName());
                                                stringBuilder.append(": expected type JsonSerializer or Class<JsonSerializer> instead");
                                                throw new IllegalStateException(stringBuilder.toString());
                                            }
                                            findContentDeserializer = (Class) findContentDeserializer;
                                            if (findContentDeserializer != cls) {
                                                if (C1527g.m3983r(findContentDeserializer)) {
                                                }
                                                if (findContentDeserializer != null) {
                                                    findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                                    if (findContentDeserializer != null) {
                                                        t = t.mo3386d(findContentDeserializer);
                                                    }
                                                }
                                            }
                                        }
                                        findContentDeserializer = null;
                                        if (findContentDeserializer != null) {
                                            findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                            if (findContentDeserializer != null) {
                                                t = t.mo3386d(findContentDeserializer);
                                            }
                                        }
                                    }
                                    findContentDeserializer = null;
                                    if (findContentDeserializer != null) {
                                        t = t.mo3386d(findContentDeserializer);
                                    }
                                }
                                c5354j3 = g.refineDeserializationType(c5347g.m11460c(), c, t);
                            }
                        }
                    }
                    t = c5354j2;
                    u = t.mo3394u();
                    findContentDeserializer = g.findContentDeserializer(c);
                    if (findContentDeserializer != null) {
                        if (findContentDeserializer instanceof C1507k) {
                            str = "findContentDeserializer";
                            cls = C5355a.class;
                            if (findContentDeserializer != null) {
                                if (findContentDeserializer instanceof Class) {
                                    findContentDeserializer = (Class) findContentDeserializer;
                                    if (findContentDeserializer != cls) {
                                        if (C1527g.m3983r(findContentDeserializer)) {
                                        }
                                        if (findContentDeserializer != null) {
                                            findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                            if (findContentDeserializer != null) {
                                                t = t.mo3386d(findContentDeserializer);
                                            }
                                        }
                                    }
                                } else {
                                    stringBuilder = new StringBuilder("AnnotationIntrospector.");
                                    stringBuilder.append(str);
                                    stringBuilder.append("() returned value of type ");
                                    stringBuilder.append(findContentDeserializer.getClass().getName());
                                    stringBuilder.append(": expected type JsonSerializer or Class<JsonSerializer> instead");
                                    throw new IllegalStateException(stringBuilder.toString());
                                }
                            }
                            findContentDeserializer = null;
                            if (findContentDeserializer != null) {
                                findContentDeserializer = c5347g.mo2812c(findContentDeserializer);
                                if (findContentDeserializer != null) {
                                    t = t.mo3386d(findContentDeserializer);
                                }
                            }
                        }
                        findContentDeserializer = null;
                        if (findContentDeserializer != null) {
                            t = t.mo3386d(findContentDeserializer);
                        }
                    }
                    c5354j3 = g.refineDeserializationType(c5347g.m11460c(), c, t);
                } else {
                    c5354j3 = c5354j2;
                }
                if (c5354j3 != c5354j2) {
                    b = c2.m18510b(c5354j3);
                    c5354j2 = c5354j3;
                }
                t2 = b.mo1390t();
                if (t2 == null) {
                    a = b.mo1388r();
                    if (a != null) {
                        c5347g.mo1297b();
                        b2 = a.m3991b();
                        if (b2.m11526c(c5354j2.m11531e())) {
                            b = c2.m18510b(b2);
                        }
                        c1507k = new C6480w(a, b2, C1436m.m3546a(c5347g, c1437n, b2, b));
                    } else {
                        c1507k = C1436m.m3546a(c5347g, c1437n, c5354j2, b);
                    }
                } else {
                    c1507k = c1437n.mo2809a(c5347g, c5354j2, t2);
                }
            }
            if (c1507k == null) {
                return null;
            }
            z = c1507k instanceof C1440q;
            if (!C1436m.m3549b(c5354j)) {
            }
            if (z) {
                this.f4531b.put(c5354j, c1507k);
                ((C1440q) c1507k).mo2802c(c5347g);
                this.f4531b.remove(c5354j);
            }
            if (obj != null) {
                this.f4530a.put(c5354j, c1507k);
            }
            return c1507k;
        } catch (Throwable e) {
            throw C5364l.m11575a(c5347g, e.getMessage(), e);
        }
    }

    public final C1507k<Object> m3551a(C5347g c5347g, C1437n c1437n, C5354j c5354j) {
        C1507k<Object> a = m3547a(c5354j);
        if (a == null) {
            a = m3548b(c5347g, c1437n, c5354j);
            if (a == null) {
                StringBuilder stringBuilder;
                if (C1527g.m3970e(c5354j.m11531e())) {
                    stringBuilder = new StringBuilder("Can not find a Value deserializer for type ");
                    stringBuilder.append(c5354j);
                    throw C5364l.m11574a(c5347g, stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("Can not find a Value deserializer for abstract type ");
                stringBuilder.append(c5354j);
                throw C5364l.m11574a(c5347g, stringBuilder.toString());
            }
        }
        return a;
    }
}
