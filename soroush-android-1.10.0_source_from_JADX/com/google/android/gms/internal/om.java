package com.google.android.gms.internal;

public final class om extends oc<om> implements Cloneable {
    private String[] f18397a;
    private String[] f18398b;
    private int[] f18399c;
    private long[] f18400d;
    private long[] f18401e;

    public om() {
        this.f18397a = ol.f6261e;
        this.f18398b = ol.f6261e;
        this.f18399c = ol.f6257a;
        this.f18400d = ol.f6258b;
        this.f18401e = ol.f6258b;
        this.H = null;
        this.I = -1;
    }

    private om m16773a() {
        try {
            om omVar = (om) super.mo3040c();
            if (this.f18397a != null && this.f18397a.length > 0) {
                omVar.f18397a = (String[]) this.f18397a.clone();
            }
            if (this.f18398b != null && this.f18398b.length > 0) {
                omVar.f18398b = (String[]) this.f18398b.clone();
            }
            if (this.f18399c != null && this.f18399c.length > 0) {
                omVar.f18399c = (int[]) this.f18399c.clone();
            }
            if (this.f18400d != null && this.f18400d.length > 0) {
                omVar.f18400d = (long[]) this.f18400d.clone();
            }
            if (this.f18401e != null && this.f18401e.length > 0) {
                omVar.f18401e = (long[]) this.f18401e.clone();
            }
            return omVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            if (a == 0) {
                return this;
            }
            int length;
            Object obj;
            if (a == 10) {
                a = ol.m5135a(nzVar, 10);
                length = this.f18397a == null ? 0 : this.f18397a.length;
                obj = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18397a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = nzVar.m5059e();
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = nzVar.m5059e();
                this.f18397a = obj;
            } else if (a == 18) {
                a = ol.m5135a(nzVar, 18);
                length = this.f18398b == null ? 0 : this.f18398b.length;
                obj = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18398b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = nzVar.m5059e();
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = nzVar.m5059e();
                this.f18398b = obj;
            } else if (a != 24) {
                int i;
                Object obj2;
                if (a == 26) {
                    a = nzVar.m5056c(nzVar.m5062g());
                    length = nzVar.m5067l();
                    i = 0;
                    while (nzVar.m5066k() > 0) {
                        nzVar.m5062g();
                        i++;
                    }
                    nzVar.m5060e(length);
                    length = this.f18399c == null ? 0 : this.f18399c.length;
                    obj2 = new int[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18399c, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = nzVar.m5062g();
                        length++;
                    }
                    this.f18399c = obj2;
                } else if (a == 32) {
                    a = ol.m5135a(nzVar, 32);
                    length = this.f18400d == null ? 0 : this.f18400d.length;
                    obj = new long[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18400d, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = nzVar.m5063h();
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = nzVar.m5063h();
                    this.f18400d = obj;
                } else if (a == 34) {
                    a = nzVar.m5056c(nzVar.m5062g());
                    length = nzVar.m5067l();
                    i = 0;
                    while (nzVar.m5066k() > 0) {
                        nzVar.m5063h();
                        i++;
                    }
                    nzVar.m5060e(length);
                    length = this.f18400d == null ? 0 : this.f18400d.length;
                    obj2 = new long[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18400d, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = nzVar.m5063h();
                        length++;
                    }
                    this.f18400d = obj2;
                } else if (a == 40) {
                    a = ol.m5135a(nzVar, 40);
                    length = this.f18401e == null ? 0 : this.f18401e.length;
                    obj = new long[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18401e, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = nzVar.m5063h();
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = nzVar.m5063h();
                    this.f18401e = obj;
                } else if (a == 42) {
                    a = nzVar.m5056c(nzVar.m5062g());
                    length = nzVar.m5067l();
                    i = 0;
                    while (nzVar.m5066k() > 0) {
                        nzVar.m5063h();
                        i++;
                    }
                    nzVar.m5060e(length);
                    length = this.f18401e == null ? 0 : this.f18401e.length;
                    obj2 = new long[(i + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18401e, 0, obj2, 0, length);
                    }
                    while (length < obj2.length) {
                        obj2[length] = nzVar.m5063h();
                        length++;
                    }
                    this.f18401e = obj2;
                } else if (!super.m12032a(nzVar, a)) {
                    return this;
                }
                nzVar.m5057d(a);
            } else {
                a = ol.m5135a(nzVar, 24);
                length = this.f18399c == null ? 0 : this.f18399c.length;
                obj = new int[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f18399c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = nzVar.m5062g();
                    nzVar.m5049a();
                    length++;
                }
                obj[length] = nzVar.m5062g();
                this.f18399c = obj;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        int i = 0;
        if (this.f18397a != null && this.f18397a.length > 0) {
            for (String str : this.f18397a) {
                if (str != null) {
                    oaVar.m5091a(1, str);
                }
            }
        }
        if (this.f18398b != null && this.f18398b.length > 0) {
            for (String str2 : this.f18398b) {
                if (str2 != null) {
                    oaVar.m5091a(2, str2);
                }
            }
        }
        if (this.f18399c != null && this.f18399c.length > 0) {
            for (int a : this.f18399c) {
                oaVar.m5088a(3, a);
            }
        }
        if (this.f18400d != null && this.f18400d.length > 0) {
            for (long b : this.f18400d) {
                oaVar.m5097b(4, b);
            }
        }
        if (this.f18401e != null && this.f18401e.length > 0) {
            while (i < this.f18401e.length) {
                oaVar.m5097b(5, this.f18401e[i]);
                i++;
            }
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int i;
        int i2;
        int i3;
        String str;
        int b = super.mo1668b();
        int i4 = 0;
        if (this.f18397a != null && this.f18397a.length > 0) {
            i = 0;
            i2 = i;
            i3 = i2;
            while (i < this.f18397a.length) {
                str = this.f18397a[i];
                if (str != null) {
                    i3++;
                    i2 += oa.m5071a(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f18398b != null && this.f18398b.length > 0) {
            i = 0;
            i2 = i;
            i3 = i2;
            while (i < this.f18398b.length) {
                str = this.f18398b[i];
                if (str != null) {
                    i3++;
                    i2 += oa.m5071a(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f18399c != null && this.f18399c.length > 0) {
            i = 0;
            i2 = i;
            while (i < this.f18399c.length) {
                i2 += oa.m5068a(this.f18399c[i]);
                i++;
            }
            b = (b + i2) + (this.f18399c.length * 1);
        }
        if (this.f18400d != null && this.f18400d.length > 0) {
            i = 0;
            i2 = i;
            while (i < this.f18400d.length) {
                i2 += oa.m5079b(this.f18400d[i]);
                i++;
            }
            b = (b + i2) + (this.f18400d.length * 1);
        }
        if (this.f18401e == null || this.f18401e.length <= 0) {
            return b;
        }
        i = 0;
        while (i4 < this.f18401e.length) {
            i += oa.m5079b(this.f18401e[i4]);
            i4++;
        }
        return (b + i) + (1 * this.f18401e.length);
    }

    public final /* synthetic */ oc mo3040c() {
        return (om) clone();
    }

    public final /* synthetic */ Object clone() {
        return m16773a();
    }

    public final /* synthetic */ oi mo1670d() {
        return (om) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        if (!og.m5116a(this.f18397a, omVar.f18397a) || !og.m5116a(this.f18398b, omVar.f18398b) || !og.m5114a(this.f18399c, omVar.f18399c) || !og.m5115a(this.f18400d, omVar.f18400d) || !og.m5115a(this.f18401e, omVar.f18401e)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(omVar.H);
            }
        }
        return omVar.H == null || omVar.H.m5103a();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((527 + getClass().getName().hashCode()) * 31) + og.m5111a(this.f18397a)) * 31) + og.m5111a(this.f18398b)) * 31) + og.m5109a(this.f18399c)) * 31) + og.m5110a(this.f18400d)) * 31) + og.m5110a(this.f18401e)) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                hashCode = this.H.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }
}
