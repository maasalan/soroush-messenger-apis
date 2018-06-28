package com.google.p173d.p174a;

import com.google.p173d.C1958a;
import com.google.p173d.C1987c;
import com.google.p173d.C2007e;
import com.google.p173d.C2045l;
import com.google.p173d.C2046m;
import com.google.p173d.C2047n;
import com.google.p173d.C2048o;
import com.google.p173d.C2049p;
import com.google.p173d.C5615f;
import com.google.p173d.C5629j;
import com.google.p173d.p174a.p175a.C1955a;
import com.google.p173d.p174a.p176b.C1957a;
import com.google.p173d.p177b.C1969e;
import java.util.List;
import java.util.Map;

public final class C5600b implements C2045l {
    public final C2047n mo1757a(C1987c c1987c, Map<C2007e, ?> map) {
        C2049p[] c2049pArr;
        C2049p[] c2049pArr2;
        C5629j c5629j;
        C5629j c5629j2;
        C5599a a;
        C2049p[] c2049pArr3;
        C2047n c2047n;
        List list;
        String str;
        C2046m e;
        C1957a c1957a = new C1957a(c1987c.m5457b());
        C1969e c1969e = null;
        try {
            C5599a a2 = c1957a.m5385a(false);
            c2049pArr = a2.f6623e;
            try {
                C1969e a3 = new C1955a().m5373a(a2);
                c2049pArr2 = c2049pArr;
                c5629j = null;
                c1969e = a3;
                c5629j2 = c5629j;
            } catch (C5629j e2) {
                c5629j2 = e2;
                c2049pArr2 = c2049pArr;
                c5629j = null;
                if (c1969e == null) {
                    try {
                        a = c1957a.m5385a(true);
                        c2049pArr2 = a.f6623e;
                        c1969e = new C1955a().m5373a(a);
                    } catch (C5629j e3) {
                        if (c5629j2 != null) {
                            throw c5629j2;
                        } else if (c5629j == null) {
                            throw e3;
                        } else {
                            throw c5629j;
                        }
                    }
                }
                c2049pArr3 = c2049pArr2;
                if (map != null) {
                    map.get(C2007e.NEED_RESULT_POINT_CALLBACK);
                }
                c2047n = new C2047n(c1969e.f6614c, c1969e.f6612a, c1969e.f6613b, c2049pArr3, C1958a.AZTEC, System.currentTimeMillis());
                list = c1969e.f6615d;
                if (list != null) {
                    c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
                }
                str = c1969e.f6616e;
                if (str != null) {
                    c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
                }
                return c2047n;
            } catch (C5615f e4) {
                e = e4;
                c2049pArr2 = c2049pArr;
                c5629j = e;
                c5629j2 = null;
                if (c1969e == null) {
                    a = c1957a.m5385a(true);
                    c2049pArr2 = a.f6623e;
                    c1969e = new C1955a().m5373a(a);
                }
                c2049pArr3 = c2049pArr2;
                if (map != null) {
                    map.get(C2007e.NEED_RESULT_POINT_CALLBACK);
                }
                c2047n = new C2047n(c1969e.f6614c, c1969e.f6612a, c1969e.f6613b, c2049pArr3, C1958a.AZTEC, System.currentTimeMillis());
                list = c1969e.f6615d;
                if (list != null) {
                    c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
                }
                str = c1969e.f6616e;
                if (str != null) {
                    c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
                }
                return c2047n;
            }
        } catch (C5629j e5) {
            c5629j2 = e5;
            c2049pArr = null;
            c2049pArr2 = c2049pArr;
            c5629j = null;
            if (c1969e == null) {
                a = c1957a.m5385a(true);
                c2049pArr2 = a.f6623e;
                c1969e = new C1955a().m5373a(a);
            }
            c2049pArr3 = c2049pArr2;
            if (map != null) {
                map.get(C2007e.NEED_RESULT_POINT_CALLBACK);
            }
            c2047n = new C2047n(c1969e.f6614c, c1969e.f6612a, c1969e.f6613b, c2049pArr3, C1958a.AZTEC, System.currentTimeMillis());
            list = c1969e.f6615d;
            if (list != null) {
                c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
            }
            str = c1969e.f6616e;
            if (str != null) {
                c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
            }
            return c2047n;
        } catch (C5615f e6) {
            e = e6;
            c2049pArr = null;
            c2049pArr2 = c2049pArr;
            c5629j = e;
            c5629j2 = null;
            if (c1969e == null) {
                a = c1957a.m5385a(true);
                c2049pArr2 = a.f6623e;
                c1969e = new C1955a().m5373a(a);
            }
            c2049pArr3 = c2049pArr2;
            if (map != null) {
                map.get(C2007e.NEED_RESULT_POINT_CALLBACK);
            }
            c2047n = new C2047n(c1969e.f6614c, c1969e.f6612a, c1969e.f6613b, c2049pArr3, C1958a.AZTEC, System.currentTimeMillis());
            list = c1969e.f6615d;
            if (list != null) {
                c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
            }
            str = c1969e.f6616e;
            if (str != null) {
                c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
            }
            return c2047n;
        }
        if (c1969e == null) {
            a = c1957a.m5385a(true);
            c2049pArr2 = a.f6623e;
            c1969e = new C1955a().m5373a(a);
        }
        c2049pArr3 = c2049pArr2;
        if (map != null) {
            map.get(C2007e.NEED_RESULT_POINT_CALLBACK);
        }
        c2047n = new C2047n(c1969e.f6614c, c1969e.f6612a, c1969e.f6613b, c2049pArr3, C1958a.AZTEC, System.currentTimeMillis());
        list = c1969e.f6615d;
        if (list != null) {
            c2047n.m5581a(C2048o.BYTE_SEGMENTS, list);
        }
        str = c1969e.f6616e;
        if (str != null) {
            c2047n.m5581a(C2048o.ERROR_CORRECTION_LEVEL, str);
        }
        return c2047n;
    }

    public final void mo1758a() {
    }
}
