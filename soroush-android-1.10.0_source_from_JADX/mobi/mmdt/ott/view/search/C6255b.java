package mobi.mmdt.ott.view.search;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.tools.C4522p;

final class C6255b extends Adapter<C6259h> {
    Cursor f17013a;
    int f17014b;
    Cursor f17015c;
    int f17016d;
    Cursor f17017e;
    int f17018f;
    String f17019g;
    private final Context f17020h;

    C6255b(Context context) {
        this.f17020h = context;
    }

    private void m14578a(C6259h c6259h, Cursor cursor, int i, String str) {
        if (cursor != null) {
            cursor.moveToPosition(i);
            if (cursor != this.f17015c) {
                c6259h.mo3259a(this.f17020h, cursor, str);
                return;
            }
            c6259h.mo3260b(this.f17020h, cursor, str);
        }
    }

    private static void m14579b(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    final void m14580a() {
        this.f17016d = 0;
        this.f17018f = 0;
        this.f17014b = 0;
        C6255b.m14579b(this.f17015c);
        C6255b.m14579b(this.f17013a);
        C6255b.m14579b(this.f17017e);
    }

    public final void m14581a(Cursor cursor) {
        if (this.f17015c != null) {
            this.f17015c.close();
        }
        this.f17015c = cursor;
        if (cursor != null) {
            this.f17016d = cursor.getCount();
        }
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        return (this.f17014b + this.f17018f) + this.f17016d;
    }

    public final int getItemViewType(int i) {
        if (i >= this.f17014b) {
            if (i >= this.f17016d + this.f17014b || this.f17016d == 0) {
                return 1;
            }
        }
        return 0;
    }

    public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
        int i2;
        String str;
        Cursor cursor;
        int i3;
        C6259h c6259h = (C6259h) viewHolder;
        if (i == this.f17014b && this.f17016d > 0) {
            i2 = R.string.search_global_channels;
        } else if (i != this.f17014b + this.f17016d || this.f17018f <= 0) {
            str = null;
            if (i >= this.f17014b) {
                cursor = this.f17013a;
            } else {
                if (i < this.f17014b + this.f17016d || this.f17016d == 0) {
                    cursor = this.f17017e;
                    i -= this.f17014b;
                    i3 = this.f17016d;
                } else {
                    cursor = this.f17015c;
                    i3 = this.f17014b;
                }
                i -= i3;
            }
            m14578a(c6259h, cursor, i, str);
        } else {
            i2 = R.string.search_messages;
        }
        str = C4522p.m8236a(i2);
        if (i >= this.f17014b) {
            if (i < this.f17014b + this.f17016d) {
            }
            cursor = this.f17017e;
            i -= this.f17014b;
            i3 = this.f17016d;
            i -= i3;
        } else {
            cursor = this.f17013a;
        }
        m14578a(c6259h, cursor, i, str);
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f17020h);
        return i == 0 ? new C6259h(from.inflate(R.layout.list_item_activity_search, viewGroup, false)) : new C6948c(from.inflate(R.layout.list_item_conversation_message_activity_search, viewGroup, false));
    }
}
