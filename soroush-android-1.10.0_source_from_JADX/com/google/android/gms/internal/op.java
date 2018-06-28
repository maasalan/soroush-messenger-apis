package com.google.android.gms.internal;

import java.util.Arrays;

public final class op extends oc<op> implements Cloneable {
    public long f18409a;
    public long f18410b;
    public byte[] f18411c;
    public long f18412d;
    public byte[] f18413e;
    private long f18414f;
    private String f18415g;
    private int f18416h;
    private int f18417i;
    private boolean f18418j;
    private oq[] f18419k;
    private byte[] f18420l;
    private on f18421m;
    private String f18422n;
    private String f18423o;
    private om f18424p;
    private String f18425q;
    private oo f18426r;
    private String f18427s;
    private int f18428t;
    private int[] f18429u;
    private long f18430v;
    private or f18431w;

    public op() {
        this.f18409a = 0;
        this.f18410b = 0;
        this.f18414f = 0;
        this.f18415g = "";
        this.f18416h = 0;
        this.f18417i = 0;
        this.f18418j = false;
        this.f18419k = oq.m16798a();
        this.f18420l = ol.f6263g;
        this.f18421m = null;
        this.f18411c = ol.f6263g;
        this.f18422n = "";
        this.f18423o = "";
        this.f18424p = null;
        this.f18425q = "";
        this.f18412d = 180000;
        this.f18426r = null;
        this.f18413e = ol.f6263g;
        this.f18427s = "";
        this.f18428t = 0;
        this.f18429u = ol.f6257a;
        this.f18430v = 0;
        this.f18431w = null;
        this.H = null;
        this.I = -1;
    }

