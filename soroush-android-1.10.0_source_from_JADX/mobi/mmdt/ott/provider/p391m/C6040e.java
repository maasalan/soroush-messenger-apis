package mobi.mmdt.ott.provider.p391m;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6040e extends C2955c<C6040e> {
    public final void m13539a(Context context, String str) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2215c(m7372g(), str);
        acquireContentProviderClient.release();
    }

    protected final Uri mo2223h() {
        return C3007b.f9448a;
    }
}
