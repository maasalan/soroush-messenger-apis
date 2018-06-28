package mobi.mmdt.ott.view.conversation.activities.p419a.p420a;

import android.app.Activity;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import java.util.HashMap;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.components.p401c.C6071a;
import mobi.mmdt.ott.view.components.p401c.C6828c;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p421a.C6872a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C3314b;

public final class C7190a extends C6828c {
    public String f20696a;
    private int f20697b;
    private boolean f20698l = false;
    private HashMap<String, Integer> f20699m;
    private boolean f20700n = false;
    private Activity f20701o;

    public C7190a(Activity activity, HashMap<String, Integer> hashMap) {
        super(activity);
        this.f20701o = activity;
        this.f20699m = hashMap;
    }

    public final C6071a mo3463a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new C6872a(this.f20701o, i, viewGroup, (C3315b) this.f20701o);
            default:
                return null;
        }
    }

    protected final C6829g mo3464a(Cursor cursor, int i) {
        C6829g a = C3314b.m7795a(this.f, cursor, this.f20697b, this.f20696a, i, this.f20699m);
        a.m8576a();
        return a;
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
