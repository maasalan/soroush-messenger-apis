package com.google.android.gms.internal;

public final class nz {
    final byte[] f6228a;
    int f6229b;
    private int f6230c;
    private int f6231d;
    private int f6232e;
    private int f6233f;
    private int f6234g = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private int f6235h;
    private int f6236i = 64;
    private int f6237j = 67108864;

    private nz(byte[] bArr, int i) {
        this.f6228a = bArr;
        this.f6229b = 0;
        this.f6230c = i + 0;
        this.f6232e = 0;
    }

    public static nz m5045a(byte[] bArr, int i) {
        return new nz(bArr, i);
    }

    private final void m5046f(int i) {
        if (i < 0) {
            throw oh.m5119b();
        } else if (this.f6232e + i > this.f6234g) {
            m5046f(this.f6234g - this.f6232e);
            throw oh.m5118a();
        } else if (i <= this.f6230c - this.f6232e) {
            this.f6232e += i;
        } else {
            throw oh.m5118a();
        }
    }

    private final void m5047m() {
        this.f6230c += this.f6231d;
        int i = this.f6230c;
        if (i > this.f6234g) {
            this.f6231d = i - this.f6234g;
            this.f6230c -= this.f6231d;
            return;
        }
        this.f6231d = 0;
    }

    private final byte m5048n() {
        if (this.f6232e == this.f6230c) {
            throw oh.m5118a();
        }
        byte[] bArr = this.f6228a;
        int i = this.f6232e;
        this.f6232e = i + 1;
        return bArr[i];
    }

    public final int m5049a() {
        if (this.f6232e == this.f6230c) {
            this.f6233f = 0;
            return 0;
        }
        this.f6233f = m5062g();
        if (this.f6233f != 0) {
            return this.f6233f;
        }
        throw new oh("Protocol message contained an invalid tag (zero).");
    }

    public final void m5050a(int i) {
        if (this.f6233f != i) {
            throw new oh("Protocol message end-group tag did not match expected tag.");
        }
    }

    final void m5051a(int i, int i2) {
        if (i > this.f6232e - this.f6229b) {
            int i3 = this.f6232e - this.f6229b;
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.f6232e = this.f6229b + i;
            this.f6233f = i2;
        }
    }

    public final void m5052a(oi oiVar) {
        int g = m5062g();
        if (this.f6235h >= this.f6236i) {
            throw oh.m5121d();
        }
        g = m5056c(g);
        this.f6235h++;
        oiVar.mo3038a(this);
        m5050a(0);
        this.f6235h--;
        m5057d(g);
    }

    public final long m5053b() {
        return m5063h();
    }

    public final boolean m5054b(int i) {
        switch (i & 7) {
            case 0:
                m5062g();
                return true;
            case 1:
                m5065j();
                return true;
            case 2:
                m5046f(m5062g());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m5064i();
                return true;
            default:
                throw new oh("Protocol message tag had invalid wire type.");
        }
        int a;
        do {
            a = m5049a();
            if (a != 0) {
            }
            m5050a(((i >>> 3) << 3) | 4);
            return true;
        } while (m5054b(a));
        m5050a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int m5055c() {
        return m5062g();
    }

    public final int m5056c(int i) {
        if (i < 0) {
            throw oh.m5119b();
        }
        i += this.f6232e;
        int i2 = this.f6234g;
        if (i > i2) {
            throw oh.m5118a();
        }
        this.f6234g = i;
        m5047m();
        return i2;
    }

    public final void m5057d(int i) {
        this.f6234g = i;
        m5047m();
    }

    public final boolean m5058d() {
        return m5062g() != 0;
    }

    public final String m5059e() {
        int g = m5062g();
        if (g < 0) {
            throw oh.m5119b();
        } else if (g > this.f6230c - this.f6232e) {
            throw oh.m5118a();
        } else {
            String str = new String(this.f6228a, this.f6232e, g, og.f6251a);
            this.f6232e += g;
            return str;
        }
    }

    public final void m5060e(int i) {
        m5051a(i, this.f6233f);
    }

    public final byte[] m5061f() {
        int g = m5062g();
        if (g < 0) {
            throw oh.m5119b();
        } else if (g == 0) {
            return ol.f6263g;
        } else {
            if (g > this.f6230c - this.f6232e) {
                throw oh.m5118a();
            }
            Object obj = new byte[g];
            System.arraycopy(this.f6228a, this.f6232e, obj, 0, g);
            this.f6232e += g;
            return obj;
        }
    }

    public final int m5062g() {
        byte n = m5048n();
        if (n >= (byte) 0) {
            return n;
        }
        int i;
        int i2 = n & 127;
        byte n2 = m5048n();
        if (n2 >= (byte) 0) {
            i = n2 << 7;
        } else {
            i2 |= (n2 & 127) << 7;
            n2 = m5048n();
            if (n2 >= (byte) 0) {
                i = n2 << 14;
            } else {
                i2 |= (n2 & 127) << 14;
                n2 = m5048n();
                if (n2 >= (byte) 0) {
                    i = n2 << 21;
                } else {
                    i2 |= (n2 & 127) << 21;
                    n2 = m5048n();
                    i2 |= n2 << 28;
                    if (n2 >= (byte) 0) {
                        return i2;
                    }
                    for (i = 0; i < 5; i++) {
                        if (m5048n() >= (byte) 0) {
                            return i2;
                        }
                    }
                    throw oh.m5120c();
                }
            }
        }
        return i2 | i;
    }

    public final long m5063h() {
        int i = 0;
        long j = 0;
        while (i < 64) {
            byte n = m5048n();
            long j2 = j | (((long) (n & 127)) << i);
            if ((n & 128) == 0) {
                return j2;
            }
            i += 7;
            j = j2;
        }
        throw oh.m5120c();
    }

    public final int m5064i() {
        return (((m5048n() & 255) | ((m5048n() & 255) << 8)) | ((m5048n() & 255) << 16)) | ((m5048n() & 255) << 24);
    }

    public final long m5065j() {
        return (((((((((long) m5048n()) & 255) | ((((long) m5048n()) & 255) << 8)) | ((((long) m5048n()) & 255) << 16)) | ((((long) m5048n()) & 255) << 24)) | ((((long) m5048n()) & 255) << 32)) | ((((long) m5048n()) & 255) << 40)) | ((((long) m5048n()) & 255) << 48)) | ((((long) m5048n()) & 255) << 56);
    }

    public final int m5066k() {
        if (this.f6234g == ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) {
            return -1;
        }
        return this.f6234g - this.f6232e;
    }

    public final int m5067l() {
        return this.f6232e - this.f6229b;
    }
}
