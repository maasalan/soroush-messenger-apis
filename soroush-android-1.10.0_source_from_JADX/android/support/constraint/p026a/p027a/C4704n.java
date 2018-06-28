package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0182c;
import java.util.ArrayList;

public class C4704n extends C0174d {
    protected ArrayList<C0174d> aw = new ArrayList();

    public void mo2503A() {
        mo62v();
        if (this.aw != null) {
            int size = this.aw.size();
            for (int i = 0; i < size; i++) {
                C0174d c0174d = (C0174d) this.aw.get(i);
                if (c0174d instanceof C4704n) {
                    ((C4704n) c0174d).mo2503A();
                }
            }
        }
    }

    public final C6337e m8609D() {
        C0174d c0174d = this.f603F;
        C6337e c6337e = this instanceof C6337e ? (C6337e) this : null;
        while (c0174d != null) {
            C0174d c0174d2 = c0174d.f603F;
            if (c0174d instanceof C6337e) {
                c6337e = (C6337e) c0174d;
            }
            c0174d = c0174d2;
        }
        return c6337e;
    }

    public final void m8610E() {
        this.aw.clear();
    }

    public final void m8611a(C0174d c0174d) {
        this.aw.add(c0174d);
        if (c0174d.f603F != null) {
            ((C4704n) c0174d.f603F).m8614b(c0174d);
        }
        c0174d.f603F = this;
    }

    public final void mo59a(C0182c c0182c) {
        super.mo59a(c0182c);
        int size = this.aw.size();
        for (int i = 0; i < size; i++) {
            ((C0174d) this.aw.get(i)).mo59a(c0182c);
        }
    }

    public final void mo60b(int i, int i2) {
        super.mo60b(i, i2);
        i = this.aw.size();
        for (i2 = 0; i2 < i; i2++) {
            ((C0174d) this.aw.get(i2)).mo60b(m312p(), m313q());
        }
    }

    public final void m8614b(C0174d c0174d) {
        this.aw.remove(c0174d);
        c0174d.f603F = null;
    }

    public void mo61f() {
        this.aw.clear();
        super.mo61f();
    }

    public final void mo62v() {
        super.mo62v();
        if (this.aw != null) {
            int size = this.aw.size();
            for (int i = 0; i < size; i++) {
                C0174d c0174d = (C0174d) this.aw.get(i);
                c0174d.mo60b(m310n(), m311o());
                if (!(c0174d instanceof C6337e)) {
                    c0174d.mo62v();
                }
            }
        }
    }
}
