package mobi.mmdt.ott.view.tools.p479c;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.tools.p481e.C4505a;

public final class C4494b {
    public static String m8188a(Cursor cursor) {
        if (!C2978e.values()[cursor.getInt(cursor.getColumnIndex("dialog_type"))].equals(C2978e.SINGLE)) {
            return C4505a.m8203a(cursor, "dialog_title");
        }
        String a = C4505a.m8203a(cursor, "members_local_name");
        return (a == null || a.isEmpty()) ? C4505a.m8203a(cursor, "members_nick_name") : a;
    }
}
