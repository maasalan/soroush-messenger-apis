package mobi.mmdt.ott.view.search;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.tools.p477a.C4477a;
import mobi.mmdt.ott.view.tools.p479c.C4493a;
import mobi.mmdt.ott.view.tools.p479c.C4494b;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

public final class C6948c extends C6259h {
    private final TextView f19836b;

    C6948c(View view) {
        super(view);
        this.f19836b = (TextView) view.findViewById(R.id.message_time);
    }

    protected final void mo3258a() {
        super.mo3258a();
        C2491i.m6802a(this.f19836b, UIThemeManager.getmInstance().getText_secondary_color());
    }

    public final void mo3259a(Context context, Cursor cursor, String str) {
        String a = C4494b.m8188a(cursor);
        CharSequence a2 = C4493a.m8186a((Activity) context, cursor);
        if (C2535a.m6888a().m6919b().equals("fa")) {
            a2 = C2491i.m6814b((String) a2);
        }
        String replaceAll = Normalizer.normalize(a2, Form.NFD).replaceAll("[\n]", " ");
        m14599a(context, C4360g.m8114a(cursor), C4477a.m8135a(cursor), a, replaceAll, C2978e.values()[cursor.getInt(cursor.getColumnIndex("dialog_type"))], C4505a.m8203a(cursor, "dialog_last_position"), C4505a.m8203a(cursor, "conversations_message_id"), str);
        str = "conversations_send_time";
        Long valueOf = cursor.getColumnIndex(str) == -1 ? null : Long.valueOf(cursor.getLong(cursor.getColumnIndex(str)));
        if (valueOf == null) {
            valueOf = Long.valueOf(0);
        }
        CharSequence d = C2491i.m6829d(context, valueOf.longValue(), C2535a.m6888a().m6919b());
        if (d != null) {
            this.f19836b.setText(d);
        }
    }

    public final /* bridge */ /* synthetic */ void mo3260b(Context context, Cursor cursor, String str) {
        super.mo3260b(context, cursor, str);
    }
}
