package mobi.mmdt.ott.view.newdesign.mainpage.p466b;

import android.support.v4.view.ViewPager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.main.C6232c;
import mobi.mmdt.ott.view.main.explorechannelslist.C6927b;
import mobi.mmdt.ott.view.main.p452b.C6918b;
import mobi.mmdt.ott.view.main.p454c.C6922a;
import mobi.mmdt.ott.view.newdesign.mainpage.p470e.C4278c;

public final class C4257a {
    public C6918b f12028a;
    public C6927b f12029b = new C6927b();
    public int f12030c = 1;
    private C6922a f12031d;
    private C6922a f12032e;
    private C6922a f12033f;
    private C6922a f12034g;

    public C4257a() {
        if (C2535a.m6888a().ag().booleanValue()) {
            this.f12031d = C6922a.m17913d();
            this.f12030c++;
        }
        if (C2535a.m6888a().ah().booleanValue()) {
            this.f12028a = C6918b.m17866a(true, false);
            this.f12030c++;
        }
        if (C2535a.m6888a().af().booleanValue()) {
            this.f12032e = C6922a.m17893a(44, C2978e.SINGLE);
            this.f12030c++;
        }
        if (C2535a.m6888a().ad().booleanValue()) {
            this.f12033f = C6922a.m17893a(46, C2978e.GROUP);
            this.f12030c++;
        }
        if (C2535a.m6888a().ae().booleanValue()) {
            this.f12034g = C6922a.m17893a(48, C2978e.CHANNEL);
            this.f12030c++;
        }
    }

    public final C6232c m8063a(int i) {
        switch (C4278c.m8079b(i)) {
            case MERGE:
                return this.f12031d;
            case SINGLE:
                return this.f12032e;
            case GROUP:
                return this.f12033f;
            case CHANNEL:
                return this.f12034g;
            case CONTACT:
                return this.f12028a;
            case EXPLORE:
                return this.f12029b;
            default:
                return null;
        }
    }

    public final boolean m8064a(ViewPager viewPager) {
        return (this.f12029b == null || viewPager == null || viewPager.getCurrentItem() != this.f12030c - 1) ? false : true;
    }
}
