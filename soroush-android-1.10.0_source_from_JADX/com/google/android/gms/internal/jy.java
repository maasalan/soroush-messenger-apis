package com.google.android.gms.internal;

public final class jy extends oc<jy> {
    public Integer f18237a;
    public Boolean f18238b;
    public String f18239c;
    public String f18240d;
    public String f18241e;

    public jy() {
        this.f18237a = null;
        this.f18238b = null;
        this.f18239c = null;
        this.f18240d = null;
        this.f18241e = null;
        this.H = null;
        this.I = -1;
    }

    private final com.google.android.gms.internal.jy m16654b(com.google.android.gms.internal.nz r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m5049a();
        if (r0 == 0) goto L_0x0074;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0041;
    L_0x000a:
        r1 = 16;
        if (r0 == r1) goto L_0x0036;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x002f;
    L_0x0012:
        r1 = 34;
        if (r0 == r1) goto L_0x0028;
    L_0x0016:
        r1 = 42;
        if (r0 == r1) goto L_0x0021;
    L_0x001a:
        r0 = super.m12032a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0020:
        return r6;
    L_0x0021:
        r0 = r7.m5059e();
        r6.f18241e = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m5059e();
        r6.f18240d = r0;
        goto L_0x0000;
    L_0x002f:
        r0 = r7.m5059e();
        r6.f18239c = r0;
        goto L_0x0000;
    L_0x0036:
        r0 = r7.m5058d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f18238b = r0;
        goto L_0x0000;
    L_0x0041:
        r1 = r7.m5067l();
        r2 = r7.m5062g();	 Catch:{ IllegalArgumentException -> 0x006d }
        switch(r2) {
            case 0: goto L_0x004f;
            case 1: goto L_0x004f;
            case 2: goto L_0x004f;
            case 3: goto L_0x004f;
            case 4: goto L_0x004f;
            default: goto L_0x004c;
        };	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x004c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006d }
        goto L_0x0056;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x004f:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006d }
        r6.f18237a = r2;	 Catch:{ IllegalArgumentException -> 0x006d }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0056:
        r4 = 46;	 Catch:{ IllegalArgumentException -> 0x006d }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = " is not a valid enum ComparisonType";	 Catch:{ IllegalArgumentException -> 0x006d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006d }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x006d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r7.m5060e(r1);
        r6.m12032a(r7, r0);
        goto L_0x0000;
    L_0x0074:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.jy.b(com.google.android.gms.internal.nz):com.google.android.gms.internal.jy");
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        return m16654b(nzVar);
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18237a != null) {
            oaVar.m5088a(1, this.f18237a.intValue());
        }
        if (this.f18238b != null) {
            oaVar.m5092a(2, this.f18238b.booleanValue());
        }
        if (this.f18239c != null) {
            oaVar.m5091a(3, this.f18239c);
        }
        if (this.f18240d != null) {
            oaVar.m5091a(4, this.f18240d);
        }
        if (this.f18241e != null) {
            oaVar.m5091a(5, this.f18241e);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18237a != null) {
            b += oa.m5075b(1, this.f18237a.intValue());
        }
        if (this.f18238b != null) {
            this.f18238b.booleanValue();
            b += oa.m5081c(16) + 1;
        }
        if (this.f18239c != null) {
            b += oa.m5077b(3, this.f18239c);
        }
        if (this.f18240d != null) {
            b += oa.m5077b(4, this.f18240d);
        }
        return this.f18241e != null ? b + oa.m5077b(5, this.f18241e) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jy)) {
            return false;
        }
        jy jyVar = (jy) obj;
        if (this.f18237a == null) {
            if (jyVar.f18237a != null) {
                return false;
            }
        } else if (!this.f18237a.equals(jyVar.f18237a)) {
            return false;
        }
        if (this.f18238b == null) {
            if (jyVar.f18238b != null) {
                return false;
            }
        } else if (!this.f18238b.equals(jyVar.f18238b)) {
            return false;
        }
        if (this.f18239c == null) {
            if (jyVar.f18239c != null) {
                return false;
            }
        } else if (!this.f18239c.equals(jyVar.f18239c)) {
            return false;
        }
        if (this.f18240d == null) {
            if (jyVar.f18240d != null) {
                return false;
            }
        } else if (!this.f18240d.equals(jyVar.f18240d)) {
            return false;
        }
        if (this.f18241e == null) {
            if (jyVar.f18241e != null) {
                return false;
            }
        } else if (!this.f18241e.equals(jyVar.f18241e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(jyVar.H);
            }
        }
        return jyVar.H == null || jyVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18237a == null ? 0 : this.f18237a.intValue())) * 31) + (this.f18238b == null ? 0 : this.f18238b.hashCode())) * 31) + (this.f18239c == null ? 0 : this.f18239c.hashCode())) * 31) + (this.f18240d == null ? 0 : this.f18240d.hashCode())) * 31) + (this.f18241e == null ? 0 : this.f18241e.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
