package mobi.mmdt.ott.view.vas.weather.p535a;

import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.bot.api.p342a.C2780b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.vas.weather.C7238a;

public final class C6290b extends Adapter<C6289a> {
    private ArrayList<C2780b> f17201a;
    private C7238a f17202b;

    class C6289a extends ViewHolder {
        RelativeLayout f17198a;
        TextView f17199b;
        final /* synthetic */ C6290b f17200c;

        public C6289a(C6290b c6290b, View view) {
            this.f17200c = c6290b;
            super(view);
            this.f17199b = (TextView) view.findViewById(R.id.city_title);
            this.f17198a = (RelativeLayout) view.findViewById(R.id.city_title_view);
        }
    }

    public C6290b(ArrayList<C2780b> arrayList, C7238a c7238a) {
        this.f17201a = arrayList;
        this.f17202b = c7238a;
    }

    public final int getItemCount() {
        return this.f17201a.size();
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        C6289a c6289a = (C6289a) viewHolder;
        if (i < this.f17201a.size()) {
            TextView textView;
            String str;
            Object[] objArr;
            if (C2535a.m6888a().m6919b().equals("fa")) {
                textView = c6289a.f17199b;
                str = "%s - %s - %s";
                objArr = new Object[]{"ایران", ((C2780b) this.f17201a.get(i)).f8791c, ((C2780b) this.f17201a.get(i)).f8789a};
            } else {
                textView = c6289a.f17199b;
                str = "%s - %s - %s";
                objArr = new Object[]{"Iran", ((C2780b) this.f17201a.get(i)).f8792d, ((C2780b) this.f17201a.get(i)).f8790b};
            }
            textView.setText(String.format(str, objArr));
            c6289a.f17198a.setTag(this.f17201a.get(i));
            c6289a.f17198a.setOnClickListener(this.f17202b);
        }
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6289a(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_item_city, viewGroup, false));
    }
}
