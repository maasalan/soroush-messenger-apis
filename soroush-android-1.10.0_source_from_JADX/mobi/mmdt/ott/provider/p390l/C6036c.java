package mobi.mmdt.ott.provider.p390l;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6036c extends C2954b {
    public C6036c(Cursor cursor) {
        super(cursor);
    }

    public final String m13530a() {
        String a = m7352a("members_group_user_id");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'user_id' in the database was null, which is not allowed according to the model definition");
    }
}
