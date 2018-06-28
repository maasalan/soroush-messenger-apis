package p056c;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p056c.C5049z.C5048a;
import p056c.p057a.C0885c;

public final class C0939n {
    private int f2974a = 64;
    private int f2975b = 5;
    private Runnable f2976c;
    private ExecutorService f2977d;
    private final Deque<C5048a> f2978e = new ArrayDeque();
    private final Deque<C5048a> f2979f = new ArrayDeque();
    private final Deque<C5049z> f2980g = new ArrayDeque();

    private synchronized ExecutorService m2305a() {
        if (this.f2977d == null) {
            this.f2977d = new ThreadPoolExecutor(0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0885c.m2096a("OkHttp Dispatcher", false));
        }
        return this.f2977d;
    }

    private <T> void m2306a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    m2307b();
                }
                int c = m2308c();
                Runnable runnable = this.f2976c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (c == 0 && runnable != null) {
            runnable.run();
        }
    }

    private void m2307b() {
        if (this.f2979f.size() < this.f2974a && !this.f2978e.isEmpty()) {
            Iterator it = this.f2978e.iterator();
            while (it.hasNext()) {
                C5048a c5048a = (C5048a) it.next();
                if (m2309c(c5048a) < this.f2975b) {
                    it.remove();
                    this.f2979f.add(c5048a);
                    m2305a().execute(c5048a);
                }
                if (this.f2979f.size() >= this.f2974a) {
                    break;
                }
            }
        }
    }

    private synchronized int m2308c() {
        return this.f2979f.size() + this.f2980g.size();
    }

    private int m2309c(C5048a c5048a) {
        int i = 0;
        for (C5048a c5048a2 : this.f2979f) {
            if (!c5048a2.f14106a.f14111d && c5048a2.m10238a().equals(c5048a.m10238a())) {
                i++;
            }
        }
        return i;
    }

    final synchronized void m2310a(C5048a c5048a) {
        if (this.f2979f.size() >= this.f2974a || m2309c(c5048a) >= this.f2975b) {
            this.f2978e.add(c5048a);
            return;
        }
        this.f2979f.add(c5048a);
        m2305a().execute(c5048a);
    }

    final synchronized void m2311a(C5049z c5049z) {
        this.f2980g.add(c5049z);
    }

    final void m2312b(C5048a c5048a) {
        m2306a(this.f2979f, c5048a, true);
    }

    final void m2313b(C5049z c5049z) {
        m2306a(this.f2980g, c5049z, false);
    }
}
