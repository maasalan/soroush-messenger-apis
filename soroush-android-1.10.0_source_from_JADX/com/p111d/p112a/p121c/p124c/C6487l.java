package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p113a.af.C1304a;
import com.p111d.p112a.p113a.ah;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1479i;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1507k.C5355a;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C1546p.C5384a;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p123b.C1409e;
import com.p111d.p112a.p121c.p124c.p125a.C1421s;
import com.p111d.p112a.p121c.p124c.p125a.C1421s.C1420a;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public abstract class C6487l extends C5347g implements Serializable {
    protected transient LinkedHashMap<C1304a, C1421s> f17698m;
    private List<ah> f17699n;

    public static final class C7083a extends C6487l {
        private C7083a(C7083a c7083a, C7089f c7089f, C5303j c5303j, C1479i c1479i) {
            super(c7083a, c7089f, c5303j, c1479i);
        }

        public C7083a(C1437n c1437n) {
            super(c1437n);
        }

        public final C6487l mo3351a(C7089f c7089f, C5303j c5303j, C1479i c1479i) {
            return new C7083a(this, c7089f, c5303j, c1479i);
        }
    }

    protected C6487l(C6487l c6487l, C7089f c7089f, C5303j c5303j, C1479i c1479i) {
        super(c6487l, c7089f, c5303j, c1479i);
    }

    protected C6487l(C1437n c1437n) {
        super(c1437n);
    }

    public final C1421s mo2811a(Object obj, af<?> afVar, ah ahVar) {
        ah ahVar2 = null;
        if (obj == null) {
            return null;
        }
        C1421s c1421s;
        C1304a a = afVar.mo3340a(obj);
        if (this.f17698m == null) {
            this.f17698m = new LinkedHashMap();
        } else {
            c1421s = (C1421s) this.f17698m.get(a);
            if (c1421s != null) {
                return c1421s;
            }
        }
        if (this.f17699n != null) {
            for (ah ahVar3 : this.f17699n) {
                if (ahVar3.mo1272a(ahVar)) {
                    ahVar2 = ahVar3;
                    break;
                }
            }
        }
        this.f17699n = new ArrayList(8);
        if (ahVar2 == null) {
            ahVar2 = ahVar.mo1269a();
            this.f17699n.add(ahVar2);
        }
        c1421s = new C1421s(a);
        c1421s.m3511a(ahVar2);
        this.f17698m.put(a, c1421s);
        return c1421s;
    }

    public abstract C6487l mo3351a(C7089f c7089f, C5303j c5303j, C1479i c1479i);

    public final C1507k<Object> mo2812c(Object obj) {
        C1507k<Object> c1507k = null;
        if (obj == null) {
            return null;
        }
        C1507k<Object> c1507k2;
        if (!(obj instanceof C1507k)) {
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls == C5355a.class || C1527g.m3983r(cls)) {
                    return null;
                }
                if (C1507k.class.isAssignableFrom(cls)) {
                    C1409e n = this.c.m11090n();
                    if (n != null) {
                        c1507k = n.m3441a();
                    }
                    if (c1507k == null) {
                        obj = C1527g.m3951a(cls, this.c.m11086j());
                    } else {
                        c1507k2 = c1507k;
                        if (c1507k2 instanceof C1440q) {
                            ((C1440q) c1507k2).mo2802c(this);
                        }
                        return c1507k2;
                    }
                }
                stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append("; expected Class<JsonDeserializer>");
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("AnnotationIntrospector returned deserializer definition of type ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append("; expected type JsonDeserializer or Class<JsonDeserializer> instead");
            throw new IllegalStateException(stringBuilder.toString());
        }
        c1507k2 = (C1507k) obj;
        if (c1507k2 instanceof C1440q) {
            ((C1440q) c1507k2).mo2802c(this);
        }
        return c1507k2;
    }

    public final C1546p mo2813d(Object obj) {
        C1546p c1546p = null;
        if (obj == null) {
            return null;
        }
        C1546p c1546p2;
        if (!(obj instanceof C1546p)) {
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls == C5384a.class || C1527g.m3983r(cls)) {
                    return null;
                }
                if (C1546p.class.isAssignableFrom(cls)) {
                    C1409e n = this.c.m11090n();
                    if (n != null) {
                        c1546p = n.m3442b();
                    }
                    if (c1546p == null) {
                        obj = C1527g.m3951a(cls, this.c.m11086j());
                    } else {
                        c1546p2 = c1546p;
                        if (c1546p2 instanceof C1440q) {
                            ((C1440q) c1546p2).mo2802c(this);
                        }
                        return c1546p2;
                    }
                }
                stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append("; expected Class<KeyDeserializer>");
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("AnnotationIntrospector returned key deserializer definition of type ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            throw new IllegalStateException(stringBuilder.toString());
        }
        c1546p2 = (C1546p) obj;
        if (c1546p2 instanceof C1440q) {
            ((C1440q) c1546p2).mo2802c(this);
        }
        return c1546p2;
    }

    public final void mo2814n() {
        if (this.f17698m != null && m11452a(C5348h.FAIL_ON_UNRESOLVED_OBJECT_IDS)) {
            C6489t c6489t = null;
            for (Entry value : this.f17698m.entrySet()) {
                C1421s c1421s = (C1421s) value.getValue();
                if (c1421s.m3515c()) {
                    if (c6489t == null) {
                        c6489t = new C6489t(m11472k(), "Unresolved forward references for: ");
                    }
                    Object obj = c1421s.m3510a().f4104c;
                    Iterator d = c1421s.m3516d();
                    while (d.hasNext()) {
                        C1420a c1420a = (C1420a) d.next();
                        c6489t.f17712e.add(new C1442u(obj, c1420a.f4497c, c1420a.f4496b.m3353b()));
                    }
                }
            }
            if (c6489t != null) {
                throw c6489t;
            }
        }
    }
}
