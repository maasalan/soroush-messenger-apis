package com.p111d.p112a.p114b.p120g;

import com.p111d.p112a.p114b.C1381o;
import com.p111d.p112a.p114b.C1382p;
import com.p111d.p112a.p114b.C5301g;
import com.p111d.p112a.p114b.p116c.C5293j;
import java.io.Serializable;

public final class C5300d implements C1371e<C5300d>, C1381o, Serializable {
    public static final C5293j f14700a = new C5293j(" ");
    protected C1370b f14701b;
    protected C1370b f14702c;
    protected final C1382p f14703d;
    protected boolean f14704e;
    protected transient int f14705f;

    public interface C1370b {
        void mo1283a(C5301g c5301g, int i);

        boolean mo1284a();
    }

    public static class C5299c implements C1370b, Serializable {
        public static final C5299c f14699c = new C5299c();

        public void mo1283a(C5301g c5301g, int i) {
        }

        public boolean mo1284a() {
            return true;
        }
    }

    public static class C6467a extends C5299c {
        public static final C6467a f17630a = new C6467a();

        public final void mo1283a(C5301g c5301g, int i) {
            c5301g.writeRaw(' ');
        }

        public final boolean mo1284a() {
            return true;
        }
    }

    public C5300d() {
        this(f14700a);
    }

    private C5300d(C5300d c5300d) {
        this(c5300d, c5300d.f14703d);
    }

    private C5300d(C5300d c5300d, C1382p c1382p) {
        this.f14701b = C6467a.f17630a;
        this.f14702c = C6466c.f17626b;
        this.f14704e = true;
        this.f14701b = c5300d.f14701b;
        this.f14702c = c5300d.f14702c;
        this.f14704e = c5300d.f14704e;
        this.f14705f = c5300d.f14705f;
        this.f14703d = c1382p;
    }

    private C5300d(C1382p c1382p) {
        this.f14701b = C6467a.f17630a;
        this.f14702c = C6466c.f17626b;
        this.f14704e = true;
        this.f14703d = c1382p;
    }

    public final /* synthetic */ Object mo1285a() {
        return new C5300d(this);
    }

    public final void mo1286a(C5301g c5301g) {
        if (this.f14703d != null) {
            c5301g.writeRaw(this.f14703d);
        }
    }

    public final void mo1287a(C5301g c5301g, int i) {
        if (!this.f14702c.mo1284a()) {
            this.f14705f--;
        }
        if (i > 0) {
            this.f14702c.mo1283a(c5301g, this.f14705f);
        } else {
            c5301g.writeRaw(' ');
        }
        c5301g.writeRaw('}');
    }

    public final void mo1288b(C5301g c5301g) {
        c5301g.writeRaw('{');
        if (!this.f14702c.mo1284a()) {
            this.f14705f++;
        }
    }

    public final void mo1289b(C5301g c5301g, int i) {
        if (!this.f14701b.mo1284a()) {
            this.f14705f--;
        }
        if (i > 0) {
            this.f14701b.mo1283a(c5301g, this.f14705f);
        } else {
            c5301g.writeRaw(' ');
        }
        c5301g.writeRaw(']');
    }

    public final void mo1290c(C5301g c5301g) {
        c5301g.writeRaw(',');
        this.f14702c.mo1283a(c5301g, this.f14705f);
    }

    public final void mo1291d(C5301g c5301g) {
        if (this.f14704e) {
            c5301g.writeRaw(" : ");
        } else {
            c5301g.writeRaw(':');
        }
    }

    public final void mo1292e(C5301g c5301g) {
        if (!this.f14701b.mo1284a()) {
            this.f14705f++;
        }
        c5301g.writeRaw('[');
    }

    public final void mo1293f(C5301g c5301g) {
        c5301g.writeRaw(',');
        this.f14701b.mo1283a(c5301g, this.f14705f);
    }

    public final void mo1294g(C5301g c5301g) {
        this.f14701b.mo1283a(c5301g, this.f14705f);
    }

    public final void mo1295h(C5301g c5301g) {
        this.f14702c.mo1283a(c5301g, this.f14705f);
    }
}
