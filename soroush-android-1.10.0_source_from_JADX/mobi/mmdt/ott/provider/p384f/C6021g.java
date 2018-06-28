package mobi.mmdt.ott.provider.p384f;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.provider.OttProvider;
import mobi.mmdt.ott.provider.p381c.C2955c;

public final class C6021g extends C2955c<C6021g> {
    public final C6021g m13375a(long j) {
        Object valueOf = Long.valueOf(j);
        this.f9181a.append("conversations_send_time");
        this.f9181a.append("<?");
        this.f9182b.add(C2955c.m7356a(valueOf));
        return this;
    }

    public final C6021g m13376a(Integer... numArr) {
        m7365a("conversations_is_seen_send", (Object[]) numArr);
        return this;
    }

    public final C6021g m13377a(Long... lArr) {
        m7365a("conversations_file_id", (Object[]) lArr);
        return this;
    }

    public final C6021g m13378a(String... strArr) {
        m7365a("conversations_message_id", (Object[]) strArr);
        return this;
    }

    public final C6021g m13379a(C2970j... c2970jArr) {
        m7365a("conversations_direction_type", (Object[]) c2970jArr);
        return this;
    }

    public final C6021g m13380a(C2971k... c2971kArr) {
        m7365a("conversations_event_state", (Object[]) c2971kArr);
        return this;
    }

    public final C6021g m13381a(C2972l... c2972lArr) {
        m7367b("conversations_event_type", c2972lArr);
        return this;
    }

    public final C6021g m13382a(C2973m... c2973mArr) {
        m7365a("conversations_group_type", (Object[]) c2973mArr);
        return this;
    }

    public final void m13383a(String str) {
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2215c(m7372g(), str);
        acquireContentProviderClient.release();
    }

    public final C6020e m13384b(String str) {
        ContentProviderClient acquireContentProviderClient = MyApplication.m12952b().getContentResolver().acquireContentProviderClient("mobi.mmdt.ott.provider");
        if (((OttProvider) acquireContentProviderClient.getLocalContentProvider()) == null) {
            return null;
        }
        Cursor b = ((OttProvider) acquireContentProviderClient.getLocalContentProvider()).mo2212b(m7372g(), str);
        acquireContentProviderClient.release();
        return b == null ? null : new C6020e(b);
    }

    public final C6021g m13385b(long j) {
        m7364a("conversations_send_time", (Object) Long.valueOf(j));
        return this;
    }

    public final C6021g m13386b(long... jArr) {
        m7365a("conversations._id", C2955c.m7359a(jArr));
        return this;
    }

    public final C6021g m13387b(String... strArr) {
        m7367b("conversations_message_id", strArr);
        return this;
    }

    public final C6021g m13388b(C2971k... c2971kArr) {
        m7367b("conversations_event_state", c2971kArr);
        return this;
    }

    public final C6021g m13389c(long j) {
        m7364a("conversations_receive_time", (Object) Long.valueOf(j));
        return this;
    }

    public final C6021g m13390c(String... strArr) {
        m7365a("conversations_party", (Object[]) strArr);
        return this;
    }

    public final C6021g m13391d(String... strArr) {
        m7365a("conversations_forward_message_id", (Object[]) strArr);
        return this;
    }

    protected final Uri mo2223h() {
        return C2967c.f9203a;
    }

    public final C6020e m13393i() {
        Cursor query = MyApplication.m12952b().getContentResolver().query(m7372g(), null, this.f9181a.toString(), m7370e(), m7371f());
        return query == null ? null : new C6020e(query);
    }

    public final C6021g m13394j() {
        m7363a("conversations_send_time", false);
        return this;
    }
}
