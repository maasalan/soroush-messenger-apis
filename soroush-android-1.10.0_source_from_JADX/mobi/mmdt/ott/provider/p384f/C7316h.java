package mobi.mmdt.ott.provider.p384f;

import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.C7170c;

public final class C7316h extends C7170c {
    private String f21062g;

    public C7316h(Uri uri, String str, Uri... uriArr) {
        super(uri, uriArr);
        this.f21062g = str;
    }

    protected final Cursor mo3570c() {
        return new C6021g().m13384b(this.f21062g);
    }
}
