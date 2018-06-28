package mobi.mmdt.ott.view.conversation.p573f.p597a.p605f;

import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.conversation.p427c.p428a.C3443a;
import mobi.mmdt.ott.view.conversation.p573f.p597a.C7358a;

public abstract class C7556b extends C7358a {
    private String f23092P;
    private String f23093Q;
    private int f23094R;
    public long f23095W;
    public int f23096X;
    public int f23097Y;
    public C3004f f23098Z;

    public C7556b(int i, C3443a c3443a) {
        super(i, c3443a, C2973m.CHANNEL_REPLY);
        this.f23092P = c3443a.f10528T;
        this.f23093Q = c3443a.f10529U;
        this.f23095W = c3443a.f10515G;
        this.f23094R = c3443a.f10522N;
        this.f23096X = c3443a.f10521M;
        this.f23097Y = c3443a.f10520L;
        this.f23098Z = c3443a.ah;
    }

    public final long mo3604b() {
        return this.f23095W;
    }

    public final C3004f mo3605g() {
        return this.f23098Z;
    }
}
