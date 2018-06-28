package com.p111d.p112a.p121c.p134k;

import com.p111d.p112a.p113a.C1329q.C1327a;
import com.p111d.p112a.p113a.C1329q.C1328b;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C7128y;
import com.p111d.p112a.p121c.p128f.C5328e;
import com.p111d.p112a.p121c.p138m.C1517a;
import com.p111d.p112a.p121c.p138m.C1527g;

public final class C1501m {
    private static final Object f4672f = Boolean.FALSE;
    protected final C7128y f4673a;
    protected final C1445c f4674b;
    protected final C1328b f4675c;
    protected final C5308b f4676d = this.f4673a.mo3358a();
    protected Object f4677e;

    public C1501m(C7128y c7128y, C1445c c1445c) {
        this.f4673a = c7128y;
        this.f4674b = c1445c;
        this.f4675c = c1445c.mo1367a(c7128y.m18744f());
    }

    private static Object m3863a(C5354j c5354j) {
        Class e = c5354j.m11531e();
        Class p = C1527g.m3981p(e);
        if (p != null) {
            return C1527g.m3979n(p);
        }
        if (!c5354j.mo3391n()) {
            if (!c5354j.mo3560a()) {
                return e == String.class ? "" : null;
            }
        }
        return C1327a.NON_EMPTY;
    }

