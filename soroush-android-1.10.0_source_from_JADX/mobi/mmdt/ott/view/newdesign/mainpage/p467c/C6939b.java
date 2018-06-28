package mobi.mmdt.ott.view.newdesign.mainpage.p467c;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.newdesign.mainpage.p467c.p468a.C6938a;

public final class C6939b extends C6074f {
    private C3126i f19827a;

    public C6939b(Context context, C3126i c3126i) {
        super(context);
        this.f19827a = c3126i;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i > 100 ? new C6938a(this.f19827a, this.f16246b, viewGroup) : null;
    }
}
