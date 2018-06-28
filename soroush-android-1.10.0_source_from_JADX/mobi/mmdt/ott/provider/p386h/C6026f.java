package mobi.mmdt.ott.provider.p386h;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6026f extends C2954b {
    public C6026f(Cursor cursor) {
        super(cursor);
    }

    public final long m13464a() {
        Long c = m7354c("_id");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of '_id' in the database was null, which is not allowed according to the model definition");
    }

    public final long m13465b() {
        Long c = m7354c("files_size");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of 'size' in the database was null, which is not allowed according to the model definition");
    }
}
