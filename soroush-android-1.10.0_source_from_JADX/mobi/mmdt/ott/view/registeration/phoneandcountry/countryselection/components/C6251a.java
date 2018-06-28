package mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.C6253d.C6947a;
import mobi.mmdt.ott.view.registeration.phoneandcountry.countryselection.components.LayoutManager.C6250b.C4330a;

public final class C6251a extends Adapter<C6252c> {
    public int f16999a = 8;
    public boolean f17000b;
    private List<C4334a> f17001c;
    private final Context f17002d;
    private RecyclerView f17003e;

    public static class C4334a {
        public int f12163a;
        public int f12164b;
        public int f12165c;
        public boolean f12166d;
        public String f12167e;
        public String f12168f;

        public C4334a(String str, String str2, boolean z, int i, int i2, int i3) {
            this.f12166d = z;
            this.f12167e = str;
            this.f12168f = str2;
            this.f12163a = i;
            this.f12164b = i2;
            this.f12165c = i3;
        }
    }

    public C6251a(Context context, RecyclerView recyclerView) {
        this.f17002d = context;
        this.f17003e = recyclerView;
    }

    public final C4334a m14557a(int i) {
        return (C4334a) this.f17001c.get(i);
    }

    public final void m14558a() {
        for (int i = 0; i < this.f17001c.size(); i++) {
            if (((C4334a) this.f17001c.get(i)).f12166d) {
                notifyItemChanged(i);
            }
        }
    }

    public final void m14559a(List<C4334a> list) {
        this.f17001c = new ArrayList(list);
        notifyDataSetChanged();
        if (this.f17003e.getVerticalScrollbarPosition() != 0) {
            this.f17003e.scrollToPosition(0);
        }
    }

    public final int getItemCount() {
        return this.f17001c.size();
    }

    public final int getItemViewType(int i) {
        return ((C4334a) this.f17001c.get(i)).f12166d ? 1 : 0;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        C6252c c6252c = (C6252c) viewHolder;
        C4334a c4334a = (C4334a) this.f17001c.get(i);
        View view = c6252c.itemView;
        CharSequence charSequence = c4334a.f12167e;
        CharSequence charSequence2 = c4334a.f12168f;
        c6252c.f17004a.setText(charSequence);
        c6252c.f17005b.setText(charSequence2);
        LayoutParams a = C6947a.m17984a(view.getLayoutParams());
        if (c4334a.f12166d) {
            int i2;
            a.d = this.f16999a;
            if (!a.m14535c()) {
                if (!this.f17000b || a.m14536d()) {
                    i2 = -2;
                    a.width = i2;
                    a.h = this.f17000b ^ 1;
                    a.g = this.f17000b ^ 1;
                }
            }
            i2 = -1;
            a.width = i2;
            a.h = this.f17000b ^ 1;
            a.g = this.f17000b ^ 1;
        }
        a.f16990j = c4334a.f12163a == 0 ? C6254f.f17012a : C6253d.f17006a;
        i = c4334a.f12164b;
        if (i < 0) {
            throw new C4330a(a);
        }
        a.f16991k = i;
        view.setLayoutParams(a);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        if (i == 1) {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.list_item_country_header;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = R.layout.list_item_country_item;
        }
        return new C6252c(from.inflate(i2, viewGroup, false));
    }
}
