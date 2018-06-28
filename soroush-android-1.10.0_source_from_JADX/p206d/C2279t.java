package p206d;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class C2279t {
    public static final C2279t f7572c = new C56921();
    private boolean f7573a;
    private long f7574b;
    private long f7575d;

    class C56921 extends C2279t {
        C56921() {
        }

        public final C2279t mo2030a(long j) {
            return this;
        }

        public final C2279t mo2031a(long j, TimeUnit timeUnit) {
            return this;
        }

        public final void mo2034f() {
        }
    }

    public C2279t mo2030a(long j) {
        this.f7573a = true;
        this.f7574b = j;
        return this;
    }

    public C2279t mo2031a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder("timeout < 0: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        } else {
            this.f7575d = timeUnit.toNanos(j);
            return this;
        }
    }

    public long mo2032c() {
        if (this.f7573a) {
            return this.f7574b;
        }
        throw new IllegalStateException("No deadline");
    }

    public C2279t mo2033d() {
        this.f7575d = 0;
        return this;
    }

    public void mo2034f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f7573a && this.f7574b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long q_() {
        return this.f7575d;
    }

    public boolean r_() {
        return this.f7573a;
    }

    public C2279t s_() {
        this.f7573a = false;
        return this;
    }
}
