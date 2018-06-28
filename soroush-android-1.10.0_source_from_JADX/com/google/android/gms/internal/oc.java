package com.google.android.gms.internal;

public abstract class oc<M extends oc<M>> extends oi {
    protected oe f15301H;

    public void mo1667a(oa oaVar) {
        if (this.f15301H != null) {
            for (int i = 0; i < this.f15301H.f6246d; i++) {
                this.f15301H.f6245c[i].m5108a(oaVar);
            }
        }
    }

    protected final boolean m12032a(nz nzVar, int i) {
        int l = nzVar.m5067l();
        if (!nzVar.m5054b(i)) {
            return false;
        }
        byte[] bArr;
        int i2 = i >>> 3;
        int l2 = nzVar.m5067l() - l;
        if (l2 == 0) {
            bArr = ol.f6263g;
        } else {
            Object obj = new byte[l2];
            System.arraycopy(nzVar.f6228a, nzVar.f6229b + l, obj, 0, l2);
            bArr = obj;
        }
        ok okVar = new ok(i, bArr);
        of ofVar = null;
        if (this.f15301H == null) {
            this.f15301H = new oe();
        } else {
            oe oeVar = this.f15301H;
            l2 = oeVar.m5104b(i2);
            if (l2 >= 0) {
                if (oeVar.f6245c[l2] != oe.f6243a) {
                    ofVar = oeVar.f6245c[l2];
                }
            }
        }
        if (ofVar == null) {
            ofVar = new of();
            oe oeVar2 = this.f15301H;
            int b = oeVar2.m5104b(i2);
            if (b >= 0) {
                oeVar2.f6245c[b] = ofVar;
            } else {
                b ^= -1;
                if (b >= oeVar2.f6246d || oeVar2.f6245c[b] != oe.f6243a) {
                    if (oeVar2.f6246d >= oeVar2.f6244b.length) {
                        int a = oe.m5102a(oeVar2.f6246d + 1);
                        Object obj2 = new int[a];
                        Object obj3 = new of[a];
                        System.arraycopy(oeVar2.f6244b, 0, obj2, 0, oeVar2.f6244b.length);
                        System.arraycopy(oeVar2.f6245c, 0, obj3, 0, oeVar2.f6245c.length);
                        oeVar2.f6244b = obj2;
                        oeVar2.f6245c = obj3;
                    }
                    if (oeVar2.f6246d - b != 0) {
                        int i3 = b + 1;
                        System.arraycopy(oeVar2.f6244b, b, oeVar2.f6244b, i3, oeVar2.f6246d - b);
                        System.arraycopy(oeVar2.f6245c, b, oeVar2.f6245c, i3, oeVar2.f6246d - b);
                    }
                    oeVar2.f6244b[b] = i2;
                    oeVar2.f6245c[b] = ofVar;
                    oeVar2.f6246d++;
                } else {
                    oeVar2.f6244b[b] = i2;
                    oeVar2.f6245c[b] = ofVar;
                }
            }
        }
        ofVar.f6248a.add(okVar);
        return true;
    }

    protected int mo1668b() {
        int i = 0;
        if (this.f15301H == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f15301H.f6246d) {
            i2 += this.f15301H.f6245c[i].m5107a();
            i++;
        }
        return i2;
    }

    public M mo3040c() {
        oc ocVar = (oc) super.mo1670d();
        og.m5113a(this, ocVar);
        return ocVar;
    }

    public /* synthetic */ Object clone() {
        return mo3040c();
    }

    public /* synthetic */ oi mo1670d() {
        return (oc) clone();
    }
}
