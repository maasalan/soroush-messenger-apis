package mobi.mmdt.ott.view.components.p401c;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class C6828c extends C6076k<C6071a> {
    private LayoutInflater f19502a;

    public C6828c(Context context) {
        super(context);
        this.f19502a = LayoutInflater.from(context);
    }

    public abstract C6071a mo3463a(ViewGroup viewGroup, int i);

    public final C6829g m17259a(int i) {
        return mo3464a((Cursor) m13685c(i), i);
    }

    protected abstract C6829g mo3464a(Cursor cursor, int i);

    public final /* bridge */ /* synthetic */ void mo3182a(ViewHolder viewHolder, Cursor cursor, int i) {
        C6071a c6071a = (C6071a) viewHolder;
        C6829g a = mo3464a(cursor, i);
        if (c6071a != null && a != null) {
            c6071a.m13661a(a);
        }
    }

    public int getItemCount() {
        return mo2237a() != null ? mo2237a().getCount() : 0;
    }

    public /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3463a(viewGroup, i);
    }
}
