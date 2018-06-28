package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p133j.C1480j;
import com.p111d.p112a.p121c.p133j.C7410a;
import com.p111d.p112a.p121c.p133j.C7570g;
import com.p111d.p112a.p121c.p138m.C5378q;
import java.math.BigDecimal;

abstract class C6474d<T extends C6524m> extends C5320x<T> {
    public C6474d(Class<T> cls) {
        super((Class) cls);
    }

    private static C6524m m15446a(C5303j c5303j) {
        Object embeddedObject = c5303j.getEmbeddedObject();
        return embeddedObject == null ? C1480j.m3810a() : embeddedObject.getClass() == byte[].class ? C1480j.m3808a((byte[]) embeddedObject) : embeddedObject instanceof C5378q ? C1480j.m3816a((C5378q) embeddedObject) : embeddedObject instanceof C6524m ? (C6524m) embeddedObject : C1480j.m3817a(embeddedObject);
    }

    private static C6524m m15447c(C5303j c5303j, C5347g c5347g) {
        C1377b c1377b;
        int j = c5347g.m11471j();
        if ((x & j) != 0) {
            if (C5348h.USE_BIG_INTEGER_FOR_INTS.m11480a(j)) {
                c1377b = C1377b.BIG_INTEGER;
            } else if (C5348h.USE_LONG_FOR_INTS.m11480a(j)) {
                c1377b = C1377b.LONG;
            }
            return c1377b != C1377b.INT ? C1480j.m3812a(c5303j.getIntValue()) : c1377b != C1377b.LONG ? C1480j.m3813a(c5303j.getLongValue()) : C1480j.m3814a(c5303j.getBigIntegerValue());
        }
        c1377b = c5303j.getNumberType();
        if (c1377b != C1377b.INT) {
            if (c1377b != C1377b.LONG) {
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final com.p111d.p112a.p121c.p133j.C7415o m15448a(com.p111d.p112a.p114b.C5303j r4, com.p111d.p112a.p121c.C5347g r5, com.p111d.p112a.p121c.p133j.C1480j r6) {
        /*
        r3 = this;
        r0 = r6.m3819c();
        r1 = r4.isExpectedStartObjectToken();
        if (r1 == 0) goto L_0x000f;
    L_0x000a:
        r1 = r4.nextFieldName();
        goto L_0x002d;
    L_0x000f:
        r1 = r4.getCurrentToken();
        r2 = com.p111d.p112a.p114b.C1380m.END_OBJECT;
        if (r1 != r2) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r2 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r1 == r2) goto L_0x0029;
    L_0x001c:
        r6 = r3.mo1307a();
        r4 = r4.getCurrentToken();
        r4 = r5.m11440a(r6, r4);
        throw r4;
    L_0x0029:
        r1 = r4.getCurrentName();
    L_0x002d:
        if (r1 == 0) goto L_0x008c;
    L_0x002f:
        r2 = r4.nextToken();
        r2 = r2.f4392q;
        switch(r2) {
            case 1: goto L_0x0062;
            case 2: goto L_0x0038;
            case 3: goto L_0x005d;
            case 4: goto L_0x0038;
            case 5: goto L_0x0038;
            case 6: goto L_0x0054;
            case 7: goto L_0x004f;
            case 8: goto L_0x0038;
            case 9: goto L_0x0049;
            case 10: goto L_0x0047;
            case 11: goto L_0x0042;
            case 12: goto L_0x003d;
            default: goto L_0x0038;
        };
    L_0x0038:
        r2 = r3.m15452c(r4, r5, r6);
        goto L_0x0066;
    L_0x003d:
        r2 = com.p111d.p112a.p121c.p124c.p126b.C6474d.m15446a(r4);
        goto L_0x0066;
    L_0x0042:
        r2 = com.p111d.p112a.p121c.p133j.C1480j.m3810a();
        goto L_0x0066;
    L_0x0047:
        r2 = 0;
        goto L_0x004a;
    L_0x0049:
        r2 = 1;
    L_0x004a:
        r2 = com.p111d.p112a.p121c.p133j.C1480j.m3809a(r2);
        goto L_0x0066;
    L_0x004f:
        r2 = com.p111d.p112a.p121c.p124c.p126b.C6474d.m15447c(r4, r5);
        goto L_0x0066;
    L_0x0054:
        r2 = r4.getText();
        r2 = com.p111d.p112a.p121c.p133j.C1480j.m3815a(r2);
        goto L_0x0066;
    L_0x005d:
        r2 = r3.m15450b(r4, r5, r6);
        goto L_0x0066;
    L_0x0062:
        r2 = r3.m15448a(r4, r5, r6);
    L_0x0066:
        r2 = r0.m19726b(r1, r2);
        if (r2 == 0) goto L_0x000a;
    L_0x006c:
        r2 = com.p111d.p112a.p121c.C5348h.FAIL_ON_READING_DUP_TREE_KEY;
        r2 = r5.m11452a(r2);
        if (r2 == 0) goto L_0x000a;
    L_0x0074:
        r5 = new java.lang.StringBuilder;
        r6 = "Duplicate field '";
        r5.<init>(r6);
        r5.append(r1);
        r6 = "' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled";
        r5.append(r6);
        r5 = r5.toString();
        r4 = com.p111d.p112a.p121c.C5364l.m11572a(r4, r5);
        throw r4;
    L_0x008c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.d.a(com.d.a.b.j, com.d.a.c.g, com.d.a.c.j.j):com.d.a.c.j.o");
    }

    public Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2899d(c5303j, c5347g);
    }

    protected final C7410a m15450b(C5303j c5303j, C5347g c5347g, C1480j c1480j) {
        C7410a b = c1480j.m3818b();
        while (true) {
            C1380m nextToken = c5303j.nextToken();
            if (nextToken == null) {
                throw c5347g.m11462c("Unexpected end-of-input when binding data into ArrayNode");
            }
            C6524m a;
            boolean z;
            switch (nextToken.f4392q) {
                case 1:
                    a = m15448a(c5303j, c5347g, c1480j);
                    continue;
                case 3:
                    a = m15450b(c5303j, c5347g, c1480j);
                    continue;
                case 4:
                    return b;
                case 6:
                    a = C1480j.m3815a(c5303j.getText());
                    continue;
                case 7:
                    a = C6474d.m15447c(c5303j, c5347g);
                    continue;
                case 9:
                    z = true;
                    break;
                case 10:
                    z = false;
                    break;
                case 11:
                    a = C1480j.m3810a();
                    continue;
                case 12:
                    a = C6474d.m15446a(c5303j);
                    continue;
                default:
                    a = m15452c(c5303j, c5347g, c1480j);
                    continue;
            }
            a = C1480j.m3809a(z);
            b.m19700a(a);
        }
    }

    public boolean mo1311b() {
        return true;
    }

    protected final C6524m m15452c(C5303j c5303j, C5347g c5347g, C1480j c1480j) {
        switch (c5303j.getCurrentTokenId()) {
            case 1:
            case 2:
            case 5:
                return m15448a(c5303j, c5347g, c1480j);
            case 3:
                return m15450b(c5303j, c5347g, c1480j);
            case 6:
                return C1480j.m3815a(c5303j.getText());
            case 7:
                return C6474d.m15447c(c5303j, c5347g);
            case 8:
                if (c5303j.getNumberType() != C1377b.BIG_DECIMAL) {
                    if (!c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return C1480j.m3811a(c5303j.getDoubleValue());
                    }
                }
                BigDecimal decimalValue = c5303j.getDecimalValue();
                return c1480j.f4619a ? C7570g.m20703a(decimalValue) : decimalValue.compareTo(BigDecimal.ZERO) == 0 ? C7570g.f23121a : C7570g.m20703a(decimalValue.stripTrailingZeros());
            case 9:
                return C1480j.m3809a(true);
            case 10:
                return C1480j.m3809a(false);
            case 11:
                return C1480j.m3810a();
            case 12:
                return C6474d.m15446a(c5303j);
            default:
                throw c5347g.m11457b(mo1307a());
        }
    }
}
