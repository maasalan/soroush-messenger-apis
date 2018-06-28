package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1544n;
import com.p111d.p112a.p121c.C1544n.C5382a;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6526t;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import java.util.concurrent.atomic.AtomicReference;

@C1387a
public final class ab extends al<C1544n> {
    public static final ab f17736a = new ab();
    private static final AtomicReference<C6526t> f17737b = new AtomicReference();

    protected ab() {
        super(C1544n.class);
    }

    private static final synchronized C6526t m15685a() {
        C6526t c6526t;
        synchronized (ab.class) {
            c6526t = (C6526t) f17737b.get();
            if (c6526t == null) {
                c6526t = new C6526t();
                f17737b.set(c6526t);
            }
        }
        return c6526t;
    }

    public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
    }

    public final com.p111d.p112a.p121c.C6524m getSchema(com.p111d.p112a.p121c.aa r6, java.lang.reflect.Type r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r6 = r5.createObjectNode();
        r0 = "any";
        r1 = 0;
        if (r7 == 0) goto L_0x0044;
    L_0x0009:
        r7 = com.p111d.p112a.p121c.p137l.C1513m.m3910a(r7);
        r2 = com.p111d.p112a.p121c.p130h.C1469b.class;
        r2 = r7.isAnnotationPresent(r2);
        if (r2 == 0) goto L_0x0044;
    L_0x0015:
        r0 = com.p111d.p112a.p121c.p130h.C1469b.class;
        r7 = r7.getAnnotation(r0);
        r7 = (com.p111d.p112a.p121c.p130h.C1469b) r7;
        r0 = r7.m3759b();
        r2 = "##irrelevant";
        r3 = r7.m3760c();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0032;
    L_0x002d:
        r2 = r7.m3760c();
        goto L_0x0033;
    L_0x0032:
        r2 = r1;
    L_0x0033:
        r3 = "##irrelevant";
        r4 = r7.m3761d();
        r3 = r3.equals(r4);
        if (r3 != 0) goto L_0x0045;
    L_0x003f:
        r1 = r7.m3761d();
        goto L_0x0045;
    L_0x0044:
        r2 = r1;
    L_0x0045:
        r7 = "type";
        r6.m19719a(r7, r0);
        if (r2 == 0) goto L_0x0061;
    L_0x004c:
        r7 = "properties";	 Catch:{ IOException -> 0x005a }
        r0 = com.p111d.p112a.p121c.p134k.p136b.ab.m15685a();	 Catch:{ IOException -> 0x005a }
        r0 = r0.m15760a(r2);	 Catch:{ IOException -> 0x005a }
        r6.m19722a(r7, r0);	 Catch:{ IOException -> 0x005a }
        goto L_0x0061;
    L_0x005a:
        r6 = "Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value";
        r6 = com.p111d.p112a.p121c.C5364l.m11576a(r6);
        throw r6;
    L_0x0061:
        if (r1 == 0) goto L_0x0078;
    L_0x0063:
        r7 = "items";	 Catch:{ IOException -> 0x0071 }
        r0 = com.p111d.p112a.p121c.p134k.p136b.ab.m15685a();	 Catch:{ IOException -> 0x0071 }
        r0 = r0.m15760a(r1);	 Catch:{ IOException -> 0x0071 }
        r6.m19722a(r7, r0);	 Catch:{ IOException -> 0x0071 }
        return r6;
    L_0x0071:
        r6 = "Failed to parse @JsonSerializableSchema.schemaItemDefinition value";
        r6 = com.p111d.p112a.p121c.C5364l.m11576a(r6);
        throw r6;
    L_0x0078:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.ab.getSchema(com.d.a.c.aa, java.lang.reflect.Type):com.d.a.c.m");
    }

    public final /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
        C1544n c1544n = (C1544n) obj;
        return c1544n instanceof C5382a ? ((C5382a) c1544n).mo3600e() : false;
    }

    public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
        ((C1544n) obj).mo1483a(c5301g, aaVar);
    }

    public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
        ((C1544n) obj).mo1484a(c5301g, aaVar, c1478f);
    }
}
