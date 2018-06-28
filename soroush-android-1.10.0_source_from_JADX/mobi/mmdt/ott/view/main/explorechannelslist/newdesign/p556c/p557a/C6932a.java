package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.p557a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p561a.C7162f;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7217a;

public final class C6932a extends C6071a {
    private final C4224d f19811c;
    private C7162f f19812d;

    public C6932a(Activity activity, int i, ViewGroup viewGroup, C4224d c4224d) {
        super(C7162f.m18917a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19811c = c4224d;
    }

    protected final void mo3188b() {
        this.f19812d = (C7162f) this.f16237a;
        if (this.f19812d != null) {
            C2491i.m6802a(this.f19812d.f20561h, UIThemeManager.getmInstance().getText_primary_color());
            C2491i.m6802a(this.f19812d.f20557d, UIThemeManager.getmInstance().getText_secondary_color());
        }
    }

    protected final void mo3189b(C6829g c6829g) {
        C7217a c7217a = (C7217a) c6829g;
        this.f19812d.m18920a(c7217a);
        this.f19812d.m18921a(this.f19811c);
        C2491i.m6790a(this.f19812d.f20558e.getBackground(), c7217a.f20834a ? UIThemeManager.getmInstance().getExplore_channel_followed_button_color() : UIThemeManager.getmInstance().getAccent_color());
    }
}
