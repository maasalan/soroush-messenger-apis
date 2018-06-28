package com.p111d.p112a.p121c.p128f;

import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C1550w;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p138m.C1521d;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class C1458u {
    protected final C5306f<?> f4560a;
    protected final boolean f4561b;
    protected final boolean f4562c;
    protected final C5354j f4563d;
    protected final C5327b f4564e;
    protected final C1464z<?> f4565f;
    protected final C5308b f4566g;
    protected final String f4567h;
    protected boolean f4568i;
    protected LinkedHashMap<String, C5341v> f4569j;
    protected LinkedList<C5341v> f4570k;
    protected LinkedList<C5328e> f4571l;
    protected LinkedList<C7087f> f4572m;
    protected LinkedList<C7087f> f4573n;
    protected HashSet<String> f4574o;
    protected LinkedHashMap<Object, C5328e> f4575p;

    protected C1458u(C5306f<?> c5306f, boolean z, C5354j c5354j, C5327b c5327b, String str) {
        this.f4560a = c5306f;
        this.f4562c = c5306f.m11077a(C5385q.USE_STD_BEAN_NAMING);
        this.f4561b = z;
        this.f4563d = c5354j;
        this.f4564e = c5327b;
        if (str == null) {
            str = "set";
        }
        this.f4567h = str;
        this.f4566g = c5306f.m11085i() ? this.f4560a.mo3358a() : null;
        this.f4565f = this.f4566g == null ? this.f4560a.mo3360b() : this.f4566g.findAutoDetectVisibility(c5327b, this.f4560a.mo3360b());
    }

    private C5341v m3710a(Map<String, C5341v> map, String str) {
        C5341v c5341v = (C5341v) map.get(str);
        if (c5341v != null) {
            return c5341v;
        }
        c5341v = new C5341v(this.f4560a, this.f4566g, this.f4561b, C1549v.m4055a(str));
        map.put(str, c5341v);
        return c5341v;
    }

    private static void m3711a(C5341v c5341v, List<C5341v> list) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C5341v) list.get(i)).m11409z().equals(c5341v.m11409z())) {
                    list.set(i, c5341v);
                    return;
                }
            }
        }
    }

    private void m3712a(Object obj, C5328e c5328e) {
        if (obj != null) {
            if (this.f4575p == null) {
                this.f4575p = new LinkedHashMap();
            }
            if (((C5328e) this.f4575p.put(obj, c5328e)) != null) {
                String name = obj.getClass().getName();
                StringBuilder stringBuilder = new StringBuilder("Duplicate injectable value with id '");
                stringBuilder.append(String.valueOf(obj));
                stringBuilder.append("' (of type ");
                stringBuilder.append(name);
                stringBuilder.append(")");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    private void m3713a(String str) {
        if (!this.f4561b) {
            if (this.f4574o == null) {
                this.f4574o = new HashSet();
            }
            this.f4574o.add(str);
        }
    }

    private void m3714a(Map<String, C5341v> map) {
        C5308b c5308b = this.f4566g;
        Object obj = (this.f4561b || this.f4560a.m11077a(C5385q.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? null : 1;
        boolean a = this.f4560a.m11077a(C5385q.PROPAGATE_TRANSIENT_MARKER);
        for (C6492d c6492d : this.f4564e.m11274k()) {
            boolean z;
            String findImplicitPropertyName = c5308b == null ? null : c5308b.findImplicitPropertyName(c6492d);
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = c6492d.mo1360b();
            }
            C1549v findNameForSerialization = c5308b == null ? null : this.f4561b ? c5308b.findNameForSerialization(c6492d) : c5308b.findNameForDeserialization(c6492d);
            boolean z2 = findNameForSerialization != null;
            if (z2 && findNameForSerialization.m4064e()) {
                z2 = false;
                findNameForSerialization = C1549v.m4056a(findImplicitPropertyName, null);
            }
            boolean z3 = findNameForSerialization != null;
            if (!z3) {
                z3 = this.f4565f.mo1427a(c6492d);
            }
            boolean z4 = c5308b != null && c5308b.hasIgnoreMarker(c6492d);
            if (c6492d.m15576i()) {
                z = a ? true : z4;
                z4 = false;
            } else {
                z = z4;
                z4 = z3;
            }
            if (obj == null || findNameForSerialization != null || z || !Modifier.isFinal(c6492d.m15574g())) {
                m3710a((Map) map, findImplicitPropertyName).m11376a(c6492d, findNameForSerialization, z2, z4, z);
            }
        }
    }

    private void m3715a(Map<String, C5341v> map, C6493h c6493h) {
        String findImplicitPropertyName = this.f4566g.findImplicitPropertyName(c6493h);
        if (findImplicitPropertyName == null) {
            findImplicitPropertyName = "";
        }
        C1549v findNameForDeserialization = this.f4566g.findNameForDeserialization(c6493h);
        boolean z = (findNameForDeserialization == null || findNameForDeserialization.m4064e()) ? false : true;
        if (!z) {
            if (!findImplicitPropertyName.isEmpty() && this.f4566g.hasCreatorAnnotation(c6493h.m15587g())) {
                findNameForDeserialization = C1549v.m4055a(findImplicitPropertyName);
            } else {
                return;
            }
        }
        if (z && findImplicitPropertyName.isEmpty()) {
            findImplicitPropertyName = findNameForDeserialization.m4060b();
        }
        C5341v a = m3710a((Map) map, findImplicitPropertyName);
        a.m11378a(c6493h, findNameForDeserialization, z);
        this.f4570k.add(a);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3716a(java.util.Map<java.lang.String, com.p111d.p112a.p121c.p128f.C5341v> r9, com.p111d.p112a.p121c.C1550w r10) {
        /*
        r8 = this;
        r0 = r9.values();
        r1 = r9.size();
        r1 = new com.p111d.p112a.p121c.p128f.C5341v[r1];
        r0 = r0.toArray(r1);
        r0 = (com.p111d.p112a.p121c.p128f.C5341v[]) r0;
        r9.clear();
        r1 = 0;
        r2 = r0.length;
    L_0x0015:
        if (r1 >= r2) goto L_0x00b1;
    L_0x0017:
        r3 = r0[r1];
        r4 = r3.mo1400b();
        r5 = 0;
        r6 = r3.mo1404f();
        if (r6 == 0) goto L_0x002e;
    L_0x0024:
        r6 = r8.f4560a;
        r7 = com.p111d.p112a.p121c.C5385q.ALLOW_EXPLICIT_PROPERTY_RENAMING;
        r6 = r6.m11077a(r7);
        if (r6 == 0) goto L_0x0088;
    L_0x002e:
        r6 = r8.f4561b;
        if (r6 == 0) goto L_0x0056;
    L_0x0032:
        r6 = r3.mo1407i();
        if (r6 == 0) goto L_0x0044;
    L_0x0038:
        r3.mo1411m();
        r5 = r4.m4060b();
        r5 = r10.mo1487b(r5);
        goto L_0x0088;
    L_0x0044:
        r6 = r3.mo1409k();
        if (r6 == 0) goto L_0x0088;
    L_0x004a:
        r3.mo1413o();
        r5 = r4.m4060b();
        r5 = r10.mo1486a(r5);
        goto L_0x0088;
    L_0x0056:
        r6 = r3.mo1408j();
        if (r6 == 0) goto L_0x0068;
    L_0x005c:
        r3.mo1412n();
        r5 = r4.m4060b();
        r5 = r10.mo1488c(r5);
        goto L_0x0088;
    L_0x0068:
        r6 = r3.mo1410l();
        if (r6 == 0) goto L_0x007a;
    L_0x006e:
        r3.m11366A();
        r5 = r4.m4060b();
        r5 = r10.mo1489d(r5);
        goto L_0x0088;
    L_0x007a:
        r6 = r3.mo1409k();
        if (r6 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x004a;
    L_0x0081:
        r6 = r3.mo1407i();
        if (r6 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x0038;
    L_0x0088:
        if (r5 == 0) goto L_0x0095;
    L_0x008a:
        r6 = r4.m4062c(r5);
        if (r6 != 0) goto L_0x0095;
    L_0x0090:
        r3 = r3.m11373a(r5);
        goto L_0x0099;
    L_0x0095:
        r5 = r4.m4060b();
    L_0x0099:
        r4 = r9.get(r5);
        r4 = (com.p111d.p112a.p121c.p128f.C5341v) r4;
        if (r4 != 0) goto L_0x00a5;
    L_0x00a1:
        r9.put(r5, r3);
        goto L_0x00a8;
    L_0x00a5:
        r4.m11379a(r3);
    L_0x00a8:
        r4 = r8.f4570k;
        com.p111d.p112a.p121c.p128f.C1458u.m3711a(r3, r4);
        r1 = r1 + 1;
        goto L_0x0015;
    L_0x00b1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.f.u.a(java.util.Map, com.d.a.c.w):void");
    }

    private void m3717b(String str) {
        StringBuilder stringBuilder = new StringBuilder("Problem with definition of ");
        stringBuilder.append(this.f4564e);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void m3718b(Map<String, C5341v> map) {
        if (this.f4566g != null) {
            int g;
            Iterator it = this.f4564e.m11271h().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C7086c c7086c = (C7086c) it.next();
                if (this.f4570k == null) {
                    this.f4570k = new LinkedList();
                }
                g = c7086c.mo3355g();
                while (i < g) {
                    m3715a((Map) map, c7086c.m15596b(i));
                    i++;
                }
            }
            for (C7087f c7087f : this.f4564e.m11272i()) {
                if (this.f4570k == null) {
                    this.f4570k = new LinkedList();
                }
                g = c7087f.mo3355g();
                for (int i2 = 0; i2 < g; i2++) {
                    m3715a((Map) map, c7087f.m15596b(i2));
                }
            }
        }
    }

    private void m3719c(Map<String, C5341v> map) {
        C5308b c5308b = this.f4566g;
        for (C7087f c7087f : this.f4564e.m11273j()) {
            LinkedList linkedList;
            int g = c7087f.mo3355g();
            boolean z = true;
            String str = null;
            C1549v findNameForSerialization;
            boolean z2;
            String findImplicitPropertyName;
            if (g == 0) {
                if (c7087f.m18504q()) {
                    if (c5308b != null) {
                        if (c5308b.hasAnyGetterAnnotation(c7087f)) {
                            if (this.f4571l == null) {
                                this.f4571l = new LinkedList();
                            }
                            linkedList = this.f4571l;
                        } else if (c5308b.hasAsValueAnnotation(c7087f)) {
                            if (this.f4573n == null) {
                                this.f4573n = new LinkedList();
                            }
                            linkedList = this.f4573n;
                        }
                    }
                    findNameForSerialization = c5308b == null ? null : c5308b.findNameForSerialization(c7087f);
                    z2 = findNameForSerialization != null;
                    if (z2) {
                        findImplicitPropertyName = c5308b == null ? null : c5308b.findImplicitPropertyName(c7087f);
                        if (findImplicitPropertyName == null) {
                            boolean z3 = this.f4562c;
                            String b = c7087f.mo1360b();
                            String b2 = C1521d.m3940b(c7087f, b, z3);
                            findImplicitPropertyName = b2 == null ? C1521d.m3938a(c7087f, b, z3) : b2;
                        }
                        if (findImplicitPropertyName == null) {
                            findImplicitPropertyName = c7087f.mo1360b();
                        }
                        if (findNameForSerialization.m4064e()) {
                            findNameForSerialization = C1549v.m4056a(findImplicitPropertyName, null);
                            z2 = false;
                        }
                        str = findImplicitPropertyName;
                    } else {
                        if (c5308b != null) {
                            str = c5308b.findImplicitPropertyName(c7087f);
                        }
                        if (str == null) {
                            str = C1521d.m3938a(c7087f, c7087f.mo1360b(), this.f4562c);
                        }
                        if (str == null) {
                            str = C1521d.m3940b(c7087f, c7087f.mo1360b(), this.f4562c);
                            if (str != null) {
                                z = this.f4565f.mo1431b(c7087f);
                            }
                        } else {
                            z = this.f4565f.mo1429a(c7087f);
                        }
                    }
                    m3710a((Map) map, str).m11377a(c7087f, findNameForSerialization, z2, z, c5308b == null ? false : c5308b.hasIgnoreMarker(c7087f));
                }
            } else if (g == 1) {
                findNameForSerialization = c5308b == null ? null : c5308b.findNameForDeserialization(c7087f);
                z2 = findNameForSerialization != null;
                if (z2) {
                    findImplicitPropertyName = c5308b == null ? null : c5308b.findImplicitPropertyName(c7087f);
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = C1521d.m3942c(c7087f, this.f4567h, this.f4562c);
                    }
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = c7087f.mo1360b();
                    }
                    if (findNameForSerialization.m4064e()) {
                        findNameForSerialization = C1549v.m4056a(findImplicitPropertyName, null);
                        z2 = false;
                    }
                    str = findImplicitPropertyName;
                } else {
                    if (c5308b != null) {
                        str = c5308b.findImplicitPropertyName(c7087f);
                    }
                    if (str == null) {
                        str = C1521d.m3942c(c7087f, this.f4567h, this.f4562c);
                    }
                    if (str != null) {
                        z = this.f4565f.mo1433c(c7087f);
                    }
                }
                m3710a((Map) map, str).m11384b(c7087f, findNameForSerialization, z2, z, c5308b == null ? false : c5308b.hasIgnoreMarker(c7087f));
            } else if (g == 2 && c5308b != null && c5308b.hasAnySetterAnnotation(c7087f)) {
                if (this.f4572m == null) {
                    this.f4572m = new LinkedList();
                }
                linkedList = this.f4572m;
            }
            linkedList.add(c7087f);
        }
    }

    private void m3720d(Map<String, C5341v> map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            C5341v c5341v = (C5341v) it.next();
            if (!c5341v.m11370E()) {
                it.remove();
            } else if (c5341v.m11371F()) {
                if (c5341v.mo1403e()) {
                    c5341v.m11367B();
                    if (!(this.f4561b || c5341v.mo1405g())) {
                    }
                } else {
                    it.remove();
                }
                m3713a(c5341v.mo1398a());
            }
        }
    }

    private void m3721e(Map<String, C5341v> map) {
        boolean a = this.f4560a.m11077a(C5385q.INFER_PROPERTY_MUTATORS);
        for (C5341v a2 : map.values()) {
            a2.m11380a(a);
        }
    }

    private void m3722f(Map<String, C5341v> map) {
        Iterator it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            C5341v c5341v = (C5341v) ((Entry) it.next()).getValue();
            Collection G = c5341v.m11372G();
            if (!G.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (G.size() == 1) {
                    linkedList.add(c5341v.m11382b((C1549v) G.iterator().next()));
                } else {
                    linkedList.addAll(c5341v.m11375a(G));
                }
            }
        }
        if (linkedList != null) {
            it = linkedList.iterator();
            while (it.hasNext()) {
                C5341v c5341v2 = (C5341v) it.next();
                String a = c5341v2.mo1398a();
                C5341v c5341v3 = (C5341v) map.get(a);
                if (c5341v3 == null) {
                    map.put(a, c5341v2);
                } else {
                    c5341v3.m11379a(c5341v2);
                }
                C1458u.m3711a(c5341v2, this.f4570k);
            }
        }
    }

    private void m3723g(Map<String, C5341v> map) {
        Iterator it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            C5341v c5341v = (C5341v) ((Entry) it.next()).getValue();
            C1449a t = c5341v.mo1418t();
            if (t != null) {
                C1549v findWrapperName = this.f4566g.findWrapperName(t);
                if (!(findWrapperName == null || !findWrapperName.m4061c() || findWrapperName.equals(c5341v.mo1400b()))) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(c5341v.m11382b(findWrapperName));
                    it.remove();
                }
            }
        }
        if (linkedList != null) {
            it = linkedList.iterator();
            while (it.hasNext()) {
                C5341v c5341v2 = (C5341v) it.next();
                String a = c5341v2.mo1398a();
                C5341v c5341v3 = (C5341v) map.get(a);
                if (c5341v3 == null) {
                    map.put(a, c5341v2);
                } else {
                    c5341v3.m11379a(c5341v2);
                }
            }
        }
    }

    private void m3724h(Map<String, C5341v> map) {
        C5308b c5308b = this.f4566g;
        String[] strArr = null;
        Boolean findSerializationSortAlphabetically = c5308b == null ? null : c5308b.findSerializationSortAlphabetically(this.f4564e);
        boolean k = findSerializationSortAlphabetically == null ? this.f4560a.m11087k() : findSerializationSortAlphabetically.booleanValue();
        if (c5308b != null) {
            strArr = c5308b.findSerializationPropertyOrder(this.f4564e);
        }
        if (k || this.f4570k != null || strArr != null) {
            int size = map.size();
            Map treeMap = k ? new TreeMap() : new LinkedHashMap(size + size);
            for (C5341v c5341v : map.values()) {
                treeMap.put(c5341v.mo1398a(), c5341v);
            }
            Map linkedHashMap = new LinkedHashMap(size + size);
            if (strArr != null) {
                for (Object obj : strArr) {
                    Object obj2;
                    Object obj3 = (C5341v) treeMap.get(obj2);
                    if (obj3 == null) {
                        for (C5341v c5341v2 : map.values()) {
                            if (obj2.equals(c5341v2.m11409z())) {
                                obj2 = c5341v2.mo1398a();
                                obj3 = c5341v2;
                                break;
                            }
                        }
                    }
                    if (obj3 != null) {
                        linkedHashMap.put(obj2, obj3);
                    }
                }
            }
            if (this.f4570k != null) {
                Collection values;
                if (k) {
                    TreeMap treeMap2 = new TreeMap();
                    Iterator it = this.f4570k.iterator();
                    while (it.hasNext()) {
                        C5341v c5341v3 = (C5341v) it.next();
                        treeMap2.put(c5341v3.mo1398a(), c5341v3);
                    }
                    values = treeMap2.values();
                } else {
                    values = this.f4570k;
                }
                for (C5341v c5341v4 : r0) {
                    linkedHashMap.put(c5341v4.mo1398a(), c5341v4);
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    private void m3725k() {
        Map linkedHashMap = new LinkedHashMap();
        m3714a(linkedHashMap);
        m3719c(linkedHashMap);
        m3718b(linkedHashMap);
        m3726l();
        m3720d(linkedHashMap);
        for (C5341v b : linkedHashMap.values()) {
            b.m11385b(this.f4561b);
        }
        m3721e(linkedHashMap);
        m3722f(linkedHashMap);
        C1550w c1550w = null;
        Object findNamingStrategy = this.f4566g == null ? null : this.f4566g.findNamingStrategy(this.f4564e);
        if (findNamingStrategy == null) {
            c1550w = this.f4560a.m11089m();
        } else {
            if (!(findNamingStrategy instanceof C1550w)) {
                StringBuilder stringBuilder;
                if (findNamingStrategy instanceof Class) {
                    Class cls = (Class) findNamingStrategy;
                    if (cls != C1550w.class) {
                        if (C1550w.class.isAssignableFrom(cls)) {
                            this.f4560a.m11090n();
                            findNamingStrategy = C1527g.m3951a(cls, this.f4560a.m11086j());
                        } else {
                            stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
                            stringBuilder.append(cls.getName());
                            stringBuilder.append("; expected Class<PropertyNamingStrategy>");
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                } else {
                    stringBuilder = new StringBuilder("AnnotationIntrospector returned PropertyNamingStrategy definition of type ");
                    stringBuilder.append(findNamingStrategy.getClass().getName());
                    stringBuilder.append("; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            c1550w = (C1550w) findNamingStrategy;
        }
        if (c1550w != null) {
            m3716a(linkedHashMap, c1550w);
        }
        for (C5341v b2 : linkedHashMap.values()) {
            b2.m11369D();
        }
        if (this.f4560a.m11077a(C5385q.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            m3723g(linkedHashMap);
        }
        m3724h(linkedHashMap);
        this.f4569j = linkedHashMap;
        this.f4568i = true;
    }

    private void m3726l() {
        C5308b c5308b = this.f4566g;
        if (c5308b != null) {
            for (C5328e c5328e : this.f4564e.m11274k()) {
                m3712a(c5308b.findInjectableValueId(c5328e), c5328e);
            }
            for (C5328e c5328e2 : this.f4564e.m11273j()) {
                if (c5328e2.mo3355g() == 1) {
                    m3712a(c5308b.findInjectableValueId(c5328e2), c5328e2);
                }
            }
        }
    }

    public final C5306f<?> m3727a() {
        return this.f4560a;
    }

    public final C5354j m3728b() {
        return this.f4563d;
    }

    public final C5327b m3729c() {
        return this.f4564e;
    }

    public final List<C1451n> m3730d() {
        if (!this.f4568i) {
            m3725k();
        }
        return new ArrayList(this.f4569j.values());
    }

    public final Map<Object, C5328e> m3731e() {
        if (!this.f4568i) {
            m3725k();
        }
        return this.f4575p;
    }

    public final C7087f m3732f() {
        if (!this.f4568i) {
            m3725k();
        }
        if (this.f4573n == null) {
            return null;
        }
        if (this.f4573n.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder("Multiple value properties defined (");
            stringBuilder.append(this.f4573n.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this.f4573n.get(1));
            stringBuilder.append(")");
            m3717b(stringBuilder.toString());
        }
        return (C7087f) this.f4573n.get(0);
    }

    public final C5328e m3733g() {
        if (!this.f4568i) {
            m3725k();
        }
        if (this.f4571l == null) {
            return null;
        }
        if (this.f4571l.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder("Multiple 'any-getters' defined (");
            stringBuilder.append(this.f4571l.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this.f4571l.get(1));
            stringBuilder.append(")");
            m3717b(stringBuilder.toString());
        }
        return (C5328e) this.f4571l.getFirst();
    }

    public final C7087f m3734h() {
        if (!this.f4568i) {
            m3725k();
        }
        if (this.f4572m == null) {
            return null;
        }
        if (this.f4572m.size() > 1) {
            StringBuilder stringBuilder = new StringBuilder("Multiple 'any-setters' defined (");
            stringBuilder.append(this.f4572m.get(0));
            stringBuilder.append(" vs ");
            stringBuilder.append(this.f4572m.get(1));
            stringBuilder.append(")");
            m3717b(stringBuilder.toString());
        }
        return (C7087f) this.f4572m.getFirst();
    }

    public final Set<String> m3735i() {
        return this.f4574o;
    }

    public final C1457t m3736j() {
        if (this.f4566g == null) {
            return null;
        }
        C1457t findObjectIdInfo = this.f4566g.findObjectIdInfo(this.f4564e);
        if (findObjectIdInfo != null) {
            findObjectIdInfo = this.f4566g.findObjectReferenceInfo(this.f4564e, findObjectIdInfo);
        }
        return findObjectIdInfo;
    }
}
