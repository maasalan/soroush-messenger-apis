package mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p462a;

import android.app.Activity;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.ott.view.components.p401c.C6072d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.C4224d;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.p557a.C6932a;
import mobi.mmdt.ott.view.main.explorechannelslist.newdesign.p556c.p557a.C6933b;

public final class C6929b extends C6072d {
    private C4224d f19801c;

    public C6929b(Activity activity, C4224d c4224d) {
        super(activity);
        this.f19801c = c4224d;
    }

    public final int getItemViewType(int i) {
        return m13664a(i).f19503j;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 0 ? i != 2 ? null : new C6933b(this.f16242b, i, viewGroup, this.f19801c) : new C6932a(this.f16242b, i, viewGroup, this.f19801c);
    }
}
