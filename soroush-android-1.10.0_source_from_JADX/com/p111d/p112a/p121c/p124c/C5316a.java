package com.p111d.p112a.p121c.p124c;

import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1445c;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.p124c.p125a.C1416l;
import java.io.Serializable;
import java.util.Map;

public final class C5316a extends C1507k<Object> implements Serializable {
    protected final C5354j f14740a;
    protected final C1416l f14741b;
    protected final Map<String, C6488s> f14742c;
    protected final boolean f14743d;
    protected final boolean f14744e;
    protected final boolean f14745f;
    protected final boolean f14746g;

    public C5316a(C1431e c1431e, C1445c c1445c, Map<String, C6488s> map) {
        boolean z;
        this.f14740a = c1445c.m3615a();
        this.f14741b = c1431e.m3540d();
        this.f14742c = map;
        Class e = this.f14740a.m11531e();
        this.f14743d = e.isAssignableFrom(String.class);
        boolean z2 = true;
        if (e != Boolean.TYPE) {
            if (!e.isAssignableFrom(Boolean.class)) {
                z = false;
                this.f14744e = z;
                if (e != Integer.TYPE) {
                    if (e.isAssignableFrom(Integer.class)) {
                        z = false;
                        this.f14745f = z;
                        if (e != Double.TYPE) {
                            if (!e.isAssignableFrom(Double.class)) {
                                z2 = false;
                            }
                        }
                        this.f14746g = z2;
                    }
                }
                z = true;
                this.f14745f = z;
                if (e != Double.TYPE) {
                    if (!e.isAssignableFrom(Double.class)) {
                        z2 = false;
                    }
                }
                this.f14746g = z2;
            }
        }
        z = true;
        this.f14744e = z;
        if (e != Integer.TYPE) {
            if (e.isAssignableFrom(Integer.class)) {
                z = false;
                this.f14745f = z;
                if (e != Double.TYPE) {
                    if (!e.isAssignableFrom(Double.class)) {
                        z2 = false;
                    }
                }
                this.f14746g = z2;
            }
        }
        z = true;
        this.f14745f = z;
        if (e != Double.TYPE) {
            if (!e.isAssignableFrom(Double.class)) {
                z2 = false;
            }
        }
        this.f14746g = z2;
    }

    private C5316a(C1445c c1445c) {
        boolean z;
        this.f14740a = c1445c.m3615a();
        this.f14741b = null;
        this.f14742c = null;
        Class e = this.f14740a.m11531e();
        this.f14743d = e.isAssignableFrom(String.class);
        boolean z2 = true;
        if (e != Boolean.TYPE) {
            if (!e.isAssignableFrom(Boolean.class)) {
                z = false;
                this.f14744e = z;
                if (e != Integer.TYPE) {
                    if (e.isAssignableFrom(Integer.class)) {
                        z = false;
                        this.f14745f = z;
                        if (e != Double.TYPE) {
                            if (!e.isAssignableFrom(Double.class)) {
                                z2 = false;
                            }
                        }
                        this.f14746g = z2;
                    }
                }
                z = true;
                this.f14745f = z;
                if (e != Double.TYPE) {
                    if (!e.isAssignableFrom(Double.class)) {
                        z2 = false;
                    }
                }
                this.f14746g = z2;
            }
        }
        z = true;
        this.f14744e = z;
        if (e != Integer.TYPE) {
            if (e.isAssignableFrom(Integer.class)) {
                z = false;
                this.f14745f = z;
                if (e != Double.TYPE) {
                    if (!e.isAssignableFrom(Double.class)) {
                        z2 = false;
                    }
                }
                this.f14746g = z2;
            }
        }
        z = true;
        this.f14745f = z;
        if (e != Double.TYPE) {
            if (!e.isAssignableFrom(Double.class)) {
                z2 = false;
            }
        }
        this.f14746g = z2;
    }

    public static C5316a m11110a(C1445c c1445c) {
        return new C5316a(c1445c);
    }

