package com.p111d.p112a.p121c.p138m;

import com.p111d.p112a.p114b.C1341a;
import com.p111d.p112a.p114b.C1375h;
import com.p111d.p112a.p114b.C1379l;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C1384r;
import com.p111d.p112a.p114b.C1385s;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.C5301g.C1368a;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p114b.C5304n;
import com.p111d.p112a.p114b.p117d.C5294d;
import com.p111d.p112a.p114b.p117d.C5295e;
import com.p111d.p112a.p114b.p120g.C1369b;
import com.p111d.p112a.p114b.p539a.C6465c;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.p123b.C5307h;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

public class C6523u extends C5301g {
    protected static final int f17775a = C1368a.m3310a();
    protected C5304n f17776b;
    protected int f17777c;
    protected boolean f17778d;
    protected boolean f17779e;
    protected boolean f17780f;
    protected boolean f17781g;
    protected boolean f17782h;
    protected C1541b f17783i;
    protected C1541b f17784j;
    protected int f17785k;
    protected Object f17786l;
    protected Object f17787m;
    protected boolean f17788n;
    protected C5295e f17789o;

    protected static final class C1541b {
        private static final C1380m[] f4809e = new C1380m[16];
        protected C1541b f4810a;
        protected long f4811b;
        protected final Object[] f4812c = new Object[16];
        protected TreeMap<Integer, Object> f4813d;

        static {
            Object values = C1380m.values();
            System.arraycopy(values, 1, f4809e, 1, Math.min(15, values.length - 1));
        }

        private final void m4026a(int i, Object obj, Object obj2) {
            if (this.f4813d == null) {
                this.f4813d = new TreeMap();
            }
            if (obj != null) {
                this.f4813d.put(Integer.valueOf((i + i) + 1), obj);
            }
            if (obj2 != null) {
                this.f4813d.put(Integer.valueOf(i + i), obj2);
            }
        }

        private void m4027b(int i, C1380m c1380m) {
            long ordinal = (long) c1380m.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f4811b |= ordinal;
        }

        private void m4028b(int i, C1380m c1380m, Object obj) {
            this.f4812c[i] = obj;
            long ordinal = (long) c1380m.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f4811b |= ordinal;
        }

        private void m4029b(int i, C1380m c1380m, Object obj, Object obj2) {
            long ordinal = (long) c1380m.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f4811b |= ordinal;
            m4026a(i, obj, obj2);
        }

        private void m4030b(int i, C1380m c1380m, Object obj, Object obj2, Object obj3) {
            this.f4812c[i] = obj;
            long ordinal = (long) c1380m.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this.f4811b |= ordinal;
            m4026a(i, obj2, obj3);
        }

        public final C1380m m4031a(int i) {
            long j = this.f4811b;
            if (i > 0) {
                j >>= i << 2;
            }
            return f4809e[((int) j) & 15];
        }

        public final C1541b m4032a() {
            return this.f4810a;
        }

        public final C1541b m4033a(int i, C1380m c1380m) {
            if (i < 16) {
                m4027b(i, c1380m);
                return null;
            }
            this.f4810a = new C1541b();
            this.f4810a.m4027b(0, c1380m);
            return this.f4810a;
        }

        public final C1541b m4034a(int i, C1380m c1380m, Object obj) {
            if (i < 16) {
                m4028b(i, c1380m, obj);
                return null;
            }
            this.f4810a = new C1541b();
            this.f4810a.m4028b(0, c1380m, obj);
            return this.f4810a;
        }

        public final C1541b m4035a(int i, C1380m c1380m, Object obj, Object obj2) {
            if (i < 16) {
                m4029b(i, c1380m, obj, obj2);
                return null;
            }
            this.f4810a = new C1541b();
            this.f4810a.m4029b(0, c1380m, obj, obj2);
            return this.f4810a;
        }

        public final C1541b m4036a(int i, C1380m c1380m, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                m4030b(i, c1380m, obj, obj2, obj3);
                return null;
            }
            this.f4810a = new C1541b();
            this.f4810a.m4030b(0, c1380m, obj, obj2, obj3);
            return this.f4810a;
        }

        public final Object m4037b(int i) {
            return this.f4812c[i];
        }

        public final boolean m4038b() {
            return this.f4813d != null;
        }

