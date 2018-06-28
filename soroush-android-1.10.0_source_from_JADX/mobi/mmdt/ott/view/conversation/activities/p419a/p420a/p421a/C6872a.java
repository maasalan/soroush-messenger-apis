package mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p421a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p561a.C7161e;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.C3315b;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C7340a;

public final class C6872a extends C6071a {
    private C3315b f19605c;
    private C7161e f19606d;

    public C6872a(Activity activity, int i, ViewGroup viewGroup, final C3315b c3315b) {
        super(C7161e.m18911a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19605c = c3315b;
        this.f19606d.f20549e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ C6872a f10157b;

            public final void onClick(View view) {
                c3315b.mo3664a(this.f10157b.f16238b);
            }
        });
    }

    protected final void mo3188b() {
        this.f19606d = (C7161e) this.f16237a;
        if (this.f19606d != null) {
            C2491i.m6802a(this.f19606d.f20550f, UIThemeManager.getmInstance().getText_primary_color());
            C2491i.m6790a(this.f19606d.f20551g.getBackground(), UIThemeManager.getmInstance().getAccent_color());
        }
    }

    protected final void mo3189b(C6829g c6829g) {
        C7340a c7340a = (C7340a) c6829g;
        this.f19606d.m18913a(c7340a);
        this.f19606d.f20552h = this.f19605c;
        this.f19606d.m14843b();
        this.f19606d.f20551g.setVisibility(c7340a.f21205w ? 0 : 8);
    }
}
