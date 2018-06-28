package android.support.constraint.p026a.p027a;

import java.util.ArrayList;

public final class C0180m {
    int f658a;
    int f659b;
    int f660c;
    int f661d;
    ArrayList<C0179a> f662e = new ArrayList();

    static class C0179a {
        C0171c f653a;
        C0171c f654b;
        int f655c;
        int f656d;
        int f657e;

        public C0179a(C0171c c0171c) {
            this.f653a = c0171c;
            this.f654b = c0171c.f583d;
            this.f655c = c0171c.m274b();
            this.f656d = c0171c.f586g;
            this.f657e = c0171c.f587h;
        }
    }

    public C0180m(C0174d c0174d) {
        this.f658a = c0174d.m306j();
        this.f659b = c0174d.m307k();
        this.f660c = c0174d.m308l();
        this.f661d = c0174d.m309m();
        ArrayList u = c0174d.mo55u();
        int size = u.size();
        for (int i = 0; i < size; i++) {
            this.f662e.add(new C0179a((C0171c) u.get(i)));
        }
    }

    public final void m333a(C0174d c0174d) {
        c0174d.m288b(this.f658a);
        c0174d.m291c(this.f659b);
        c0174d.m293d(this.f660c);
        c0174d.m296e(this.f661d);
        int size = this.f662e.size();
        for (int i = 0; i < size; i++) {
            C0179a c0179a = (C0179a) this.f662e.get(i);
            c0174d.mo51a(c0179a.f653a.f582c).m273a(c0179a.f654b, c0179a.f655c, -1, c0179a.f656d, c0179a.f657e, false);
        }
    }
}
