package com.p067a.p070b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class C0991o {
    final Map<String, Queue<C0989n<?>>> f3183a;
    final Set<C0989n<?>> f3184b;
    final PriorityBlockingQueue<C0989n<?>> f3185c;
    List<Object> f3186d;
    private AtomicInteger f3187e;
    private final PriorityBlockingQueue<C0989n<?>> f3188f;
    private final C0978b f3189g;
    private final C0984g f3190h;
    private final C0995q f3191i;
    private C0985h[] f3192j;
    private C0980c f3193k;

    public interface C0990a {
        boolean mo1049a(C0989n<?> c0989n);
    }

    class C50631 implements C0990a {
        final /* synthetic */ Object f14137a;
        final /* synthetic */ C0991o f14138b;

        public C50631(C0991o c0991o, Object obj) {
            this.f14138b = c0991o;
            this.f14137a = obj;
        }

        public final boolean mo1049a(C0989n<?> c0989n) {
            return c0989n.getTag() == this.f14137a;
        }
    }

    private C0991o(C0978b c0978b, C0984g c0984g) {
        this(c0978b, c0984g, new C5059e(new Handler(Looper.getMainLooper())));
    }

    public C0991o(C0978b c0978b, C0984g c0984g, byte b) {
        this(c0978b, c0984g);
    }

    private C0991o(C0978b c0978b, C0984g c0984g, C0995q c0995q) {
        this.f3187e = new AtomicInteger();
        this.f3183a = new HashMap();
        this.f3184b = new HashSet();
        this.f3185c = new PriorityBlockingQueue();
        this.f3188f = new PriorityBlockingQueue();
        this.f3186d = new ArrayList();
        this.f3189g = c0978b;
        this.f3190h = c0984g;
        this.f3192j = new C0985h[4];
        this.f3191i = c0995q;
    }

    public final <T> C0989n<T> m2442a(C0989n<T> c0989n) {
        c0989n.setRequestQueue(this);
        synchronized (this.f3184b) {
            this.f3184b.add(c0989n);
        }
        c0989n.setSequence(this.f3187e.incrementAndGet());
        c0989n.addMarker("add-to-queue");
        if (c0989n.shouldCache()) {
            synchronized (this.f3183a) {
                String cacheKey = c0989n.getCacheKey();
                if (this.f3183a.containsKey(cacheKey)) {
                    Queue queue = (Queue) this.f3183a.get(cacheKey);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(c0989n);
                    this.f3183a.put(cacheKey, queue);
                    if (C1000v.f3207b) {
                        C1000v.m2454a("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
                    }
                } else {
                    this.f3183a.put(cacheKey, null);
                    this.f3185c.add(c0989n);
                }
            }
            return c0989n;
        }
        this.f3188f.add(c0989n);
        return c0989n;
    }

    public final void m2443a() {
        if (this.f3193k != null) {
            C0980c c0980c = this.f3193k;
            c0980c.f3153a = true;
            c0980c.interrupt();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f3192j.length; i2++) {
            if (this.f3192j[i2] != null) {
                C0985h c0985h = this.f3192j[i2];
                c0985h.f3165a = true;
                c0985h.interrupt();
            }
        }
        this.f3193k = new C0980c(this.f3185c, this.f3188f, this.f3189g, this.f3191i);
        this.f3193k.start();
        while (i < this.f3192j.length) {
            C0985h c0985h2 = new C0985h(this.f3188f, this.f3190h, this.f3189g, this.f3191i);
            this.f3192j[i] = c0985h2;
            c0985h2.start();
            i++;
        }
    }

    public final void m2444a(C0990a c0990a) {
        synchronized (this.f3184b) {
            for (C0989n c0989n : this.f3184b) {
                if (c0990a.mo1049a(c0989n)) {
                    c0989n.cancel();
                }
            }
        }
    }
}
