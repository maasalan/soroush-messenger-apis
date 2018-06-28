package mobi.mmdt.ott.logic.p261a.p284f.p286b;

import com.p072b.p073a.p074a.C1073q;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.base.MessageLike.LikeStatus;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.send.C5860a;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p284f.p285a.C5924s;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2968f;
import mobi.mmdt.ott.provider.p384f.C6019d;
import mobi.mmdt.ott.provider.p384f.C6021g;
import p000a.p001a.p002a.C0005c;

public final class C6710u extends C5891a {
    private String f19093a;
    private boolean f19094b;
    private int f19095c;

    public C6710u(String str, int i, boolean z) {
        super(C2683h.f8620b);
        this.f19093a = str;
        this.f19094b = z;
        this.f19095c = i;
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C6021g c6021g;
        MyApplication.m12950a().m12960c("like");
        C2968f a = C2966b.m7400a(this.f19093a);
        if (!(a == null || a.f9222r == null)) {
            this.f19093a = a.f9222r;
        }
        MessageLike messageLike = new MessageLike(this.f19093a, this.f19094b);
        new C5860a(C2535a.m6888a().m6928d(), new MessageLike[]{messageLike}).m13065a(MyApplication.m12952b());
        String str = this.f19093a;
        int i = this.f19095c;
        LikeStatus likeStatus = this.f19094b ? LikeStatus.LIKE : LikeStatus.UNLIKE;
        C6019d c6019d = new C6019d();
        c6019d.m13338a(likeStatus);
        if (likeStatus == LikeStatus.LIKE) {
            i++;
        } else {
            if (i > 0 && likeStatus == LikeStatus.UNLIKE) {
                i--;
            }
            c6021g = new C6021g();
            ((C6021g) c6021g.m13378a(str).m7369d()).m13391d(str);
            c6019d.m13332a(c6021g);
        }
        c6019d.m13334a(i);
        c6021g = new C6021g();
        ((C6021g) c6021g.m13378a(str).m7369d()).m13391d(str);
        c6019d.m13332a(c6021g);
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        C0005c.m0a().m9d(new C5924s(th));
        return C1073q.f3504b;
    }
}
