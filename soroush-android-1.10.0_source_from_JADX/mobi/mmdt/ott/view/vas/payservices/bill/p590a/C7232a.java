package mobi.mmdt.ott.view.vas.payservices.bill.p590a;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.vas.payservices.bill.p559c.C6992a;
import mobi.mmdt.ott.view.vas.payservices.bill.p591d.C7233a;

public final class C7232a extends C6827b {
    private Activity f20879a;

    public C7232a(Context context) {
        super(context);
        this.f20879a = (Activity) context;
    }

    public final C6073e mo3449a(ViewGroup viewGroup, int i) {
        return i != 201 ? null : new C6992a(this.f20879a, (C3126i) this.f20879a, this.f19501b, viewGroup);
    }

    protected final C6829g mo3450a(Cursor cursor, int i) {
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("BillId"));
        String string2 = cursor.getString(cursor.getColumnIndex("PaymentId"));
        String string3 = cursor.getString(cursor.getColumnIndex("Amount"));
        String string4 = cursor.getString(cursor.getColumnIndex("TransactionTime"));
        return new C7233a((int) j, string, string2, string3, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(string4), C2535a.m6888a().m6919b()), cursor.getInt(cursor.getColumnIndex("TransactionStatus")), i);
    }

    public final int getItemViewType(int i) {
        return 201;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3449a(viewGroup, i);
    }
}
