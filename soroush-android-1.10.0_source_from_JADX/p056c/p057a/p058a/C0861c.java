package p056c.p057a.p058a;

import java.util.Date;
import p056c.C0946s;
import p056c.aa;
import p056c.ac;
import p056c.p057a.p060c.C0879d;
import p056c.p057a.p060c.C0880e;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C0861c {
    public final aa f2564a;
    public final ac f2565b;

    public static class C0860a {
        final long f2552a;
        final aa f2553b;
        final ac f2554c;
        Date f2555d;
        String f2556e;
        Date f2557f;
        String f2558g;
        Date f2559h;
        long f2560i;
        long f2561j;
        String f2562k;
        int f2563l = -1;

        public C0860a(long j, aa aaVar, ac acVar) {
            this.f2552a = j;
            this.f2553b = aaVar;
            this.f2554c = acVar;
            if (acVar != null) {
                this.f2560i = acVar.f2829k;
                this.f2561j = acVar.f2830l;
                C0946s c0946s = acVar.f2824f;
                int length = c0946s.f2991a.length / 2;
                for (int i = 0; i < length; i++) {
                    String a = c0946s.m2345a(i);
                    String b = c0946s.m2347b(i);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f2555d = C0879d.m2072a(b);
                        this.f2556e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f2559h = C0879d.m2072a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f2557f = C0879d.m2072a(b);
                        this.f2558g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f2562k = b;
                    } else if ("Age".equalsIgnoreCase(a)) {
                        this.f2563l = C0880e.m2078b(b, -1);
                    }
                }
            }
        }
    }

    C0861c(aa aaVar, ac acVar) {
        this.f2564a = aaVar;
        this.f2565b = acVar;
    }

    public static boolean m2020a(ac acVar, aa aaVar) {
        switch (acVar.f2821c) {
            case 200:
            case 203:
            case 204:
            case IjkMediaCodecInfo.RANK_SECURE /*300*/:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                break;
            case 302:
            case 307:
                if (acVar.m2260a("Expires") == null && acVar.m2263c().f2868e == -1 && !acVar.m2263c().f2870g && !acVar.m2263c().f2869f) {
                    return false;
                }
            default:
                return false;
        }
        return (acVar.m2263c().f2867d || aaVar.m2247b().f2867d) ? false : true;
    }
}
