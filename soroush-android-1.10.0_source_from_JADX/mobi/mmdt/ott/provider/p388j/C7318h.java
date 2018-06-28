package mobi.mmdt.ott.provider.p388j;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.C7170c;
import mobi.mmdt.ott.provider.OttProvider;

public final class C7318h extends C7170c {
    private String f21064g;

    public C7318h(Uri uri, String str, Uri... uriArr) {
        super(uri, uriArr);
        m13294a(100);
        this.f21064g = str;
    }

    protected final Cursor mo3570c() {
        C6032g c6032g = new C6032g();
        String str = this.f21064g;
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) == null) {
            return null;
        }
        Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(c6032g.m7372g(), str);
        acquireContentProviderClient.release();
        return b == null ? null : new C6031e(b);
    }
}
