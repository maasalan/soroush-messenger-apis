package com.p085c.p086a.p089c.p092b.p094b;

import com.p085c.p086a.p089c.C1208h;
import com.p085c.p086a.p109i.C1271h;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class C1118c {
    final Map<C1208h, C1116a> f3615a = new HashMap();
    final C1117b f3616b = new C1117b();

    private static class C1116a {
        final Lock f3612a = new ReentrantLock();
        int f3613b;

        C1116a() {
        }
    }

    private static class C1117b {
        final Queue<C1116a> f3614a = new ArrayDeque();

        C1117b() {
        }

        final C1116a m2710a() {
            C1116a c1116a;
            synchronized (this.f3614a) {
                c1116a = (C1116a) this.f3614a.poll();
            }
            return c1116a == null ? new C1116a() : c1116a;
        }
    }

    C1118c() {
    }

    final void m2711a(C1208h c1208h) {
        C1116a c1116a;
        synchronized (this) {
            c1116a = (C1116a) C1271h.m3012a(this.f3615a.get(c1208h), "Argument must not be null");
            if (c1116a.f3613b <= 0) {
                StringBuilder stringBuilder = new StringBuilder("Cannot release a lock that is not held, key: ");
                stringBuilder.append(c1208h);
                stringBuilder.append(", interestedThreads: ");
                stringBuilder.append(c1116a.f3613b);
                throw new IllegalStateException(stringBuilder.toString());
            }
            c1116a.f3613b--;
            if (c1116a.f3613b == 0) {
                C1116a c1116a2 = (C1116a) this.f3615a.remove(c1208h);
                if (c1116a2.equals(c1116a)) {
                    C1117b c1117b = this.f3616b;
                    synchronized (c1117b.f3614a) {
                        if (c1117b.f3614a.size() < 10) {
                            c1117b.f3614a.offer(c1116a2);
                        }
                    }
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder("Removed the wrong lock, expected to remove: ");
                    stringBuilder2.append(c1116a);
                    stringBuilder2.append(", but actually removed: ");
                    stringBuilder2.append(c1116a2);
                    stringBuilder2.append(", key: ");
                    stringBuilder2.append(c1208h);
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
        }
        c1116a.f3612a.unlock();
    }
}
