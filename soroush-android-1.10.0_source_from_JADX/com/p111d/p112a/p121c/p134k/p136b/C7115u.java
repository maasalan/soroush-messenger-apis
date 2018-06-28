package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C1502n;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.C6521o;
import com.p111d.p112a.p121c.p134k.p135a.C1486k;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C1484d;
import com.p111d.p112a.p121c.p134k.p135a.C1486k.C5357b;
import com.p111d.p112a.p121c.p137l.C1513m;
import com.p111d.p112a.p121c.p138m.C1519b;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

@C1387a
public class C7115u extends C6519i<Map<?, ?>> implements C1498j {
    protected static final C5354j f20247a = C1513m.m3911b();
    protected final C1446d f20248b;
    protected final HashSet<String> f20249c;
    protected final boolean f20250d;
    protected final C5354j f20251e;
    protected final C5354j f20252f;
    protected C1545o<Object> f20253g;
    protected C1545o<Object> f20254h;
    protected final C1478f f20255i;
    protected C1486k f20256j;
    protected final Object f20257k;
    protected final boolean f20258l;
    protected final Object f20259m;

    private C7115u(C7115u c7115u, C1446d c1446d, C1545o<?> c1545o, C1545o<?> c1545o2, HashSet<String> hashSet) {
        super(Map.class, (byte) 0);
        this.f20249c = hashSet;
        this.f20251e = c7115u.f20251e;
        this.f20252f = c7115u.f20252f;
        this.f20250d = c7115u.f20250d;
        this.f20255i = c7115u.f20255i;
        this.f20253g = c1545o;
        this.f20254h = c1545o2;
        this.f20256j = c7115u.f20256j;
        this.f20248b = c1446d;
        this.f20257k = c7115u.f20257k;
        this.f20258l = c7115u.f20258l;
        this.f20259m = c7115u.f20259m;
    }

    private C7115u(C7115u c7115u, C1478f c1478f, Object obj) {
        super(Map.class, (byte) 0);
        this.f20249c = c7115u.f20249c;
        this.f20251e = c7115u.f20251e;
        this.f20252f = c7115u.f20252f;
        this.f20250d = c7115u.f20250d;
        this.f20255i = c1478f;
        this.f20253g = c7115u.f20253g;
        this.f20254h = c7115u.f20254h;
        this.f20256j = c7115u.f20256j;
        this.f20248b = c7115u.f20248b;
        this.f20257k = c7115u.f20257k;
        this.f20258l = c7115u.f20258l;
        if (obj == C1327a.NON_ABSENT) {
            obj = this.f20252f.mo3560a() ? C1327a.NON_EMPTY : C1327a.NON_NULL;
        }
        this.f20259m = obj;
    }

    private C7115u(C7115u c7115u, Object obj, boolean z) {
        super(Map.class, (byte) 0);
        this.f20249c = c7115u.f20249c;
        this.f20251e = c7115u.f20251e;
        this.f20252f = c7115u.f20252f;
        this.f20250d = c7115u.f20250d;
        this.f20255i = c7115u.f20255i;
        this.f20253g = c7115u.f20253g;
        this.f20254h = c7115u.f20254h;
        this.f20256j = c7115u.f20256j;
        this.f20248b = c7115u.f20248b;
        this.f20257k = obj;
        this.f20258l = z;
        this.f20259m = c7115u.f20259m;
    }

    private C7115u(HashSet<String> hashSet, C5354j c5354j, C5354j c5354j2, boolean z, C1478f c1478f, C1545o<?> c1545o, C1545o<?> c1545o2) {
        super(Map.class, (byte) 0);
        this.f20249c = hashSet;
        this.f20251e = c5354j;
        this.f20252f = c5354j2;
        this.f20250d = z;
        this.f20255i = c1478f;
        this.f20253g = c1545o;
        this.f20254h = c1545o2;
        this.f20256j = C5357b.f14921b;
        this.f20248b = null;
        this.f20257k = null;
        this.f20258l = false;
        this.f20259m = null;
    }

