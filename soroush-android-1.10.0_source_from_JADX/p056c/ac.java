package p056c;

import java.io.Closeable;
import p056c.C0946s.C0945a;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class ac implements Closeable {
    public final aa f2819a;
    final C0956y f2820b;
    public final int f2821c;
    public final String f2822d;
    public final C0944r f2823e;
    public final C0946s f2824f;
    public final ad f2825g;
    final ac f2826h;
    final ac f2827i;
    public final ac f2828j;
    public final long f2829k;
    public final long f2830l;
    private volatile C0923d f2831m;

    public static class C0916a {
        public aa f2807a;
        public C0956y f2808b;
        public int f2809c;
        public String f2810d;
        public C0944r f2811e;
        C0945a f2812f;
        public ad f2813g;
        ac f2814h;
        ac f2815i;
        public ac f2816j;
        public long f2817k;
        public long f2818l;

        public C0916a() {
            this.f2809c = -1;
            this.f2812f = new C0945a();
        }

        C0916a(ac acVar) {
            this.f2809c = -1;
            this.f2807a = acVar.f2819a;
            this.f2808b = acVar.f2820b;
            this.f2809c = acVar.f2821c;
            this.f2810d = acVar.f2822d;
            this.f2811e = acVar.f2823e;
            this.f2812f = acVar.f2824f.m2344a();
            this.f2813g = acVar.f2825g;
            this.f2814h = acVar.f2826h;
            this.f2815i = acVar.f2827i;
            this.f2816j = acVar.f2828j;
            this.f2817k = acVar.f2829k;
            this.f2818l = acVar.f2830l;
        }

        private static void m2254a(String str, ac acVar) {
            StringBuilder stringBuilder;
            if (acVar.f2825g != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".body != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (acVar.f2826h != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".networkResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (acVar.f2827i != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".cacheResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (acVar.f2828j != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(".priorResponse != null");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public final C0916a m2255a(ac acVar) {
            if (acVar != null) {
                C0916a.m2254a("networkResponse", acVar);
            }
            this.f2814h = acVar;
            return this;
        }

        public final C0916a m2256a(C0946s c0946s) {
            this.f2812f = c0946s.m2344a();
            return this;
        }

        public final C0916a m2257a(String str, String str2) {
            this.f2812f.m2340a(str, str2);
            return this;
        }

        public final ac m2258a() {
            if (this.f2807a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f2808b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f2809c < 0) {
                StringBuilder stringBuilder = new StringBuilder("code < 0: ");
                stringBuilder.append(this.f2809c);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f2810d != null) {
                return new ac(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public final C0916a m2259b(ac acVar) {
            if (acVar != null) {
                C0916a.m2254a("cacheResponse", acVar);
            }
            this.f2815i = acVar;
            return this;
        }
    }

    ac(C0916a c0916a) {
        this.f2819a = c0916a.f2807a;
        this.f2820b = c0916a.f2808b;
        this.f2821c = c0916a.f2809c;
        this.f2822d = c0916a.f2810d;
        this.f2823e = c0916a.f2811e;
        this.f2824f = c0916a.f2812f.m2341a();
        this.f2825g = c0916a.f2813g;
        this.f2826h = c0916a.f2814h;
        this.f2827i = c0916a.f2815i;
        this.f2828j = c0916a.f2816j;
        this.f2829k = c0916a.f2817k;
        this.f2830l = c0916a.f2818l;
    }

    public final String m2260a(String str) {
        str = this.f2824f.m2346a(str);
        return str != null ? str : null;
    }

    public final boolean m2261a() {
        return this.f2821c >= 200 && this.f2821c < IjkMediaCodecInfo.RANK_SECURE;
    }

    public final C0916a m2262b() {
        return new C0916a(this);
    }

    public final C0923d m2263c() {
        C0923d c0923d = this.f2831m;
        if (c0923d != null) {
            return c0923d;
        }
        c0923d = C0923d.m2278a(this.f2824f);
        this.f2831m = c0923d;
        return c0923d;
    }

    public final void close() {
        if (this.f2825g == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        this.f2825g.close();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        stringBuilder.append(this.f2820b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.f2821c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.f2822d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.f2819a.f2801a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
