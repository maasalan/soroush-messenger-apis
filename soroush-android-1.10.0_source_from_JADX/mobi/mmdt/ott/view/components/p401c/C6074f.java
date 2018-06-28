package mobi.mmdt.ott.view.components.p401c;

import android.content.Context;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import java.util.ArrayList;
import java.util.List;

public abstract class C6074f extends Adapter<C6073e> {
    protected LayoutInflater f16246b;
    protected List<C6829g> f16247c = new ArrayList();

    public C6074f(Context context) {
        this.f16246b = LayoutInflater.from(context);
    }

    public final C6829g m13671a(int i) {
        return (C6829g) this.f16247c.get(i);
    }

    public final void m13672a() {
        this.f16247c.clear();
        notifyDataSetChanged();
    }

    public final void m13673a(List<C6829g> list) {
        this.f16247c.clear();
        this.f16247c.addAll(list);
        notifyDataSetChanged();
    }

    public void mo3181a(C6073e c6073e, int i) {
        c6073e.m13670b((C6829g) this.f16247c.get(i));
    }

    public final void m13675a(C6829g c6829g, int i) {
        this.f16247c.add(i, c6829g);
        notifyItemInserted(i);
    }

    public final void m13676b(int i) {
        this.f16247c.remove(i);
        notifyItemRemoved(i);
    }

    public int getItemCount() {
        return this.f16247c.size();
    }

    public int getItemViewType(int i) {
        return ((C6829g) this.f16247c.get(i)).f19503j;
    }

    public /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        mo3181a((C6073e) viewHolder, i);
    }
}
