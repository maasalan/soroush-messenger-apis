package p056c.p057a.p061e;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p056c.p057a.C0885c;
import p056c.p057a.p061e.C0901k.C0900a;
import p206d.C2272f;
import p206d.C2273l;
import p206d.C2278s;
import p206d.C5683e;
import p206d.C6623c;

final class C0891d {
    static final C0888c[] f2691a;
    static final Map<C2272f, Integer> f2692b;

    static final class C0889a {
        final List<C0888c> f2673a;
        final C5683e f2674b;
        final int f2675c;
        int f2676d;
        C0888c[] f2677e;
        int f2678f;
        int f2679g;
        int f2680h;

        C0889a(C2278s c2278s) {
            this(c2278s, (byte) 0);
        }

        private C0889a(C2278s c2278s, byte b) {
            this.f2673a = new ArrayList();
            this.f2677e = new C0888c[8];
            this.f2678f = this.f2677e.length - 1;
            this.f2679g = 0;
            this.f2680h = 0;
            this.f2675c = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f2676d = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f2674b = C2273l.m6209a(c2278s);
        }

        private void m2114c() {
            Arrays.fill(this.f2677e, null);
            this.f2678f = this.f2677e.length - 1;
            this.f2679g = 0;
            this.f2680h = 0;
        }

        static boolean m2115c(int i) {
            return i >= 0 && i <= C0891d.f2691a.length - 1;
        }

        private int m2116d() {
            return this.f2674b.mo3135f() & 255;
        }

