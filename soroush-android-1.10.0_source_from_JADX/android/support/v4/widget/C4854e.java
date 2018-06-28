package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0619f.C0618a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class C4854e extends BaseAdapter implements C0618a, Filterable {
    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    protected boolean mAutoRequery;
    protected C0616a mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected C0619f mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    private class C0616a extends ContentObserver {
        final /* synthetic */ C4854e f2044a;

        C0616a(C4854e c4854e) {
            this.f2044a = c4854e;
            super(new Handler());
        }

        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            this.f2044a.onContentChanged();
        }
    }

    private class C0617b extends DataSetObserver {
        final /* synthetic */ C4854e f2045a;

        C0617b(C4854e c4854e) {
            this.f2045a = c4854e;
        }

        public final void onChanged() {
            this.f2045a.mDataValid = true;
            this.f2045a.notifyDataSetChanged();
        }

        public final void onInvalidated() {
            this.f2045a.mDataValid = false;
            this.f2045a.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public C4854e(Context context, Cursor cursor) {
        init(context, cursor, 1);
    }

    public C4854e(Context context, Cursor cursor, int i) {
        init(context, cursor, i);
    }

    public C4854e(Context context, Cursor cursor, boolean z) {
        init(context, cursor, z ? 1 : 2);
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public void changeCursor(Cursor cursor) {
        cursor = swapCursor(cursor);
        if (cursor != null) {
            cursor.close();
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        return (!this.mDataValid || this.mCursor == null) ? 0 : this.mCursor.getCount();
    }

    public Cursor getCursor() {
        return this.mCursor;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            return null;
        }
        this.mCursor.moveToPosition(i);
        if (view == null) {
            view = newDropDownView(this.mContext, this.mCursor, viewGroup);
        }
        bindView(view, this.mContext, this.mCursor);
        return view;
    }

    public Filter getFilter() {
        if (this.mCursorFilter == null) {
            this.mCursorFilter = new C0619f(this);
        }
        return this.mCursorFilter;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.mFilterQueryProvider;
    }

    public Object getItem(int i) {
        if (!this.mDataValid || this.mCursor == null) {
            return null;
        }
        this.mCursor.moveToPosition(i);
        return this.mCursor;
    }

    public long getItemId(int i) {
        return (this.mDataValid && this.mCursor != null && this.mCursor.moveToPosition(i)) ? this.mCursor.getLong(this.mRowIDColumn) : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.mCursor.moveToPosition(i)) {
            if (view == null) {
                view = newView(this.mContext, this.mCursor, viewGroup);
            }
            bindView(view, this.mContext, this.mCursor);
            return view;
        } else {
            StringBuilder stringBuilder = new StringBuilder("couldn't move cursor to position ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    void init(Context context, Cursor cursor, int i) {
        DataSetObserver c0617b;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.mAutoRequery = true;
        } else {
            this.mAutoRequery = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.mCursor = cursor;
        this.mDataValid = z;
        this.mContext = context;
        this.mRowIDColumn = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.mChangeObserver = new C0616a(this);
            c0617b = new C0617b(this);
        } else {
            c0617b = null;
            this.mChangeObserver = null;
        }
        this.mDataSetObserver = c0617b;
        if (z) {
            if (this.mChangeObserver != null) {
                cursor.registerContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor.registerDataSetObserver(this.mDataSetObserver);
            }
        }
    }

    @Deprecated
    protected void init(Context context, Cursor cursor, boolean z) {
        init(context, cursor, z ? 1 : 2);
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void onContentChanged() {
        if (this.mAutoRequery && this.mCursor != null && !this.mCursor.isClosed()) {
            this.mDataValid = this.mCursor.requery();
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        return this.mFilterQueryProvider != null ? this.mFilterQueryProvider.runQuery(charSequence) : this.mCursor;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.mFilterQueryProvider = filterQueryProvider;
    }

    public Cursor swapCursor(Cursor cursor) {
        if (cursor == this.mCursor) {
            return null;
        }
        Cursor cursor2 = this.mCursor;
        if (cursor2 != null) {
            if (this.mChangeObserver != null) {
                cursor2.unregisterContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor2.unregisterDataSetObserver(this.mDataSetObserver);
            }
        }
        this.mCursor = cursor;
        if (cursor != null) {
            if (this.mChangeObserver != null) {
                cursor.registerContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor.registerDataSetObserver(this.mDataSetObserver);
            }
            this.mRowIDColumn = cursor.getColumnIndexOrThrow("_id");
            this.mDataValid = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.mRowIDColumn = -1;
        this.mDataValid = false;
        notifyDataSetInvalidated();
        return cursor2;
    }
}
