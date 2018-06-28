package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.p557a;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.ott.p561a.C7159c;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p464d.p580a.C7218b;

public final class C6933b extends C6071a {
    private C4224d f19813c;
    private C7159c f19814d = ((C7159c) this.f16237a);

    public C6933b(Activity activity, int i, ViewGroup viewGroup, C4224d c4224d) {
        super(C7159c.m18893a(LayoutInflater.from(activity), viewGroup), i, null);
        this.f19813c = c4224d;
        LayoutParams layoutParams = this.itemView.getLayoutParams();
        i = C2489g.m6754a().m6755a(0.75f);
        layoutParams.width = i;
        layoutParams.height = (int) (((float) i) * 0.5f);
    }

    protected final void mo3188b() {
    }

    protected final void mo3189b(C6829g c6829g) {
        this.f19814d.m18896a((C7218b) c6829g);
        this.f19814d.m18897a(this.f19813c);
    }
}
