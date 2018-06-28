package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p113a.C1320j.C1316a;
import com.p111d.p112a.p113a.C1320j.C1319d;
import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p114b.C5303j.C1377b;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1529i;
import java.io.Serializable;
import java.util.Date;

public abstract class C5320x<T> extends C1507k<T> implements Serializable {
    protected static final int f14768x = (C5348h.USE_BIG_INTEGER_FOR_INTS.f14891y | C5348h.USE_LONG_FOR_INTS.f14891y);
    protected final Class<?> f14769y;

    protected C5320x(C5354j c5354j) {
        this.f14769y = c5354j == null ? null : c5354j.m11531e();
    }

    protected C5320x(Class<?> cls) {
        this.f14769y = cls;
    }

    protected static C1507k<?> m11162a(C5347g c5347g, C1446d c1446d, C1507k<?> c1507k) {
        C5308b g = c5347g.m11468g();
        if (!(g == null || c1446d == null)) {
            C5328e c = c1446d.mo1354c();
            if (c != null) {
                Object findDeserializationContentConverter = g.findDeserializationContentConverter(c);
                if (findDeserializationContentConverter != null) {
                    C1507k a;
                    c1446d.mo1354c();
                    C1529i a2 = c5347g.m3652a(findDeserializationContentConverter);
                    c5347g.mo1297b();
                    C5354j b = a2.m3991b();
                    if (c1507k == null) {
                        a = c5347g.m11437a(b, c1446d);
                    }
                    return new C6480w(a2, b, a);
                }
            }
        }
        return c1507k;
    }

    protected static Boolean m11163a(C5347g c5347g, C1446d c1446d, C1316a c1316a) {
        C1319d a = c1446d != null ? c1446d.mo1349a(c5347g.m11460c()) : c5347g.m11467f();
        return a != null ? a.m3114a(c1316a) : null;
    }

    protected static void m11164a(C5303j c5303j, C5347g c5347g, String str) {
        throw c5347g.m11446a("Can not coerce a floating-point value ('%s') into %s; enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow", c5303j.getValueAsString(), str);
    }

    private static boolean m11165a(C5303j c5303j) {
        if (c5303j.getNumberType() == C1377b.LONG) {
            return (c5303j.getLongValue() == 0 ? Boolean.FALSE : Boolean.TRUE).booleanValue();
        }
        Boolean bool;
        String text = c5303j.getText();
        if (!"0.0".equals(text)) {
            if (!"0".equals(text)) {
                bool = Boolean.TRUE;
                return bool.booleanValue();
            }
        }
        bool = Boolean.FALSE;
        return bool.booleanValue();
    }

    protected static boolean m11166b(String str) {
        if (!"-Infinity".equals(str)) {
            if (!"-INF".equals(str)) {
                return false;
            }
        }
        return true;
    }

    protected static boolean m11167c(String str) {
        if (!"Infinity".equals(str)) {
            if (!"INF".equals(str)) {
                return false;
            }
        }
        return true;
    }

    private static double m11168d(String str) {
        return "2.2250738585072012e-308".equals(str) ? Double.MIN_NORMAL : Double.parseDouble(str);
    }

    protected static Object m11169z(C5303j c5303j, C5347g c5347g) {
        int j = c5347g.m11471j();
        return C5348h.USE_BIG_INTEGER_FOR_INTS.m11480a(j) ? c5303j.getBigIntegerValue() : C5348h.USE_LONG_FOR_INTS.m11480a(j) ? Long.valueOf(c5303j.getLongValue()) : c5303j.getBigIntegerValue();
    }

    public Class<?> mo1307a() {
        return this.f14769y;
    }

