package android.arch.lifecycle;

import android.arch.lifecycle.C0093d.C0091a;
import android.arch.lifecycle.C0093d.C0092b;
import android.arch.p017a.p018a.C4672a;
import android.arch.p017a.p019b.C0082b;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    private static final Object f363d = new Object();
    volatile Object f364a = f363d;
    int f365b = -1;
    private final Object f366c = new Object();
    private C0082b<C0101l<T>, C0085a> f367e = new C0082b();
    private int f368f = 0;
    private volatile Object f369g = f363d;
    private boolean f370h;
    private boolean f371i;
    private final Runnable f372j = new C00841(this);

    class C00841 implements Runnable {
        final /* synthetic */ LiveData f358a;

        C00841(LiveData liveData) {
            this.f358a = liveData;
        }

        public final void run() {
            Object b;
            synchronized (this.f358a.f366c) {
                b = this.f358a.f369g;
                this.f358a.f369g = LiveData.f363d;
            }
            LiveData liveData = this.f358a;
            LiveData.m148a("setValue");
            liveData.f365b++;
            liveData.f364a = b;
            liveData.m154a(null);
        }
    }

    private abstract class C0085a {
        final C0101l<T> f359c;
        boolean f360d;
        int f361e = -1;
        final /* synthetic */ LiveData f362f;

        C0085a(LiveData liveData, C0101l<T> c0101l) {
            this.f362f = liveData;
            this.f359c = c0101l;
        }

        final void m139a(boolean z) {
            if (z != this.f360d) {
                this.f360d = z;
                int i = 1;
                int i2 = this.f362f.f368f == 0 ? 1 : 0;
                LiveData liveData = this.f362f;
                int c = liveData.f368f;
                if (!this.f360d) {
                    i = -1;
                }
                liveData.f368f = c + i;
                if (i2 != 0 && this.f360d) {
                    LiveData.m146a();
                }
                if (this.f362f.f368f == 0 && !this.f360d) {
                    LiveData.m150b();
                }
                if (this.f360d) {
                    this.f362f.m154a(this);
                }
            }
        }

        abstract boolean mo2477a();

        boolean mo2478a(C0096g c0096g) {
            return false;
        }

        void mo2479b() {
        }
    }

    class LifecycleBoundObserver extends C0085a implements GenericLifecycleObserver {
        final C0096g f17276a;
        final /* synthetic */ LiveData f17277b;

        LifecycleBoundObserver(LiveData liveData, C0096g c0096g, C0101l<T> c0101l) {
            this.f17277b = liveData;
            super(liveData, c0101l);
            this.f17276a = c0096g;
        }

        public final void mo2476a(C0096g c0096g, C0091a c0091a) {
            if (this.f17276a.mo39d().mo33a() == C0092b.DESTROYED) {
                this.f17277b.m156a(this.c);
            } else {
                m139a(mo2477a());
            }
        }

        final boolean mo2477a() {
            return this.f17276a.mo39d().mo33a().m163a(C0092b.STARTED);
        }

        final boolean mo2478a(C0096g c0096g) {
            return this.f17276a == c0096g;
        }

        final void mo2479b() {
            this.f17276a.mo39d().mo35b(this);
        }
    }

    protected static void m146a() {
    }

    static void m148a(String str) {
        if (!C4672a.m8516a().f12861a.mo22b()) {
            StringBuilder stringBuilder = new StringBuilder("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    protected static void m150b() {
    }

    private void m151b(C0085a c0085a) {
        if (!c0085a.f360d) {
            return;
        }
        if (!c0085a.mo2477a()) {
            c0085a.m139a(false);
        } else if (c0085a.f361e < this.f365b) {
            c0085a.f361e = this.f365b;
            C0101l c0101l = c0085a.f359c;
            Object obj = this.f364a;
            c0101l.mo42a();
        }
    }

    final void m154a(C0085a c0085a) {
        if (this.f370h) {
            this.f371i = true;
            return;
        }
        this.f370h = true;
        do {
            this.f371i = false;
            C0085a c0085a2;
            if (c0085a2 == null) {
                Iterator a = this.f367e.m135a();
                while (a.hasNext()) {
                    m151b((C0085a) ((Entry) a.next()).getValue());
                    if (this.f371i) {
                        break;
                    }
                }
            }
            m151b(c0085a2);
            c0085a2 = null;
        } while (this.f371i);
        this.f370h = false;
    }

    public final void m155a(C0096g c0096g, C0101l<T> c0101l) {
        if (c0096g.mo39d().mo33a() != C0092b.DESTROYED) {
            C0095f lifecycleBoundObserver = new LifecycleBoundObserver(this, c0096g, c0101l);
            C0085a c0085a = (C0085a) this.f367e.mo24a(c0101l, lifecycleBoundObserver);
            if (c0085a != null && !c0085a.mo2478a(c0096g)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (c0085a == null) {
                c0096g.mo39d().mo34a(lifecycleBoundObserver);
            }
        }
    }

    public final void m156a(C0101l<T> c0101l) {
        m148a("removeObserver");
        C0085a c0085a = (C0085a) this.f367e.mo25b(c0101l);
        if (c0085a != null) {
            c0085a.mo2479b();
            c0085a.m139a(false);
        }
    }
}
