package mobi.mmdt.ott.provider.p389k;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6035f extends C2955c<C6035f> {
    public final C6035f m13520a(String... strArr) {
        m7365a("members_user_id", (Object[]) strArr);
        return this;
    }

    public final void m13521a(Context context, String str) {
        ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (acquireContentProviderClient != null) {
            OttProvider ottProvider = (OttProvider) acquireContentProviderClient.getLocalContentProvider();
            if (ottProvider != null) {
                ottProvider.mo2215c(m7372g(), str);
            }
            acquireContentProviderClient.release();
        }
    }

    public final C6034d m13522b(Context context) {
        Cursor query = context.getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6034d(query);
    }

    public final C6035f m13523b(String... strArr) {
        m7367b("members_user_id", strArr);
        return this;
    }

    public final C6035f m13524c(String... strArr) {
        m7365a("members_extra", (Object[]) strArr);
        return this;
    }

    protected final Uri mo2223h() {
        return C3000b.f9413a;
    }

    public final C6035f m13526i() {
        m7365a("members_is_local_user", C2955c.m7357a(Boolean.valueOf(true)));
        return this;
    }

    public final C6035f m13527j() {
        m7365a("members_is_deactivated_user", C2955c.m7357a(Boolean.valueOf(false)));
        return this;
    }

    public final C6035f m13528k() {
        m7365a("members_is_synced_contact", C2955c.m7357a(Boolean.valueOf(true)));
        return this;
    }

    public final C6035f m13529l() {
        m7365a("members_is_soroush_member", C2955c.m7357a(Boolean.valueOf(true)));
        return this;
    }
}
