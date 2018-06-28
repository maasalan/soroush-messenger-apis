package android.databinding;

import android.databinding.C0133h.C0132a;

public class C4693a implements C0133h {
    private transient C4696l f12897a;

    public final void m8576a() {
        synchronized (this) {
            if (this.f12897a == null) {
                return;
            }
            this.f12897a.m202a((Object) this, 0);
        }
    }

    public final void mo47a(C0132a c0132a) {
        synchronized (this) {
            if (this.f12897a == null) {
                this.f12897a = new C4696l();
            }
        }
        this.f12897a.m201a((Object) c0132a);
    }

    public final void mo48b(C0132a c0132a) {
        synchronized (this) {
            if (this.f12897a == null) {
                return;
            }
            this.f12897a.m203b(c0132a);
        }
    }

    public final void b_(int i) {
        synchronized (this) {
            if (this.f12897a == null) {
                return;
            }
            this.f12897a.m202a((Object) this, i);
        }
    }
}
