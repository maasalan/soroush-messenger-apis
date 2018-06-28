package com.google.android.gms.internal;

public final class nq extends oc<nq> {
    public String f18364a;
    public Integer f18365b;
    public Long f18366c;
    public Long f18367d;
    public Integer f18368e;
    public Integer f18369f;
    public String f18370g;
    public Long f18371h;
    public Long f18372i;
    public Long f18373j;
    public Long f18374k;
    public nr[] f18375l;

    public nq() {
        this.f18364a = null;
        this.f18365b = null;
        this.f18366c = null;
        this.f18367d = null;
        this.f18368e = null;
        this.f18369f = null;
        this.f18370g = null;
        this.f18371h = null;
        this.f18372i = null;
        this.f18373j = null;
        this.f18374k = null;
        this.f18375l = nr.m16746a();
        this.H = null;
        this.I = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.nq m16742b(com.google.android.gms.internal.nz r7) {
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
        switch(r0) {
            case 0: goto L_0x0113;
            case 10: goto L_0x010b;
            case 16: goto L_0x00d6;
            case 24: goto L_0x00ca;
            case 32: goto L_0x00be;
            case 40: goto L_0x00b2;
            case 50: goto L_0x00aa;
            case 56: goto L_0x009e;
            case 64: goto L_0x0092;
            case 72: goto L_0x0086;
            case 80: goto L_0x007a;
            case 88: goto L_0x004e;
            case 98: goto L_0x000e;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = super.m12032a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000d:
        return r6;
    L_0x000e:
        r0 = 98;
        r0 = com.google.android.gms.internal.ol.m5135a(r7, r0);
        r1 = r6.f18375l;
        r2 = 0;
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        r1 = r2;
        goto L_0x001e;
    L_0x001b:
        r1 = r6.f18375l;
        r1 = r1.length;
    L_0x001e:
        r0 = r0 + r1;
        r0 = new com.google.android.gms.internal.nr[r0];
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.f18375l;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x0028:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x003f;
    L_0x002d:
        r2 = new com.google.android.gms.internal.nr;
        r2.<init>();
        r0[r1] = r2;
        r2 = r0[r1];
        r7.m5052a(r2);
        r7.m5049a();
        r1 = r1 + 1;
        goto L_0x0028;
    L_0x003f:
        r2 = new com.google.android.gms.internal.nr;
        r2.<init>();
        r0[r1] = r2;
        r1 = r0[r1];
        r7.m5052a(r1);
        r6.f18375l = r0;
        goto L_0x0000;
    L_0x004e:
        r1 = r7.m5067l();
        r2 = r7.m5062g();	 Catch:{ IllegalArgumentException -> 0x0103 }
        switch(r2) {
            case 0: goto L_0x005c;
            case 1: goto L_0x005c;
            default: goto L_0x0059;
        };	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x0059:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0103 }
        goto L_0x0063;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x005c:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r6.f18368e = r2;	 Catch:{ IllegalArgumentException -> 0x0103 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x0063:
        r4 = 56;	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r2 = " is not a valid enum NetworkClientErrorReason";	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0103 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x007a:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18374k = r0;
        goto L_0x0000;
    L_0x0086:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18373j = r0;
        goto L_0x0000;
    L_0x0092:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18372i = r0;
        goto L_0x0000;
    L_0x009e:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18371h = r0;
        goto L_0x0000;
    L_0x00aa:
        r0 = r7.m5059e();
        r6.f18370g = r0;
        goto L_0x0000;
    L_0x00b2:
        r0 = r7.m5062g();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f18369f = r0;
        goto L_0x0000;
    L_0x00be:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18367d = r0;
        goto L_0x0000;
    L_0x00ca:
        r0 = r7.m5063h();
        r0 = java.lang.Long.valueOf(r0);
        r6.f18366c = r0;
        goto L_0x0000;
    L_0x00d6:
        r1 = r7.m5067l();
        r2 = r7.m5062g();	 Catch:{ IllegalArgumentException -> 0x0103 }
        switch(r2) {
            case 0: goto L_0x00e4;
            case 1: goto L_0x00e4;
            case 2: goto L_0x00e4;
            case 3: goto L_0x00e4;
            case 4: goto L_0x00e4;
            case 5: goto L_0x00e4;
            case 6: goto L_0x00e4;
            case 7: goto L_0x00e4;
            case 8: goto L_0x00e4;
            case 9: goto L_0x00e4;
            default: goto L_0x00e1;
        };	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x00e1:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0103 }
        goto L_0x00ec;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x00e4:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r6.f18365b = r2;	 Catch:{ IllegalArgumentException -> 0x0103 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x00ec:
        r4 = 42;	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r2 = " is not a valid enum HttpMethod";	 Catch:{ IllegalArgumentException -> 0x0103 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0103 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0103 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0103 }
    L_0x0103:
        r7.m5060e(r1);
        r6.m12032a(r7, r0);
        goto L_0x0000;
    L_0x010b:
        r0 = r7.m5059e();
        r6.f18364a = r0;
        goto L_0x0000;
    L_0x0113:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nq.b(com.google.android.gms.internal.nz):com.google.android.gms.internal.nq");
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        return m16742b(nzVar);
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18364a != null) {
            oaVar.m5091a(1, this.f18364a);
        }
        if (this.f18365b != null) {
            oaVar.m5088a(2, this.f18365b.intValue());
        }
        if (this.f18366c != null) {
            oaVar.m5097b(3, this.f18366c.longValue());
        }
        if (this.f18367d != null) {
            oaVar.m5097b(4, this.f18367d.longValue());
        }
        if (this.f18369f != null) {
            oaVar.m5088a(5, this.f18369f.intValue());
        }
        if (this.f18370g != null) {
            oaVar.m5091a(6, this.f18370g);
        }
        if (this.f18371h != null) {
            oaVar.m5097b(7, this.f18371h.longValue());
        }
        if (this.f18372i != null) {
            oaVar.m5097b(8, this.f18372i.longValue());
        }
        if (this.f18373j != null) {
            oaVar.m5097b(9, this.f18373j.longValue());
        }
        if (this.f18374k != null) {
            oaVar.m5097b(10, this.f18374k.longValue());
        }
        if (this.f18368e != null) {
            oaVar.m5088a(11, this.f18368e.intValue());
        }
        if (this.f18375l != null && this.f18375l.length > 0) {
            for (oi oiVar : this.f18375l) {
                if (oiVar != null) {
                    oaVar.m5090a(12, oiVar);
                }
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18364a != null) {
            b += oa.m5077b(1, this.f18364a);
        }
        if (this.f18365b != null) {
            b += oa.m5075b(2, this.f18365b.intValue());
        }
        if (this.f18366c != null) {
            b += oa.m5082c(3, this.f18366c.longValue());
        }
        if (this.f18367d != null) {
            b += oa.m5082c(4, this.f18367d.longValue());
        }
        if (this.f18369f != null) {
            b += oa.m5075b(5, this.f18369f.intValue());
        }
        if (this.f18370g != null) {
            b += oa.m5077b(6, this.f18370g);
        }
        if (this.f18371h != null) {
            b += oa.m5082c(7, this.f18371h.longValue());
        }
        if (this.f18372i != null) {
            b += oa.m5082c(8, this.f18372i.longValue());
        }
        if (this.f18373j != null) {
            b += oa.m5082c(9, this.f18373j.longValue());
        }
        if (this.f18374k != null) {
            b += oa.m5082c(10, this.f18374k.longValue());
        }
        if (this.f18368e != null) {
            b += oa.m5075b(11, this.f18368e.intValue());
        }
        if (this.f18375l != null && this.f18375l.length > 0) {
            for (oi oiVar : this.f18375l) {
                if (oiVar != null) {
                    b += oa.m5076b(12, oiVar);
                }
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        if (this.f18364a == null) {
            if (nqVar.f18364a != null) {
                return false;
            }
        } else if (!this.f18364a.equals(nqVar.f18364a)) {
            return false;
        }
        if (this.f18365b == null) {
            if (nqVar.f18365b != null) {
                return false;
            }
        } else if (!this.f18365b.equals(nqVar.f18365b)) {
            return false;
        }
        if (this.f18366c == null) {
            if (nqVar.f18366c != null) {
                return false;
            }
        } else if (!this.f18366c.equals(nqVar.f18366c)) {
            return false;
        }
        if (this.f18367d == null) {
            if (nqVar.f18367d != null) {
                return false;
            }
        } else if (!this.f18367d.equals(nqVar.f18367d)) {
            return false;
        }
        if (this.f18368e == null) {
            if (nqVar.f18368e != null) {
                return false;
            }
        } else if (!this.f18368e.equals(nqVar.f18368e)) {
            return false;
        }
        if (this.f18369f == null) {
            if (nqVar.f18369f != null) {
                return false;
            }
        } else if (!this.f18369f.equals(nqVar.f18369f)) {
            return false;
        }
        if (this.f18370g == null) {
            if (nqVar.f18370g != null) {
                return false;
            }
        } else if (!this.f18370g.equals(nqVar.f18370g)) {
            return false;
        }
        if (this.f18371h == null) {
            if (nqVar.f18371h != null) {
                return false;
            }
        } else if (!this.f18371h.equals(nqVar.f18371h)) {
            return false;
        }
        if (this.f18372i == null) {
            if (nqVar.f18372i != null) {
                return false;
            }
        } else if (!this.f18372i.equals(nqVar.f18372i)) {
            return false;
        }
        if (this.f18373j == null) {
            if (nqVar.f18373j != null) {
                return false;
            }
        } else if (!this.f18373j.equals(nqVar.f18373j)) {
            return false;
        }
        if (this.f18374k == null) {
            if (nqVar.f18374k != null) {
                return false;
            }
        } else if (!this.f18374k.equals(nqVar.f18374k)) {
            return false;
        }
        if (!og.m5116a(this.f18375l, nqVar.f18375l)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(nqVar.H);
            }
        }
        return nqVar.H == null || nqVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18364a == null ? 0 : this.f18364a.hashCode())) * 31) + (this.f18365b == null ? 0 : this.f18365b.intValue())) * 31) + (this.f18366c == null ? 0 : this.f18366c.hashCode())) * 31) + (this.f18367d == null ? 0 : this.f18367d.hashCode())) * 31) + (this.f18368e == null ? 0 : this.f18368e.intValue())) * 31) + (this.f18369f == null ? 0 : this.f18369f.hashCode())) * 31) + (this.f18370g == null ? 0 : this.f18370g.hashCode())) * 31) + (this.f18371h == null ? 0 : this.f18371h.hashCode())) * 31) + (this.f18372i == null ? 0 : this.f18372i.hashCode())) * 31) + (this.f18373j == null ? 0 : this.f18373j.hashCode())) * 31) + (this.f18374k == null ? 0 : this.f18374k.hashCode())) * 31) + og.m5111a(this.f18375l)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
