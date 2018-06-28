package com.p111d.p112a.p121c.p134k.p135a;

import com.p111d.p112a.p113a.C1320j.C1316a;
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
import com.p111d.p112a.p121c.p129g.C1465a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p134k.p136b.C7102a;
import com.p111d.p112a.p121c.p137l.C1513m;
import java.lang.reflect.Type;

@C1387a
public final class C7285n extends C7102a<String[]> implements C1498j {
    public static final C7285n f21027a = new C7285n();
    private static final C5354j f21028e = C1513m.m3907a(String.class);
    protected final C1545o<Object> f21029b;

    static {
        C1513m.m3909a();
    }

    protected C7285n() {
        super(String[].class);
        this.f21029b = null;
    }

    private C7285n(C7285n c7285n, C1446d c1446d, C1545o<?> c1545o, Boolean bool) {
        super(c7285n, c1446d, bool);
        this.f21029b = c1545o;
    }

    private void m19432a(String[] strArr, C5301g c5301g, aa aaVar) {
        int length = strArr.length;
        if (length != 0) {
            int i = 0;
            if (this.f21029b != null) {
                C1545o c1545o = this.f21029b;
                int length2 = strArr.length;
                while (i < length2) {
                    if (strArr[i] == null) {
                        aaVar.m11043a(c5301g);
                    } else {
                        c1545o.serialize(strArr[i], c5301g, aaVar);
                    }
                    i++;
                }
                return;
            }
            while (i < length) {
                if (strArr[i] == null) {
                    c5301g.writeNull();
                } else {
                    c5301g.writeString(strArr[i]);
                }
                i++;
            }
        }
    }

    public final C6519i<?> mo3373a(C1478f c1478f) {
        return this;
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        C1545o c;
        Boolean findFormatFeature;
        C1545o a;
        if (c1446d != null) {
            C5308b d = aaVar.m11059d();
            C1449a c2 = c1446d.mo1354c();
            if (c2 != null) {
                Object findContentSerializer = d.findContentSerializer(c2);
                if (findContentSerializer != null) {
                    c = aaVar.mo2929c(findContentSerializer);
                    findFormatFeature = findFormatFeature(aaVar, c1446d, String[].class, C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
                    if (c == null) {
                        c = this.f21029b;
                    }
                    c = findConvertingContentSerializer(aaVar, c1446d, c);
                    a = c != null ? aaVar.m11041a(String.class, c1446d) : aaVar.m11049b(c, c1446d);
                    if (isDefaultSerializer(a)) {
                        a = null;
                    }
                    return (a == this.f21029b || findFormatFeature != this.d) ? new C7285n(this, c1446d, a, findFormatFeature) : this;
                }
            }
        }
        c = null;
        findFormatFeature = findFormatFeature(aaVar, c1446d, String[].class, C1316a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
        if (c == null) {
            c = this.f21029b;
        }
        c = findConvertingContentSerializer(aaVar, c1446d, c);
        if (c != null) {
        }
        if (isDefaultSerializer(a)) {
            a = null;
        }
        if (a == this.f21029b) {
        }
    }

    public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
        return new C7285n(this, c1446d, this.f21029b, bool);
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        visitArrayFormat(c5345c, c5354j, C1465a.STRING);
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode("array", true).m19722a("items", createSchemaNode("string"));
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr != null) {
            if (strArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        String[] strArr = (String[]) obj;
        int length = strArr.length;
        if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
            m19432a(strArr, c5301g, aaVar);
            return;
        }
        c5301g.writeStartArray(length);
        m19432a(strArr, c5301g, aaVar);
        c5301g.writeEndArray();
    }
}
