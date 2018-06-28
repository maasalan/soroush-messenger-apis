package mobi.mmdt.ott.view.components.recyclerviewpager;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.AdapterDataObserver;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

public final class C6117a<VH extends ViewHolder> extends Adapter<VH> {
    Adapter<VH> f16423a;
    private final RecyclerViewPager f16424b;

    public C6117a(RecyclerViewPager recyclerViewPager, Adapter<VH> adapter) {
        this.f16423a = adapter;
        this.f16424b = recyclerViewPager;
        setHasStableIds(this.f16423a.hasStableIds());
    }

    public final int getItemCount() {
        return this.f16423a.getItemCount();
    }

    public final long getItemId(int i) {
        return this.f16423a.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return this.f16423a.getItemViewType(i);
    }

    public final void onBindViewHolder(VH vh, int i) {
        this.f16423a.onBindViewHolder(vh, i);
        View view = vh.itemView;
        LayoutParams layoutParams = view.getLayoutParams() == null ? new LayoutParams(-1, -1) : view.getLayoutParams();
        if (this.f16424b.getLayoutManager().canScrollHorizontally()) {
            layoutParams.width = (this.f16424b.getWidth() - this.f16424b.getPaddingLeft()) - this.f16424b.getPaddingRight();
        } else {
            layoutParams.height = (this.f16424b.getHeight() - this.f16424b.getPaddingTop()) - this.f16424b.getPaddingBottom();
        }
        view.setLayoutParams(layoutParams);
    }

    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f16423a.onCreateViewHolder(viewGroup, i);
    }

    public final void registerAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f16423a.registerAdapterDataObserver(adapterDataObserver);
    }

    public final void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f16423a.setHasStableIds(z);
    }

    public final void unregisterAdapterDataObserver(AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f16423a.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
