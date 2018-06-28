package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ag.C6463c;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1446d.C7084a;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5308b.C1405a;
import com.p111d.p112a.p121c.C5308b.C1405a.C1403a;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p123b.C1408d;
import com.p111d.p112a.p121c.p124c.p125a.C1416l;
import com.p111d.p112a.p121c.p124c.p125a.C5310k;
import com.p111d.p112a.p121c.p124c.p125a.C7046g;
import com.p111d.p112a.p121c.p124c.p125a.C7049j;
import com.p111d.p112a.p121c.p124c.p125a.C7052p;
import com.p111d.p112a.p121c.p124c.p125a.C7053t;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C1453o.C1452a;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6492d;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C5379s;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jivesoftware.smack.packet.Message;

public final class C6486f extends C5324b implements Serializable {
    public static final C6486f f17695e = new C6486f(new C1408d());
    private static final Class<?>[] f17696g = new Class[]{Throwable.class};
    private static final Class<?>[] f17697h = new Class[0];

    private C6486f(C1408d c1408d) {
        super(c1408d);
    }

    private C6488s m15519a(C5347g c5347g, C1445c c1445c, C1451n c1451n, C5354j c5354j) {
        C6488s a;
        C1449a s = c1451n.mo1417s();
        if (c5347g.m11466e()) {
            s.m11278a(c5347g.m11453a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        C7084a c7084a = new C7084a(c1451n.mo1400b(), c5354j, c1451n.mo1401c(), c1445c.mo1376f(), s, c1451n.mo1402d());
        C5354j a2 = m11210a(c5347g, c5354j, (C5328e) s);
        if (a2 != c5354j) {
            c7084a.m11225a(a2);
        }
        C1507k a3 = C5324b.m11200a(c5347g, s);
        C5354j a4 = C5324b.m11199a(c5347g, s, a2);
        C1475c c1475c = (C1475c) a4.mo2931B();
        C6488s c7049j;
        if (s instanceof C7087f) {
            c7049j = new C7049j(c1451n, a4, c1475c, c1445c.mo1376f(), (C7087f) s);
        } else {
            c7049j = new C7046g(c1451n, a4, c1475c, c1445c.mo1376f(), (C6492d) s);
        }
        if (a3 != null) {
            a = a.mo3333a(a3);
        }
        C1405a v = c1451n.mo1420v();
        if (v != null) {
            if ((v.f4420a == C1403a.f4417a ? 1 : null) != null) {
                a.m15550b(v.f4421b);
            }
        }
        C1457t x = c1451n.mo1422x();
        if (x != null) {
            a.m15542a(x);
        }
        return a;
    }

    private static void m15520a(C5347g c5347g, C1445c c1445c, C1431e c1431e) {
        C1457t d = c1445c.mo1374d();
        if (d != null) {
            C5354j a;
            af c7052p;
            C6488s c6488s;
            Class c = d.m3707c();
            ah b = c5347g.m3653b(d);
            if (c == C6463c.class) {
                C1549v a2 = d.m3705a();
                C6488s a3 = c1431e.m3525a(a2);
                if (a3 == null) {
                    StringBuilder stringBuilder = new StringBuilder("Invalid Object Id definition for ");
                    stringBuilder.append(c1445c.m3619b().getName());
                    stringBuilder.append(": can not find property with name '");
                    stringBuilder.append(a2);
                    stringBuilder.append("'");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                a = a3.mo1350a();
                c7052p = new C7052p(d.m3706b());
                c6488s = a3;
            } else {
                a = c5347g.m11435a(c);
                c5347g.mo1297b();
                a = C1513m.m3916c(a, af.class)[0];
                c6488s = null;
                c7052p = c5347g.m3648a(d);
            }
            C5354j c5354j = a;
            c1431e.m3527a(C1416l.m3490a(c5354j, d.m3705a(), c7052p, c5347g.m11454b(c5354j), c6488s, b));
        }
    }

    private static C1431e m15521b(C5347g c5347g, C1445c c1445c) {
        return new C1431e(c1445c, c5347g.m11460c());
    }

    private void m15522b(C5347g c5347g, C1445c c1445c, C1431e c1431e) {
        Iterator it;
        C6486f c6486f = this;
        C5347g c5347g2 = c5347g;
        C1445c c1445c2 = c1445c;
        C1431e c1431e2 = c1431e;
        C6488s[] a = c1431e.m3536b().mo1320a(c5347g.m11460c());
        int f = c1445c.m3615a().mo3388f() ^ 1;
        C5308b g = c5347g.m11468g();
        Boolean findIgnoreUnknownProperties = g.findIgnoreUnknownProperties(c1445c.mo1373c());
        if (findIgnoreUnknownProperties != null) {
            c1431e2.m3535a(findIgnoreUnknownProperties.booleanValue());
        }
        Set<String> a2 = C1519b.m3936a(g.findPropertiesToIgnore(c1445c.mo1373c(), false));
        for (String a3 : a2) {
            c1431e2.m3533a(a3);
        }
        C1449a n = c1445c.mo1384n();
        if (n != null) {
            if (c5347g.m11466e()) {
                n.m11278a(c5347g2.m11453a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            C5354j a4 = n.mo3352a(1);
            C7084a c7084a = new C7084a(C1549v.m4055a(n.mo1360b()), a4, null, c1445c.mo1376f(), n, C1548u.f4829b);
            a4 = m11210a(c5347g2, a4, (C5328e) n);
            C1507k a5 = C5324b.m11200a(c5347g2, n);
            C5354j a6 = C5324b.m11199a(c5347g2, n, a4);
            c1431e2.m3528a(new C1441r(c7084a, n, a6, a5 == null ? (C1507k) a6.mo2930A() : a5, (C1475c) a6.mo2931B()));
        }
        if (n == null) {
            Collection<String> i = c1445c.mo1379i();
            if (i != null) {
                for (String a32 : i) {
                    c1431e2.m3533a(a32);
                }
            }
        }
        int i2 = (c5347g2.m11453a(C5385q.USE_GETTERS_AS_SETTERS) && c5347g2.m11453a(C5385q.AUTO_DETECT_GETTERS)) ? 1 : false;
        List g2 = c1445c.mo1377g();
        List<C1451n> arrayList = new ArrayList(Math.max(4, g2.size()));
        Map hashMap = new HashMap();
        Iterator it2 = g2.iterator();
        while (true) {
            Class cls = null;
            if (!it2.hasNext()) {
                break;
            }
            C1451n c1451n = (C1451n) it2.next();
            String a7 = c1451n.mo1398a();
            if (!a2.contains(a7)) {
                if (!c1451n.mo1410l()) {
                    if (c1451n.mo1408j()) {
                        cls = c1451n.mo1412n().mo3356h();
                    } else if (c1451n.mo1409k()) {
                        cls = c1451n.mo1413o().mo1363d();
                    }
                    if (cls != null) {
                        boolean z;
                        C7089f c = c5347g.m11460c();
                        Boolean bool = (Boolean) hashMap.get(cls);
                        if (bool == null) {
                            bool = c.mo3358a().isIgnorableType(c.m11081c(cls).mo1373c());
                            if (bool == null) {
                                z = false;
                                if (z) {
                                    c1431e2.m3533a(a7);
                                }
                            }
                        }
                        z = bool.booleanValue();
                        if (z) {
                            c1431e2.m3533a(a7);
                        }
                    }
                }
                arrayList.add(c1451n);
            }
        }
        if (c6486f.d.m3433b()) {
            it = c6486f.d.m3438g().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        for (C1451n c1451n2 : arrayList) {
            C6488s a8;
            Class[] u;
            if (c1451n2.mo1408j()) {
                a4 = c1451n2.mo1412n().mo3352a(0);
            } else if (c1451n2.mo1409k()) {
                a4 = c1451n2.mo1413o().mo1362c();
            } else {
                if (i2 != 0 && c1451n2.mo1407i()) {
                    Class d = c1451n2.mo1411m().mo1363d();
                    if (Collection.class.isAssignableFrom(d) || Map.class.isAssignableFrom(d)) {
                        C1449a m = c1451n2.mo1411m();
                        if (c5347g.m11466e()) {
                            m.m11278a(c5347g2.m11453a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                        }
                        C5354j c2 = m.mo1362c();
                        C1507k a9 = C5324b.m11200a(c5347g2, m);
                        c2 = m11210a(c5347g2, C5324b.m11199a(c5347g2, m, c2), (C5328e) m);
                        C6488s c7053t = new C7053t(c1451n2, c2, (C1475c) c2.mo2931B(), c1445c.mo1376f(), m);
                        a8 = a9 != null ? c7053t.mo3333a(a9) : c7053t;
                        if (f == 0 && c1451n2.mo1410l()) {
                            C6488s c6488s;
                            String a10 = c1451n2.mo1398a();
                            if (a != null) {
                                for (C6488s c6488s2 : a) {
                                    if (a10.equals(c6488s2.m15554f()) && (c6488s2 instanceof C7082k)) {
                                        c6488s = (C7082k) c6488s2;
                                        break;
                                    }
                                }
                            }
                            c6488s = null;
                            if (c6488s == null) {
                                throw c5347g2.m11446a("Could not find creator property with name '%s' (in class %s)", a10, c1445c.m3619b().getName());
                            }
                            if (a8 != null) {
                                c6488s.m18457a(a8);
                            }
                            c1431e2.m3539c(c6488s);
                        } else if (a8 == null) {
                            u = c1451n2.mo1419u();
                            if (u == null && !c5347g2.m11453a(C5385q.DEFAULT_VIEW_INCLUSION)) {
                                u = f17697h;
                            }
                            a8.m15546a(u);
                            c1431e2.m3537b(a8);
                        }
                    }
                }
                a8 = null;
                if (f == 0) {
                }
                if (a8 == null) {
                    u = c1451n2.mo1419u();
                    u = f17697h;
                    a8.m15546a(u);
                    c1431e2.m3537b(a8);
                }
            }
            a8 = m15519a(c5347g2, c1445c2, c1451n2, a4);
            if (f == 0) {
            }
            if (a8 == null) {
                u = c1451n2.mo1419u();
                u = f17697h;
                a8.m15546a(u);
                c1431e2.m3537b(a8);
            }
        }
    }

    private void m15523c(C5347g c5347g, C1445c c1445c, C1431e c1431e) {
        Map h = c1445c.mo1378h();
        if (h != null) {
            for (Entry entry : h.entrySet()) {
                String str = (String) entry.getKey();
                C5328e c5328e = (C5328e) entry.getValue();
                c1431e.m3534a(str, m15519a(c5347g, c1445c, C5379s.m11601a(c5347g.m11460c(), c5328e), c5328e instanceof C7087f ? ((C7087f) c5328e).mo3352a(0) : c5328e.mo1362c()));
            }
        }
    }

    private C1507k<Object> m15524d(C5347g c5347g, C5354j c5354j, C1445c c1445c) {
        try {
            C1443v a = m11208a(c5347g, c1445c);
            C1431e b = C6486f.m15521b(c5347g, c1445c);
            b.m3530a(a);
            m15522b(c5347g, c1445c, b);
            C6486f.m15520a(c5347g, c1445c, b);
            m15523c(c5347g, c1445c, b);
            C6486f.m15525d(c5347g, c1445c, b);
            if (this.d.m3433b()) {
                Iterator it = this.d.m3438g().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            C1507k<Object> f = (!c5354j.mo3388f() || a.mo1302b()) ? b.m3542f() : b.m3543g();
            if (this.d.m3433b()) {
                Iterator it2 = this.d.m3438g().iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            return f;
        } catch (NoClassDefFoundError e) {
            return new C5310k(e);
        }
    }

    private static void m15525d(C5347g c5347g, C1445c c1445c, C1431e c1431e) {
        Map s = c1445c.mo1389s();
        if (s != null) {
            boolean e = c5347g.m11466e();
            boolean z = e && c5347g.m11453a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
            for (Entry entry : s.entrySet()) {
                C5328e c5328e = (C5328e) entry.getValue();
                if (e) {
                    c5328e.m11278a(z);
                }
                c1431e.m3532a(C1549v.m4055a(c5328e.mo1360b()), c5328e.mo1362c(), c1445c.mo1376f(), c5328e, entry.getKey());
            }
        }
    }

    public final C1507k<Object> mo2809a(C5347g c5347g, C5354j c5354j, Class<?> cls) {
        C5354j a = c5347g.m11435a((Class) cls);
        C1452a c = c5347g.m11460c();
        C1445c b = c.m11088l().mo1395b(c, a, c);
        C1443v a2 = m11208a(c5347g, b);
        C7089f c2 = c5347g.m11460c();
        C1431e b2 = C6486f.m15521b(c5347g, b);
        b2.m3530a(a2);
        m15522b(c5347g, b, b2);
        C6486f.m15520a(c5347g, b, b2);
        m15523c(c5347g, b, b2);
        C6486f.m15525d(c5347g, b, b2);
        C1393a u = b.mo1391u();
        String str = u == null ? "build" : u.f4405a;
        C7087f a3 = b.mo1368a(str, null);
        if (a3 != null && c2.m11086j()) {
            C1527g.m3961a(a3.m18500m(), c2.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        b2.m3531a(a3, u);
        if (this.d.m3433b()) {
            Iterator it = this.d.m3438g().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        C1507k<Object> a4 = b2.m3526a(c5354j, str);
        if (this.d.m3433b()) {
            Iterator it2 = this.d.m3438g().iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return a4;
    }

    public final C1507k<Object> mo2810c(C5347g c5347g, C5354j c5354j, C1445c c1445c) {
        C1507k<Object> a = m11212a();
        if (a != null) {
            return a;
        }
        if (c5354j.m11534h()) {
            Iterator it;
            C1431e b = C6486f.m15521b(c5347g, c1445c);
            b.m3530a(m11208a(c5347g, c1445c));
            m15522b(c5347g, c1445c, b);
            C5328e a2 = c1445c.mo1368a("initCause", f17696g);
            if (a2 != null) {
                C6488s a3 = m15519a(c5347g, c1445c, C5379s.m11602a(c5347g.m11460c(), a2, new C1549v("cause")), a2.mo3352a(0));
                if (a3 != null) {
                    b.m3529a(a3);
                }
            }
            b.m3533a("localizedMessage");
            b.m3533a("suppressed");
            b.m3533a(Message.ELEMENT);
            if (this.d.m3433b()) {
                it = this.d.m3438g().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            C1507k afVar = new com.p111d.p112a.p121c.p124c.p126b.af((C7080c) b.m3542f());
            if (this.d.m3433b()) {
                it = this.d.m3438g().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            return afVar;
        }
        if (c5354j.mo3388f() && !c5354j.m11538l()) {
            Iterator it2 = this.d.m3439h().iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        a = m11221b(c5347g, c5354j, c1445c);
        if (a != null && this.d.m3433b()) {
            Iterator it3 = this.d.m3438g().iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        if (a != null) {
            return a;
        }
        Class e = c5354j.m11531e();
        String a4 = C1527g.m3952a(e);
        StringBuilder stringBuilder;
        if (a4 != null) {
            stringBuilder = new StringBuilder("Can not deserialize Class ");
            stringBuilder.append(e.getName());
            stringBuilder.append(" (of type ");
            stringBuilder.append(a4);
            stringBuilder.append(") as a Bean");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (C1527g.m3969d(e)) {
            stringBuilder = new StringBuilder("Can not deserialize Proxy class ");
            stringBuilder.append(e.getName());
            stringBuilder.append(" as a Bean");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a4 = C1527g.m3964b(e);
            if (a4 == null) {
                return m15524d(c5347g, c5354j, c1445c);
            }
            stringBuilder = new StringBuilder("Can not deserialize Class ");
            stringBuilder.append(e.getName());
            stringBuilder.append(" (of type ");
            stringBuilder.append(a4);
            stringBuilder.append(") as a Bean");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