    public Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2899d(c5303j, c5347g);
    }

    protected Date mo3345b(C5303j c5303j, C5347g c5347g) {
        IllegalArgumentException e;
        Class cls;
        StringBuilder stringBuilder;
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.VALUE_NUMBER_INT) {
            return new Date(c5303j.getLongValue());
        }
        if (currentToken == C1380m.VALUE_NULL) {
            return (Date) mo2803a(c5347g);
        }
        if (currentToken == C1380m.VALUE_STRING) {
            String trim;
            try {
                trim = c5303j.getText().trim();
                try {
                    return trim.length() == 0 ? (Date) mo3346b(c5347g) : "null".equals(trim) ? (Date) mo2803a(c5347g) : c5347g.m11459b(trim);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    cls = this.f14769y;
                    stringBuilder = new StringBuilder("not a valid representation (error: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(")");
                    throw c5347g.m11445a(trim, cls, stringBuilder.toString());
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                trim = null;
                cls = this.f14769y;
                stringBuilder = new StringBuilder("not a valid representation (error: ");
                stringBuilder.append(e.getMessage());
                stringBuilder.append(")");
                throw c5347g.m11445a(trim, cls, stringBuilder.toString());
            }
        } else if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            c5303j.nextToken();
            Date b = mo3345b(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return b;
            }
            throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'java.util.Date' value but there was more than a single value in the array");
        } else {
            throw c5347g.m11440a(this.f14769y, currentToken);
        }
    }

    public void mo2807b(C5303j c5303j, C5347g c5347g, Object obj, String str) {
        if (obj == null) {
            obj = mo1307a();
        }
        c5347g.m11478q();
        c5347g.m11450a(obj, str, (C1507k) this);
        c5303j.skipChildren();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final boolean m11174k(com.p111d.p112a.p114b.C5303j r5, com.p111d.p112a.p121c.C5347g r6) {
        /*
        r4 = this;
        r0 = r5.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_TRUE;
        r2 = 1;
        if (r0 != r1) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_FALSE;
        r3 = 0;
        if (r0 != r1) goto L_0x0010;
    L_0x000f:
        return r3;
    L_0x0010:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x0015;
    L_0x0014:
        return r3;
    L_0x0015:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 != r1) goto L_0x002e;
    L_0x0019:
        r6 = r5.getNumberType();
        r0 = com.p111d.p112a.p114b.C5303j.C1377b.INT;
        if (r6 != r0) goto L_0x0029;
    L_0x0021:
        r5 = r5.getIntValue();
        if (r5 == 0) goto L_0x0028;
    L_0x0027:
        return r2;
    L_0x0028:
        return r3;
    L_0x0029:
        r5 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11165a(r5);
        return r5;
    L_0x002e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 != r1) goto L_0x0076;
    L_0x0032:
        r5 = r5.getText();
        r5 = r5.trim();
        r0 = "true";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0075;
    L_0x0042:
        r0 = "True";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x004b;
    L_0x004a:
        return r2;
    L_0x004b:
        r0 = "false";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0074;
    L_0x0053:
        r0 = "False";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x0074;
    L_0x005b:
        r0 = r5.length();
        if (r0 != 0) goto L_0x0062;
    L_0x0061:
        return r3;
    L_0x0062:
        r0 = "null";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x006b;
    L_0x006a:
        return r3;
    L_0x006b:
        r0 = r4.f14769y;
        r1 = "only \"true\" or \"false\" recognized";
        r5 = r6.m11445a(r5, r0, r1);
        throw r5;
    L_0x0074:
        return r3;
    L_0x0075:
        return r2;
    L_0x0076:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x009b;
    L_0x007a:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r6.m11452a(r1);
        if (r1 == 0) goto L_0x009b;
    L_0x0082:
        r5.nextToken();
        r6 = r4.m11174k(r5, r6);
        r0 = r5.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x009a;
    L_0x0091:
        r6 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'boolean' value but there was more than a single value in the array";
        r5 = com.p111d.p112a.p121c.C5347g.m11430a(r5, r6, r0);
        throw r5;
    L_0x009a:
        return r6;
    L_0x009b:
        r5 = r4.f14769y;
        r5 = r6.m11440a(r5, r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.k(com.d.a.b.j, com.d.a.c.g):boolean");
    }

    protected final Boolean m11175l(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (currentToken == C1380m.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (currentToken == C1380m.VALUE_NUMBER_INT) {
            return c5303j.getNumberType() == C1377b.INT ? c5303j.getIntValue() == 0 ? Boolean.FALSE : Boolean.TRUE : Boolean.valueOf(C5320x.m11165a(c5303j));
        } else {
            if (currentToken == C1380m.VALUE_NULL) {
                return (Boolean) mo2803a(c5347g);
            }
            if (currentToken == C1380m.VALUE_STRING) {
                String trim = c5303j.getText().trim();
                if (!"true".equals(trim)) {
                    if (!"True".equals(trim)) {
                        if (!"false".equals(trim)) {
                            if (!"False".equals(trim)) {
                                if (trim.length() == 0) {
                                    return (Boolean) mo3346b(c5347g);
                                }
                                if ("null".equals(trim)) {
                                    return (Boolean) mo2803a(c5347g);
                                }
                                throw c5347g.m11445a(trim, this.f14769y, "only \"true\" or \"false\" recognized");
                            }
                        }
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            } else if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                c5303j.nextToken();
                Boolean l = m11175l(c5303j, c5347g);
                if (c5303j.nextToken() == C1380m.END_ARRAY) {
                    return l;
                }
                throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array");
            } else {
                throw c5347g.m11440a(this.f14769y, currentToken);
            }
        }
    }

    protected final java.lang.Byte m11176m(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 != r1) goto L_0x0011;
    L_0x0008:
        r3 = r3.getByteValue();
        r3 = java.lang.Byte.valueOf(r3);
        return r3;
    L_0x0011:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 != r1) goto L_0x005e;
    L_0x0015:
        r3 = r3.getText();
        r3 = r3.trim();
        r0 = "null";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Byte) r3;
        return r3;
    L_0x002c:
        r0 = r3.length();	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r0 != 0) goto L_0x0039;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0032:
        r0 = r2.mo3346b(r4);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = (java.lang.Byte) r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0039:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3223a(r3);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        if (r0 < r1) goto L_0x004c;
    L_0x0041:
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 <= r1) goto L_0x0046;
    L_0x0045:
        goto L_0x004c;
    L_0x0046:
        r3 = (byte) r0;
        r3 = java.lang.Byte.valueOf(r3);
        return r3;
    L_0x004c:
        r0 = r2.f14769y;
        r1 = "overflow, value can not be represented as 8-bit value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x0055:
        r0 = r2.f14769y;
        r1 = "not a valid Byte value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x005e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x0078;
    L_0x0062:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r4.m11452a(r0);
        if (r0 != 0) goto L_0x006f;
    L_0x006a:
        r0 = "Byte";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r3, r4, r0);
    L_0x006f:
        r3 = r3.getByteValue();
        r3 = java.lang.Byte.valueOf(r3);
        return r3;
    L_0x0078:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x0083;
    L_0x007c:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Byte) r3;
        return r3;
    L_0x0083:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x00a8;
    L_0x0087:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r4.m11452a(r1);
        if (r1 == 0) goto L_0x00a8;
    L_0x008f:
        r3.nextToken();
        r4 = r2.m11176m(r3, r4);
        r0 = r3.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00a7;
    L_0x009e:
        r4 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array";
        r3 = com.p111d.p112a.p121c.C5347g.m11430a(r3, r4, r0);
        throw r3;
    L_0x00a7:
        return r4;
    L_0x00a8:
        r3 = r2.f14769y;
        r3 = r4.m11440a(r3, r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.m(com.d.a.b.j, com.d.a.c.g):java.lang.Byte");
    }

    protected final java.lang.Short m11177n(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 != r1) goto L_0x0011;
    L_0x0008:
        r3 = r3.getShortValue();
        r3 = java.lang.Short.valueOf(r3);
        return r3;
    L_0x0011:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 != r1) goto L_0x005e;
    L_0x0015:
        r3 = r3.getText();
        r3 = r3.trim();
        r0 = r3.length();	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r0 != 0) goto L_0x002a;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0023:
        r0 = r2.mo3346b(r4);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = (java.lang.Short) r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x002a:
        r0 = "null";	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = r0.equals(r3);	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0032:
        r0 = r2.mo2803a(r4);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = (java.lang.Short) r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0039:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3223a(r3);	 Catch:{ IllegalArgumentException -> 0x0055 }
        r1 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r0 < r1) goto L_0x004c;
    L_0x0041:
        r1 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r0 <= r1) goto L_0x0046;
    L_0x0045:
        goto L_0x004c;
    L_0x0046:
        r3 = (short) r0;
        r3 = java.lang.Short.valueOf(r3);
        return r3;
    L_0x004c:
        r0 = r2.f14769y;
        r1 = "overflow, value can not be represented as 16-bit value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x0055:
        r0 = r2.f14769y;
        r1 = "not a valid Short value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x005e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x0078;
    L_0x0062:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r4.m11452a(r0);
        if (r0 != 0) goto L_0x006f;
    L_0x006a:
        r0 = "Short";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r3, r4, r0);
    L_0x006f:
        r3 = r3.getShortValue();
        r3 = java.lang.Short.valueOf(r3);
        return r3;
    L_0x0078:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x0083;
    L_0x007c:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Short) r3;
        return r3;
    L_0x0083:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x00a8;
    L_0x0087:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r4.m11452a(r1);
        if (r1 == 0) goto L_0x00a8;
    L_0x008f:
        r3.nextToken();
        r4 = r2.m11177n(r3, r4);
        r0 = r3.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00a7;
    L_0x009e:
        r4 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Short' value but there was more than a single value in the array";
        r3 = com.p111d.p112a.p121c.C5347g.m11430a(r3, r4, r0);
        throw r3;
    L_0x00a7:
        return r4;
    L_0x00a8:
        r3 = r2.f14769y;
        r3 = r4.m11440a(r3, r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.n(com.d.a.b.j, com.d.a.c.g):java.lang.Short");
    }

    protected final short m11178o(C5303j c5303j, C5347g c5347g) {
        int p = m11179p(c5303j, c5347g);
        if (p >= -32768) {
            if (p <= 32767) {
                return (short) p;
            }
        }
        throw c5347g.m11445a(String.valueOf(p), this.f14769y, "overflow, value can not be represented as 16-bit value");
    }

    protected final int m11179p(com.p111d.p112a.p114b.C5303j r6, com.p111d.p112a.p121c.C5347g r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        r0 = r6.hasToken(r0);
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r6 = r6.getIntValue();
        return r6;
    L_0x000d:
        r0 = r6.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        r2 = 0;
        if (r0 != r1) goto L_0x006f;
    L_0x0016:
        r6 = r6.getText();
        r6 = r6.trim();
        r0 = "null";
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        return r2;
    L_0x0027:
        r0 = r6.length();	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1 = 9;	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r0 <= r1) goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x002f:
        r0 = java.lang.Long.parseLong(r6);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r4 < 0) goto L_0x0044;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x003a:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0066 }
        if (r4 <= 0) goto L_0x0042;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0041:
        goto L_0x0044;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0042:
        r6 = (int) r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
        return r6;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0044:
        r0 = r5.f14769y;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = "Overflow: numeric value (";	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r2 = ") out of range of int (-2147483648 - 2147483647)";	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0066 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0066 }
        r0 = r7.m11445a(r6, r0, r1);	 Catch:{ IllegalArgumentException -> 0x0066 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x005e:
        if (r0 != 0) goto L_0x0061;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0060:
        return r2;	 Catch:{ IllegalArgumentException -> 0x0066 }
    L_0x0061:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3223a(r6);	 Catch:{ IllegalArgumentException -> 0x0066 }
        return r0;
    L_0x0066:
        r0 = r5.f14769y;
        r1 = "not a valid int value";
        r6 = r7.m11445a(r6, r0, r1);
        throw r6;
    L_0x006f:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x0085;
    L_0x0073:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r7.m11452a(r0);
        if (r0 != 0) goto L_0x0080;
    L_0x007b:
        r0 = "int";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r6, r7, r0);
    L_0x0080:
        r6 = r6.getValueAsInt();
        return r6;
    L_0x0085:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x008a;
    L_0x0089:
        return r2;
    L_0x008a:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x00af;
    L_0x008e:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r7.m11452a(r1);
        if (r1 == 0) goto L_0x00af;
    L_0x0096:
        r6.nextToken();
        r7 = r5.m11179p(r6, r7);
        r0 = r6.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00ae;
    L_0x00a5:
        r7 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'int' value but there was more than a single value in the array";
        r6 = com.p111d.p112a.p121c.C5347g.m11430a(r6, r7, r0);
        throw r6;
    L_0x00ae:
        return r7;
    L_0x00af:
        r6 = r5.f14769y;
        r6 = r7.m11440a(r6, r0);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.p(com.d.a.b.j, com.d.a.c.g):int");
    }

    protected final java.lang.Integer m11180q(com.p111d.p112a.p114b.C5303j r6, com.p111d.p112a.p121c.C5347g r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r6.getCurrentTokenId();
        r1 = 3;
        if (r0 == r1) goto L_0x00a3;
    L_0x0007:
        r1 = 11;
        if (r0 == r1) goto L_0x009c;
    L_0x000b:
        switch(r0) {
            case 6: goto L_0x002f;
            case 7: goto L_0x0026;
            case 8: goto L_0x0010;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x00c4;
    L_0x0010:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r7.m11452a(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r0 = "Integer";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r6, r7, r0);
    L_0x001d:
        r6 = r6.getValueAsInt();
        r6 = java.lang.Integer.valueOf(r6);
        return r6;
    L_0x0026:
        r6 = r6.getIntValue();
        r6 = java.lang.Integer.valueOf(r6);
        return r6;
    L_0x002f:
        r6 = r6.getText();
        r6 = r6.trim();
        r0 = r6.length();	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1 = "null";	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1 = r1.equals(r6);	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r1 == 0) goto L_0x004a;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0043:
        r0 = r5.mo2803a(r7);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x004a:
        r1 = 9;	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r0 <= r1) goto L_0x0081;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x004e:
        r0 = java.lang.Long.parseLong(r6);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r4 < 0) goto L_0x0067;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0059:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ IllegalArgumentException -> 0x0093 }
        if (r4 <= 0) goto L_0x0061;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0060:
        goto L_0x0067;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0061:
        r0 = (int) r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0093 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0067:
        r0 = r5.f14769y;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0093 }
        r2 = "Overflow: numeric value (";	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r2 = ") out of range of Integer (-2147483648 - 2147483647)";	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0 = r7.m11445a(r6, r0, r1);	 Catch:{ IllegalArgumentException -> 0x0093 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0081:
        if (r0 != 0) goto L_0x008a;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x0083:
        r0 = r5.mo3346b(r7);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
        return r0;	 Catch:{ IllegalArgumentException -> 0x0093 }
    L_0x008a:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3223a(r6);	 Catch:{ IllegalArgumentException -> 0x0093 }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0093 }
        return r0;
    L_0x0093:
        r0 = r5.f14769y;
        r1 = "not a valid Integer value";
        r6 = r7.m11445a(r6, r0, r1);
        throw r6;
    L_0x009c:
        r6 = r5.mo2803a(r7);
        r6 = (java.lang.Integer) r6;
        return r6;
    L_0x00a3:
        r0 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r0 = r7.m11452a(r0);
        if (r0 == 0) goto L_0x00c4;
    L_0x00ab:
        r6.nextToken();
        r7 = r5.m11180q(r6, r7);
        r0 = r6.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00c3;
    L_0x00ba:
        r7 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Integer' value but there was more than a single value in the array";
        r6 = com.p111d.p112a.p121c.C5347g.m11430a(r6, r7, r0);
        throw r6;
    L_0x00c3:
        return r7;
    L_0x00c4:
        r0 = r5.f14769y;
        r6 = r6.getCurrentToken();
        r6 = r7.m11440a(r0, r6);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.q(com.d.a.b.j, com.d.a.c.g):java.lang.Integer");
    }

    protected final java.lang.Long m11181r(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getCurrentTokenId();
        r1 = 3;
        if (r0 == r1) goto L_0x006c;
    L_0x0007:
        r1 = 11;
        if (r0 == r1) goto L_0x0065;
    L_0x000b:
        switch(r0) {
            case 6: goto L_0x002f;
            case 7: goto L_0x0026;
            case 8: goto L_0x0010;
            default: goto L_0x000e;
        };
    L_0x000e:
        goto L_0x008d;
    L_0x0010:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r4.m11452a(r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0018:
        r0 = "Long";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r3, r4, r0);
    L_0x001d:
        r3 = r3.getValueAsLong();
        r3 = java.lang.Long.valueOf(r3);
        return r3;
    L_0x0026:
        r3 = r3.getLongValue();
        r3 = java.lang.Long.valueOf(r3);
        return r3;
    L_0x002f:
        r3 = r3.getText();
        r3 = r3.trim();
        r0 = r3.length();
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r3 = r2.mo3346b(r4);
        r3 = (java.lang.Long) r3;
        return r3;
    L_0x0044:
        r0 = "null";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0053;
    L_0x004c:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Long) r3;
        return r3;
    L_0x0053:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3229b(r3);	 Catch:{ IllegalArgumentException -> 0x005c }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x005c }
        return r0;
    L_0x005c:
        r0 = r2.f14769y;
        r1 = "not a valid Long value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x0065:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Long) r3;
        return r3;
    L_0x006c:
        r0 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r0 = r4.m11452a(r0);
        if (r0 == 0) goto L_0x008d;
    L_0x0074:
        r3.nextToken();
        r4 = r2.m11181r(r3, r4);
        r0 = r3.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x008c;
    L_0x0083:
        r4 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Long' value but there was more than a single value in the array";
        r3 = com.p111d.p112a.p121c.C5347g.m11430a(r3, r4, r0);
        throw r3;
    L_0x008c:
        return r4;
    L_0x008d:
        r0 = r2.f14769y;
        r3 = r3.getCurrentToken();
        r3 = r4.m11440a(r0, r3);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.r(com.d.a.b.j, com.d.a.c.g):java.lang.Long");
    }

    protected final long m11182s(com.p111d.p112a.p114b.C5303j r5, com.p111d.p112a.p121c.C5347g r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getCurrentTokenId();
        r1 = 3;
        if (r0 == r1) goto L_0x004e;
    L_0x0007:
        r1 = 11;
        r2 = 0;
        if (r0 == r1) goto L_0x004d;
    L_0x000d:
        switch(r0) {
            case 6: goto L_0x0028;
            case 7: goto L_0x0023;
            case 8: goto L_0x0011;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x006f;
    L_0x0011:
        r0 = com.p111d.p112a.p121c.C5348h.ACCEPT_FLOAT_AS_INT;
        r0 = r6.m11452a(r0);
        if (r0 != 0) goto L_0x001e;
    L_0x0019:
        r0 = "long";
        com.p111d.p112a.p121c.p124c.p126b.C5320x.m11164a(r5, r6, r0);
    L_0x001e:
        r5 = r5.getValueAsLong();
        return r5;
    L_0x0023:
        r5 = r5.getLongValue();
        return r5;
    L_0x0028:
        r5 = r5.getText();
        r5 = r5.trim();
        r0 = r5.length();
        if (r0 == 0) goto L_0x004d;
    L_0x0036:
        r0 = "null";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x003f;
    L_0x003e:
        return r2;
    L_0x003f:
        r0 = com.p111d.p112a.p114b.p116c.C1351g.m3229b(r5);	 Catch:{ IllegalArgumentException -> 0x0044 }
        return r0;
    L_0x0044:
        r0 = r4.f14769y;
        r1 = "not a valid long value";
        r5 = r6.m11445a(r5, r0, r1);
        throw r5;
    L_0x004d:
        return r2;
    L_0x004e:
        r0 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r0 = r6.m11452a(r0);
        if (r0 == 0) goto L_0x006f;
    L_0x0056:
        r5.nextToken();
        r0 = r4.m11182s(r5, r6);
        r6 = r5.nextToken();
        r2 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r6 == r2) goto L_0x006e;
    L_0x0065:
        r6 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'long' value but there was more than a single value in the array";
        r5 = com.p111d.p112a.p121c.C5347g.m11430a(r5, r6, r0);
        throw r5;
    L_0x006e:
        return r0;
    L_0x006f:
        r0 = r4.f14769y;
        r5 = r5.getCurrentToken();
        r5 = r6.m11440a(r0, r5);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.s(com.d.a.b.j, com.d.a.c.g):long");
    }

    protected final java.lang.Float m11183t(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 == r1) goto L_0x00ba;
    L_0x0008:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x000e;
    L_0x000c:
        goto L_0x00ba;
    L_0x000e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 != r1) goto L_0x0083;
    L_0x0012:
        r3 = r3.getText();
        r3 = r3.trim();
        r0 = r3.length();
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r3 = r2.mo3346b(r4);
        r3 = (java.lang.Float) r3;
        return r3;
    L_0x0027:
        r0 = "null";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0036;
    L_0x002f:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Float) r3;
        return r3;
    L_0x0036:
        r0 = 0;
        r0 = r3.charAt(r0);
        r1 = 45;
        if (r0 == r1) goto L_0x0064;
    L_0x003f:
        r1 = 73;
        if (r0 == r1) goto L_0x0057;
    L_0x0043:
        r1 = 78;
        if (r0 == r1) goto L_0x0048;
    L_0x0047:
        goto L_0x0071;
    L_0x0048:
        r0 = "NaN";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x0050:
        r3 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r3 = java.lang.Float.valueOf(r3);
        return r3;
    L_0x0057:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11167c(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x005d:
        r3 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        r3 = java.lang.Float.valueOf(r3);
        return r3;
    L_0x0064:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11166b(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x006a:
        r3 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        r3 = java.lang.Float.valueOf(r3);
        return r3;
    L_0x0071:
        r0 = java.lang.Float.parseFloat(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r0 = java.lang.Float.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x007a }
        return r0;
    L_0x007a:
        r0 = r2.f14769y;
        r1 = "not a valid Float value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x0083:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x008e;
    L_0x0087:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Float) r3;
        return r3;
    L_0x008e:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x00b3;
    L_0x0092:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r4.m11452a(r1);
        if (r1 == 0) goto L_0x00b3;
    L_0x009a:
        r3.nextToken();
        r4 = r2.m11183t(r3, r4);
        r0 = r3.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00b2;
    L_0x00a9:
        r4 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array";
        r3 = com.p111d.p112a.p121c.C5347g.m11430a(r3, r4, r0);
        throw r3;
    L_0x00b2:
        return r4;
    L_0x00b3:
        r3 = r2.f14769y;
        r3 = r4.m11440a(r3, r0);
        throw r3;
    L_0x00ba:
        r3 = r3.getFloatValue();
        r3 = java.lang.Float.valueOf(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.t(com.d.a.b.j, com.d.a.c.g):java.lang.Float");
    }

    protected final float m11184u(com.p111d.p112a.p114b.C5303j r4, com.p111d.p112a.p121c.C5347g r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r4.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 == r1) goto L_0x0099;
    L_0x0008:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x000e;
    L_0x000c:
        goto L_0x0099;
    L_0x000e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        r2 = 0;
        if (r0 != r1) goto L_0x0068;
    L_0x0013:
        r4 = r4.getText();
        r4 = r4.trim();
        r0 = r4.length();
        if (r0 == 0) goto L_0x0067;
    L_0x0021:
        r0 = "null";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        return r2;
    L_0x002a:
        r0 = 0;
        r0 = r4.charAt(r0);
        r1 = 45;
        if (r0 == r1) goto L_0x0050;
    L_0x0033:
        r1 = 73;
        if (r0 == r1) goto L_0x0047;
    L_0x0037:
        r1 = 78;
        if (r0 == r1) goto L_0x003c;
    L_0x003b:
        goto L_0x0059;
    L_0x003c:
        r0 = "NaN";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0059;
    L_0x0044:
        r4 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        return r4;
    L_0x0047:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11167c(r4);
        if (r0 == 0) goto L_0x0059;
    L_0x004d:
        r4 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        return r4;
    L_0x0050:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11166b(r4);
        if (r0 == 0) goto L_0x0059;
    L_0x0056:
        r4 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        return r4;
    L_0x0059:
        r0 = java.lang.Float.parseFloat(r4);	 Catch:{ IllegalArgumentException -> 0x005e }
        return r0;
    L_0x005e:
        r0 = r3.f14769y;
        r1 = "not a valid float value";
        r4 = r5.m11445a(r4, r0, r1);
        throw r4;
    L_0x0067:
        return r2;
    L_0x0068:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x006d;
    L_0x006c:
        return r2;
    L_0x006d:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x0092;
    L_0x0071:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r5.m11452a(r1);
        if (r1 == 0) goto L_0x0092;
    L_0x0079:
        r4.nextToken();
        r5 = r3.m11184u(r4, r5);
        r0 = r4.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x0091;
    L_0x0088:
        r5 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'float' value but there was more than a single value in the array";
        r4 = com.p111d.p112a.p121c.C5347g.m11430a(r4, r5, r0);
        throw r4;
    L_0x0091:
        return r5;
    L_0x0092:
        r4 = r3.f14769y;
        r4 = r5.m11440a(r4, r0);
        throw r4;
    L_0x0099:
        r4 = r4.getFloatValue();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.u(com.d.a.b.j, com.d.a.c.g):float");
    }

    protected final java.lang.Double m11185v(com.p111d.p112a.p114b.C5303j r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r3.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 == r1) goto L_0x00ba;
    L_0x0008:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x000e;
    L_0x000c:
        goto L_0x00ba;
    L_0x000e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        if (r0 != r1) goto L_0x0083;
    L_0x0012:
        r3 = r3.getText();
        r3 = r3.trim();
        r0 = r3.length();
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r3 = r2.mo3346b(r4);
        r3 = (java.lang.Double) r3;
        return r3;
    L_0x0027:
        r0 = "null";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0036;
    L_0x002f:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Double) r3;
        return r3;
    L_0x0036:
        r0 = 0;
        r0 = r3.charAt(r0);
        r1 = 45;
        if (r0 == r1) goto L_0x0064;
    L_0x003f:
        r1 = 73;
        if (r0 == r1) goto L_0x0057;
    L_0x0043:
        r1 = 78;
        if (r0 == r1) goto L_0x0048;
    L_0x0047:
        goto L_0x0071;
    L_0x0048:
        r0 = "NaN";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x0050:
        r3 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        r3 = java.lang.Double.valueOf(r3);
        return r3;
    L_0x0057:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11167c(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x005d:
        r3 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        r3 = java.lang.Double.valueOf(r3);
        return r3;
    L_0x0064:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11166b(r3);
        if (r0 == 0) goto L_0x0071;
    L_0x006a:
        r3 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
        r3 = java.lang.Double.valueOf(r3);
        return r3;
    L_0x0071:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11168d(r3);	 Catch:{ IllegalArgumentException -> 0x007a }
        r0 = java.lang.Double.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x007a }
        return r0;
    L_0x007a:
        r0 = r2.f14769y;
        r1 = "not a valid Double value";
        r3 = r4.m11445a(r3, r0, r1);
        throw r3;
    L_0x0083:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x008e;
    L_0x0087:
        r3 = r2.mo2803a(r4);
        r3 = (java.lang.Double) r3;
        return r3;
    L_0x008e:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x00b3;
    L_0x0092:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r4.m11452a(r1);
        if (r1 == 0) goto L_0x00b3;
    L_0x009a:
        r3.nextToken();
        r4 = r2.m11185v(r3, r4);
        r0 = r3.nextToken();
        r1 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r0 == r1) goto L_0x00b2;
    L_0x00a9:
        r4 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Double' value but there was more than a single value in the array";
        r3 = com.p111d.p112a.p121c.C5347g.m11430a(r3, r4, r0);
        throw r3;
    L_0x00b2:
        return r4;
    L_0x00b3:
        r3 = r2.f14769y;
        r3 = r4.m11440a(r3, r0);
        throw r3;
    L_0x00ba:
        r3 = r3.getDoubleValue();
        r3 = java.lang.Double.valueOf(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.v(com.d.a.b.j, com.d.a.c.g):java.lang.Double");
    }

    protected final double m11186w(com.p111d.p112a.p114b.C5303j r5, com.p111d.p112a.p121c.C5347g r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r5.getCurrentToken();
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_INT;
        if (r0 == r1) goto L_0x009a;
    L_0x0008:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NUMBER_FLOAT;
        if (r0 != r1) goto L_0x000e;
    L_0x000c:
        goto L_0x009a;
    L_0x000e:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_STRING;
        r2 = 0;
        if (r0 != r1) goto L_0x0069;
    L_0x0014:
        r5 = r5.getText();
        r5 = r5.trim();
        r0 = r5.length();
        if (r0 == 0) goto L_0x0068;
    L_0x0022:
        r0 = "null";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x002b;
    L_0x002a:
        return r2;
    L_0x002b:
        r0 = 0;
        r0 = r5.charAt(r0);
        r1 = 45;
        if (r0 == r1) goto L_0x0051;
    L_0x0034:
        r1 = 73;
        if (r0 == r1) goto L_0x0048;
    L_0x0038:
        r1 = 78;
        if (r0 == r1) goto L_0x003d;
    L_0x003c:
        goto L_0x005a;
    L_0x003d:
        r0 = "NaN";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x005a;
    L_0x0045:
        r5 = 9221120237041090560; // 0x7ff8000000000000 float:0.0 double:NaN;
        return r5;
    L_0x0048:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11167c(r5);
        if (r0 == 0) goto L_0x005a;
    L_0x004e:
        r5 = 9218868437227405312; // 0x7ff0000000000000 float:0.0 double:Infinity;
        return r5;
    L_0x0051:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11166b(r5);
        if (r0 == 0) goto L_0x005a;
    L_0x0057:
        r5 = -4503599627370496; // 0xfff0000000000000 float:0.0 double:-Infinity;
        return r5;
    L_0x005a:
        r0 = com.p111d.p112a.p121c.p124c.p126b.C5320x.m11168d(r5);	 Catch:{ IllegalArgumentException -> 0x005f }
        return r0;
    L_0x005f:
        r0 = r4.f14769y;
        r1 = "not a valid double value";
        r5 = r6.m11445a(r5, r0, r1);
        throw r5;
    L_0x0068:
        return r2;
    L_0x0069:
        r1 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;
        if (r0 != r1) goto L_0x006e;
    L_0x006d:
        return r2;
    L_0x006e:
        r1 = com.p111d.p112a.p114b.C1380m.START_ARRAY;
        if (r0 != r1) goto L_0x0093;
    L_0x0072:
        r1 = com.p111d.p112a.p121c.C5348h.UNWRAP_SINGLE_VALUE_ARRAYS;
        r1 = r6.m11452a(r1);
        if (r1 == 0) goto L_0x0093;
    L_0x007a:
        r5.nextToken();
        r0 = r4.m11186w(r5, r6);
        r6 = r5.nextToken();
        r2 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        if (r6 == r2) goto L_0x0092;
    L_0x0089:
        r6 = com.p111d.p112a.p114b.C1380m.END_ARRAY;
        r0 = "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array";
        r5 = com.p111d.p112a.p121c.C5347g.m11430a(r5, r6, r0);
        throw r5;
    L_0x0092:
        return r0;
    L_0x0093:
        r5 = r4.f14769y;
        r5 = r6.m11440a(r5, r0);
        throw r5;
    L_0x009a:
        r5 = r5.getDoubleValue();
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.x.w(com.d.a.b.j, com.d.a.c.g):double");
    }

    protected final String m11187x(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.VALUE_STRING) {
            return c5303j.getText();
        }
        if (currentToken == C1380m.START_ARRAY && c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            c5303j.nextToken();
            String x = m11187x(c5303j, c5347g);
            if (c5303j.nextToken() == C1380m.END_ARRAY) {
                return x;
            }
            throw C5347g.m11430a(c5303j, C1380m.END_ARRAY, "Attempted to unwrap single value array for single 'String' value but there was more than a single value in the array");
        }
        String valueAsString = c5303j.getValueAsString();
        if (valueAsString != null) {
            return valueAsString;
        }
        throw c5347g.m11440a(String.class, c5303j.getCurrentToken());
    }

    protected final T m11188y(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken == C1380m.START_ARRAY) {
            if (c5347g.m11452a(C5348h.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (c5303j.nextToken() == C1380m.END_ARRAY) {
                    return null;
                }
                throw c5347g.m11440a(mo1307a(), C1380m.START_ARRAY);
            }
        } else if (currentToken == C1380m.VALUE_STRING && c5347g.m11452a(C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && c5303j.getText().trim().isEmpty()) {
            return null;
        }
        throw c5347g.m11457b(mo1307a());
    }
}
