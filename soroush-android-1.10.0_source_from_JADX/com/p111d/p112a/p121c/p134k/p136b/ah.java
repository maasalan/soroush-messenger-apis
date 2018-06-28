package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p129g.C5345c;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class ah {

    public static class C7103a extends ak<AtomicBoolean> {
        public C7103a() {
            super(AtomicBoolean.class, (byte) 0);
        }

        public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
        }

        public C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("boolean", true);
        }

        public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeBoolean(((AtomicBoolean) obj).get());
        }
    }

    public static class C7104b extends ak<AtomicInteger> {
        public C7104b() {
            super(AtomicInteger.class, (byte) 0);
        }

        public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitIntFormat(c5345c, c5354j, C1377b.INT);
        }

        public C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("integer", true);
        }

        public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((AtomicInteger) obj).get());
        }
    }

    public static class C7105c extends ak<AtomicLong> {
        public C7105c() {
            super(AtomicLong.class, (byte) 0);
        }

        public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitIntFormat(c5345c, c5354j, C1377b.LONG);
        }

        public C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("integer", true);
        }

        public /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((AtomicLong) obj).get());
        }
    }

    public static java.util.Collection<java.util.Map.Entry<java.lang.Class<?>, java.lang.Object>> m3840a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = com.p111d.p112a.p121c.p134k.p136b.ao.f17745a;
        r2 = java.net.URL.class;
        r0.put(r2, r1);
        r2 = java.net.URI.class;
        r0.put(r2, r1);
        r2 = java.util.Currency.class;
        r0.put(r2, r1);
        r2 = java.util.UUID.class;
        r3 = new com.d.a.c.k.b.aq;
        r3.<init>();
        r0.put(r2, r3);
        r2 = java.util.regex.Pattern.class;
        r0.put(r2, r1);
        r2 = java.util.Locale.class;
        r0.put(r2, r1);
        r1 = java.util.concurrent.atomic.AtomicBoolean.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.ah.C7103a.class;
        r0.put(r1, r2);
        r1 = java.util.concurrent.atomic.AtomicInteger.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.ah.C7104b.class;
        r0.put(r1, r2);
        r1 = java.util.concurrent.atomic.AtomicLong.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.ah.C7105c.class;
        r0.put(r1, r2);
        r1 = java.io.File.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.C7111o.class;
        r0.put(r1, r2);
        r1 = java.lang.Class.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.C7108i.class;
        r0.put(r1, r2);
        r1 = java.lang.Void.class;
        r2 = com.p111d.p112a.p121c.p134k.p136b.C6517w.f17766a;
        r0.put(r1, r2);
        r1 = java.lang.Void.TYPE;
        r2 = com.p111d.p112a.p121c.p134k.p136b.C6517w.f17766a;
        r0.put(r1, r2);
        r1 = java.sql.Timestamp.class;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r2 = com.p111d.p112a.p121c.p134k.p136b.C7294k.f21037a;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r0.put(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r1 = java.sql.Date.class;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r2 = com.p111d.p112a.p121c.p134k.p136b.ac.class;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r0.put(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r1 = java.sql.Time.class;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r2 = com.p111d.p112a.p121c.p134k.p136b.ad.class;	 Catch:{ NoClassDefFoundError -> 0x0070 }
        r0.put(r1, r2);	 Catch:{ NoClassDefFoundError -> 0x0070 }
    L_0x0070:
        r0 = r0.entrySet();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.ah.a():java.util.Collection<java.util.Map$Entry<java.lang.Class<?>, java.lang.Object>>");
    }
}
