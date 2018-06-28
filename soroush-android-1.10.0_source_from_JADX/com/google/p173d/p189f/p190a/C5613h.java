package com.google.p173d.p189f.p190a;

final class C5613h extends C2019g {
    final boolean f15473c;

    C5613h(C2013c c2013c, boolean z) {
        super(c2013c);
        this.f15473c = z;
    }

    final C2011a m12341a() {
        C2014d[] c2014dArr = this.f6780b;
        C2012b c2012b = new C2012b();
        C2012b c2012b2 = new C2012b();
        C2012b c2012b3 = new C2012b();
        C2012b c2012b4 = new C2012b();
        for (C2014d c2014d : c2014dArr) {
            if (c2014d != null) {
                c2014d.m5505b();
                int i = c2014d.f6761d % 30;
                int i2 = c2014d.f6762e;
                if (!this.f15473c) {
                    i2 += 2;
                }
                switch (i2 % 3) {
                    case 0:
                        c2012b2.m5499a((i * 3) + 1);
                        break;
                    case 1:
                        c2012b4.m5499a(i / 3);
                        c2012b3.m5499a(i % 3);
                        break;
                    case 2:
                        c2012b.m5499a(i + 1);
                        break;
                    default:
                        break;
                }
            }
        }
        if (!(c2012b.m5500a().length == 0 || c2012b2.m5500a().length == 0 || c2012b3.m5500a().length == 0 || c2012b4.m5500a().length == 0 || c2012b.m5500a()[0] <= 0 || c2012b2.m5500a()[0] + c2012b3.m5500a()[0] < 3)) {
            if (c2012b2.m5500a()[0] + c2012b3.m5500a()[0] <= 90) {
                C2011a c2011a = new C2011a(c2012b.m5500a()[0], c2012b2.m5500a()[0], c2012b3.m5500a()[0], c2012b4.m5500a()[0]);
                m12342a(c2014dArr, c2011a);
                return c2011a;
            }
        }
        return null;
    }

    final void m12342a(C2014d[] c2014dArr, C2011a c2011a) {
        for (int i = 0; i < c2014dArr.length; i++) {
            C2014d c2014d = c2014dArr[i];
            if (c2014dArr[i] != null) {
                int i2 = c2014d.f6761d % 30;
                int i3 = c2014d.f6762e;
                if (i3 <= c2011a.f6747e) {
                    if (!this.f15473c) {
                        i3 += 2;
                    }
                    switch (i3 % 3) {
                        case 0:
                            if ((i2 * 3) + 1 == c2011a.f6745c) {
                                break;
                            }
                            c2014dArr[i] = null;
                            break;
                        case 1:
                            if (i2 / 3 != c2011a.f6744b || i2 % 3 != c2011a.f6746d) {
                                c2014dArr[i] = null;
                                break;
                            }
                            break;
                            break;
                        case 2:
                            if (i2 + 1 == c2011a.f6743a) {
                                break;
                            }
                            c2014dArr[i] = null;
                            break;
                        default:
                            break;
                    }
                }
                c2014dArr[i] = null;
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("IsLeft: ");
        stringBuilder.append(this.f15473c);
        stringBuilder.append('\n');
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
