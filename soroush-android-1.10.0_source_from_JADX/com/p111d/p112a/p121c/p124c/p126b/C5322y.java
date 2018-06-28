package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5348h;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p128f.C7087f;
import com.p111d.p112a.p121c.p138m.C1527g;
import com.p111d.p112a.p121c.p138m.C1530j;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

@C1387a
public class C5322y extends C1546p implements Serializable {
    protected final int f14772a;
    protected final Class<?> f14773b;
    protected final C7060l<?> f14774c;

    static final class C5321a extends C1546p implements Serializable {
        protected final Class<?> f14770a;
        protected final C1507k<?> f14771b;

        protected C5321a(Class<?> cls, C1507k<?> c1507k) {
            this.f14770a = cls;
            this.f14771b = c1507k;
        }

        public final Object mo1336a(String str, C5347g c5347g) {
            if (str == null) {
                return null;
            }
            try {
                Object a = this.f14771b.mo1304a(c5347g.m11472k(), c5347g);
                if (a != null) {
                    return a;
                }
                throw c5347g.m11442a(this.f14770a, str, "not a valid representation");
            } catch (Exception e) {
                Class cls = this.f14770a;
                StringBuilder stringBuilder = new StringBuilder("not a valid representation: ");
                stringBuilder.append(e.getMessage());
                throw c5347g.m11442a(cls, str, stringBuilder.toString());
            }
        }
    }

    @C1387a
    static final class C6481b extends C5322y {
        protected final C1530j f17668d;
        protected final C7087f f17669e;

        protected C6481b(C1530j c1530j, C7087f c7087f) {
            super(-1, c1530j.m3998c());
            this.f17668d = c1530j;
            this.f17669e = c7087f;
        }

        public final Object mo2805b(String str, C5347g c5347g) {
            if (this.f17669e != null) {
                try {
                    return this.f17669e.mo3353a((Object) str);
                } catch (Throwable e) {
                    C1527g.m3966b(e);
                }
            }
            Enum a = this.f17668d.m3996a(str);
            if (a != null || c5347g.m11460c().m18509a(C5348h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return a;
            }
            throw c5347g.m11442a(this.b, str, "not one of values for Enum class");
        }
    }

    static final class C6482c extends C5322y {
        protected final Constructor<?> f17670d;

        public C6482c(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.f17670d = constructor;
        }

        public final Object mo2805b(String str, C5347g c5347g) {
            return this.f17670d.newInstance(new Object[]{str});
        }
    }

    static final class C6483d extends C5322y {
        final Method f17671d;

        public C6483d(Method method) {
            super(-1, method.getDeclaringClass());
            this.f17671d = method;
        }

        public final Object mo2805b(String str, C5347g c5347g) {
            return this.f17671d.invoke(null, new Object[]{str});
        }
    }

    @C1387a
    static final class C6484e extends C5322y {
        private static final C6484e f17672d = new C6484e(String.class);
        private static final C6484e f17673e = new C6484e(Object.class);

        private C6484e(Class<?> cls) {
            super(-1, cls);
        }

        public static C6484e m15484b(Class<?> cls) {
            return cls == String.class ? f17672d : cls == Object.class ? f17673e : new C6484e(cls);
        }

        public final Object mo1336a(String str, C5347g c5347g) {
            return str;
        }
    }

    protected C5322y(int i, Class<?> cls) {
        this(i, cls, null);
    }

    private C5322y(int i, Class<?> cls, C7060l<?> c7060l) {
        this.f14772a = i;
        this.f14773b = cls;
        this.f14774c = c7060l;
    }

    public static C5322y m11190a(Class<?> cls) {
        if (cls != String.class) {
            if (cls != Object.class) {
                int i;
                if (cls == UUID.class) {
                    i = 12;
                } else if (cls == Integer.class) {
                    i = 5;
                } else if (cls == Long.class) {
                    i = 6;
                } else if (cls == Date.class) {
                    i = 10;
                } else if (cls == Calendar.class) {
                    i = 11;
                } else if (cls == Boolean.class) {
                    i = 1;
                } else if (cls == Byte.class) {
                    i = 2;
                } else if (cls == Character.class) {
                    i = 4;
                } else if (cls == Short.class) {
                    i = 3;
                } else if (cls == Float.class) {
                    i = 7;
                } else if (cls == Double.class) {
                    i = 8;
                } else if (cls == URI.class) {
                    i = 13;
                } else if (cls == URL.class) {
                    i = 14;
                } else if (cls != Class.class) {
                    return cls == Locale.class ? new C5322y(9, cls, C7060l.m18339a(Locale.class)) : cls == Currency.class ? new C5322y(16, cls, C7060l.m18339a(Currency.class)) : null;
                } else {
                    i = 15;
                }
                return new C5322y(i, cls);
            }
        }
        return C6484e.m15484b(cls);
    }

