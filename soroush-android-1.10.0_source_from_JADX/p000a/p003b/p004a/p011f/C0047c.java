package p000a.p003b.p004a.p011f;

import p000a.p003b.p004a.C0021a;
import p000a.p003b.p004a.C0044e;
import p000a.p003b.p004a.C0065j;
import p000a.p003b.p004a.C0076k.C0070b;
import p000a.p003b.p004a.p013h.C4653c;
import p000a.p003b.p004a.p014i.C0061g;

public class C0047c {
    public static final C0047c f215b = new C0047c(new C4653c());
    private final C0021a f216a;

    public C0047c(C0021a c0021a) {
        this.f216a = c0021a;
    }

    public <D extends C0061g> C0048d<D> mo14a(C0065j c0065j) {
        return new C0048d(c0065j, this.f216a.mo2469a(c0065j), null);
    }

    public final <D extends C0061g> C0048d<D> m88a(String str, Class<D> cls) {
        return mo14a(new C0065j(C0044e.m73a(str), C0070b.m114a((Class) cls)));
    }
}
