package mobi.mmdt.ott.provider.p390l;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.C7170c;
import mobi.mmdt.ott.provider.OttProvider;

public final class C7319e extends C7170c {
    private String f21065g;

    public C7319e(Uri uri, String str, Uri... uriArr) {
        super(uri, uriArr);
        this.f21065g = str;
    }

    protected final Cursor mo3570c() {
        C6037d c6037d = new C6037d();
        Context context = this.f1304q;
        String str = this.f21065g;
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(c6037d.m7372g(), str);
        acquireContentProviderClient.release();
        return b == null ? null : new C6036c(b);
    }
}