    public final C6488s mo1310a(String str) {
        return this.f14742c == null ? null : (C6488s) this.f14742c.get(str);
    }

    public final Class<?> mo1307a() {
        return this.f14740a.m11531e();
    }

    public final Object mo1304a(C5303j c5303j, C5347g c5347g) {
        throw c5347g.m11441a(this.f14740a.m11531e(), "abstract types either need to be mapped to concrete types, have custom deserializer, or be instantiated with additional type information");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo1308a(com.p111d.p112a.p114b.C5303j r4, com.p111d.p112a.p121c.C5347g r5, com.p111d.p112a.p121c.p131i.C1475c r6) {
        /*
        r3 = this;
        r0 = r3.f14741b;
        if (r0 == 0) goto L_0x004d;
    L_0x0004:
        r0 = r4.getCurrentToken();
        if (r0 == 0) goto L_0x004d;
    L_0x000a:
        r1 = r0.f4397v;
        if (r1 == 0) goto L_0x0044;
    L_0x000e:
        r6 = r3.f14741b;
        r6 = r6.m3492a(r4, r5);
        r0 = r3.f14741b;
        r0 = r0.f4477c;
        r1 = r3.f14741b;
        r1 = r1.f4478d;
        r5 = r5.mo2811a(r6, r0, r1);
        r0 = r5.m3514b();
        if (r0 != 0) goto L_0x0043;
    L_0x0026:
        r0 = new com.d.a.c.c.t;
        r1 = new java.lang.StringBuilder;
        r2 = "Could not resolve Object Id [";
        r1.<init>(r2);
        r1.append(r6);
        r6 = "] -- unresolved forward-reference?";
        r1.append(r6);
        r6 = r1.toString();
        r1 = r4.getCurrentLocation();
        r0.<init>(r4, r6, r1, r5);
        throw r0;
    L_0x0043:
        return r0;
    L_0x0044:
        r1 = com.p111d.p112a.p114b.C1380m.START_OBJECT;
        if (r0 != r1) goto L_0x004b;
    L_0x0048:
        r4.nextToken();
    L_0x004b:
        r0 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
    L_0x004d:
        r0 = r4.getCurrentTokenId();
        switch(r0) {
            case 6: goto L_0x007d;
            case 7: goto L_0x0070;
            case 8: goto L_0x0063;
            case 9: goto L_0x005c;
            case 10: goto L_0x0055;
            default: goto L_0x0054;
        };
    L_0x0054:
        goto L_0x0086;
    L_0x0055:
        r0 = r3.f14744e;
        if (r0 == 0) goto L_0x0086;
    L_0x0059:
        r0 = java.lang.Boolean.FALSE;
        goto L_0x0087;
    L_0x005c:
        r0 = r3.f14744e;
        if (r0 == 0) goto L_0x0086;
    L_0x0060:
        r0 = java.lang.Boolean.TRUE;
        goto L_0x0087;
    L_0x0063:
        r0 = r3.f14746g;
        if (r0 == 0) goto L_0x0086;
    L_0x0067:
        r0 = r4.getDoubleValue();
        r0 = java.lang.Double.valueOf(r0);
        goto L_0x0087;
    L_0x0070:
        r0 = r3.f14745f;
        if (r0 == 0) goto L_0x0086;
    L_0x0074:
        r0 = r4.getIntValue();
        r0 = java.lang.Integer.valueOf(r0);
        goto L_0x0087;
    L_0x007d:
        r0 = r3.f14743d;
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r4.getText();
        goto L_0x0087;
    L_0x0086:
        r0 = 0;
    L_0x0087:
        if (r0 == 0) goto L_0x008a;
    L_0x0089:
        return r0;
    L_0x008a:
        r4 = r6.mo2896a(r4, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.a.a(com.d.a.b.j, com.d.a.c.g, com.d.a.c.i.c):java.lang.Object");
    }

    public final boolean mo1311b() {
        return true;
    }

    public final C1416l mo1312d() {
        return this.f14741b;
    }
}
