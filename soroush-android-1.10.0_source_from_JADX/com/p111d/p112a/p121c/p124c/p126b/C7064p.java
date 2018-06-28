package com.p111d.p112a.p121c.p124c.p126b;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C1446d;
import com.p111d.p112a.p121c.C1507k;
import com.p111d.p112a.p121c.C1546p;
import com.p111d.p112a.p121c.C5308b;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.C5354j;
import com.p111d.p112a.p121c.C5364l;
import com.p111d.p112a.p121c.p122a.C1387a;
import com.p111d.p112a.p121c.p124c.C1434i;
import com.p111d.p112a.p121c.p124c.C1435j;
import com.p111d.p112a.p121c.p124c.C1440q;
import com.p111d.p112a.p121c.p124c.C1443v;
import com.p111d.p112a.p121c.p124c.C6489t;
import com.p111d.p112a.p121c.p124c.p125a.C1417o;
import com.p111d.p112a.p121c.p124c.p125a.C1421s.C1420a;
import com.p111d.p112a.p121c.p128f.C1449a;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C1519b;
import com.p111d.p112a.p121c.p138m.C1527g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@C1387a
public final class C7064p extends C6475g<Map<Object, Object>> implements C1434i, C1440q {
    protected final C5354j f20166a;
    protected final C1546p f20167b;
    protected boolean f20168c;
    protected final C1507k<Object> f20169d;
    protected final C1475c f20170e;
    protected final C1443v f20171f;
    protected final boolean f20172g;
    protected C1507k<Object> f20173h;
    protected C1417o f20174i;
    protected HashSet<String> f20175j;

    private static final class C1426b {
        final Class<?> f4509a;
        Map<Object, Object> f4510b;
        List<C5319a> f4511c = new ArrayList();

        public C1426b(Class<?> cls, Map<Object, Object> map) {
            this.f4509a = cls;
            this.f4510b = map;
        }

        public final void m3522a(Object obj, Object obj2) {
            (this.f4511c.isEmpty() ? this.f4510b : ((C5319a) this.f4511c.get(this.f4511c.size() - 1)).f14765a).put(obj, obj2);
        }
    }

    static final class C5319a extends C1420a {
        public final Map<Object, Object> f14765a = new LinkedHashMap();
        public final Object f14766d;
        private final C1426b f14767e;

        C5319a(C1426b c1426b, C6489t c6489t, Class<?> cls, Object obj) {
            super(c6489t, cls);
            this.f14767e = c1426b;
            this.f14766d = obj;
        }

