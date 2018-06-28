package com.google.android.gms.internal;

public final class ka extends oc<ka> {
    public Integer f18246a;
    public String f18247b;
    public Boolean f18248c;
    public String[] f18249d;

    public ka() {
        this.f18246a = null;
        this.f18247b = null;
        this.f18248c = null;
        this.f18249d = ol.f6261e;
        this.H = null;
        this.I = -1;
    }

    private final com.google.android.gms.internal.ka m16662b(com.google.android.gms.internal.nz r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m5049a();
        if (r0 == 0) goto L_0x0095;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0061;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x005a;
    L_0x000e:
        r1 = 24;
        if (r0 == r1) goto L_0x004f;
    L_0x0012:
        r1 = 34;
        if (r0 == r1) goto L_0x001d;
    L_0x0016:
        r0 = super.m12032a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001c:
        return r6;
    L_0x001d:
        r0 = com.google.android.gms.internal.ol.m5135a(r7, r1);
        r1 = r6.f18249d;
        r2 = 0;
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        r1 = r2;
        goto L_0x002b;
    L_0x0028:
        r1 = r6.f18249d;
        r1 = r1.length;
    L_0x002b:
        r0 = r0 + r1;
        r0 = new java.lang.String[r0];
        if (r1 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r6.f18249d;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x0035:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x0046;
    L_0x003a:
        r2 = r7.m5059e();
        r0[r1] = r2;
        r7.m5049a();
        r1 = r1 + 1;
        goto L_0x0035;
    L_0x0046:
        r2 = r7.m5059e();
        r0[r1] = r2;
        r6.f18249d = r0;
        goto L_0x0000;
    L_0x004f:
        r0 = r7.m5058d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f18248c = r0;
        goto L_0x0000;
    L_0x005a:
        r0 = r7.m5059e();
        r6.f18247b = r0;
        goto L_0x0000;
    L_0x0061:
        r1 = r7.m5067l();
        r2 = r7.m5062g();	 Catch:{ IllegalArgumentException -> 0x008d }
        switch(r2) {
            case 0: goto L_0x006f;
            case 1: goto L_0x006f;
            case 2: goto L_0x006f;
            case 3: goto L_0x006f;
            case 4: goto L_0x006f;
            case 5: goto L_0x006f;
            case 6: goto L_0x006f;
            default: goto L_0x006c;
        };	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x006c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008d }
        goto L_0x0076;	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x006f:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x008d }
        r6.f18246a = r2;	 Catch:{ IllegalArgumentException -> 0x008d }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x0076:
        r4 = 41;	 Catch:{ IllegalArgumentException -> 0x008d }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x008d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008d }
        r2 = " is not a valid enum MatchType";	 Catch:{ IllegalArgumentException -> 0x008d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008d }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x008d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x008d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x008d:
        r7.m5060e(r1);
        r6.m12032a(r7, r0);
        goto L_0x0000;
    L_0x0095:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ka.b(com.google.android.gms.internal.nz):com.google.android.gms.internal.ka");
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        return m16662b(nzVar);
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18246a != null) {
            oaVar.m5088a(1, this.f18246a.intValue());
        }
        if (this.f18247b != null) {
            oaVar.m5091a(2, this.f18247b);
        }
        if (this.f18248c != null) {
            oaVar.m5092a(3, this.f18248c.booleanValue());
        }
        if (this.f18249d != null && this.f18249d.length > 0) {
            for (String str : this.f18249d) {
                if (str != null) {
                    oaVar.m5091a(4, str);
                }
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18246a != null) {
            b += oa.m5075b(1, this.f18246a.intValue());
        }
        if (this.f18247b != null) {
            b += oa.m5077b(2, this.f18247b);
        }
        if (this.f18248c != null) {
            this.f18248c.booleanValue();
            b += oa.m5081c(24) + 1;
        }
        if (this.f18249d == null || this.f18249d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        int i3 = i2;
        while (i < this.f18249d.length) {
            String str = this.f18249d[i];
            if (str != null) {
                i3++;
                i2 += oa.m5071a(str);
            }
            i++;
        }
        return (b + i2) + (1 * i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        if (this.f18246a == null) {
            if (kaVar.f18246a != null) {
                return false;
            }
        } else if (!this.f18246a.equals(kaVar.f18246a)) {
            return false;
        }
        if (this.f18247b == null) {
            if (kaVar.f18247b != null) {
                return false;
            }
        } else if (!this.f18247b.equals(kaVar.f18247b)) {
            return false;
        }
        if (this.f18248c == null) {
            if (kaVar.f18248c != null) {
                return false;
            }
        } else if (!this.f18248c.equals(kaVar.f18248c)) {
            return false;
        }
        if (!og.m5116a(this.f18249d, kaVar.f18249d)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kaVar.H);
            }
        }
        return kaVar.H == null || kaVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18246a == null ? 0 : this.f18246a.intValue())) * 31) + (this.f18247b == null ? 0 : this.f18247b.hashCode())) * 31) + (this.f18248c == null ? 0 : this.f18248c.hashCode())) * 31) + og.m5111a(this.f18249d)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
