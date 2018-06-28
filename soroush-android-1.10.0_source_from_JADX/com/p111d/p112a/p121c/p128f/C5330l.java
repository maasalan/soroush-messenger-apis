package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5308b.C1405a;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.p122a.C1394e.C1393a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p138m.C1517a;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1529i;
import com.p111d.p112a.p121c.p138m.C1529i.C5372a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C5330l extends C1445c {
    protected final C1458u f14812b;
    protected final C5306f<?> f14813c;
    protected final C5308b f14814d;
    protected final C5327b f14815e;
    protected List<C1451n> f14816f;
    protected C1457t f14817g;

    private C5330l(C5306f<?> c5306f, C5354j c5354j, C5327b c5327b, List<C1451n> list) {
        super(c5354j);
        C5308b c5308b = null;
        this.f14812b = null;
        this.f14813c = c5306f;
        if (this.f14813c != null) {
            c5308b = this.f14813c.mo3358a();
        }
        this.f14814d = c5308b;
        this.f14815e = c5327b;
        this.f14816f = list;
    }

    C5330l(C1458u c1458u) {
        this(c1458u, c1458u.m3728b(), c1458u.m3729c());
        this.f14817g = c1458u.m3736j();
    }

    private C5330l(C1458u c1458u, C5354j c5354j, C5327b c5327b) {
        super(c5354j);
        this.f14812b = c1458u;
        this.f14813c = c1458u.m3727a();
        this.f14814d = this.f14813c == null ? null : this.f14813c.mo3358a();
        this.f14815e = c5327b;
    }

    public static C5330l m11296a(C5306f<?> c5306f, C5354j c5354j, C5327b c5327b) {
        return new C5330l(c5306f, c5354j, c5327b, Collections.emptyList());
    }

    public static C5330l m11297a(C1458u c1458u) {
        return new C5330l(c1458u);
    }

    private C1529i<Object, Object> m11298a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof C1529i) {
            return (C1529i) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == C5372a.class || C1527g.m3983r(cls)) {
                return null;
            }
            if (C1529i.class.isAssignableFrom(cls)) {
                this.f14813c.m11090n();
                return (C1529i) C1527g.m3951a(cls, this.f14813c.m11086j());
            }
            StringBuilder stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
            stringBuilder.append(cls.getName());
            stringBuilder.append("; expected Class<Converter>");
            throw new IllegalStateException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("AnnotationIntrospector returned Converter definition of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append("; expected type Converter or Class<Converter> instead");
        throw new IllegalStateException(stringBuilder.toString());
    }

    private boolean m11299a(C7087f c7087f) {
        if (!m3619b().isAssignableFrom(c7087f.m18503p())) {
            return false;
        }
        if (this.f14814d.hasCreatorAnnotation(c7087f)) {
            return true;
        }
        String b = c7087f.mo1360b();
        if ("valueOf".equals(b)) {
            return true;
        }
        if ("fromString".equals(b) && 1 == c7087f.mo3355g()) {
            Class h = c7087f.mo3356h();
            if (h == String.class || CharSequence.class.isAssignableFrom(h)) {
                return true;
            }
        }
        return false;
    }

    public final C1328b mo1367a(C1328b c1328b) {
        if (this.f14814d == null) {
            return c1328b;
        }
        C1328b findPropertyInclusion = this.f14814d.findPropertyInclusion(this.f14815e);
        return findPropertyInclusion != null ? c1328b.m3138a(findPropertyInclusion) : c1328b;
    }

    public final C7087f mo1368a(String str, Class<?>[] clsArr) {
        return this.f14815e.m11259a(str, (Class[]) clsArr);
    }

    public final C5354j mo1369a(Type type) {
        return type == null ? null : this.f14813c.m11092p().m3920a(type, this.a.mo2936x());
    }

    public final Object mo1370a(boolean z) {
        C7086c g = this.f14815e.m11270g();
        if (g == null) {
            return null;
        }
        if (z) {
            g.m11278a(this.f14813c.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return g.m18477f().newInstance(new Object[0]);
        } catch (Exception e) {
            Throwable e2 = e;
            while (e2.getCause() != null) {
                e2 = e2.getCause();
            }
            if (e2 instanceof Error) {
                throw ((Error) e2);
            } else if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Failed to instantiate bean of type ");
                stringBuilder.append(this.f14815e.m11269f().getName());
                stringBuilder.append(": (");
                stringBuilder.append(e2.getClass().getName());
                stringBuilder.append(") ");
                stringBuilder.append(e2.getMessage());
                throw new IllegalArgumentException(stringBuilder.toString(), e2);
            }
        }
    }

    public final Constructor<?> mo1371a(Class<?>... clsArr) {
        for (C7086c c7086c : this.f14815e.m11271h()) {
            if (c7086c.mo3355g() == 1) {
                Class<?> h = c7086c.mo3356h();
                for (int i = 0; i <= 0; i++) {
                    if (clsArr[0] == h) {
                        return c7086c.m18477f();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final boolean m11305a(C1549v c1549v) {
        for (C1451n c1451n : m11327v()) {
            if (c1451n.mo1399a(c1549v)) {
                break;
            }
        }
        C1451n c1451n2 = null;
        return c1451n2 != null;
    }

    public final boolean m11306a(String str) {
        Iterator it = m11327v().iterator();
        while (it.hasNext()) {
            if (((C1451n) it.next()).mo1398a().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public final Method mo1372b(Class<?>... clsArr) {
        for (C7087f c7087f : this.f14815e.m11272i()) {
            if (m11299a(c7087f)) {
                Class h = c7087f.mo3356h();
                for (int i = 0; i <= 0; i++) {
                    if (h.isAssignableFrom(clsArr[0])) {
                        return c7087f.m18494f();
                    }
                }
                continue;
            }
        }
        return null;
    }

    public final C5327b mo1373c() {
        return this.f14815e;
    }

    public final C1457t mo1374d() {
        return this.f14817g;
    }

    public final boolean mo1375e() {
        return this.f14815e.m11275l().m11290a() > 0;
    }

    public final C1517a mo1376f() {
        return this.f14815e.m11275l();
    }

    public final List<C1451n> mo1377g() {
        return m11327v();
    }

    public final Map<String, C5328e> mo1378h() {
        Map<String, C5328e> map = null;
        for (C1451n r : m11327v()) {
            C5328e r2 = r.mo1416r();
            if (r2 != null) {
                C1405a findReferenceType = this.f14814d.findReferenceType(r2);
                if (findReferenceType != null && findReferenceType.m3415a()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    String str = findReferenceType.f4421b;
                    if (map.put(str, r2) != null) {
                        StringBuilder stringBuilder = new StringBuilder("Multiple back-reference properties with name '");
                        stringBuilder.append(str);
                        stringBuilder.append("'");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
        }
        return map;
    }

    public final Set<String> mo1379i() {
        Set<String> i = this.f14812b == null ? null : this.f14812b.m3735i();
        return i == null ? Collections.emptySet() : i;
    }

    public final List<C7086c> mo1380j() {
        return this.f14815e.m11271h();
    }

    public final List<C7087f> mo1381k() {
        List<C7087f> i = this.f14815e.m11272i();
        if (i.isEmpty()) {
            return i;
        }
        List arrayList = new ArrayList();
        for (C7087f c7087f : i) {
            if (m11299a(c7087f)) {
                arrayList.add(c7087f);
            }
        }
        return arrayList;
    }

    public final C7086c mo1382l() {
        return this.f14815e.m11270g();
    }

    public final C5328e mo1383m() {
        C5328e g = this.f14812b == null ? null : this.f14812b.m3733g();
        if (g != null) {
            if (!Map.class.isAssignableFrom(g.mo1363d())) {
                StringBuilder stringBuilder = new StringBuilder("Invalid 'any-getter' annotation on method ");
                stringBuilder.append(g.mo1360b());
                stringBuilder.append("(): return type is not instance of java.util.Map");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return g;
    }

    public final C7087f mo1384n() {
        C7087f h = this.f14812b == null ? null : this.f14812b.m3734h();
        if (h != null) {
            Class h2 = h.mo3356h();
            if (!(h2 == String.class || h2 == Object.class)) {
                StringBuilder stringBuilder = new StringBuilder("Invalid 'any-setter' annotation on method ");
                stringBuilder.append(h.mo1360b());
                stringBuilder.append("(): first argument not of type String or Object, but ");
                stringBuilder.append(h2.getName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return h;
    }

    public final C7087f mo1385o() {
        return this.f14812b == null ? null : this.f14812b.m3732f();
    }

    public final C1319d mo1386p() {
        if (this.f14814d != null) {
            C1319d findFormat = this.f14814d.findFormat(this.f14815e);
            if (findFormat != null) {
                return findFormat;
            }
        }
        return null;
    }

    public final C1529i<Object, Object> mo1387q() {
        return this.f14814d == null ? null : m11298a(this.f14814d.findSerializationConverter(this.f14815e));
    }

    public final C1529i<Object, Object> mo1388r() {
        return this.f14814d == null ? null : m11298a(this.f14814d.findDeserializationConverter(this.f14815e));
    }

    public final Map<Object, C5328e> mo1389s() {
        return this.f14812b != null ? this.f14812b.m3731e() : Collections.emptyMap();
    }

    public final Class<?> mo1390t() {
        return this.f14814d == null ? null : this.f14814d.findPOJOBuilder(this.f14815e);
    }

    public final C1393a mo1391u() {
        return this.f14814d == null ? null : this.f14814d.findPOJOBuilderConfig(this.f14815e);
    }

    public final List<C1451n> m11327v() {
        if (this.f14816f == null) {
            this.f14816f = this.f14812b.m3730d();
        }
        return this.f14816f;
    }
}
