package mobi.mmdt.ott.view.components.p401c;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class C6827b extends C6076k<C6073e> {
    protected LayoutInflater f19501b;

    public C6827b(Context context) {
        super(context);
        this.f19501b = LayoutInflater.from(context);
    }

    public abstract C6073e mo3449a(ViewGroup viewGroup, int i);

    public abstract C6829g mo3450a(Cursor cursor, int i);

    public final /* synthetic */ void mo3182a(ViewHolder viewHolder, Cursor cursor, int i) {
        C6073e c6073e = (C6073e) viewHolder;
        C6829g a = mo3450a(cursor, i);
        if (c6073e != null && a != null) {
            c6073e.m13670b(a);
        }
    }

    public final C6829g m17257b(int i) {
        return mo3450a((Cursor) m13685c(i), i);
    }

    public int getItemCount() {
        return mo2237a() != null ? mo2237a().getCount() : 0;
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3449a(viewGroup, i);
    }
}
