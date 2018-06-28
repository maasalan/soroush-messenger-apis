package p000a.p001a.p002a;

final class C0011i {
    private C0010h f51a;
    private C0010h f52b;

    C0011i() {
    }

    final synchronized C0010h m12a() {
        C0010h c0010h;
        c0010h = this.f51a;
        if (this.f51a != null) {
            this.f51a = this.f51a.f50c;
            if (this.f51a == null) {
                this.f52b = null;
            }
        }
        return c0010h;
    }

    final synchronized void m13a(C0010h c0010h) {
        if (c0010h == null) {
            throw new NullPointerException("null cannot be enqueued");
        }
        if (this.f52b != null) {
            this.f52b.f50c = c0010h;
            this.f52b = c0010h;
        } else if (this.f51a == null) {
            this.f52b = c0010h;
            this.f51a = c0010h;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    final synchronized C0010h m14b() {
        if (this.f51a == null) {
            wait(1000);
        }
        return m12a();
    }
}
