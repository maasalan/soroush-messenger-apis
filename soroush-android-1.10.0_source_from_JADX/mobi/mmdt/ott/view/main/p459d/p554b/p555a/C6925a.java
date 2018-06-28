package mobi.mmdt.ott.view.main.p459d.p554b.p555a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p561a.C7165i;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.p459d.C4186a;
import mobi.mmdt.ott.view.main.p459d.p554b.p579b.C7369b;

public final class C6925a extends C6071a {
    private C4186a f19788c;
    private C7165i f19789d;

    public C6925a(Activity activity, int i, ViewGroup viewGroup, C4186a c4186a) {
        super(C7165i.m18939a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19788c = c4186a;
    }

    protected final void mo3188b() {
        this.f19789d = (C7165i) this.f16237a;
        if (this.f19789d != null) {
            C2491i.m6802a(this.f19789d.f20591f, UIThemeManager.getmInstance().getText_primary_color());
        }
    }

    protected final void mo3189b(C6829g c6829g) {
        this.f19789d.m18943a((C7369b) c6829g);
        this.f19789d.m18942a(this.f19788c);
    }
}
