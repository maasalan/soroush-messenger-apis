package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import mobi.mmdt.ott.p561a.C7164h;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4221c;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.C7371d;

public final class C6935b extends C6071a {
    private C4221c f19818c;
    private C7164h f19819d = ((C7164h) this.f16237a);

    public C6935b(Activity activity, int i, ViewGroup viewGroup, C4224d c4224d) {
        super(C7164h.m18933a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19818c = new C4221c(activity, c4224d);
        FrameLayout frameLayout = this.f19819d.f20583e;
        frameLayout.removeAllViews();
        frameLayout.addView(this.f19818c.f11985a);
    }

    protected final void mo3188b() {
    }

    protected final void mo3189b(C6829g c6829g) {
        C7371d c7371d = (C7371d) c6829g;
        this.f19819d.m18935a(c7371d);
        this.f19818c.f11986b.m13665a(c7371d.f21446a);
    }
}
