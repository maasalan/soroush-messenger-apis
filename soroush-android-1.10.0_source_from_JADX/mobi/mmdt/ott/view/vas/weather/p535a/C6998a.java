package mobi.mmdt.ott.view.vas.weather.p535a;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.vas.weather.p537c.C6999a;

public final class C6998a extends C6074f {
    private Fragment f20002a;

    public C6998a(Context context, Fragment fragment) {
        super(context);
        this.f20002a = fragment;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i != 13001 ? null : new C6999a(this.f16246b, viewGroup, (C3126i) this.f20002a);
    }
}
