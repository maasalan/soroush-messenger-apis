package mobi.mmdt.ott.provider.p393o;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6045d extends C2954b {
    public C6045d(Cursor cursor) {
        super(cursor);
    }

    public final int m13561a() {
        Integer b = m7353b("stickers_download_state");
        if (b != null) {
            return C3013f.m7524a()[b.intValue()];
        }
        throw new NullPointerException("The value of 'download_state' in the database was null, which is not allowed according to the model definition");
    }
}
