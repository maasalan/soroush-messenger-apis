package mobi.mmdt.ott.provider.p394p;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;

public final class C6048d extends C2954b {
    public C6048d(Cursor cursor) {
        super(cursor);
    }

    public final C3016f m13581a() {
        Integer b = m7353b("stickerspackage_download_state");
        if (b != null) {
            return C3016f.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'download_state' in the database was null, which is not allowed according to the model definition");
    }

    public final int m13582b() {
        Integer b = m7353b("stickerspackage_package_id");
        if (b != null) {
            return b.intValue();
        }
        throw new NullPointerException("The value of 'package_id' in the database was null, which is not allowed according to the model definition");
    }

    public final String m13583c() {
        String a = m7352a("stickerspackage_thumbnail_uri");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'thumbnail_uri' in the database was null, which is not allowed according to the model definition");
    }

    public final int getCount() {
        Integer b = m7353b("stickerspackage_count");
        if (b != null) {
            return b.intValue();
        }
        throw new NullPointerException("The value of 'count' in the database was null, which is not allowed according to the model definition");
    }
}
