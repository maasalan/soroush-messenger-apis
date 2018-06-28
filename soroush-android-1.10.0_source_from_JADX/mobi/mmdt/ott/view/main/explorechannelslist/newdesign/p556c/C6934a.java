package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p561a.C7163g;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4221c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7370c;
import mobi.mmdt.ott.view.tools.p480d.C4503a;

public final class C6934a extends C6071a {
    private C4224d f19815c;
    private C4221c f19816d;
    private C7163g f19817e;

    public C6934a(Activity activity, int i, ViewGroup viewGroup, C4224d c4224d) {
        super(C7163g.m18925a(LayoutInflater.from(MyApplication.m12952b()), viewGroup), i, null);
        this.f19815c = c4224d;
        this.f19816d = new C4221c(activity, c4224d);
        FrameLayout frameLayout = this.f19817e.f20570e;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f19816d.f11985a);
    }

    protected final void mo3188b() {
        this.f19817e = (C7163g) this.f16237a;
        if (this.f19817e != null) {
            C2491i.m6802a(this.f19817e.f20574i, UIThemeManager.getmInstance().getText_primary_color());
            C2491i.m6802a(this.f19817e.f20572g, UIThemeManager.getmInstance().getText_primary_color());
            C2491i.m6801a(this.f19817e.f20573h, UIThemeManager.getmInstance().getText_primary_color());
            C4503a.m8196a(false, this.f19817e.f20572g);
            C4503a.m8196a(true, this.f19817e.f20574i);
        }
    }

    protected final void mo3189b(C6829g c6829g) {
        C7370c c7370c = (C7370c) c6829g;
        this.f19817e.m18928a(c7370c);
        this.f19817e.m18929a(this.f19815c);
        this.f19816d.f11986b.m13665a(c7370c.f21443e);
    }
}
