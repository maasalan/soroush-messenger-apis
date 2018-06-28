package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.ag.C6463c;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1446d.C7084a;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1548u;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5308b.C1405a;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p123b.C1410i;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p128f.C1451n;
import com.p111d.p112a.p121c.p128f.C1457t;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p128f.C6492d;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1477e;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.p135a.C1482d;
import com.p111d.p112a.p121c.p134k.p135a.C1483i;
import com.p111d.p112a.p121c.p134k.p135a.C7098j;
import com.p111d.p112a.p121c.p134k.p136b.C6513c;
import com.p111d.p112a.p121c.p134k.p136b.C7115u;
import com.p111d.p112a.p121c.p134k.p136b.ag;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p137l.C7307h;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1529i;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class C6518g extends C5363b implements Serializable {
    public static final C6518g instance = new C6518g(null);
    private static final long serialVersionUID = 1;

    protected C6518g(C1410i c1410i) {
        super(c1410i);
    }

    protected C7119d _constructWriter(aa aaVar, C1451n c1451n, C1501m c1501m, boolean z, C5328e c5328e) {
        C6518g c6518g = this;
        aa aaVar2 = aaVar;
        C1449a c1449a = c5328e;
        C1549v b = c1451n.mo1400b();
        if (aaVar2.m11061f()) {
            c1449a.m11278a(aaVar2.m11045a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        C5354j c = c5328e.mo1362c();
        C1446d c7084a = new C7084a(b, c, c1451n.mo1401c(), c1501m.m3866a(), c1449a, c1451n.mo1402d());
        C1545o findSerializerFromAnnotation = findSerializerFromAnnotation(aaVar2, c1449a);
        if (findSerializerFromAnnotation instanceof C1503p) {
            ((C1503p) findSerializerFromAnnotation).mo2919a(aaVar2);
        }
        C1545o a = aaVar2.m11039a(findSerializerFromAnnotation, c7084a);
        C1478f c1478f = null;
        if (C1527g.m3971f(c.m11531e()) || c.mo3396o() || c.mo3397p()) {
            c1478f = findPropertyContentTypeSerializer(c, aaVar2.m11058c(), c1449a);
        }
        C1478f c1478f2 = c1478f;
        return c1501m.m3865a(aaVar2, c1451n, c, a, findPropertyTypeSerializer(c, aaVar2.m11058c(), c1449a), c1478f2, c1449a, z);
    }

    protected C1545o<?> _createSerializer2(aa aaVar, C5354j c5354j, C1445c c1445c, boolean z) {
        C1545o<?> buildContainerSerializer;
        C7128y c = aaVar.m11058c();
        C1478f c1478f = null;
        if (c5354j.mo3391n()) {
            if (!z) {
                z = usesStaticTyping(c, c1445c, null);
            }
            buildContainerSerializer = buildContainerSerializer(aaVar, c5354j, c1445c, z);
            if (buildContainerSerializer != null) {
                return buildContainerSerializer;
            }
        }
        if (c5354j.mo3560a()) {
            buildContainerSerializer = findReferenceSerializer(aaVar, (C7307h) c5354j, c1445c, z);
        } else {
            for (C1506s a : customSerializers()) {
                c1478f = a.m3876a();
                if (c1478f != null) {
                    break;
                }
            }
            buildContainerSerializer = c1478f;
        }
        if (buildContainerSerializer == null) {
            buildContainerSerializer = findSerializerByAnnotations(aaVar, c5354j, c1445c);
        }
        if (buildContainerSerializer == null) {
            buildContainerSerializer = findSerializerByLookup(c5354j, c, c1445c, z);
            if (buildContainerSerializer == null) {
                buildContainerSerializer = findSerializerByPrimaryType(aaVar, c5354j, c1445c, z);
                if (buildContainerSerializer == null) {
                    buildContainerSerializer = findBeanSerializer(aaVar, c5354j, c1445c);
                    if (buildContainerSerializer == null) {
                        buildContainerSerializer = findSerializerByAddonType(c, c5354j, c1445c, z);
                        if (buildContainerSerializer == null) {
                            buildContainerSerializer = aaVar.m11055c(c1445c.m3619b());
                        }
                    }
                }
            }
        }
        if (buildContainerSerializer != null && this._factoryConfig.m3450b()) {
            Iterator it = this._factoryConfig.m3453e().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        return buildContainerSerializer;
    }

    protected C1545o<Object> constructBeanSerializer(aa aaVar, C1445c c1445c) {
        if (c1445c.m3619b() == Object.class) {
            return aaVar.m11055c(Object.class);
        }
        Iterator it;
        C7128y c = aaVar.m11058c();
        C1496f constructBeanSerializerBuilder = constructBeanSerializerBuilder(c1445c);
        constructBeanSerializerBuilder.m3850a(c);
        List findBeanProperties = findBeanProperties(aaVar, c1445c, constructBeanSerializerBuilder);
        findBeanProperties = findBeanProperties == null ? new ArrayList() : removeOverlappingTypeIds(aaVar, c1445c, constructBeanSerializerBuilder, findBeanProperties);
        aaVar.m11059d().findAndAddVirtualProperties(c, c1445c.mo1373c(), findBeanProperties);
        if (this._factoryConfig.m3450b()) {
            it = this._factoryConfig.m3453e().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        findBeanProperties = filterBeanProperties(c, c1445c, findBeanProperties);
        if (this._factoryConfig.m3450b()) {
            it = this._factoryConfig.m3453e().iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        constructBeanSerializerBuilder.m3848a(constructObjectIdHandler(aaVar, c1445c, findBeanProperties));
        constructBeanSerializerBuilder.m3852a(findBeanProperties);
        constructBeanSerializerBuilder.m3851a(findFilterId(c, c1445c));
        C1449a m = c1445c.mo1383m();
        if (m != null) {
            if (c.m11086j()) {
                m.m11278a(c.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            C5354j c2 = m.mo1362c();
            boolean a = c.m11077a(C5385q.USE_STATIC_TYPING);
            C5354j u = c2.mo3394u();
            C1478f createTypeSerializer = createTypeSerializer(c, u);
            C1545o findSerializerFromAnnotation = findSerializerFromAnnotation(aaVar, m);
            if (findSerializerFromAnnotation == null) {
                findSerializerFromAnnotation = C7115u.m18600a(null, c2, a, createTypeSerializer, null, null, null);
            }
            constructBeanSerializerBuilder.m3849a(new C5355a(new C7084a(C1549v.m4055a(m.mo1360b()), u, null, c1445c.mo1376f(), m, C1548u.f4829b), m, findSerializerFromAnnotation));
        }
        processViews(c, constructBeanSerializerBuilder);
        if (this._factoryConfig.m3450b()) {
            Iterator it2 = this._factoryConfig.m3453e().iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        C1545o<Object> g = constructBeanSerializerBuilder.m3859g();
        if (g == null && c1445c.mo1375e()) {
            g = constructBeanSerializerBuilder.m3860h();
        }
        return g;
    }

    protected C1496f constructBeanSerializerBuilder(C1445c c1445c) {
        return new C1496f(c1445c);
    }

    protected C7119d constructFilteredBeanWriter(C7119d c7119d, Class<?>[] clsArr) {
        return C1482d.m3820a(c7119d, clsArr);
    }

    protected C1483i constructObjectIdHandler(aa aaVar, C1445c c1445c, List<C7119d> list) {
        C1457t d = c1445c.mo1374d();
        if (d == null) {
            return null;
        }
        Type c = d.m3707c();
        if (c == C6463c.class) {
            String b = d.m3705a().m4060b();
            int size = list.size();
            for (int i = 0; i != size; i++) {
                C7119d c7119d = (C7119d) list.get(i);
                if (b.equals(c7119d.m18635e())) {
                    if (i > 0) {
                        list.remove(i);
                        list.add(0, c7119d);
                    }
                    return C1483i.m3821a(c7119d.mo1350a(), null, new C7098j(d, c7119d), d.m3709e());
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid Object Id definition for ");
            stringBuilder.append(c1445c.m3619b().getName());
            stringBuilder.append(": can not find property with name '");
            stringBuilder.append(b);
            stringBuilder.append("'");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        C5354j a = aaVar.m3651a(c);
        aaVar.mo1297b();
        return C1483i.m3821a(C1513m.m3916c(a, af.class)[0], d.m3705a(), aaVar.m3648a(d), d.m3709e());
    }

    protected C1501m constructPropertyBuilder(C7128y c7128y, C1445c c1445c) {
        return new C1501m(c7128y, c1445c);
    }

    public C1545o<Object> createSerializer(aa aaVar, C5354j c5354j) {
        C5306f c = aaVar.m11058c();
        C1445c b = c.m18738b(c5354j);
        C1545o findSerializerFromAnnotation = findSerializerFromAnnotation(aaVar, b.mo1373c());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        boolean z;
        C5308b a = c.mo3358a();
        C5354j refineSerializationType = a == null ? c5354j : a.refineSerializationType(c, b.mo1373c(), c5354j);
        if (refineSerializationType == c5354j) {
            z = false;
        } else {
            if (!refineSerializationType.m11526c(c5354j.m11531e())) {
                b = c.m18738b(refineSerializationType);
            }
            z = true;
        }
        C1529i q = b.mo1387q();
        if (q == null) {
            return _createSerializer2(aaVar, refineSerializationType, b, z);
        }
        aaVar.mo1297b();
        c5354j = q.m3992c();
        if (!c5354j.m11526c(refineSerializationType.m11531e())) {
            b = c.m18738b(c5354j);
            findSerializerFromAnnotation = findSerializerFromAnnotation(aaVar, b.mo1373c());
        }
        if (findSerializerFromAnnotation == null && !c5354j.m11543q()) {
            findSerializerFromAnnotation = _createSerializer2(aaVar, c5354j, b, true);
        }
        return new ag(q, c5354j, findSerializerFromAnnotation);
    }

    protected Iterable<C1506s> customSerializers() {
        return this._factoryConfig.m3451c();
    }

    protected List<C7119d> filterBeanProperties(C7128y c7128y, C1445c c1445c, List<C7119d> list) {
        String[] findPropertiesToIgnore = c7128y.mo3358a().findPropertiesToIgnore(c1445c.mo1373c(), true);
        if (findPropertiesToIgnore != null && findPropertiesToIgnore.length > 0) {
            HashSet a = C1519b.m3936a(findPropertiesToIgnore);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a.contains(((C7119d) it.next()).m18635e())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    protected List<C7119d> findBeanProperties(aa aaVar, C1445c c1445c, C1496f c1496f) {
        List<C1451n> g = c1445c.mo1377g();
        C7128y c = aaVar.m11058c();
        removeIgnorableTypes(c, c1445c, g);
        if (c.m11077a(C5385q.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(c, c1445c, g);
        }
        if (g.isEmpty()) {
            return null;
        }
        boolean usesStaticTyping = usesStaticTyping(c, c1445c, null);
        C1501m constructPropertyBuilder = constructPropertyBuilder(c, c1445c);
        List arrayList = new ArrayList(g.size());
        boolean j = c.m11086j();
        boolean z = j && c.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
        for (C1451n c1451n : g) {
            C5328e q = c1451n.mo1415q();
            if (!c1451n.mo1421w()) {
                C1405a v = c1451n.mo1420v();
                if (v == null || !v.m3415a()) {
                    C5328e c5328e;
                    if (q instanceof C7087f) {
                        c5328e = (C7087f) q;
                    } else {
                        C6492d c6492d = (C6492d) q;
                    }
                    arrayList.add(_constructWriter(aaVar, c1451n, constructPropertyBuilder, usesStaticTyping, c5328e));
                }
            } else if (q != null) {
                if (j) {
                    q.m11278a(z);
                }
                c1496f.m3847a(q);
            }
        }
        return arrayList;
    }

    public C1545o<Object> findBeanSerializer(aa aaVar, C5354j c5354j, C1445c c1445c) {
        return (isPotentialBeanType(c5354j.m11531e()) || c5354j.m11536j()) ? constructBeanSerializer(aaVar, c1445c) : null;
    }

    public C1478f findPropertyContentTypeSerializer(C5354j c5354j, C7128y c7128y, C5328e c5328e) {
        C5354j u = c5354j.mo3394u();
        C1477e findPropertyContentTypeResolver = c7128y.mo3358a().findPropertyContentTypeResolver(c7128y, c5328e, c5354j);
        return findPropertyContentTypeResolver == null ? createTypeSerializer(c7128y, u) : findPropertyContentTypeResolver.mo1450a(c7128y, u, c7128y.m15415u().mo1439a((C5306f) c7128y, c5328e, u));
    }

    public C1478f findPropertyTypeSerializer(C5354j c5354j, C7128y c7128y, C5328e c5328e) {
        C1477e findPropertyTypeResolver = c7128y.mo3358a().findPropertyTypeResolver(c7128y, c5328e, c5354j);
        return findPropertyTypeResolver == null ? createTypeSerializer(c7128y, c5354j) : findPropertyTypeResolver.mo1450a(c7128y, c5354j, c7128y.m15415u().mo1439a((C5306f) c7128y, c5328e, c5354j));
    }

    public C1545o<?> findReferenceSerializer(aa aaVar, C7307h c7307h, C1445c c1445c, boolean z) {
        C5354j u = c7307h.mo3394u();
        C1478f c1478f = (C1478f) u.mo2931B();
        C7128y c = aaVar.m11058c();
        if (c1478f == null) {
            c1478f = createTypeSerializer(c, u);
        }
        C1545o c1545o = (C1545o) u.mo2930A();
        for (C1506s b : customSerializers()) {
            C1545o<?> b2 = b.m3877b();
            if (b2 != null) {
                return b2;
            }
        }
        return c7307h.m11529d(AtomicReference.class) ? new C6513c(c7307h, c1478f, c1545o) : null;
    }

    protected boolean isPotentialBeanType(Class<?> cls) {
        return C1527g.m3952a((Class) cls) == null && !C1527g.m3969d(cls);
    }

    protected void processViews(C7128y c7128y, C1496f c1496f) {
        List b = c1496f.m3854b();
        boolean a = c7128y.m11077a(C5385q.DEFAULT_VIEW_INCLUSION);
        int size = b.size();
        C7119d[] c7119dArr = new C7119d[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C7119d c7119d = (C7119d) b.get(i);
            Class[] k = c7119d.m18641k();
            if (k != null) {
                i2++;
                c7119dArr[i] = constructFilteredBeanWriter(c7119d, k);
            } else if (a) {
                c7119dArr[i] = c7119d;
            }
            i++;
        }
        if (!a || i2 != 0) {
            c1496f.m3853a(c7119dArr);
        }
    }

    protected void removeIgnorableTypes(C7128y c7128y, C1445c c1445c, List<C1451n> list) {
        C5308b a = c7128y.mo3358a();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5328e q = ((C1451n) it.next()).mo1415q();
            if (q != null) {
                Class d = q.mo1363d();
                Boolean bool = (Boolean) hashMap.get(d);
                if (bool == null) {
                    bool = a.isIgnorableType(c7128y.m11081c(d).mo1373c());
                    if (bool == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(d, bool);
                }
                if (bool.booleanValue()) {
                }
            }
            it.remove();
        }
    }

    protected List<C7119d> removeOverlappingTypeIds(aa aaVar, C1445c c1445c, C1496f c1496f, List<C7119d> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7119d c7119d = (C7119d) list.get(i);
            C1478f h = c7119d.m18638h();
            if (h != null && h.mo2900a() == C1301a.EXTERNAL_PROPERTY) {
                C1549v a = C1549v.m4055a(h.mo1457b());
                for (C7119d c7119d2 : list) {
                    if (c7119d2 != c7119d && c7119d2.m18630a(a)) {
                        c7119d.m18634d();
                        break;
                    }
                }
            }
        }
        return list;
    }

    protected void removeSetterlessGetters(C7128y c7128y, C1445c c1445c, List<C1451n> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1451n c1451n = (C1451n) it.next();
            if (!(c1451n.mo1405g() || c1451n.mo1403e())) {
                it.remove();
            }
        }
    }

    public C1505r withConfig(C1410i c1410i) {
        if (this._factoryConfig == c1410i) {
            return this;
        }
        if (getClass() == C6518g.class) {
            return new C6518g(c1410i);
        }
        StringBuilder stringBuilder = new StringBuilder("Subtype of BeanSerializerFactory (");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with additional serializer definitions");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
