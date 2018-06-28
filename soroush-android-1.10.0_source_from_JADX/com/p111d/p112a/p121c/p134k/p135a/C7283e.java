package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p136b.C7106b;
import java.util.List;

@C1387a
public final class C7283e extends C7106b<List<?>> {
    public C7283e(C5354j c5354j, boolean z, C1478f c1478f, C1545o<Object> c1545o) {
        super(List.class, c5354j, z, c1478f, (C1545o) c1545o);
    }

    private C7283e(C7283e c7283e, C1446d c1446d, C1478f c1478f, C1545o<?> c1545o, Boolean bool) {
        super((C7106b) c7283e, c1446d, c1478f, (C1545o) c1545o, bool);
    }

    private void m19422a(List<?> list, C5301g c5301g, aa aaVar) {
        int i = 0;
        Object obj;
        if (this.f != null) {
            C1545o c1545o = this.f;
            int size = list.size();
            if (size != 0) {
                C1478f c1478f = this.e;
                while (i < size) {
                    obj = list.get(i);
                    if (obj == null) {
                        try {
                            aaVar.m11043a(c5301g);
                        } catch (Throwable e) {
                            wrapAndThrow(aaVar, e, (Object) list, i);
                        }
                    } else if (c1478f == null) {
                        c1545o.serialize(obj, c5301g, aaVar);
                    } else {
                        c1545o.serializeWithType(obj, c5301g, aaVar, c1478f);
                    }
                    i++;
                }
            }
        } else if (this.e != null) {
            r0 = list.size();
            if (r0 != 0) {
                try {
                    C1478f c1478f2 = this.e;
                    C1486k c1486k = this.g;
                    while (i < r0) {
                        obj = list.get(i);
                        if (obj == null) {
                            aaVar.m11043a(c5301g);
                        } else {
                            Class cls = obj.getClass();
                            C1545o a = c1486k.mo1460a(cls);
                            if (a == null) {
                                a = this.a.mo3392s() ? m18580a(c1486k, aaVar.m3650a(this.a, cls), aaVar) : m18581a(c1486k, cls, aaVar);
                                c1486k = this.g;
                            }
                            a.serializeWithType(obj, c5301g, aaVar, c1478f2);
                        }
                        i++;
                    }
                } catch (Throwable e2) {
                    wrapAndThrow(aaVar, e2, (Object) list, 0);
                }
            }
        } else {
            r0 = list.size();
            if (r0 != 0) {
                try {
                    C1486k c1486k2 = this.g;
                    while (i < r0) {
                        Object obj2 = list.get(i);
                        if (obj2 == null) {
                            aaVar.m11043a(c5301g);
                        } else {
                            Class cls2 = obj2.getClass();
                            C1545o a2 = c1486k2.mo1460a(cls2);
                            if (a2 == null) {
                                a2 = this.a.mo3392s() ? m18580a(c1486k2, aaVar.m3650a(this.a, cls2), aaVar) : m18581a(c1486k2, cls2, aaVar);
                                c1486k2 = this.g;
                            }
                            a2.serialize(obj2, c5301g, aaVar);
                        }
                        i++;
                    }
                } catch (Throwable e22) {
                    wrapAndThrow(aaVar, e22, (Object) list, 0);
                }
            }
        }
    }

    public final /* synthetic */ C7106b mo3539a(C1446d c1446d, C1478f c1478f, C1545o c1545o, Boolean bool) {
        return new C7283e(this, c1446d, c1478f, c1545o, bool);
    }

    public final C6519i<?> mo3373a(C1478f c1478f) {
        return new C7283e(this, this.b, c1478f, this.f, this.d);
    }

    public final /* synthetic */ boolean mo3374a(Object obj) {
        return ((List) obj).size() == 1;
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        List list = (List) obj;
        if (list != null) {
            if (!list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        List list = (List) obj;
        int size = list.size();
        if (size == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            m19422a(list, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray(size);
        m19422a(list, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
