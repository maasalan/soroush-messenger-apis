package p000a.p001a.p002a;

final class C0000a implements Runnable {
    final C0011i f0a = new C0011i();
    final C0005c f1b;

    C0000a(C0005c c0005c) {
        this.f1b = c0005c;
    }

    public final void run() {
        C0010h a = this.f0a.m12a();
        if (a == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f1b.m5a(a);
    }
}
