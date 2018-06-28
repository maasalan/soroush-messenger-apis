package mobi.mmdt.ott.view.tools.p481e;

import android.database.Cursor;

public final class C4505a {
    public static String m8203a(Cursor cursor, String str) {
        return cursor.getColumnIndex(str) == -1 ? null : cursor.getString(cursor.getColumnIndex(str));
    }
}
