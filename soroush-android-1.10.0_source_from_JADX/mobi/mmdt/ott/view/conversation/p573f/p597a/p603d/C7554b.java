package mobi.mmdt.ott.view.conversation.p573f.p597a.p603d;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.conversation.p427c.p428a.C3443a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;

public abstract class C7554b extends C7358a {
    private String f23083P;
    private String f23084Q;
    private int f23085R;
    public long ac;
    public int ad;
    public int ae;
    public C3004f af;

    public C7554b(int i, C3443a c3443a) {
        super(i, c3443a, C2973m.CHANNEL);
        this.f23083P = c3443a.f10528T;
        this.f23084Q = c3443a.f10529U;
        this.ac = c3443a.f10515G;
        this.f23085R = c3443a.f10522N;
        this.ad = c3443a.f10521M;
        this.af = c3443a.ah;
        this.ae = c3443a.f10520L;
    }

    public final long mo3604b() {
        return this.ac;
    }

    public final C3004f mo3605g() {
        return this.af;
    }
}
