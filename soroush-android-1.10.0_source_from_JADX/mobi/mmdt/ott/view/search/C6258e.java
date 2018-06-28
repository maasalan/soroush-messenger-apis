package mobi.mmdt.ott.view.search;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.search.C6949f.C43591;
import mobi.mmdt.ott.view.tools.C4522p;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

final class C6258e extends Adapter<C6949f> {
    private final Context f17043a;
    private Cursor f17044b;
    private int f17045c;
    private final C4349a f17046d;

    public C6258e(Context context, C4349a c4349a) {
        this.f17043a = context;
        this.f17046d = c4349a;
    }

    public final void m14596a(Cursor cursor) {
        int i = 0;
        if (this.f17044b != null) {
            this.f17044b.close();
            this.f17045c = 0;
        }
        this.f17044b = cursor;
        if (cursor != null) {
            i = cursor.getCount();
        }
        this.f17045c = i;
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return this.f17045c;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        C6949f c6949f = (C6949f) viewHolder;
        if (this.f17044b != null) {
            this.f17044b.moveToPosition(i);
            c6949f.mo3259a(this.f17043a, this.f17044b, i == 0 ? C4522p.m8236a(R.string.search_recently) : null);
            c6949f.f17047a.findViewById(R.id.root_frameLayout).setOnLongClickListener(new C43591(c6949f, this.f17046d, i, C4505a.m8203a(this.f17044b, "dialog_party")));
        }
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6949f(LayoutInflater.from(this.f17043a).inflate(R.layout.list_item_activity_search, viewGroup, false));
    }
}
