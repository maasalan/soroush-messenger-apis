package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p113a.C1320j.C1318c;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p134k.C1498j;
import java.lang.reflect.Type;

public final class C1494y {

    static /* synthetic */ class C14931 {
        static final /* synthetic */ int[] f4661a = new int[C1318c.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = com.p111d.p112a.p113a.C1320j.C1318c.values();
            r0 = r0.length;
            r0 = new int[r0];
            f4661a = r0;
            r0 = f4661a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.p111d.p112a.p113a.C1320j.C1318c.STRING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.b.y.1.<clinit>():void");
        }
    }

    protected static abstract class C7118a<T> extends ak<T> implements C1498j {
        protected final C1377b f20262a;
        protected final String f20263b;
        protected final boolean f20264c;

        protected C7118a(Class<?> cls, C1377b c1377b, String str) {
            boolean z = false;
            super(cls, (byte) 0);
            this.f20262a = c1377b;
            this.f20263b = str;
            if (c1377b == C1377b.INT || c1377b == C1377b.LONG || c1377b == C1377b.BIG_INTEGER) {
                z = true;
            }
            this.f20264c = z;
        }

        public C1545o<?> mo2917a(aa aaVar, C1446d c1446d) {
            if (c1446d != null) {
                C1449a c = c1446d.mo1354c();
                if (c != null) {
                    C1319d findFormat = aaVar.m11059d().findFormat(c);
                    return (findFormat == null || C14931.f4661a[findFormat.f4140b.ordinal()] != 1) ? this : ao.f17745a;
                }
            }
            return this;
        }

        public void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            if (this.f20264c) {
                visitIntFormat(c5345c, c5354j, this.f20262a);
            } else {
                visitFloatFormat(c5345c, c5354j, this.f20262a);
            }
        }

        public C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode(this.f20263b, true);
        }
    }

    @C1387a
    public static final class C7297b extends C7118a<Object> {
        public static final C7297b f21038d = new C7297b();

        public C7297b() {
            super(Double.class, C1377b.DOUBLE, "number");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Double) obj).doubleValue());
        }

        public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
            serialize(obj, c5301g, aaVar);
        }
    }

    @C1387a
    public static final class C7298c extends C7118a<Object> {
        public static final C7298c f21039d = new C7298c();

        public C7298c() {
            super(Float.class, C1377b.FLOAT, "number");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Float) obj).floatValue());
        }
    }

    @C1387a
    public static final class C7299d extends C7118a<Object> {
        public static final C7299d f21040d = new C7299d();

        public C7299d() {
            super(Number.class, C1377b.INT, "integer");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Number) obj).intValue());
        }
    }

    @C1387a
    public static final class C7300e extends C7118a<Object> {
        public C7300e() {
            super(Integer.class, C1377b.INT, "integer");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Integer) obj).intValue());
        }

        public final void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
            serialize(obj, c5301g, aaVar);
        }
    }

    @C1387a
    public static final class C7301f extends C7118a<Object> {
        public static final C7301f f21041d = new C7301f();

        public C7301f() {
            super(Long.class, C1377b.LONG, "number");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Long) obj).longValue());
        }
    }

    @C1387a
    public static final class C7302g extends C7118a<Object> {
        public static final C7302g f21042d = new C7302g();

        public C7302g() {
            super(Short.class, C1377b.INT, "number");
        }

        public final /* bridge */ /* synthetic */ C1545o mo2917a(aa aaVar, C1446d c1446d) {
            return super.mo2917a(aaVar, c1446d);
        }

        public final /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            super.acceptJsonFormatVisitor(c5345c, c5354j);
        }

        public final /* bridge */ /* synthetic */ C6524m getSchema(aa aaVar, Type type) {
            return super.getSchema(aaVar, type);
        }

        public final void serialize(Object obj, C5301g c5301g, aa aaVar) {
            c5301g.writeNumber(((Short) obj).shortValue());
        }
    }
}
