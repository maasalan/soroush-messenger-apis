package mobi.mmdt.ott.provider.p391m;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6039d extends C2954b {
    public C6039d(Cursor cursor) {
        super(cursor);
    }

    public final String m13538a() {
        String a = m7352a("recentemoji_value");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'VALUE' in the database was null, which is not allowed according to the model definition");
    }
}
