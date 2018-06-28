package com.p111d.p112a.p121c.p131i.p132a;

import com.p111d.p112a.p113a.aa.C1301a;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p131i.C1476d;
import com.p111d.p112a.p121c.p138m.C6523u;

public final class C7091f extends C6500a {
    protected final C1301a f20208a;

    private C7091f(C7091f c7091f, C1446d c1446d) {
        super(c7091f, c1446d);
        this.f20208a = c7091f.f20208a;
    }

    public C7091f(C5354j c5354j, C1476d c1476d, String str, boolean z, Class<?> cls, C1301a c1301a) {
        super(c5354j, c1476d, str, z, cls);
        this.f20208a = c1301a;
    }

    private Object m18524a(C5303j c5303j, C5347g c5347g, C6523u c6523u) {
        C1507k a = m11501a(c5347g);
        if (a != null) {
            if (c6523u != null) {
                c6523u.writeEndObject();
                c5303j = c6523u.m15743a(c5303j);
                c5303j.nextToken();
            }
            return a.mo1304a(c5303j, c5347g);
        }
        Object a2 = C1475c.m3771a(c5303j, this.c);
        if (a2 != null) {
            return a2;
        }
        if (c5303j.getCurrentToken() == C1380m.START_ARRAY) {
            return super.mo2899d(c5303j, c5347g);
        }
        C1380m c1380m = C1380m.FIELD_NAME;
        StringBuilder stringBuilder = new StringBuilder("missing property '");
        stringBuilder.append(this.f);
        stringBuilder.append("' that is to contain type id  (for class ");
        stringBuilder.append(m11507f());
        stringBuilder.append(")");
        throw C5347g.m11430a(c5303j, c1380m, stringBuilder.toString());
    }

    public final C1301a mo2894a() {
        return this.f20208a;
    }

    public final C1475c mo2895a(C1446d c1446d) {
        return c1446d == this.d ? this : new C7091f(this, c1446d);
    }

    public final java.lang.Object mo2896a(com.p111d.p112a.p114b.C5303j r5, com.p111d.p112a.p121c.C5347g r6) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r0 = r5.canReadTypeId();
        if (r0 == 0) goto L_0x0011;
    L_0x0006:
        r0 = r5.getTypeId();
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r5 = r4.m11503a(r5, r6, r0);
        return r5;
    L_0x0011:
        r0 = r5.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        r2 = 0;
        if (r0 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x0074;
    L_0x001b:
        r1 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r0 == r1) goto L_0x0024;
    L_0x001f:
        r5 = r4.m18524a(r5, r6, r2);
        return r5;
    L_0x0024:
        r1 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r0 != r1) goto L_0x0079;
    L_0x0028:
        r0 = r5.getCurrentName();
        r5.nextToken();
        r1 = r4.f;
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0066;
    L_0x0037:
        r0 = r5.getText();
        r1 = r4.m11502a(r6, r0);
        r3 = r4.g;
        if (r3 == 0) goto L_0x0054;
    L_0x0043:
        if (r2 != 0) goto L_0x004a;
    L_0x0045:
        r2 = new com.d.a.c.m.u;
        r2.<init>(r5, r6);
    L_0x004a:
        r3 = r5.getCurrentName();
        r2.writeFieldName(r3);
        r2.writeString(r0);
    L_0x0054:
        if (r2 == 0) goto L_0x005e;
    L_0x0056:
        r0 = r2.m15743a(r5);
        r5 = com.p111d.p112a.p114b.p120g.C7043h.m18225a(r0, r5);
    L_0x005e:
        r5.nextToken();
        r5 = r1.mo1304a(r5, r6);
        return r5;
    L_0x0066:
        if (r2 != 0) goto L_0x006e;
    L_0x0068:
        r1 = new com.d.a.c.m.u;
        r1.<init>(r5, r6);
        r2 = r1;
    L_0x006e:
        r2.writeFieldName(r0);
        r2.copyCurrentStructure(r5);
    L_0x0074:
        r0 = r5.nextToken();
        goto L_0x0024;
    L_0x0079:
        r5 = r4.m18524a(r5, r6, r2);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.i.a.f.a(com.d.a.b.j, com.d.a.c.g):java.lang.Object");
    }

    public final Object mo2899d(C5303j c5303j, C5347g c5347g) {
        return c5303j.getCurrentToken() == C1380m.START_ARRAY ? super.mo2897b(c5303j, c5347g) : mo2896a(c5303j, c5347g);
    }
}
