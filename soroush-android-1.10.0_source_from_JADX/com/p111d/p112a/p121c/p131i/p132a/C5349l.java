package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p128f.C5327b;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p131i.C1472a;
import com.p111d.p112a.p121c.p131i.C1473b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class C5349l extends C1473b implements Serializable {
    protected LinkedHashSet<C1472a> f14893a;

    private static Collection<C1472a> m11482a(Set<Class<?>> set, Map<String, C1472a> map) {
        Collection arrayList = new ArrayList(map.values());
        for (C1472a a : map.values()) {
            set.remove(a.m3762a());
        }
        for (Class c1472a : set) {
            arrayList.add(new C1472a(c1472a));
        }
        return arrayList;
    }

    private void m11483a(C5327b c5327b, C1472a c1472a, C5306f<?> c5306f, C5308b c5308b, HashMap<C1472a, C1472a> hashMap) {
        if (!c1472a.m3764c()) {
            String findTypeName = c5308b.findTypeName(c5327b);
            if (findTypeName != null) {
                c1472a = new C1472a(c1472a.m3762a(), findTypeName);
            }
        }
        if (hashMap.containsKey(c1472a)) {
            if (c1472a.m3764c() && !((C1472a) hashMap.get(c1472a)).m3764c()) {
                hashMap.put(c1472a, c1472a);
            }
            return;
        }
        hashMap.put(c1472a, c1472a);
        Collection<C1472a> findSubtypes = c5308b.findSubtypes(c5327b);
        if (!(findSubtypes == null || findSubtypes.isEmpty())) {
            for (C1472a c1472a2 : findSubtypes) {
                m11483a(C5327b.m11234a(c1472a2.m3762a(), (C5306f) c5306f), c1472a2, (C5306f) c5306f, c5308b, (HashMap) hashMap);
            }
        }
    }

    private void m11484a(C5327b c5327b, C1472a c1472a, C5306f<?> c5306f, Set<Class<?>> set, Map<String, C1472a> map) {
        C5308b a = c5306f.mo3358a();
        if (!c1472a.m3764c()) {
            String findTypeName = a.findTypeName(c5327b);
            if (findTypeName != null) {
                c1472a = new C1472a(c1472a.m3762a(), findTypeName);
            }
        }
        if (c1472a.m3764c()) {
            map.put(c1472a.m3763b(), c1472a);
        }
        if (set.add(c1472a.m3762a())) {
            Collection<C1472a> findSubtypes = a.findSubtypes(c5327b);
            if (findSubtypes != null && !findSubtypes.isEmpty()) {
                for (C1472a c1472a2 : findSubtypes) {
                    m11484a(C5327b.m11234a(c1472a2.m3762a(), (C5306f) c5306f), c1472a2, (C5306f) c5306f, (Set) set, (Map) map);
                }
            }
        }
    }

    public final Collection<C1472a> mo1438a(C5306f<?> c5306f, C5327b c5327b) {
        C5308b a = c5306f.mo3358a();
        HashMap hashMap = new HashMap();
        if (this.f14893a != null) {
            Class d = c5327b.mo1363d();
            Iterator it = this.f14893a.iterator();
            while (it.hasNext()) {
                C1472a c1472a = (C1472a) it.next();
                if (d.isAssignableFrom(c1472a.m3762a())) {
                    m11483a(C5327b.m11234a(c1472a.m3762a(), (C5306f) c5306f), c1472a, (C5306f) c5306f, a, hashMap);
                }
            }
        }
        m11483a(c5327b, new C1472a(c5327b.mo1363d(), null), (C5306f) c5306f, a, hashMap);
        return new ArrayList(hashMap.values());
    }

    public final Collection<C1472a> mo1439a(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        C1472a c1472a;
        C5308b a = c5306f.mo3358a();
        Class d = c5354j == null ? c5328e.mo1363d() : c5354j.m11531e();
        HashMap hashMap = new HashMap();
        if (this.f14893a != null) {
            Iterator it = this.f14893a.iterator();
            while (it.hasNext()) {
                c1472a = (C1472a) it.next();
                if (d.isAssignableFrom(c1472a.m3762a())) {
                    m11483a(C5327b.m11234a(c1472a.m3762a(), (C5306f) c5306f), c1472a, (C5306f) c5306f, a, hashMap);
                }
            }
        }
        Collection<C1472a> findSubtypes = a.findSubtypes(c5328e);
        if (findSubtypes != null) {
            for (C1472a c1472a2 : findSubtypes) {
                m11483a(C5327b.m11234a(c1472a2.m3762a(), (C5306f) c5306f), c1472a2, (C5306f) c5306f, a, hashMap);
            }
        }
        m11483a(C5327b.m11234a(d, (C5306f) c5306f), new C1472a(d, null), (C5306f) c5306f, a, hashMap);
        return new ArrayList(hashMap.values());
    }

    @Deprecated
    public final Collection<C1472a> mo1440a(C5327b c5327b, C5306f<?> c5306f) {
        return mo1438a((C5306f) c5306f, c5327b);
    }

    @Deprecated
    public final Collection<C1472a> mo1441a(C5328e c5328e, C5306f<?> c5306f, C5354j c5354j) {
        return mo1439a((C5306f) c5306f, c5328e, c5354j);
    }

    public final Collection<C1472a> mo1442b(C5306f<?> c5306f, C5327b c5327b) {
        Set hashSet = new HashSet();
        Map linkedHashMap = new LinkedHashMap();
        m11484a(c5327b, new C1472a(c5327b.mo1363d(), null), (C5306f) c5306f, hashSet, linkedHashMap);
        if (this.f14893a != null) {
            Class d = c5327b.mo1363d();
            Iterator it = this.f14893a.iterator();
            while (it.hasNext()) {
                C1472a c1472a = (C1472a) it.next();
                if (d.isAssignableFrom(c1472a.m3762a())) {
                    m11484a(C5327b.m11234a(c1472a.m3762a(), (C5306f) c5306f), c1472a, (C5306f) c5306f, hashSet, linkedHashMap);
                }
            }
        }
        return C5349l.m11482a(hashSet, linkedHashMap);
    }

    public final Collection<C1472a> mo1443b(C5306f<?> c5306f, C5328e c5328e, C5354j c5354j) {
        Iterator it;
        C5308b a = c5306f.mo3358a();
        Class d = c5354j == null ? c5328e.mo1363d() : c5354j.m11531e();
        Set hashSet = new HashSet();
        Map linkedHashMap = new LinkedHashMap();
        m11484a(C5327b.m11234a(d, (C5306f) c5306f), new C1472a(d, null), (C5306f) c5306f, hashSet, linkedHashMap);
        Collection<C1472a> findSubtypes = a.findSubtypes(c5328e);
        if (findSubtypes != null) {
            for (C1472a c1472a : findSubtypes) {
                C1472a c1472a2;
                m11484a(C5327b.m11234a(c1472a2.m3762a(), (C5306f) c5306f), c1472a2, (C5306f) c5306f, hashSet, linkedHashMap);
            }
        }
        if (this.f14893a != null) {
            it = this.f14893a.iterator();
            while (it.hasNext()) {
                c1472a2 = (C1472a) it.next();
                if (d.isAssignableFrom(c1472a2.m3762a())) {
                    m11484a(C5327b.m11234a(c1472a2.m3762a(), (C5306f) c5306f), c1472a2, (C5306f) c5306f, hashSet, linkedHashMap);
                }
            }
        }
        return C5349l.m11482a(hashSet, linkedHashMap);
    }
}
