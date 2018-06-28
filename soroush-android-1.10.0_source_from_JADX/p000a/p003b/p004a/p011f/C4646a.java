package p000a.p003b.p004a.p011f;

import p000a.p003b.p004a.C0025b;
import p000a.p003b.p004a.C0041d;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.p005a.C0020b;
import p000a.p003b.p004a.p005a.C4626a;
import p000a.p003b.p004a.p007c.C6317a;
import p000a.p003b.p004a.p013h.C4653c.C0058a;
import p000a.p003b.p004a.p014i.C0061g;

public final class C4646a extends C0047c {
    public static final C4646a f12766a = new C4646a();
    private final C6317a f12767c;
    private final C6317a f12768d;
    private final C6317a f12769e;

    class C46451 implements C0020b {
        C46451() {
        }

        public final C0025b mo13a() {
            return new C4626a((byte) 0);
        }
    }

    public C4646a() {
        this(new C46451());
    }

    private C4646a(C0020b c0020b) {
        this(new C6317a(c0020b.mo13a()), c0020b);
    }

    private C4646a(C6317a c6317a, C0020b c0020b) {
        super(c6317a);
        this.f12767c = c6317a;
        this.f12768d = new C6317a(c0020b.mo13a());
        this.f12768d.m8475a(C0058a.f254c);
        this.f12769e = new C6317a(c0020b.mo13a());
        this.f12769e.m8475a(C0058a.f253b);
    }

    public final <D extends C0061g> C0048d<D> mo14a(C0065j c0065j) {
        C0041d c = this.f12767c.mo2471c(c0065j);
        return new C0048d(c0065j, c, c.f12738r);
    }
}
