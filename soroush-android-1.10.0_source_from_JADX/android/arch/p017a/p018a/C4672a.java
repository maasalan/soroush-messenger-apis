package android.arch.p017a.p018a;

import java.util.concurrent.Executor;

public class C4672a extends C0079c {
    private static volatile C4672a f12858b;
    private static final Executor f12859d = new C00771();
    private static final Executor f12860e = new C00782();
    public C0079c f12861a = this.f12862c;
    private C0079c f12862c = new C4673b();

    static class C00771 implements Executor {
        C00771() {
        }

        public final void execute(Runnable runnable) {
            C4672a.m8516a().mo21b(runnable);
        }
    }

    static class C00782 implements Executor {
        C00782() {
        }

        public final void execute(Runnable runnable) {
            C4672a.m8516a().mo20a(runnable);
        }
    }

    private C4672a() {
    }

    public static C4672a m8516a() {
        if (f12858b != null) {
            return f12858b;
        }
        synchronized (C4672a.class) {
            if (f12858b == null) {
                f12858b = new C4672a();
            }
        }
        return f12858b;
    }

    public final void mo20a(Runnable runnable) {
        this.f12861a.mo20a(runnable);
    }

    public final void mo21b(Runnable runnable) {
        this.f12861a.mo21b(runnable);
    }

    public final boolean mo22b() {
        return this.f12861a.mo22b();
    }
}
