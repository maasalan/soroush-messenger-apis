package com.google.android.gms.internal;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class ki extends oc<ki> {
    private static volatile ki[] f18282J;
    public ke[] f18283A;
    public String f18284B;
    public Integer f18285C;
    public String f18286D;
    public Long f18287E;
    public Long f18288F;
    public String f18289G;
    private Integer f18290K;
    private Integer f18291L;
    public Integer f18292a;
    public kf[] f18293b;
    public kk[] f18294c;
    public Long f18295d;
    public Long f18296e;
    public Long f18297f;
    public Long f18298g;
    public Long f18299h;
    public String f18300i;
    public String f18301j;
    public String f18302k;
    public String f18303l;
    public Integer f18304m;
    public String f18305n;
    public String f18306o;
    public String f18307p;
    public Long f18308q;
    public Long f18309r;
    public String f18310s;
    public Boolean f18311t;
    public String f18312u;
    public Long f18313v;
    public Integer f18314w;
    public String f18315x;
    public String f18316y;
    public Boolean f18317z;

    public ki() {
        this.f18292a = null;
        this.f18293b = kf.m16681a();
        this.f18294c = kk.m16699a();
        this.f18295d = null;
        this.f18296e = null;
        this.f18297f = null;
        this.f18298g = null;
        this.f18299h = null;
        this.f18300i = null;
        this.f18301j = null;
        this.f18302k = null;
        this.f18303l = null;
        this.f18304m = null;
        this.f18305n = null;
        this.f18306o = null;
        this.f18307p = null;
        this.f18308q = null;
        this.f18309r = null;
        this.f18310s = null;
        this.f18311t = null;
        this.f18312u = null;
        this.f18313v = null;
        this.f18314w = null;
        this.f18315x = null;
        this.f18316y = null;
        this.f18317z = null;
        this.f18283A = ke.m16677a();
        this.f18284B = null;
        this.f18285C = null;
        this.f18290K = null;
        this.f18291L = null;
        this.f18286D = null;
        this.f18287E = null;
        this.f18288F = null;
        this.f18289G = null;
        this.H = null;
        this.I = -1;
    }

    public static ki[] m16692a() {
        if (f18282J == null) {
            synchronized (og.f6252b) {
                if (f18282J == null) {
                    f18282J = new ki[0];
                }
            }
        }
        return f18282J;
    }

    public final /* synthetic */ oi mo3038a(nz nzVar) {
        while (true) {
            int a = nzVar.m5049a();
            int length;
            Object obj;
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f18292a = Integer.valueOf(nzVar.m5062g());
                    break;
                case 18:
                    a = ol.m5135a(nzVar, 18);
                    length = this.f18293b == null ? 0 : this.f18293b.length;
                    obj = new kf[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18293b, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new kf();
                        nzVar.m5052a(obj[length]);
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = new kf();
                    nzVar.m5052a(obj[length]);
                    this.f18293b = obj;
                    break;
                case 26:
                    a = ol.m5135a(nzVar, 26);
                    length = this.f18294c == null ? 0 : this.f18294c.length;
                    obj = new kk[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18294c, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new kk();
                        nzVar.m5052a(obj[length]);
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = new kk();
                    nzVar.m5052a(obj[length]);
                    this.f18294c = obj;
                    break;
                case 32:
                    this.f18295d = Long.valueOf(nzVar.m5063h());
                    break;
                case 40:
                    this.f18296e = Long.valueOf(nzVar.m5063h());
                    break;
                case 48:
                    this.f18297f = Long.valueOf(nzVar.m5063h());
                    break;
                case 56:
                    this.f18299h = Long.valueOf(nzVar.m5063h());
                    break;
                case 66:
                    this.f18300i = nzVar.m5059e();
                    break;
                case 74:
                    this.f18301j = nzVar.m5059e();
                    break;
                case 82:
                    this.f18302k = nzVar.m5059e();
                    break;
                case 90:
                    this.f18303l = nzVar.m5059e();
                    break;
                case 96:
                    this.f18304m = Integer.valueOf(nzVar.m5062g());
                    break;
                case 106:
                    this.f18305n = nzVar.m5059e();
                    break;
                case 114:
                    this.f18306o = nzVar.m5059e();
                    break;
                case 130:
                    this.f18307p = nzVar.m5059e();
                    break;
                case 136:
                    this.f18308q = Long.valueOf(nzVar.m5063h());
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_444 /*144*/:
                    this.f18309r = Long.valueOf(nzVar.m5063h());
                    break;
                case 154:
                    this.f18310s = nzVar.m5059e();
                    break;
                case 160:
                    this.f18311t = Boolean.valueOf(nzVar.m5058d());
                    break;
                case 170:
                    this.f18312u = nzVar.m5059e();
                    break;
                case 176:
                    this.f18313v = Long.valueOf(nzVar.m5063h());
                    break;
                case 184:
                    this.f18314w = Integer.valueOf(nzVar.m5062g());
                    break;
                case 194:
                    this.f18315x = nzVar.m5059e();
                    break;
                case 202:
                    this.f18316y = nzVar.m5059e();
                    break;
                case 208:
                    this.f18298g = Long.valueOf(nzVar.m5063h());
                    break;
                case 224:
                    this.f18317z = Boolean.valueOf(nzVar.m5058d());
                    break;
                case 234:
                    a = ol.m5135a(nzVar, 234);
                    length = this.f18283A == null ? 0 : this.f18283A.length;
                    obj = new ke[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f18283A, 0, obj, 0, length);
                    }
                    while (length < obj.length - 1) {
                        obj[length] = new ke();
                        nzVar.m5052a(obj[length]);
                        nzVar.m5049a();
                        length++;
                    }
                    obj[length] = new ke();
                    nzVar.m5052a(obj[length]);
                    this.f18283A = obj;
                    break;
                case 242:
                    this.f18284B = nzVar.m5059e();
                    break;
                case 248:
                    this.f18285C = Integer.valueOf(nzVar.m5062g());
                    break;
                case 256:
                    this.f18290K = Integer.valueOf(nzVar.m5062g());
                    break;
                case 264:
                    this.f18291L = Integer.valueOf(nzVar.m5062g());
                    break;
                case 274:
                    this.f18286D = nzVar.m5059e();
                    break;
                case 280:
                    this.f18287E = Long.valueOf(nzVar.m5063h());
                    break;
                case 288:
                    this.f18288F = Long.valueOf(nzVar.m5063h());
                    break;
                case 298:
                    this.f18289G = nzVar.m5059e();
                    break;
                default:
                    if (super.m12032a(nzVar, a)) {
                        break;
                    }
                    return this;
            }
        }
    }

    public final void mo1667a(oa oaVar) {
        if (this.f18292a != null) {
            oaVar.m5088a(1, this.f18292a.intValue());
        }
        int i = 0;
        if (this.f18293b != null && this.f18293b.length > 0) {
            for (oi oiVar : this.f18293b) {
                if (oiVar != null) {
                    oaVar.m5090a(2, oiVar);
                }
            }
        }
        if (this.f18294c != null && this.f18294c.length > 0) {
            for (oi oiVar2 : this.f18294c) {
                if (oiVar2 != null) {
                    oaVar.m5090a(3, oiVar2);
                }
            }
        }
        if (this.f18295d != null) {
            oaVar.m5097b(4, this.f18295d.longValue());
        }
        if (this.f18296e != null) {
            oaVar.m5097b(5, this.f18296e.longValue());
        }
        if (this.f18297f != null) {
            oaVar.m5097b(6, this.f18297f.longValue());
        }
        if (this.f18299h != null) {
            oaVar.m5097b(7, this.f18299h.longValue());
        }
        if (this.f18300i != null) {
            oaVar.m5091a(8, this.f18300i);
        }
        if (this.f18301j != null) {
            oaVar.m5091a(9, this.f18301j);
        }
        if (this.f18302k != null) {
            oaVar.m5091a(10, this.f18302k);
        }
        if (this.f18303l != null) {
            oaVar.m5091a(11, this.f18303l);
        }
        if (this.f18304m != null) {
            oaVar.m5088a(12, this.f18304m.intValue());
        }
        if (this.f18305n != null) {
            oaVar.m5091a(13, this.f18305n);
        }
        if (this.f18306o != null) {
            oaVar.m5091a(14, this.f18306o);
        }
        if (this.f18307p != null) {
            oaVar.m5091a(16, this.f18307p);
        }
        if (this.f18308q != null) {
            oaVar.m5097b(17, this.f18308q.longValue());
        }
        if (this.f18309r != null) {
            oaVar.m5097b(18, this.f18309r.longValue());
        }
        if (this.f18310s != null) {
            oaVar.m5091a(19, this.f18310s);
        }
        if (this.f18311t != null) {
            oaVar.m5092a(20, this.f18311t.booleanValue());
        }
        if (this.f18312u != null) {
            oaVar.m5091a(21, this.f18312u);
        }
        if (this.f18313v != null) {
            oaVar.m5097b(22, this.f18313v.longValue());
        }
        if (this.f18314w != null) {
            oaVar.m5088a(23, this.f18314w.intValue());
        }
        if (this.f18315x != null) {
            oaVar.m5091a(24, this.f18315x);
        }
        if (this.f18316y != null) {
            oaVar.m5091a(25, this.f18316y);
        }
        if (this.f18298g != null) {
            oaVar.m5097b(26, this.f18298g.longValue());
        }
        if (this.f18317z != null) {
            oaVar.m5092a(28, this.f18317z.booleanValue());
        }
        if (this.f18283A != null && this.f18283A.length > 0) {
            while (i < this.f18283A.length) {
                oi oiVar3 = this.f18283A[i];
                if (oiVar3 != null) {
                    oaVar.m5090a(29, oiVar3);
                }
                i++;
            }
        }
        if (this.f18284B != null) {
            oaVar.m5091a(30, this.f18284B);
        }
        if (this.f18285C != null) {
            oaVar.m5088a(31, this.f18285C.intValue());
        }
        if (this.f18290K != null) {
            oaVar.m5088a(32, this.f18290K.intValue());
        }
        if (this.f18291L != null) {
            oaVar.m5088a(33, this.f18291L.intValue());
        }
        if (this.f18286D != null) {
            oaVar.m5091a(34, this.f18286D);
        }
        if (this.f18287E != null) {
            oaVar.m5097b(35, this.f18287E.longValue());
        }
        if (this.f18288F != null) {
            oaVar.m5097b(36, this.f18288F.longValue());
        }
        if (this.f18289G != null) {
            oaVar.m5091a(37, this.f18289G);
        }
        super.mo1667a(oaVar);
    }

    protected final int mo1668b() {
        int i;
        int b = super.mo1668b();
        if (this.f18292a != null) {
            b += oa.m5075b(1, this.f18292a.intValue());
        }
        int i2 = 0;
        if (this.f18293b != null && this.f18293b.length > 0) {
            i = b;
            for (oi oiVar : this.f18293b) {
                if (oiVar != null) {
                    i += oa.m5076b(2, oiVar);
                }
            }
            b = i;
        }
        if (this.f18294c != null && this.f18294c.length > 0) {
            i = b;
            for (oi oiVar2 : this.f18294c) {
                if (oiVar2 != null) {
                    i += oa.m5076b(3, oiVar2);
                }
            }
            b = i;
        }
        if (this.f18295d != null) {
            b += oa.m5082c(4, this.f18295d.longValue());
        }
        if (this.f18296e != null) {
            b += oa.m5082c(5, this.f18296e.longValue());
        }
        if (this.f18297f != null) {
            b += oa.m5082c(6, this.f18297f.longValue());
        }
        if (this.f18299h != null) {
            b += oa.m5082c(7, this.f18299h.longValue());
        }
        if (this.f18300i != null) {
            b += oa.m5077b(8, this.f18300i);
        }
        if (this.f18301j != null) {
            b += oa.m5077b(9, this.f18301j);
        }
        if (this.f18302k != null) {
            b += oa.m5077b(10, this.f18302k);
        }
        if (this.f18303l != null) {
            b += oa.m5077b(11, this.f18303l);
        }
        if (this.f18304m != null) {
            b += oa.m5075b(12, this.f18304m.intValue());
        }
        if (this.f18305n != null) {
            b += oa.m5077b(13, this.f18305n);
        }
        if (this.f18306o != null) {
            b += oa.m5077b(14, this.f18306o);
        }
        if (this.f18307p != null) {
            b += oa.m5077b(16, this.f18307p);
        }
        if (this.f18308q != null) {
            b += oa.m5082c(17, this.f18308q.longValue());
        }
        if (this.f18309r != null) {
            b += oa.m5082c(18, this.f18309r.longValue());
        }
        if (this.f18310s != null) {
            b += oa.m5077b(19, this.f18310s);
        }
        if (this.f18311t != null) {
            this.f18311t.booleanValue();
            b += oa.m5081c(160) + 1;
        }
        if (this.f18312u != null) {
            b += oa.m5077b(21, this.f18312u);
        }
        if (this.f18313v != null) {
            b += oa.m5082c(22, this.f18313v.longValue());
        }
        if (this.f18314w != null) {
            b += oa.m5075b(23, this.f18314w.intValue());
        }
        if (this.f18315x != null) {
            b += oa.m5077b(24, this.f18315x);
        }
        if (this.f18316y != null) {
            b += oa.m5077b(25, this.f18316y);
        }
        if (this.f18298g != null) {
            b += oa.m5082c(26, this.f18298g.longValue());
        }
        if (this.f18317z != null) {
            this.f18317z.booleanValue();
            b += oa.m5081c(224) + 1;
        }
        if (this.f18283A != null && this.f18283A.length > 0) {
            while (i2 < this.f18283A.length) {
                oi oiVar3 = this.f18283A[i2];
                if (oiVar3 != null) {
                    b += oa.m5076b(29, oiVar3);
                }
                i2++;
            }
        }
        if (this.f18284B != null) {
            b += oa.m5077b(30, this.f18284B);
        }
        if (this.f18285C != null) {
            b += oa.m5075b(31, this.f18285C.intValue());
        }
        if (this.f18290K != null) {
            b += oa.m5075b(32, this.f18290K.intValue());
        }
        if (this.f18291L != null) {
            b += oa.m5075b(33, this.f18291L.intValue());
        }
        if (this.f18286D != null) {
            b += oa.m5077b(34, this.f18286D);
        }
        if (this.f18287E != null) {
            b += oa.m5082c(35, this.f18287E.longValue());
        }
        if (this.f18288F != null) {
            b += oa.m5082c(36, this.f18288F.longValue());
        }
        return this.f18289G != null ? b + oa.m5077b(37, this.f18289G) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        if (this.f18292a == null) {
            if (kiVar.f18292a != null) {
                return false;
            }
        } else if (!this.f18292a.equals(kiVar.f18292a)) {
            return false;
        }
        if (!og.m5116a(this.f18293b, kiVar.f18293b) || !og.m5116a(this.f18294c, kiVar.f18294c)) {
            return false;
        }
        if (this.f18295d == null) {
            if (kiVar.f18295d != null) {
                return false;
            }
        } else if (!this.f18295d.equals(kiVar.f18295d)) {
            return false;
        }
        if (this.f18296e == null) {
            if (kiVar.f18296e != null) {
                return false;
            }
        } else if (!this.f18296e.equals(kiVar.f18296e)) {
            return false;
        }
        if (this.f18297f == null) {
            if (kiVar.f18297f != null) {
                return false;
            }
        } else if (!this.f18297f.equals(kiVar.f18297f)) {
            return false;
        }
        if (this.f18298g == null) {
            if (kiVar.f18298g != null) {
                return false;
            }
        } else if (!this.f18298g.equals(kiVar.f18298g)) {
            return false;
        }
        if (this.f18299h == null) {
            if (kiVar.f18299h != null) {
                return false;
            }
        } else if (!this.f18299h.equals(kiVar.f18299h)) {
            return false;
        }
        if (this.f18300i == null) {
            if (kiVar.f18300i != null) {
                return false;
            }
        } else if (!this.f18300i.equals(kiVar.f18300i)) {
            return false;
        }
        if (this.f18301j == null) {
            if (kiVar.f18301j != null) {
                return false;
            }
        } else if (!this.f18301j.equals(kiVar.f18301j)) {
            return false;
        }
        if (this.f18302k == null) {
            if (kiVar.f18302k != null) {
                return false;
            }
        } else if (!this.f18302k.equals(kiVar.f18302k)) {
            return false;
        }
        if (this.f18303l == null) {
            if (kiVar.f18303l != null) {
                return false;
            }
        } else if (!this.f18303l.equals(kiVar.f18303l)) {
            return false;
        }
        if (this.f18304m == null) {
            if (kiVar.f18304m != null) {
                return false;
            }
        } else if (!this.f18304m.equals(kiVar.f18304m)) {
            return false;
        }
        if (this.f18305n == null) {
            if (kiVar.f18305n != null) {
                return false;
            }
        } else if (!this.f18305n.equals(kiVar.f18305n)) {
            return false;
        }
        if (this.f18306o == null) {
            if (kiVar.f18306o != null) {
                return false;
            }
        } else if (!this.f18306o.equals(kiVar.f18306o)) {
            return false;
        }
        if (this.f18307p == null) {
            if (kiVar.f18307p != null) {
                return false;
            }
        } else if (!this.f18307p.equals(kiVar.f18307p)) {
            return false;
        }
        if (this.f18308q == null) {
            if (kiVar.f18308q != null) {
                return false;
            }
        } else if (!this.f18308q.equals(kiVar.f18308q)) {
            return false;
        }
        if (this.f18309r == null) {
            if (kiVar.f18309r != null) {
                return false;
            }
        } else if (!this.f18309r.equals(kiVar.f18309r)) {
            return false;
        }
        if (this.f18310s == null) {
            if (kiVar.f18310s != null) {
                return false;
            }
        } else if (!this.f18310s.equals(kiVar.f18310s)) {
            return false;
        }
        if (this.f18311t == null) {
            if (kiVar.f18311t != null) {
                return false;
            }
        } else if (!this.f18311t.equals(kiVar.f18311t)) {
            return false;
        }
        if (this.f18312u == null) {
            if (kiVar.f18312u != null) {
                return false;
            }
        } else if (!this.f18312u.equals(kiVar.f18312u)) {
            return false;
        }
        if (this.f18313v == null) {
            if (kiVar.f18313v != null) {
                return false;
            }
        } else if (!this.f18313v.equals(kiVar.f18313v)) {
            return false;
        }
        if (this.f18314w == null) {
            if (kiVar.f18314w != null) {
                return false;
            }
        } else if (!this.f18314w.equals(kiVar.f18314w)) {
            return false;
        }
        if (this.f18315x == null) {
            if (kiVar.f18315x != null) {
                return false;
            }
        } else if (!this.f18315x.equals(kiVar.f18315x)) {
            return false;
        }
        if (this.f18316y == null) {
            if (kiVar.f18316y != null) {
                return false;
            }
        } else if (!this.f18316y.equals(kiVar.f18316y)) {
            return false;
        }
        if (this.f18317z == null) {
            if (kiVar.f18317z != null) {
                return false;
            }
        } else if (!this.f18317z.equals(kiVar.f18317z)) {
            return false;
        }
        if (!og.m5116a(this.f18283A, kiVar.f18283A)) {
            return false;
        }
        if (this.f18284B == null) {
            if (kiVar.f18284B != null) {
                return false;
            }
        } else if (!this.f18284B.equals(kiVar.f18284B)) {
            return false;
        }
        if (this.f18285C == null) {
            if (kiVar.f18285C != null) {
                return false;
            }
        } else if (!this.f18285C.equals(kiVar.f18285C)) {
            return false;
        }
        if (this.f18290K == null) {
            if (kiVar.f18290K != null) {
                return false;
            }
        } else if (!this.f18290K.equals(kiVar.f18290K)) {
            return false;
        }
        if (this.f18291L == null) {
            if (kiVar.f18291L != null) {
                return false;
            }
        } else if (!this.f18291L.equals(kiVar.f18291L)) {
            return false;
        }
        if (this.f18286D == null) {
            if (kiVar.f18286D != null) {
                return false;
            }
        } else if (!this.f18286D.equals(kiVar.f18286D)) {
            return false;
        }
        if (this.f18287E == null) {
            if (kiVar.f18287E != null) {
                return false;
            }
        } else if (!this.f18287E.equals(kiVar.f18287E)) {
            return false;
        }
        if (this.f18288F == null) {
            if (kiVar.f18288F != null) {
                return false;
            }
        } else if (!this.f18288F.equals(kiVar.f18288F)) {
            return false;
        }
        if (this.f18289G == null) {
            if (kiVar.f18289G != null) {
                return false;
            }
        } else if (!this.f18289G.equals(kiVar.f18289G)) {
            return false;
        }
        if (this.H != null) {
            if (!this.H.m5103a()) {
                return this.H.equals(kiVar.H);
            }
        }
        return kiVar.H == null || kiVar.H.m5103a();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((527 + getClass().getName().hashCode()) * 31) + (this.f18292a == null ? 0 : this.f18292a.hashCode())) * 31) + og.m5111a(this.f18293b)) * 31) + og.m5111a(this.f18294c)) * 31) + (this.f18295d == null ? 0 : this.f18295d.hashCode())) * 31) + (this.f18296e == null ? 0 : this.f18296e.hashCode())) * 31) + (this.f18297f == null ? 0 : this.f18297f.hashCode())) * 31) + (this.f18298g == null ? 0 : this.f18298g.hashCode())) * 31) + (this.f18299h == null ? 0 : this.f18299h.hashCode())) * 31) + (this.f18300i == null ? 0 : this.f18300i.hashCode())) * 31) + (this.f18301j == null ? 0 : this.f18301j.hashCode())) * 31) + (this.f18302k == null ? 0 : this.f18302k.hashCode())) * 31) + (this.f18303l == null ? 0 : this.f18303l.hashCode())) * 31) + (this.f18304m == null ? 0 : this.f18304m.hashCode())) * 31) + (this.f18305n == null ? 0 : this.f18305n.hashCode())) * 31) + (this.f18306o == null ? 0 : this.f18306o.hashCode())) * 31) + (this.f18307p == null ? 0 : this.f18307p.hashCode())) * 31) + (this.f18308q == null ? 0 : this.f18308q.hashCode())) * 31) + (this.f18309r == null ? 0 : this.f18309r.hashCode())) * 31) + (this.f18310s == null ? 0 : this.f18310s.hashCode())) * 31) + (this.f18311t == null ? 0 : this.f18311t.hashCode())) * 31) + (this.f18312u == null ? 0 : this.f18312u.hashCode())) * 31) + (this.f18313v == null ? 0 : this.f18313v.hashCode())) * 31) + (this.f18314w == null ? 0 : this.f18314w.hashCode())) * 31) + (this.f18315x == null ? 0 : this.f18315x.hashCode())) * 31) + (this.f18316y == null ? 0 : this.f18316y.hashCode())) * 31) + (this.f18317z == null ? 0 : this.f18317z.hashCode())) * 31) + og.m5111a(this.f18283A)) * 31) + (this.f18284B == null ? 0 : this.f18284B.hashCode())) * 31) + (this.f18285C == null ? 0 : this.f18285C.hashCode())) * 31) + (this.f18290K == null ? 0 : this.f18290K.hashCode())) * 31) + (this.f18291L == null ? 0 : this.f18291L.hashCode())) * 31) + (this.f18286D == null ? 0 : this.f18286D.hashCode())) * 31) + (this.f18287E == null ? 0 : this.f18287E.hashCode())) * 31) + (this.f18288F == null ? 0 : this.f18288F.hashCode())) * 31) + (this.f18289G == null ? 0 : this.f18289G.hashCode())) * 31;
        if (this.H != null) {
            if (!this.H.m5103a()) {
                i = this.H.hashCode();
            }
        }
        return hashCode + i;
    }
}