    private final op m16791a() {
        try {
            op opVar = (op) super.mo3040c();
            if (this.f18419k != null && this.f18419k.length > 0) {
                opVar.f18419k = new oq[this.f18419k.length];
                for (int i = 0; i < this.f18419k.length; i++) {
                    if (this.f18419k[i] != null) {
                        opVar.f18419k[i] = (oq) this.f18419k[i].clone();
                    }
                }
            }
            if (this.f18421m != null) {
                opVar.f18421m = (on) this.f18421m.clone();
            }
            if (this.f18424p != null) {
                opVar.f18424p = (om) this.f18424p.clone();
            }
            if (this.f18426r != null) {
                opVar.f18426r = (oo) this.f18426r.clone();
            }
            if (this.f18429u != null && this.f18429u.length > 0) {
                opVar.f18429u = (int[]) this.f18429u.clone();
            }
            if (this.f18431w != null) {
                opVar.f18431w = (or) this.f18431w.clone();
            }
            return opVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    private final com.google.android.gms.internal.op m16792b(com.google.android.gms.internal.nz r9) {
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
        r8 = this;
    L_0x0000:
        r0 = r9.m5049a();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x01b7;
            case 8: goto L_0x01af;
            case 18: goto L_0x01a7;
            case 26: goto L_0x0168;
            case 34: goto L_0x0160;
            case 50: goto L_0x0158;
            case 58: goto L_0x0146;
            case 66: goto L_0x013e;
            case 74: goto L_0x0130;
            case 80: goto L_0x0128;
            case 88: goto L_0x0120;
            case 96: goto L_0x0118;
            case 106: goto L_0x0110;
            case 114: goto L_0x0108;
            case 120: goto L_0x00f7;
            case 130: goto L_0x00e9;
            case 136: goto L_0x00e1;
            case 146: goto L_0x00d9;
            case 152: goto L_0x00a8;
            case 160: goto L_0x0075;
            case 162: goto L_0x0034;
            case 168: goto L_0x002d;
            case 176: goto L_0x0026;
            case 186: goto L_0x0017;
            case 194: goto L_0x0010;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.m12032a(r9, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000f:
        return r8;
    L_0x0010:
        r0 = r9.m5059e();
        r8.f18427s = r0;
        goto L_0x0000;
    L_0x0017:
        r0 = r8.f18431w;
        if (r0 != 0) goto L_0x0022;
    L_0x001b:
        r0 = new com.google.android.gms.internal.or;
        r0.<init>();
        r8.f18431w = r0;
    L_0x0022:
        r0 = r8.f18431w;
        goto L_0x0153;
    L_0x0026:
        r0 = r9.m5053b();
        r8.f18430v = r0;
        goto L_0x0000;
    L_0x002d:
        r0 = r9.m5053b();
        r8.f18414f = r0;
        goto L_0x0000;
    L_0x0034:
        r0 = r9.m5062g();
        r0 = r9.m5056c(r0);
        r1 = r9.m5067l();
        r3 = r2;
    L_0x0041:
        r4 = r9.m5066k();
        if (r4 <= 0) goto L_0x004d;
    L_0x0047:
        r9.m5055c();
        r3 = r3 + 1;
        goto L_0x0041;
    L_0x004d:
        r9.m5060e(r1);
        r1 = r8.f18429u;
        if (r1 != 0) goto L_0x0056;
    L_0x0054:
        r1 = r2;
        goto L_0x0059;
    L_0x0056:
        r1 = r8.f18429u;
        r1 = r1.length;
    L_0x0059:
        r3 = r3 + r1;
        r3 = new int[r3];
        if (r1 == 0) goto L_0x0063;
    L_0x005e:
        r4 = r8.f18429u;
        java.lang.System.arraycopy(r4, r2, r3, r2, r1);
    L_0x0063:
        r2 = r3.length;
        if (r1 >= r2) goto L_0x006f;
    L_0x0066:
        r2 = r9.m5055c();
        r3[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0063;
    L_0x006f:
        r8.f18429u = r3;
        r9.m5057d(r0);
        goto L_0x0000;
    L_0x0075:
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = com.google.android.gms.internal.ol.m5135a(r9, r0);
        r3 = r8.f18429u;
        if (r3 != 0) goto L_0x0081;
    L_0x007f:
        r3 = r2;
        goto L_0x0084;
    L_0x0081:
        r3 = r8.f18429u;
        r3 = r3.length;
    L_0x0084:
        r0 = r0 + r3;
        r0 = new int[r0];
        if (r3 == 0) goto L_0x008e;
    L_0x0089:
        r4 = r8.f18429u;
        java.lang.System.arraycopy(r4, r2, r0, r2, r3);
    L_0x008e:
        r2 = r0.length;
        r2 = r2 - r1;
        if (r3 >= r2) goto L_0x009e;
    L_0x0092:
        r2 = r9.m5055c();
        r0[r3] = r2;
        r9.m5049a();
        r3 = r3 + 1;
        goto L_0x008e;
    L_0x009e:
        r1 = r9.m5055c();
        r0[r3] = r1;
        r8.f18429u = r0;
        goto L_0x0000;
    L_0x00a8:
        r1 = r9.m5067l();
        r2 = r9.m5062g();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        switch(r2) {
            case 0: goto L_0x00b6;
            case 1: goto L_0x00b6;
            case 2: goto L_0x00b6;
            default: goto L_0x00b3;
        };	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00b3:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        goto L_0x00ba;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00b6:
        r8.f18428t = r2;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00ba:
        r4 = 45;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = " is not a valid enum InternalEvent";	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00d1:
        r9.m5060e(r1);
        r8.m12032a(r9, r0);
        goto L_0x0000;
    L_0x00d9:
        r0 = r9.m5061f();
        r8.f18413e = r0;
        goto L_0x0000;
    L_0x00e1:
        r0 = r9.m5063h();
        r8.f18410b = r0;
        goto L_0x0000;
    L_0x00e9:
        r0 = r8.f18426r;
        if (r0 != 0) goto L_0x00f4;
    L_0x00ed:
        r0 = new com.google.android.gms.internal.oo;
        r0.<init>();
        r8.f18426r = r0;
    L_0x00f4:
        r0 = r8.f18426r;
        goto L_0x0153;
    L_0x00f7:
        r2 = r9.m5063h();
        r0 = r2 >>> r1;
        r4 = 1;
        r6 = r2 & r4;
        r2 = -r6;
        r4 = r0 ^ r2;
        r8.f18412d = r4;
        goto L_0x0000;
    L_0x0108:
        r0 = r9.m5059e();
        r8.f18425q = r0;
        goto L_0x0000;
    L_0x0110:
        r0 = r9.m5059e();
        r8.f18423o = r0;
        goto L_0x0000;
    L_0x0118:
        r0 = r9.m5062g();
        r8.f18417i = r0;
        goto L_0x0000;
    L_0x0120:
        r0 = r9.m5062g();
        r8.f18416h = r0;
        goto L_0x0000;
    L_0x0128:
        r0 = r9.m5058d();
        r8.f18418j = r0;
        goto L_0x0000;
    L_0x0130:
        r0 = r8.f18421m;
        if (r0 != 0) goto L_0x013b;
    L_0x0134:
        r0 = new com.google.android.gms.internal.on;
        r0.<init>();
        r8.f18421m = r0;
    L_0x013b:
        r0 = r8.f18421m;
        goto L_0x0153;
    L_0x013e:
        r0 = r9.m5059e();
        r8.f18422n = r0;
        goto L_0x0000;
    L_0x0146:
        r0 = r8.f18424p;
        if (r0 != 0) goto L_0x0151;
    L_0x014a:
        r0 = new com.google.android.gms.internal.om;
        r0.<init>();
        r8.f18424p = r0;
    L_0x0151:
        r0 = r8.f18424p;
    L_0x0153:
        r9.m5052a(r0);
        goto L_0x0000;
    L_0x0158:
        r0 = r9.m5061f();
        r8.f18411c = r0;
        goto L_0x0000;
    L_0x0160:
        r0 = r9.m5061f();
        r8.f18420l = r0;
        goto L_0x0000;
    L_0x0168:
        r0 = 26;
        r0 = com.google.android.gms.internal.ol.m5135a(r9, r0);
        r3 = r8.f18419k;
        if (r3 != 0) goto L_0x0174;
    L_0x0172:
        r3 = r2;
        goto L_0x0177;
    L_0x0174:
        r3 = r8.f18419k;
        r3 = r3.length;
    L_0x0177:
        r0 = r0 + r3;
        r0 = new com.google.android.gms.internal.oq[r0];
        if (r3 == 0) goto L_0x0181;
    L_0x017c:
        r4 = r8.f18419k;
        java.lang.System.arraycopy(r4, r2, r0, r2, r3);
    L_0x0181:
        r2 = r0.length;
        r2 = r2 - r1;
        if (r3 >= r2) goto L_0x0197;
    L_0x0185:
        r2 = new com.google.android.gms.internal.oq;
        r2.<init>();
        r0[r3] = r2;
        r2 = r0[r3];
        r9.m5052a(r2);
        r9.m5049a();
        r3 = r3 + 1;
        goto L_0x0181;
    L_0x0197:
        r1 = new com.google.android.gms.internal.oq;
        r1.<init>();
        r0[r3] = r1;
        r1 = r0[r3];
        r9.m5052a(r1);
        r8.f18419k = r0;
        goto L_0x0000;
    L_0x01a7:
        r0 = r9.m5059e();
        r8.f18415g = r0;
        goto L_0x0000;
    L_0x01af:
        r0 = r9.m5063h();
        r8.f18409a = r0;
        goto L_0x0000;
    L_0x01b7:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.op.b(com.google.android.gms.internal.nz):com.google.android.gms.internal.op");
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        return m16792b(nzVar);
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18409a != 0) {
            oaVar.m5097b(1, this.f18409a);
        }
        if (!(this.f18415g == null || this.f18415g.equals(""))) {
            oaVar.m5091a(2, this.f18415g);
        }
        int i = 0;
        if (this.f18419k != null && this.f18419k.length > 0) {
            for (oi oiVar : this.f18419k) {
                if (oiVar != null) {
                    oaVar.m5090a(3, oiVar);
                }
            }
        }
        if (!Arrays.equals(this.f18420l, ol.f6263g)) {
            oaVar.m5093a(4, this.f18420l);
        }
        if (!Arrays.equals(this.f18411c, ol.f6263g)) {
            oaVar.m5093a(6, this.f18411c);
        }
        if (this.f18424p != null) {
            oaVar.m5090a(7, this.f18424p);
        }
        if (!(this.f18422n == null || this.f18422n.equals(""))) {
            oaVar.m5091a(8, this.f18422n);
        }
        if (this.f18421m != null) {
            oaVar.m5090a(9, this.f18421m);
        }
        if (this.f18418j) {
            oaVar.m5092a(10, this.f18418j);
        }
        if (this.f18416h != 0) {
            oaVar.m5088a(11, this.f18416h);
        }
        if (this.f18417i != 0) {
            oaVar.m5088a(12, this.f18417i);
        }
        if (!(this.f18423o == null || this.f18423o.equals(""))) {
            oaVar.m5091a(13, this.f18423o);
        }
        if (!(this.f18425q == null || this.f18425q.equals(""))) {
            oaVar.m5091a(14, this.f18425q);
        }
        if (this.f18412d != 180000) {
            long j = this.f18412d;
            oaVar.m5099c(15, 0);
            oaVar.m5094a(oa.m5083c(j));
        }
        if (this.f18426r != null) {
            oaVar.m5090a(16, this.f18426r);
        }
        if (this.f18410b != 0) {
            oaVar.m5097b(17, this.f18410b);
        }
        if (!Arrays.equals(this.f18413e, ol.f6263g)) {
            oaVar.m5093a(18, this.f18413e);
        }
        if (this.f18428t != 0) {
            oaVar.m5088a(19, this.f18428t);
        }
        if (this.f18429u != null && this.f18429u.length > 0) {
            while (i < this.f18429u.length) {
                oaVar.m5088a(20, this.f18429u[i]);
                i++;
            }
        }
        if (this.f18414f != 0) {
            oaVar.m5097b(21, this.f18414f);
        }
        if (this.f18430v != 0) {
            oaVar.m5097b(22, this.f18430v);
        }
        if (this.f18431w != null) {
            oaVar.m5090a(23, this.f18431w);
        }
        if (!(this.f18427s == null || this.f18427s.equals(""))) {
            oaVar.m5091a(24, this.f18427s);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int b = super.mo1668b();
        if (this.f18409a != 0) {
            b += oa.m5082c(1, this.f18409a);
        }
        if (!(this.f18415g == null || this.f18415g.equals(""))) {
            b += oa.m5077b(2, this.f18415g);
        }
        int i = 0;
        if (this.f18419k != null && this.f18419k.length > 0) {
            int i2 = b;
            for (oi oiVar : this.f18419k) {
                if (oiVar != null) {
                    i2 += oa.m5076b(3, oiVar);
                }
            }
            b = i2;
        }
        if (!Arrays.equals(this.f18420l, ol.f6263g)) {
            b += oa.m5078b(4, this.f18420l);
        }
        if (!Arrays.equals(this.f18411c, ol.f6263g)) {
            b += oa.m5078b(6, this.f18411c);
        }
        if (this.f18424p != null) {
            b += oa.m5076b(7, this.f18424p);
        }
        if (!(this.f18422n == null || this.f18422n.equals(""))) {
            b += oa.m5077b(8, this.f18422n);
        }
        if (this.f18421m != null) {
            b += oa.m5076b(9, this.f18421m);
        }
        if (this.f18418j) {
            b += oa.m5081c(80) + 1;
        }
        if (this.f18416h != 0) {
            b += oa.m5075b(11, this.f18416h);
        }
        if (this.f18417i != 0) {
            b += oa.m5075b(12, this.f18417i);
        }
        if (!(this.f18423o == null || this.f18423o.equals(""))) {
            b += oa.m5077b(13, this.f18423o);
        }
        if (!(this.f18425q == null || this.f18425q.equals(""))) {
            b += oa.m5077b(14, this.f18425q);
        }
        if (this.f18412d != 180000) {
            b += oa.m5081c(120) + oa.m5079b(oa.m5083c(this.f18412d));
        }
        if (this.f18426r != null) {
            b += oa.m5076b(16, this.f18426r);
        }
        if (this.f18410b != 0) {
            b += oa.m5082c(17, this.f18410b);
        }
        if (!Arrays.equals(this.f18413e, ol.f6263g)) {
            b += oa.m5078b(18, this.f18413e);
        }
        if (this.f18428t != 0) {
            b += oa.m5075b(19, this.f18428t);
        }
        if (this.f18429u != null && this.f18429u.length > 0) {
            int i3 = 0;
            while (i < this.f18429u.length) {
                i3 += oa.m5068a(this.f18429u[i]);
                i++;
            }
            b = (b + i3) + (2 * this.f18429u.length);
        }
        if (this.f18414f != 0) {
            b += oa.m5082c(21, this.f18414f);
        }
        if (this.f18430v != 0) {
            b += oa.m5082c(22, this.f18430v);
        }
        if (this.f18431w != null) {
            b += oa.m5076b(23, this.f18431w);
        }
        return (this.f18427s == null || this.f18427s.equals("")) ? b : b + oa.m5077b(24, this.f18427s);
    }

    public final /* synthetic */ oc mo3040c() {
        return (op) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16791a();
    }

    public final /* synthetic */ oi mo1670d() {
        return (op) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof op)) {
            return false;
        }
        op opVar = (op) obj;
        if (this.f18409a != opVar.f18409a || this.f18410b != opVar.f18410b || this.f18414f != opVar.f18414f) {
            return false;
        }
        if (this.f18415g == null) {
            if (opVar.f18415g != null) {
                return false;
            }
        } else if (!this.f18415g.equals(opVar.f18415g)) {
            return false;
        }
        if (this.f18416h != opVar.f18416h || this.f18417i != opVar.f18417i || this.f18418j != opVar.f18418j || !og.m5116a(this.f18419k, opVar.f18419k) || !Arrays.equals(this.f18420l, opVar.f18420l)) {
            return false;
        }
        if (this.f18421m == null) {
            if (opVar.f18421m != null) {
                return false;
            }
        } else if (!this.f18421m.equals(opVar.f18421m)) {
            return false;
        }
        if (!Arrays.equals(this.f18411c, opVar.f18411c)) {
            return false;
        }
        if (this.f18422n == null) {
            if (opVar.f18422n != null) {
                return false;
            }
        } else if (!this.f18422n.equals(opVar.f18422n)) {
            return false;
        }
        if (this.f18423o == null) {
            if (opVar.f18423o != null) {
                return false;
            }
        } else if (!this.f18423o.equals(opVar.f18423o)) {
            return false;
        }
        if (this.f18424p == null) {
            if (opVar.f18424p != null) {
                return false;
            }
        } else if (!this.f18424p.equals(opVar.f18424p)) {
            return false;
        }
        if (this.f18425q == null) {
            if (opVar.f18425q != null) {
                return false;
            }
        } else if (!this.f18425q.equals(opVar.f18425q)) {
            return false;
        }
        if (this.f18412d != opVar.f18412d) {
            return false;
        }
        if (this.f18426r == null) {
            if (opVar.f18426r != null) {
                return false;
            }
        } else if (!this.f18426r.equals(opVar.f18426r)) {
            return false;
        }
        if (!Arrays.equals(this.f18413e, opVar.f18413e)) {
            return false;
        }
        if (this.f18427s == null) {
            if (opVar.f18427s != null) {
                return false;
            }
        } else if (!this.f18427s.equals(opVar.f18427s)) {
            return false;
        }
        if (this.f18428t != opVar.f18428t || !og.m5114a(this.f18429u, opVar.f18429u) || this.f18430v != opVar.f18430v) {
            return false;
        }
        if (this.f18431w == null) {
            if (opVar.f18431w != null) {
                return false;
            }
        } else if (!this.f18431w.equals(opVar.f18431w)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(opVar.H);
            }
        }
        return opVar.H == null || opVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((527 + getClass().getName().hashCode()) * 31) + ((int) (this.f18409a ^ (this.f18409a >>> 32)))) * 31) + ((int) (this.f18410b ^ (this.f18410b >>> 32)))) * 31) + ((int) (this.f18414f ^ (this.f18414f >>> 32)))) * 31) + (this.f18415g == null ? 0 : this.f18415g.hashCode())) * 31) + this.f18416h) * 31) + this.f18417i) * 31) + (this.f18418j ? 1231 : 1237)) * 31) + og.m5111a(this.f18419k)) * 31) + Arrays.hashCode(this.f18420l);
        on onVar = this.f18421m;
        hashCode = (((((((hashCode * 31) + (onVar == null ? 0 : onVar.hashCode())) * 31) + Arrays.hashCode(this.f18411c)) * 31) + (this.f18422n == null ? 0 : this.f18422n.hashCode())) * 31) + (this.f18423o == null ? 0 : this.f18423o.hashCode());
        om omVar = this.f18424p;
        hashCode = (((((hashCode * 31) + (omVar == null ? 0 : omVar.hashCode())) * 31) + (this.f18425q == null ? 0 : this.f18425q.hashCode())) * 31) + ((int) (this.f18412d ^ (this.f18412d >>> 32)));
        oo ooVar = this.f18426r;
        hashCode = (((((((((((hashCode * 31) + (ooVar == null ? 0 : ooVar.hashCode())) * 31) + Arrays.hashCode(this.f18413e)) * 31) + (this.f18427s == null ? 0 : this.f18427s.hashCode())) * 31) + this.f18428t) * 31) + og.m5109a(this.f18429u)) * 31) + ((int) (this.f18430v ^ (this.f18430v >>> 32)));
        or orVar = this.f18431w;
        hashCode = ((hashCode * 31) + (orVar == null ? 0 : orVar.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
