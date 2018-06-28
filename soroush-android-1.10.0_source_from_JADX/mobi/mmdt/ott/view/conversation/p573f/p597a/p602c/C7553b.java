package mobi.mmdt.ott.view.conversation.p573f.p597a.p602c;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.conversation.p427c.p428a.C3443a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;

public abstract class C7553b extends C7358a {
    private String f23082P;
    public String ab;
    public long ac;
    public int ad;
    public int ae;
    public int af;
    public C3004f ag;
    public C2973m ah;

    public C7553b(int i, C3443a c3443a) {
        super(i, c3443a, C2973m.CHANNEL);
        this.f23082P = c3443a.f10528T;
        this.ab = c3443a.f10529U;
        this.ac = c3443a.f10515G;
        this.ad = c3443a.f10522N;
        this.ae = c3443a.f10521M;
        this.ag = c3443a.ah;
        this.ah = C2973m.values()[c3443a.f10518J];
        this.af = c3443a.f10520L;
    }

    public final long mo3604b() {
        return this.ac;
    }

    public final C3004f mo3605g() {
        return this.ag;
    }

    public final C2973m mo3606h() {
        return this.ah;
    }

    public String mo3626j() {
        return this.f23082P;
    }
}
