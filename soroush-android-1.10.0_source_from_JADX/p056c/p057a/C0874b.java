package p056c.p057a;

public abstract class C0874b implements Runnable {
    protected final String f2623b;

    public C0874b(String str, Object... objArr) {
        this.f2623b = C0885c.m2092a(str, objArr);
    }

    public abstract void mo971b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f2623b);
        try {
            mo971b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
