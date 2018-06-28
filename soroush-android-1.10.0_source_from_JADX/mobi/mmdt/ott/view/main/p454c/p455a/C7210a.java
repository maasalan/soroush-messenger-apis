package mobi.mmdt.ott.view.main.p454c.p455a;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import java.util.HashMap;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6828c;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.forward.C4054e;
import mobi.mmdt.ott.view.main.p454c.p455a.p456a.C6921a;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C4171b;
import mobi.mmdt.ott.view.main.p459d.p460a.C4185a;

public final class C7210a extends C6828c {
    private final Context f20820a;
    private final int f20821b;
    private boolean f20822l = false;
    private HashMap<String, Integer> f20823m;
    private boolean f20824n = false;
    private String f20825o;
    private final C3126i f20826p;
    private final C4185a f20827q;
    private C4054e f20828r;

    public C7210a(Context context, int i, C4185a c4185a, C3126i c3126i) {
        super(context);
        this.f20820a = context;
        this.f20821b = i;
        this.f20826p = c3126i;
        this.f20827q = c4185a;
    }

    public C7210a(Context context, C3126i c3126i, C4054e c4054e, HashMap<String, Integer> hashMap, boolean z) {
        super(context);
        this.f20820a = context;
        this.f20821b = 8;
        this.f20826p = c3126i;
        this.f20827q = null;
        this.f20828r = c4054e;
        this.f20823m = hashMap;
        this.f20822l = z;
        if (this.f20828r != null && this.f20823m != null) {
            this.f20824n = true;
        }
    }

    public final C6071a mo3463a(ViewGroup viewGroup, int i) {
        return new C6921a(i, this.f20820a, viewGroup, this.f20826p, this.f20827q, this.f20828r, this.f20822l);
    }

    protected final C6829g mo3464a(Cursor cursor, int i) {
        C6829g a = C4171b.m8035a(this.f, cursor, this.f20825o, this.f20824n, this.f20823m);
        a.m8576a();
        return a;
    }

    public final void m19095a(String str) {
        this.f20825o = str;
        notifyDataSetChanged();
    }

    public final int getItemViewType(int i) {
        Cursor cursor = (Cursor) m13685c(i);
        String string = cursor.getString(cursor.getColumnIndex("dialog_type"));
        if (string != null) {
            if (Integer.parseInt(string) < C2978e.values().length) {
                switch (C2978e.values()[Integer.parseInt(string)]) {
                    case SINGLE:
                        return 1;
                    case GROUP:
                        return 2;
                    case CHANNEL:
                        return 3;
                    case BOT:
                        return 5;
                    default:
                        return super.getItemViewType(i);
                }
            }
        }
        return 4;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3463a(viewGroup, i);
    }
}
