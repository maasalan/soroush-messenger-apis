package mobi.mmdt.ott.view.vas.payservices.charge.p592a;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.base.OperatorType;
import mobi.mmdt.ott.logic.p261a.p329x.C2763c;
import mobi.mmdt.ott.logic.vas.p372a.C2912b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.vas.payservices.charge.p486b.C6994b;
import mobi.mmdt.ott.view.vas.payservices.charge.p593c.C7235b;

public final class C7234a extends C6827b {
    private Activity f20886a;

    public C7234a(Context context) {
        super(context);
        this.f20886a = (Activity) context;
    }

    public final C6073e mo3449a(ViewGroup viewGroup, int i) {
        return i != 101 ? null : new C6994b(this.f20886a, (C3126i) this.f20886a, this.f19501b, viewGroup);
    }

    protected final C6829g mo3450a(Cursor cursor, int i) {
        Cursor cursor2 = cursor;
        long j = cursor2.getLong(cursor2.getColumnIndex("_id"));
        int i2 = cursor2.getInt(cursor2.getColumnIndex("Operator"));
        int i3 = cursor2.getInt(cursor2.getColumnIndex("ChargeType"));
        String string = cursor2.getString(cursor2.getColumnIndex("Amount"));
        String string2 = cursor2.getString(cursor2.getColumnIndex("TransactionTime"));
        int i4 = cursor2.getInt(cursor2.getColumnIndex("TransactionStatus"));
        int i5 = cursor2.getInt(cursor2.getColumnIndex("IsFavorite"));
        String string3 = cursor2.getString(cursor2.getColumnIndex("RefId"));
        String string4 = cursor2.getString(cursor2.getColumnIndex("CartNumber"));
        OperatorType c = C2912b.m7289c(i2);
        return new C7235b((int) j, C2912b.m7287b(c), C2912b.m7284a(c), i3, string, i5, C2491i.m6829d(MyApplication.m12952b(), Long.parseLong(string2), C2535a.m6888a().m6919b()), i, i4, string4, string3, C2763c.ChargePayment.ordinal());
    }

    public final int getItemViewType(int i) {
        return 101;
    }

    public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo3449a(viewGroup, i);
    }
}