        private int m2117d(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f2677e.length - 1; length >= this.f2678f && i > 0; length--) {
                    i -= this.f2677e[length].f2672i;
                    this.f2680h -= this.f2677e[length].f2672i;
                    this.f2679g--;
                    i2++;
                }
                System.arraycopy(this.f2677e, this.f2678f + 1, this.f2677e, (this.f2678f + 1) + i2, this.f2679g);
                this.f2678f += i2;
            }
            return i2;
        }

        final int m2118a(int i) {
            return (this.f2678f + 1) + i;
        }

        final int m2119a(int i, int i2) {
            i &= i2;
            if (i < i2) {
                return i;
            }
            i = 0;
            while (true) {
                int d = m2116d();
                if ((d & 128) == 0) {
                    return i2 + (d << i);
                }
                i2 += (d & 127) << i;
                i += 7;
            }
        }

        final void m2120a() {
            if (this.f2676d < this.f2680h) {
                if (this.f2676d == 0) {
                    m2114c();
                    return;
                }
                m2117d(this.f2680h - this.f2676d);
            }
        }

        final void m2121a(C0888c c0888c) {
            this.f2673a.add(c0888c);
            int i = c0888c.f2672i;
            if (i > this.f2676d) {
                m2114c();
                return;
            }
            m2117d((this.f2680h + i) - this.f2676d);
            if (this.f2679g + 1 > this.f2677e.length) {
                Object obj = new C0888c[(this.f2677e.length * 2)];
                System.arraycopy(this.f2677e, 0, obj, this.f2677e.length, this.f2677e.length);
                this.f2678f = this.f2677e.length - 1;
                this.f2677e = obj;
            }
            int i2 = this.f2678f;
            this.f2678f = i2 - 1;
            this.f2677e[i2] = c0888c;
            this.f2679g++;
            this.f2680h += i;
        }

        final C2272f m2122b() {
            int d = m2116d();
            int i = 0;
            int i2 = (d & 128) == 128 ? 1 : 0;
            d = m2119a(d, 127);
            if (i2 == 0) {
                return this.f2674b.mo3132d((long) d);
            }
            C0901k a = C0901k.m2193a();
            byte[] g = this.f2674b.mo3139g((long) d);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i3 = 0;
            C0900a c0900a = a.f2759a;
            int i4 = i3;
            while (i < g.length) {
                i4 = (i4 << 8) | (g[i] & 255);
                i3 += 8;
                while (i3 >= 8) {
                    c0900a = c0900a.f2753a[(i4 >>> (i3 - 8)) & 255];
                    if (c0900a.f2753a == null) {
                        byteArrayOutputStream.write(c0900a.f2754b);
                        i3 -= c0900a.f2755c;
                        c0900a = a.f2759a;
                    } else {
                        i3 -= 8;
                    }
                }
                i++;
            }
            while (i3 > 0) {
                C0900a c0900a2 = c0900a.f2753a[(i4 << (8 - i3)) & 255];
                if (c0900a2.f2753a != null || c0900a2.f2755c > i3) {
                    break;
                }
                byteArrayOutputStream.write(c0900a2.f2754b);
                i3 -= c0900a2.f2755c;
                c0900a = a.f2759a;
            }
            return C2272f.m6192a(byteArrayOutputStream.toByteArray());
        }

        final C2272f m2123b(int i) {
            C0888c c0888c;
            if (C0889a.m2115c(i)) {
                c0888c = C0891d.f2691a[i];
            } else {
                int a = m2118a(i - C0891d.f2691a.length);
                if (a >= 0) {
                    if (a < this.f2677e.length) {
                        c0888c = this.f2677e[a];
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Header index too large ");
                stringBuilder.append(i + 1);
                throw new IOException(stringBuilder.toString());
            }
            return c0888c.f2670g;
        }
    }

    static final class C0890b {
        int f2681a;
        int f2682b;
        C0888c[] f2683c;
        int f2684d;
        int f2685e;
        int f2686f;
        private final C6623c f2687g;
        private final boolean f2688h;
        private int f2689i;
        private boolean f2690j;

        C0890b(C6623c c6623c) {
            this(c6623c, (byte) 0);
        }

        private C0890b(C6623c c6623c, byte b) {
            this.f2689i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f2683c = new C0888c[8];
            this.f2684d = this.f2683c.length - 1;
            this.f2685e = 0;
            this.f2686f = 0;
            this.f2681a = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f2682b = ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f2688h = true;
            this.f2687g = c6623c;
        }

        private void m2124a() {
            Arrays.fill(this.f2683c, null);
            this.f2684d = this.f2683c.length - 1;
            this.f2685e = 0;
            this.f2686f = 0;
        }

        private void m2125a(int i, int i2, int i3) {
            C6623c c6623c;
            if (i < i2) {
                c6623c = this.f2687g;
                i |= i3;
            } else {
                this.f2687g.m17033b(i3 | i2);
                i -= i2;
                while (i >= 128) {
                    this.f2687g.m17033b(128 | (i & 127));
                    i >>>= 7;
                }
                c6623c = this.f2687g;
            }
            c6623c.m17033b(i);
        }

        private void m2126a(C0888c c0888c) {
            int i = c0888c.f2672i;
            if (i > this.f2682b) {
                m2124a();
                return;
            }
            m2128b((this.f2686f + i) - this.f2682b);
            if (this.f2685e + 1 > this.f2683c.length) {
                Object obj = new C0888c[(this.f2683c.length * 2)];
                System.arraycopy(this.f2683c, 0, obj, this.f2683c.length, this.f2683c.length);
                this.f2684d = this.f2683c.length - 1;
                this.f2683c = obj;
            }
            int i2 = this.f2684d;
            this.f2684d = i2 - 1;
            this.f2683c[i2] = c0888c;
            this.f2685e++;
            this.f2686f += i;
        }

        private void m2127a(C2272f c2272f) {
            int g;
            int i;
            if (this.f2688h) {
                C0901k.m2193a();
                if (C0901k.m2192a(c2272f) < c2272f.mo2050g()) {
                    Object c6623c = new C6623c();
                    C0901k.m2193a();
                    C0901k.m2194a(c2272f, c6623c);
                    c2272f = c6623c.m17067l();
                    g = c2272f.mo2050g();
                    i = 128;
                    m2125a(g, 127, i);
                    this.f2687g.m17025a(c2272f);
                }
            }
            g = c2272f.mo2050g();
            i = 0;
            m2125a(g, 127, i);
            this.f2687g.m17025a(c2272f);
        }

        private int m2128b(int i) {
            int i2 = 0;
            if (i > 0) {
                for (int length = this.f2683c.length - 1; length >= this.f2684d && i > 0; length--) {
                    i -= this.f2683c[length].f2672i;
                    this.f2686f -= this.f2683c[length].f2672i;
                    this.f2685e--;
                    i2++;
                }
                System.arraycopy(this.f2683c, this.f2684d + 1, this.f2683c, (this.f2684d + 1) + i2, this.f2685e);
                Arrays.fill(this.f2683c, this.f2684d + 1, (this.f2684d + 1) + i2, null);
                this.f2684d += i2;
            }
            return i2;
        }

        final void m2129a(int i) {
            this.f2681a = i;
            i = Math.min(i, 16384);
            if (this.f2682b != i) {
                if (i < this.f2682b) {
                    this.f2689i = Math.min(this.f2689i, i);
                }
                this.f2690j = true;
                this.f2682b = i;
                if (this.f2682b < this.f2686f) {
                    if (this.f2682b == 0) {
                        m2124a();
                        return;
                    }
                    m2128b(this.f2686f - this.f2682b);
                }
            }
        }

        final void m2130a(List<C0888c> list) {
            if (this.f2690j) {
                if (this.f2689i < this.f2682b) {
                    m2125a(this.f2689i, 31, 32);
                }
                this.f2690j = false;
                this.f2689i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                m2125a(this.f2682b, 31, 32);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int intValue;
                int i2;
                int length;
                int i3;
                C2272f c2272f;
                C0888c c0888c = (C0888c) list.get(i);
                C2272f f = c0888c.f2670g.mo2049f();
                C2272f c2272f2 = c0888c.f2671h;
                Integer num = (Integer) C0891d.f2692b.get(f);
                if (num != null) {
                    intValue = num.intValue() + 1;
                    if (intValue > 1 && intValue < 8) {
                        if (!C0885c.m2103a(C0891d.f2691a[intValue - 1].f2671h, (Object) c2272f2)) {
                            if (C0885c.m2103a(C0891d.f2691a[intValue].f2671h, (Object) c2272f2)) {
                                i2 = intValue;
                                intValue++;
                                if (intValue == -1) {
                                    length = this.f2683c.length;
                                    for (i3 = this.f2684d + 1; i3 < length; i3++) {
                                        if (C0885c.m2103a(this.f2683c[i3].f2670g, (Object) f)) {
                                            if (!C0885c.m2103a(this.f2683c[i3].f2671h, (Object) c2272f2)) {
                                                intValue = C0891d.f2691a.length + (i3 - this.f2684d);
                                                break;
                                            } else if (i2 != -1) {
                                                i2 = (i3 - this.f2684d) + C0891d.f2691a.length;
                                            }
                                        }
                                    }
                                }
                                if (intValue != -1) {
                                    m2125a(intValue, 127, 128);
                                } else {
                                    if (i2 == -1) {
                                        this.f2687g.m17033b(64);
                                        m2127a(f);
                                    } else {
                                        c2272f = C0888c.f2664a;
                                        if (f.mo2042a(0, c2272f, 0, c2272f.mo2050g()) || C0888c.f2669f.equals(f)) {
                                            m2125a(i2, 63, 64);
                                        } else {
                                            m2125a(i2, 15, 0);
                                            m2127a(c2272f2);
                                        }
                                    }
                                    m2127a(c2272f2);
                                    m2126a(c0888c);
                                }
                            }
                        }
                    }
                    i2 = intValue;
                    intValue = -1;
                    if (intValue == -1) {
                        length = this.f2683c.length;
                        for (i3 = this.f2684d + 1; i3 < length; i3++) {
                            if (C0885c.m2103a(this.f2683c[i3].f2670g, (Object) f)) {
                                if (!C0885c.m2103a(this.f2683c[i3].f2671h, (Object) c2272f2)) {
                                    intValue = C0891d.f2691a.length + (i3 - this.f2684d);
                                    break;
                                } else if (i2 != -1) {
                                    i2 = (i3 - this.f2684d) + C0891d.f2691a.length;
                                }
                            }
                        }
                    }
                    if (intValue != -1) {
                        if (i2 == -1) {
                            c2272f = C0888c.f2664a;
                            if (f.mo2042a(0, c2272f, 0, c2272f.mo2050g())) {
                            }
                            m2125a(i2, 63, 64);
                        } else {
                            this.f2687g.m17033b(64);
                            m2127a(f);
                        }
                        m2127a(c2272f2);
                        m2126a(c0888c);
                    } else {
                        m2125a(intValue, 127, 128);
                    }
                } else {
                    intValue = -1;
                }
                i2 = intValue;
                if (intValue == -1) {
                    length = this.f2683c.length;
                    for (i3 = this.f2684d + 1; i3 < length; i3++) {
                        if (C0885c.m2103a(this.f2683c[i3].f2670g, (Object) f)) {
                            if (!C0885c.m2103a(this.f2683c[i3].f2671h, (Object) c2272f2)) {
                                intValue = C0891d.f2691a.length + (i3 - this.f2684d);
                                break;
                            } else if (i2 != -1) {
                                i2 = (i3 - this.f2684d) + C0891d.f2691a.length;
                            }
                        }
                    }
                }
                if (intValue != -1) {
                    m2125a(intValue, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.f2687g.m17033b(64);
                        m2127a(f);
                    } else {
                        c2272f = C0888c.f2664a;
                        if (f.mo2042a(0, c2272f, 0, c2272f.mo2050g())) {
                        }
                        m2125a(i2, 63, 64);
                    }
                    m2127a(c2272f2);
                    m2126a(c0888c);
                }
            }
        }
    }

    static {
        r0 = new C0888c[61];
        int i = 0;
        r0[0] = new C0888c(C0888c.f2669f, "");
        r0[1] = new C0888c(C0888c.f2666c, "GET");
        r0[2] = new C0888c(C0888c.f2666c, "POST");
        r0[3] = new C0888c(C0888c.f2667d, "/");
        r0[4] = new C0888c(C0888c.f2667d, "/index.html");
        r0[5] = new C0888c(C0888c.f2668e, "http");
        r0[6] = new C0888c(C0888c.f2668e, "https");
        r0[7] = new C0888c(C0888c.f2665b, "200");
        r0[8] = new C0888c(C0888c.f2665b, "204");
        r0[9] = new C0888c(C0888c.f2665b, "206");
        r0[10] = new C0888c(C0888c.f2665b, "304");
        r0[11] = new C0888c(C0888c.f2665b, "400");
        r0[12] = new C0888c(C0888c.f2665b, "404");
        r0[13] = new C0888c(C0888c.f2665b, "500");
        r0[14] = new C0888c("accept-charset", "");
        r0[15] = new C0888c("accept-encoding", "gzip, deflate");
        r0[16] = new C0888c("accept-language", "");
        r0[17] = new C0888c("accept-ranges", "");
        r0[18] = new C0888c("accept", "");
        r0[19] = new C0888c("access-control-allow-origin", "");
        r0[20] = new C0888c("age", "");
        r0[21] = new C0888c("allow", "");
        r0[22] = new C0888c("authorization", "");
        r0[23] = new C0888c("cache-control", "");
        r0[24] = new C0888c("content-disposition", "");
        r0[25] = new C0888c("content-encoding", "");
        r0[26] = new C0888c("content-language", "");
        r0[27] = new C0888c("content-length", "");
        r0[28] = new C0888c("content-location", "");
        r0[29] = new C0888c("content-range", "");
        r0[30] = new C0888c("content-type", "");
        r0[31] = new C0888c("cookie", "");
        r0[32] = new C0888c("date", "");
        r0[33] = new C0888c("etag", "");
        r0[34] = new C0888c("expect", "");
        r0[35] = new C0888c("expires", "");
        r0[36] = new C0888c(PrivacyItem.SUBSCRIPTION_FROM, "");
        r0[37] = new C0888c("host", "");
        r0[38] = new C0888c("if-match", "");
        r0[39] = new C0888c("if-modified-since", "");
        r0[40] = new C0888c("if-none-match", "");
        r0[41] = new C0888c("if-range", "");
        r0[42] = new C0888c("if-unmodified-since", "");
        r0[43] = new C0888c("last-modified", "");
        r0[44] = new C0888c("link", "");
        r0[45] = new C0888c("location", "");
        r0[46] = new C0888c("max-forwards", "");
        r0[47] = new C0888c("proxy-authenticate", "");
        r0[48] = new C0888c("proxy-authorization", "");
        r0[49] = new C0888c(RangeValidateElement.METHOD, "");
        r0[50] = new C0888c("referer", "");
        r0[51] = new C0888c("refresh", "");
        r0[52] = new C0888c("retry-after", "");
        r0[53] = new C0888c("server", "");
        r0[54] = new C0888c("set-cookie", "");
        r0[55] = new C0888c("strict-transport-security", "");
        r0[56] = new C0888c("transfer-encoding", "");
        r0[57] = new C0888c("user-agent", "");
        r0[58] = new C0888c("vary", "");
        r0[59] = new C0888c("via", "");
        r0[60] = new C0888c("www-authenticate", "");
        f2691a = r0;
        Map linkedHashMap = new LinkedHashMap(f2691a.length);
        while (i < f2691a.length) {
            if (!linkedHashMap.containsKey(f2691a[i].f2670g)) {
                linkedHashMap.put(f2691a[i].f2670g, Integer.valueOf(i));
            }
            i++;
        }
        f2692b = Collections.unmodifiableMap(linkedHashMap);
    }

    static C2272f m2131a(C2272f c2272f) {
        int g = c2272f.mo2050g();
        int i = 0;
        while (i < g) {
            byte a = c2272f.mo2038a(i);
            if (a < (byte) 65 || a > (byte) 90) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                stringBuilder.append(c2272f.mo2040a());
                throw new IOException(stringBuilder.toString());
            }
        }
        return c2272f;
    }
}
