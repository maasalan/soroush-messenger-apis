package p050b.p051a;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p050b.C0851i;

public final class C0827p {
    public static final C0851i f2479e = null;
    ak f2480a;
    int f2481b;
    int f2482c;
    HashMap f2483d;

    public C0827p(DataInputStream dataInputStream) {
        this.f2483d = null;
        this.f2482c = 0;
        m1863a(dataInputStream);
    }

    public C0827p(String str) {
        this.f2480a = new ak();
        this.f2483d = null;
        this.f2481b = 0;
        m1864b(null);
        this.f2482c = m1873a(str);
    }

    private void m1863a(DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f2480a = new ak(readUnsignedShort);
        this.f2481b = 0;
        m1864b(null);
        while (true) {
            readUnsignedShort--;
            if (readUnsignedShort > 0) {
                C0826n azVar;
                int readUnsignedByte = dataInputStream.readUnsignedByte();
                switch (readUnsignedByte) {
                    case 1:
                        azVar = new az(dataInputStream, this.f2481b);
                        break;
                    case 3:
                        azVar = new ad(dataInputStream, this.f2481b);
                        break;
                    case 4:
                        azVar = new ab(dataInputStream, this.f2481b);
                        break;
                    case 5:
                        azVar = new aj(dataInputStream, this.f2481b);
                        break;
                    case 6:
                        azVar = new C4965t(dataInputStream, this.f2481b);
                        break;
                    case 7:
                        azVar = new C4955k(dataInputStream, this.f2481b);
                        break;
                    case 8:
                        azVar = new ax(dataInputStream, this.f2481b);
                        break;
                    case 9:
                        azVar = new aa(dataInputStream, this.f2481b);
                        break;
                    case 10:
                        azVar = new ap(dataInputStream, this.f2481b);
                        break;
                    case 11:
                        azVar = new ae(dataInputStream, this.f2481b);
                        break;
                    case 12:
                        azVar = new aq(dataInputStream, this.f2481b);
                        break;
                    case 15:
                        azVar = new am(dataInputStream, this.f2481b);
                        break;
                    case 16:
                        azVar = new ao(dataInputStream, this.f2481b);
                        break;
                    case 18:
                        azVar = new af(dataInputStream, this.f2481b);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("invalid constant type: ");
                        stringBuilder.append(readUnsignedByte);
                        stringBuilder.append(" at ");
                        stringBuilder.append(this.f2481b);
                        throw new IOException(stringBuilder.toString());
                }
                m1864b(azVar);
                if (readUnsignedByte == 5 || readUnsignedByte == 6) {
                    m1877b();
                    readUnsignedShort--;
                }
            } else {
                return;
            }
        }
    }

    private int m1864b(C0826n c0826n) {
        this.f2480a.m1742a(c0826n);
        int i = this.f2481b;
        this.f2481b = i + 1;
        return i;
    }

    public final int m1865a(double d) {
        int a = m1871a(new C4965t(d, this.f2481b));
        if (a == this.f2481b - 1) {
            m1877b();
        }
        return a;
    }

    public final int m1866a(float f) {
        return m1871a(new ab(f, this.f2481b));
    }

    public final int m1867a(int i, int i2) {
        return m1871a(new aq(i, i2, this.f2481b));
    }

    public final int m1868a(int i, C0827p c0827p, Map map) {
        return i == 0 ? 0 : m1875a(i).mo831a(this, c0827p, map);
    }

    public final int m1869a(int i, String str, String str2) {
        return m1879b(i, m1874a(str, str2));
    }

    public final int m1870a(long j) {
        int a = m1871a(new aj(j, this.f2481b));
        if (a == this.f2481b - 1) {
            m1877b();
        }
        return a;
    }

    final int m1871a(C0826n c0826n) {
        if (this.f2483d == null) {
            ak akVar = this.f2480a;
            HashMap hashMap = new HashMap();
            int i = 1;
            while (true) {
                int i2 = i + 1;
                C0826n a = akVar.m1741a(i);
                if (a == null) {
                    break;
                }
                hashMap.put(a, a);
                i = i2;
            }
            this.f2483d = hashMap;
        }
        C0826n c0826n2 = (C0826n) this.f2483d.get(c0826n);
        if (c0826n2 != null) {
            return c0826n2.f2478b;
        }
        this.f2480a.m1742a(c0826n);
        this.f2483d.put(c0826n, c0826n);
        int i3 = this.f2481b;
        this.f2481b = i3 + 1;
        return i3;
    }

    public final int m1872a(C0851i c0851i) {
        if (c0851i == f2479e) {
            return this.f2482c;
        }
        return m1873a(!c0851i.mo913b() ? c0851i.m1999m() : C0828s.m1895a(c0851i));
    }

    public final int m1873a(String str) {
        return m1871a(new C4955k(m1883c(C0828s.m1897a(str)), this.f2481b));
    }

    public final int m1874a(String str, String str2) {
        return m1867a(m1883c(str), m1883c(str2));
    }

    public final C0826n m1875a(int i) {
        return this.f2480a.m1741a(i);
    }

    public final String m1876a() {
        return m1884c(this.f2482c);
    }

    final int m1877b() {
        return m1864b(new C4962o(this.f2481b));
    }

    public final int m1878b(int i) {
        return m1875a(i).mo830a();
    }

    public final int m1879b(int i, int i2) {
        return m1871a(new aa(i, i2, this.f2481b));
    }

    public final int m1880b(int i, String str, String str2) {
        return m1882c(i, m1874a(str, str2));
    }

    public final int m1881b(String str) {
        return m1871a(new ax(m1883c(str), this.f2481b));
    }

    public final int m1882c(int i, int i2) {
        return m1871a(new ap(i, i2, this.f2481b));
    }

    public final int m1883c(String str) {
        return m1871a(new az(str, this.f2481b));
    }

    public final String m1884c(int i) {
        C4955k c4955k = (C4955k) m1875a(i);
        return c4955k == null ? null : m1892j(c4955k.f13797a).replace('/', '.');
    }

    public final int m1885d(int i, int i2) {
        return m1871a(new ae(i, i2, this.f2481b));
    }

    public final String m1886d(int i) {
        aa aaVar = (aa) m1875a(i);
        if (aaVar == null) {
            return null;
        }
        aq aqVar = (aq) m1875a(aaVar.c);
        return aqVar == null ? null : m1892j(aqVar.f13746c);
    }

    public final String m1887e(int i) {
        ap apVar = (ap) m1875a(i);
        return apVar == null ? null : m1884c(apVar.a);
    }

    public final int m1888f(int i) {
        return ((ad) m1875a(i)).f13736a;
    }

    public final float m1889g(int i) {
        return ((ab) m1875a(i)).f13735a;
    }

    public final long m1890h(int i) {
        return ((aj) m1875a(i)).f13739a;
    }

    public final double m1891i(int i) {
        return ((C4965t) m1875a(i)).f13817a;
    }

    public final String m1892j(int i) {
        return ((az) m1875a(i)).f13767a;
    }

    public final int m1893k(int i) {
        return m1871a(new ad(i, this.f2481b));
    }
}
