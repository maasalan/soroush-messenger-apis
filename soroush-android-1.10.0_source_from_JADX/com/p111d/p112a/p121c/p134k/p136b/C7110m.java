package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1318c;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p123b.C5306f;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p133j.C7410a;
import com.p111d.p112a.p121c.p134k.C1498j;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1531k;
import java.lang.reflect.Type;
import java.util.Arrays;

@C1387a
public final class C7110m extends ak<Enum<?>> implements C1498j {
    protected final C1531k f20240a;
    protected final Boolean f20241b;

    private C7110m(C1531k c1531k, Boolean bool) {
        super(c1531k.f4772a, (byte) 0);
        this.f20240a = c1531k;
        this.f20241b = bool;
    }

    public static C7110m m18588a(Class<?> cls, C7128y c7128y, C1319d c1319d) {
        Class q = C1527g.m3982q(cls);
        Enum[] enumArr = (Enum[]) q.getEnumConstants();
        if (enumArr == null) {
            StringBuilder stringBuilder = new StringBuilder("Can not determine enum constants for Class ");
            stringBuilder.append(cls.getName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        String[] findEnumValues = c7128y.mo3358a().findEnumValues(q, enumArr, new String[enumArr.length]);
        C1382p[] c1382pArr = new C1382p[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum enumR = enumArr[i];
            String str = findEnumValues[i];
            if (str == null) {
                str = enumR.name();
            }
            c1382pArr[enumR.ordinal()] = C5306f.m11073a(str);
        }
        return new C7110m(new C1531k(cls, c1382pArr), C7110m.m18589a((Class) cls, c1319d, true));
    }

    private static Boolean m18589a(Class<?> cls, C1319d c1319d, boolean z) {
        C1318c c1318c = c1319d == null ? null : c1319d.f4140b;
        if (c1318c == null || c1318c == C1318c.ANY || c1318c == C1318c.SCALAR) {
            return null;
        }
        if (c1318c == C1318c.STRING) {
            return Boolean.FALSE;
        }
        if (!c1318c.m3110a()) {
            if (c1318c != C1318c.ARRAY) {
                StringBuilder stringBuilder = new StringBuilder("Unsupported serialization shape (");
                stringBuilder.append(c1318c);
                stringBuilder.append(") for Enum ");
                stringBuilder.append(cls.getName());
                stringBuilder.append(", not supported as ");
                stringBuilder.append(z ? "class" : "property");
                stringBuilder.append(" annotation");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return Boolean.TRUE;
    }

    private boolean m18590a(aa aaVar) {
        return this.f20241b != null ? this.f20241b.booleanValue() : aaVar.m11046a(C5387z.WRITE_ENUMS_USING_INDEX);
    }

    public final C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
        if (c1446d != null) {
            C1319d findFormat = aaVar.m11059d().findFormat(c1446d.mo1354c());
            if (findFormat != null) {
                Boolean a = C7110m.m18589a(c1446d.mo1350a().m11531e(), findFormat, false);
                if (a != this.f20241b) {
                    return new C7110m(this.f20240a, a);
                }
            }
        }
        return this;
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        if (m18590a(c5345c.mo2892a())) {
            visitIntFormat(c5345c, c5354j, C1377b.INT);
        }
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        if (m18590a(aaVar)) {
            return createSchemaNode("integer", true);
        }
        C6524m createSchemaNode = createSchemaNode("string", true);
        if (type != null && aaVar.m3651a(type).m11536j()) {
            C7410a b = createSchemaNode.m19725b("enum");
            for (C1382p value : Arrays.asList(this.f20240a.f4773b)) {
                String value2 = value.getValue();
                b.m19704b(value2 == null ? C1480j.m3810a() : C1480j.m3815a(value2));
            }
        }
        return createSchemaNode;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Enum enumR = (Enum) obj;
        if (m18590a(aaVar)) {
            c5301g.writeNumber(enumR.ordinal());
        } else if (aaVar.m11046a(C5387z.WRITE_ENUMS_USING_TO_STRING)) {
            c5301g.writeString(enumR.toString());
        } else {
            c5301g.writeString(this.f20240a.f4773b[enumR.ordinal()]);
        }
    }
}
