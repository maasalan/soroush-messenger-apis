package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C5293j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c.C6499a;
import com.p111d.p112a.p121c.p129g.C5346d;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.C7119d;
import com.p111d.p112a.p121c.p138m.C1534n;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;

public final class C7286r extends C7119d implements Serializable {
    protected final C1534n f21030w;

    private C7286r(C7286r c7286r, C1534n c1534n, C5293j c5293j) {
        super((C7119d) c7286r, c5293j);
        this.f21030w = c1534n;
    }

    public C7286r(C7119d c7119d, C1534n c1534n) {
        super(c7119d);
        this.f21030w = c1534n;
    }

    public final /* synthetic */ C7119d mo3535a(C1534n c1534n) {
        return new C7286r(this, C1534n.m4002a(c1534n, this.f21030w), new C5293j(c1534n.mo1482a(this.d.getValue())));
    }

    protected final C1545o<Object> mo3543a(C1486k c1486k, Class<?> cls, aa aaVar) {
        C1545o a = this.h != null ? aaVar.m11037a(aaVar.m3650a(this.h, cls), (C1446d) this) : aaVar.m11041a((Class) cls, (C1446d) this);
        C1534n c1534n = this.f21030w;
        if (a.isUnwrappingSerializer()) {
            c1534n = C1534n.m4002a(c1534n, ((C7101s) a).f20227a);
        }
        C1545o<Object> unwrappingSerializer = a.unwrappingSerializer(c1534n);
        this.p = this.p.mo1459a(cls, unwrappingSerializer);
        return unwrappingSerializer;
    }

    public final void mo1351a(final C5346d c5346d, aa aaVar) {
        C1545o unwrappingSerializer = aaVar.m11037a(mo1350a(), (C1446d) this).unwrappingSerializer(this.f21030w);
        if (unwrappingSerializer.isUnwrappingSerializer()) {
            unwrappingSerializer.acceptJsonFormatVisitor(new C6499a(this, aaVar) {
                final /* synthetic */ C7286r f20226c;

                public final C5346d mo2893b() {
                    return c5346d;
                }
            }, mo1350a());
        } else {
            super.mo1351a(c5346d, aaVar);
        }
    }

    protected final void mo3544a(C7415o c7415o, C6524m c6524m) {
        c6524m = c6524m.mo3533a(JivePropertiesExtension.ELEMENT);
        if (c6524m != null) {
            Iterator d = c6524m.mo3601d();
            while (d.hasNext()) {
                Entry entry = (Entry) d.next();
                String str = (String) entry.getKey();
                if (this.f21030w != null) {
                    str = this.f21030w.mo1482a(str);
                }
                c7415o.m19722a(str, (C6524m) entry.getValue());
            }
        }
    }

    public final void mo3536a(C1545o<Object> c1545o) {
        super.mo3536a((C1545o) c1545o);
        if (this.m != null) {
            C1534n c1534n = this.f21030w;
            if (this.m.isUnwrappingSerializer()) {
                c1534n = C1534n.m4002a(c1534n, ((C7101s) this.m).f20227a);
            }
            this.m = this.m.unwrappingSerializer(c1534n);
        }
    }

    public final void mo3376a(Object obj, C5301g c5301g, aa aaVar) {
        Object a = m18621a(obj);
        if (a != null) {
            C1545o c1545o = this.m;
            if (c1545o == null) {
                Class cls = a.getClass();
                C1486k c1486k = this.p;
                C1545o a2 = c1486k.mo1460a(cls);
                c1545o = a2 == null ? mo3543a(c1486k, cls, aaVar) : a2;
            }
            if (this.t != null) {
                if (c == this.t) {
                    if (c1545o.isEmpty(aaVar, a)) {
                        return;
                    }
                } else if (this.t.equals(a)) {
                    return;
                }
            }
            if (a == obj) {
                C7119d.m18617a(c5301g, aaVar, c1545o);
            }
            if (!c1545o.isUnwrappingSerializer()) {
                c5301g.writeFieldName(this.d);
            }
            if (this.o == null) {
                c1545o.serialize(a, c5301g, aaVar);
            } else {
                c1545o.serializeWithType(a, c5301g, aaVar, this.o);
            }
        }
    }
}
