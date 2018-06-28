package mobi.mmdt.ott.provider.p386h;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6027g extends C2955c<C6027g> {
    public final C6027g m13466a(String... strArr) {
        m7365a("files_file_uri", (Object[]) strArr);
        return this;
    }

    public final C6027g m13467a(C2986h... c2986hArr) {
        m7365a("files_audio_state", (Object[]) c2986hArr);
        return this;
    }

    public final C6027g m13468a(C2987i... c2987iArr) {
        m7365a("files_download_state", (Object[]) c2987iArr);
        return this;
    }

    public final C6026f m13469b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6026f(query);
    }

    public final C6027g m13470b(long... jArr) {
        m7365a("files._id", C2955c.m7359a(jArr));
        return this;
    }

    public final C6027g m13471b(String... strArr) {
        m7365a("files_server_file_id", (Object[]) strArr);
        return this;
    }

    protected final Uri mo2223h() {
        return C2985d.f9350a;
    }
}