        public final Object m4039c(int i) {
            return this.f4813d == null ? null : this.f4813d.get(Integer.valueOf((i + i) + 1));
        }

        public final Object m4040d(int i) {
            return this.f4813d == null ? null : this.f4813d.get(Integer.valueOf(i + i));
        }
    }

    protected static final class C7127a extends C6465c {
        protected C5304n f20289a;
        protected final boolean f20290b;
        protected final boolean f20291c;
        protected final boolean f20292d;
        protected C1541b f20293e;
        protected int f20294f;
        protected C5294d f20295g;
        protected boolean f20296h;
        protected transient C1369b f20297i;
        protected C1375h f20298j = null;

        public C7127a(C1541b c1541b, C5304n c5304n, boolean z, boolean z2) {
            super(0);
            this.f20293e = c1541b;
            this.f20294f = -1;
            this.f20289a = c5304n;
            this.f20295g = C5294d.m10980b(null);
            this.f20290b = z;
            this.f20291c = z2;
            this.f20292d = z | z2;
        }

        private Object m18732a() {
            return this.f20293e.m4037b(this.f20294f);
        }

        protected final void _handleEOF() {
            _throwInternal();
        }

        public final void m18733a(C1375h c1375h) {
            this.f20298j = c1375h;
        }

        public final boolean canReadObjectId() {
            return this.f20291c;
        }

        public final boolean canReadTypeId() {
            return this.f20290b;
        }

        public final void close() {
            if (!this.f20296h) {
                this.f20296h = true;
            }
        }

        public final BigInteger getBigIntegerValue() {
            Number numberValue = getNumberValue();
            return numberValue instanceof BigInteger ? (BigInteger) numberValue : getNumberType() == C1377b.BIG_DECIMAL ? ((BigDecimal) numberValue).toBigInteger() : BigInteger.valueOf(numberValue.longValue());
        }

        public final byte[] getBinaryValue(C1341a c1341a) {
            if (this._currToken == C1380m.VALUE_EMBEDDED_OBJECT) {
                Object a = m18732a();
                if (a instanceof byte[]) {
                    return (byte[]) a;
                }
            }
            if (this._currToken != C1380m.VALUE_STRING) {
                StringBuilder stringBuilder = new StringBuilder("Current token (");
                stringBuilder.append(this._currToken);
                stringBuilder.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
                throw _constructError(stringBuilder.toString());
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            C1369b c1369b = this.f20297i;
            if (c1369b == null) {
                c1369b = new C1369b('\u0000');
                this.f20297i = c1369b;
            } else {
                this.f20297i.m3318a();
            }
            _decodeBase64(text, c1369b, c1341a);
            return c1369b.m3321b();
        }

        public final C5304n getCodec() {
            return this.f20289a;
        }

        public final C1375h getCurrentLocation() {
            return this.f20298j == null ? C1375h.f4345a : this.f20298j;
        }

        public final String getCurrentName() {
            C5294d c5294d;
            if (this._currToken != C1380m.START_OBJECT) {
                if (this._currToken != C1380m.START_ARRAY) {
                    c5294d = this.f20295g;
                    return c5294d.m10989i();
                }
            }
            c5294d = this.f20295g.m10990j();
            return c5294d.m10989i();
        }

        public final BigDecimal getDecimalValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i = C15401.f4808b[getNumberType().ordinal()];
            if (i != 5) {
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        return new BigDecimal((BigInteger) numberValue);
                    default:
                        return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        public final double getDoubleValue() {
            return getNumberValue().doubleValue();
        }

        public final Object getEmbeddedObject() {
            return this._currToken == C1380m.VALUE_EMBEDDED_OBJECT ? m18732a() : null;
        }

        public final float getFloatValue() {
            return getNumberValue().floatValue();
        }

        public final int getIntValue() {
            return (this._currToken == C1380m.VALUE_NUMBER_INT ? (Number) m18732a() : getNumberValue()).intValue();
        }

        public final long getLongValue() {
            return getNumberValue().longValue();
        }

        public final C1377b getNumberType() {
            Number numberValue = getNumberValue();
            return numberValue instanceof Integer ? C1377b.INT : numberValue instanceof Long ? C1377b.LONG : numberValue instanceof Double ? C1377b.DOUBLE : numberValue instanceof BigDecimal ? C1377b.BIG_DECIMAL : numberValue instanceof BigInteger ? C1377b.BIG_INTEGER : numberValue instanceof Float ? C1377b.FLOAT : numberValue instanceof Short ? C1377b.INT : null;
        }

        public final Number getNumberValue() {
            if (this._currToken != null) {
                if (this._currToken.f4395t) {
                    Object a = m18732a();
                    if (a instanceof Number) {
                        return (Number) a;
                    }
                    if (a instanceof String) {
                        String str = (String) a;
                        return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
                    } else if (a == null) {
                        return null;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Internal error: entry should be a Number, but is of type ");
                        stringBuilder.append(a.getClass().getName());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder("Current token (");
            stringBuilder2.append(this._currToken);
            stringBuilder2.append(") not numeric, can not use numeric value accessors");
            throw _constructError(stringBuilder2.toString());
        }

        public final Object getObjectId() {
            return this.f20293e.m4039c(this.f20294f);
        }

        public final C1379l getParsingContext() {
            return this.f20295g;
        }

        public final String getText() {
            Object a;
            if (this._currToken != C1380m.VALUE_STRING) {
                if (this._currToken != C1380m.FIELD_NAME) {
                    if (this._currToken == null) {
                        return null;
                    }
                    switch (this._currToken) {
                        case VALUE_NUMBER_INT:
                        case VALUE_NUMBER_FLOAT:
                            a = m18732a();
                            return a == null ? null : a.toString();
                        default:
                            return this._currToken.f4389n;
                    }
                }
            }
            a = m18732a();
            return a instanceof String ? (String) a : a == null ? null : a.toString();
        }

        public final char[] getTextCharacters() {
            String text = getText();
            return text == null ? null : text.toCharArray();
        }

        public final int getTextLength() {
            String text = getText();
            return text == null ? 0 : text.length();
        }

        public final int getTextOffset() {
            return 0;
        }

        public final C1375h getTokenLocation() {
            return getCurrentLocation();
        }

        public final Object getTypeId() {
            return this.f20293e.m4040d(this.f20294f);
        }

        public final boolean hasTextCharacters() {
            return false;
        }

        public final boolean isClosed() {
            return this.f20296h;
        }

        public final String nextFieldName() {
            if (this.f20296h || this.f20293e == null) {
                return null;
            }
            int i = this.f20294f + 1;
            if (i >= 16 || this.f20293e.m4031a(i) != C1380m.FIELD_NAME) {
                if (nextToken() == C1380m.FIELD_NAME) {
                    return getCurrentName();
                }
                return null;
            }
            this.f20294f = i;
            Object b = this.f20293e.m4037b(i);
            String obj = b instanceof String ? (String) b : b.toString();
            this.f20295g.m10985a(obj);
            return obj;
        }

        public final C1380m nextToken() {
            if (this.f20296h || this.f20293e == null) {
                return null;
            }
            int i = this.f20294f + 1;
            this.f20294f = i;
            if (i >= 16) {
                this.f20294f = 0;
                this.f20293e = this.f20293e.m4032a();
                if (this.f20293e == null) {
                    return null;
                }
            }
            this._currToken = this.f20293e.m4031a(this.f20294f);
            if (this._currToken == C1380m.FIELD_NAME) {
                Object a = m18732a();
                this.f20295g.m10985a(a instanceof String ? (String) a : a.toString());
            } else {
                C5294d b;
                if (this._currToken == C1380m.START_OBJECT) {
                    b = this.f20295g.m10986b(-1, -1);
                } else if (this._currToken == C1380m.START_ARRAY) {
                    b = this.f20295g.m10981a(-1, -1);
                } else if (this._currToken == C1380m.END_OBJECT || this._currToken == C1380m.END_ARRAY) {
                    this.f20295g = this.f20295g.m10990j();
                    if (this.f20295g == null) {
                        b = C5294d.m10980b(null);
                    }
                }
                this.f20295g = b;
            }
            return this._currToken;
        }

        public final void overrideCurrentName(String str) {
            C5294d c5294d = this.f20295g;
            if (this._currToken == C1380m.START_OBJECT || this._currToken == C1380m.START_ARRAY) {
                c5294d = c5294d.m10990j();
            }
            try {
                c5294d.m10985a(str);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }

        public final int readBinaryValue(C1341a c1341a, OutputStream outputStream) {
            byte[] binaryValue = getBinaryValue(c1341a);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        public final void setCodec(C5304n c5304n) {
            this.f20289a = c5304n;
        }

        public final C1385s version() {
            return C5307h.f14729a;
        }
    }

    public C6523u() {
        this.f17788n = false;
        this.f17776b = null;
        this.f17777c = f17775a;
        this.f17789o = C5295e.m10995b(null);
        C1541b c1541b = new C1541b();
        this.f17784j = c1541b;
        this.f17783i = c1541b;
        this.f17785k = 0;
        this.f17779e = false;
        this.f17780f = false;
        this.f17781g = this.f17779e | this.f17780f;
    }

    public C6523u(C5303j c5303j) {
        this(c5303j, null);
    }

    public C6523u(C5303j c5303j, C5347g c5347g) {
        boolean z = false;
        this.f17788n = false;
        this.f17776b = c5303j.getCodec();
        this.f17777c = f17775a;
        this.f17789o = C5295e.m10995b(null);
        C1541b c1541b = new C1541b();
        this.f17784j = c1541b;
        this.f17783i = c1541b;
        this.f17785k = 0;
        this.f17779e = c5303j.canReadTypeId();
        this.f17780f = c5303j.canReadObjectId();
        this.f17781g = this.f17779e | this.f17780f;
        if (c5347g != null) {
            z = c5347g.m11452a(C5348h.USE_BIG_DECIMAL_FOR_FLOATS);
        }
        this.f17782h = z;
    }

    private void m15737a(C1380m c1380m) {
        C1541b a = this.f17788n ? this.f17784j.m4035a(this.f17785k, c1380m, this.f17787m, this.f17786l) : this.f17784j.m4033a(this.f17785k, c1380m);
        if (a == null) {
            this.f17785k++;
            return;
        }
        this.f17784j = a;
        this.f17785k = 1;
    }

    private void m15738a(C1380m c1380m, Object obj) {
        C1541b a;
        if (this.f17788n) {
            a = this.f17784j.m4036a(this.f17785k, c1380m, obj, this.f17787m, this.f17786l);
        } else {
            a = this.f17784j.m4034a(this.f17785k, c1380m, obj);
        }
        if (a == null) {
            this.f17785k++;
            return;
        }
        this.f17784j = a;
        this.f17785k = 1;
    }

    private final void m15739b(C5303j c5303j) {
        Object typeId = c5303j.getTypeId();
        this.f17786l = typeId;
        if (typeId != null) {
            this.f17788n = true;
        }
        Object objectId = c5303j.getObjectId();
        this.f17787m = objectId;
        if (objectId != null) {
            this.f17788n = true;
        }
    }

    private void m15740b(C1380m c1380m) {
        this.f17789o.m11006n();
        C1541b a = this.f17788n ? this.f17784j.m4035a(this.f17785k, c1380m, this.f17787m, this.f17786l) : this.f17784j.m4033a(this.f17785k, c1380m);
        if (a == null) {
            this.f17785k++;
            return;
        }
        this.f17784j = a;
        this.f17785k = 1;
    }

    private void m15741b(C1380m c1380m, Object obj) {
        C1541b a;
        this.f17789o.m11006n();
        if (this.f17788n) {
            a = this.f17784j.m4036a(this.f17785k, c1380m, obj, this.f17787m, this.f17786l);
        } else {
            a = this.f17784j.m4034a(this.f17785k, c1380m, obj);
        }
        if (a == null) {
            this.f17785k++;
            return;
        }
        this.f17784j = a;
        this.f17785k = 1;
    }

    protected void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public final C5303j m15742a() {
        return new C7127a(this.f17783i, this.f17776b, this.f17779e, this.f17780f);
    }

    public final C5303j m15743a(C5303j c5303j) {
        C5303j c7127a = new C7127a(this.f17783i, c5303j.getCodec(), this.f17779e, this.f17780f);
        c7127a.m18733a(c5303j.getTokenLocation());
        return c7127a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15744a(com.p111d.p112a.p114b.C5301g r9) {
        /*
        r8 = this;
        r0 = r8.f17783i;
        r1 = r8.f17781g;
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x0010;
    L_0x0008:
        r4 = r0.m4038b();
        if (r4 == 0) goto L_0x0010;
    L_0x000e:
        r4 = r3;
        goto L_0x0011;
    L_0x0010:
        r4 = r2;
    L_0x0011:
        r5 = -1;
    L_0x0012:
        r5 = r5 + r3;
        r6 = 16;
        if (r5 < r6) goto L_0x0029;
    L_0x0017:
        r0 = r0.m4032a();
        if (r0 == 0) goto L_0x0148;
    L_0x001d:
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r4 = r0.m4038b();
        if (r4 == 0) goto L_0x0027;
    L_0x0025:
        r4 = r3;
        goto L_0x0028;
    L_0x0027:
        r4 = r2;
    L_0x0028:
        r5 = r2;
    L_0x0029:
        r6 = r0.m4031a(r5);
        if (r6 == 0) goto L_0x0148;
    L_0x002f:
        if (r4 == 0) goto L_0x0043;
    L_0x0031:
        r7 = r0.m4039c(r5);
        if (r7 == 0) goto L_0x003a;
    L_0x0037:
        r9.writeObjectId(r7);
    L_0x003a:
        r7 = r0.m4040d(r5);
        if (r7 == 0) goto L_0x0043;
    L_0x0040:
        r9.writeTypeId(r7);
    L_0x0043:
        r7 = com.p111d.p112a.p121c.p138m.C6523u.C15401.f4807a;
        r6 = r6.ordinal();
        r6 = r7[r6];
        switch(r6) {
            case 1: goto L_0x0143;
            case 2: goto L_0x013e;
            case 3: goto L_0x0139;
            case 4: goto L_0x0134;
            case 5: goto L_0x011e;
            case 6: goto L_0x0108;
            case 7: goto L_0x00c5;
            case 8: goto L_0x0074;
            case 9: goto L_0x0070;
            case 10: goto L_0x006c;
            case 11: goto L_0x0068;
            case 12: goto L_0x0056;
            default: goto L_0x004e;
        };
    L_0x004e:
        r9 = new java.lang.RuntimeException;
        r0 = "Internal error: should never end up through this code path";
        r9.<init>(r0);
        throw r9;
    L_0x0056:
        r6 = r0.m4037b(r5);
        r7 = r6 instanceof com.p111d.p112a.p121c.p138m.C5378q;
        if (r7 == 0) goto L_0x0064;
    L_0x005e:
        r6 = (com.p111d.p112a.p121c.p138m.C5378q) r6;
        r6.m11598a(r9);
        goto L_0x0012;
    L_0x0064:
        r9.writeObject(r6);
        goto L_0x0012;
    L_0x0068:
        r9.writeNull();
        goto L_0x0012;
    L_0x006c:
        r9.writeBoolean(r2);
        goto L_0x0012;
    L_0x0070:
        r9.writeBoolean(r3);
        goto L_0x0012;
    L_0x0074:
        r6 = r0.m4037b(r5);
        r7 = r6 instanceof java.lang.Double;
        if (r7 == 0) goto L_0x0086;
    L_0x007c:
        r6 = (java.lang.Double) r6;
        r6 = r6.doubleValue();
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x0086:
        r7 = r6 instanceof java.math.BigDecimal;
        if (r7 == 0) goto L_0x0090;
    L_0x008a:
        r6 = (java.math.BigDecimal) r6;
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x0090:
        r7 = r6 instanceof java.lang.Float;
        if (r7 == 0) goto L_0x009f;
    L_0x0094:
        r6 = (java.lang.Float) r6;
        r6 = r6.floatValue();
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x009f:
        if (r6 != 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x0068;
    L_0x00a2:
        r7 = r6 instanceof java.lang.String;
        if (r7 == 0) goto L_0x00ad;
    L_0x00a6:
        r6 = (java.lang.String) r6;
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x00ad:
        r0 = new com.d.a.b.f;
        r1 = "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, can not serialize";
        r3 = new java.lang.Object[r3];
        r4 = r6.getClass();
        r4 = r4.getName();
        r3[r2] = r4;
        r1 = java.lang.String.format(r1, r3);
        r0.<init>(r1, r9);
        throw r0;
    L_0x00c5:
        r6 = r0.m4037b(r5);
        r7 = r6 instanceof java.lang.Integer;
        if (r7 == 0) goto L_0x00d8;
    L_0x00cd:
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
    L_0x00d3:
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x00d8:
        r7 = r6 instanceof java.math.BigInteger;
        if (r7 == 0) goto L_0x00e3;
    L_0x00dc:
        r6 = (java.math.BigInteger) r6;
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x00e3:
        r7 = r6 instanceof java.lang.Long;
        if (r7 == 0) goto L_0x00f2;
    L_0x00e7:
        r6 = (java.lang.Long) r6;
        r6 = r6.longValue();
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x00f2:
        r7 = r6 instanceof java.lang.Short;
        if (r7 == 0) goto L_0x0101;
    L_0x00f6:
        r6 = (java.lang.Short) r6;
        r6 = r6.shortValue();
        r9.writeNumber(r6);
        goto L_0x0012;
    L_0x0101:
        r6 = (java.lang.Number) r6;
        r6 = r6.intValue();
        goto L_0x00d3;
    L_0x0108:
        r6 = r0.m4037b(r5);
        r7 = r6 instanceof com.p111d.p112a.p114b.C1382p;
        if (r7 == 0) goto L_0x0117;
    L_0x0110:
        r6 = (com.p111d.p112a.p114b.C1382p) r6;
        r9.writeString(r6);
        goto L_0x0012;
    L_0x0117:
        r6 = (java.lang.String) r6;
        r9.writeString(r6);
        goto L_0x0012;
    L_0x011e:
        r6 = r0.m4037b(r5);
        r7 = r6 instanceof com.p111d.p112a.p114b.C1382p;
        if (r7 == 0) goto L_0x012d;
    L_0x0126:
        r6 = (com.p111d.p112a.p114b.C1382p) r6;
        r9.writeFieldName(r6);
        goto L_0x0012;
    L_0x012d:
        r6 = (java.lang.String) r6;
        r9.writeFieldName(r6);
        goto L_0x0012;
    L_0x0134:
        r9.writeEndArray();
        goto L_0x0012;
    L_0x0139:
        r9.writeStartArray();
        goto L_0x0012;
    L_0x013e:
        r9.writeEndObject();
        goto L_0x0012;
    L_0x0143:
        r9.writeStartObject();
        goto L_0x0012;
    L_0x0148:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.m.u.a(com.d.a.b.g):void");
    }

    public final C1380m m15745b() {
        return this.f17783i != null ? this.f17783i.m4031a(0) : null;
    }

    public boolean canWriteBinaryNatively() {
        return true;
    }

    public boolean canWriteObjectId() {
        return this.f17780f;
    }

    public boolean canWriteTypeId() {
        return this.f17779e;
    }

    public void close() {
        this.f17778d = true;
    }

    public void copyCurrentEvent(C5303j c5303j) {
        if (this.f17781g) {
            m15739b(c5303j);
        }
        switch (c5303j.getCurrentToken()) {
            case START_OBJECT:
                writeStartObject();
                return;
            case END_OBJECT:
                writeEndObject();
                return;
            case START_ARRAY:
                writeStartArray();
                return;
            case END_ARRAY:
                writeEndArray();
                return;
            case FIELD_NAME:
                writeFieldName(c5303j.getCurrentName());
                return;
            case VALUE_STRING:
                if (c5303j.hasTextCharacters()) {
                    writeString(c5303j.getTextCharacters(), c5303j.getTextOffset(), c5303j.getTextLength());
                    return;
                } else {
                    writeString(c5303j.getText());
                    return;
                }
            case VALUE_NUMBER_INT:
                switch (c5303j.getNumberType()) {
                    case INT:
                        writeNumber(c5303j.getIntValue());
                        return;
                    case BIG_INTEGER:
                        writeNumber(c5303j.getBigIntegerValue());
                        return;
                    default:
                        writeNumber(c5303j.getLongValue());
                        return;
                }
            case VALUE_NUMBER_FLOAT:
                if (this.f17782h) {
                    writeNumber(c5303j.getDecimalValue());
                    return;
                }
                switch (c5303j.getNumberType()) {
                    case BIG_DECIMAL:
                        writeNumber(c5303j.getDecimalValue());
                        return;
                    case FLOAT:
                        writeNumber(c5303j.getFloatValue());
                        return;
                    default:
                        writeNumber(c5303j.getDoubleValue());
                        return;
                }
            case VALUE_TRUE:
                writeBoolean(true);
                return;
            case VALUE_FALSE:
                writeBoolean(false);
                return;
            case VALUE_NULL:
                writeNull();
                return;
            case VALUE_EMBEDDED_OBJECT:
                writeObject(c5303j.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public void copyCurrentStructure(C5303j c5303j) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.FIELD_NAME) {
            if (this.f17781g) {
                m15739b(c5303j);
            }
            writeFieldName(c5303j.getCurrentName());
            currentToken = c5303j.nextToken();
        }
        if (this.f17781g) {
            m15739b(c5303j);
        }
        int i = C15401.f4807a[currentToken.ordinal()];
        if (i == 1) {
            writeStartObject();
            while (c5303j.nextToken() != C1380m.END_OBJECT) {
                copyCurrentStructure(c5303j);
            }
            writeEndObject();
        } else if (i != 3) {
            copyCurrentEvent(c5303j);
        } else {
            writeStartArray();
            while (c5303j.nextToken() != C1380m.END_ARRAY) {
                copyCurrentStructure(c5303j);
            }
            writeEndArray();
        }
    }

    public C5301g disable(C1368a c1368a) {
        this.f17777c = (c1368a.f4318k ^ -1) & this.f17777c;
        return this;
    }

    public C5301g enable(C1368a c1368a) {
        this.f17777c = c1368a.f4318k | this.f17777c;
        return this;
    }

    public void flush() {
    }

    public C5304n getCodec() {
        return this.f17776b;
    }

    public int getFeatureMask() {
        return this.f17777c;
    }

    public /* bridge */ /* synthetic */ C1379l getOutputContext() {
        return this.f17789o;
    }

    public boolean isClosed() {
        return this.f17778d;
    }

    public boolean isEnabled(C1368a c1368a) {
        return (c1368a.f4318k & this.f17777c) != 0;
    }

    public C5301g overrideStdFeatures(int i, int i2) {
        this.f17777c = (i & i2) | (getFeatureMask() & (i2 ^ -1));
        return this;
    }

    public C5301g setCodec(C5304n c5304n) {
        this.f17776b = c5304n;
        return this;
    }

    @Deprecated
    public C5301g setFeatureMask(int i) {
        this.f17777c = i;
        return this;
    }

    public String toString() {
        int i;
        C1380m nextToken;
        Object c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[TokenBuffer: ");
        C5303j a = m15742a();
        int i2 = 0;
        if (!this.f17779e) {
            if (!this.f17780f) {
                i = 0;
                while (true) {
                    nextToken = a.nextToken();
                    if (nextToken == null) {
                        break;
                    }
                    if (i != 0) {
                        try {
                            c = this.f17784j.m4039c(this.f17785k - 1);
                            if (c != null) {
                                stringBuilder.append("[objectId=");
                                stringBuilder.append(String.valueOf(c));
                                stringBuilder.append(']');
                            }
                            c = this.f17784j.m4040d(this.f17785k - 1);
                            if (c != null) {
                                stringBuilder.append("[typeId=");
                                stringBuilder.append(String.valueOf(c));
                                stringBuilder.append(']');
                            }
                        } catch (Throwable e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    if (i2 >= 100) {
                        if (i2 > 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(nextToken.toString());
                        if (nextToken == C1380m.FIELD_NAME) {
                            stringBuilder.append('(');
                            stringBuilder.append(a.getCurrentName());
                            stringBuilder.append(')');
                        }
                    }
                    i2++;
                }
                if (i2 >= 100) {
                    stringBuilder.append(" ... (truncated ");
                    stringBuilder.append(i2 - 100);
                    stringBuilder.append(" entries)");
                }
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }
        i = 1;
        while (true) {
            nextToken = a.nextToken();
            if (nextToken == null) {
                break;
            }
            if (i != 0) {
                c = this.f17784j.m4039c(this.f17785k - 1);
                if (c != null) {
                    stringBuilder.append("[objectId=");
                    stringBuilder.append(String.valueOf(c));
                    stringBuilder.append(']');
                }
                c = this.f17784j.m4040d(this.f17785k - 1);
                if (c != null) {
                    stringBuilder.append("[typeId=");
                    stringBuilder.append(String.valueOf(c));
                    stringBuilder.append(']');
                }
            }
            if (i2 >= 100) {
                if (i2 > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(nextToken.toString());
                if (nextToken == C1380m.FIELD_NAME) {
                    stringBuilder.append('(');
                    stringBuilder.append(a.getCurrentName());
                    stringBuilder.append(')');
                }
            }
            i2++;
        }
        if (i2 >= 100) {
            stringBuilder.append(" ... (truncated ");
            stringBuilder.append(i2 - 100);
            stringBuilder.append(" entries)");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public C5301g useDefaultPrettyPrinter() {
        return this;
    }

    public C1385s version() {
        return C5307h.f14729a;
    }

    public int writeBinary(C1341a c1341a, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public void writeBinary(C1341a c1341a, byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        writeObject(obj);
    }

    public void writeBoolean(boolean z) {
        m15740b(z ? C1380m.VALUE_TRUE : C1380m.VALUE_FALSE);
    }

    public final void writeEndArray() {
        m15737a(C1380m.END_ARRAY);
        C5295e k = this.f17789o.m11003k();
        if (k != null) {
            this.f17789o = k;
        }
    }

    public final void writeEndObject() {
        m15737a(C1380m.END_OBJECT);
        C5295e k = this.f17789o.m11003k();
        if (k != null) {
            this.f17789o = k;
        }
    }

    public void writeFieldName(C1382p c1382p) {
        m15738a(C1380m.FIELD_NAME, c1382p);
        this.f17789o.m10996a(c1382p.getValue());
    }

    public final void writeFieldName(String str) {
        m15738a(C1380m.FIELD_NAME, str);
        this.f17789o.m10996a(str);
    }

    public void writeNull() {
        m15740b(C1380m.VALUE_NULL);
    }

    public void writeNumber(double d) {
        m15741b(C1380m.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeNumber(float f) {
        m15741b(C1380m.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeNumber(int i) {
        m15741b(C1380m.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeNumber(long j) {
        m15741b(C1380m.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void writeNumber(String str) {
        m15741b(C1380m.VALUE_NUMBER_FLOAT, str);
    }

    public void writeNumber(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            writeNull();
        } else {
            m15741b(C1380m.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void writeNumber(BigInteger bigInteger) {
        if (bigInteger == null) {
            writeNull();
        } else {
            m15741b(C1380m.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void writeNumber(short s) {
        m15741b(C1380m.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() != byte[].class) {
            if (!(obj instanceof C5378q)) {
                if (this.f17776b == null) {
                    m15741b(C1380m.VALUE_EMBEDDED_OBJECT, obj);
                    return;
                } else {
                    this.f17776b.mo2980a((C5301g) this, obj);
                    return;
                }
            }
        }
        m15741b(C1380m.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void writeObjectId(Object obj) {
        this.f17787m = obj;
        this.f17788n = true;
    }

    public void writeRaw(char c) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(C1382p c1382p) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str) {
        m15741b(C1380m.VALUE_EMBEDDED_OBJECT, new C5378q(str));
    }

    public void writeRawValue(String str, int i, int i2) {
        if (i > 0 || i2 != str.length()) {
            str = str.substring(i, i2 + i);
        }
        m15741b(C1380m.VALUE_EMBEDDED_OBJECT, new C5378q(str));
    }

    public void writeRawValue(char[] cArr, int i, int i2) {
        m15741b(C1380m.VALUE_EMBEDDED_OBJECT, new String(cArr, i, i2));
    }

    public final void writeStartArray() {
        m15737a(C1380m.START_ARRAY);
        this.f17789o = this.f17789o.m11001i();
    }

    public final void writeStartObject() {
        m15737a(C1380m.START_OBJECT);
        this.f17789o = this.f17789o.m11002j();
    }

    public void writeString(C1382p c1382p) {
        if (c1382p == null) {
            writeNull();
        } else {
            m15741b(C1380m.VALUE_STRING, c1382p);
        }
    }

    public void writeString(String str) {
        if (str == null) {
            writeNull();
        } else {
            m15741b(C1380m.VALUE_STRING, str);
        }
    }

    public void writeString(char[] cArr, int i, int i2) {
        writeString(new String(cArr, i, i2));
    }

    public void writeTree(C1384r c1384r) {
        if (c1384r == null) {
            writeNull();
        } else if (this.f17776b == null) {
            m15741b(C1380m.VALUE_EMBEDDED_OBJECT, c1384r);
        } else {
            this.f17776b.mo2979a((C5301g) this, c1384r);
        }
    }

    public void writeTypeId(Object obj) {
        this.f17786l = obj;
        this.f17788n = true;
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }
}
