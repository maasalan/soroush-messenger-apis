package com.p111d.p112a.p121c.p134k.p136b;

import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1545o;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5387z;
import com.p111d.p112a.p121c.C6524m;
import com.p111d.p112a.p121c.aa;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p129g.C1465a;
import com.p111d.p112a.p121c.p129g.C5345c;
import com.p111d.p112a.p121c.p131i.C1478f;
import com.p111d.p112a.p121c.p133j.C7415o;
import com.p111d.p112a.p121c.p134k.C6519i;
import com.p111d.p112a.p121c.p137l.C1513m;
import java.lang.reflect.Type;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class af {
    protected static final HashMap<String, C1545o<?>> f4657a;

    @C1387a
    public static class C6509b extends al<char[]> {
        public C6509b() {
            super(char[].class);
        }

        private static void m15691a(C5301g c5301g, char[] cArr) {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                c5301g.writeString(cArr, i, 1);
            }
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.STRING);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            C7415o createSchemaNode = createSchemaNode("array", true);
            C6524m createSchemaNode2 = createSchemaNode("string");
            createSchemaNode2.m19719a(IjkMediaMeta.IJKM_KEY_TYPE, "string");
            return createSchemaNode.m19722a("items", createSchemaNode2);
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            char[] cArr = (char[]) obj;
            if (cArr != null) {
                if (cArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            char[] cArr = (char[]) obj;
            if (aaVar.m11046a(C5387z.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                c5301g.writeStartArray(cArr.length);
                C6509b.m15691a(c5301g, cArr);
                c5301g.writeEndArray();
                return;
            }
            c5301g.writeString(cArr, 0, cArr.length);
        }

        public final /* synthetic */ void serializeWithType(Object obj, C5301g c5301g, aa aaVar, C1478f c1478f) {
            obj = (char[]) obj;
            if (aaVar.m11046a(C5387z.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                c1478f.mo2909c(obj, c5301g);
                C6509b.m15691a(c5301g, obj);
                c1478f.mo2912f(obj, c5301g);
                return;
            }
            c1478f.mo2903a(obj, c5301g);
            c5301g.writeString(obj, 0, obj.length);
            c1478f.mo2910d(obj, c5301g);
        }
    }

    @C1387a
    public static class C7287a extends C7102a<boolean[]> {
        private static final C5354j f21031a = C1513m.m3907a(Boolean.class);

        static {
            C1513m.m3909a();
        }

        public C7287a() {
            super(boolean[].class);
        }

        private C7287a(C7287a c7287a, C1446d c1446d, Boolean bool) {
            super(c7287a, c1446d, bool);
        }

        private static void m19447a(boolean[] zArr, C5301g c5301g) {
            for (boolean writeBoolean : zArr) {
                c5301g.writeBoolean(writeBoolean);
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return this;
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7287a(this, c1446d, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            C7287a.m19447a((boolean[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.BOOLEAN);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            C6524m createSchemaNode = createSchemaNode("array", true);
            createSchemaNode.m19722a("items", createSchemaNode("boolean"));
            return createSchemaNode;
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            boolean[] zArr = (boolean[]) obj;
            if (zArr != null) {
                if (zArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                C7287a.m19447a(zArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            C7287a.m19447a(zArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    @C1387a
    public static class C7288c extends C7102a<double[]> {
        private static final C5354j f21032a = C1513m.m3907a(Double.TYPE);

        static {
            C1513m.m3909a();
        }

        public C7288c() {
            super(double[].class);
        }

        private C7288c(C7288c c7288c, C1446d c1446d, Boolean bool) {
            super(c7288c, c1446d, bool);
        }

        private static void m19452a(double[] dArr, C5301g c5301g) {
            for (double writeNumber : dArr) {
                c5301g.writeNumber(writeNumber);
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return this;
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7288c(this, c1446d, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            C7288c.m19452a((double[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.NUMBER);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("array", true).m19722a("items", createSchemaNode("number"));
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            double[] dArr = (double[]) obj;
            if (dArr != null) {
                if (dArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                C7288c.m19452a(dArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            C7288c.m19452a(dArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    @C1387a
    public static class C7289e extends C7102a<int[]> {
        private static final C5354j f21033a = C1513m.m3907a(Integer.TYPE);

        static {
            C1513m.m3909a();
        }

        public C7289e() {
            super(int[].class);
        }

        private C7289e(C7289e c7289e, C1446d c1446d, Boolean bool) {
            super(c7289e, c1446d, bool);
        }

        private static void m19457a(int[] iArr, C5301g c5301g) {
            for (int writeNumber : iArr) {
                c5301g.writeNumber(writeNumber);
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return this;
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7289e(this, c1446d, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            C7289e.m19457a((int[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.INTEGER);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("array", true).m19722a("items", createSchemaNode("integer"));
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            int[] iArr = (int[]) obj;
            if (iArr != null) {
                if (iArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                C7289e.m19457a(iArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            C7289e.m19457a(iArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    protected static abstract class C7290h<T> extends C7102a<T> {
        protected final C1478f f21034a;

        protected C7290h(C7290h<T> c7290h, C1446d c1446d, C1478f c1478f, Boolean bool) {
            super(c7290h, c1446d, bool);
            this.f21034a = c1478f;
        }

        protected C7290h(Class<T> cls) {
            super(cls);
            this.f21034a = null;
        }
    }

    @C1387a
    public static class C7419d extends C7290h<float[]> {
        private static final C5354j f21546b = C1513m.m3907a(Float.TYPE);

        static {
            C1513m.m3909a();
        }

        public C7419d() {
            super(float[].class);
        }

        private C7419d(C7419d c7419d, C1446d c1446d, C1478f c1478f, Boolean bool) {
            super(c7419d, c1446d, c1478f, bool);
        }

        private void m19739a(float[] fArr, C5301g c5301g) {
            int i = 0;
            int length;
            if (this.a != null) {
                length = fArr.length;
                while (i < length) {
                    this.a.mo2904a(null, c5301g, Float.TYPE);
                    c5301g.writeNumber(fArr[i]);
                    this.a.mo2910d(null, c5301g);
                    i++;
                }
                return;
            }
            length = fArr.length;
            while (i < length) {
                c5301g.writeNumber(fArr[i]);
                i++;
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return new C7419d(this, this.c, c1478f, this.d);
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7419d(this, c1446d, this.a, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            m19739a((float[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.NUMBER);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("array", true).m19722a("items", createSchemaNode("number"));
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            float[] fArr = (float[]) obj;
            if (fArr != null) {
                if (fArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            float[] fArr = (float[]) obj;
            int length = fArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                m19739a(fArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            m19739a(fArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    @C1387a
    public static class C7420f extends C7290h<long[]> {
        private static final C5354j f21547b = C1513m.m3907a(Long.TYPE);

        static {
            C1513m.m3909a();
        }

        public C7420f() {
            super(long[].class);
        }

        private C7420f(C7420f c7420f, C1446d c1446d, C1478f c1478f, Boolean bool) {
            super(c7420f, c1446d, c1478f, bool);
        }

        private void m19744a(long[] jArr, C5301g c5301g) {
            int i = 0;
            int length;
            if (this.a != null) {
                length = jArr.length;
                while (i < length) {
                    this.a.mo2904a(null, c5301g, Long.TYPE);
                    c5301g.writeNumber(jArr[i]);
                    this.a.mo2910d(null, c5301g);
                    i++;
                }
                return;
            }
            length = jArr.length;
            while (i < length) {
                c5301g.writeNumber(jArr[i]);
                i++;
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return new C7420f(this, this.c, c1478f, this.d);
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7420f(this, c1446d, this.a, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            m19744a((long[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.NUMBER);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("array", true).m19722a("items", createSchemaNode("number", true));
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            long[] jArr = (long[]) obj;
            if (jArr != null) {
                if (jArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            long[] jArr = (long[]) obj;
            int length = jArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                m19744a(jArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            m19744a(jArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    @C1387a
    public static class C7421g extends C7290h<short[]> {
        private static final C5354j f21548b = C1513m.m3907a(Short.TYPE);

        static {
            C1513m.m3909a();
        }

        public C7421g() {
            super(short[].class);
        }

        private C7421g(C7421g c7421g, C1446d c1446d, C1478f c1478f, Boolean bool) {
            super(c7421g, c1446d, c1478f, bool);
        }

        private void m19749a(short[] sArr, C5301g c5301g) {
            int i = 0;
            int length;
            if (this.a != null) {
                length = sArr.length;
                while (i < length) {
                    this.a.mo2904a(null, c5301g, Short.TYPE);
                    c5301g.writeNumber(sArr[i]);
                    this.a.mo2910d(null, c5301g);
                    i++;
                }
                return;
            }
            length = sArr.length;
            while (i < length) {
                c5301g.writeNumber(sArr[i]);
                i++;
            }
        }

        public final C6519i<?> mo3373a(C1478f c1478f) {
            return new C7421g(this, this.c, c1478f, this.d);
        }

        public final C1545o<?> mo3541a(C1446d c1446d, Boolean bool) {
            return new C7421g(this, c1446d, this.a, bool);
        }

        public final /* bridge */ /* synthetic */ void mo3542a(Object obj, C5301g c5301g, aa aaVar) {
            m19749a((short[]) obj, c5301g);
        }

        public final void acceptJsonFormatVisitor(C5345c c5345c, C5354j c5354j) {
            visitArrayFormat(c5345c, c5354j, C1465a.INTEGER);
        }

        public final C6524m getSchema(aa aaVar, Type type) {
            return createSchemaNode("array", true).m19722a("items", createSchemaNode("integer"));
        }

        public final /* bridge */ /* synthetic */ boolean isEmpty(aa aaVar, Object obj) {
            short[] sArr = (short[]) obj;
            if (sArr != null) {
                if (sArr.length != 0) {
                    return false;
                }
            }
            return true;
        }

        public final /* synthetic */ void serialize(Object obj, C5301g c5301g, aa aaVar) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length == 1 && ((this.d == null && aaVar.m11046a(C5387z.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this.d == Boolean.TRUE)) {
                m19749a(sArr, c5301g);
                return;
            }
            c5301g.writeStartArray(length);
            m19749a(sArr, c5301g);
            c5301g.writeEndArray();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f4657a = hashMap;
        hashMap.put(boolean[].class.getName(), new C7287a());
        f4657a.put(byte[].class.getName(), new C6515f());
        f4657a.put(char[].class.getName(), new C6509b());
        f4657a.put(short[].class.getName(), new C7421g());
        f4657a.put(int[].class.getName(), new C7289e());
        f4657a.put(long[].class.getName(), new C7420f());
        f4657a.put(float[].class.getName(), new C7419d());
        f4657a.put(double[].class.getName(), new C7288c());
    }

    public static C1545o<?> m3839a(Class<?> cls) {
        return (C1545o) f4657a.get(cls.getName());
    }
}
