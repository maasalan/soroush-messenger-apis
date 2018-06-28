package mobi.mmdt.ott.view.components.p401c;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import mobi.mmdt.ott.view.components.p401c.C3125h.C3124a;

public abstract class C6076k<VH extends ViewHolder> extends Adapter<VH> implements Filterable, C3124a {
    protected boolean f16250c = false;
    protected boolean f16251d = false;
    protected Cursor f16252e = null;
    protected Context f16253f;
    protected int f16254g;
    protected C3129a f16255h;
    protected DataSetObserver f16256i;
    protected C3125h f16257j;
    protected FilterQueryProvider f16258k;

    private class C3129a extends ContentObserver {
        final /* synthetic */ C6076k f9710a;

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            this.f9710a.m13686c();
        }
    }

    public C6076k(Context context) {
        this.f16253f = context;
        this.f16254g = -1;
        this.f16255h = null;
        this.f16256i = null;
    }

    public final Cursor mo2237a() {
        return this.f16252e;
    }

    public final Cursor mo2238a(CharSequence charSequence) {
        return this.f16258k != null ? this.f16258k.runQuery(charSequence) : this.f16252e;
    }

    public final CharSequence mo2239a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void mo3182a(VH vh, Cursor cursor, int i);

    public final int m13682b() {
        return (!this.f16250c || this.f16252e == null) ? 0 : this.f16252e.getCount();
    }

    public final void mo2240b(Cursor cursor) {
        cursor = m13684c(cursor);
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public final Cursor m13684c(Cursor cursor) {
        if (cursor == this.f16252e) {
            return null;
        }
        boolean z;
        Cursor cursor2 = this.f16252e;
        if (cursor2 != null) {
            if (this.f16255h != null) {
                cursor2.unregisterContentObserver(this.f16255h);
            }
            if (this.f16256i != null) {
                cursor2.unregisterDataSetObserver(this.f16256i);
            }
        }
        this.f16252e = cursor;
        if (cursor != null) {
            if (this.f16255h != null) {
                cursor.registerContentObserver(this.f16255h);
            }
            if (this.f16256i != null) {
                cursor.registerDataSetObserver(this.f16256i);
            }
            this.f16254g = cursor.getColumnIndexOrThrow("_id");
            z = true;
        } else {
            this.f16254g = -1;
            z = false;
        }
        this.f16250c = z;
        notifyDataSetChanged();
        return cursor2;
    }

    public final Object m13685c(int i) {
        if (!this.f16250c || this.f16252e == null) {
            return null;
        }
        this.f16252e.moveToPosition(i);
        return this.f16252e;
    }

    protected final void m13686c() {
        if (this.f16251d && this.f16252e != null && !this.f16252e.isClosed()) {
            this.f16250c = this.f16252e.requery();
        }
    }

    public Filter getFilter() {
        if (this.f16257j == null) {
            this.f16257j = new C3125h(this);
        }
        return this.f16257j;
    }

    public int getItemCount() {
        return this.f16252e != null ? this.f16252e.getCount() : 0;
    }

    public long getItemId(int i) {
        return (this.f16250c && this.f16252e != null && this.f16252e.moveToPosition(i)) ? this.f16252e.getLong(this.f16254g) : 0;
    }

    public void onBindViewHolder(VH vh, int i) {
        if (!this.f16250c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f16252e.moveToPosition(i)) {
            mo3182a(vh, this.f16252e, i);
        } else {
            StringBuilder stringBuilder = new StringBuilder("couldn't move cursor to position ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void setHasStableIds(boolean z) {
        super.setHasStableIds(true);
    }
}
