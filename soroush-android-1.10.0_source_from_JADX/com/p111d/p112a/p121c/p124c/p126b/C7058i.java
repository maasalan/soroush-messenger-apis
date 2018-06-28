package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.C5385q;
import com.p111d.p112a.p121c.C7089f;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1528h;
import com.p111d.p112a.p121c.p138m.C1530j;
import com.p111d.p112a.p121c.p540d.C6490b;
import java.io.IOException;
import java.lang.reflect.Method;

@C1387a
public final class C7058i extends aa<Object> {
    protected final C1528h f20156a;
    protected Object[] f20157b;

    protected static class C6476a extends C5320x<Object> implements C1434i {
        protected final Class<?> f17656a;
        protected final Method f17657b;
        protected final C1507k<?> f17658c;

        private C6476a(C6476a c6476a, C1507k<?> c1507k) {
            super(c6476a.y);
            this.f17656a = c6476a.f17656a;
            this.f17657b = c6476a.f17657b;
            this.f17658c = c1507k;
        }

        public C6476a(Class<?> cls, C7087f c7087f, Class<?> cls2) {
            super((Class) cls);
            this.f17657b = c7087f.m18494f();
            this.f17656a = cls2;
            this.f17658c = null;
        }

        public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
            return (this.f17658c != null || this.f17656a == String.class) ? this : new C6476a(this, c5347g.m11437a(c5347g.m11435a(this.f17656a), c1446d));
        }