    public static C7115u m18600a(String[] strArr, C5354j c5354j, boolean z, C1478f c1478f, C1545o<Object> c1545o, C1545o<Object> c1545o2, Object obj) {
        HashSet a;
        HashSet hashSet;
        C5354j c5354j2;
        C5354j c5354j3;
        boolean z2;
        boolean z3;
        C7115u c7115u;
        if (strArr != null) {
            if (strArr.length != 0) {
                a = C1519b.m3936a(strArr);
                hashSet = a;
                if (c5354j != null) {
                    c5354j2 = f20247a;
                    c5354j3 = c5354j2;
                } else {
                    c5354j2 = c5354j.mo3398t();
                    c5354j3 = c5354j.mo3394u();
                }
                z2 = false;
                if (!z) {
                    if (c5354j3 != null && c5354j3.m11539m()) {
                        z2 = true;
                    }
                    z = z2;
                } else if (c5354j3.m11531e() == Object.class) {
                    z3 = false;
                    c7115u = new C7115u(hashSet, c5354j2, c5354j3, z3, c1478f, c1545o, c1545o2);
                    return obj == null ? c7115u.m18609c(obj) : c7115u;
                }
                z3 = z;
                c7115u = new C7115u(hashSet, c5354j2, c5354j3, z3, c1478f, c1545o, c1545o2);
                if (obj == null) {
                }
            }
        }
        a = null;
        hashSet = a;
        if (c5354j != null) {
            c5354j2 = c5354j.mo3398t();
            c5354j3 = c5354j.mo3394u();
        } else {
            c5354j2 = f20247a;
            c5354j3 = c5354j2;
        }
        z2 = false;
        if (!z) {
            z2 = true;
            z = z2;
        } else if (c5354j3.m11531e() == Object.class) {
            z3 = false;
            c7115u = new C7115u(hashSet, c5354j2, c5354j3, z3, c1478f, c1545o, c1545o2);
            if (obj == null) {
            }
        }
        z3 = z;
        c7115u = new C7115u(hashSet, c5354j2, c5354j3, z3, c1478f, c1545o, c1545o2);
        if (obj == null) {
        }
    }

    private C1545o<Object> m18601a(C1486k c1486k, C5354j c5354j, aa aaVar) {
        C1484d a = c1486k.m3822a(c5354j, aaVar, this.f20248b);
        if (c1486k != a.f4636b) {
            this.f20256j = a.f4636b;
        }
        return a.f4635a;
    }

    private C1545o<Object> m18602a(C1486k c1486k, Class<?> cls, aa aaVar) {
        C1484d a = c1486k.m3823a((Class) cls, aaVar, this.f20248b);
        if (c1486k != a.f4636b) {
            this.f20256j = a.f4636b;
        }
        return a.f4635a;
    }

    private static Map<?, ?> m18603a(Map<?, ?> map) {
        return map instanceof SortedMap ? map : new TreeMap(map);
    }

