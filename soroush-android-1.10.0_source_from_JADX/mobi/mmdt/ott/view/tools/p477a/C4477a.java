package mobi.mmdt.ott.view.tools.p477a;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

public final class C4477a {
    public static String m8135a(Cursor cursor) {
        C2978e c2978e = C2978e.values()[cursor.getInt(cursor.getColumnIndex("dialog_type"))];
        String a = C4505a.m8203a(cursor, "members_avatar_thumbnail_url");
        String a2 = C4505a.m8203a(cursor, "members_avatar_url");
        String a3 = C4505a.m8203a(cursor, "dialog_avatar_thumbnail_url");
        return c2978e.equals(C2978e.SINGLE) ? a != null ? a : a2 : a3 != null ? a3 : C4505a.m8203a(cursor, "dialog_avatar_url");
    }
}
