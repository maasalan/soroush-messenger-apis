package p056c.p057a.p058a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p056c.C0923d;
import p056c.C0946s;
import p056c.C0946s.C0945a;
import p056c.C0949t;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.C0956y;
import p056c.aa;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.p057a.C0866a;
import p056c.p057a.C0885c;
import p056c.p057a.p058a.C0861c.C0860a;
import p056c.p057a.p060c.C0880e;
import p056c.p057a.p060c.C5002h;
import p206d.C2273l;
import p206d.C2277r;
import p206d.C2278s;
import p206d.C2279t;
import p206d.C5682d;
import p206d.C5683e;
import p206d.C6623c;

public final class C4996a implements C0951u {
    final C0865e f13909a;

    public C4996a(C0865e c0865e) {
        this.f13909a = c0865e;
    }

    private static ac m10081a(ac acVar) {
        if (acVar == null || acVar.f2825g == null) {
            return acVar;
        }
        C0916a b = acVar.m2262b();
        b.f2813g = null;
        return b.m2258a();
    }

    private static C0946s m10082a(C0946s c0946s, C0946s c0946s2) {
        C0945a c0945a = new C0945a();
        int i = 0;
        int length = c0946s.f2991a.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            String a = c0946s.m2345a(i2);
            String b = c0946s.m2347b(i2);
            if (!("Warning".equalsIgnoreCase(a) && b.startsWith("1")) && (C4996a.m10084b(a) || !C4996a.m10083a(a) || c0946s2.m2346a(a) == null)) {
                C0866a.f2589a.mo1013a(c0945a, a, b);
            }
        }
        int length2 = c0946s2.f2991a.length / 2;
        while (i < length2) {
            String a2 = c0946s2.m2345a(i);
            if (!C4996a.m10084b(a2) && C4996a.m10083a(a2)) {
                C0866a.f2589a.mo1013a(c0945a, a2, c0946s2.m2347b(i));
            }
            i++;
        }
        return c0945a.m2341a();
    }

    private static boolean m10083a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    private static boolean m10084b(String str) {
        if (!("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str))) {
            if (!"Content-Type".equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    public final ac mo947a(C0950a c0950a) {
        C0861c c0861c;
        Object obj;
        aa aaVar;
        ac acVar;
        C0916a c0916a;
        ac acVar2;
        String str;
        ac a = this.f13909a != null ? r1.f13909a.m2028a() : null;
        C0860a c0860a = new C0860a(System.currentTimeMillis(), c0950a.mo951a(), a);
        if (c0860a.f2554c == null) {
            c0861c = new C0861c(c0860a.f2553b, null);
        } else if (c0860a.f2553b.f2801a.m2371c() && c0860a.f2554c.f2823e == null) {
            c0861c = new C0861c(c0860a.f2553b, null);
        } else if (C0861c.m2020a(c0860a.f2554c, c0860a.f2553b)) {
            C0923d b = c0860a.f2553b.m2247b();
            if (!b.f2866c) {
                C0923d c;
                long max;
                C0923d c0923d;
                C0923d c2;
                long toMillis;
                long time;
                long j;
                long toMillis2;
                long j2;
                long j3;
                C0916a b2;
                Object obj2;
                String str2;
                C0945a a2;
                C0949t c0949t;
                StringBuilder stringBuilder;
                aa aaVar2 = c0860a.f2553b;
                if (aaVar2.m2246a("If-Modified-Since") == null) {
                    if (aaVar2.m2246a("If-None-Match") == null) {
                        obj = null;
                        if (obj != null) {
                            c = c0860a.f2554c.m2263c();
                            if (c.f2875l) {
                                max = c0860a.f2555d == null ? Math.max(0, c0860a.f2561j - c0860a.f2555d.getTime()) : 0;
                                if (c0860a.f2563l != -1) {
                                    max = Math.max(max, TimeUnit.SECONDS.toMillis((long) c0860a.f2563l));
                                }
                                c0923d = b;
                                max = (max + (c0860a.f2561j - c0860a.f2560i)) + (c0860a.f2552a - c0860a.f2561j);
                                c2 = c0860a.f2554c.m2263c();
                                if (c2.f2868e == -1) {
                                    toMillis = TimeUnit.SECONDS.toMillis((long) c2.f2868e);
                                } else {
                                    if (c0860a.f2559h != null) {
                                        time = c0860a.f2559h.getTime() - (c0860a.f2555d == null ? c0860a.f2555d.getTime() : c0860a.f2561j);
                                        if (time > 0) {
                                            c2 = c0923d;
                                            j = time;
                                            if (c2.f2868e != -1) {
                                                j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                                            }
                                            toMillis2 = c2.f2873j == -1 ? TimeUnit.SECONDS.toMillis((long) c2.f2873j) : 0;
                                            if (!c.f2871h || c2.f2872i == -1) {
                                                j2 = j;
                                                toMillis = 0;
                                            } else {
                                                j2 = j;
                                                toMillis = TimeUnit.SECONDS.toMillis((long) c2.f2872i);
                                            }
                                            if (!c.f2866c) {
                                                j3 = max + toMillis2;
                                                if (j3 < j2 + toMillis) {
                                                    b2 = c0860a.f2554c.m2262b();
                                                    if (j3 >= j2) {
                                                        b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                    }
                                                    if (max > 86400000) {
                                                        obj2 = (c0860a.f2554c.m2263c().f2868e == -1 || c0860a.f2559h != null) ? null : 1;
                                                        if (obj2 != null) {
                                                            b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                        }
                                                    }
                                                    obj = null;
                                                    c0861c = new C0861c(null, b2.m2258a());
                                                    if (c0861c.f2564a != null && c0860a.f2553b.m2247b().f2874k) {
                                                        c0861c = new C0861c(obj, obj);
                                                    }
                                                    aaVar = c0861c.f2564a;
                                                    acVar = c0861c.f2565b;
                                                    if (a != null && acVar == null) {
                                                        C0885c.m2098a(a.f2825g);
                                                    }
                                                    if (aaVar != null && acVar == null) {
                                                        c0916a = new C0916a();
                                                        c0916a.f2807a = c0950a.mo951a();
                                                        c0916a.f2808b = C0956y.HTTP_1_1;
                                                        c0916a.f2809c = 504;
                                                        c0916a.f2810d = "Unsatisfiable Request (only-if-cached)";
                                                        c0916a.f2813g = C0885c.f2635c;
                                                        c0916a.f2817k = -1;
                                                        c0916a.f2818l = System.currentTimeMillis();
                                                        return c0916a.m2258a();
                                                    } else if (aaVar != null) {
                                                        return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                                    } else {
                                                        acVar2 = c0950a;
                                                        try {
                                                            acVar2 = acVar2.mo952a(aaVar);
                                                            if (acVar2 == null) {
                                                            }
                                                            if (acVar != null) {
                                                                if (acVar2.f2821c != 304) {
                                                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                                    c0916a.f2817k = acVar2.f2829k;
                                                                    c0916a.f2818l = acVar2.f2830l;
                                                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                                    acVar2.f2825g.close();
                                                                    return a;
                                                                }
                                                                C0885c.m2098a(acVar.f2825g);
                                                            }
                                                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                            if (r1.f13909a != null) {
                                                                if (C0880e.m2079b(a) || !C0861c.m2020a(a, aaVar)) {
                                                                    str = aaVar.f2802b;
                                                                    if (!(str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE"))) {
                                                                        str.equals("MOVE");
                                                                    }
                                                                } else {
                                                                    final C0859b b3 = r1.f13909a.m2029b();
                                                                    if (b3 == null) {
                                                                        return a;
                                                                    }
                                                                    C2277r a3 = b3.m2019a();
                                                                    if (a3 == null) {
                                                                        return a;
                                                                    }
                                                                    final C5683e d = a.f2825g.mo959d();
                                                                    final C5682d a4 = C2273l.m6208a(a3);
                                                                    C2278s c49951 = new C2278s(r1) {
                                                                        boolean f13904a;
                                                                        final /* synthetic */ C4996a f13908e;

                                                                        public final long mo944a(C6623c c6623c, long j) {
                                                                            try {
                                                                                j = d.mo944a(c6623c, j);
                                                                                if (j == -1) {
                                                                                    if (!this.f13904a) {
                                                                                        this.f13904a = true;
                                                                                        a4.close();
                                                                                    }
                                                                                    return -1;
                                                                                }
                                                                                c6623c.m17024a(a4.mo3124b(), c6623c.f18884b - j, j);
                                                                                a4.mo3151s();
                                                                                return j;
                                                                            } catch (IOException e) {
                                                                                if (!this.f13904a) {
                                                                                    this.f13904a = true;
                                                                                }
                                                                                throw e;
                                                                            }
                                                                        }

                                                                        public final C2279t mo945a() {
                                                                            return d.mo945a();
                                                                        }

                                                                        public final void close() {
                                                                            if (!(this.f13904a || C0885c.m2101a((C2278s) this, TimeUnit.MILLISECONDS))) {
                                                                                this.f13904a = true;
                                                                            }
                                                                            d.close();
                                                                        }
                                                                    };
                                                                    str = a.m2260a("Content-Type");
                                                                    long b4 = a.f2825g.mo958b();
                                                                    c0916a = a.m2262b();
                                                                    c0916a.f2813g = new C5002h(str, b4, C2273l.m6209a(c49951));
                                                                    return c0916a.m2258a();
                                                                }
                                                            }
                                                            return a;
                                                        } finally {
                                                            if (a != null) {
                                                                C0885c.m2098a(a.f2825g);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (c0860a.f2562k != null) {
                                                str = "If-None-Match";
                                                str2 = c0860a.f2562k;
                                            } else if (c0860a.f2557f != null) {
                                                str = "If-Modified-Since";
                                                str2 = c0860a.f2558g;
                                            } else if (c0860a.f2555d == null) {
                                                str = "If-Modified-Since";
                                                str2 = c0860a.f2556e;
                                            } else {
                                                obj = null;
                                                c0861c = new C0861c(c0860a.f2553b, null);
                                                c0861c = new C0861c(obj, obj);
                                                aaVar = c0861c.f2564a;
                                                acVar = c0861c.f2565b;
                                                C0885c.m2098a(a.f2825g);
                                                if (aaVar != null) {
                                                }
                                                if (aaVar != null) {
                                                    return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                                }
                                                acVar2 = c0950a;
                                                acVar2 = acVar2.mo952a(aaVar);
                                                if (acVar2 == null) {
                                                }
                                                if (acVar != null) {
                                                    if (acVar2.f2821c != 304) {
                                                        C0885c.m2098a(acVar.f2825g);
                                                    } else {
                                                        c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                        c0916a.f2817k = acVar2.f2829k;
                                                        c0916a.f2818l = acVar2.f2830l;
                                                        a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                        acVar2.f2825g.close();
                                                        return a;
                                                    }
                                                }
                                                a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                if (r1.f13909a != null) {
                                                    if (C0880e.m2079b(a)) {
                                                    }
                                                    str = aaVar.f2802b;
                                                    str.equals("MOVE");
                                                }
                                                return a;
                                            }
                                            a2 = c0860a.f2553b.f2803c.m2344a();
                                            C0866a.f2589a.mo1013a(a2, str, str2);
                                            c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                                            obj = null;
                                            c0861c = new C0861c(obj, obj);
                                            aaVar = c0861c.f2564a;
                                            acVar = c0861c.f2565b;
                                            C0885c.m2098a(a.f2825g);
                                            if (aaVar != null) {
                                            }
                                            if (aaVar != null) {
                                                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                            }
                                            acVar2 = c0950a;
                                            acVar2 = acVar2.mo952a(aaVar);
                                            if (acVar2 == null) {
                                            }
                                            if (acVar != null) {
                                                if (acVar2.f2821c != 304) {
                                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                    c0916a.f2817k = acVar2.f2829k;
                                                    c0916a.f2818l = acVar2.f2830l;
                                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                    acVar2.f2825g.close();
                                                    return a;
                                                }
                                                C0885c.m2098a(acVar.f2825g);
                                            }
                                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            if (r1.f13909a != null) {
                                                if (C0880e.m2079b(a)) {
                                                }
                                                str = aaVar.f2802b;
                                                str.equals("MOVE");
                                            }
                                            return a;
                                        }
                                    } else if (c0860a.f2557f != null) {
                                        c0949t = c0860a.f2554c.f2819a.f2801a;
                                        if (c0949t.f3011e != null) {
                                            str = null;
                                        } else {
                                            stringBuilder = new StringBuilder();
                                            C0949t.m2366b(stringBuilder, c0949t.f3011e);
                                            str = stringBuilder.toString();
                                        }
                                        if (str == null) {
                                            time = (c0860a.f2555d == null ? c0860a.f2555d.getTime() : c0860a.f2560i) - c0860a.f2557f.getTime();
                                            if (time > 0) {
                                                toMillis = time / 10;
                                            }
                                        }
                                    }
                                    j = 0;
                                    c2 = c0923d;
                                    if (c2.f2868e != -1) {
                                        j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                                    }
                                    if (c2.f2873j == -1) {
                                    }
                                    if (c.f2871h) {
                                    }
                                    j2 = j;
                                    toMillis = 0;
                                    if (c.f2866c) {
                                        j3 = max + toMillis2;
                                        if (j3 < j2 + toMillis) {
                                            b2 = c0860a.f2554c.m2262b();
                                            if (j3 >= j2) {
                                                b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (max > 86400000) {
                                                if (c0860a.f2554c.m2263c().f2868e == -1) {
                                                }
                                                if (obj2 != null) {
                                                    b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                }
                                            }
                                            obj = null;
                                            c0861c = new C0861c(null, b2.m2258a());
                                            c0861c = new C0861c(obj, obj);
                                            aaVar = c0861c.f2564a;
                                            acVar = c0861c.f2565b;
                                            C0885c.m2098a(a.f2825g);
                                            if (aaVar != null) {
                                            }
                                            if (aaVar != null) {
                                                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                            }
                                            acVar2 = c0950a;
                                            acVar2 = acVar2.mo952a(aaVar);
                                            if (acVar2 == null) {
                                            }
                                            if (acVar != null) {
                                                if (acVar2.f2821c != 304) {
                                                    C0885c.m2098a(acVar.f2825g);
                                                } else {
                                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                    c0916a.f2817k = acVar2.f2829k;
                                                    c0916a.f2818l = acVar2.f2830l;
                                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                    acVar2.f2825g.close();
                                                    return a;
                                                }
                                            }
                                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            if (r1.f13909a != null) {
                                                if (C0880e.m2079b(a)) {
                                                }
                                                str = aaVar.f2802b;
                                                str.equals("MOVE");
                                            }
                                            return a;
                                        }
                                    }
                                    if (c0860a.f2562k != null) {
                                        str = "If-None-Match";
                                        str2 = c0860a.f2562k;
                                    } else if (c0860a.f2557f != null) {
                                        str = "If-Modified-Since";
                                        str2 = c0860a.f2558g;
                                    } else if (c0860a.f2555d == null) {
                                        obj = null;
                                        c0861c = new C0861c(c0860a.f2553b, null);
                                        c0861c = new C0861c(obj, obj);
                                        aaVar = c0861c.f2564a;
                                        acVar = c0861c.f2565b;
                                        C0885c.m2098a(a.f2825g);
                                        if (aaVar != null) {
                                        }
                                        if (aaVar != null) {
                                            return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                        }
                                        acVar2 = c0950a;
                                        acVar2 = acVar2.mo952a(aaVar);
                                        if (acVar2 == null) {
                                        }
                                        if (acVar != null) {
                                            if (acVar2.f2821c != 304) {
                                                c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                c0916a.f2817k = acVar2.f2829k;
                                                c0916a.f2818l = acVar2.f2830l;
                                                a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                acVar2.f2825g.close();
                                                return a;
                                            }
                                            C0885c.m2098a(acVar.f2825g);
                                        }
                                        a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        if (r1.f13909a != null) {
                                            if (C0880e.m2079b(a)) {
                                            }
                                            str = aaVar.f2802b;
                                            str.equals("MOVE");
                                        }
                                        return a;
                                    } else {
                                        str = "If-Modified-Since";
                                        str2 = c0860a.f2556e;
                                    }
                                    a2 = c0860a.f2553b.f2803c.m2344a();
                                    C0866a.f2589a.mo1013a(a2, str, str2);
                                    c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                                    obj = null;
                                    c0861c = new C0861c(obj, obj);
                                    aaVar = c0861c.f2564a;
                                    acVar = c0861c.f2565b;
                                    C0885c.m2098a(a.f2825g);
                                    if (aaVar != null) {
                                    }
                                    if (aaVar != null) {
                                        return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                    }
                                    acVar2 = c0950a;
                                    acVar2 = acVar2.mo952a(aaVar);
                                    if (acVar2 == null) {
                                    }
                                    if (acVar != null) {
                                        if (acVar2.f2821c != 304) {
                                            C0885c.m2098a(acVar.f2825g);
                                        } else {
                                            c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                            c0916a.f2817k = acVar2.f2829k;
                                            c0916a.f2818l = acVar2.f2830l;
                                            a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            acVar2.f2825g.close();
                                            return a;
                                        }
                                    }
                                    a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    if (r1.f13909a != null) {
                                        if (C0880e.m2079b(a)) {
                                        }
                                        str = aaVar.f2802b;
                                        str.equals("MOVE");
                                    }
                                    return a;
                                }
                                j = toMillis;
                                c2 = c0923d;
                                if (c2.f2868e != -1) {
                                    j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                                }
                                if (c2.f2873j == -1) {
                                }
                                if (c.f2871h) {
                                }
                                j2 = j;
                                toMillis = 0;
                                if (c.f2866c) {
                                    j3 = max + toMillis2;
                                    if (j3 < j2 + toMillis) {
                                        b2 = c0860a.f2554c.m2262b();
                                        if (j3 >= j2) {
                                            b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (max > 86400000) {
                                            if (c0860a.f2554c.m2263c().f2868e == -1) {
                                            }
                                            if (obj2 != null) {
                                                b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                        }
                                        obj = null;
                                        c0861c = new C0861c(null, b2.m2258a());
                                        c0861c = new C0861c(obj, obj);
                                        aaVar = c0861c.f2564a;
                                        acVar = c0861c.f2565b;
                                        C0885c.m2098a(a.f2825g);
                                        if (aaVar != null) {
                                        }
                                        if (aaVar != null) {
                                            return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                        }
                                        acVar2 = c0950a;
                                        acVar2 = acVar2.mo952a(aaVar);
                                        if (acVar2 == null) {
                                        }
                                        if (acVar != null) {
                                            if (acVar2.f2821c != 304) {
                                                c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                c0916a.f2817k = acVar2.f2829k;
                                                c0916a.f2818l = acVar2.f2830l;
                                                a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                acVar2.f2825g.close();
                                                return a;
                                            }
                                            C0885c.m2098a(acVar.f2825g);
                                        }
                                        a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        if (r1.f13909a != null) {
                                            if (C0880e.m2079b(a)) {
                                            }
                                            str = aaVar.f2802b;
                                            str.equals("MOVE");
                                        }
                                        return a;
                                    }
                                }
                                if (c0860a.f2562k != null) {
                                    str = "If-None-Match";
                                    str2 = c0860a.f2562k;
                                } else if (c0860a.f2557f != null) {
                                    str = "If-Modified-Since";
                                    str2 = c0860a.f2558g;
                                } else if (c0860a.f2555d == null) {
                                    str = "If-Modified-Since";
                                    str2 = c0860a.f2556e;
                                } else {
                                    obj = null;
                                    c0861c = new C0861c(c0860a.f2553b, null);
                                    c0861c = new C0861c(obj, obj);
                                    aaVar = c0861c.f2564a;
                                    acVar = c0861c.f2565b;
                                    C0885c.m2098a(a.f2825g);
                                    if (aaVar != null) {
                                    }
                                    if (aaVar != null) {
                                        return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                    }
                                    acVar2 = c0950a;
                                    acVar2 = acVar2.mo952a(aaVar);
                                    if (acVar2 == null) {
                                    }
                                    if (acVar != null) {
                                        if (acVar2.f2821c != 304) {
                                            C0885c.m2098a(acVar.f2825g);
                                        } else {
                                            c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                            c0916a.f2817k = acVar2.f2829k;
                                            c0916a.f2818l = acVar2.f2830l;
                                            a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            acVar2.f2825g.close();
                                            return a;
                                        }
                                    }
                                    a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    if (r1.f13909a != null) {
                                        if (C0880e.m2079b(a)) {
                                        }
                                        str = aaVar.f2802b;
                                        str.equals("MOVE");
                                    }
                                    return a;
                                }
                                a2 = c0860a.f2553b.f2803c.m2344a();
                                C0866a.f2589a.mo1013a(a2, str, str2);
                                c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                                obj = null;
                                c0861c = new C0861c(obj, obj);
                                aaVar = c0861c.f2564a;
                                acVar = c0861c.f2565b;
                                C0885c.m2098a(a.f2825g);
                                if (aaVar != null) {
                                }
                                if (aaVar != null) {
                                    return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                }
                                acVar2 = c0950a;
                                acVar2 = acVar2.mo952a(aaVar);
                                if (acVar2 == null) {
                                }
                                if (acVar != null) {
                                    if (acVar2.f2821c != 304) {
                                        c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                        c0916a.f2817k = acVar2.f2829k;
                                        c0916a.f2818l = acVar2.f2830l;
                                        a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        acVar2.f2825g.close();
                                        return a;
                                    }
                                    C0885c.m2098a(acVar.f2825g);
                                }
                                a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                if (r1.f13909a != null) {
                                    if (C0880e.m2079b(a)) {
                                    }
                                    str = aaVar.f2802b;
                                    str.equals("MOVE");
                                }
                                return a;
                            }
                            c0861c = new C0861c(null, c0860a.f2554c);
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    c = c0860a.f2554c.m2263c();
                    if (c.f2875l) {
                        if (c0860a.f2555d == null) {
                        }
                        if (c0860a.f2563l != -1) {
                            max = Math.max(max, TimeUnit.SECONDS.toMillis((long) c0860a.f2563l));
                        }
                        c0923d = b;
                        max = (max + (c0860a.f2561j - c0860a.f2560i)) + (c0860a.f2552a - c0860a.f2561j);
                        c2 = c0860a.f2554c.m2263c();
                        if (c2.f2868e == -1) {
                            if (c0860a.f2559h != null) {
                                if (c0860a.f2555d == null) {
                                }
                                time = c0860a.f2559h.getTime() - (c0860a.f2555d == null ? c0860a.f2555d.getTime() : c0860a.f2561j);
                                if (time > 0) {
                                    c2 = c0923d;
                                    j = time;
                                    if (c2.f2868e != -1) {
                                        j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                                    }
                                    if (c2.f2873j == -1) {
                                    }
                                    if (c.f2871h) {
                                    }
                                    j2 = j;
                                    toMillis = 0;
                                    if (c.f2866c) {
                                        j3 = max + toMillis2;
                                        if (j3 < j2 + toMillis) {
                                            b2 = c0860a.f2554c.m2262b();
                                            if (j3 >= j2) {
                                                b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (max > 86400000) {
                                                if (c0860a.f2554c.m2263c().f2868e == -1) {
                                                }
                                                if (obj2 != null) {
                                                    b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                }
                                            }
                                            obj = null;
                                            c0861c = new C0861c(null, b2.m2258a());
                                            c0861c = new C0861c(obj, obj);
                                            aaVar = c0861c.f2564a;
                                            acVar = c0861c.f2565b;
                                            C0885c.m2098a(a.f2825g);
                                            if (aaVar != null) {
                                            }
                                            if (aaVar != null) {
                                                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                            }
                                            acVar2 = c0950a;
                                            acVar2 = acVar2.mo952a(aaVar);
                                            if (acVar2 == null) {
                                            }
                                            if (acVar != null) {
                                                if (acVar2.f2821c != 304) {
                                                    C0885c.m2098a(acVar.f2825g);
                                                } else {
                                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                    c0916a.f2817k = acVar2.f2829k;
                                                    c0916a.f2818l = acVar2.f2830l;
                                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                    acVar2.f2825g.close();
                                                    return a;
                                                }
                                            }
                                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            if (r1.f13909a != null) {
                                                if (C0880e.m2079b(a)) {
                                                }
                                                str = aaVar.f2802b;
                                                str.equals("MOVE");
                                            }
                                            return a;
                                        }
                                    }
                                    if (c0860a.f2562k != null) {
                                        str = "If-None-Match";
                                        str2 = c0860a.f2562k;
                                    } else if (c0860a.f2557f != null) {
                                        str = "If-Modified-Since";
                                        str2 = c0860a.f2558g;
                                    } else if (c0860a.f2555d == null) {
                                        obj = null;
                                        c0861c = new C0861c(c0860a.f2553b, null);
                                        c0861c = new C0861c(obj, obj);
                                        aaVar = c0861c.f2564a;
                                        acVar = c0861c.f2565b;
                                        C0885c.m2098a(a.f2825g);
                                        if (aaVar != null) {
                                        }
                                        if (aaVar != null) {
                                            return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                        }
                                        acVar2 = c0950a;
                                        acVar2 = acVar2.mo952a(aaVar);
                                        if (acVar2 == null) {
                                        }
                                        if (acVar != null) {
                                            if (acVar2.f2821c != 304) {
                                                c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                                c0916a.f2817k = acVar2.f2829k;
                                                c0916a.f2818l = acVar2.f2830l;
                                                a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                                acVar2.f2825g.close();
                                                return a;
                                            }
                                            C0885c.m2098a(acVar.f2825g);
                                        }
                                        a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        if (r1.f13909a != null) {
                                            if (C0880e.m2079b(a)) {
                                            }
                                            str = aaVar.f2802b;
                                            str.equals("MOVE");
                                        }
                                        return a;
                                    } else {
                                        str = "If-Modified-Since";
                                        str2 = c0860a.f2556e;
                                    }
                                    a2 = c0860a.f2553b.f2803c.m2344a();
                                    C0866a.f2589a.mo1013a(a2, str, str2);
                                    c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                                    obj = null;
                                    c0861c = new C0861c(obj, obj);
                                    aaVar = c0861c.f2564a;
                                    acVar = c0861c.f2565b;
                                    C0885c.m2098a(a.f2825g);
                                    if (aaVar != null) {
                                    }
                                    if (aaVar != null) {
                                        return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                    }
                                    acVar2 = c0950a;
                                    acVar2 = acVar2.mo952a(aaVar);
                                    if (acVar2 == null) {
                                    }
                                    if (acVar != null) {
                                        if (acVar2.f2821c != 304) {
                                            C0885c.m2098a(acVar.f2825g);
                                        } else {
                                            c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                            c0916a.f2817k = acVar2.f2829k;
                                            c0916a.f2818l = acVar2.f2830l;
                                            a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            acVar2.f2825g.close();
                                            return a;
                                        }
                                    }
                                    a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    if (r1.f13909a != null) {
                                        if (C0880e.m2079b(a)) {
                                        }
                                        str = aaVar.f2802b;
                                        str.equals("MOVE");
                                    }
                                    return a;
                                }
                            } else if (c0860a.f2557f != null) {
                                c0949t = c0860a.f2554c.f2819a.f2801a;
                                if (c0949t.f3011e != null) {
                                    stringBuilder = new StringBuilder();
                                    C0949t.m2366b(stringBuilder, c0949t.f3011e);
                                    str = stringBuilder.toString();
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    if (c0860a.f2555d == null) {
                                    }
                                    time = (c0860a.f2555d == null ? c0860a.f2555d.getTime() : c0860a.f2560i) - c0860a.f2557f.getTime();
                                    if (time > 0) {
                                        toMillis = time / 10;
                                    }
                                }
                            }
                            j = 0;
                            c2 = c0923d;
                            if (c2.f2868e != -1) {
                                j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                            }
                            if (c2.f2873j == -1) {
                            }
                            if (c.f2871h) {
                            }
                            j2 = j;
                            toMillis = 0;
                            if (c.f2866c) {
                                j3 = max + toMillis2;
                                if (j3 < j2 + toMillis) {
                                    b2 = c0860a.f2554c.m2262b();
                                    if (j3 >= j2) {
                                        b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (max > 86400000) {
                                        if (c0860a.f2554c.m2263c().f2868e == -1) {
                                        }
                                        if (obj2 != null) {
                                            b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    obj = null;
                                    c0861c = new C0861c(null, b2.m2258a());
                                    c0861c = new C0861c(obj, obj);
                                    aaVar = c0861c.f2564a;
                                    acVar = c0861c.f2565b;
                                    C0885c.m2098a(a.f2825g);
                                    if (aaVar != null) {
                                    }
                                    if (aaVar != null) {
                                        return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                    }
                                    acVar2 = c0950a;
                                    acVar2 = acVar2.mo952a(aaVar);
                                    if (acVar2 == null) {
                                    }
                                    if (acVar != null) {
                                        if (acVar2.f2821c != 304) {
                                            c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                            c0916a.f2817k = acVar2.f2829k;
                                            c0916a.f2818l = acVar2.f2830l;
                                            a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                            acVar2.f2825g.close();
                                            return a;
                                        }
                                        C0885c.m2098a(acVar.f2825g);
                                    }
                                    a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    if (r1.f13909a != null) {
                                        if (C0880e.m2079b(a)) {
                                        }
                                        str = aaVar.f2802b;
                                        str.equals("MOVE");
                                    }
                                    return a;
                                }
                            }
                            if (c0860a.f2562k != null) {
                                str = "If-None-Match";
                                str2 = c0860a.f2562k;
                            } else if (c0860a.f2557f != null) {
                                str = "If-Modified-Since";
                                str2 = c0860a.f2558g;
                            } else if (c0860a.f2555d == null) {
                                str = "If-Modified-Since";
                                str2 = c0860a.f2556e;
                            } else {
                                obj = null;
                                c0861c = new C0861c(c0860a.f2553b, null);
                                c0861c = new C0861c(obj, obj);
                                aaVar = c0861c.f2564a;
                                acVar = c0861c.f2565b;
                                C0885c.m2098a(a.f2825g);
                                if (aaVar != null) {
                                }
                                if (aaVar != null) {
                                    return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                }
                                acVar2 = c0950a;
                                acVar2 = acVar2.mo952a(aaVar);
                                if (acVar2 == null) {
                                }
                                if (acVar != null) {
                                    if (acVar2.f2821c != 304) {
                                        C0885c.m2098a(acVar.f2825g);
                                    } else {
                                        c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                        c0916a.f2817k = acVar2.f2829k;
                                        c0916a.f2818l = acVar2.f2830l;
                                        a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        acVar2.f2825g.close();
                                        return a;
                                    }
                                }
                                a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                if (r1.f13909a != null) {
                                    if (C0880e.m2079b(a)) {
                                    }
                                    str = aaVar.f2802b;
                                    str.equals("MOVE");
                                }
                                return a;
                            }
                            a2 = c0860a.f2553b.f2803c.m2344a();
                            C0866a.f2589a.mo1013a(a2, str, str2);
                            c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                            obj = null;
                            c0861c = new C0861c(obj, obj);
                            aaVar = c0861c.f2564a;
                            acVar = c0861c.f2565b;
                            C0885c.m2098a(a.f2825g);
                            if (aaVar != null) {
                            }
                            if (aaVar != null) {
                                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                            }
                            acVar2 = c0950a;
                            acVar2 = acVar2.mo952a(aaVar);
                            if (acVar2 == null) {
                            }
                            if (acVar != null) {
                                if (acVar2.f2821c != 304) {
                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                    c0916a.f2817k = acVar2.f2829k;
                                    c0916a.f2818l = acVar2.f2830l;
                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    acVar2.f2825g.close();
                                    return a;
                                }
                                C0885c.m2098a(acVar.f2825g);
                            }
                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                            if (r1.f13909a != null) {
                                if (C0880e.m2079b(a)) {
                                }
                                str = aaVar.f2802b;
                                str.equals("MOVE");
                            }
                            return a;
                        }
                        toMillis = TimeUnit.SECONDS.toMillis((long) c2.f2868e);
                        j = toMillis;
                        c2 = c0923d;
                        if (c2.f2868e != -1) {
                            j = Math.min(j, TimeUnit.SECONDS.toMillis((long) c2.f2868e));
                        }
                        if (c2.f2873j == -1) {
                        }
                        if (c.f2871h) {
                        }
                        j2 = j;
                        toMillis = 0;
                        if (c.f2866c) {
                            j3 = max + toMillis2;
                            if (j3 < j2 + toMillis) {
                                b2 = c0860a.f2554c.m2262b();
                                if (j3 >= j2) {
                                    b2.m2257a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (max > 86400000) {
                                    if (c0860a.f2554c.m2263c().f2868e == -1) {
                                    }
                                    if (obj2 != null) {
                                        b2.m2257a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                obj = null;
                                c0861c = new C0861c(null, b2.m2258a());
                                c0861c = new C0861c(obj, obj);
                                aaVar = c0861c.f2564a;
                                acVar = c0861c.f2565b;
                                C0885c.m2098a(a.f2825g);
                                if (aaVar != null) {
                                }
                                if (aaVar != null) {
                                    return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                                }
                                acVar2 = c0950a;
                                acVar2 = acVar2.mo952a(aaVar);
                                if (acVar2 == null) {
                                }
                                if (acVar != null) {
                                    if (acVar2.f2821c != 304) {
                                        C0885c.m2098a(acVar.f2825g);
                                    } else {
                                        c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                        c0916a.f2817k = acVar2.f2829k;
                                        c0916a.f2818l = acVar2.f2830l;
                                        a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                        acVar2.f2825g.close();
                                        return a;
                                    }
                                }
                                a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                if (r1.f13909a != null) {
                                    if (C0880e.m2079b(a)) {
                                    }
                                    str = aaVar.f2802b;
                                    str.equals("MOVE");
                                }
                                return a;
                            }
                        }
                        if (c0860a.f2562k != null) {
                            str = "If-None-Match";
                            str2 = c0860a.f2562k;
                        } else if (c0860a.f2557f != null) {
                            str = "If-Modified-Since";
                            str2 = c0860a.f2558g;
                        } else if (c0860a.f2555d == null) {
                            obj = null;
                            c0861c = new C0861c(c0860a.f2553b, null);
                            c0861c = new C0861c(obj, obj);
                            aaVar = c0861c.f2564a;
                            acVar = c0861c.f2565b;
                            C0885c.m2098a(a.f2825g);
                            if (aaVar != null) {
                            }
                            if (aaVar != null) {
                                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                            }
                            acVar2 = c0950a;
                            acVar2 = acVar2.mo952a(aaVar);
                            if (acVar2 == null) {
                            }
                            if (acVar != null) {
                                if (acVar2.f2821c != 304) {
                                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                    c0916a.f2817k = acVar2.f2829k;
                                    c0916a.f2818l = acVar2.f2830l;
                                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                    acVar2.f2825g.close();
                                    return a;
                                }
                                C0885c.m2098a(acVar.f2825g);
                            }
                            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                            if (r1.f13909a != null) {
                                if (C0880e.m2079b(a)) {
                                }
                                str = aaVar.f2802b;
                                str.equals("MOVE");
                            }
                            return a;
                        } else {
                            str = "If-Modified-Since";
                            str2 = c0860a.f2556e;
                        }
                        a2 = c0860a.f2553b.f2803c.m2344a();
                        C0866a.f2589a.mo1013a(a2, str, str2);
                        c0861c = new C0861c(c0860a.f2553b.m2245a().m2237a(a2.m2341a()).m2242a(), c0860a.f2554c);
                        obj = null;
                        c0861c = new C0861c(obj, obj);
                        aaVar = c0861c.f2564a;
                        acVar = c0861c.f2565b;
                        C0885c.m2098a(a.f2825g);
                        if (aaVar != null) {
                        }
                        if (aaVar != null) {
                            return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
                        }
                        acVar2 = c0950a;
                        acVar2 = acVar2.mo952a(aaVar);
                        if (acVar2 == null) {
                        }
                        if (acVar != null) {
                            if (acVar2.f2821c != 304) {
                                C0885c.m2098a(acVar.f2825g);
                            } else {
                                c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                                c0916a.f2817k = acVar2.f2829k;
                                c0916a.f2818l = acVar2.f2830l;
                                a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                                acVar2.f2825g.close();
                                return a;
                            }
                        }
                        a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                        if (r1.f13909a != null) {
                            if (C0880e.m2079b(a)) {
                            }
                            str = aaVar.f2802b;
                            str.equals("MOVE");
                        }
                        return a;
                    }
                    c0861c = new C0861c(null, c0860a.f2554c);
                }
            }
            obj = null;
            c0861c = new C0861c(c0860a.f2553b, obj);
            c0861c = new C0861c(obj, obj);
            aaVar = c0861c.f2564a;
            acVar = c0861c.f2565b;
            C0885c.m2098a(a.f2825g);
            if (aaVar != null) {
            }
            if (aaVar != null) {
                return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
            }
            acVar2 = c0950a;
            acVar2 = acVar2.mo952a(aaVar);
            if (acVar2 == null) {
            }
            if (acVar != null) {
                if (acVar2.f2821c != 304) {
                    c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                    c0916a.f2817k = acVar2.f2829k;
                    c0916a.f2818l = acVar2.f2830l;
                    a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                    acVar2.f2825g.close();
                    return a;
                }
                C0885c.m2098a(acVar.f2825g);
            }
            a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
            if (r1.f13909a != null) {
                if (C0880e.m2079b(a)) {
                }
                str = aaVar.f2802b;
                str.equals("MOVE");
            }
            return a;
        } else {
            c0861c = new C0861c(c0860a.f2553b, null);
        }
        obj = null;
        c0861c = new C0861c(obj, obj);
        aaVar = c0861c.f2564a;
        acVar = c0861c.f2565b;
        C0885c.m2098a(a.f2825g);
        if (aaVar != null) {
        }
        if (aaVar != null) {
            return acVar.m2262b().m2259b(C4996a.m10081a(acVar)).m2258a();
        }
        acVar2 = c0950a;
        acVar2 = acVar2.mo952a(aaVar);
        if (acVar2 == null) {
        }
        if (acVar != null) {
            if (acVar2.f2821c != 304) {
                C0885c.m2098a(acVar.f2825g);
            } else {
                c0916a = acVar.m2262b().m2256a(C4996a.m10082a(acVar.f2824f, acVar2.f2824f));
                c0916a.f2817k = acVar2.f2829k;
                c0916a.f2818l = acVar2.f2830l;
                a = c0916a.m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
                acVar2.f2825g.close();
                return a;
            }
        }
        a = acVar2.m2262b().m2259b(C4996a.m10081a(acVar)).m2255a(C4996a.m10081a(acVar2)).m2258a();
        if (r1.f13909a != null) {
            if (C0880e.m2079b(a)) {
            }
            str = aaVar.f2802b;
            str.equals("MOVE");
        }
        return a;
    }
}
