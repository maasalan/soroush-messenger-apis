package p056c.p057a.p060c;

import java.util.List;
import p056c.C0925e;
import p056c.C0932i;
import p056c.C0942p;
import p056c.C0951u;
import p056c.C0951u.C0950a;
import p056c.aa;
import p056c.ac;
import p056c.p057a.p059b.C0873g;
import p056c.p057a.p059b.C4998c;

public final class C5001g implements C0950a {
    public final C0873g f13927a;
    final C0877c f13928b;
    final C4998c f13929c;
    public final aa f13930d;
    final C0925e f13931e;
    final C0942p f13932f;
    private final List<C0951u> f13933g;
    private final int f13934h;
    private final int f13935i;
    private final int f13936j;
    private final int f13937k;
    private int f13938l;

    public C5001g(List<C0951u> list, C0873g c0873g, C0877c c0877c, C4998c c4998c, int i, aa aaVar, C0925e c0925e, C0942p c0942p, int i2, int i3, int i4) {
        this.f13933g = list;
        this.f13929c = c4998c;
        this.f13927a = c0873g;
        this.f13928b = c0877c;
        this.f13934h = i;
        this.f13930d = aaVar;
        this.f13931e = c0925e;
        this.f13932f = c0942p;
        this.f13935i = i2;
        this.f13936j = i3;
        this.f13937k = i4;
    }

    public final aa mo951a() {
        return this.f13930d;
    }

    public final ac mo952a(aa aaVar) {
        return m10101a(aaVar, this.f13927a, this.f13928b, this.f13929c);
    }

    public final ac m10101a(aa aaVar, C0873g c0873g, C0877c c0877c, C4998c c4998c) {
        if (this.f13934h >= this.f13933g.size()) {
            throw new AssertionError();
        }
        r0.f13938l++;
        aa aaVar2;
        if (r0.f13928b != null) {
            aaVar2 = aaVar;
            if (!r0.f13929c.m10094a(aaVar2.f2801a)) {
                StringBuilder stringBuilder = new StringBuilder("network interceptor ");
                stringBuilder.append(r0.f13933g.get(r0.f13934h - 1));
                stringBuilder.append(" must retain the same host and port");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        aaVar2 = aaVar;
        if (r0.f13928b == null || r0.f13938l <= 1) {
            C5001g c5001g = new C5001g(r0.f13933g, c0873g, c0877c, c4998c, r0.f13934h + 1, aaVar2, r0.f13931e, r0.f13932f, r0.f13935i, r0.f13936j, r0.f13937k);
            C0951u c0951u = (C0951u) r0.f13933g.get(r0.f13934h);
            ac a = c0951u.mo947a(c5001g);
            StringBuilder stringBuilder2;
            if (c0877c != null && r0.f13934h + 1 < r0.f13933g.size() && c5001g.f13938l != 1) {
                stringBuilder2 = new StringBuilder("network interceptor ");
                stringBuilder2.append(c0951u);
                stringBuilder2.append(" must call proceed() exactly once");
                throw new IllegalStateException(stringBuilder2.toString());
            } else if (a == null) {
                stringBuilder2 = new StringBuilder("interceptor ");
                stringBuilder2.append(c0951u);
                stringBuilder2.append(" returned null");
                throw new NullPointerException(stringBuilder2.toString());
            } else if (a.f2825g != null) {
                return a;
            } else {
                stringBuilder2 = new StringBuilder("interceptor ");
                stringBuilder2.append(c0951u);
                stringBuilder2.append(" returned a response with no body");
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        stringBuilder = new StringBuilder("network interceptor ");
        stringBuilder.append(r0.f13933g.get(r0.f13934h - 1));
        stringBuilder.append(" must call proceed() exactly once");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final C0932i mo953b() {
        return this.f13929c;
    }

    public final int mo954c() {
        return this.f13935i;
    }

    public final int mo955d() {
        return this.f13936j;
    }

    public final int mo956e() {
        return this.f13937k;
    }
}