        public final void mo1305a(Object obj, Object obj2) {
            C1426b c1426b = this.f14767e;
            Iterator it = c1426b.f4511c.iterator();
            Map map = c1426b.f4510b;
            while (it.hasNext()) {
                C5319a c5319a = (C5319a) it.next();
                if (c5319a.m3509a(obj)) {
                    it.remove();
                    map.put(c5319a.f14766d, obj2);
                    map.putAll(c5319a.f14765a);
                    return;
                }
                map = c5319a.f14765a;
            }
            StringBuilder stringBuilder = new StringBuilder("Trying to resolve a forward reference with id [");
            stringBuilder.append(obj);
            stringBuilder.append("] that wasn't previously seen as unresolved.");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private C7064p(C7064p c7064p, C1546p c1546p, C1507k<Object> c1507k, C1475c c1475c, HashSet<String> hashSet) {
        super(c7064p.f20166a);
        this.f20166a = c7064p.f20166a;
        this.f20167b = c1546p;
        this.f20169d = c1507k;
        this.f20170e = c1475c;
        this.f20171f = c7064p.f20171f;
        this.f20174i = c7064p.f20174i;
        this.f20173h = c7064p.f20173h;
        this.f20172g = c7064p.f20172g;
        this.f20175j = hashSet;
        this.f20168c = C7064p.m18357a(this.f20166a, c1546p);
    }

    public C7064p(C5354j c5354j, C1443v c1443v, C1546p c1546p, C1507k<Object> c1507k, C1475c c1475c) {
        super(c5354j);
        this.f20166a = c5354j;
        this.f20167b = c1546p;
        this.f20169d = c1507k;
        this.f20170e = c1475c;
        this.f20171f = c1443v;
        this.f20172g = c1443v.mo1303h();
        this.f20173h = null;
        this.f20174i = null;
        this.f20168c = C7064p.m18357a(c5354j, c1546p);
    }

    private Map<Object, Object> m18355a(C5303j c5303j, C5347g c5347g, Map<Object, Object> map) {
        c5303j.setCurrentValue(map);
        C1380m currentToken = c5303j.getCurrentToken();
        if (currentToken != C1380m.START_OBJECT && currentToken != C1380m.FIELD_NAME) {
            throw c5347g.m11457b(this.f20166a.m11531e());
        } else if (this.f20168c) {
            m18360c(c5303j, c5347g, map);
            return map;
        } else {
            m18358b(c5303j, c5347g, map);
            return map;
        }
    }

    private static void m18356a(C5303j c5303j, C1426b c1426b, Object obj, C6489t c6489t) {
        if (c1426b == null) {
            throw C5364l.m11573a(c5303j, "Unresolved forward reference but no identity info.", (Throwable) c6489t);
        }
        C1420a c5319a = new C5319a(c1426b, c6489t, c1426b.f4509a, obj);
        c1426b.f4511c.add(c5319a);
        c6489t.f17711d.m3512a(c5319a);
    }

    private static boolean m18357a(C5354j c5354j, C1546p c1546p) {
        if (c1546p == null) {
            return true;
        }
        c5354j = c5354j.mo3398t();
        if (c5354j == null) {
            return true;
        }
        Class e = c5354j.m11531e();
        return (e == String.class || e == Object.class) && C1527g.m3962a((Object) c1546p);
    }

    private void m18358b(com.p111d.p112a.p114b.C5303j r10, com.p111d.p112a.p121c.C5347g r11, java.util.Map<java.lang.Object, java.lang.Object> r12) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = r9.f20167b;
        r1 = r9.f20169d;
        r2 = r9.f20170e;
        r3 = r1.mo1312d();
        if (r3 == 0) goto L_0x000e;
    L_0x000c:
        r3 = 1;
        goto L_0x000f;
    L_0x000e:
        r3 = 0;
    L_0x000f:
        if (r3 == 0) goto L_0x0021;
    L_0x0011:
        r4 = new com.d.a.c.c.b.p$b;
        r5 = r9.f20166a;
        r5 = r5.mo3394u();
        r5 = r5.m11531e();
        r4.<init>(r5, r12);
        goto L_0x0022;
    L_0x0021:
        r4 = 0;
    L_0x0022:
        r5 = r10.isExpectedStartObjectToken();
        if (r5 == 0) goto L_0x002d;
    L_0x0028:
        r5 = r10.nextFieldName();
        goto L_0x004d;
    L_0x002d:
        r5 = r10.getCurrentToken();
        r6 = com.p111d.p112a.p114b.C1380m.END_OBJECT;
        if (r5 != r6) goto L_0x0036;
    L_0x0035:
        return;
    L_0x0036:
        r6 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r5 == r6) goto L_0x0049;
    L_0x003a:
        r12 = r9.f20166a;
        r12 = r12.m11531e();
        r10 = r10.getCurrentToken();
        r10 = r11.m11440a(r12, r10);
        throw r10;
    L_0x0049:
        r5 = r10.getCurrentName();
    L_0x004d:
        if (r5 == 0) goto L_0x008f;
    L_0x004f:
        r6 = r0.mo1336a(r5, r11);
        r7 = r10.nextToken();
        r8 = r9.f20175j;
        if (r8 == 0) goto L_0x0067;
    L_0x005b:
        r8 = r9.f20175j;
        r8 = r8.contains(r5);
        if (r8 == 0) goto L_0x0067;
    L_0x0063:
        r10.skipChildren();
        goto L_0x0028;
    L_0x0067:
        r8 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
        if (r7 != r8) goto L_0x0070;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x006b:
        r7 = r1.mo2803a(r11);	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
        goto L_0x007b;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x0070:
        if (r2 != 0) goto L_0x0077;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x0072:
        r7 = r1.mo1304a(r10, r11);	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
        goto L_0x007b;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x0077:
        r7 = r1.mo1308a(r10, r11, r2);	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x007b:
        if (r3 == 0) goto L_0x0081;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x007d:
        r4.m3522a(r6, r7);	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
        goto L_0x0028;	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
    L_0x0081:
        r12.put(r6, r7);	 Catch:{ t -> 0x008a, Exception -> 0x0085 }
        goto L_0x0028;
    L_0x0085:
        r6 = move-exception;
        com.p111d.p112a.p121c.p124c.p126b.C6475g.m15453a(r6, r12, r5);
        goto L_0x0028;
    L_0x008a:
        r5 = move-exception;
        com.p111d.p112a.p121c.p124c.p126b.C7064p.m18356a(r10, r4, r6, r5);
        goto L_0x0028;
    L_0x008f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.p.b(com.d.a.b.j, com.d.a.c.g, java.util.Map):void");
    }