        public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
            Object a;
            if (this.f17658c != null) {
                a = this.f17658c.mo1304a(c5303j, c5347g);
            } else {
                C1380m currentToken = c5303j.getCurrentToken();
                if (currentToken != C1380m.VALUE_STRING) {
                    if (currentToken != C1380m.FIELD_NAME) {
                        a = c5303j.getValueAsString();
                    }
                }
                a = c5303j.getText();
            }
            try {
                return this.f17657b.invoke(this.y, new Object[]{a});
            } catch (Throwable th) {
                Throwable th2 = C1527g.m3953a(th2);
                if (th2 instanceof IOException) {
                    throw ((IOException) th2);
                }
                throw c5347g.m11443a(this.y, th2);
            }
        }

        public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
            return this.f17658c == null ? mo1304a(c5303j, c5347g) : c1475c.mo2899d(c5303j, c5347g);
        }
    }

    public C7058i(C1530j c1530j) {
        super(c1530j.m3998c());
        this.f20156a = c1530j.m3995a();
        this.f20157b = c1530j.m3997b();
    }

    public static C1507k<?> m18328a(C7089f c7089f, Class<?> cls, C7087f c7087f) {
        Class h = c7087f.mo3356h();
        if (c7089f.m11086j()) {
            C1527g.m3961a(c7087f.m18500m(), c7089f.m11077a(C5385q.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new C6476a(cls, c7087f, h);
    }

    private void m18329a(C5303j c5303j, int i) {
        throw C6490b.m15564a(c5303j, String.format("Not allowed to deserialize Enum value out of JSON number (%d): disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[]{Integer.valueOf(i)}), Integer.valueOf(i), mo1307a());
    }

    private final java.lang.Object m18330b(com.p111d.p112a.p114b.C5303j r4, com.p111d.p112a.p121c.C5347g r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r6 = r6.trim();
        r0 = r6.length();
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x000b:
        r4 = com.p111d.p112a.p121c.C5348h.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
        r4 = r5.m11452a(r4);
        if (r4 == 0) goto L_0x003c;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = 0;
        r0 = r6.charAt(r0);
        r2 = 48;
        if (r0 < r2) goto L_0x003c;
    L_0x001d:
        r2 = 57;
        if (r0 > r2) goto L_0x003c;
    L_0x0021:
        r0 = java.lang.Integer.parseInt(r6);	 Catch:{ NumberFormatException -> 0x003c }
        r2 = com.p111d.p112a.p121c.C5348h.FAIL_ON_NUMBERS_FOR_ENUMS;	 Catch:{ NumberFormatException -> 0x003c }
        r2 = r5.m11452a(r2);	 Catch:{ NumberFormatException -> 0x003c }
        if (r2 == 0) goto L_0x0030;	 Catch:{ NumberFormatException -> 0x003c }
    L_0x002d:
        r3.m18329a(r4, r0);	 Catch:{ NumberFormatException -> 0x003c }
    L_0x0030:
        if (r0 < 0) goto L_0x003c;	 Catch:{ NumberFormatException -> 0x003c }
    L_0x0032:
        r4 = r3.f20157b;	 Catch:{ NumberFormatException -> 0x003c }
        r4 = r4.length;	 Catch:{ NumberFormatException -> 0x003c }
        if (r0 > r4) goto L_0x003c;	 Catch:{ NumberFormatException -> 0x003c }
    L_0x0037:
        r4 = r3.f20157b;	 Catch:{ NumberFormatException -> 0x003c }
        r4 = r4[r0];	 Catch:{ NumberFormatException -> 0x003c }
        return r4;
    L_0x003c:
        r4 = com.p111d.p112a.p121c.C5348h.READ_UNKNOWN_ENUM_VALUES_AS_NULL;
        r4 = r5.m11452a(r4);
        if (r4 != 0) goto L_0x0061;
    L_0x0044:
        r4 = r3.mo1307a();
        r0 = new java.lang.StringBuilder;
        r1 = "value not one of declared Enum instance names: ";
        r0.<init>(r1);
        r1 = r3.f20156a;
        r1 = r1.m3989a();
        r0.append(r1);
        r0 = r0.toString();
        r4 = r5.m11445a(r6, r4, r0);
        throw r4;
    L_0x0061:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.i.b(com.d.a.b.j, com.d.a.c.g, java.lang.String):java.lang.Object");
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        C1380m currentToken = c5303j.getCurrentToken();
        Object obj = null;
        if (currentToken != C1380m.VALUE_STRING) {
            if (currentToken != C1380m.FIELD_NAME) {
                if (currentToken == C1380m.VALUE_NUMBER_INT) {
                    int intValue = c5303j.getIntValue();
                    if (c5347g.m11452a(C5348h.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                        m18329a(c5303j, intValue);
                    }
                    if (intValue >= 0 && intValue <= this.f20157b.length) {
                        return this.f20157b[intValue];
                    }
                    if (c5347g.m11452a(C5348h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return null;
                    }
                    Number valueOf = Integer.valueOf(intValue);
                    Class a = mo1307a();
                    StringBuilder stringBuilder = new StringBuilder("index value outside legal index range [0..");
                    stringBuilder.append(this.f20157b.length - 1);
                    stringBuilder.append("]");
                    throw c5347g.m11444a(valueOf, a, stringBuilder.toString());
                }
                c5303j.getCurrentToken();
                if (c5347g.m11452a(C5348h.UNWRAP_SINGLE_VALUE_ARRAYS) && c5303j.isExpectedStartArrayToken()) {
                    c5303j.nextToken();
                    Object a2 = mo1304a(c5303j, c5347g);
                    if (c5303j.nextToken() == C1380m.END_ARRAY) {
                        return a2;
                    }
                    C1380m c1380m = C1380m.END_ARRAY;
                    StringBuilder stringBuilder2 = new StringBuilder("Attempted to unwrap single value array for single '");
                    stringBuilder2.append(mo1307a().getName());
                    stringBuilder2.append("' value but there was more than a single value in the array");
                    throw C5347g.m11430a(c5303j, c1380m, stringBuilder2.toString());
                }
                throw c5347g.m11457b(mo1307a());
            }
        }
        String text = c5303j.getText();
        C1528h c1528h = this.f20156a;
        int hashCode = text.hashCode() & c1528h.f4766a;
        int i = hashCode << 1;
        String str = c1528h.f4768c[i];
        if (str != text) {
            if (!text.equals(str)) {
                if (str != null) {
                    i = c1528h.f4766a + 1;
                    hashCode = ((hashCode >> 1) + i) << 1;
                    Object obj2 = c1528h.f4768c[hashCode];
                    if (text.equals(obj2)) {
                        obj = c1528h.f4768c[hashCode + 1];
                    } else if (obj2 != null) {
                        hashCode = (i + (i >> 1)) << 1;
                        i = c1528h.f4767b + hashCode;
                        while (hashCode < i) {
                            str = c1528h.f4768c[hashCode];
                            if (str != text) {
                                if (!text.equals(str)) {
                                    hashCode += 2;
                                }
                            }
                            obj = c1528h.f4768c[hashCode + 1];
                            break;
                        }
                    }
                }
                return obj != null ? m18330b(c5303j, c5347g, text) : obj;
            }
        }
        obj = c1528h.f4768c[i + 1];
        if (obj != null) {
        }
    }

    public final boolean mo1311b() {
        return true;
    }
}
