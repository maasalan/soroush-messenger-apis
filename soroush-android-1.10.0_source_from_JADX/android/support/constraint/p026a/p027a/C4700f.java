package android.support.constraint.p026a.p027a;

import android.support.constraint.p026a.C0184e;
import android.support.constraint.p026a.C0189h;
import android.support.constraint.p026a.p027a.C0171c.C0170c;
import android.support.constraint.p026a.p027a.C0174d.C0173a;
import java.util.ArrayList;

public final class C4700f extends C0174d {
    protected float f12913a = -1.0f;
    protected int ak = -1;
    private C0171c al = this.v;
    private int am;
    private boolean an;
    private int ao;
    private C0177i ap;
    private int aq;
    protected int f12914b = -1;

    public C4700f() {
        int i = 0;
        this.am = 0;
        this.an = false;
        this.ao = 0;
        this.ap = new C0177i();
        this.aq = 8;
        this.D.clear();
        this.D.add(this.al);
        int length = this.C.length;
        while (i < length) {
            this.C[i] = this.al;
            i++;
        }
    }

    public final C0171c mo51a(C0170c c0170c) {
        switch (c0170c) {
            case LEFT:
            case RIGHT:
                if (this.am == 1) {
                    return this.al;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.am == 0) {
                    return this.al;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            default:
                break;
        }
        throw new AssertionError(c0170c.name());
    }

    public final void m8585a(float f) {
        if (f > -1.0f) {
            this.f12913a = f;
            this.f12914b = -1;
            this.ak = -1;
        }
    }

    public final void mo52a(int i) {
        C0174d c0174d = this.f603F;
        if (c0174d != null) {
            int i2;
            if (this.am == 1) {
                this.v.f580a.m8599a(c0174d.f644v.f580a, 0);
                this.x.f580a.m8599a(c0174d.f644v.f580a, 0);
                if (this.f12914b != -1) {
                    this.u.f580a.m8599a(c0174d.f643u.f580a, this.f12914b);
                    this.w.f580a.m8599a(c0174d.f643u.f580a, this.f12914b);
                    return;
                } else if (this.ak != -1) {
                    this.u.f580a.m8599a(c0174d.f645w.f580a, -this.ak);
                    this.w.f580a.m8599a(c0174d.f645w.f580a, -this.ak);
                    return;
                } else if (this.f12913a != -1.0f && c0174d.m320x() == C0173a.f592a) {
                    i2 = (int) (((float) c0174d.f604G) * this.f12913a);
                    this.u.f580a.m8599a(c0174d.f643u.f580a, i2);
                    this.w.f580a.m8599a(c0174d.f643u.f580a, i2);
                    return;
                }
            }
            this.u.f580a.m8599a(c0174d.f643u.f580a, 0);
            this.w.f580a.m8599a(c0174d.f643u.f580a, 0);
            if (this.f12914b != -1) {
                this.v.f580a.m8599a(c0174d.f644v.f580a, this.f12914b);
                this.x.f580a.m8599a(c0174d.f644v.f580a, this.f12914b);
            } else if (this.ak != -1) {
                this.v.f580a.m8599a(c0174d.f646x.f580a, -this.ak);
                this.x.f580a.m8599a(c0174d.f646x.f580a, -this.ak);
            } else if (this.f12913a != -1.0f && c0174d.m321y() == C0173a.f592a) {
                i2 = (int) (((float) c0174d.f605H) * this.f12913a);
                this.v.f580a.m8599a(c0174d.f644v.f580a, i2);
                this.x.f580a.m8599a(c0174d.f644v.f580a, i2);
            }
        }
    }

    public final void mo53a(C0184e c0184e) {
        C6337e c6337e = (C6337e) this.f603F;
        if (c6337e != null) {
            Object a = c6337e.mo51a(C0170c.LEFT);
            Object a2 = c6337e.mo51a(C0170c.RIGHT);
            int i = (this.F == null || this.F.f602E[0] != C0173a.f593b) ? 0 : 1;
            if (this.am == 0) {
                a = c6337e.mo51a(C0170c.TOP);
                a2 = c6337e.mo51a(C0170c.BOTTOM);
                i = (this.F == null || this.F.f602E[1] != C0173a.f593b) ? 0 : 1;
            }
            C0189h a3;
            if (this.f12914b != -1) {
                a3 = c0184e.m358a(this.al);
                c0184e.m369c(a3, c0184e.m358a(a), this.f12914b, 6);
                if (i != 0) {
                    c0184e.m364a(c0184e.m358a(a2), a3, 0, 5);
                }
            } else if (this.ak != -1) {
                a3 = c0184e.m358a(this.al);
                C0189h a4 = c0184e.m358a(a2);
                c0184e.m369c(a3, a4, -this.ak, 6);
                if (i != 0) {
                    c0184e.m364a(a3, c0184e.m358a(a), 0, 5);
                    c0184e.m364a(a4, a3, 0, 5);
                }
            } else {
                if (this.f12913a != -1.0f) {
                    c0184e.m359a(C0184e.m348a(c0184e, c0184e.m358a(this.al), c0184e.m358a(a), c0184e.m358a(a2), this.f12913a, this.an));
                }
            }
        }
    }

    public final boolean mo54a() {
        return true;
    }

    public final void m8589j(int i) {
        if (this.am != i) {
            this.am = i;
            this.D.clear();
            this.al = this.am == 1 ? this.u : this.v;
            this.D.add(this.al);
            i = this.C.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.C[i2] = this.al;
            }
        }
    }

    public final void m8590k(int i) {
        if (i >= 0) {
            this.f12913a = -1.0f;
            this.f12914b = i;
            this.ak = -1;
        }
    }

    public final void m8591l(int i) {
        if (i >= 0) {
            this.f12913a = -1.0f;
            this.f12914b = -1;
            this.ak = i;
        }
    }

    public final ArrayList<C0171c> mo55u() {
        return this.D;
    }

    public final void mo56z() {
        if (this.f603F != null) {
            int b = C0184e.m351b(this.al);
            if (this.am == 1) {
                m288b(b);
                m291c(0);
                m296e(this.f603F.m309m());
                m293d(0);
                return;
            }
            m288b(0);
            m291c(b);
            m293d(this.f603F.m308l());
            m296e(0);
        }
    }
}