    private void m18604a() {
        if (getClass() != C7115u.class) {
            StringBuilder stringBuilder = new StringBuilder("Missing override in class ");
            stringBuilder.append(getClass().getName());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void m18605a(Map<?, ?> map, C5301g c5301g, aa aaVar, C1545o<Object> c1545o) {
        C1545o c1545o2 = this.f20253g;
        HashSet hashSet = this.f20249c;
        C1478f c1478f = this.f20255i;
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (hashSet == null || !hashSet.contains(key)) {
                if (key == null) {
                    aaVar.m11067l().serialize(null, c5301g, aaVar);
                } else {
                    c1545o2.serialize(key, c5301g, aaVar);
                }
                Object value = entry.getValue();
                if (value == null) {
                    aaVar.m11043a(c5301g);
                } else if (c1478f == null) {
                    try {
                        c1545o.serialize(value, c5301g, aaVar);
                    } catch (Throwable e) {
                        wrapAndThrow(aaVar, e, (Object) map, String.valueOf(key));
                    }
                } else {
                    c1545o.serializeWithType(value, c5301g, aaVar, c1478f);
                }
            }
        }
    }

    private void m18606a(Map<?, ?> map, C5301g c5301g, aa aaVar, Object obj) {
        if (this.f20255i != null) {
            m18608b(map, c5301g, aaVar, obj);
            return;
        }
        HashSet hashSet = this.f20249c;
        C1486k c1486k = this.f20256j;
        for (Entry entry : map.entrySet()) {
            C1545o l;
            C1545o c1545o;
            Object key = entry.getKey();
            if (key == null) {
                l = aaVar.m11067l();
            } else if (hashSet == null || !hashSet.contains(key)) {
                l = this.f20253g;
            }
            Object value = entry.getValue();
            if (value != null) {
                c1545o = this.f20254h;
                if (c1545o == null) {
                    Class cls = value.getClass();
                    C1545o a = c1486k.mo1460a(cls);
                    if (a == null) {
                        c1545o = this.f20252f.mo3392s() ? m18601a(c1486k, aaVar.m3650a(this.f20252f, cls), aaVar) : m18602a(c1486k, cls, aaVar);
                        c1486k = this.f20256j;
                    } else {
                        c1545o = a;
                    }
                }
                if (obj == C1327a.NON_EMPTY && r6.isEmpty(aaVar, value)) {
                }
            } else if (obj == null) {
                c1545o = aaVar.m11066k();
            }
            try {
                l.serialize(key, c5301g, aaVar);
                c1545o.serialize(value, c5301g, aaVar);
            } catch (Throwable e) {
                wrapAndThrow(aaVar, e, (Object) map, String.valueOf(key));
            }
        }
    }

    private boolean m18607a(com.p111d.p112a.p121c.aa r7, java.util.Map<?, ?> r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = 1;
        if (r8 == 0) goto L_0x0065;
    L_0x0003:
        r1 = r8.isEmpty();
        if (r1 == 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = r6.f20259m;
        r2 = 0;
        if (r1 == 0) goto L_0x0064;
    L_0x000f:
        r3 = com.p111d.p112a.p113a.C1329q.C1327a.ALWAYS;
        if (r1 != r3) goto L_0x0014;
    L_0x0013:
        return r2;
    L_0x0014:
        r1 = r6.f20254h;
        if (r1 == 0) goto L_0x0034;
    L_0x0018:
        r8 = r8.values();
        r8 = r8.iterator();
    L_0x0020:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0033;
    L_0x0026:
        r3 = r8.next();
        if (r3 == 0) goto L_0x0020;
    L_0x002c:
        r3 = r1.isEmpty(r7, r3);
        if (r3 != 0) goto L_0x0020;
    L_0x0032:
        return r2;
    L_0x0033:
        return r0;
    L_0x0034:
        r1 = r6.f20256j;
        r8 = r8.values();
        r8 = r8.iterator();
    L_0x003e:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0063;
    L_0x0044:
        r3 = r8.next();
        if (r3 == 0) goto L_0x003e;
    L_0x004a:
        r4 = r3.getClass();
        r5 = r1.mo1460a(r4);
        if (r5 != 0) goto L_0x005c;
    L_0x0054:
        r5 = r6.m18602a(r1, r4, r7);	 Catch:{ l -> 0x005b }
        r1 = r6.f20256j;
        goto L_0x005c;
    L_0x005b:
        return r2;
    L_0x005c:
        r3 = r5.isEmpty(r7, r3);
        if (r3 != 0) goto L_0x003e;
    L_0x0062:
        return r2;
    L_0x0063:
        return r0;
    L_0x0064:
        return r2;
    L_0x0065:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.u.a(com.d.a.c.aa, java.util.Map):boolean");
    }

    private void m18608b(Map<?, ?> map, C5301g c5301g, aa aaVar, Object obj) {
        HashSet hashSet = this.f20249c;
        C1486k c1486k = this.f20256j;
        for (Entry entry : map.entrySet()) {
            C1545o l;
            C1545o a;
            Object key = entry.getKey();
            if (key == null) {
                l = aaVar.m11067l();
            } else if (hashSet == null || !hashSet.contains(key)) {
                l = this.f20253g;
            }
            Object value = entry.getValue();
            if (value != null) {
                Class cls = value.getClass();
                C1545o a2 = c1486k.mo1460a(cls);
                if (a2 == null) {
                    a = this.f20252f.mo3392s() ? m18601a(c1486k, aaVar.m3650a(this.f20252f, cls), aaVar) : m18602a(c1486k, cls, aaVar);
                    c1486k = this.f20256j;
                } else {
                    a = a2;
                }
                if (obj == C1327a.NON_EMPTY && r6.isEmpty(aaVar, value)) {
                }
            } else if (obj == null) {
                a = aaVar.m11066k();
            }
            l.serialize(key, c5301g, aaVar);
            try {
                a.serializeWithType(value, c5301g, aaVar, this.f20255i);
            } catch (Throwable e) {
                wrapAndThrow(aaVar, e, (Object) map, String.valueOf(key));
            }
        }
    }

    private C7115u m18609c(Object obj) {
        if (this.f20257k == obj) {
            return this;
        }
        m18604a();
        return new C7115u(this, obj, this.f20258l);
    }

    public final /* synthetic */ C6519i mo3373a(C1478f c1478f) {
        if (this.f20255i == c1478f) {
            return this;
        }
        m18604a();
        return new C7115u(this, c1478f, null);
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c1545o;
        C5308b d = aaVar.m11059d();
        C1545o c1545o2 = null;
        C1449a c = c1446d == null ? null : c1446d.mo1354c();
        Object obj = this.f20259m;
        if (c == null || d == null) {
            c1545o = null;
        } else {
            Object findKeySerializer = d.findKeySerializer(c);
            c1545o = findKeySerializer != null ? aaVar.mo2929c(findKeySerializer) : null;
            Object findContentSerializer = d.findContentSerializer(c);
            if (findContentSerializer != null) {
                c1545o2 = aaVar.mo2929c(findContentSerializer);
            }
        }
        if (c1446d != null) {
            C1327a c2 = c1446d.mo1352b(aaVar.m11058c()).m3140c();
            if (!(c2 == null || c2 == C1327a.USE_DEFAULTS)) {
                obj = c2;
            }
        }
        if (c1545o2 == null) {
            c1545o2 = this.f20254h;
        }
        c1545o2 = findConvertingContentSerializer(aaVar, c1446d, c1545o2);
        if (c1545o2 != null) {
            c1545o2 = aaVar.m11049b(c1545o2, c1446d);
        } else if (this.f20250d && !this.f20252f.m11543q()) {
            c1545o2 = aaVar.m11037a(this.f20252f, c1446d);
        }
        C1545o c1545o3 = c1545o2;
        if (c1545o == null) {
            c1545o = this.f20253g;
        }
        C1545o c3 = c1545o == null ? aaVar.m11054c(this.f20251e, c1446d) : aaVar.m11049b(c1545o, c1446d);
        Collection collection = this.f20249c;
        boolean z = false;
        if (!(d == null || c == null)) {
            String[] findPropertiesToIgnore = d.findPropertiesToIgnore(c, true);
            if (findPropertiesToIgnore != null) {
                collection = collection == null ? new HashSet() : new HashSet(collection);
                for (Object add : findPropertiesToIgnore) {
                    collection.add(add);
                }
            }
            Boolean findSerializationSortAlphabetically = d.findSerializationSortAlphabetically(c);
            if (findSerializationSortAlphabetically != null && findSerializationSortAlphabetically.booleanValue()) {
                z = true;
            }
        }
        Collection collection2 = collection;
        m18604a();
        C1545o<?> c7115u = new C7115u(this, c1446d, c3, c1545o3, collection2);
        if (z != c7115u.f20258l) {
            C1545o<?> c7115u2 = new C7115u((C7115u) c7115u, this.f20257k, z);
        }
        if (obj != this.f20259m) {
            c7115u2 = c7115u2.m18615b(obj);
        }
        if (c1446d == null) {
            return c7115u2;
        }
        C1449a c4 = c1446d.mo1354c();
        if (c4 == null) {
            return c7115u2;
        }
        Object findFilterId = d.findFilterId(c4);
        return findFilterId != null ? c7115u2.m18609c(findFilterId) : c7115u2;
    }

    public final void m18612a(Map<?, ?> map, C5301g c5301g, aa aaVar) {
        if (this.f20255i != null) {
            m18608b(map, c5301g, aaVar, null);
            return;
        }
        C1545o c1545o = this.f20253g;
        HashSet hashSet = this.f20249c;
        C1486k c1486k = this.f20256j;
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                aaVar.m11067l().serialize(null, c5301g, aaVar);
            } else if (hashSet == null || !hashSet.contains(key)) {
                c1545o.serialize(key, c5301g, aaVar);
            }
            if (value == null) {
                aaVar.m11043a(c5301g);
            } else {
                Class cls = value.getClass();
                C1545o a = c1486k.mo1460a(cls);
                if (a == null) {
                    a = this.f20252f.mo3392s() ? m18601a(c1486k, aaVar.m3650a(this.f20252f, cls), aaVar) : m18602a(c1486k, cls, aaVar);
                    c1486k = this.f20256j;
                }
                try {
                    a.serialize(value, c5301g, aaVar);
                } catch (Throwable e) {
                    wrapAndThrow(aaVar, e, (Object) map, String.valueOf(key));
                }
            }
        }
    }

