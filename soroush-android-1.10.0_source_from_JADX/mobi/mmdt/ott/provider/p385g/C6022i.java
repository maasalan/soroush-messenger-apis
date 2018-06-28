package mobi.mmdt.ott.provider.p385g;

import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6022i extends C2953a {
    public final int m13395a(Context context, C6024k c6024k) {
        return context.getContentResolver().update(C2981h.f9316a, m7350b(), c6024k.f9181a.toString(), c6024k.m7370e());
    }

    public final Uri mo2224a() {
        return C2981h.f9316a;
    }

    public final C6022i m13397a(int i) {
        this.a.put("dialog_unread_messages_count", Integer.valueOf(i));
        return this;
    }

    public final C6022i m13398a(long j) {
        this.a.put("dialog_creation_date", Long.valueOf(j));
        return this;
    }

    public final C6022i m13399a(Boolean bool) {
        this.a.put("dialog_is_mute", bool);
        return this;
    }

    public final C6022i m13400a(Integer num) {
        this.a.put("dialog_members_count", num);
        return this;
    }

    public final C6022i m13401a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("dialogParty must not be null");
        }
        this.a.put("dialog_party", str);
        return this;
    }

    public final C6022i m13402a(C2974a c2974a) {
        this.a.put("channel_type", c2974a == null ? null : Integer.valueOf(c2974a.ordinal()));
        return this;
    }

    public final C6022i m13403a(C2978e c2978e) {
        if (c2978e == null) {
            throw new IllegalArgumentException("dialogType must not be null");
        }
        this.a.put("dialog_type", Integer.valueOf(c2978e.ordinal()));
        return this;
    }

    public final C6022i m13404a(C3004f c3004f) {
        this.a.put("dialog_my_role", c3004f == null ? null : Integer.valueOf(c3004f.ordinal()));
        return this;
    }

    public final C6022i m13405a(boolean z) {
        this.a.put("dialog_is_reply_allowed", Boolean.valueOf(z));
        return this;
    }

    public final C6022i m13406b(int i) {
        this.a.put("dialog_state", i == 0 ? null : Integer.valueOf(i - 1));
        return this;
    }

    public final C6022i m13407b(long j) {
        this.a.put("dialog_updated_at", Long.valueOf(j));
        return this;
    }

    public final C6022i m13408b(Boolean bool) {
        this.a.put("dialog_is_pinned", bool);
        return this;
    }

    public final C6022i m13409b(String str) {
        this.a.put("dialog_title", str);
        return this;
    }

    public final C6022i m13410c(long j) {
        this.a.put("dialog_last_seen", Long.valueOf(j));
        return this;
    }

    public final C6022i m13411c(Boolean bool) {
        this.a.put("dialog_show_all_messages", bool);
        return this;
    }

    public final C6022i m13412c(String str) {
        this.a.put("dialog_description", str);
        return this;
    }

    public final C6022i m13413d(long j) {
        this.a.put("dialog_last_seen_sent", Long.valueOf(j));
        return this;
    }

    public final C6022i m13414d(String str) {
        this.a.put("dialog_link", str);
        return this;
    }

    public final C6022i m13415e(String str) {
        this.a.put("dialog_avatar_url", str);
        return this;
    }

    public final C6022i m13416f(String str) {
        this.a.put("dialog_avatar_thumbnail_url", str);
        return this;
    }

    public final C6022i m13417g(String str) {
        this.a.put("channel_owner", str);
        return this;
    }

    public final C6022i m13418h(String str) {
        this.a.put("dialog_last_message_id", str);
        return this;
    }

    public final C6022i m13419i(String str) {
        this.a.put("dialog_last_position", str);
        return this;
    }

    public final C6022i m13420j(String str) {
        this.a.put("dialog_extra", str);
        return this;
    }

    public final C6022i m13421k(String str) {
        this.a.put("dialog_draft_data", str);
        return this;
    }

    public final C6022i m13422l(String str) {
        this.a.put("dialog_keyboard", str);
        return this;
    }
}
