package com.google.android.gms.internal;

public final class nn extends oc<nn> {
    public String f18351a;
    public String f18352b;
    public nm f18353c;
    public Integer f18354d;
    public no[] f18355e;
    private np f18356f;

    public nn() {
        this.f18351a = null;
        this.f18352b = null;
        this.f18353c = null;
        this.f18356f = null;
        this.f18354d = null;
        this.f18355e = no.m16735a();
        this.H = null;
        this.I = -1;
    }

    private final com.google.android.gms.internal.nn m16731b(com.google.android.gms.internal.nz r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m5049a();
        if (r0 == 0) goto L_0x00c7;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x00bf;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x00b7;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x00a5;
    L_0x0012:
        r1 = 34;
        if (r0 == r1) goto L_0x0097;
    L_0x0016:
        r1 = 40;
        if (r0 == r1) goto L_0x0063;
    L_0x001a:
        r1 = 50;
        if (r0 == r1) goto L_0x0025;
    L_0x001e:
        r0 = super.m12032a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0024:
        return r6;
    L_0x0025:
        r0 = com.google.android.gms.internal.ol.m5135a(r7, r1);
        r1 = r6.f18355e;
        r2 = 0;
        if (r1 != 0) goto L_0x0030;
    L_0x002e:
        r1 = r2;
        goto L_0x0033;
    L_0x0030:
        r1 = r6.f18355e;
        r1 = r1.length;
    L_0x0033:
        r0 = r0 + r1;
        r0 = new com.google.android.gms.internal.no[r0];
        if (r1 == 0) goto L_0x003d;
    L_0x0038:
        r3 = r6.f18355e;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x003d:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x0054;
    L_0x0042:
        r2 = new com.google.android.gms.internal.no;
        r2.<init>();
        r0[r1] = r2;
        r2 = r0[r1];
        r7.m5052a(r2);
        r7.m5049a();
        r1 = r1 + 1;
        goto L_0x003d;
    L_0x0054:
        r2 = new com.google.android.gms.internal.no;
        r2.<init>();
        r0[r1] = r2;
        r1 = r0[r1];
        r7.m5052a(r1);
        r6.f18355e = r0;
        goto L_0x0000;
    L_0x0063:
        r1 = r7.m5067l();
        r2 = r7.m5062g();	 Catch:{ IllegalArgumentException -> 0x008f }
        switch(r2) {
            case 0: goto L_0x0071;
            case 1: goto L_0x0071;
            case 2: goto L_0x0071;
            case 3: goto L_0x0071;
            default: goto L_0x006e;
        };	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x006e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008f }
        goto L_0x0078;	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x0071:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        r6.f18354d = r2;	 Catch:{ IllegalArgumentException -> 0x008f }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x0078:
        r4 = 55;	 Catch:{ IllegalArgumentException -> 0x008f }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008f }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x008f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        r2 = " is not a valid enum ApplicationProcessState";	 Catch:{ IllegalArgumentException -> 0x008f }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x008f }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x008f }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x008f }
    L_0x008f:
        r7.m5060e(r1);
        r6.m12032a(r7, r0);
        goto L_0x0000;
    L_0x0097:
        r0 = r6.f18356f;
        if (r0 != 0) goto L_0x00a2;
    L_0x009b:
        r0 = new com.google.android.gms.internal.np;
        r0.<init>();
        r6.f18356f = r0;
    L_0x00a2:
        r0 = r6.f18356f;
        goto L_0x00b2;
    L_0x00a5:
        r0 = r6.f18353c;
        if (r0 != 0) goto L_0x00b0;
    L_0x00a9:
        r0 = new com.google.android.gms.internal.nm;
        r0.<init>();
        r6.f18353c = r0;
    L_0x00b0:
        r0 = r6.f18353c;
    L_0x00b2:
        r7.m5052a(r0);
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.m5059e();
        r6.f18352b = r0;
        goto L_0x0000;
    L_0x00bf:
        r0 = r7.m5059e();
        r6.f18351a = r0;
        goto L_0x0000;
    L_0x00c7:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nn.b(com.google.android.gms.internal.nz):com.google.android.gms.internal.nn");
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        return m16731b(nzVar);
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18351a != null) {
            oaVar.m5091a(1, this.f18351a);
        }
        if (this.f18352b != null) {
            oaVar.m5091a(2, this.f18352b);
        }
        if (this.f18353c != null) {
            oaVar.m5090a(3, this.f18353c);
        }
        if (this.f18356f != null) {
            oaVar.m5090a(4, this.f18356f);
        }
        if (this.f18354d != null) {
            oaVar.m5088a(5, this.f18354d.intValue());
        }
        if (this.f18355e != null && this.f18355e.length > 0) {
            for (oi oiVar : this.f18355e) {
                if (oiVar != null) {
                    oaVar.m5090a(6, oiVar);
                }
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18351a != null) {
            b += oa.m5077b(1, this.f18351a);
        }
        if (this.f18352b != null) {
            b += oa.m5077b(2, this.f18352b);
        }
        if (this.f18353c != null) {
            b += oa.m5076b(3, this.f18353c);
        }
        if (this.f18356f != null) {
            b += oa.m5076b(4, this.f18356f);
        }
        if (this.f18354d != null) {
            b += oa.m5075b(5, this.f18354d.intValue());
        }
        if (this.f18355e != null && this.f18355e.length > 0) {
            for (oi oiVar : this.f18355e) {
                if (oiVar != null) {
                    b += oa.m5076b(6, oiVar);
                }
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        if (this.f18351a == null) {
            if (nnVar.f18351a != null) {
                return false;
            }
        } else if (!this.f18351a.equals(nnVar.f18351a)) {
            return false;
        }
        if (this.f18352b == null) {
            if (nnVar.f18352b != null) {
                return false;
            }
        } else if (!this.f18352b.equals(nnVar.f18352b)) {
            return false;
        }
        if (this.f18353c == null) {
            if (nnVar.f18353c != null) {
                return false;
            }
        } else if (!this.f18353c.equals(nnVar.f18353c)) {
            return false;
        }
        if (this.f18356f == null) {
            if (nnVar.f18356f != null) {
                return false;
            }
        } else if (!this.f18356f.equals(nnVar.f18356f)) {
            return false;
        }
        if (this.f18354d == null) {
            if (nnVar.f18354d != null) {
                return false;
            }
        } else if (!this.f18354d.equals(nnVar.f18354d)) {
            return false;
        }
        if (!og.m5116a(this.f18355e, nnVar.f18355e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nnVar.H);
            }
        }
        return nnVar.H == null || nnVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((527 + getClass().getName().hashCode()) * 31) + (this.f18351a == null ? 0 : this.f18351a.hashCode())) * 31) + (this.f18352b == null ? 0 : this.f18352b.hashCode());
        nm nmVar = this.f18353c;
        hashCode = (hashCode * 31) + (nmVar == null ? 0 : nmVar.hashCode());
        np npVar = this.f18356f;
        hashCode = ((((((hashCode * 31) + (npVar == null ? 0 : npVar.hashCode())) * 31) + (this.f18354d == null ? 0 : this.f18354d.intValue())) * 31) + og.m5111a(this.f18355e)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