    public Object mo1336a(String str, C5347g c5347g) {
        if (str == null) {
            return null;
        }
        try {
            Object b = mo2805b(str, c5347g);
            if (b != null) {
                return b;
            }
            if (this.f14773b.isEnum() && c5347g.m11460c().m18509a(C5348h.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            throw c5347g.m11442a(this.f14773b, str, "not a valid representation");
        } catch (Exception e) {
            Class cls = this.f14773b;
            StringBuilder stringBuilder = new StringBuilder("not a valid representation: ");
            stringBuilder.append(e.getMessage());
            throw c5347g.m11442a(cls, str, stringBuilder.toString());
        }
    }

    protected java.lang.Object mo2805b(java.lang.String r3, com.p111d.p112a.p121c.C5347g r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f14772a;
        r1 = 0;
        switch(r0) {
            case 1: goto L_0x00cd;
            case 2: goto L_0x00b1;
            case 3: goto L_0x0095;
            case 4: goto L_0x007b;
            case 5: goto L_0x0072;
            case 6: goto L_0x0069;
            case 7: goto L_0x005f;
            case 8: goto L_0x0056;
            case 9: goto L_0x0046;
            case 10: goto L_0x0041;
            case 11: goto L_0x0035;
            case 12: goto L_0x0030;
            case 13: goto L_0x002b;
            case 14: goto L_0x0025;
            case 15: goto L_0x0017;
            case 16: goto L_0x0007;
            default: goto L_0x0006;
        };
    L_0x0006:
        return r1;
    L_0x0007:
        r0 = r2.f14774c;	 Catch:{ IOException -> 0x000e }
        r0 = r0.mo3528a(r3, r4);	 Catch:{ IOException -> 0x000e }
        return r0;
    L_0x000e:
        r0 = r2.f14773b;
        r1 = "unable to parse key as currency";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x0017:
        r0 = r4.m11447a(r3);	 Catch:{ Exception -> 0x001c }
        return r0;
    L_0x001c:
        r0 = r2.f14773b;
        r1 = "unable to parse key as Class";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x0025:
        r4 = new java.net.URL;
        r4.<init>(r3);
        return r4;
    L_0x002b:
        r3 = java.net.URI.create(r3);
        return r3;
    L_0x0030:
        r3 = java.util.UUID.fromString(r3);
        return r3;
    L_0x0035:
        r3 = r4.m11459b(r3);
        if (r3 != 0) goto L_0x003c;
    L_0x003b:
        return r1;
    L_0x003c:
        r3 = r4.m11448a(r3);
        return r3;
    L_0x0041:
        r3 = r4.m11459b(r3);
        return r3;
    L_0x0046:
        r0 = r2.f14774c;	 Catch:{ IOException -> 0x004d }
        r0 = r0.mo3528a(r3, r4);	 Catch:{ IOException -> 0x004d }
        return r0;
    L_0x004d:
        r0 = r2.f14773b;
        r1 = "unable to parse key as locale";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x0056:
        r3 = com.p111d.p112a.p114b.p116c.C1351g.m3233d(r3);
        r3 = java.lang.Double.valueOf(r3);
        return r3;
    L_0x005f:
        r3 = com.p111d.p112a.p114b.p116c.C1351g.m3233d(r3);
        r3 = (float) r3;
        r3 = java.lang.Float.valueOf(r3);
        return r3;
    L_0x0069:
        r3 = java.lang.Long.parseLong(r3);
        r3 = java.lang.Long.valueOf(r3);
        return r3;
    L_0x0072:
        r3 = java.lang.Integer.parseInt(r3);
        r3 = java.lang.Integer.valueOf(r3);
        return r3;
    L_0x007b:
        r0 = r3.length();
        r1 = 1;
        if (r0 != r1) goto L_0x008c;
    L_0x0082:
        r4 = 0;
        r3 = r3.charAt(r4);
        r3 = java.lang.Character.valueOf(r3);
        return r3;
    L_0x008c:
        r0 = r2.f14773b;
        r1 = "can only convert 1-character Strings";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x0095:
        r0 = java.lang.Integer.parseInt(r3);
        r1 = -32768; // 0xffffffffffff8000 float:NaN double:NaN;
        if (r0 < r1) goto L_0x00a8;
    L_0x009d:
        r1 = 32767; // 0x7fff float:4.5916E-41 double:1.6189E-319;
        if (r0 <= r1) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00a8;
    L_0x00a2:
        r3 = (short) r0;
        r3 = java.lang.Short.valueOf(r3);
        return r3;
    L_0x00a8:
        r0 = r2.f14773b;
        r1 = "overflow, value can not be represented as 16-bit value";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x00b1:
        r0 = java.lang.Integer.parseInt(r3);
        r1 = -128; // 0xffffffffffffff80 float:NaN double:NaN;
        if (r0 < r1) goto L_0x00c4;
    L_0x00b9:
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r0 <= r1) goto L_0x00be;
    L_0x00bd:
        goto L_0x00c4;
    L_0x00be:
        r3 = (byte) r0;
        r3 = java.lang.Byte.valueOf(r3);
        return r3;
    L_0x00c4:
        r0 = r2.f14773b;
        r1 = "overflow, value can not be represented as 8-bit value";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
    L_0x00cd:
        r0 = "true";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x00d8;
    L_0x00d5:
        r3 = java.lang.Boolean.TRUE;
        return r3;
    L_0x00d8:
        r0 = "false";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x00e3;
    L_0x00e0:
        r3 = java.lang.Boolean.FALSE;
        return r3;
    L_0x00e3:
        r0 = r2.f14773b;
        r1 = "value not 'true' or 'false'";
        r3 = r4.m11442a(r0, r3, r1);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.y.b(java.lang.String, com.d.a.c.g):java.lang.Object");
    }
}
