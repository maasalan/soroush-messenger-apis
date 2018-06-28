package com.google.p164b.p166b.p167a;

import com.google.b.b.a.n.AnonymousClass19;
import com.google.b.b.a.n.AnonymousClass28;
import com.google.b.b.a.n.AnonymousClass29;
import com.google.p164b.C1940f;
import com.google.p164b.C1944k;
import com.google.p164b.C1948t;
import com.google.p164b.C1949u;
import com.google.p164b.C5590i;
import com.google.p164b.C5591l;
import com.google.p164b.C5592m;
import com.google.p164b.C5593n;
import com.google.p164b.C5594p;
import com.google.p164b.C5595r;
import com.google.p164b.p165a.C1904c;
import com.google.p164b.p166b.C1921f;
import com.google.p164b.p166b.p167a.C1913n.C5564a;
import com.google.p164b.p169c.C1933a;
import com.google.p164b.p170d.C1935a;
import com.google.p164b.p170d.C1936b;
import com.google.p164b.p170d.C1937c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class C1913n {
    public static final C1948t<String> f6335A = new C55628();
    public static final C1948t<BigDecimal> f6336B = new C55639();
    public static final C1948t<BigInteger> f6337C = new C1948t<BigInteger>() {
        private static BigInteger m12175b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return new BigInteger(c1935a.mo1723i());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass10.m12175b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((BigInteger) obj);
        }
    };
    public static final C1949u f6338D = C1913n.m5247a(String.class, f6335A);
    public static final C1948t<StringBuilder> f6339E = new C1948t<StringBuilder>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return new StringBuilder(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            StringBuilder stringBuilder = (StringBuilder) obj;
            c1937c.mo1739b(stringBuilder == null ? null : stringBuilder.toString());
        }
    };
    public static final C1949u f6340F = C1913n.m5247a(StringBuilder.class, f6339E);
    public static final C1948t<StringBuffer> f6341G = new C1948t<StringBuffer>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return new StringBuffer(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            StringBuffer stringBuffer = (StringBuffer) obj;
            c1937c.mo1739b(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    public static final C1949u f6342H = C1913n.m5247a(StringBuffer.class, f6341G);
    public static final C1948t<URL> f6343I = new C1948t<URL>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            String i = c1935a.mo1723i();
            return "null".equals(i) ? null : new URL(i);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            URL url = (URL) obj;
            c1937c.mo1739b(url == null ? null : url.toExternalForm());
        }
    };
    public static final C1949u f6344J = C1913n.m5247a(URL.class, f6343I);
    public static final C1948t<URI> f6345K = new C1948t<URI>() {
        private static URI m12187b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                String i = c1935a.mo1723i();
                return "null".equals(i) ? null : new URI(i);
            } catch (Throwable e) {
                throw new C5591l(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass15.m12187b(c1935a);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            URI uri = (URI) obj;
            c1937c.mo1739b(uri == null ? null : uri.toASCIIString());
        }
    };
    public static final C1949u f6346L = C1913n.m5247a(URI.class, f6345K);
    public static final C1948t<InetAddress> f6347M = new C1948t<InetAddress>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return InetAddress.getByName(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            InetAddress inetAddress = (InetAddress) obj;
            c1937c.mo1739b(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    public static final C1949u f6348N = C1913n.m5249b(InetAddress.class, f6347M);
    public static final C1948t<UUID> f6349O = new C1948t<UUID>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return UUID.fromString(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            UUID uuid = (UUID) obj;
            c1937c.mo1739b(uuid == null ? null : uuid.toString());
        }
    };
    public static final C1949u f6350P = C1913n.m5247a(UUID.class, f6349O);
    public static final C1948t<Currency> f6351Q = new C1948t<Currency>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return Currency.getInstance(c1935a.mo1723i());
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1739b(((Currency) obj).getCurrencyCode());
        }
    }.m5363a();
    public static final C1949u f6352R = C1913n.m5247a(Currency.class, f6351Q);
    public static final C1949u f6353S = new C1949u() {
        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            if (c1933a.f6422a != Timestamp.class) {
                return null;
            }
            final C1948t a = c1940f.m5349a(Date.class);
            return new C1948t<Timestamp>(this) {
                final /* synthetic */ AnonymousClass19 f15379b;

                public final /* synthetic */ Object mo1711a(C1935a c1935a) {
                    Date date = (Date) a.mo1711a(c1935a);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
                    a.mo1712a(c1937c, (Timestamp) obj);
                }
            };
        }
    };
    public static final C1948t<Calendar> f6354T = new C1948t<Calendar>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            c1935a.mo1716c();
            int i = 0;
            int i2 = i;
            int i3 = i2;
            int i4 = i3;
            int i5 = i4;
            int i6 = i5;
            while (c1935a.mo1720f() != C1936b.END_OBJECT) {
                String h = c1935a.mo1722h();
                int n = c1935a.mo1728n();
                if ("year".equals(h)) {
                    i = n;
                } else if ("month".equals(h)) {
                    i2 = n;
                } else if ("dayOfMonth".equals(h)) {
                    i3 = n;
                } else if ("hourOfDay".equals(h)) {
                    i4 = n;
                } else if ("minute".equals(h)) {
                    i5 = n;
                } else if ("second".equals(h)) {
                    i6 = n;
                }
            }
            c1935a.mo1718d();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Calendar calendar = (Calendar) obj;
            if (calendar == null) {
                c1937c.mo1743e();
                return;
            }
            c1937c.mo1740c();
            c1937c.mo1736a("year");
            c1937c.mo1733a((long) calendar.get(1));
            c1937c.mo1736a("month");
            c1937c.mo1733a((long) calendar.get(2));
            c1937c.mo1736a("dayOfMonth");
            c1937c.mo1733a((long) calendar.get(5));
            c1937c.mo1736a("hourOfDay");
            c1937c.mo1733a((long) calendar.get(11));
            c1937c.mo1736a("minute");
            c1937c.mo1733a((long) calendar.get(12));
            c1937c.mo1736a("second");
            c1937c.mo1733a((long) calendar.get(13));
            c1937c.mo1742d();
        }
    };
    public static final C1949u f6355U;
    public static final C1948t<Locale> f6356V = new C1948t<Locale>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            String str = null;
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c1935a.mo1723i(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Locale locale = (Locale) obj;
            c1937c.mo1739b(locale == null ? null : locale.toString());
        }
    };
    public static final C1949u f6357W = C1913n.m5247a(Locale.class, f6356V);
    public static final C1948t<C1944k> f6358X = new C1948t<C1944k>() {
        private void m12205a(C1937c c1937c, C1944k c1944k) {
            if (c1944k != null) {
                if (!(c1944k instanceof C5592m)) {
                    if (c1944k instanceof C5594p) {
                        C5594p g = c1944k.m5360g();
                        if (g.f15452a instanceof Number) {
                            c1937c.mo1735a(g.mo1751a());
                            return;
                        } else if (g.f15452a instanceof Boolean) {
                            c1937c.mo1737a(g.mo1756f());
                            return;
                        } else {
                            c1937c.mo1739b(g.mo1752b());
                            return;
                        }
                    }
                    boolean z = c1944k instanceof C5590i;
                    Iterator it;
                    StringBuilder stringBuilder;
                    if (z) {
                        c1937c.mo1732a();
                        if (z) {
                            it = ((C5590i) c1944k).iterator();
                            while (it.hasNext()) {
                                m12205a(c1937c, (C1944k) it.next());
                            }
                            c1937c.mo1738b();
                            return;
                        }
                        stringBuilder = new StringBuilder("Not a JSON Array: ");
                        stringBuilder.append(c1944k);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    z = c1944k instanceof C5593n;
                    if (z) {
                        c1937c.mo1740c();
                        if (z) {
                            for (Entry entry : ((C5593n) c1944k).f15450a.entrySet()) {
                                c1937c.mo1736a((String) entry.getKey());
                                m12205a(c1937c, (C1944k) entry.getValue());
                            }
                            c1937c.mo1742d();
                            return;
                        }
                        stringBuilder = new StringBuilder("Not a JSON Object: ");
                        stringBuilder.append(c1944k);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder("Couldn't write ");
                    stringBuilder.append(c1944k.getClass());
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            c1937c.mo1743e();
        }

        private C1944k m12206b(C1935a c1935a) {
            C1944k c5590i;
            switch (c1935a.mo1720f()) {
                case NUMBER:
                    return new C5594p(new C1921f(c1935a.mo1723i()));
                case BOOLEAN:
                    return new C5594p(Boolean.valueOf(c1935a.mo1724j()));
                case STRING:
                    return new C5594p(c1935a.mo1723i());
                case NULL:
                    c1935a.mo1725k();
                    return C5592m.f15449a;
                case BEGIN_ARRAY:
                    c5590i = new C5590i();
                    c1935a.mo1714a();
                    while (c1935a.mo1719e()) {
                        c5590i.m12298a(m12206b(c1935a));
                    }
                    c1935a.mo1715b();
                    return c5590i;
                case BEGIN_OBJECT:
                    c5590i = new C5593n();
                    c1935a.mo1716c();
                    while (c1935a.mo1719e()) {
                        c5590i.m12304a(c1935a.mo1722h(), m12206b(c1935a));
                    }
                    c1935a.mo1718d();
                    return c5590i;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return m12206b(c1935a);
        }
    };
    public static final C1949u f6359Y = C1913n.m5249b(C1944k.class, f6358X);
    public static final C1949u f6360Z = new C1949u() {
        public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
            Class cls = c1933a.f6422a;
            if (Enum.class.isAssignableFrom(cls)) {
                if (cls != Enum.class) {
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new C5564a(cls);
                }
            }
            return null;
        }
    };
    public static final C1948t<Class> f6361a = new C55541().m5363a();
    public static final C1949u f6362b = C1913n.m5247a(Class.class, f6361a);
    public static final C1948t<BitSet> f6363c = new C1948t<BitSet>() {
        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.BitSet m12180b(com.google.p164b.p170d.C1935a r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
            /*
            r0 = new java.util.BitSet;
            r0.<init>();
            r6.mo1714a();
            r1 = r6.mo1720f();
            r2 = 0;
            r3 = r2;
        L_0x000e:
            r4 = com.google.p164b.p170d.C1936b.END_ARRAY;
            if (r1 == r4) goto L_0x006a;
        L_0x0012:
            r4 = com.google.b.b.a.n.AnonymousClass29.f6334a;
            r5 = r1.ordinal();
            r4 = r4[r5];
            r5 = 1;
            switch(r4) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0053;
                case 3: goto L_0x0032;
                default: goto L_0x001e;
            };
        L_0x001e:
            r6 = new com.google.b.r;
            r0 = new java.lang.StringBuilder;
            r2 = "Invalid bitset value type: ";
            r0.<init>(r2);
            r0.append(r1);
            r0 = r0.toString();
            r6.<init>(r0);
            throw r6;
        L_0x0032:
            r1 = r6.mo1723i();
            r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x003f }
            if (r4 == 0) goto L_0x003d;
        L_0x003c:
            goto L_0x005e;
        L_0x003d:
            r5 = r2;
            goto L_0x005e;
        L_0x003f:
            r6 = new com.google.b.r;
            r0 = new java.lang.StringBuilder;
            r2 = "Error: Expecting: bitset number value (1, 0), Found: ";
            r0.<init>(r2);
            r0.append(r1);
            r0 = r0.toString();
            r6.<init>(r0);
            throw r6;
        L_0x0053:
            r5 = r6.mo1724j();
            goto L_0x005e;
        L_0x0058:
            r1 = r6.mo1728n();
            if (r1 == 0) goto L_0x003d;
        L_0x005e:
            if (r5 == 0) goto L_0x0063;
        L_0x0060:
            r0.set(r3);
        L_0x0063:
            r3 = r3 + 1;
            r1 = r6.mo1720f();
            goto L_0x000e;
        L_0x006a:
            r6.mo1715b();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.b.b.a.n.12.b(com.google.b.d.a):java.util.BitSet");
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass12.m12180b(c1935a);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            BitSet bitSet = (BitSet) obj;
            c1937c.mo1732a();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                c1937c.mo1733a((long) bitSet.get(i));
            }
            c1937c.mo1738b();
        }
    }.m5363a();
    public static final C1949u f6364d = C1913n.m5247a(BitSet.class, f6363c);
    public static final C1948t<Boolean> f6365e = new C1948t<Boolean>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return c1935a.mo1720f() == C1936b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c1935a.mo1723i())) : Boolean.valueOf(c1935a.mo1724j());
            } else {
                c1935a.mo1725k();
                return null;
            }
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1734a((Boolean) obj);
        }
    };
    public static final C1948t<Boolean> f6366f = new C1948t<Boolean>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Boolean.valueOf(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Boolean bool = (Boolean) obj;
            c1937c.mo1739b(bool == null ? "null" : bool.toString());
        }
    };
    public static final C1949u f6367g = C1913n.m5248a(Boolean.TYPE, Boolean.class, f6365e);
    public static final C1948t<Number> f6368h = new C1948t<Number>() {
        private static Number m12223b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return Byte.valueOf((byte) c1935a.mo1728n());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass31.m12223b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    };
    public static final C1949u f6369i = C1913n.m5248a(Byte.TYPE, Byte.class, f6368h);
    public static final C1948t<Number> f6370j = new C1948t<Number>() {
        private static Number m12226b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return Short.valueOf((short) c1935a.mo1728n());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass32.m12226b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    };
    public static final C1949u f6371k = C1913n.m5248a(Short.TYPE, Short.class, f6370j);
    public static final C1948t<Number> f6372l = new C1948t<Number>() {
        private static Number m12229b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return Integer.valueOf(c1935a.mo1728n());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass33.m12229b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    };
    public static final C1949u f6373m = C1913n.m5248a(Integer.TYPE, Integer.class, f6372l);
    public static final C1948t<AtomicInteger> f6374n = new C1948t<AtomicInteger>() {
        private static AtomicInteger m12232b(C1935a c1935a) {
            try {
                return new AtomicInteger(c1935a.mo1728n());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return AnonymousClass34.m12232b(c1935a);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1733a((long) ((AtomicInteger) obj).get());
        }
    }.m5363a();
    public static final C1949u f6375o = C1913n.m5247a(AtomicInteger.class, f6374n);
    public static final C1948t<AtomicBoolean> f6376p = new C1948t<AtomicBoolean>() {
        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return new AtomicBoolean(c1935a.mo1724j());
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1737a(((AtomicBoolean) obj).get());
        }
    }.m5363a();
    public static final C1949u f6377q = C1913n.m5247a(AtomicBoolean.class, f6376p);
    public static final C1948t<AtomicIntegerArray> f6378r = new C55562().m5363a();
    public static final C1949u f6379s = C1913n.m5247a(AtomicIntegerArray.class, f6378r);
    public static final C1948t<Number> f6380t = new C55573();
    public static final C1948t<Number> f6381u = new C55584();
    public static final C1948t<Number> f6382v = new C55595();
    public static final C1948t<Number> f6383w = new C55606();
    public static final C1949u f6384x = C1913n.m5247a(Number.class, f6383w);
    public static final C1948t<Character> f6385y = new C55617();
    public static final C1949u f6386z = C1913n.m5248a(Character.TYPE, Character.class, f6385y);

    static class C55541 extends C1948t<Class> {
        C55541() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Class cls = (Class) obj;
            StringBuilder stringBuilder = new StringBuilder("Attempted to serialize java.lang.Class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    static class C55562 extends C1948t<AtomicIntegerArray> {
        C55562() {
        }

        private static AtomicIntegerArray m12218b(C1935a c1935a) {
            List arrayList = new ArrayList();
            c1935a.mo1714a();
            while (c1935a.mo1719e()) {
                try {
                    arrayList.add(Integer.valueOf(c1935a.mo1728n()));
                } catch (Throwable e) {
                    throw new C5595r(e);
                }
            }
            c1935a.mo1715b();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return C55562.m12218b(c1935a);
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            c1937c.mo1732a();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                c1937c.mo1733a((long) atomicIntegerArray.get(i));
            }
            c1937c.mo1738b();
        }
    }

    static class C55573 extends C1948t<Number> {
        C55573() {
        }

        private static Number m12237b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return Long.valueOf(c1935a.mo1727m());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return C55573.m12237b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    }

    static class C55584 extends C1948t<Number> {
        C55584() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Float.valueOf((float) c1935a.mo1726l());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    }

    static class C55595 extends C1948t<Number> {
        C55595() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return Double.valueOf(c1935a.mo1726l());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    }

    static class C55606 extends C1948t<Number> {
        C55606() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            C1936b f = c1935a.mo1720f();
            int i = AnonymousClass29.f6334a[f.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        c1935a.mo1725k();
                        return null;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Expecting number, got: ");
                        stringBuilder.append(f);
                        throw new C5595r(stringBuilder.toString());
                }
            }
            return new C1921f(c1935a.mo1723i());
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((Number) obj);
        }
    }

    static class C55617 extends C1948t<Character> {
        C55617() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            String i = c1935a.mo1723i();
            if (i.length() == 1) {
                return Character.valueOf(i.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder("Expecting character, got: ");
            stringBuilder.append(i);
            throw new C5595r(stringBuilder.toString());
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Character ch = (Character) obj;
            c1937c.mo1739b(ch == null ? null : String.valueOf(ch));
        }
    }

    static class C55628 extends C1948t<String> {
        C55628() {
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            C1936b f = c1935a.mo1720f();
            if (f != C1936b.NULL) {
                return f == C1936b.BOOLEAN ? Boolean.toString(c1935a.mo1724j()) : c1935a.mo1723i();
            } else {
                c1935a.mo1725k();
                return null;
            }
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1739b((String) obj);
        }
    }

    static class C55639 extends C1948t<BigDecimal> {
        C55639() {
        }

        private static BigDecimal m12250b(C1935a c1935a) {
            if (c1935a.mo1720f() == C1936b.NULL) {
                c1935a.mo1725k();
                return null;
            }
            try {
                return new BigDecimal(c1935a.mo1723i());
            } catch (Throwable e) {
                throw new C5595r(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            return C55639.m12250b(c1935a);
        }

        public final /* bridge */ /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            c1937c.mo1735a((BigDecimal) obj);
        }
    }

    private static final class C5564a<T extends Enum<T>> extends C1948t<T> {
        private final Map<String, T> f15392a = new HashMap();
        private final Map<T, String> f15393b = new HashMap();

        public C5564a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    Object name = enumR.name();
                    C1904c c1904c = (C1904c) cls.getField(name).getAnnotation(C1904c.class);
                    if (c1904c != null) {
                        name = c1904c.m5236a();
                        for (Object put : c1904c.m5237b()) {
                            this.f15392a.put(put, enumR);
                        }
                    }
                    this.f15392a.put(name, enumR);
                    this.f15393b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public final /* synthetic */ Object mo1711a(C1935a c1935a) {
            if (c1935a.mo1720f() != C1936b.NULL) {
                return (Enum) this.f15392a.get(c1935a.mo1723i());
            }
            c1935a.mo1725k();
            return null;
        }

        public final /* synthetic */ void mo1712a(C1937c c1937c, Object obj) {
            Enum enumR = (Enum) obj;
            c1937c.mo1739b(enumR == null ? null : (String) this.f15393b.get(enumR));
        }
    }

    static {
        final Class cls = Calendar.class;
        final Class cls2 = GregorianCalendar.class;
        final C1948t c1948t = f6354T;
        f6355U = new C1949u() {
            public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
                Class cls = c1933a.f6422a;
                if (cls != cls) {
                    if (cls != cls2) {
                        return null;
                    }
                }
                return c1948t;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls2.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c1948t);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> C1949u m5247a(final Class<TT> cls, final C1948t<TT> c1948t) {
        return new C1949u() {
            public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
                return c1933a.f6422a == cls ? c1948t : null;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Factory[type=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c1948t);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    public static <TT> C1949u m5248a(final Class<TT> cls, final Class<TT> cls2, final C1948t<? super TT> c1948t) {
        return new C1949u() {
            public final <T> C1948t<T> mo1713a(C1940f c1940f, C1933a<T> c1933a) {
                Class cls = c1933a.f6422a;
                if (cls != cls) {
                    if (cls != cls2) {
                        return null;
                    }
                }
                return c1948t;
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Factory[type=");
                stringBuilder.append(cls2.getName());
                stringBuilder.append("+");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c1948t);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }

    private static <T1> C1949u m5249b(final Class<T1> cls, final C1948t<T1> c1948t) {
        return new C1949u() {
            public final <T2> C1948t<T2> mo1713a(C1940f c1940f, C1933a<T2> c1933a) {
                final Class cls = c1933a.f6422a;
                return !cls.isAssignableFrom(cls) ? null : new C1948t<T1>(this) {
                    final /* synthetic */ AnonymousClass28 f15389b;

                    public final T1 mo1711a(C1935a c1935a) {
                        T1 a = c1948t.mo1711a(c1935a);
                        if (a == null || cls.isInstance(a)) {
                            return a;
                        }
                        StringBuilder stringBuilder = new StringBuilder("Expected a ");
                        stringBuilder.append(cls.getName());
                        stringBuilder.append(" but was ");
                        stringBuilder.append(a.getClass().getName());
                        throw new C5595r(stringBuilder.toString());
                    }

                    public final void mo1712a(C1937c c1937c, T1 t1) {
                        c1948t.mo1712a(c1937c, t1);
                    }
                };
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Factory[typeHierarchy=");
                stringBuilder.append(cls.getName());
                stringBuilder.append(",adapter=");
                stringBuilder.append(c1948t);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        };
    }
}
