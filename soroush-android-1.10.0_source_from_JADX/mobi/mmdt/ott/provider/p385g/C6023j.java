package mobi.mmdt.ott.provider.p385g;

import android.database.Cursor;
import mobi.mmdt.ott.provider.p381c.C2954b;
import mobi.mmdt.ott.provider.p390l.C3004f;

public final class C6023j extends C2954b {
    public C6023j(Cursor cursor) {
        super(cursor);
    }

    public final String m13423a() {
        String a = m7352a("dialog_party");
        if (a != null) {
            return a;
        }
        throw new NullPointerException("The value of 'dialog_party' in the database was null, which is not allowed according to the model definition");
    }

    public final C3004f m13424b() {
        Integer b = m7353b("dialog_my_role");
        if (b != null) {
            return C3004f.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'dialog_my_role' in the database was null, which is not allowed according to the model definition");
    }

    public final long m13425c() {
        Long c = m7354c("dialog_creation_date");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of 'dialog_creation_date' in the database was null, which is not allowed according to the model definition");
    }

    public final int m13426d() {
        return m7353b("dialog_members_count").intValue();
    }

    public final boolean m13427e() {
        Boolean d = m7355d("dialog_is_reply_allowed");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'dialog_is_reply_allowed' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13428f() {
        Boolean d = m7355d("dialog_is_mute");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'dialog_is_mute' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13429g() {
        Boolean d = m7355d("dialog_is_pinned");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'dialog_is_pinned' in the database was null, which is not allowed according to the model definition");
    }

    public final boolean m13430h() {
        Boolean d = m7355d("dialog_show_all_messages");
        if (d != null) {
            return d.booleanValue();
        }
        throw new NullPointerException("The value of 'dialog_show_all_messages' in the database was null, which is not allowed according to the model definition");
    }

    public final int m13431i() {
        Integer b = m7353b("dialog_unread_messages_count");
        if (b != null) {
            return b.intValue();
        }
        throw new NullPointerException("The value of 'dialog_unread_messages_count' in the database was null, which is not allowed according to the model definition");
    }

    public final long m13432j() {
        Long c = m7354c("dialog_updated_at");
        if (c != null) {
            return c.longValue();
        }
        throw new NullPointerException("The value of 'dialog_updated_at' in the database was null, which is not allowed according to the model definition");
    }

    public final int m13433k() {
        Integer b = m7353b("dialog_state");
        return b == null ? 0 : C2977d.m7421a()[b.intValue()];
    }

    public final C2978e m13434l() {
        Integer b = m7353b("dialog_type");
        if (b != null) {
            return C2978e.values()[b.intValue()];
        }
        throw new NullPointerException("The value of 'dialog_type' in the database was null, which is not allowed according to the model definition");
    }

    public final C2974a m13435m() {
        Integer b = m7353b("channel_type");
        return b == null ? null : C2974a.values()[b.intValue()];
    }

    public final Long m13436n() {
        Long c = m7354c("dialog_last_seen");
        return c == null ? Long.valueOf(0) : c;
    }
}
