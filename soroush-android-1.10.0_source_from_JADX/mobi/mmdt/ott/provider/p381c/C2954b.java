package mobi.mmdt.ott.provider.p381c;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.HashMap;

public abstract class C2954b extends CursorWrapper {
    private final HashMap<String, Integer> f9180a;

    public C2954b(Cursor cursor) {
        super(cursor);
        this.f9180a = new HashMap((cursor.getColumnCount() * 4) / 3, 0.75f);
    }

    private int m7351e(String str) {
        Integer num = (Integer) this.f9180a.get(str);
        if (num == null) {
            num = Integer.valueOf(getColumnIndexOrThrow(str));
            this.f9180a.put(str, num);
        }
        return num.intValue();
    }

    public final String m7352a(String str) {
        int e = m7351e(str);
        return isNull(e) ? null : getString(e);
    }

    public final Integer m7353b(String str) {
        int e = m7351e(str);
        return isNull(e) ? null : Integer.valueOf(getInt(e));
    }

    public final Long m7354c(String str) {
        int e = m7351e(str);
        return isNull(e) ? null : Long.valueOf(getLong(e));
    }

    public final Boolean m7355d(String str) {
        int e = m7351e(str);
        if (isNull(e)) {
            return null;
        }
        return Boolean.valueOf(getInt(e) != 0);
    }
}
