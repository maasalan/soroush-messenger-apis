package mobi.mmdt.ott.provider.p385g;

import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.C7170c;

public final class C7317l extends C7170c {
    private String f21063g;

    public C7317l(Uri uri, String str, Uri... uriArr) {
        super(uri, uriArr);
        m13294a(100);
        this.f21063g = str;
    }

    protected final Cursor mo3570c() {
        return new C6024k().m13437a(this.f21063g);
    }
}
