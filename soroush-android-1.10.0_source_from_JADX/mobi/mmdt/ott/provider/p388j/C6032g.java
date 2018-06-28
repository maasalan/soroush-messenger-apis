package mobi.mmdt.ott.provider.p388j;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6032g extends C2955c<C6032g> {
    public final C6031e m13486b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6031e(query);
    }

    public final C6032g m13487b(int... iArr) {
        m7365a("row_parent_landing_page_id", C2955c.m7358a(iArr));
        return this;
    }

    public final C6032g m13488b(long... jArr) {
        m7365a("landing_page_rows._id", C2955c.m7359a(jArr));
        return this;
    }

    protected final Uri mo2223h() {
        return C2997c.f9405a;
    }
}
