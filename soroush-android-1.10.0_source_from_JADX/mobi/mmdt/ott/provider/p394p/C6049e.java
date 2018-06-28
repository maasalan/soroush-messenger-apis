package mobi.mmdt.ott.provider.p394p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6049e extends C2955c<C6049e> {
    public final C6049e m13584a(C3016f... c3016fArr) {
        m7365a("stickerspackage_download_state", (Object[]) c3016fArr);
        return this;
    }

    public final C6048d m13585b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6048d(query);
    }

    public final C6049e m13586b(int... iArr) {
        m7365a("stickerspackage_package_id", C2955c.m7358a(iArr));
        return this;
    }

    public final C6049e m13587b(C3016f... c3016fArr) {
        m7367b("stickerspackage_download_state", c3016fArr);
        return this;
    }

    protected final Uri mo2223h() {
        return C3015b.f9463a;
    }

    public final C6049e m13589i() {
        m7365a("stickerspackage_is_hidden", C2955c.m7357a(Boolean.valueOf(false)));
        return this;
    }
}