    private Map<Object, Object> m18359c(C5303j c5303j, C5347g c5347g) {
        if (this.f20174i != null) {
            return m18361d(c5303j, c5347g);
        }
        if (this.f20173h != null) {
            return (Map) this.f20171f.mo1316a(c5347g, this.f20173h.mo1304a(c5303j, c5347g));
        }
        if (this.f20172g) {
            C1380m currentToken = c5303j.getCurrentToken();
            if (currentToken == C1380m.START_OBJECT || currentToken == C1380m.FIELD_NAME || currentToken == C1380m.END_OBJECT) {
                Map<Object, Object> map = (Map) this.f20171f.mo1300a(c5347g);
                if (this.f20168c) {
                    m18360c(c5303j, c5347g, map);
                    return map;
                }
                m18358b(c5303j, c5347g, map);
                return map;
            } else if (currentToken == C1380m.VALUE_STRING) {
                return (Map) this.f20171f.mo1317a(c5347g, c5303j.getText());
            } else {
                m11188y(c5303j, c5347g);
                return null;
            }
        }
        throw c5347g.m11441a(this.f20166a.m11531e(), "No default constructor found");
    }

    private void m18360c(com.p111d.p112a.p114b.C5303j r8, com.p111d.p112a.p121c.C5347g r9, java.util.Map<java.lang.Object, java.lang.Object> r10) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r7 = this;
        r0 = r7.f20169d;
        r1 = r7.f20170e;
        r2 = r0.mo1312d();
        if (r2 == 0) goto L_0x000c;
    L_0x000a:
        r2 = 1;
        goto L_0x000d;
    L_0x000c:
        r2 = 0;
    L_0x000d:
        if (r2 == 0) goto L_0x001f;
    L_0x000f:
        r3 = new com.d.a.c.c.b.p$b;
        r4 = r7.f20166a;
        r4 = r4.mo3394u();
        r4 = r4.m11531e();
        r3.<init>(r4, r10);
        goto L_0x0020;
    L_0x001f:
        r3 = 0;
    L_0x0020:
        r4 = r8.isExpectedStartObjectToken();
        if (r4 == 0) goto L_0x002b;
    L_0x0026:
        r4 = r8.nextFieldName();
        goto L_0x004b;
    L_0x002b:
        r4 = r8.getCurrentToken();
        r5 = com.p111d.p112a.p114b.C1380m.END_OBJECT;
        if (r4 != r5) goto L_0x0034;
    L_0x0033:
        return;
    L_0x0034:
        r5 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        if (r4 == r5) goto L_0x0047;
    L_0x0038:
        r10 = r7.f20166a;
        r10 = r10.m11531e();
        r8 = r8.getCurrentToken();
        r8 = r9.m11440a(r10, r8);
        throw r8;
    L_0x0047:
        r4 = r8.getCurrentName();
    L_0x004b:
        if (r4 == 0) goto L_0x0089;
    L_0x004d:
        r5 = r8.nextToken();
        r6 = r7.f20175j;
        if (r6 == 0) goto L_0x0061;
    L_0x0055:
        r6 = r7.f20175j;
        r6 = r6.contains(r4);
        if (r6 == 0) goto L_0x0061;
    L_0x005d:
        r8.skipChildren();
        goto L_0x0026;
    L_0x0061:
        r6 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
        if (r5 != r6) goto L_0x006a;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x0065:
        r5 = r0.mo2803a(r9);	 Catch:{ t -> 0x0084, Exception -> 0x007f }
        goto L_0x0075;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x006a:
        if (r1 != 0) goto L_0x0071;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x006c:
        r5 = r0.mo1304a(r8, r9);	 Catch:{ t -> 0x0084, Exception -> 0x007f }
        goto L_0x0075;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x0071:
        r5 = r0.mo1308a(r8, r9, r1);	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x0075:
        if (r2 == 0) goto L_0x007b;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x0077:
        r3.m3522a(r4, r5);	 Catch:{ t -> 0x0084, Exception -> 0x007f }
        goto L_0x0026;	 Catch:{ t -> 0x0084, Exception -> 0x007f }
    L_0x007b:
        r10.put(r4, r5);	 Catch:{ t -> 0x0084, Exception -> 0x007f }
        goto L_0x0026;
    L_0x007f:
        r5 = move-exception;
        com.p111d.p112a.p121c.p124c.p126b.C6475g.m15453a(r5, r10, r4);
        goto L_0x0026;
    L_0x0084:
        r5 = move-exception;
        com.p111d.p112a.p121c.p124c.p126b.C7064p.m18356a(r8, r3, r4, r5);
        goto L_0x0026;
    L_0x0089:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.p.c(com.d.a.b.j, com.d.a.c.g, java.util.Map):void");
    }

    private java.util.Map<java.lang.Object, java.lang.Object> m18361d(com.p111d.p112a.p114b.C5303j r10, com.p111d.p112a.p121c.C5347g r11) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r9 = this;
        r0 = r9.f20174i;
        r1 = 0;
        r2 = r0.m3495a(r10, r11, r1);
        r3 = r9.f20169d;
        r4 = r9.f20170e;
        r5 = r10.isExpectedStartObjectToken();
        if (r5 == 0) goto L_0x0016;
    L_0x0011:
        r5 = r10.nextFieldName();
        goto L_0x0024;
    L_0x0016:
        r5 = com.p111d.p112a.p114b.C1380m.FIELD_NAME;
        r5 = r10.hasToken(r5);
        if (r5 == 0) goto L_0x0023;
    L_0x001e:
        r5 = r10.getCurrentName();
        goto L_0x0024;
    L_0x0023:
        r5 = r1;
    L_0x0024:
        if (r5 == 0) goto L_0x008b;
    L_0x0026:
        r6 = r10.nextToken();
        r7 = r9.f20175j;
        if (r7 == 0) goto L_0x003a;
    L_0x002e:
        r7 = r9.f20175j;
        r7 = r7.contains(r5);
        if (r7 == 0) goto L_0x003a;
    L_0x0036:
        r10.skipChildren();
        goto L_0x0011;
    L_0x003a:
        r7 = r0.m3496a(r5);
        if (r7 == 0) goto L_0x0062;
    L_0x0040:
        r6 = r7.m15538a(r10, r11);
        r6 = r2.m3504a(r7, r6);
        if (r6 == 0) goto L_0x0011;
    L_0x004a:
        r10.nextToken();
        r0 = r0.m3497a(r11, r2);	 Catch:{ Exception -> 0x0057 }
        r0 = (java.util.Map) r0;	 Catch:{ Exception -> 0x0057 }
        r9.m18358b(r10, r11, r0);
        return r0;
    L_0x0057:
        r10 = move-exception;
        r11 = r9.f20166a;
        r11 = r11.m11531e();
        com.p111d.p112a.p121c.p124c.p126b.C6475g.m15453a(r10, r11, r5);
        return r1;
    L_0x0062:
        r7 = r9.f20167b;
        r7 = r7.mo1336a(r5, r11);
        r8 = com.p111d.p112a.p114b.C1380m.VALUE_NULL;	 Catch:{ Exception -> 0x0080 }
        if (r6 != r8) goto L_0x0071;	 Catch:{ Exception -> 0x0080 }
    L_0x006c:
        r6 = r3.mo2803a(r11);	 Catch:{ Exception -> 0x0080 }
        goto L_0x007c;	 Catch:{ Exception -> 0x0080 }
    L_0x0071:
        if (r4 != 0) goto L_0x0078;	 Catch:{ Exception -> 0x0080 }
    L_0x0073:
        r6 = r3.mo1304a(r10, r11);	 Catch:{ Exception -> 0x0080 }
        goto L_0x007c;	 Catch:{ Exception -> 0x0080 }
    L_0x0078:
        r6 = r3.mo1308a(r10, r11, r4);	 Catch:{ Exception -> 0x0080 }
    L_0x007c:
        r2.m3503a(r7, r6);
        goto L_0x0011;
    L_0x0080:
        r10 = move-exception;
        r11 = r9.f20166a;
        r11 = r11.m11531e();
        com.p111d.p112a.p121c.p124c.p126b.C6475g.m15453a(r10, r11, r5);
        return r1;
    L_0x008b:
        r10 = r0.m3497a(r11, r2);	 Catch:{ Exception -> 0x0092 }
        r10 = (java.util.Map) r10;	 Catch:{ Exception -> 0x0092 }
        return r10;
    L_0x0092:
        r10 = move-exception;
        r11 = r9.f20166a;
        r11 = r11.m11531e();
        com.p111d.p112a.p121c.p124c.p126b.C6475g.m15453a(r10, r11, r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.b.p.d(com.d.a.b.j, com.d.a.c.g):java.util.Map<java.lang.Object, java.lang.Object>");
    }

    public final C1507k<?> mo2801a(C5347g c5347g, C1446d c1446d) {
        HashSet hashSet;
        C1546p c1546p = this.f20167b;
        if (c1546p == null) {
            c1546p = c5347g.m11463c(this.f20166a.mo3398t());
        } else if (c1546p instanceof C1435j) {
            c1546p = ((C1435j) c1546p).m3545a();
        }
        C1546p c1546p2 = c1546p;
        C1507k c1507k = this.f20169d;
        if (c1446d != null) {
            c1507k = C5320x.m11162a(c5347g, c1446d, c1507k);
        }
        C5354j u = this.f20166a.mo3394u();
        C1507k a = c1507k == null ? c5347g.m11437a(u, c1446d) : c5347g.m11455b(c1507k, c1446d, u);
        C1475c c1475c = this.f20170e;
        if (c1475c != null) {
            c1475c = c1475c.mo2895a(c1446d);
        }
        C1475c c1475c2 = c1475c;
        Collection collection = this.f20175j;
        C5308b g = c5347g.m11468g();
        if (!(g == null || c1446d == null)) {
            C1449a c = c1446d.mo1354c();
            if (c != null) {
                int i = 0;
                String[] findPropertiesToIgnore = g.findPropertiesToIgnore(c, false);
                if (findPropertiesToIgnore != null) {
                    HashSet hashSet2 = collection == null ? new HashSet() : new HashSet(collection);
                    int length = findPropertiesToIgnore.length;
                    while (i < length) {
                        hashSet2.add(findPropertiesToIgnore[i]);
                        i++;
                    }
                    hashSet = hashSet2;
                    return (this.f20167b != c1546p2 && this.f20169d == a && this.f20170e == c1475c2 && this.f20175j == hashSet) ? this : new C7064p(this, c1546p2, a, c1475c2, hashSet);
                }
            }
        }
        hashSet = collection;
        if (this.f20167b != c1546p2) {
        }
    }

    public final /* synthetic */ Object mo1304a(C5303j c5303j, C5347g c5347g) {
        return m18359c(c5303j, c5347g);
    }

    public final Object mo1308a(C5303j c5303j, C5347g c5347g, C1475c c1475c) {
        return c1475c.mo2896a(c5303j, c5347g);
    }

    public final void m18366a(String[] strArr) {
        HashSet a;
        if (strArr != null) {
            if (strArr.length != 0) {
                a = C1519b.m3936a(strArr);
                this.f20175j = a;
            }
        }
        a = null;
        this.f20175j = a;
    }

    public final boolean mo1311b() {
        return this.f20169d == null && this.f20167b == null && this.f20170e == null && this.f20175j == null;
    }

    public final void mo2802c(C5347g c5347g) {
        if (this.f20171f.mo1327i()) {
            C5354j l = this.f20171f.mo1330l();
            if (l == null) {
                StringBuilder stringBuilder = new StringBuilder("Invalid delegate-creator definition for ");
                stringBuilder.append(this.f20166a);
                stringBuilder.append(": value instantiator (");
                stringBuilder.append(this.f20171f.getClass().getName());
                stringBuilder.append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.f20173h = c5347g.m11437a(l, null);
        }
        if (this.f20171f.mo1329k()) {
            this.f20174i = C1417o.m3494a(c5347g, this.f20171f, this.f20171f.mo1320a(c5347g.m11460c()));
        }
        this.f20168c = C7064p.m18357a(this.f20166a, this.f20167b);
    }

    public final C1507k<Object> mo3344f() {
        return this.f20169d;
    }
}
