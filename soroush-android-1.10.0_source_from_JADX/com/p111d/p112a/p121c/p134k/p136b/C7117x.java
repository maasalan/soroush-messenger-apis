package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

@C1387a
public final class C7117x extends ak<Number> {
    public static final C7117x f20260a = new C7117x(Number.class);
    protected final boolean f20261b;

    public C7117x(Class<? extends Number> cls) {
        boolean z = false;
        super(cls, (byte) 0);
        if (cls == BigInteger.class) {
            z = true;
        }
        this.f20261b = z;
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        if (this.f20261b) {
            visitIntFormat(c5345c, c5354j, C1377b.BIG_INTEGER);
            return;
        }
        if (handledType() == BigDecimal.class) {
            visitFloatFormat(c5345c, c5354j, C1377b.BIG_DECIMAL);
        }
    }

    public final C6524m getSchema(aa aaVar, Type type) {
        return createSchemaNode(this.f20261b ? "integer" : "number", true);
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            c5301g.writeNumber((BigDecimal) number);
        } else if (number instanceof BigInteger) {
            c5301g.writeNumber((BigInteger) number);
        } else if (number instanceof Long) {
            c5301g.writeNumber(number.longValue());
        } else if (number instanceof Double) {
            c5301g.writeNumber(number.doubleValue());
        } else if (number instanceof Float) {
            c5301g.writeNumber(number.floatValue());
        } else {
            if (!((number instanceof Integer) || (number instanceof Byte))) {
                if (!(number instanceof Short)) {
                    c5301g.writeNumber(number.toString());
                    return;
                }
            }
            c5301g.writeNumber(number.intValue());
        }
    }
}