    private Object m3864a(String str, C5328e c5328e, C5354j c5354j) {
        Object obj = this.f4677e;
        if (obj == null) {
            obj = this.f4674b.mo1370a(this.f4673a.m11086j());
            if (obj == null) {
                obj = f4672f;
            }
            this.f4677e = obj;
        }
        obj = obj == f4672f ? null : this.f4677e;
        if (obj == null) {
            return C1501m.m3863a(c5354j);
        }
        try {
            return c5328e.mo2817b(obj);
        } catch (Exception e) {
            Throwable e2 = e;
            while (e2.getCause() != null) {
                e2 = e2.getCause();
            }
            if (e2 instanceof Error) {
                throw ((Error) e2);
            } else if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Failed to get property '");
                stringBuilder.append(str);
                stringBuilder.append("' of default ");
                stringBuilder.append(obj.getClass().getName());
                stringBuilder.append(" instance");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final com.p111d.p112a.p121c.p134k.C7119d m3865a(com.p111d.p112a.p121c.aa r14, com.p111d.p112a.p121c.p128f.C1451n r15, com.p111d.p112a.p121c.C5354j r16, com.p111d.p112a.p121c.C1545o<?> r17, com.p111d.p112a.p121c.p131i.C1478f r18, com.p111d.p112a.p121c.p131i.C1478f r19, com.p111d.p112a.p121c.p128f.C5328e r20, boolean r21) {
        /*
        r13 = this;
        r0 = r13;
        r5 = r16;
        r1 = r19;
        r11 = r20;
        r2 = r0.f4676d;
        r3 = r0.f4673a;
        r2 = r2.refineSerializationType(r3, r11, r5);
        r3 = 1;
        if (r2 == r5) goto L_0x0058;
    L_0x0012:
        r4 = r2.m11531e();
        r6 = r16.m11531e();
        r7 = r4.isAssignableFrom(r6);
        if (r7 != 0) goto L_0x0056;
    L_0x0020:
        r7 = r6.isAssignableFrom(r4);
        if (r7 != 0) goto L_0x0056;
    L_0x0026:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "Illegal concrete-type annotation for method '";
        r2.<init>(r3);
        r3 = r20.mo1360b();
        r2.append(r3);
        r3 = "': class ";
        r2.append(r3);
        r3 = r4.getName();
        r2.append(r3);
        r3 = " not a super-type of (declared) class ";
        r2.append(r3);
        r3 = r6.getName();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0056:
        r4 = r3;
        goto L_0x005b;
    L_0x0058:
        r4 = r21;
        r2 = r5;
    L_0x005b:
        r6 = r0.f4676d;
        r6 = r6.findSerializationTyping(r11);
        r7 = 0;
        if (r6 == 0) goto L_0x006f;
    L_0x0064:
        r8 = com.p111d.p112a.p121c.p122a.C1397f.C1396b.DEFAULT_TYPING;
        if (r6 == r8) goto L_0x006f;
    L_0x0068:
        r4 = com.p111d.p112a.p121c.p122a.C1397f.C1396b.STATIC;
        if (r6 != r4) goto L_0x006e;
    L_0x006c:
        r4 = r3;
        goto L_0x006f;
    L_0x006e:
        r4 = r7;
    L_0x006f:
        r6 = 0;
        if (r4 == 0) goto L_0x0077;
    L_0x0072:
        r2 = r2.mo3385d();
        goto L_0x0078;
    L_0x0077:
        r2 = r6;
    L_0x0078:
        if (r1 == 0) goto L_0x00bc;
    L_0x007a:
        if (r2 != 0) goto L_0x007d;
    L_0x007c:
        r2 = r5;
    L_0x007d:
        r4 = r2.mo3394u();
        if (r4 != 0) goto L_0x00b6;
    L_0x0083:
        r1 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = "Problem trying to create BeanPropertyWriter for property '";
        r3.<init>(r4);
        r4 = r15.mo1398a();
        r3.append(r4);
        r4 = "' (of type ";
        r3.append(r4);
        r4 = r0.f4674b;
        r4 = r4.m3615a();
        r3.append(r4);
        r4 = "); serialization type ";
        r3.append(r4);
        r3.append(r2);
        r2 = " has no content";
        r3.append(r2);
        r2 = r3.toString();
        r1.<init>(r2);
        throw r1;
    L_0x00b6:
        r1 = r2.mo3383b(r1);
        r8 = r1;
        goto L_0x00bd;
    L_0x00bc:
        r8 = r2;
    L_0x00bd:
        r1 = r0.f4675c;
        r2 = r15.mo1423y();
        r1 = r1.m3138a(r2);
        r1 = r1.m3139b();
        r2 = com.p111d.p112a.p113a.C1329q.C1327a.USE_DEFAULTS;
        if (r1 != r2) goto L_0x00d1;
    L_0x00cf:
        r1 = com.p111d.p112a.p113a.C1329q.C1327a.ALWAYS;
    L_0x00d1:
        r2 = com.p111d.p112a.p121c.p134k.C1501m.C15001.f4671a;
        r1 = r1.ordinal();
        r1 = r2[r1];
        switch(r1) {
            case 1: goto L_0x00ef;
            case 2: goto L_0x00e5;
            case 3: goto L_0x00df;
            case 4: goto L_0x00dd;
            default: goto L_0x00dc;
        };
    L_0x00dc:
        goto L_0x0127;
    L_0x00dd:
        r7 = r3;
        goto L_0x0127;
    L_0x00df:
        r1 = com.p111d.p112a.p121c.p134k.C7119d.f20265c;
    L_0x00e1:
        r10 = r1;
        r9 = r3;
        goto L_0x013d;
    L_0x00e5:
        r1 = r16.mo3560a();
        if (r1 == 0) goto L_0x00ec;
    L_0x00eb:
        goto L_0x00df;
    L_0x00ec:
        r9 = r3;
        r10 = r6;
        goto L_0x013d;
    L_0x00ef:
        if (r8 != 0) goto L_0x00f3;
    L_0x00f1:
        r1 = r5;
        goto L_0x00f4;
    L_0x00f3:
        r1 = r8;
    L_0x00f4:
        r2 = r0.f4675c;
        r2 = r2.m3139b();
        r4 = com.p111d.p112a.p113a.C1329q.C1327a.NON_DEFAULT;
        if (r2 != r4) goto L_0x0107;
    L_0x00fe:
        r2 = r15.mo1398a();
        r1 = r0.m3864a(r2, r11, r1);
        goto L_0x010b;
    L_0x0107:
        r1 = com.p111d.p112a.p121c.p134k.C1501m.m3863a(r1);
    L_0x010b:
        if (r1 != 0) goto L_0x010e;
    L_0x010d:
        goto L_0x00e1;
    L_0x010e:
        r2 = r1.getClass();
        r2 = r2.isArray();
        if (r2 == 0) goto L_0x0139;
    L_0x0118:
        r2 = java.lang.reflect.Array.getLength(r1);
        r3 = r1.getClass();
        r4 = new com.d.a.c.m.b$1;
        r4.<init>(r3, r2, r1);
        r10 = r4;
        goto L_0x013c;
    L_0x0127:
        r1 = r16.mo3391n();
        if (r1 == 0) goto L_0x013b;
    L_0x012d:
        r1 = r0.f4673a;
        r2 = com.p111d.p112a.p121c.C5387z.WRITE_EMPTY_JSON_ARRAYS;
        r1 = r1.m18737a(r2);
        if (r1 != 0) goto L_0x013b;
    L_0x0137:
        r1 = com.p111d.p112a.p121c.p134k.C7119d.f20265c;
    L_0x0139:
        r10 = r1;
        goto L_0x013c;
    L_0x013b:
        r10 = r6;
    L_0x013c:
        r9 = r7;
    L_0x013d:
        r12 = new com.d.a.c.k.d;
        r1 = r0.f4674b;
        r4 = r1.mo1376f();
        r1 = r12;
        r2 = r15;
        r3 = r11;
        r6 = r17;
        r7 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = r0.f4676d;
        r1 = r1.findNullSerializer(r11);
        if (r1 == 0) goto L_0x015f;
    L_0x0157:
        r2 = r14;
        r1 = r2.mo2929c(r1);
        r12.mo3537b(r1);
    L_0x015f:
        r1 = r0.f4676d;
        r1 = r1.findUnwrappingNameTransformer(r11);
        if (r1 == 0) goto L_0x016d;
    L_0x0167:
        r2 = new com.d.a.c.k.a.r;
        r2.<init>(r12, r1);
        r12 = r2;
    L_0x016d:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.k.m.a(com.d.a.c.aa, com.d.a.c.f.n, com.d.a.c.j, com.d.a.c.o, com.d.a.c.i.f, com.d.a.c.i.f, com.d.a.c.f.e, boolean):com.d.a.c.k.d");
    }

    public final C1517a m3866a() {
        return this.f4674b.mo1376f();
    }
}
