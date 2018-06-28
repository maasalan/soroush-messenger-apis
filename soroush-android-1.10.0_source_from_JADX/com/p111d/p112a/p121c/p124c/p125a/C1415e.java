package com.p111d.p112a.p121c.p124c.p125a;

import com.p111d.p112a.p114b.C1380m;
import com.p111d.p112a.p114b.C5303j;
import com.p111d.p112a.p121c.C5347g;
import com.p111d.p112a.p121c.p124c.C6488s;
import com.p111d.p112a.p121c.p131i.C1475c;
import com.p111d.p112a.p121c.p138m.C6523u;
import java.util.ArrayList;
import java.util.HashMap;

public final class C1415e {
    public final C1414b[] f4471a;
    public final HashMap<String, Integer> f4472b;
    public final String[] f4473c;
    public final C6523u[] f4474d;

    public static class C1413a {
        private final ArrayList<C1414b> f4466a = new ArrayList();
        private final HashMap<String, Integer> f4467b = new HashMap();

        public final C1415e m3481a() {
            return new C1415e((C1414b[]) this.f4466a.toArray(new C1414b[this.f4466a.size()]), this.f4467b);
        }

        public final void m3482a(C6488s c6488s, C1475c c1475c) {
            Integer valueOf = Integer.valueOf(this.f4466a.size());
            this.f4466a.add(new C1414b(c6488s, c1475c));
            this.f4467b.put(c6488s.m15554f(), valueOf);
            this.f4467b.put(c1475c.mo1452b(), valueOf);
        }
    }

    private static final class C1414b {
        public final C6488s f4468a;
        public final String f4469b;
        private final C1475c f4470c;

        public C1414b(C6488s c6488s, C1475c c1475c) {
            this.f4468a = c6488s;
            this.f4470c = c1475c;
            this.f4469b = c1475c.mo1452b();
        }

        public final boolean m3483a() {
            return this.f4470c.mo1454d() != null;
        }

        public final boolean m3484a(String str) {
            return str.equals(this.f4469b);
        }

        public final String m3485b() {
            Class d = this.f4470c.mo1454d();
            return d == null ? null : this.f4470c.mo1453c().mo2914a(null, d);
        }
    }

    private C1415e(C1415e c1415e) {
        this.f4471a = c1415e.f4471a;
        this.f4472b = c1415e.f4472b;
        int length = this.f4471a.length;
        this.f4473c = new String[length];
        this.f4474d = new C6523u[length];
    }

    protected C1415e(C1414b[] c1414bArr, HashMap<String, Integer> hashMap) {
        this.f4471a = c1414bArr;
        this.f4472b = hashMap;
        this.f4473c = null;
        this.f4474d = null;
    }

    public final C1415e m3486a() {
        return new C1415e(this);
    }

    public final Object m3487a(C5303j c5303j, C5347g c5347g, Object obj) {
        int length = this.f4471a.length;
        for (int i = 0; i < length; i++) {
            String str = this.f4473c[i];
            if (str == null) {
                C6523u c6523u = this.f4474d[i];
                if (c6523u != null) {
                    C1380m b = c6523u.m15745b();
                    if (b != null && b.f4397v) {
                        C5303j a = c6523u.m15743a(c5303j);
                        a.nextToken();
                        C6488s c6488s = this.f4471a[i].f4468a;
                        Object a2 = C1475c.m3771a(a, c6488s.mo1350a());
                        if (a2 != null) {
                            c6488s.mo3336a(obj, a2);
                        } else if (this.f4471a[i].m3483a()) {
                            str = this.f4471a[i].m3485b();
                        } else {
                            throw c5347g.m11446a("Missing external type id property '%s'", this.f4471a[i].f4469b);
                        }
                    }
                }
                continue;
            } else if (this.f4474d[i] == null) {
                throw c5347g.m11446a("Missing property '%s' for external type id '%s'", this.f4471a[i].f4468a.m15554f(), this.f4471a[i].f4469b);
            }
            m3488a(c5303j, c5347g, obj, i, str);
        }
        return obj;
    }

    public final void m3488a(C5303j c5303j, C5347g c5347g, Object obj, int i, String str) {
        C5303j a = this.f4474d[i].m15743a(c5303j);
        if (a.nextToken() == C1380m.VALUE_NULL) {
            this.f4471a[i].f4468a.mo3336a(obj, null);
            return;
        }
        C6523u c6523u = new C6523u(c5303j, c5347g);
        c6523u.writeStartArray();
        c6523u.writeString(str);
        c6523u.copyCurrentStructure(a);
        c6523u.writeEndArray();
        c5303j = c6523u.m15743a(c5303j);
        c5303j.nextToken();
        this.f4471a[i].f4468a.mo3335a(c5303j, c5347g, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m3489a(com.p111d.p112a.p114b.C5303j r10, com.p111d.p112a.p121c.C5347g r11, java.lang.String r12, java.lang.Object r13) {
        /*
        r9 = this;
        r0 = r9.f4472b;
        r0 = r0.get(r12);
        r0 = (java.lang.Integer) r0;
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = r0.intValue();
        r2 = r9.f4471a;
        r2 = r2[r0];
        r12 = r2.m3484a(r12);
        r8 = 1;
        if (r12 == 0) goto L_0x0030;
    L_0x001b:
        r12 = r9.f4473c;
        r2 = r10.getText();
        r12[r0] = r2;
        r10.skipChildren();
        if (r13 == 0) goto L_0x0045;
    L_0x0028:
        r12 = r9.f4474d;
        r12 = r12[r0];
        if (r12 == 0) goto L_0x0045;
    L_0x002e:
        r1 = r8;
        goto L_0x0045;
    L_0x0030:
        r12 = new com.d.a.c.m.u;
        r12.<init>(r10, r11);
        r12.copyCurrentStructure(r10);
        r2 = r9.f4474d;
        r2[r0] = r12;
        if (r13 == 0) goto L_0x0045;
    L_0x003e:
        r12 = r9.f4473c;
        r12 = r12[r0];
        if (r12 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x002e;
    L_0x0045:
        if (r1 == 0) goto L_0x005c;
    L_0x0047:
        r12 = r9.f4473c;
        r7 = r12[r0];
        r12 = r9.f4473c;
        r1 = 0;
        r12[r0] = r1;
        r2 = r9;
        r3 = r10;
        r4 = r11;
        r5 = r13;
        r6 = r0;
        r2.m3488a(r3, r4, r5, r6, r7);
        r10 = r9.f4474d;
        r10[r0] = r1;
    L_0x005c:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.d.a.c.c.a.e.a(com.d.a.b.j, com.d.a.c.g, java.lang.String, java.lang.Object):boolean");
    }
}
