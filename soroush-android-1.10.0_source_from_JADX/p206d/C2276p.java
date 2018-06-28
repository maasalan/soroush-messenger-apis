package p206d;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C2276p {
    static C2275o f7570a;
    static long f7571b;

    private C2276p() {
    }

    static C2275o m6223a() {
        synchronized (C2276p.class) {
            if (f7570a != null) {
                C2275o c2275o = f7570a;
                f7570a = c2275o.f7568f;
                c2275o.f7568f = null;
                f7571b -= IjkMediaMeta.AV_CH_TOP_FRONT_CENTER;
                return c2275o;
            }
            return new C2275o();
        }
    }

    static void m6224a(C2275o c2275o) {
        if (c2275o.f7568f == null) {
            if (c2275o.f7569g == null) {
                if (!c2275o.f7566d) {
                    synchronized (C2276p.class) {
                        if (f7571b + IjkMediaMeta.AV_CH_TOP_FRONT_CENTER > IjkMediaMeta.AV_CH_TOP_BACK_CENTER) {
                            return;
                        }
                        f7571b += IjkMediaMeta.AV_CH_TOP_FRONT_CENTER;
                        c2275o.f7568f = f7570a;
                        c2275o.f7565c = 0;
                        c2275o.f7564b = 0;
                        f7570a = c2275o;
                        return;
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
