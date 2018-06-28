package mobi.mmdt.ott.provider.p385g;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6024k extends C2955c<C6024k> {
    public final C6023j m13437a(String str) {
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) == null) {
            return null;
        }
        Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(m7372g(), str);
        acquireContentProviderClient.release();
        return b == null ? null : new C6023j(b);
    }

    public final C6024k m13438a(Integer... numArr) {
        m7367b("dialog_state", numArr);
        return this;
    }

    public final C6024k m13439a(Long... lArr) {
        m7365a("dialog_last_seen_sent", (Object[]) lArr);
        return this;
    }

    public final C6024k m13440a(String... strArr) {
        m7365a("dialog_party", (Object[]) strArr);
        return this;
    }

    public final C6024k m13441a(C2978e... c2978eArr) {
        m7365a("dialog_type", (Object[]) c2978eArr);
        return this;
    }

    public final C6023j m13442b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6023j(query);
    }

    public final C6024k m13443b(int... iArr) {
        m7367b("dialog_my_role", C2955c.m7358a(iArr));
        return this;
    }

    protected final Uri mo2223h() {
        return C2981h.f9316a;
    }
}
