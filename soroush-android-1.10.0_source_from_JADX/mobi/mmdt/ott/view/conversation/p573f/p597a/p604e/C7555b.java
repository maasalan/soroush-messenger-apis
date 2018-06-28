package mobi.mmdt.ott.view.conversation.p573f.p597a.p604e;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.conversation.p427c.p428a.C3443a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;

public abstract class C7555b extends C7358a {
    private String f23086P;
    public String f23087V;
    public long f23088W;
    public int f23089X;
    public int f23090Y;
    public int f23091Z;
    public C3004f aa;
    public C2973m ab;

    public C7555b(int i, C3443a c3443a) {
        super(i, c3443a, C2973m.CHANNEL_REPLY);
        this.f23086P = c3443a.f10528T;
        this.f23087V = c3443a.f10529U;
        this.f23088W = c3443a.f10515G;
        this.f23089X = c3443a.f10522N;
        this.f23090Y = c3443a.f10521M;
        this.aa = c3443a.ah;
        this.ab = C2973m.values()[c3443a.f10518J];
        this.f23091Z = c3443a.f10520L;
    }

    public final long mo3604b() {
        return this.f23088W;
    }

    public final C3004f mo3605g() {
        return this.aa;
    }

    public final C2973m mo3606h() {
        return this.ab;
    }

    public String mo3630j() {
        return this.f23086P;
    }
}
