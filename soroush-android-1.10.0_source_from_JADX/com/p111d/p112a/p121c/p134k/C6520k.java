package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p113a.af;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C1545o.C5383a;
import com.p111d.p112a.p121c.C1549v;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p123b.C1409e;
import com.p111d.p112a.p121c.p134k.p135a.C1489t;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public abstract class C6520k extends aa implements Serializable {
    protected transient Map<Object, C1489t> f17767o;
    protected transient ArrayList<af<?>> f17768p;

    public static final class C7121a extends C6520k {
        private C7121a(aa aaVar, C7128y c7128y, C1505r c1505r) {
            super(aaVar, c7128y, c1505r);
        }

        public final /* synthetic */ C6520k mo3377a(C7128y c7128y, C1505r c1505r) {
            return new C7121a(this, c7128y, c1505r);
        }
    }

    protected C6520k() {
    }

    protected C6520k(aa aaVar, C7128y c7128y, C1505r c1505r) {
        super(aaVar, c7128y, c1505r);
    }

    public final C1489t mo2928a(Object obj, af<?> afVar) {
        if (this.f17767o == null) {
            this.f17767o = m11046a(C5387z.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            C1489t c1489t = (C1489t) this.f17767o.get(obj);
            if (c1489t != null) {
                return c1489t;
            }
        }
        af afVar2 = null;
        if (this.f17768p == null) {
            this.f17768p = new ArrayList(8);
        } else {
            int size = this.f17768p.size();
            for (int i = 0; i < size; i++) {
                af afVar3 = (af) this.f17768p.get(i);
                if (afVar3.mo1268a((af) afVar)) {
                    afVar2 = afVar3;
                    break;
                }
            }
        }
        if (afVar2 == null) {
            afVar2 = afVar.mo3342b();
            this.f17768p.add(afVar2);
        }
        C1489t c1489t2 = new C1489t(afVar2);
        this.f17767o.put(obj, c1489t2);
        return c1489t2;
    }

    public abstract C6520k mo3377a(C7128y c7128y, C1505r c1505r);

    public final void m15719a(C5301g c5301g, Object obj) {
        String message;
        if (obj == null) {
            try {
                m11066k().serialize(null, c5301g, this);
                return;
            } catch (IOException e) {
                throw e;
            } catch (Throwable e2) {
                message = e2.getMessage();
                if (message == null) {
                    StringBuilder stringBuilder = new StringBuilder("[no message for ");
                    stringBuilder.append(e2.getClass().getName());
                    stringBuilder.append("]");
                    message = stringBuilder.toString();
                }
                throw C5364l.m11571a(c5301g, message, e2);
            }
        }
        boolean a;
        C1545o c = m11056c(obj.getClass(), null);
        C1549v v = this.c.m15416v();
        if (v == null) {
            a = this.c.m18737a(C5387z.WRAP_ROOT_VALUE);
            if (a) {
                c5301g.writeStartObject();
                c5301g.writeFieldName(this.c.m15413f(obj.getClass()).m4057a(this.c));
            }
        } else if (v.m4064e()) {
            a = false;
        } else {
            c5301g.writeStartObject();
            c5301g.writeFieldName(v.m4060b());
            a = true;
        }
        try {
            c.serialize(obj, c5301g, this);
            if (a) {
                c5301g.writeEndObject();
            }
        } catch (IOException e3) {
            throw e3;
        } catch (Throwable e22) {
            message = e22.getMessage();
            if (message == null) {
                stringBuilder = new StringBuilder("[no message for ");
                stringBuilder.append(e22.getClass().getName());
                stringBuilder.append("]");
                message = stringBuilder.toString();
            }
            throw new C5364l((Closeable) c5301g, message, e22);
        }
    }

    public final C1545o<Object> mo2929c(Object obj) {
        C1545o<Object> c1545o = null;
        if (obj == null) {
            return null;
        }
        C1545o<Object> c1545o2;
        if (!(obj instanceof C1545o)) {
            StringBuilder stringBuilder;
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                if (cls == C5383a.class || C1527g.m3983r(cls)) {
                    return null;
                }
                if (C1545o.class.isAssignableFrom(cls)) {
                    C1409e n = this.c.m11090n();
                    if (n != null) {
                        c1545o = n.m3443c();
                    }
                    if (c1545o == null) {
                        obj = C1527g.m3951a(cls, this.c.m11086j());
                    } else {
                        c1545o2 = c1545o;
                        if (c1545o2 instanceof C1503p) {
                            ((C1503p) c1545o2).mo2919a(this);
                        }
                        return c1545o2;
                    }
                }
                stringBuilder = new StringBuilder("AnnotationIntrospector returned Class ");
                stringBuilder.append(cls.getName());
                stringBuilder.append("; expected Class<JsonSerializer>");
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("AnnotationIntrospector returned serializer definition of type ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append("; expected type JsonSerializer or Class<JsonSerializer> instead");
            throw new IllegalStateException(stringBuilder.toString());
        }
        c1545o2 = (C1545o) obj;
        if (c1545o2 instanceof C1503p) {
            ((C1503p) c1545o2).mo2919a(this);
        }
        return c1545o2;
    }
}
