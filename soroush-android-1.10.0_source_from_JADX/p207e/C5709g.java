package p207e;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import p056c.C0925e;
import p056c.C0952v;
import p056c.ac;
import p056c.ac.C0916a;
import p056c.ad;
import p206d.C2273l;
import p206d.C5683e;
import p206d.C5685h;
import p206d.C6623c;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

final class C5709g<T> implements C2305b<T> {
    private final C2319m<T, ?> f15665a;
    private final Object[] f15666b;
    private volatile boolean f15667c;
    private C0925e f15668d;
    private Throwable f15669e;
    private boolean f15670f;

    static final class C5707a extends ad {
        IOException f15661b;
        private final ad f15662c;

        C5707a(ad adVar) {
            this.f15662c = adVar;
        }

        public final C0952v mo957a() {
            return this.f15662c.mo957a();
        }

        public final long mo958b() {
            return this.f15662c.mo958b();
        }

        public final void close() {
            this.f15662c.close();
        }

        public final C5683e mo959d() {
            return C2273l.m6209a(new C5685h(this, this.f15662c.mo959d()) {
                final /* synthetic */ C5707a f18892a;

                public final long mo944a(C6623c c6623c, long j) {
                    try {
                        return super.mo944a(c6623c, j);
                    } catch (IOException e) {
                        this.f18892a.f15661b = e;
                        throw e;
                    }
                }
            });
        }
    }

    static final class C5708b extends ad {
        private final C0952v f15663b;
        private final long f15664c;

        C5708b(C0952v c0952v, long j) {
            this.f15663b = c0952v;
            this.f15664c = j;
        }

        public final C0952v mo957a() {
            return this.f15663b;
        }

        public final long mo958b() {
            return this.f15664c;
        }

        public final C5683e mo959d() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C5709g(C2319m<T, ?> c2319m, Object[] objArr) {
        this.f15665a = c2319m;
        this.f15666b = objArr;
    }

    private C2314k<T> m12764a(ac acVar) {
        ad adVar = acVar.f2825g;
        C0916a b = acVar.m2262b();
        b.f2813g = new C5708b(adVar.mo957a(), adVar.mo958b());
        acVar = b.m2258a();
        int i = acVar.f2821c;
        if (i >= 200) {
            if (i < IjkMediaCodecInfo.RANK_SECURE) {
                if (i != 204) {
                    if (i != 205) {
                        C5707a c5707a = new C5707a(adVar);
                        try {
                            return C2314k.m6285a(this.f15665a.f7638f.mo2054a(c5707a), acVar);
                        } catch (RuntimeException e) {
                            if (c5707a.f15661b != null) {
                                throw c5707a.f15661b;
                            }
                            throw e;
                        }
                    }
                }
                adVar.close();
                return C2314k.m6285a(null, acVar);
            }
        }
        try {
            C2314k<T> a = C2314k.m6284a(C2323n.m6306a(adVar), acVar);
            return a;
        } finally {
            adVar.close();
        }
    }

    private C5709g<T> m12765c() {
        return new C5709g(this.f15665a, this.f15666b);
    }

    public final C2314k<T> mo2060a() {
        C0925e c0925e;
        synchronized (this) {
            if (this.f15670f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f15670f = true;
            if (this.f15669e == null) {
                c0925e = this.f15668d;
                if (c0925e == null) {
                    try {
                        c0925e = this.f15665a.f7635c.mo1017a(this.f15665a.m6304a(this.f15666b));
                        if (c0925e == null) {
                            throw new NullPointerException("Call.Factory returned null.");
                        }
                        this.f15668d = c0925e;
                    } catch (Throwable e) {
                        this.f15669e = e;
                        throw e;
                    }
                }
            } else if (this.f15669e instanceof IOException) {
                throw ((IOException) this.f15669e);
            } else {
                throw ((RuntimeException) this.f15669e);
            }
        }
        if (this.f15667c) {
            c0925e.mo1021c();
        }
        return m12764a(FirebasePerfOkHttpClient.execute(c0925e));
    }

    public final /* synthetic */ C2305b mo2061b() {
        return m12765c();
    }

    public final /* synthetic */ Object clone() {
        return m12765c();
    }
}
