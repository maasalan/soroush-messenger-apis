package mobi.mmdt.ott.view.components.p401c;

import android.app.Activity;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

public abstract class C6072d extends Adapter<C6071a> {
    protected List<C6829g> f16241a = new ArrayList();
    protected Activity f16242b;
    private LayoutInflater f16243c;

    public C6072d(Activity activity) {
        this.f16243c = LayoutInflater.from(activity);
        this.f16242b = activity;
    }

    public final C6829g m13664a(int i) {
        return (C6829g) this.f16241a.get(i);
    }

    public final void m13665a(List<C6829g> list) {
        this.f16241a.clear();
        this.f16241a.addAll(list);
        notifyDataSetChanged();
    }

    public void mo3247a(C6071a c6071a, int i) {
        c6071a.m13661a((C6829g) this.f16241a.get(i));
    }

    public int getItemCount() {
        return this.f16241a.size();
    }

    public int getItemViewType(int i) {
        return ((C6829g) this.f16241a.get(i)).f19503j;
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        mo3247a((C6071a) viewHolder, i);
    }
}