    public final void m18613a(Map<?, ?> map, C5301g c5301g, aa aaVar, C1502n c1502n, Object obj) {
        HashSet hashSet = this.f20249c;
        C1486k c1486k = this.f20256j;
        C6521o c7114t = new C7114t(this.f20255i, this.f20248b);
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (hashSet == null || !hashSet.contains(key)) {
                C1545o c1545o;
                C1545o l = key == null ? aaVar.m11067l() : this.f20253g;
                Object value = entry.getValue();
                if (value != null) {
                    c1545o = this.f20254h;
                    if (c1545o == null) {
                        Class cls = value.getClass();
                        C1545o a = c1486k.mo1460a(cls);
                        if (a == null) {
                            c1545o = this.f20252f.mo3392s() ? m18601a(c1486k, aaVar.m3650a(this.f20252f, cls), aaVar) : m18602a(c1486k, cls, aaVar);
                            c1486k = this.f20256j;
                        } else {
                            c1545o = a;
                        }
                    }
                    if (obj == C1327a.NON_EMPTY && r7.isEmpty(aaVar, value)) {
                    }
                } else if (obj == null) {
                    c1545o = aaVar.m11066k();
                }
                c7114t.m18598a(key, l, c1545o);
                try {
                    c1502n.mo1463a(value, c5301g, aaVar, c7114t);
                } catch (Throwable e) {
                    wrapAndThrow(aaVar, e, (Object) map, String.valueOf(key));
                }
            }
        }
    }

    public final /* synthetic */ boolean mo3374a(Object obj) {
        return ((Map) obj).size() == 1;
    }

    public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public final C7115u m18615b(Object obj) {
        if (obj == this.f20259m) {
            return this;
        }
        m18604a();
        return new C7115u(this, this.f20255i, obj);
    }

    public C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("object", true);
    }

    public /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        return m18607a(aaVar, (Map) obj);
    }

    public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Map map = (Map) obj;
        c5301g.writeStartObject();
        c5301g.setCurrentValue(map);
        if (!map.isEmpty()) {
            Map map2;
            Object obj2 = this.f20259m;
            if (obj2 == C1327a.ALWAYS) {
                obj2 = null;
            } else if (obj2 == null && !aaVar.m11046a(C5387z.WRITE_NULL_MAP_VALUES)) {
                obj2 = C1327a.NON_NULL;
            }
            Object obj3 = obj2;
            if (!this.f20258l) {
                if (aaVar.m11046a(C5387z.ORDER_MAP_ENTRIES_BY_KEYS)) {
                }
                map2 = map;
                if (this.f20257k != null) {
                    m18613a(map2, c5301g, aaVar, findPropertyFilter(aaVar, this.f20257k, map2), obj3);
                } else if (obj3 != null) {
                    m18606a(map2, c5301g, aaVar, obj3);
                } else if (this.f20254h == null) {
                    m18605a(map2, c5301g, aaVar, this.f20254h);
                } else {
                    m18612a(map2, c5301g, aaVar);
                }
            }
            map = C7115u.m18603a(map);
            map2 = map;
            if (this.f20257k != null) {
                m18613a(map2, c5301g, aaVar, findPropertyFilter(aaVar, this.f20257k, map2), obj3);
            } else if (obj3 != null) {
                m18606a(map2, c5301g, aaVar, obj3);
            } else if (this.f20254h == null) {
                m18612a(map2, c5301g, aaVar);
            } else {
                m18605a(map2, c5301g, aaVar, this.f20254h);
            }
        }
        c5301g.writeEndObject();
    }

    public /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        obj = (Map) obj;
        c1478f.mo2907b(obj, c5301g);
        c5301g.setCurrentValue(obj);
        if (!obj.isEmpty()) {
            Object obj2 = this.f20259m;
            if (obj2 == C1327a.ALWAYS) {
                obj2 = null;
            } else if (obj2 == null && !aaVar.m11046a(C5387z.WRITE_NULL_MAP_VALUES)) {
                obj2 = C1327a.NON_NULL;
            }
            Object obj3 = obj2;
            if (this.f20258l || aaVar.m11046a(C5387z.ORDER_MAP_ENTRIES_BY_KEYS)) {
                obj = C7115u.m18603a((Map) obj);
            }
            if (this.f20257k != null) {
                m18613a(obj, c5301g, aaVar, findPropertyFilter(aaVar, this.f20257k, obj), obj3);
            } else if (obj3 != null) {
                m18606a((Map) obj, c5301g, aaVar, obj3);
            } else if (this.f20254h != null) {
                m18605a((Map) obj, c5301g, aaVar, this.f20254h);
            } else {
                m18612a((Map) obj, c5301g, aaVar);
            }
        }
        c1478f.mo2911e(obj, c5301g);
    }

    public /* synthetic */ C1545o withFilterId(Object obj) {
        return m18609c(obj);
    }
}
