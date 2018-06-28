package p050b;

final class C4987g extends C0851i {
    protected C0848e f13875a;
    private C0851i[] f13876n = null;

    C4987g(String str, C0848e c0848e) {
        super(str);
        this.f13875a = c0848e;
    }

    public final C0848e mo911a() {
        return this.f13875a;
    }

    public final boolean mo912a(C0851i c0851i) {
        if (super.mo912a(c0851i) || c0851i.m1999m().equals("java.lang.Object")) {
            return true;
        }
        C0851i[] d = mo915d();
        for (C0851i a : d) {
            if (a.mo912a(c0851i)) {
                return true;
            }
        }
        return c0851i.mo913b() && mo916e().mo912a(c0851i.mo916e());
    }

    public final boolean mo913b() {
        return true;
    }

    public final int mo914c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 16;
        r1 = r2.mo916e();	 Catch:{ w -> 0x000d }
        r1 = r1.mo914c();	 Catch:{ w -> 0x000d }
        r1 = r1 & 7;
        r0 = r0 | r1;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g.c():int");
    }

    public final C0851i[] mo915d() {
        if (this.f13876n == null) {
            Class[] interfaces = Object[].class.getInterfaces();
            this.f13876n = new C0851i[interfaces.length];
            for (int i = 0; i < interfaces.length; i++) {
                this.f13876n[i] = this.f13875a.m1965a(interfaces[i].getName());
            }
        }
        return this.f13876n;
    }

    public final C0851i mo916e() {
        String m = m1999m();
        return this.f13875a.m1965a(m.substring(0, m.length() - 2));
    }

    public final C0851i mo917f() {
        return this.f13875a.m1965a("java.lang.Object");
    }
}
