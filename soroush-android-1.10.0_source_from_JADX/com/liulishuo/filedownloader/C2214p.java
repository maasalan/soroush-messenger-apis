package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.C5676w.C2230b;
import com.liulishuo.filedownloader.message.C2202c.C2200a;
import com.liulishuo.filedownloader.p205h.C2175b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

final class C2214p {
    private final C2212b f7315a = new C2212b();

    private static class C2211a {
        private static final C2214p f7310a = new C2214p();

        static {
            C2200a.f7279a.m6049a(new C5677z());
        }
    }

    private static class C2212b {
        ThreadPoolExecutor f7311a = C2175b.m5968a(3, this.f7312b, "LauncherTask");
        LinkedBlockingQueue<Runnable> f7312b = new LinkedBlockingQueue();

        C2212b() {
        }
    }

    private static class C2213c implements Runnable {
        private final C2230b f7313a;
        private boolean f7314b = false;

        C2213c(C2230b c2230b) {
            this.f7313a = c2230b;
        }

        public final boolean equals(Object obj) {
            if (!super.equals(obj)) {
                if (obj != this.f7313a) {
                    return false;
                }
            }
            return true;
        }

        public final void run() {
            if (!this.f7314b) {
                this.f7313a.mo3093n();
            }
        }
    }

    C2214p() {
    }

    final synchronized void m6069a(C2230b c2230b) {
        this.f7315a.f7311a.execute(new C2213c(c2230b));
    }

    final synchronized void m6070b(C2230b c2230b) {
        this.f7315a.f7312b.remove(c2230b);
    }
}
